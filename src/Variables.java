public class Variables {

    public static void main(String[] args) {

        int age = 33;

        System.out.println(age);

        double balence = 18.89;

        int dollars = (int)balence;
        System.out.println(dollars);

        int dollarsRounded = (int)balence+1;
        System.out.println(dollarsRounded);

        char letter = 'A';

        System.out.println(letter);

        System.out.println((int)letter);

        letter++;

        System.out.println(letter);

        System.out.println((int)letter);

        // 12.
        /**
         * [from question 6, we create the char variable "letter", and initialize it to 'A'. Then I printed out the value giving us "A", and after casting it to an integer, the value is 65. Next after incrementing the variable by +1, which gives us "B", and converting it to a integer again, we get the value "66". ]
         */

    }
}
