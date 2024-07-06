package pbo1;

// Kelas utama

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan produk
        Product[] products = new Product[5];

        try {
            // Input data produk dari pengguna
            for (int i = 0; i < products.length; i++) {
                System.out.println("Enter details for product " + (i + 1) + ":");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();

                System.out.print("Is this an electronic product? (yes/no): ");
                scanner.nextLine();  // Consume newline
                String isElectronic = scanner.nextLine();

                if (isElectronic.equalsIgnoreCase("yes")) {
                    System.out.print("Warranty Period (months): ");
                    int warrantyPeriod = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    products[i] = new ElectronicProduct(name, price, quantity, warrantyPeriod);
                } else {
                    products[i] = new Product(name, price, quantity);
                }
            }

            // Menampilkan detail produk
            for (Product product : products) {
                System.out.println(product);
                System.out.println("Total Price: " + product.calculateTotalPrice());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
