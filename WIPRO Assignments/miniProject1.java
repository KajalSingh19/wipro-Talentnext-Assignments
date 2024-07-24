import java.util.*;

public class miniProject1 {
   
    public static String[] getEmployee(int empNo){
       int sizeCol = EmpData[0].length;
        String[] emp = new String[sizeCol];
        for(int i =0 ; i < EmpData.length; i++){
            if(empNo == Integer.parseInt(EmpData[i][0])){
                for(int j = 0; j < sizeCol; j++){
                    emp[j] = EmpData[i][j];
                }
            }
        }return emp;
    }
    public static String[] getDA(String DesignationCode){
        int sizeCol = DesignationTable[0].length;
         String[] DA = new String[sizeCol];
         for(int i =0 ; i < DesignationTable.length; i++){
             if(DesignationCode == DesignationTable[i][0]){
                 for(int j = 0; j < sizeCol; j++){
                     DA[j] = DesignationTable[i][j];
                     //System.out.print(DA[j] + ", ");
                 }
             }
         }return DA;
     }


public static String[] InfoOfEmp =new String[]{"EmpId" , "EmpName", "Department" ,"Date of Joining" ,"Designation_Code","Basic","HRA","IT"};
public static String[][] EmpData ={ {"1001", "Ashish" ,"R&D", "01/04/2009", "e", "20000","8000","3000"},
                        {"1002","Sushma","PM","23/08/2012", "c","30000","12000","9000" },
                        {"1003","Rahul","Acc","12/11/2008", "k","10000","8000","1000" },
                        {"1004","Chahat","FrontDesk","29/01/2013", "r","12000","6000","2000" },
                        {"1005","Ranjan","Engg","16/07/2005", "m","50000","20000","20000" },
                        {"1006","Suman","Manufactoring","01/01/2000", "e","23000","9000","4400" },
                        {"1007","Tanmay","PM","12/06/2006", "c","29000","12000","10000" }};
public static String[] AllowanceDetailsEmp = {"Designation Code" , "Designation", "DearAllowance"};
public static String[][] DesignationTable = {{"e", "Engineer", "20000"},
                                {"c", "Consultant","32000"},
                            {"k", "Clerk","12000"},
                            {"r", "Receptionist","15000"},
                            {"m", "Manager","40000"},
                            {"e", "Engineer", "20000"},
                            {"c", "Consultant","32000"}};
    
    public static void main(String[]  args){
try{  
//Fetching Data 
     String[] Employee = getEmployee(Integer.parseInt(args[0]));
          String DesignationCode =  Employee[Arrays.asList(InfoOfEmp).indexOf("Designation_Code")];
        // System.out.println(DesignationCode); 
         
        String[] da = getDA(DesignationCode);
          String Designation = da[Arrays.asList(AllowanceDetailsEmp).indexOf("Designation")];
//System.out.println(Designation);
          

//Salary Calculations
            int Basic = Integer.parseInt(Employee[Arrays.asList(InfoOfEmp).indexOf("Basic")]);
            int HRA = Integer.parseInt(Employee[Arrays.asList(InfoOfEmp).indexOf("HRA")]);
            int IT = Integer.parseInt(Employee[Arrays.asList(InfoOfEmp).indexOf("IT")]);
            int DearAllowance = Integer.parseInt(da[Arrays.asList(AllowanceDetailsEmp).indexOf("DearAllowance")]);
            int salary = Basic + HRA + DearAllowance - IT;
            //System.out.println(Basic);
           
            System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp_ID", "Emp_Name", "Department", "Designation", "Salary");
        System.out.println("--------------------------------------------------------");
       System.out.printf("%-10s%-10s%-15s%-15s%-10s",Employee[0], Employee[1], Employee[2], Designation, salary);
    }
        catch(Exception e){
            System.out.printf("The Employee ID : %s is not a valid ID ", args[0]);
        }
}
}
