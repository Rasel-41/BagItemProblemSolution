import java.util.ArrayList;

public class Bag {
    private class Item{

        private String name;
        private int quantity;
        public Item(String name){
            this.name = name;
            this.quantity = 1;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }
        public void incrementQuantity(){
            quantity++;
        }
    }
    private ArrayList<Item>items;
    public Bag(){
        items = new ArrayList<>();
    }
    public void add(String itemName){
        for(Item item : items){
            if(item.getName().equals(itemName)){
                item.incrementQuantity();
                return;
            }
        }
        items.add(new Item(itemName));
    }
    public int count(String itemName){
       for(Item item: items) {
           if(item.getName().equals(itemName)){
               return item.getQuantity();
           }
       }
       return 0;
    }
}
