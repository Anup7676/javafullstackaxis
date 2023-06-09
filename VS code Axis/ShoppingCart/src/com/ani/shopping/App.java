package com.ani.shopping;

import com.ani.shopping.cart.CartController;
import com.ani.shopping.cart.CartMenu;
import com.ani.shopping.input.CartDataInput;
import com.ani.shopping.item.ItemController;
import com.ani.shopping.item.ItemDb;
import com.ani.shopping.user.UserController;
import com.ani.shopping.user.UserMenu;

public class App {

	public static void main(String[] args) {
		

        ItemDb.addItem(1, "pen", 10);
        ItemDb.addItem(2, "eraser", 5);
        ItemDb.addItem(3, "Fevicol", 10);
        ItemDb.addItem(4, "sharpner", 5);
        ItemDb.addItem(5, "ruler", 30);
        ItemDb.addItem(6, "notebook", 120);
        ItemDb.addItem(7, "Shoes", 800);
        ItemDb.addItem(8, "Belt", 300);
        ItemDb.addItem(9, "Tiffinbox", 150);
        ItemDb.addItem(10, "Sketches", 450);

        CartDataInput ip = new CartDataInput();

        UserController userController = new UserController();
        CartController cartController = new CartController();
        ItemController itemController = new ItemController();

        CartMenu cartMenu = new CartMenu(ip, cartController, itemController);
        UserMenu menu = new UserMenu(ip, userController, cartController, itemController, cartMenu);

        menu.performAction();
    }
	
}
