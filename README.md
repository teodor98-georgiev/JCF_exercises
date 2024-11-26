for 03 file:
Create comparator type for Product type that would sort by category name. In case categories are the same - products with the lower price should go first. In case price is the same - sort product by product names.
To implement this task, please, use the following:
- Product Interface - https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/Product.java
- Product implementation - https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/impl/DefaultProduct.java
- Next product list

new ArrayList<>(Arrays.asList(

new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),

new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 109.99),

new DefaultProduct(3, "Oregon Cottage Horizontal Interior White Oak Door", "Doors", 189.99),

new DefaultProduct(4, "4 Panel Oak Deco Interior Door", "Doors", 209.09),

new DefaultProduct(5, "Worcester 2000 30kW Ng Combi Boiler Includes Free Comfort+ II controller", "Boilers", 989.99),

new DefaultProduct(6, "Glow-worm Betacom 4 30kW Combi Gas Boiler ERP", "Boilers", 787.99),

new DefaultProduct(7, "Worcester 2000 25kW Ng Combi Boiler with Free Comfort+ II controller", "Boilers", 859.99),

new DefaultProduct(8, "Wienerberger Terca Class B Engineering Brick Red 215mm x 102.5mm x 65mm (Pack of 504)", "Bricks", 402.99),

new DefaultProduct(9, "Wienerberger Terca Engineering Brick Blue Perforated Class B 65mm (Pack of 400)", "Bricks", 659.99),

new DefaultProduct(10, "Wienerberger Engineering Brick Red Smooth Class B 73mm - Pack of 368", "Bricks", 523.99)

));


Tech note: Comparator should be implemented in the separate file, in the separate class with the name CustomProductComparator.



for 05 file:   NOTE: the explanation of method is referred to the method under the explanation
Implement back-end for Help Desk.
///
Create a back end system for a helpdesk facade of a on line store.
characteristics: the tickets on the desk (expressed by a defaultSupportTicket class) have a request type enumeration and a priority enum and a sequencial number as well, your goal is to accept this tickets and reorganize them in the following way:
Tickets with the higher priority goes first
In case two tickets have the same priority - the one that was created earlier should be returned.
/////
Create the next interface:

public interface HelpDeskFacade {

void addNewSupportTicket(SupportTicket supportTicket);

SupportTicket getNextSupportTicket();

	/**
 * @return amount of tickets that are not processed
 */
int getNumberOfTickets();

}


Create DefaultHelpDeskFacade that implements HelpDeskFacade.
Create SupportTicket interface:

public interface SupportTicket {

Priority getPriority();

/**
 * This method returns the unique sequential number of the support ticket.
 * This number can be used as an identifier. 
 * Order is started from 1.
 * The less the return number is - that support ticket was created earlier.
 * 
 * @return unique sequence number
 */
int getSequentialNumber();
	
RequestType getRequestType();
	
}



Create DefaultSupportTicket and implement SupportTicket interface.

getNextSupportTicket() method should return ticket and remove it from the HelpDesk in the next order:

Tickets with the higher priority goes first
In case two tickets have the same priority - the one that was created earlier should be returned.
Here is the mapping of request type and priority. Using this folder implement RequestType enum and Priority enum

Request Type Enum
                                Priority Enum
OTHER                                 LOW
                                  
CHANGE_ACCOUNT_DETAILS                LOW

CAN_NOT_LOGIN                         MEDIUM

ACCOUNT_IS_BLOCKED                    MEDIUM

COOPERATION                           MEDIUM

ACCOUNT_IS_HACKED                     HIGH

CAN_NOT_COMPLETE_PURCHASE             HIGH

ORDER_IS_NOT_RECEIVED                 HIGH



Commit with changes to check only files that were changed (solution) - https://github.com/AndriiPiatakha/learnit_java_core/commit/9134c3ba126a753e6d79b82d547b391419c48c30 the solution is an uncomprehensible porridge...
