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

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class sos {
    public static void main(String[] args) {
        //project wip camp java
        int item = 10; //จำนวนไอเท็มที่มีอยู่ในโกดัง
        int limit = 10; //จำนวนมากที่สุดที่จะเก็บได้ในโกดัง
        
        System.out.println("item: "+ item + ", limit: " + limit);
//        System.out.printf("item: %d, limit: %d\n", item, limit);

        Scanner input = new Scanner(System.in);

//        int menu = -1;
//        do {
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Check");
            System.out.print("Input Number : ");
            int menu = input.nextInt();
            
//            if (menu == 0) {
//                break;
//            }

            if (menu == 1) {
                System.out.println("Menu -> Add");
               if (item < limit) {
                    System.out.println("Please input amount to add");
                    System.out.print("Input Number : ");
                    int amount = input.nextInt();
                    if (item + amount > limit) {
                        System.out.println("ไอเทมเกินลิมิต!!");
                    } else {
                        item = item + amount;
                        //item1 += amount;gvhv hgcgcugug
                        System.out.printf("item: %d limit: %d\n", item, limit);
                        //System.out.println("item: "+ item + ", limit: " + limit);
                    }
               } else {
                    System.out.println("ไอเทมในโกดังเต็มแล้ว!!");
              }
            } else if (menu == 2) {
                System.out.println("Menu -> Remove");
                if (item > 0) {
                    System.out.println("Please input amount to remove");
                    System.out.print("Input Number : ");
                    int amount = input.nextInt();
                    if (item - amount < 0) {
                        System.out.println("This item is not enough to remove!!");
                    } else {
                        item = item - amount;
                        //item1 -= amount;
                        System.out.printf("item: %d, limit: %d\n", item, limit);
                        //System.out.println("item: "+ item + ", limit: " + limit);
                    }
                } else {
                    System.out.println("ไม่มีไอเทมในโกดัง");
                }
            } else if (menu == 3) {
               // System.out.printf("item: %d, limit: %d\n", item, limit);
                System.out.println("item: "+ item + ", limit: " + limit);
            } else {
                System.out.println("menu not found!");
            
//            System.out.println("-------------------------------------");
//        } while (menu != 0);
    }
    }}

