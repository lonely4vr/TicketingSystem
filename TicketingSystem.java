
import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;


public class TicketingSystem {
    public static void main(String[] args) throws InterruptedException {
        Queue<Ticket> tickets = new LinkedList<>();
        tickets = generateTicket(3, tickets);
        Thread.sleep(3000);
        ticketProcessor(tickets);
    }

    public static Queue<Ticket> generateTicket(int numOfTickets, Queue<Ticket> ticketQueue){
        Instant start = Instant.now();
        for (int i = 0; i < numOfTickets; i++){
            ticketQueue.add(new Ticket(i, start));
            long interval = (long) (Math.random()*5000);
            start = start.plusMillis(interval);
        }
        return ticketQueue;
    }
    public static void ticketProcessor(Queue<Ticket> ticketQueue){
        while(ticketQueue.peek() != null){
            System.out.println(ticketQueue.poll());
        }
    }
}