import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<DefaultSupportTicket> {
    public int compare(DefaultSupportTicket supTick1, DefaultSupportTicket supTick2){
        int comparisonByPriority = supTick2.getPriority().compareTo(supTick1.getPriority());
        if (comparisonByPriority != 0){
            return comparisonByPriority;
        }
        return Integer.compare(supTick1.getSequentialNumber(), supTick2.getSequentialNumber());
    }
}
