class Printer {
    // synchronized void printDocuments(int numOfCopies, String docName) {
    void printDocuments(int numOfCopies, String docName) {
        for (int i = 1; i <= numOfCopies; i++) {
            System.out.println(">> Printing " + docName + " " + i);
        }
    }
}

class MyThread extends Thread {
    Printer pRef;

    MyThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocuments(10, "JohnProfile.pdf");
        }
    }
}

class YourThread extends Thread {
    Printer pRef;

    YourThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocuments(10, "CarlosProfile.pdf");
        }
    }
}

public class SyncApp {
    public static void main(String[] args) {
        System.out.println("==Aplicação Iniciada==");

        // We have only 1 single object of printer
        Printer printer = new Printer();
        // printer.printDocuments(10, "ThomasProfile.pdf");

        // Primeiro cenário, o caso em que estamos tentando fazer duas coisas
        // e elas não estão sincronizadas, o que pode ocasionar em um problema.
        MyThread mRef = new MyThread(printer); // My thread is refering this single object
        YourThread yRef = new YourThread(printer); // My thread is refering this single object
        // mRef.setPriority(Thread.MAX_PRIORITY);
        // yRef.setPriority(Thread.NORM_PRIORITY);

        mRef.start();
        yRef.start();


        System.out.println("==Aplicação Finalizada==");
    }
}
