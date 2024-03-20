
import java.time.Instant;

public record Ticket(int ticketNum, Instant timestamp){
    public Ticket{
        if(ticketNum < 0){
            throw new IllegalArgumentException("Invalid ticket number, please enter a number > 0: ");
        }
    }

    @Override
    public String toString(){
        return "Ticket #" + ticketNum + " issued at " + timestamp;
    }
}