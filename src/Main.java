public class Main {
    public static void main(String[] args) {

        int numeroIf=1;
        int numeroWhile=0;
        String estacion="VERANO";

        //Estructura If

        if(numeroIf==0){
            System.out.println("numerIf es 0");
        }else if(numeroIf>0){
            System.out.println("El mumero es positivo");
        }else{
            System.out.println("El mumero es negativo");
        }

        //Estructura While

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("numeroWhile es "+numeroWhile);
        }


        //Estructura do While
        do{
            numeroWhile++;
            System.out.println("numeroWhile es "+numeroWhile);
        }while(numeroWhile<3);


        //Estructura For
        for(int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println("numeroFor es "+numeroFor);
        }

        //Estructura Switch

        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default :
                System.out.println("Es primavera");
        }


    }


}