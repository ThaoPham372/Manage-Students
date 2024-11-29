package QuanLyHocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QLyHocSinh {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  List <String> manageStudent = new ArrayList<>();
  int choice;
  do {
      System.out.println("-----Menu-----");
      System.out.println("1. Add student");
      System.out.println("2. Print student list");
      System.out.println("3. Remove student");
      System.out.println("4. Find student");
      System.out.println("5. Edit student name");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice){
          case 1:
              System.out.print("Enter student name: ");
              String name = sc.nextLine();
              manageStudent.add(name);
              System.out.println("Add student successfully!");
              break;

          case 2:
              System.out.println("List Student: ");
              for (int i=0; i<manageStudent.size(); i++){
                  System.out.println((i+1) + "/" + manageStudent.get(i));
              }
              break;

          case 3:
              System.out.print("Enter student name to remove: ");
              String removeName = sc.nextLine();
              if (manageStudent.remove(removeName)){
                  System.out.println("Remove " + removeName + " successfully!");
              }else {
                  System.out.println("Not found student!");
              }
              break;

          case 4:
              System.out.print("Enter student name to find: ");
              String findStudent = sc.nextLine();
              if (manageStudent.contains(findStudent)){
                  System.out.println(findStudent + "in student list!");
              }else {
                  System.out.println(findStudent + "not in student list");
              }
              break;

          case 5:
              System.out.print("Enter student name to edit: ");
              String oldName = sc.nextLine();
              if(manageStudent.contains(oldName)){
                  System.out.println("Enter new name: ");
                  String newName = sc.nextLine();
                  manageStudent.set(manageStudent.indexOf(oldName), newName);
                  System.out.println("Edit new name: " + newName);
              }else {
                  System.out.println("Not found student in list");
              }
              break;

          case 6:
              System.out.println("Goodbye!");
              break;

          default:
              System.out.println("Invalid choice!");
              break;
      }
  } while (choice != 6);
}
}