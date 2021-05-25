package box;

public class Box1 extends Box{

  public Box1(){
      lenth = 5;
      width = 5;
      hight = 5;

  }

    @Override
    public String getName() {
        return "Box1";
    }

    @Override
    public int price() {
        return 30;
    }
}
