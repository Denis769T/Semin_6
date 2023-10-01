import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        int s=16;//Указываем объем памяти, для сортировки.
        int h=64;//Указываем объём жесткого диска, для сортировки.
        String firm1="Samsung";//Указываем фирму производитель, для сортировки
        String color="Белый";// Сортировка по цвету.
    //-----------------------------------
        List<Noutbook> list1=new ArrayList<Noutbook>();
        System.out.println("Модель | Цвет |  Объем OУ ");
        list1.add(new Noutbook("Samsung","Белый",16, 128));
        list1.add(new Noutbook("LG","Черный",8,64));
        list1.add(new Noutbook("HP","Серебристый",16,32));
        list1.add(new Noutbook("Apple","Темно-синий",32,1000));
        list1.add(new Noutbook("Apple","Светлый",16, 256));
        list1.add(new Noutbook("Apple","Темно-синий",32,128));
        list1.add(new Noutbook("Acer","Серый",4,64));
        list1.add(new Noutbook("Acer","Бежевый",8,32));
        list1.add(new Noutbook("Lenovo","Красный",32,64));
        list1.add(new Noutbook("Lenovo","Желтый",64,512));
        list1.add(new Noutbook("Lenovo","Белый",128,128));
        list1.add(new Noutbook("LG","Желтый",4,256));
        list1.add(new Noutbook("Samsung","Белый",32, 512));

//------------------------------------------------------------------
        System.out.println("Меню.(выбора действий 0,1,2,3...)\n" +
                "1. Вывести все ноутбуки в списке.\n" +
                "2. Вывод списка фирм.\n" +
                "3. Сортировка по объему ОЗУ.\n" +
                "4. Сортировка по фирме-производителю ноутбука.\n" +
                "5. Отсортировать по объему жесткого диска.\n");


        Scanner scanner=new Scanner(System.in);
        //System.out.println("Введите значение меню (1,2,..... и т.д)");
        int nums=scanner.nextInt();
        scanner.close();
        switch (nums) {
            case 1:
                System.out.println("| Модель |  Цвет |  Объем OЗУ | Объём Жесткого диска ");
                System.out.println("-------------------------------------------------------");
                for (Noutbook noutbook : list1) {
                    System.out.println(noutbook.getModel() + " - " + noutbook.getColor() + " - " + noutbook.getOZU());

                }
                break;
            case 2:
                for (Noutbook noutbook : list1) {
                    System.out.println(noutbook.getModel());
                }
                break;

            case 3:
//                int s=Noutbook.printing();
                for (Noutbook noutbook : list1) {
                    if (noutbook.getOZU() >=s)
                        System.out.println(noutbook.getModel() +
                        " - " + noutbook.getColor() +
                        " - " + noutbook.getOZU()+" (ОЗУ)"+
                        " - " + noutbook.getHDC()+" (Объем диска)");
                    }

                break;

            case 4:

                for (Noutbook noutbook:list1) {
                    if (noutbook.getModel()==firm1)
                        System.out.println(noutbook.getModel() +
                            " - " + noutbook.getColor() +
                            " - " + noutbook.getOZU()+" (ОЗУ)"+
                            " - " + noutbook.getHDC()+" (Объем диска)");
                }

                break;

            case 5:
                for (Noutbook noutbook : list1) {
                    if (noutbook.getHDC() ==h)
                        System.out.println(noutbook.getModel() +
                            " - " + noutbook.getColor() +
                            " - " + noutbook.getOZU()+" (ОЗУ)"+
                            " - " + noutbook.getHDC()+" (Объем диска)");
                }

                break;

        }
    }
}