#include <iostream>

using namespace std;

int main() {
	string nombre; //string en minisculas
	int edad;
	
	cout << "Hola amigo mio, como te llamas?" << endl;
	
	cin >> nombre;
	
	cout << "\n" << "Encantado de conocerte " << nombre << endl;
	
	cout << "\n" <<"Cuantos anyos tienes " << nombre << endl;
	
	cin >> edad;
	
	cout << "\n" << nombre <<", Dentro de 10 anyos tendras " << edad+10 << " anyos" << endl;
}
	
	