#Función para mostrar estado de la lista
def mostrarLista(lista, lon):
	listaordenada=""
	for i in range(0,lon):
		listaordenada+=str(lista[i])+" "
	print(listaordenada)   
	
arreglo = [5,2,4,1,3];
#Recorrer el arreglo
for i in range(1,len(arreglo)):
	clave = arreglo[i]
	j = i-1
	#Comparar el valor seleccionado con todos los valores anteriores
	while (j>=0 and arreglo[j] > clave):
		#Insertar el valor donde corresponda
		arreglo[j+1] = arreglo[j]
		j = j-1
	arreglo[j+1] = clave
	mostrarLista(arreglo, len(arreglo))
mostrarLista(arreglo, len(arreglo))    
