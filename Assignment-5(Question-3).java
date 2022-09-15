public class Main2 {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
	double sum =0;
    public void run(){
        for(int i=1;i<50;i++){
            sum += i;      
        }
        sum = sum/50;
        System.out.println("The average of first 50 numbers is: " +  sum);
    }
}

class Runnable1 implements Runnable{
	int[]arr = {2,3,4,5,6};
    public void run(){
    	for(int i=0;i<arr.length;i++) {
    		int square = arr[i]*arr[i];
    		System.out.println("Square of "+ arr[i] +" is: "+square);
    	}
    }
}