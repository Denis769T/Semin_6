import java.util.Scanner;

public class Noutbook {

    private String model;
    private String color;
    private Integer OZU;

    private Integer HDC;


    public Noutbook (String model, String color, Integer OZU, Integer HDC){
        this.setModel(model);
        this.setColor(color);
        this.setOZU(OZU);
        this.setHDC(HDC);

    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;

    }
    public String  getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public Integer  getOZU(){
        return OZU;
    }
    public void setOZU(Integer OZU) {
        this.OZU = OZU;
    }
    public void setHDC(Integer HDC){
        this.HDC=HDC;
    }
    public void getHDC(Integer HDC){
        this.setHDC(HDC);
    }
//------------------------------------

//    public static int printing()  {
//        System.out.println("Введите объём памяти устройсва, 4,16,32,64 или 128:");
//        Scanner scanners = new Scanner(System.in);
//        System.out.println("Введите значение:");
//        int s = scanners.nextInt();
//        for (Noutbook noutbook:Noutbook  ) {
//            if (noutbook.getOZU() >=s)
//                System.out.println(noutbook.getModel() + " - " + noutbook.getColor() + " - " + noutbook.getOZU());
//        }
//        return s;
//}


    public Integer getHDC() {
        return HDC;
    }
}