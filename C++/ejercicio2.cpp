#include <iostream>

using namespace std;

int main () {
	
	cout << "Hola!, ¿Como te llamas? ";
	
	char nombre[20];
	cin >> nombre;
	cout << "Estoy encantado de conocerte " << nombre;

	cout << "Cuantos años tienes?";
	float edad;
	cin >> edad;
	cout << "Dentro de 10 años tendras " << edad + 10;
	
	return 0;
	
}