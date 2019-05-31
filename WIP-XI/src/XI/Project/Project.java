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

public class Project {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int item = 6;
        int limit = 10;
        int menu;
        System.out.println("1. Add\n" + "2. Remove\n" + "3. Check");
        System.out.print("input the number of menu : ");
        menu = ab.nextInt();
        if (menu == 1) {
            if (item < limit) {
                int amount;
                System.out.print("input amount to add : ");
                amount = ab.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("item : " + item + "\n" + "limit : " + limit);
                }
            } else {
                System.out.println("ไอเท็มเต็มแล้ว");

            }
        } else if (menu == 2) {
            if (item > 0) {
                int amount;
                System.out.print("input amount to remove : ");
                amount = ab.nextInt();
                if (item - amount < 0) {
                    System.out.println("ไอเท็มมีไม่เพียงพอให้ลบ");
                } else {
                    item = item - amount;
                    System.out.println("item : " + item + "\n" + "limit : " + limit);
                }
            } else {
                System.out.println("ไม่มีไอเท็มในโกดัง");

            }

        } else if (menu == 3) {
            System.out.println("item : " + item + "\n" + "limit : " + limit);
        } else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
