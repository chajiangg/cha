package jiang.cha;

import java.util.ArrayList;
import java.util.Iterator;



/**
 * Created by chajiang on 2016/5/6.
 */
public class SearchBooks {

    ArrayList<String> list = new ArrayList<String>();

    public void search(){

        list.add("编号 1   名称：《围城》作者：钱钟书  出版时间：1947  3本");
        list.add("编号 2   名称：《平凡的世界》  作者：路遥 出版时间：1977年  5本");
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            String str = (String)it.next();
            System.out.println(str);
        }

    }


}


