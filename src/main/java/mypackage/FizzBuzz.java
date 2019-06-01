package mypackage;

public class FizzBuzz {
    // fizzbuzz 1 2 fizz 4 buzz ... 14 fizzbuzz 16
    public static void main(String[] args) {
        String sql = "select * from employee where emp_no like 'yu%'";

        for (int i = 0; i < 100; i++) {

            System.out.println(fizzBuzz(i));
        }

    }


    public static String fizzBuzz(int i) {
        String out = "";
        if (i%3==0) {
            out += "fizz";
        }
        if (i%5==0) {
            out += "buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out+=i;
        }

        return out;
    }
}
