public class Lab_07_01_GetLoopy {
    public static void main(String[] args) {
        System.out.println("Lets count from 0 to 30 in increments of 1");
        for (int cnt=0; cnt <=30; cnt++){
            System.out.println(cnt);
        }
        System.out.println("Now let's go down from 30 to 0 in increments of 1");
        for (int cnt=30; cnt >=0; cnt--){
            System.out.println(cnt);
        }
        System.out.println("Next we will go from 0 to 8 in increments of 3");
        for (int cnt=0; cnt <=18; cnt =cnt +3){
            System.out.println(cnt);
        }
        System.out.println("Lastly we will count down from 10 in increments of 2");
        for (int cnt = 10; cnt >=0; cnt =cnt -2){
            System.out.println(cnt);
        }
        }
    }

