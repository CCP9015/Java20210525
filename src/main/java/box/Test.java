package box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box [] boxes = {
                new Box1(), new Box2(), new Box3(), new Box4()
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your object's lenth: ");
        int l = Integer.parseInt(scan.next());
        System.out.println("please enter your object's width: ");
        int w = Integer.parseInt(scan.next());
        System.out.println("please enter your object's hight: ");
        int h = Integer.parseInt(scan.next());
        System.out.println("lenth: " + l + "\t" + "width: " + w + "\t" + "hight: " + h );
        for (Box box : boxes) {
            if(box.value(l ,w ,h)){
                System.out.println(box.getName() + "\t" + box.price());
                break;
            }
            
        }

    }
}
