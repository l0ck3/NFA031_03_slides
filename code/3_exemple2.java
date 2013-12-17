Terminal.writeString("Entrez un entier (terminer le programme avec 0): ");
total = 0;

do
{
  total = total + n;
  Terminal.writeString("Entrez un entier (terminer le programme avec 0): ");
  n = Terminal.readInt(); // Nouvelle saisie de n }
} while ( n != 0 )
