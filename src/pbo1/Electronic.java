package pbo1;

// Kelas ElectronicProduct yang meng-extend Product
class ElectronicProduct extends Product {
    private int warrantyPeriod;

    // Konstruktor
    public ElectronicProduct(String name, double price, int quantity, int warrantyPeriod) {
        super(name, price, quantity);  // Memanggil konstruktor superclass
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getter dan Setter
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    // Overriding
    @Override
    public String toString() {
        return super.toString() + ", Warranty Period: " + warrantyPeriod + " months";
    }
}
