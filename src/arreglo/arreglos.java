package arreglo;

public class arreglos {
    public static void main(String[] args) {
        String[] personaje = {":D", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳", "🔳"};


        for(int i = 0; i < personaje.length - 1; i++){

            String mostrarCamino = "";
            for (int j = 0; j < personaje.length; j++){
                mostrarCamino = mostrarCamino + personaje[j];
            }
            System.out.println(mostrarCamino);

            ///

            personaje[i] = "🔳";

            if (i == 3 || i == 9){
                personaje[i + 3] = "😶";
                i+=2;
            } else{
                personaje[i + 1] = "😶";
            }

        }

    }

}
