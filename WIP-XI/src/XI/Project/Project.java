/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

/**
 *
 * @author wipcamp11
 */
import java.util.Scanner;
public class Project {
    
    public static void main(String[] args) {
        int item = 7;
       int limit =10;
        System.out.println("โกดังสินค้าของเปดดีล");
        System.out.println("เลือกเมนูได้เลยจ้าใส่เลขมา 1,2,3");
        System.out.println("เมนูที่1คือเพิ่มของ");
        System.out.println("เมนูที่2คือลบของ");
        System.out.println("เมนูที่3คือเช็คของไง");
        Scanner input =new Scanner(System.in);
        int menu = input.nextInt();//รับเมนู
        if(menu==1){
            System.out.println("ขณะนี้คุณอยู่ที่ฟังชั่นเพิ่มสินค้า");
            
            
            if(item>=limit){
                System.out.println("คุณเพิ่มไม่ได้แล้ว"); 
           }
            else{
                int amount = input.nextInt();//รับจํานวนของ
               if(amount+item>limit){
                   
               }
            }
        }
        
        
        
        
      
        
        
        
        //tip
        
        
    }
    
    
}
