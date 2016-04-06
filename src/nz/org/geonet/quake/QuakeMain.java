package nz.org.geonet.quake;

import java.io.FileInputStream;

/**
 * Created by baishan on 5/04/16.
 */
public class QuakeMain {
    public static final String PB_FILE = "etc/2015p768477.pb";
    // Iterates though all people in the AddressBook and prints info about them.
    static void Print(QuakeData.Quake quake) {

        System.out.println(quake.toString());

    }

    // Main function:  Reads the entire address book from a file and prints all
    //   the information inside.
    public static void main(String[] args) throws Exception {

        // Read the existing address book.
        QuakeData.Quake quake =
                QuakeData.Quake.parseFrom(new FileInputStream(PB_FILE));

        Print(quake);
    }
}
