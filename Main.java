import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
  // Assigning Values
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner scanner = new Scanner(System.in);
    int input; 

  // Assigning File To "arrayList"
    while (fileScanner.hasNextLine()) { 
      arrayList.add(fileScanner.nextLine()); }

  // Output Instructions
    System.out.println("Press 1 to learn about salary.\n"    +
                       "Press 2 to learn about the job.\n"   +
                       "Press 3 to learn about demand.\n"    +
                       "Press 4 to view current students.\n" +
                       "Press 5 to quit.");
    input = scanner.nextInt();
    
  // User Input
    while (input < 5 && input > 0) {
      switch(input) {
        /* "Option 1": ___________________________________________________
          > Description:
            > ... */
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;        
  
        /* "Option 2": ___________________________________________________
          > Description:
            > ... */
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
  
        /* "Option 3": ___________________________________________________
          > Description:
            > ... */
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
      
        /* "Option 4": ___________________________________________________
          > Description: 
            > Loops While New Line Is Available And Prints Each New Line. */
        case 4:
          System.out.println("Current Students:");
          for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)); }
          break;
  
        /* "Option 5": ___________________________________________________
          > Description:
            > ... */
        case 5:
          break;
      }
    // Resseting For Next Iteration.
      System.out.println("Press 1 to learn about salary.\n"    +
                         "Press 2 to learn about the job.\n"   +
                         "Press 3 to learn about demand.\n"    +
                         "Press 4 to view current students.\n" +
                         "Press 5 to quit.");
      input = scanner.nextInt();
    }
	}
}