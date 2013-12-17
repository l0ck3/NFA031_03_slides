public static void main (String[] args) {
  /*debut bloc 1*/
  int a = 2;
  Terminal.writeStringln("valeur de a: "+ a );
  if (a == 0) {
    /* debut bloc 2 */
    int b = 3 + a;
    Terminal.writeStringln("valeur de b: "+ b );
    /* fin bloc 2*/
  } else {
    /* debut bloc 3*/
    int c = 3 + a;
    Terminal.writeStringln("valeur de c: "+ c);
    /* fin bloc 3*/
  }
  Terminal.writeStringln("valeur de a: "+ a );
  /* fin bloc 1*/
}
