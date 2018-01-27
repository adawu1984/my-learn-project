/**
 * Created by felix on 2018/1/27.
 */

/**
 * 给定一个百分制的分数，输出相应的等级。         90分以上        A级         80~89          B级         70~79          C级         60~69          D级         60分以下        E级
 */
public class ScoreMark {
    double score;

    public void mark(double score) {
        if (score >= 90) {
            System.out.println(score + "是A级");
        }
        if (score >= 80 && score < 90) {
            System.out.println(score + "是B级");
        }
        if (score >= 70 && score < 80) {
            System.out.println(score + "是C级");
        }
        if (score >= 60 && score < 70) {
            System.out.println(score + "是D级");
        }
        if (score < 60) {
            System.out.println(score + "是E级");
        }


    }
    public void markUseSwitch(Integer day){
        switch (day){
            case 1:
                System.out.println("早上吃包子");
                break;
            case 2:
                System.out.println("早上吃油条");
                break;
            default:
                System.out.println("王胖子吃狗屁");
        }
    }


}