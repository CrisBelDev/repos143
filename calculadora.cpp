#include <iostream>
using namespace std;

float validar_numero(string mensaje) {
    int numero;
    do {
        cout << mensaje;
        cin >> numero;
        if (numero < 0) {
            cout << "Error: el numero debe ser positivo." << endl;
        }
    } while (numero < 0);
    return numero;
}

void sumar() {
    int numero1 = validar_numero("Ingrese el primer numero: ");
    int numero2 = validar_numero("Ingrese el segundo numero: ");
    int resultado = numero1 + numero2;
    cout << "La suma de " << numero1 << " + " << numero2 << " es igual a " << resultado << "." << endl;
}

void restar(int numero1, int numero2) {
    
    int resultado = numero1 - numero2;
    cout << "La resta de " << numero1 << " - " << numero2 << " es igual a " << resultado << "." << endl;
}

string multiplicar() {
    int numero1 = validar_numero("Ingrese el primer numero: ");
    int numero2 = validar_numero("Ingrese el segundo numero: ");
    int resultado = numero1 * numero2;
    string res = "";
    res = "La multiplicacion de " + to_string(numero1) + " x " + to_string(numero2) + " es igual a " + to_string(resultado) + "\n";
    return res;
}

string dividir(int numero1, int numero2) {

    float resultado = numero1*1.0 / numero2;
    
    string res =  "La division de " + to_string(numero1) + " / " + to_string(numero2) + " es igual a " + to_string(resultado) + "\n" ;
    return res;
}

void menu() {
    cout << "MENU" << endl;
    cout << "1. Suma" << endl;
    cout << "2. Resta" << endl;
    cout << "3. Multiplicacion" << endl;
    cout << "4. Division" << endl;
    cout << "5. Salir" << endl;
}

int main() {
    char opcion;
    do {
        menu();
        cout << "Ingrese la opcion deseada: ";
        cin >> opcion;
        int numero1 = 0, numero2 =0;
        switch (opcion) {
            case '1':
                sumar();
                break;
            case '2':
                numero1 = validar_numero("Ingrese el primer numero: ");
                numero2 = validar_numero("Ingrese el segundo numero: ");
                restar(numero1, numero2);
                break;
            case '3':
                cout << multiplicar();
                break;
            case '4':
                numero1 = validar_numero("Ingrese el primer numero: ");
                numero2 = validar_numero("Ingrese el segundo numero: ");
                cout << dividir(numero1 , numero2);
                break;
            case '5':
                cout << "Gracias por utilizar el programa." << endl;
                break;
            default:
                cout << "Opcion invalida. Por favor, ingrese una opcion valida." << endl;
                break;
        }
    } while (opcion != '5');
    return 0;
}
