package box;

public abstract class Box {
    int lenth;
    int width;
    int hight;
    public boolean value(int len ,int wid ,int hig ){
        return (lenth <= len && width <= wid &&hight <= hig);
    }
    public abstract String getName();
    public abstract int price();
}
