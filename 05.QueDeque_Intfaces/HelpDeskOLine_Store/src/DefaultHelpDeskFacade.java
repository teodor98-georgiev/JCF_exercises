import java.util.*;

public class DefaultHelpDeskFacade implements HelpDeskFacade{
    int NumberOfTickets;
    int numbGenerator = 0;
    Queue<DefaultSupportTicket> tickets;

    public DefaultHelpDeskFacade(){
        this.tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
    }

    @Override
    public SupportTicket getNextSupportTicket() {
        if (tickets.isEmpty()) {
            throw new NoSuchElementException("No support tickets available.");
        }
        this.NumberOfTickets = tickets.size() - 1;
        return tickets.poll(); // Retrieve and remove the highest-priority ticket


    }

    @Override
    public int getNumberOfTickets() {
        return tickets.size();
    }

    public void addNewSupportTicket(SupportTicket supportTicket){
        numbGenerator++;
        ((DefaultSupportTicket) supportTicket).stickSeqNumber(numbGenerator);
        tickets.add((DefaultSupportTicket) supportTicket);
    }
}
