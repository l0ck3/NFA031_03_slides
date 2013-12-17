somme = 0;
for(int i=1; i <= n; i++) { //dans ce bloc, i existe
  somme = somme + i;
} // fin de vie de i

// ici, i n’existe pas
Terminal.wrirteInt(i); // Cette instruction provoquerait une erreur.
