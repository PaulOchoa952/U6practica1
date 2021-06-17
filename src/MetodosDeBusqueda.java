/*  -----------EQUIPO AGP------------
    INTEGRANTES:
    JOSÉ GIOVANNI CARRILLO RUBIO
    OCHOA MEZA PAÚL ALEJANDRO
    MEDINA SOTO CARLOS ALAN
*/
public class MetodosDeBusqueda {
    int[] vector;

    public MetodosDeBusqueda(int tam) {
        vector = new int[tam];
        llenarVector();
        Ordenar(vector);
    }

    private void llenarVector() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*1001);
            //Se llenan las posiciones del vector en orden de menor a mayor    
        }
    }
    public void Ordenar(int[] arreglo) {
        int aux;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                     arreglo[j] = aux;
                }
            }
        }
    }
    

    public int BusquedaSec(int dato) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    public int BusquedaBin(int dato) {
        int inicio = 0;
        int fin = vector.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (vector[pos] == dato) {
                return pos;
            } else if (vector[pos] < dato) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
    }

}
