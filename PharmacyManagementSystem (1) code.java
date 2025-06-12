
class Medicine {
    String name;
    String batchNo;
    double price;
    int quantity;

    Medicine(String name, String batchNo, double price, int quantity) {
        this.name = name;
        this.batchNo = batchNo;
        this.price = price;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity in Stock: " + quantity);
        System.out.println("--------------------------");
    }
}

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        // Sample medicines
        Medicine[] stock = new Medicine[3];
        stock[0] = new Medicine("Paracetamol", "B101", 2.5, 100);
        stock[1] = new Medicine("Amoxicillin", "B102", 5.0, 50);
        stock[2] = new Medicine("Cough Syrup", "B103", 7.0, 30);

        // Display all medicine info
        System.out.println("=== Pharmacy Stock Report ===");
        for (Medicine med : stock) {
            med.displayInfo();
        }

        // Simulate a sale (1 unit of Amoxicillin)
        System.out.println("=== Sale: 1 unit of Amoxicillin ===");
        for (Medicine med : stock) {
            if (med.name.equals("Amoxicillin") && med.quantity > 0) {
                med.quantity -= 1;
                System.out.println("Sold 1 unit of " + med.name);
                System.out.println("Remaining stock: " + med.quantity);
            }
        }
    }
}
