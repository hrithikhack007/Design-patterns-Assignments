package solid.live.srp;

public class LeavesLeftPreviously {

    int years;
    main.Employee employee;
    LeavesLeftPreviously(int years, main.Employee employee){
        this.years = years;
        this.employee = employee;
    }

       int calculateLeaves() {
           int totalLeaveLeftPreviously = 0;
           for (int i = 0; i < years; i++) {
               totalLeaveLeftPreviously += employee.getLeavesLeftPreviously()[employee.getYearsInOrg() - i - 1];
           }

           return totalLeaveLeftPreviously;
       }
}
