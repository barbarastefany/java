package Fixacaoclasses.test;

import Fixacaoclasses.domain.LoadoutCS2;

public class LoadoutCS2Teste {
    public static void main(String[] args) {

        LoadoutCS2 weapon1 = new LoadoutCS2();
        LoadoutCS2 weapon2 = new LoadoutCS2();
        LoadoutCS2 weapon3 = new LoadoutCS2();
        LoadoutCS2 weapon4 = new LoadoutCS2();

        weapon1.name = "AK-47";
        weapon1.type = "Assault Rifle";
        weapon1.side = "TR";
        weapon1.cost = 2700;

        weapon2.name = "M4A1";
        weapon2.type = "Assault Rifle";
        weapon2.side = "CT";
        weapon2.cost = 3100;

        weapon3.name = "Five-Seven";
        weapon3.type = "Pistol";
        weapon3.side = "CT";
        weapon3.cost = 650;

        weapon4.name = "Tec-9";
        weapon4.type = "Pistol";
        weapon4.side = "TR";
        weapon4.cost = 600;

        System.out.println("\nWeapon: "+weapon1.name+"\nType: "+weapon1.type+"\nSide: "+weapon1.side+"\nCost: "+weapon1.cost);
        System.out.println("\nWeapon: "+weapon2.name+"\nType: "+weapon2.type+"\nSide: "+weapon2.side+"\nCost: "+weapon2.cost);
        System.out.println("\nWeapon: "+weapon3.name+"\nType: "+weapon3.type+"\nSide: "+weapon3.side+"\nCost: "+weapon3.cost);
        System.out.println("\nWeapon: "+weapon4.name+"\nType: "+weapon4.type+"\nSide: "+weapon4.side+"\nCost: "+weapon4.cost);

    }
}
