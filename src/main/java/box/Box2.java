package box;

public class Box2 extends Box{

  public Box2(){
      lenth = 12;
      width = 10;
      hight = 10;

  }

    @Override
    public String getName() {

      return "Box2";
    }

    @Override
    public int price() {

      return 40;
    }
}
