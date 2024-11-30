public class Test {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Apple");
        System.out.println("Count of apple: "+bag.count("Apple"));
        System.out.println("Count of Banana: "+bag.count("Banana"));
        System.out.println("Count of Orangrs: "+bag.count("Oranges"));
    }
}
