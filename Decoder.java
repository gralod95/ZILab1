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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class Decoder {
    
    private static String line;
    private static boolean hnl = true;
    private static Scanner sc;
    private static String codeOfText = "";
    private static String Text = "";
    private static int nomOfText;
    private static Map<Character, Integer> base;
    private static Map<Character, Integer> baseOfOr;
    private static Map<Character, Character> baseAlf;
    private static Set<Character> nameOAO;
    private static Set<Character> nameOAN;
    private static String nameOfAnTxt = "none1.txt";
    private static String nameOfOutTxt = "non1.txt";
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
        base = new HashMap<Character, Integer>();
        baseAlf = new HashMap<Character, Character>();
        decoderT();
        //System.out.println(codeOfText);
        //System.out.println(nomOfText);
        /*Files.deleteIfExists(Paths.get(nameOfOutTxt));
        Files.createFile(Paths.get(nameOfOutTxt));
        try {
                Files.write(Paths.get(nameOfOutTxt), codeOfText.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
     }
     
     private static void decoderT() throws FileNotFoundException{
        Scanner sc = scInFl();
        while(sc.hasNextLine()){
        line = sc.nextLine();
        //System.out.println(line);
        analitic();
        }
        //System.out.println(codeOfText);
        priority();
        decoder();
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
                base.put('а', 0);
                base.put('б', 0);
                base.put('в', 0);
                base.put('г', 0);
                base.put('д', 0);
                base.put('е', 0);
                base.put('ё', 0);
                base.put('ж', 0);
                base.put('з', 0);
                base.put('и', 0);
                base.put('к', 0);
                base.put('л', 0);
                base.put('м', 0);
                base.put('н', 0);
                base.put('о', 0);
                base.put('п', 0);
                base.put('р', 0);
                base.put('с', 0);
                base.put('т', 0);
                base.put('ф', 0);
                base.put('ц', 0);
                base.put('ш', 0);
                base.put('щ', 0);
                base.put('ч', 0);
                base.put('э', 0);
                base.put('ю', 0);
                base.put('я', 0);
                base.put('ъ', 0);
                base.put('ь', 0);
                base.put('й', 0);
                base.put('ы', 0);
                base.put('у', 0);
                base.put('х', 0);
        for( char s: line.toCharArray()){
            switch(s){
                case 'А':case 'а':
                    baseUpdate('а');
                    System.out.println("А");
                    codeOfText = codeOfText+"а";
                    nomOfText++;
                    break;
                case 'Б':case 'б':
                    System.out.println("б");
                    codeOfText = codeOfText+"б";
                    baseUpdate('б');
                    nomOfText++;
                    break;
                case 'В':case 'в':
                    System.out.println("в");
                    codeOfText = codeOfText+"в";
                    baseUpdate('в');
                    nomOfText++;
                    break;
                case 'Г':case 'г':
                    System.out.println("г");
                    codeOfText = codeOfText+"г";
                    baseUpdate('г');
                    nomOfText++;
                    break;
                case 'Д':case 'д':
                    System.out.println("Д");
                    codeOfText = codeOfText+"д";
                    baseUpdate('д');
                    nomOfText++;
                    break;
                case 'Е':case 'е':
                    System.out.println("е");
                    codeOfText = codeOfText+"е";
                    baseUpdate('е');
                    nomOfText++;
                    break;
                case 'Ё':case 'ё':
                    System.out.println("ё");
                    codeOfText = codeOfText+"ё";
                    baseUpdate('ё');
                    nomOfText++;
                    break;
                case 'Ж':case 'ж':
                    System.out.println("ж");
                    codeOfText = codeOfText+"ж";
                    baseUpdate('ж');
                    nomOfText++;
                    break;
                case 'З':case 'з':
                    System.out.println("з");
                    codeOfText = codeOfText+"з";
                    baseUpdate('з');
                    nomOfText++;
                    break;
                case 'И':case 'и':
                    System.out.println("и");
                    codeOfText = codeOfText+"и";
                    baseUpdate('и');
                    nomOfText++;
                    break;
                case 'К':case 'к':
                    System.out.println("к");
                    codeOfText = codeOfText+"к";
                    baseUpdate('к');
                    nomOfText++;
                    break;
                case 'Л':case 'л':
                    System.out.println("л");
                    codeOfText = codeOfText+"л";
                    baseUpdate('л');
                    nomOfText++;
                    break;
                case 'М':case 'м':
                    System.out.println("м");
                    codeOfText = codeOfText+"м";
                    baseUpdate('м');
                    nomOfText++;
                    break;
                case 'Н':case 'н':
                    System.out.println("н");
                    codeOfText = codeOfText+"н";
                    baseUpdate('н');
                    nomOfText++;
                    break;
                case 'О':case 'о':
                    System.out.println("о");
                    codeOfText = codeOfText+"о";
                    baseUpdate('о');
                    nomOfText++;
                    break;
                case 'П':case 'п':
                    System.out.println("п");
                    codeOfText = codeOfText+"п";
                    baseUpdate('п');
                    nomOfText++;
                    break;
                case 'Р':case 'р':
                    System.out.println("р");
                    codeOfText = codeOfText+"р";
                    baseUpdate('р');
                    nomOfText++;
                    break;
                case 'С':case 'с':
                    System.out.println("с");
                    codeOfText = codeOfText+"с";
                    baseUpdate('с');
                    nomOfText++;
                    break;
                case 'Т':case 'т':
                    System.out.println("т");
                    codeOfText = codeOfText+"т";
                    baseUpdate('т');
                    nomOfText++;
                    break;
                case 'У':case 'у':
                    System.out.println("у");
                    codeOfText = codeOfText+"у";
                    baseUpdate('у');
                    nomOfText++;
                    break;
                case 'Ф':case 'ф':
                    System.out.println("ф");
                    codeOfText = codeOfText+"ф";
                    baseUpdate('ф');
                    nomOfText++;
                    break;
                case 'Х':case 'х':
                    System.out.println("х");
                    codeOfText = codeOfText+"х";
                    baseUpdate('х');
                    nomOfText++;
                    break;
                case 'Ц':case 'ц':
                    System.out.println("ц");
                    codeOfText = codeOfText+"ц";
                    baseUpdate('ц');
                    nomOfText++;
                    break;
                case 'Ч':case 'ч':
                    System.out.println("ч");
                    codeOfText = codeOfText+"ч";
                    baseUpdate('ч');
                    nomOfText++;
                    break;
                case 'Ш':case 'ш':
                    System.out.println("ш");
                    codeOfText = codeOfText+"ш";
                    baseUpdate('ш');
                    nomOfText++;
                    break;
                case 'Щ':case 'щ':
                    System.out.println("щ");
                    codeOfText = codeOfText+"щ";
                    baseUpdate('щ');
                    nomOfText++;
                    break;
                case 'Ы':case 'ы':
                    System.out.println("ы");
                    codeOfText = codeOfText+"ы";
                    baseUpdate('ы');
                    nomOfText++;
                    break;
                case 'Э':case 'э':
                    System.out.println("э");
                    codeOfText = codeOfText+"э";
                    baseUpdate('э');
                    nomOfText++;
                    break;
                case 'Ю':case 'ю':
                    System.out.println("ю");
                    codeOfText = codeOfText+"ю";
                    baseUpdate('ю');
                    nomOfText++;
                    break;
                case 'Я':case 'я':
                    System.out.println("я");
                    codeOfText = codeOfText+"я";
                    baseUpdate('я');
                    nomOfText++;
                    break;
                case 'Ь':case 'ь':
                    System.out.println("ь");
                    codeOfText = codeOfText+"ь";
                    baseUpdate('ь');
                    nomOfText++;
                    break;
                case 'Ъ':case 'ъ':
                    System.out.println("ъ");
                    codeOfText = codeOfText+"ъ";
                    baseUpdate('ъ');
                    nomOfText++;
                    break;
                case 'Й':case 'й':
                    System.out.println("й");
                    codeOfText = codeOfText+"й";
                    baseUpdate('й');
                    nomOfText++;
                    break;
            }
        }
    }
    
    private static void baseUpdate(char symbol){
            int val = base.get(symbol);
            val = val+1;
            System.out.println(val);
            base.put(symbol, val);
    }
    
    private static void priority(){
        setBases();
        System.out.println(base);
        System.out.println(baseOfOr);
        getPriority();
    }
    
    private static void getPriority(){
        nameOAO = new HashSet<Character>();
        nameOAN = new HashSet<Character>();
        Collection<Integer> newStat;
        newStat = base.values();
        char oldKey;
        char newKey;
        
        for( int newSt: newStat){
            oldKey = getOldKey(newSt);
            newKey = FindKeyOfNewBase(newSt);
            nameOAO.add(oldKey);
            nameOAN.add(newKey);
            baseAlf.put(newKey, oldKey);
        }
        System.out.println(baseAlf);
    }
    
    private static char getOldKey( int newSt){
        //System.out.println("enter to getOldKey");
        char oldKey;
        Collection<Integer> oldStat;
        oldStat = baseOfOr.values();
        int St = 0;
        
        for(int i = 0; i<1000 ; i++ ){
            St = newSt - i;
            //System.out.println("find sovp"+St+", -");
            for(int oldSt: oldStat){
                if(St == oldSt){
                    oldKey = FindKeyOfOldBase(St);
                    if(!nameOAO.contains(oldKey)){
                        //System.out.println("result"+oldKey+", "+St);
                        return oldKey;
                    }
                }
            }
            St = newSt + i;
            //System.out.println("find sovp"+St+", +");
            for(int oldSt: oldStat){
                if(St == oldSt){
                    oldKey = FindKeyOfOldBase(St);
                    if(!nameOAO.contains(oldKey)){
                        //System.out.println("result "+oldKey+", "+St);
                        return oldKey;
                    }
                }
            }
        }
        
        return 'p';
    }
    
    private static char FindKeyOfOldBase( int value){
        //System.out.println("enter to FindKeyOfOldBase");
        Set<Character> oldKeys;
        oldKeys = baseOfOr.keySet();
        
        for(char oldK: oldKeys){
            if(baseOfOr.get(oldK) == value){
                return oldK;
            }
        }
        return'/';
    }
    
    private static char FindKeyOfNewBase( int value){
        //System.out.println("enter to FindKeyOfNewBase");
         Set<Character> newKeys;
        newKeys = base.keySet();
        
        for(char newK: newKeys){
            if(base.get(newK) == value){
                if(!nameOAN.contains(newK)){
                    return newK;
                }
            }
        }
        return'/';
    }
    
    private static void setBases(){
        base.put('а', base.get('а')*10000/nomOfText);
        base.put('б', base.get('б')*10000/nomOfText);
        base.put('в', base.get('в')*10000/nomOfText);
        base.put('г', base.get('г')*10000/nomOfText);
        base.put('д', base.get('д')*10000/nomOfText);
        base.put('е', base.get('е')*10000/nomOfText);
        base.put('ё', base.get('ё')*10000/nomOfText);
        base.put('ж', base.get('ж')*10000/nomOfText);
        base.put('з', base.get('з')*10000/nomOfText);
        base.put('и', base.get('и')*10000/nomOfText);
        base.put('к', base.get('к')*10000/nomOfText);
        base.put('л', base.get('л')*10000/nomOfText);
        base.put('м', base.get('м')*10000/nomOfText);
        base.put('н', base.get('н')*10000/nomOfText);
        base.put('о', base.get('о')*10000/nomOfText);
        base.put('п', base.get('п')*10000/nomOfText);
        base.put('р', base.get('р')*10000/nomOfText);
        base.put('с', base.get('с')*10000/nomOfText);
        base.put('т', base.get('т')*10000/nomOfText);
        base.put('у', base.get('у')*10000/nomOfText);
        base.put('ф', base.get('ф')*10000/nomOfText);
        base.put('х', base.get('х')*10000/nomOfText);
        base.put('ц', base.get('ц')*10000/nomOfText);
        base.put('ч', base.get('ч')*10000/nomOfText);
        base.put('ш', base.get('ш')*10000/nomOfText);
        base.put('щ', base.get('щ')*10000/nomOfText);
        base.put('ь', base.get('ь')*10000/nomOfText);
        base.put('ъ', base.get('ъ')*10000/nomOfText);
        base.put('э', base.get('э')*10000/nomOfText);
        base.put('ю', base.get('ю')*10000/nomOfText);
        base.put('я', base.get('я')*10000/nomOfText);
        base.put('й', base.get('й')*10000/nomOfText);
        base.put('ы', base.get('ы')*10000/nomOfText);
        baseOfOr = new HashMap<Character, Integer>();
        baseOfOr.put('а', 45172*10000/538566);
        baseOfOr.put('б', 9302*10000/538566);
        baseOfOr.put('в', 24790*10000/538566);
        baseOfOr.put('г', 11168*10000/538566);
        baseOfOr.put('д', 16380*10000/538566);
        baseOfOr.put('е', 42469*10000/538566);
        baseOfOr.put('ё', 431*10000/538566);
        baseOfOr.put('ж', 5456*10000/538566);
        baseOfOr.put('з', 9592*10000/538566);
        baseOfOr.put('и', 35785*10000/538566);
        baseOfOr.put('к', 19314*10000/538566);
        baseOfOr.put('л', 27258*10000/538566);
        baseOfOr.put('м', 15918*10000/538566);
        baseOfOr.put('н', 35095*10000/538566);
        baseOfOr.put('о', 61225*10000/538566);
        baseOfOr.put('п', 13837*10000/538566);
        baseOfOr.put('р', 24543*10000/538566);
        baseOfOr.put('с', 28100*10000/538566);
        baseOfOr.put('т', 30585*10000/538566);
        baseOfOr.put('у', 15443*10000/538566);
        baseOfOr.put('ф', 1206*10000/538566);
        baseOfOr.put('х', 4595*10000/538566);
        baseOfOr.put('ч', 7338*10000/538566);
        baseOfOr.put('ш', 5087*10000/538566);
        baseOfOr.put('щ', 1511*10000/538566);
        baseOfOr.put('ц', 2179*10000/538566);
        baseOfOr.put('э', 1628*10000/538566);
        baseOfOr.put('ъ', 283*10000/538566);
        baseOfOr.put('ь', 10490*10000/538566);
        baseOfOr.put('ы', 10223*10000/538566);
        baseOfOr.put('ю', 3494*10000/538566);
        baseOfOr.put('я', 12468*10000/538566);
        baseOfOr.put('й', 6201*10000/538566);
    }
    
    private static void decoder(){
        //System.out.println(baseAlf);
        for( char s: codeOfText.toCharArray()){
            if(! (s == ' ')){
                //System.out.println(s);
                //System.out.println(baseAlf.get(s));
                Text = Text+(baseAlf.get(s));
            }
        }
        System.out.println(Text);
    }
       
}
