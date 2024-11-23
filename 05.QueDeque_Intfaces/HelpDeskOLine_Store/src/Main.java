import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        HelpDeskFacade helpdesk = new DefaultHelpDeskFacade();

        helpdesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.CHANGE_ACCOUNT_DETAILS));
        helpdesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_BLOCKED));
        helpdesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
        helpdesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.CAN_NOT_COMPLETE_PURCHASE));
        helpdesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));


        helpdesk.getNextSupportTicket();
        helpdesk.getNextSupportTicket();
        helpdesk.getNextSupportTicket();
        helpdesk.getNextSupportTicket();
        helpdesk.getNumberOfTickets();
    }

}