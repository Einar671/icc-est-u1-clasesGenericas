import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*Caja<Integer> integerCaja = new Caja<>();
        Caja<String> stringCaja = new Caja<>();
        Caja<Double> doubCaja = new Caja<>();

        integerCaja.setT(15);
        stringCaja.setT("MI LIBERTAD NO LA QUIERO, TAMPOCO LA VIDA DE SOLTERO");
        doubCaja.setT(74.5);


        
        System.out.println("Caja entera "+integerCaja.getT());
        System.out.println("Caja String "+ stringCaja.getT());
        System.out.println("Caja Double "+ doubCaja.getT());


        Par<Integer, String> ISPar = new Par<>();
        Par<String, Integer> SIPar = new Par<>();
        Par<Integer,String > Par3 = new Par<>(78,"Brr Brr patapin");
        Par<Integer, String> Par4 = new Par<>();
        Par4.setValues(78, "Bombardilo Cocodrilo");

        ISPar.setClave(75);
        ISPar.setValor("Chimpazini Bananini");

        SIPar.setClave("🗣️ 🔥🔥🔥");
        SIPar.setValor(95);

        System.out.println("Clave: "+ ISPar.getClave() + " Valor: "+ ISPar.getValor());
        System.out.println("Clave: "+ SIPar.getClave() + " Valor: "+ SIPar.getValor());
        System.out.println(" Clave: " + Par3.getClave()+ " Valor: "+ Par3.getValor()) ;
        System.out.println("Clave: "+ Par4.getClave()+" Valor: "+ Par4.getValor());*/

        Persona[] personas = new Persona[10];

        personas[0] = new Persona("Juan",30);
        personas[1] = new Persona("Ana",20);
        personas[2] = new Persona("Pedro",40);
        personas[3] = new Persona("Maria",15);
        personas[4] = new Persona("Lucia",25);
        personas[5] = new Persona("Carlos",35);
        personas[6] = new Persona("Sofia",10);
        personas[7] = new Persona("Luis",45);
        personas[8] = new Persona("Elena",5);
        personas[9] = new Persona("ElDurisimo",50);

        int personasMayores = (int) Arrays.stream(personas)
        .filter(persona -> persona.getEdad()>=18).count();

        int personasMenores = personas.length - personasMayores;

        Par<Integer,String>[] mayores = new Par[personasMayores];
        Par<String, Integer>[] menores = new Par[personasMenores];

        int iMayores=0;
        int iMenores=0;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[iMayores++] = new Par<>(personas[i].getEdad(), personas[i].getName());
            } else {
                menores[iMenores++] = new Par<>(personas[i].getName(), personas[i].getEdad());
            }
        }
        
        for(int i=0; i<iMayores;i++)
        System.out.println("Mayor: "+mayores[i]);

        for(int i=0;i<iMenores;i++)
        System.out.println("Menor: "+menores[i]);
    }
}
