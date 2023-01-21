public class SmokeSmsAdapter implements Sms {
    private SmokeSms adaptee;

    public SmokeSmsAdapter(SmokeSms smokesms){
        this.adaptee = smokesms;
    }

    @Override
    public void sendMessage(String s){//adapts the message recieved form the client
        System.out.println("SMS from SMOKE ADAPTER: ");
        this.adaptee.sendMessage(s);

    }
}
