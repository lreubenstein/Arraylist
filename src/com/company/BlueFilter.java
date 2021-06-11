package com.company;
import java.util.ArrayList;

public class BlueFilter {

    public static void nixBlue(ArrayList<String> colors){
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals("blue")){
                colors.remove(i);
            }
        }
    }

    public static void main(String [] args){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add("blue");
        colors.add("purple");
        colors.add("green");

        for(int i = 0; i < colors.size(); i++){
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();

        nixBlue(colors);

        for(int i = 0; i < colors.size(); i++){
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
    }
}
