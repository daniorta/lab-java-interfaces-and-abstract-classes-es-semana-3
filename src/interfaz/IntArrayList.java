package interfaz;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class IntArrayList implements IntList{

    //ARRAY
    int[] arrayList = new int[10];
    int count = 0;

    @Override
    public void add(int number){
        //vemos si tenemos que expandir el array o no
        if (count == arrayList.length){
            //creamos new array
            int[] newArrayList = new int[arrayList.length + arrayList.length / 2];

            //copiamos los elementos al nuevo array
            for (int i = 0; i < arrayList.length; i++){
              newArrayList[i] = arrayList[i];
          }
          arrayList = newArrayList;
        }
        //Agrega,los numero en la primera posicion vacia
        arrayList[count] = number;
        count++;

    }

    @Override
    public void get(int id) {

    }


}
