/**
 * Created by felix on 2018/1/27.
 */

public class AddNumber {
    //编写程序求 1+3+5+7+……+99 的和值
    public void addAllNumber(){
        Integer i=1;
        Integer sum=0;
        while(i<=5){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("总和是"+ sum);


    }
}
