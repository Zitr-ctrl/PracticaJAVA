public class Main{
    public static void main(String[] args){
        byte edad = 23;
        int numeroGrande = 1000;
        float numero = 15.5f;
        boolean isActivate = true;
        char nombre = 'J';
        String nombre2 = "Josue Ortiz";
        int length = nombre2.length();

        System.out.println("Hola Mundo");
        System.out.println(edad);
        System.out.println(numeroGrande);
        System.out.println(numero);
        System.out.println(isActivate);
        System.out.println(nombre);
        System.out.println(nombre2);
        System.out.println(length);

        String text = "Hola Mundo";
        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("Uno!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println((texto.contains("und")));
        System.out.println(texto.indexOf("Mundo"));

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "    Chanchito fELIZ    ";
        System.out.println(malo.trim());

    }
}