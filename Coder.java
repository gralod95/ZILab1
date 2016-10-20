/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class Coder {
    
    private static String line;
    private static boolean hnl = true;
    private static Scanner sc;
    private static String codeOfText = "";
    private static int nomOfSimb;
    private static int nomOfText;
    private static Map<Character, Integer> base;
    private static String nameOfAnTxt = "noname.txt";
    private static String nameOfOutTxt = "none1.txt";
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        base = new HashMap<Character, Integer>();
        coderT();
        System.out.println(codeOfText);
        System.out.println(nomOfText);
        System.out.println(base);
        Files.deleteIfExists(Paths.get(nameOfOutTxt));
        Files.createFile(Paths.get(nameOfOutTxt));
        try {
                Files.write(Paths.get(nameOfOutTxt), codeOfText.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    private static void coderT() throws FileNotFoundException{
        Scanner sc = scInFl();
        while(sc.hasNextLine()){
        line = sc.nextLine();
        System.out.println(line);
        analitic();
        }
    }
    
    private static Scanner scInFl() throws FileNotFoundException{
        File inputFile = new File(nameOfAnTxt);
        if (!inputFile.exists()){
            System.out.println("Error");
        }
        Scanner sc = new Scanner(inputFile);
        return sc;
    }
    
    private static void analitic(){
        for( char s: line.toCharArray()){
            switch(s){
                case 'А':case 'а':
                    baseUpdate('а');
                    System.out.println("А - П");
                    codeOfText = codeOfText+"П";
                    changeNomOfS();
                    break;
                case 'Б':case 'б':
                    System.out.println("б - Е");
                    codeOfText = codeOfText+"Е";
                    changeNomOfS();
                    baseUpdate('б');
                    break;
                case 'В':case 'в':
                    System.out.println("в - Р");
                    codeOfText = codeOfText+"Р";
                    changeNomOfS();
                    baseUpdate('в');
                    break;
                case 'Г':case 'г':
                    System.out.println("г - В");
                    codeOfText = codeOfText+"В";
                    changeNomOfS();
                    baseUpdate('г');
                    break;
                case 'Д':case 'д':
                    System.out.println("Д - И");
                    codeOfText = codeOfText+"И";
                    changeNomOfS();
                    baseUpdate('д');
                    break;
                case 'Е':case 'е':
                    System.out.println("е - Ч");
                    codeOfText = codeOfText+"Ч";
                    changeNomOfS();
                    baseUpdate('е');
                    break;
                case 'Ё':case 'ё':
                    System.out.println("ё - Н");
                    codeOfText = codeOfText+"Н";
                    changeNomOfS();
                    baseUpdate('ё');
                    break;
                case 'Ж':case 'ж':
                    System.out.println("ж - Ы");
                    codeOfText = codeOfText+"Ы";
                    changeNomOfS();
                    baseUpdate('ж');
                    break;
                case 'З':case 'з':
                    System.out.println("з -й");
                    codeOfText = codeOfText+"Й";
                    changeNomOfS();
                    baseUpdate('з');
                    break;
                case 'И':case 'и':
                    System.out.println("и -Г");
                    codeOfText = codeOfText+"Г";
                    changeNomOfS();
                    baseUpdate('и');
                    break;
                case 'К':case 'к':
                    System.out.println("к - О");
                    codeOfText = codeOfText+"О";
                    changeNomOfS();
                    baseUpdate('к');
                    break;
                case 'Л':case 'л':
                    System.out.println("л - Т");
                    codeOfText = codeOfText+"Т";
                    changeNomOfS();
                    baseUpdate('л');
                    break;
                case 'М':case 'м':
                    System.out.println("м - З");
                    codeOfText = codeOfText+"З";
                    changeNomOfS();
                    baseUpdate('м');
                    break;
                case 'Н':case 'н':
                    System.out.println("н - Д");
                    codeOfText = codeOfText+"Д";
                    changeNomOfS();
                    baseUpdate('н');
                    break;
                case 'О':case 'о':
                    System.out.println("о - У");
                    codeOfText = codeOfText+"У";
                    changeNomOfS();
                    baseUpdate('о');
                    break;
                case 'П':case 'п':
                    System.out.println("п - С");
                    codeOfText = codeOfText+"С";
                    changeNomOfS();
                    baseUpdate('п');
                    break;
                case 'Р':case 'р':
                    System.out.println("р - А");
                    codeOfText = codeOfText+"А";
                    changeNomOfS();
                    baseUpdate('р');
                    break;
                case 'С':case 'с':
                    System.out.println("с - Б");
                    codeOfText = codeOfText+"Б";
                    changeNomOfS();
                    baseUpdate('с');
                    break;
                case 'Т':case 'т':
                    System.out.println("т - Ё");
                    codeOfText = codeOfText+"Ё";
                    changeNomOfS();
                    baseUpdate('т');
                    break;
                case 'У':case 'у':
                    System.out.println("у - Ж");
                    codeOfText = codeOfText+"Ж";
                    changeNomOfS();
                    baseUpdate('у');
                    break;
                case 'Ф':case 'ф':
                    System.out.println("ф - К");
                    codeOfText = codeOfText+"К";
                    changeNomOfS();
                    baseUpdate('ф');
                    break;
                case 'Х':case 'х':
                    System.out.println("х - Л");
                    codeOfText = codeOfText+"Л";
                    changeNomOfS();
                    baseUpdate('х');
                    break;
                case 'Ц':case 'ц':
                    System.out.println("ц - М");
                    codeOfText = codeOfText+"М";
                    changeNomOfS();
                    baseUpdate('ц');
                    break;
                case 'Ч':case 'ч':
                    System.out.println("ч - Ф");
                    codeOfText = codeOfText+"Ф";
                    changeNomOfS();
                    baseUpdate('ч');
                    break;
                case 'Ш':case 'ш':
                    System.out.println("ш - Х");
                    codeOfText = codeOfText+"Х";
                    changeNomOfS();
                    baseUpdate('ш');
                    break;
                case 'Щ':case 'щ':
                    System.out.println("щ -Ц");
                    codeOfText = codeOfText+"Ц";
                    changeNomOfS();
                    baseUpdate('щ');
                    break;
                case 'Ы':case 'ы':
                    System.out.println("ы - Ъ");
                    codeOfText = codeOfText+"Ъ";
                    changeNomOfS();
                    baseUpdate('ы');
                    break;
                case 'Э':case 'э':
                    System.out.println("э - Ш");
                    codeOfText = codeOfText+"Ш";
                    changeNomOfS();
                    baseUpdate('э');
                    break;
                case 'Ю':case 'ю':
                    System.out.println("ю - Щ");
                    codeOfText = codeOfText+"Щ";
                    changeNomOfS();
                    baseUpdate('ю');
                    break;
                case 'Я':case 'я':
                    System.out.println("я - Э");
                    codeOfText = codeOfText+"Э";
                    changeNomOfS();
                    baseUpdate('я');
                    break;
                case 'Ь':case 'ь':
                    System.out.println("ь - Ю");
                    codeOfText = codeOfText+"Ю";
                    changeNomOfS();
                    baseUpdate('ь');
                    break;
                case 'Ъ':case 'ъ':
                    System.out.println("ъ - Я");
                    codeOfText = codeOfText+"Я";
                    changeNomOfS();
                    baseUpdate('ъ');
                    break;
                case 'Й':case 'й':
                    System.out.println("й - Ь");
                    codeOfText = codeOfText+"Ь";
                    changeNomOfS();
                    baseUpdate('й');
                    break;
            }
        }
    }
    
    private static void changeNomOfS(){
        nomOfText++;
        nomOfSimb++;
        if(nomOfSimb == 5){
            nomOfSimb = 0;
            codeOfText = codeOfText+" ";
        }
    }
    
    private static void baseUpdate(char symbol){
        
            System.out.println("open");
        if(base.containsKey(symbol)){
            int val = base.get(symbol);
            val = val+1;
            System.out.println(val);
            base.put(symbol, val); 
        }else{
            System.out.println("open");
            int val = 1;
            base.put(symbol, val); 
        }
    }
    
    public static Map<Character, Integer> getBase(){
        return base;
    }
    
}
