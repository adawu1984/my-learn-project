/**
 * Created by qhwu on 2018/1/26.
 */
public class Bissxtile {
    int year;
    public void  leapyear(int year){
        if(year<0||year>=3000){
            System.out.print("年份有误，程序退出！");
        }
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println(year+"是润年");
        }else{
            System.out.println(year+"不是润年");
        }
    }
}
