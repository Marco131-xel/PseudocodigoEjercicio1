ALgoritmo Ejercicio1
 Definir N
 // Donde N es un numero entero 
 Escribir"Ingrese un numero"
  Leer N
 Para i <- 1 Hasta 1 Con Paso 1
  Hacer 
   R<-azar(100)+1
   Si R=mod(2) Entonces
   // Donde P son los numeros pares  y I son los numeros impares
   CP <- CP+1
   Sino
   CI <- CI+1
 Fin Para
 Escribir"Estos son los numeros pares CP"
 Escribir"Estos son los numeros impares CI"
Finalgoritmo