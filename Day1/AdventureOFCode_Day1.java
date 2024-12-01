package Day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdventureOFCode_Day1 {
    public static void main(String[] args) {
    
    String[] lines = data.data.strip().split("\\n");

        // List to store the left-side numbers
        List<Integer> leftSideNumbers = new ArrayList<Integer>();
        List<Integer> rightSideNumbers = new ArrayList<Integer>();
        // Extract the left-side numbers
        for (String line : lines) {
          String[] parts = line.trim().split("\\s+");
          if (parts.length > 0) {
            leftSideNumbers.add(Integer.parseInt(parts[0]));
            rightSideNumbers.add(Integer.parseInt(parts[1]));
          }
        }
        int arrayLength = leftSideNumbers.size();
        
        int sum = 0 ;
        int sumsim = 0 ;
        Collections.sort(leftSideNumbers);
        Collections.sort(rightSideNumbers);
        // Compute difference distance between the two lists
        for(int i = 0 ;i < arrayLength;i++){
          sum += Math.abs(leftSideNumbers.get(i) - rightSideNumbers.get(i));
        }
      // Compute simularity score 

      for(int i = 0 ;i < arrayLength;i++){
        int count =  countOccurrences(leftSideNumbers.get(i), rightSideNumbers, leftSideNumbers);
        sumsim += leftSideNumbers.get(i) * count ;
      }
     
        System.out.println(sum +":" +sumsim);
       


      
      

  }
  public static int countOccurrences(Integer number, List<Integer> ListTarget,List<Integer> ListA) {
   
    int count = 0 ;
    int arrayLength = ListTarget.size();
    for(int i = 0 ; i < arrayLength ; i++){
      if(number.equals(ListTarget.get(i))){
        count++ ; 
      }
    }
    return count ;

    
  }

}


