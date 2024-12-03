
public class jkkk {
    public static void main (String [] args){
        def programa_con_for():
    print("Inserta 10 números. Se evaluará si son pares o impares.")
    
    for i in range(1, 11):  # Itera exactamente 10 veces
        try:
            numero = int(input(f"Ingrese el número {i}: "))
            
            if numero % 2 == 0:  # Verifica si el número es par
                cociente = numero // 2
                printf("El número {numero} es par. Imprimiendo {cociente} asteriscos:")
                print("*" * cociente)  # Imprime los asteriscos según el cociente
            else:
                printf("El número {numero} es impar.")
        except ValueError:
            print("Por favor, ingrese un número válido.");
    
    print("Programa finalizado.")

# Ejecutar el programa
programa_con_for()
    }
}