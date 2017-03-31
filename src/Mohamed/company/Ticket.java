package Mohamed.company;

import java.util.Date;

/**
 * Created by tq1499vg on 3/29/2017.
 */
public class Ticket  {

    protected int priority;
    protected String reporter; //Stores person or department who reported issue
    protected String description;
    protected Date dateReported;

    //TODO Problem 1: explain the role of ticketIdCounter and ticketID

    //STATIC Counter - one variable, shared by all Ticket objects.
    //If any Ticket object modifies this counter, all Ticket objects will have the modified value
    //Make it private - only Ticket objects should have access
    private static int ticketIdCounter = 1;

    //The ID for each ticket - an instance variable. Each Ticket will have it's own ticketID variable
    protected int ticketID;

    // TODO problem 6: tickets need to store the resolution date and a string describing the resolution
    // Either add them to this class or create another class called ResolvedTicket - which
    // do you think is the better approach?

    public Ticket(String desc, int p, String rep, Date date) {
        this.description = desc;
        this.priority = p;
        this.reporter = rep;
        this.dateReported = date;
        this.ticketID = ticketIdCounter;
        ticketIdCounter++;
    }

    protected int getPriority() {
        return priority;
    }

    protected int getTicketID() {
        return ticketID;
    }
    protected String getDescription(){return description;}
    protected String getReporter(){return reporter;}

    public String toString(){
        return("ID: " + this.ticketID + " Issue: " + this.description + " Priority: " + 					this.priority + " Reported by: "
                + this.reporter + " Reported on: " + this.dateReported);
    }
}
