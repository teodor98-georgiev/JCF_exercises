import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.lang.Math;

public class DefaultSupportTicket implements SupportTicket{
    private Priority priority;
    private int SequentialNumber;
    private RequestType RequestType;

    public DefaultSupportTicket( RequestType RequestType){
        this.priority = trackReqType(RequestType);
    }
    // this unparametrized constructor serves as special cases catcher: for example if user gets out without specifing the request type, to ensure the
    // workfolw of system by default thanks to this constructor the ticket is generated anyway (situation also known as fallback situation)
    public DefaultSupportTicket() {
        this.RequestType = RequestType.OTHER; // Set default RequestType
        this.priority = Priority.LOW;        // Set default Priority for OTHER
        this.SequentialNumber = 0;           // Default sequential number if necessary
    }

    @Override
    public String toString() {
        return "current ticket" +
                "priority=" + priority +
                ", SequentialNumber=" + SequentialNumber +
                ", RequestType=" + RequestType +
                '}';
    }
    // to track request type I wrote for a better clearity the request type handling in both ways, i.e if and switch case operands...

    //    public Priority trackReqType(RequestType RequestType){
//        if ((RequestType.equals(RequestType.OTHER)) || RequestType.equals(RequestType.CHANGE_ACCOUNT_DETAILS)){
//            this.priority = Priority.LOW;
//            return this.priority;
//        }
//        else if (RequestType.equals(RequestType.CAN_NOT_LOGIN) || RequestType.equals(RequestType.ACCOUNT_IS_BLOCKED) ||
//                RequestType.equals(RequestType.COOPERATION)){
//            this.priority = Priority.MEDIUM;
//            return this.priority;
//        }
//        else if (RequestType.equals(RequestType.ACCOUNT_IS_HACKED) || RequestType.equals(RequestType.CAN_NOT_COMPLETE_PURCHASE) ||
//                RequestType.equals(RequestType.ORDER_IS_NOT_RECEIVED)) {
//            this.priority = Priority.HIGH;
//            return this.priority;
//        }
//        else {
//            throw new NoSuchElementException();
//        }
//    }


    public Priority trackReqType(RequestType RequestType){
        switch (RequestType) {
            case OTHER:
                this.RequestType = RequestType.OTHER;
                this.priority = Priority.LOW;
                return this.priority;
            case CHANGE_ACCOUNT_DETAILS:{
                this.RequestType = RequestType.CHANGE_ACCOUNT_DETAILS;
                this.priority = Priority.LOW;
                return this.priority;
            }

            case CAN_NOT_LOGIN:
                this.RequestType = RequestType.CAN_NOT_LOGIN;
                this.priority = Priority.MEDIUM;
                return this.priority;
            case ACCOUNT_IS_BLOCKED:
                this.RequestType = RequestType.ACCOUNT_IS_BLOCKED;
                this.priority = Priority.MEDIUM;
                return this.priority;
            case COOPERATION: {
                this.RequestType = RequestType.COOPERATION;
                this.priority = Priority.MEDIUM;
                return this.priority;
            }

            case ACCOUNT_IS_HACKED:
                this.RequestType = RequestType.ACCOUNT_IS_HACKED;
                this.priority = Priority.HIGH;
                return this.priority;
            case CAN_NOT_COMPLETE_PURCHASE:
                this.RequestType = RequestType.CAN_NOT_COMPLETE_PURCHASE;
                this.priority = Priority.HIGH;
                return this.priority;
            case ORDER_IS_NOT_RECEIVED  : {
                this.RequestType = RequestType.ORDER_IS_NOT_RECEIVED;
                this.priority = Priority.HIGH;
                return this.priority;
            }
            default:
                throw new NoSuchElementException();
        }

    }
    public void stickSeqNumber(int number){
        this.SequentialNumber = number;
    }
    @Override
    public Priority getPriority() {
        return this.priority;
    }

    @Override
    public int getSequentialNumber() {
        return SequentialNumber;
    }

    @Override
    public RequestType getRequestType() {
        return RequestType;
    }

}



