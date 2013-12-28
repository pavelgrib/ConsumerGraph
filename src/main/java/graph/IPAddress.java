package graph;

/**
 * Created by paul on 12/28/13.
 */
public class IPAddress {

    private int[] components;
    private String ip_address;

    public IPAddress(String address) {
        this.ip_address = address;
        this.components = new int[4];

        int counter = 0;
        for ( String i: this.ip_address.split(".") ) {
            components[counter] = new Integer(i);
            counter++;
        }
    }

    public int getComponent(int whichOne) {
        if ( whichOne < 1 || whichOne > 4 ) {
            return -1;
        } else {
            return components[whichOne + 1];
        }
    }

    public String getIp_address() { return this.ip_address; }
}
