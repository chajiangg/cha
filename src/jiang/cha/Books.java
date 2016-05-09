package jiang.cha;

import java.util.Date;

/**
 * Created by chajiang on 2016/5/6.
 */
public class Books {
    private int number,count1;
    private String bookName;
    private String author;
    private Integer date1;
    /**public Books(int number,String bookName,String author,Integer date1){
        this.number = number;
        this.bookName = bookName;
        this.author = author;
        this.date1 = date1;
    }*/
    public int getNumber(){
        return number;
    }
    public void setNumber(int a){
        this.number = number;
    }
    public String getbookName(){
        return bookName;
    }
    public void setbookName(){
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author = author;
    }

    public Integer getData1(){
        return date1;
    }
    public void setDate1(){
        this.date1 = date1;
    }
    public int count1(){
        return count1;
    }


}
