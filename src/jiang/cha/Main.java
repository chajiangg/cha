package jiang.cha;

import java.util.Scanner;

/**
 * Created by chajiang on 2016/5/6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("1.查看图书列表：");
            System.out.println("2.添加书：");
            System.out.println("3.删除书：");
            System.out.println("4.借书：");
            System.out.println("5.还书：");
            System.out.println("6.离开：");

            int i = sc.nextInt();
            switch (i) {
                case 1:
                    new SearchBooks().search();
                    break;
                case 2:
                    new AddBooks().add1();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("请输入正确的命令");
                    break;
            }


        }

    }
}
