Algoritmo Ejercicio7
	total <- 15
	pares <- 0
	impares <- 0
	ceros <- 0
	Para i<-1 Hasta total Hacer
		ale <- Aleatorio(0,36)
		forma <- ale MOD(2)
		Si ale = 0 Entonces
			ceros = ceros+1
		SiNo
			Si forma = 0 Entonces
				pares <- pares+1
			SiNo
				impares <- impares+1
			FinSi
		FinSi
	FinPara
	ceros = (ceros/total)*100
	impares = (impares/total)*100
	pares = (pares/total)*100
	Escribir "porcentaje de pares=",pares,"% impares=",impares,"% ceros=",ceros,"%" 
FinAlgoritmo
