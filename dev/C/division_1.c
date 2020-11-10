/* Leemos 2 números enteros por pantalla y realizamos la división
 */


#include <stdio.h>
int main()
{

   
    int a, b;
    printf("Introduce el valor del primer numero: ");
    scanf("%i", &a);
    printf("Introduce el valor del segundo numero: ");
    scanf("%i", &b);

    printf("\n La division es: %i", (a/ b));

	return 0;
}


/*division(int a, int b)
{
    return(a / b);
}*/