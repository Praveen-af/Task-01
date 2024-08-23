public class Coffee extends Beverages{
    @Override
    void brew(){
        System.out.println("Dripping coffee through filters");
    }
    @Override
    void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
    @Override
    void addExtras(){
        System.out.println("Adding vannila syrup");
    }
}
