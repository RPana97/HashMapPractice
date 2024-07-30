package org.example;
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    public IOU () {
        this.debts = new HashMap<>();
    }

    public void setSum (String toWhom, double amount) {
        this.debts.put (toWhom, amount);
    }

    public double howMuchDoIOweTo (String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // prints: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));  // prints: 30.0
        System.out.println(mattsIOU.howMuchDoIOweTo("John"));     // prints: 0.0

        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // prints: 10.5
    }
}
