package Java;

import java.util.*;
import java.util.stream.Collectors;

public class Hello {

    public static Scanner scanner;

    public static void main(String[] args) {

        init();
        // switchFunction();
        // forLoop();
        // WhileLoop();
        // doWhileLoop();
        // ClassExample();
        // inharitance();
        // OverLoadingMethod();
        //array();
        //list();
        //calculateTheStringLength();
        // arrayMerge();
        //OneArrayConvertTwoArray();
        //RepeatedNumberRemovedFromArray();
        //StringArrayInsert();
        //StringCheckHaveNumber();
        //DuplicatedItemRemoved();
        //swapTwoNumber();
        //StringOperation();
        // FibonacciNumber();
        //FactorialNumber();
        //RecursionExample();
        //PrimeNumber();
        //ReverseList();
        //palindrome();
        //SinglePatternObject();
        //ProblemSolvingTamimShaharir();
        //mcqJava();
        //OperatorNull();
        subString();


    }

    private static void subString() {
        String input = "WIFI:S:TNW;T:WPA;P:TNWTNW5598;;";
        String WifiName;
        String WifiPass;
        String WifiSecurity;

        String[] splitArray = input.split(";");

        WifiName = splitArray[0].substring(7);
        WifiSecurity = splitArray[1].substring(2);
        WifiPass = splitArray[2].substring(2);

        System.out.println("WifiName: " + WifiName);
        System.out.println("WifiPassword : " + WifiPass);
        System.out.println("WifiSecurity: " + WifiSecurity);
    }

    private static void OperatorNull() {
        String input = null;
        System.out.println(input.length());

    }

    private static void mcqJava() {


    }


    private static void ProblemSolvingTamimShaharir() {
        //problem1();
        //problem2();
        //problem3();
        //problem4();
        //problem5();
        //problem6();
        //lsdDigit();
        //problem7();
        smallToLarge();
    }

