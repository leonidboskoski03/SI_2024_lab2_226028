import java.util.List;

class Item {
    String name;
    String barcode; //numerical
    int price;
    float discount;

    public Item(String name, String code, int price, float discount) {
        this.name = name;
        this.barcode = code;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode(String code) {
        this.barcode = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}


public class SILab2 {
    public static boolean checkCart(List<Item> allItems, int payment){ // A
        if (allItems == null){ // B
            throw new RuntimeException("allItems list can't be null!"); // C
        }

        float sum = 0; // D

        for (int i = 0; i < allItems.size(); i++){ // E.1 E.2 E.3
            Item item = allItems.get(i);
            if (item.getName() == null || item.getName().length() == 0){ // F
                item.setName("unknown"); //G
            }
            if (item.getBarcode() != null){ // H
                String allowed = "0123456789";
                char chars[] = item.getBarcode().toCharArray(); // I
                for (int j = 0; j < item.getBarcode().length(); j++){ // J.1 J.2 J.3
                    char c = item.getBarcode().charAt(j); // K
                    if (allowed.indexOf(c) == -1){ // L
                        throw new RuntimeException("Invalid character in item barcode!"); // M
                    }
                } // N
                if (item.getDiscount() > 0){ // O
                    sum += item.getPrice()*item.getDiscount(); // P
                }
                else {
                    sum += item.getPrice(); // Q
                }
            }
            else {
                throw new RuntimeException("No barcode!"); // R
            }
            if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'){ //S
                sum -= 30; // T
            }
        } // U
        if (sum <= payment){ // V
            return true; // W
        }
        else {
            return false; // X
        }
    } // Y
}