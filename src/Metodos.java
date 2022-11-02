public class Metodos {

    //Tener una responsabilidad propia
    //modificador

    //tipo de dato
    //nombre-->pascalCase iniciar
    //parametros

    public Void sumarDeDosNumeros() {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1 + numero2);
    }

   //que solo se utiliza en el proyecto que se encuentra
   //donde se importa
    protected void sumaDeDosNumeros(int numero1, int numero2) { //numero1:10  numero2:12
        System.out.println(numero1 + numero2);   //numero1:10  numero2:12
    }

  //privados solo se pueden ver en la clase contenedora
    private static void restaDeDosNumeros(int numero1, int numero2) { System.out.println(numero1 - numero2);}



    public static void restaDeDosNumerosStatico (int numero1, int numero2) { System.out.println(numero1 - numero2);}




    public static void main(String[] arg) {
    }

 }
