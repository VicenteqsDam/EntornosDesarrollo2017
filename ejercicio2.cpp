int main(int argc, char const *argv[])
{
	string nombre;
	int edad;
	cout<<"Bienvenido usuario cual es vuestro nombre?"<<endln;
	cin>>nombre>>endln;
	cout<<"Encantado de conocerte "<<nombre<<" cual es vuestra edad?"<<endln;
	cin>>edad>>endln;
	cout<<"Tendras "<<(edad + 10)<<" dentro de 10 años."<<endln;
	return 0;
}