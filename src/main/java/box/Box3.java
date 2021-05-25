package box;

public class Box3 extends Box{

  public Box3(){
      lenth = 15;
      width = 12;
      hight = 12;

  }

    @Override
    public String getName() {

      return "Box3";
    }

    @Override
    public int price() {

      return 50;
    }
}
