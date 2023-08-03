package solid.live.srp;
import java.util.*;

public class main{

    public class Employee {
        private int empId;
        private static int TOTAL_LEAVES_ALLOWED = 30;

        private double monthlySalary;
        private String name;
        private String addressStreet;
        private String addressCity;
        private String addressCountry;
        private int leavesTaken;
        private int totalLeaveAllowed;
        private int leaveTaken;
        private String manager;
        private int yearsInOrg;
        private int thisYeard;
        private int[] leavesLeftPreviously;


        public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
            this.empId = empId;
            this.monthlySalary = monthlySalary;
            this.name = name;
            this.addressStreet = addressStreet;
            this.addressCity = addressCity;
            this.addressCountry = addressCountry;
            this.leavesTaken = leavesTaken;
            this.leavesLeftPreviously = leavesLeftPreviously;
            this.yearsInOrg = leavesLeftPreviously.length;
        }

        public Employee() {
        }

        public int[] getLeavesLeftPreviously() {
            return leavesLeftPreviously;
        }

        public int getYearsInOrg() {
            return yearsInOrg;
        }

        //other method related to customer
    }

  public class ToHtml{

        Employee employee;

        ToHtml(Employee employee){
            this.employee = employee;
        }

      public String doingHtmlConversion() {
          String str = "<div>" +
                  "<h1>Employee Info</h1>" +
                  "<div id='emp" + employee.empId + "'>" +
                  "<span>" + employee.name + "</span>" +
                  "<div class='left'>" +
                  "<span>Leave Left :</span>" +
                  "<span>Annual Salary:</span>" +
                  "<span>Manager:</span>" +
                  "<span>Reimbursable Leave:</span>" +
                  "</div>";
          str += "<div class='right'><span>" + (employee.totalLeaveAllowed - employee.leaveTaken) + "</span>";
          str += "<span>" + Math.round(employee.monthlySalary * 12) + "</span>";
          if (employee.manager != null) str += "<span>" + employee.manager + "</span>";
          else str += "<span>None</span>";
          int years = 3;
          if (employee.yearsInOrg < 3) {
              years = employee.yearsInOrg;
          }

          LeavesLeftPreviously leavesLeftPreviously = new LeavesLeftPreviously(years,employee);

          str += "<span>" + leavesLeftPreviously.calculateLeaves() + "</span>";
          return str + "</div> </div>";
      }


  }


    public static void main(String[] args){


        Employee employee = new Employee();

        ToHtml toHtml = new(employee);



    }
}



