/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        int age = 18;
        String name = "Wippo";
        double money = 1100.11;
        
        boolean online = true;
        String status;
        
        System.out.println("Hi! my name is " + name + " i'm " + age + " Y/O ");
        
        if(online == true){
            status = "Online";
        } else {
            status = "Offline";
        }
        Scanner sc =new Scanner(System.in);
        
        System.out.println("I'm currently " + status + " and have " + money + "THB. left.");
    }
}
