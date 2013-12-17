Terminal.writeString("Entrez un entier (terminer le programme avec 0): ");
n = Terminal.readInt(); // Saisie d’initialisation pour n
total = 0;

while ( n != 0 )
{
  total = total + n;
  Terminal.writeString("Entrez un entier (terminer le programme avec 0): ");
  n = Terminal.readInt(); // Nouvelle saisie de n }
}
