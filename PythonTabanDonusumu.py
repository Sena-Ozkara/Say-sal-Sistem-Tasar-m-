# Python program to convert a 
# number from any base to decimal 

#Bir karakterin değerini döndürmek için. 
# Örneğin, 2 döndürülür
# '2' için. 'A' için 10 döndürülür,, 
#11 'B' için


def val(c): 
	if c >= '0' and c <= '9': 
		return ord(c) - ord('0') 
	else: 
		return ord(c) - ord('A') + 10; 

# Bir sayıyı dönüştürme işlevi
# verilen 'b' tabanından ondalık tabana
def toDeci(str,base): 
	llen = len(str) 
	power = 1 #Tabanın Üssünü  başlat 
	num = 0	 #sonucu başlat


	# Ondalık eşdeğeri str[len-1]*1 + 
	# str[len-2]*base + str[len-3]*(base^2) + ... 
	for i in range(llen - 1, -1, -1): 
		
		# Girilen numarada bir rakam olmalıdır
		# sayının tabanından küçük olmalıdır
		if val(str[i]) >= base: 
			print('Invalid Number') 
			return -1
		num += val(str[i]) * power 
		power = power * base 
	return num 
	
# Driver code 
strr = "123"
base = 8
print('Decimal equivalent of', strr, 
			'in base', base, 'is', 
				toDeci(strr, base)) 

