class SequentialPrinter {
    private int number = 1;
    private final int MAX = 300;

    public synchronized void printNumbers(int threadId) {
        while (number <= MAX) {
            int currentThread = (number - 1) / 100 + 1;

            if (currentThread != threadId) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Thread T" + threadId + ": " + number);
                number++;
                notifyAll();
            }
        }
    }
}

class T1 extends Thread {
    SequentialPrinter sp;

    T1(SequentialPrinter sp) {
        this.sp = sp;
    }

    public void run() {
        sp.printNumbers(1);
    }
}

class T2 extends Thread {
    SequentialPrinter sp;

    T2(SequentialPrinter sp) {
        this.sp = sp;
    }

    public void run() {
        sp.printNumbers(2);
    }
}

class T3 extends Thread {
    SequentialPrinter sp;

    T3(SequentialPrinter sp) {
        this.sp = sp;
    }

    public void run() {
        sp.printNumbers(3);
    }
}

public class Main {
    public static void main(String[] args) {
        SequentialPrinter sp = new SequentialPrinter();

        T1 t1 = new T1(sp);
        T2 t2 = new T2(sp);
        T3 t3 = new T3(sp);

        t1.start();
        t2.start();
        t3.start();
    }
}
