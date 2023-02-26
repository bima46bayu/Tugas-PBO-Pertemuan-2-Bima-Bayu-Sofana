import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){

        ArrayList<String> rangga = new ArrayList<String>(Arrays.asList("buddy", "ruby", "coco"));
        ArrayList<String> meli = new ArrayList<String>(Arrays.asList("sam", "kyki", "shadow"));

        ArrayList<String> feri= new ArrayList<>();
        ArrayList<Integer> indeksr = new ArrayList<>();
        ArrayList<Integer> indeksm = new ArrayList<>();

        for (int i = 0; i < rangga.size() ; i++){

            if(rangga.get(i).contains("y")){
                feri.add(rangga.get(i));
                indeksr.add(i);
            }
        }
        for (int j = 0; j < meli.size() ; j++) {

            if (meli.get(j).contains("y")) {
                feri.add(meli.get(j));
                indeksm.add(j);
            }
        }

        System.out.println("Nama anjing dan Kucing yang diadopsi pak feri : " + feri);
    }

}
