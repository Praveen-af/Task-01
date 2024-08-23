public abstract class Beverages {
    private boolean wantExtras;
    public final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantExtras){
            addExtras();
        }
    }
    private void boilWater(){
        System.out.println("Boiling Water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    public void setWantExtras(boolean wantExtras) {
        this.wantExtras = wantExtras;
    }
}