    private static void smallToLarge() {
        int n = scanner.nextInt();

        int n1, n2, n3;
        int temp;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number ");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();

            if (n1 > n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }

            if (n2 > n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }

            if (n1 > n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }

            System.out.print("Case " + ": " + i + " " + n1 + " " + n2 + " " + n3);
            System.out.println();


        }
    }

    private static void problem7() {

    }

    private static void lsdDigit() {
        int firstDigit = 0;
        int result;

        int inputNumber = scanner.nextInt();
        result = inputNumber / 10;
        firstDigit = inputNumber % 10;

        System.out.println("Result: " + result);
        System.out.println("First Digit: " + firstDigit);

        result = result / 10;
        firstDigit = result % 10;

        System.out.println("Result: " + result);
        System.out.println("First Digit: " + firstDigit);

        result = result / 10;
        firstDigit = result % 10;

        System.out.println("Result: " + result);
        System.out.println("First Digit: " + firstDigit);

        result = result / 10;
        firstDigit = result % 10;

        System.out.println("Result: " + result);
        System.out.println("First Digit: " + firstDigit);

/*        for (int j = 1; j <= 5; j++) {

            result = inputNumber / 10;
            firstDigit = inputNumber % 10;

            System.out.println("Result: " + result);
            System.out.println("First Digit: " + firstDigit);

            if (result == 0) {
                break;
            }

        }*/

        System.out.println(firstDigit);


    }

    private static void problem6() {
        int lsd = 0, msd = 0;
        int result;
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int inputNumber = scanner.nextInt();
            lsd = inputNumber % 10;

            for (int j = 1; j <= 5; j++) {
                result = inputNumber / 10;
                msd = inputNumber % 10;

                inputNumber = result;

                System.out.println("Msd Digit: " + msd);


                if (result == 0) {
                    break;
                }

            }
            result = lsd + msd;

            System.out.println("total Result: " + result);

        }


    }

    private static void problem5() {
        System.out.println("Total Test Case: ");
        int T = scanner.nextInt();


        for (int i = 1; i <= T; i++) {

            System.out.println("total square");

            int n = scanner.nextInt();
            for (int j = 1; j <= n; j++) {

                for (int k = 1; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    private static void problem4() {

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {

            int n = scanner.nextInt();
            System.out.print("Case " + i + ":");
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    System.out.print(" " + j);
                }

            }

        }
    }

    private static void problem3() {
        for (int i = 1000; i >= 1; i--) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");

        }

    }

    private static void problem2() {
        System.out.println("input Test Case: ");
        int T = scanner.nextInt();
        int n[] = new int[101];

        for (int i = 1; i <= T; i++) {

            System.out.println("Enter Number");
            n[i] = scanner.nextInt();

            if (n[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }

    }

    private static void problem1() {

        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {

            int n = scanner.nextInt();
            if (n % i == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }

    private static void SinglePatternObject() {
        SinglePatternClass singlePatternClass;

        singlePatternClass = SinglePatternClass.getSinglePatternClass();

        System.out.println(singlePatternClass);

        SinglePatternClass singlePatternClass1 = SinglePatternClass.getSinglePatternClass();
        System.out.println(singlePatternClass1);

/*        SinglePatternClass test = new SinglePatternClass();
        System.out.println(test);
        SinglePatternClass test1 = new SinglePatternClass();
        System.out.println(test1);*/


    }

    static class SinglePatternClass {
        public static SinglePatternClass singlePatternClass;

        public static SinglePatternClass getSinglePatternClass() {
            if (singlePatternClass == null) {
                singlePatternClass = new SinglePatternClass();
            }
            return singlePatternClass;
        }

    }

    private static void palindrome() {

        String input = "121";
        String reverseStr = "";

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            reverseStr = reverseStr + chars[i];
        }

/*        for (char c : chars) {
            reverseStr = reverseStr + c;
        }*/

        System.out.println("Original String: " + input);
        System.out.println("Reverse String: " + reverseStr);

        if (input.equalsIgnoreCase(reverseStr)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }


    }

    private static void ReverseList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        //Traverse
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Traverse Item: " + arrayList.get(i));

        }

        System.out.println();

        //Reverse
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println("Reverse Item: " + arrayList.get(i));

        }

    }

    private static void PrimeNumber() {
        int number = 3;
        int countCheck = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                countCheck++;
                break;
            }
        }
        if (countCheck == 0) {
            System.out.println(" Prime Number " + number);
        } else {
            System.out.println("Not Prime Number");
        }
    }

    private static void RecursionExample() {

        print(5);
        int totalFactorial = factorial(0);
        System.out.println("Total Factorial: " + String.valueOf(totalFactorial));

    }

    private static int factorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }

    private static void print(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("Recursion Value: " + i);
        print(i - 1);
    }

    private static void FactorialNumber() {
        int FibonacciNumber = 5;
        int input = 5;
        for (int i = 5; i > input; i--) {
            FibonacciNumber = FibonacciNumber * i;

        }
        System.out.println("Fibonacci number: " + FibonacciNumber);
    }

    private static void FibonacciNumber() {
        int FirstNumber = 0;
        int SecondNumber = 1;
        int fibonacciNumber = 0;

        System.out.println("Fibonacci Number: " + FirstNumber);
        System.out.println("Fibonacci Number: " + SecondNumber);

        for (int i = 0; i < 10; i++) {

            fibonacciNumber = FirstNumber + SecondNumber;

            System.out.println(fibonacciNumber);

            FirstNumber = SecondNumber;
            SecondNumber = fibonacciNumber;

        }
    }

    private static void StringBufferBuilder() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println("String Buffer:  " + sb);

        StringBuilder builder = new StringBuilder();
        builder.append("String ");
        builder.append("Builder ");
        builder.append(1);
        System.out.println("String Builder:  " + builder.toString());
    }

    private static void StringOperation() {
        //CreateStringObject();
        //StringConvertCharToString();
        //ImmutableString();
        //AnotherRef();
        //StringCompare();
        Substring();
        //StringBufferBuilder();


    }

    private static void Substring() {
        String s = "Bangladesh";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 5: " + s.substring(6));
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6));

        /* String Split*/
        String input = "1,2,3,4,5,6,7,8,9,10,1,3,4,8,9";
        String[] array = input.split(",");

        for (String item : array) {
            System.out.print(" " + item);
        }
    }

    private static void StringCompare() {

        /*
        1. ==
        2. equals()
        3. compareTo

        * */


        String s = "BugBd";
        String s2 = "BugBd";
        String s3 = new String("bugBd");

        /*Reference Match with Value Match (==) */
        System.out.println(s == s3);

        /*Value Match Only) */
        System.out.println("equals Method : " + s.equals(s3));

        /*Value Match Ignore Case Sensitive ) */
        System.out.println("equalsIgnoreCase :  " + s.equalsIgnoreCase(s3));


        /*compare  Match value Ignore Case Sensitive ) */
        System.out.println("Compare to : " + s.compareTo(s3));
        System.out.println("Compare equalIgnore to : " + s.compareToIgnoreCase(s3));


    }

    private static void AnotherRef() {
        String s = new String();
        s = "india";

        System.out.println("Ref " + s);
    }

    private static void ImmutableString() {
        String example = "Md Ruhul";
        example = example.concat(" Amin");//Explicitly Assign

        System.out.println(example);

        String s = new String();
        s = "Bangladesh";

        System.out.println("Ref: " + s);

    }

    private static void StringConvertCharToString() {
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String input = new String(ch);
        System.out.println(input);

        String input1 = "Bangladesh";
        char[] chars = input1.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }

    }

    private static void CreateStringObject() {
        String input = "Bangladesh";
        String input1 = new String();
        input1 = "Md";

        System.out.println("String Literal " + input);
        System.out.println("By New Keyword Instance Create: " + input1);

    }

    private static void swapTwoNumber() {
        int a = 5;
        int b = 6;
        int temp;
        System.out.println(" a " + a);
        System.out.println(" b " + b);


        temp = a;
        a = b;
        b = temp;

        System.out.println();

        System.out.println("Swap Two Number: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);


    }

    private static void DuplicatedItemRemoved() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: " + list);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        Set<Integer> setList = new HashSet<>(list);

        setList.addAll(list);
        System.out.println("" + setList.toString());

        System.out.println("ArrayList with duplicates removed: " + newList);
    }

    private static void StringCheckHaveNumber() {
        String input = "Ban1234";
        boolean isDigit = false;

        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                System.out.println("Digit");
                isDigit = true;
                break;

            } else {
                System.out.println("Character");
            }

        }

        if (isDigit) {
            System.out.println("Digit Not Allow");
        } else {
            System.out.println("Welcome ");
        }


    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void StringArrayInsert() {
        String commaSeparatedStr = "Hello,have,a,nice,day";
        String[] strArray = null;    //empty string array
        //converting using String.split() method with comma as a delimiter
        strArray = commaSeparatedStr.split(",");
        //printing the converted string array
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    private static void RepeatedNumberRemovedFromArray() {
        String input = "1,2,3,4,5,6,7,8,9,10,1,3,4,8,9";
        String[] array = null;

        array = input.split(",");

        for (int i = 0; i < array.length; i++) {
            System.out.println("String converted array: " + array[i]);
        }

        System.out.println();

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));

        for (String s : hashSet) {
            System.out.println("hashset " + s);

        }


    }

    private static void OneArrayConvertTwoArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int counterKeyPosition = 0;

        int dividedArraySize = array.length / 2;
        int[] array1 = new int[dividedArraySize];
        int[] array2 = new int[dividedArraySize];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[i];
            counterKeyPosition++;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array 1 " + array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[counterKeyPosition];
            counterKeyPosition++;

        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("array 2 " + array2[i]);
        }


    }

    private static void arrayMerge() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = new int[array1.length + array2.length];

        int counter = array1.length;

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[counter] = array2[i];
            counter = counter + 1;
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println("item- " + array3[i]);
        }
    }

    private static void calculateTheStringLength() {
        String countryName = "Bangladesh";
        int totalCharacter = 0;
        for (char c : countryName.toCharArray()) {

            totalCharacter = totalCharacter + 1;
        }
        System.out.println("total Length " + totalCharacter);
    }


    private static void list() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List Value = " + list.get(i));
        }

    }

    private static void array() {
        int a[] = {33, 3, 4, 5};
        int[] cloneArray = a.clone();

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println("Clone Array " + cloneArray[i]);
        }


        int[] array = new int[5];
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        anonymousArray(new int[]{1, 2, 3, 4, 5});
    }

    private static void anonymousArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println("AnonymousArray " + ints[i]);
        }

    }

    private static void OverLoadingMethod() {
    }


    private static void inharitance() {
        Student student = new Student("Rahul");
        student.display();
        System.out.println(student.Department);
        student.CollageName();
    }

    private static void ClassExample() {
        Student student = new Student("Rahul");
        student.display();
    }

    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    private static void WhileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    private static void init() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    private static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    private static void switchFunction() {
        System.out.print("Given a Number: ");
        int a = scanner.nextInt();

        switch (a) {
            case 5: {
                System.out.println("value " + a);
                break;
            }
            default: {
                System.out.println("Not match Value");
            }
        }
    }


    public static class Student extends Department {

        String name;

        public Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Student Name " + name);
        }

        @Override
        public void CollageName() {
            super.CollageName();
        }
    }

    public static class Department {
        public String Department = "Computer";

        public void CollageName() {
            String collageName = "TPI";
            System.out.println("Collage Name " + collageName);
        }

    }

    public static class Calculation {
        public int add(int a, int b) {
            return a + b;

        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }
}
