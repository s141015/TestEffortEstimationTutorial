public class Calculator {
    double answer;
    public Calculator(){
        answer = 10;
    }
    public void plus(int x){
        this.answer+=x;
    }
    public void minos(int x){
        this.answer-=x;
    }
    public void times(int x){
        this.answer*=x;
    }
    public void divided(int x){
        if (x==0){
            return;
        }
        this.answer/=x;
    }
    public double getAnswer(){
        return answer;
    }
}