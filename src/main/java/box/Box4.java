package box;

public class Box4 extends Box{

  public Box4(){
      lenth = 20;
      width = 20;
      hight = 20;

  }

    @Override
    public String getName() {

      return "Box4";
    }

    @Override
    public int price() {

      return 60;
    }
}
