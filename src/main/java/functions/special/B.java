package functions.special;

import java.util.List;

public class B {
    @Deprecated
    public static long i = 1;
    public static void echo(){
        System.out.println("echo");
    }
    public static Integer Layer2_RENAME(Integer i){
        i = i + 1;
        return i;
    }
    public static Integer aho(){
        return 1;
    }
    public static Integer Layer2_2(List<Integer> a){
        Boolean notNull = a.size() > -1;
        if(notNull){
            return a.size();
        }
        else{
            return 0;
        }
    }
}
