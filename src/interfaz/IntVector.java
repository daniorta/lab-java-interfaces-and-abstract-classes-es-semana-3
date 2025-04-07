package interfaz;

public class IntVector implements IntList{

   int[] intVector = new int[20];
    int count = 0;

    @Override
    public void add(int number){
        if(count == intVector.length){
            int[] newIntVector = new int[intVector.length * 2];
            for(int i = 0; i < intVector.length; i++){
                newIntVector[i] = intVector[i];
            }
            intVector = newIntVector;
        }
        intVector[count] = number;
        count++;
    }


    @Override
    public void get(int id){

    }
}
