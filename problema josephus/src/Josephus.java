import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {

        int n;
        int m;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número m: ");
        m = entrada.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o número n: ");
        n = entrada2.nextInt();

        // initialize the queue
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 1; i <= n; i++)
            queue.enqueue(i);

        while (!queue.isEmpty()) {
            for (int i = 0; i < m-1; i++)
                queue.enqueue(queue.dequeue());
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
