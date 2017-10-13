#include <iostream>

using namespace std;

int main() {
  string nombre;
  int edad;
  
  cout << "Hola. Me dices tu nombre? ";
  cin >> nombre;
  cout << "Hola ";
  cout << nombre;
  cout << ", encantado de conocerte. ";
  cout << "Me dices tu edad? ";
  cin >> edad;
  cout << nombre;
  cout << ", dentro de 10 anyos tendras ";
  edad = edad + 10;
  cout << edad;
  cout << " anyos.";
  
  return 0;
}