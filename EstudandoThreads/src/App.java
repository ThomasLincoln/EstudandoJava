// class MyTask{
//     void executeTask(){
//         for(int doc = 1; doc<=10; doc++){
//             System.out.println("Printing document: " + doc + " - Printer 2");
//         }
//     }
// }

// MyTask is a thread
// class MyTask extends Thread{
//     @Override
//     public void run(){
//         for(int doc = 1; doc<=10; doc++){
//             System.out.println("Printing document: " + doc + " - Printer 2");
//         }
//     }
// }

class CA{

}

class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int doc = 1; doc<=10; doc++){
            System.out.println("Printing document: " + doc + " - Printer 2");
        }
    }
}

public class App {

    // Main method represents the main thread
    public static void main(String[] args) throws Exception {
        // tudo que for escrito aqui vai ser executado pela main thread. 
        // threads sempre executam os jobs em sequência. 

        // Job 1
        System.out.println("==Aplicação iniciada==");

        // Job 2
        // MyTask task = new MyTask();
        // task.executeTask();
        // task.start();

        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();


        /*  
            Enquanto o job 2 não tiver terminado, os demais jobs estão esperando e não executando.
            No caso do job 2 ser uma long running operation, ou seja, ele demorar muito para terminar
            a jvm vai nos dar um alerta de que a aplicação não está respondendo, e é nesse caso que
            precisamos de uma thread
        */

        /*
         * Agora com a criação de um thread, o Job 2 vai ser executado em paralelo ao Job 3
         */
        // Job 3
        // Some code to print some documents
        for(int doc = 1; doc<=10; doc++){
            System.out.println("Printing document: " + doc + " - Printer 1");
        }

        // Job 4
        System.out.println("==Aplicação finalizada==");

    }
}
