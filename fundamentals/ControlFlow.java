package fundamentals;

/**
 * Control Flow Structures in Java
 * Topics: if-else, switch, for, while, do-while, break, continue
 */
public class ControlFlow {
    
    public static void main(String[] args) {
        System.out.println("=== CONTROL FLOW EXAMPLES ===\n");
        
        // IF-ELSE Statement
        System.out.println("1. IF-ELSE Statement");
        int age = 25;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // IF-ELSE-IF
        System.out.println("\n2. IF-ELSE-IF Statement");
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // TERNARY Operator
        System.out.println("\n3. Ternary Operator");
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
        
        // SWITCH Statement
        System.out.println("\n4. SWITCH Statement");
        int day = 3;
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid Day";
        }
        System.out.println("Day " + day + " is " + dayName);
        
        // FOR Loop
        System.out.println("\n5. FOR Loop");
        System.out.print("Numbers 1-5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // WHILE Loop
        System.out.println("\n6. WHILE Loop");
        int count = 1;
        System.out.print("Countdown from 5: ");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // DO-WHILE Loop
        System.out.println("\n7. DO-WHILE Loop");
        int i = 1;
        System.out.print("Do-While (1-3): ");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 3);
        System.out.println();
        
        // BREAK Statement
        System.out.println("\n8. BREAK Statement");
        System.out.print("Loop with break: ");
        for (int j = 1; j <= 10; j++) {
            if (j == 6) break;
            System.out.print(j + " ");
        }
        System.out.println();
        
        // CONTINUE Statement
        System.out.println("\n9. CONTINUE Statement");
        System.out.print("Skip even numbers: ");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) continue;
            System.out.print(j + " ");
        }
        System.out.println();
        
        // NESTED Loops
        System.out.println("\n10. Nested Loops (Multiplication Table)");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
    }
}
