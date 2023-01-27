import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class RepeatCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList();
        System.out.println("Enter number of elements in list: ");
        Integer num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Enter the element: ");
            numberList.add(sc.nextInt());
        }
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for(Integer number: numberList){
            if(numberCount.keySet().contains(number)){
                numberCount.put(number, numberCount.get(number)+1);
            }else{
                numberCount.put(number, 1);
            }
        }
        System.out.println("Count of elements are: ");
        System.out.println(numberCount);
    }
}
    