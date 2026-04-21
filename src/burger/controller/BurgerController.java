package burger.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import burger.model.Burger;
import java.io.FileNotFoundException;

public class BurgerController {
    private static final String FILENAME = "burger.txt";
    private static final Path FILE_PATH = Paths.get(FILENAME);


    public static String genarateOrderId() throws IOException {
        if (!Files.exists(FILE_PATH)) {
            Files.createFile(FILE_PATH);
            return "B0001";
        }
        String lastLine = null;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line=br.readLine();
            
            while (line!=null) {
                lastLine=line;
                line=br.readLine();
            }
        }
        if (lastLine == null) {
            return "B0001";
        }
        int num = Integer.parseInt(lastLine.substring(1,5));
        return String.format("B%04d",++num);
    }

    
    public static boolean addNewBurger(Burger burger) throws IOException{
        FileWriter fw = new FileWriter("burger.txt",true);
        fw.write(burger.toString()+"\n");
        fw.close();
        return true;
    }
    
    public static Burger srarchBurger(String orderId) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line = br.readLine();
 while (line != null) {
                if (line.length() >= 5 && line.substring(1, 5).equalsIgnoreCase(orderId.substring(1))) {
                    break;
                }
                line = br.readLine();
            }
            if (line == null) {
                return null;
            } else {
                String[] rawData = line.split("-");
                
                Burger burger =new Burger(rawData[0],rawData[1],rawData[2],Integer.parseInt(rawData[3]),Integer.parseInt(rawData[4]));
                return burger;
            }
        }
    }
    
    public static Burger srarcCustomer(String orderId) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line = br.readLine();
            
            while (line != null) {
                if (line.length() >= 5 && line.substring(1, 5).equalsIgnoreCase(orderId.substring(1))) {
                    break;
                }
                line = br.readLine();
            }

            if (line == null) {
                return null;
            } else {
                String[] rawData = line.split("-");
                
                Burger burger =new Burger(rawData[0],rawData[1],rawData[2],Integer.parseInt(rawData[3]),Integer.parseInt(rawData[4]));
                return burger;
            }
        }
    }

    public static boolean updateOrderStatus(String orderId, int newStatus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int sizeOfText() throws FileNotFoundException, IOException{
        int i=0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line = br.readLine();
            while(line!=null){
                i++;
                line=br.readLine();        
            }
        }
        return i;
    }
    
    public static Burger[] toBurgerArray() throws FileNotFoundException, IOException{
        Burger[] temp=new Burger[0];
        String[] rawData=null;
        int i =0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line = br.readLine();
            while(line!=null){
                temp = extendsArray(temp); 
                rawData = line.split("-");
                
                if(rawData.length >= 5) {
                    temp[i]=new Burger(rawData[0],rawData[1],rawData[2],Integer.parseInt(rawData[3]),Integer.parseInt(rawData[4]));
                    i++;
                }
                line=br.readLine();
            }
        }
        return temp;
    }
        
    public static Burger[] extendsArray(Burger[] burger) {
        Burger[] tempBurgerArray=new Burger[burger.length+1];
        for (int i = 0; i < burger.length; i++) {
            tempBurgerArray[i]=burger[i];
        }
        return tempBurgerArray;
    }

    public static Burger[] cancledOrders() throws FileNotFoundException, IOException{
        Burger[] copyArray = toBurgerArray();
        Burger [] cancledArray = new Burger[0];
        int indexOfCAncledArray=0;
        for(int i=0;i<copyArray.length;i++){
            if (copyArray[i].getOrderStatus()==1){
                cancledArray = extendsArray(cancledArray);
                cancledArray[indexOfCAncledArray]=copyArray[i];
                indexOfCAncledArray++;
            }
        }
        return cancledArray;
    }
    
    public static Burger[] deleverdOrders() throws FileNotFoundException, IOException{
        Burger[] copyArray = toBurgerArray();
        Burger [] deleverdArray = new Burger[0];
        int indexOfDeleverdArray=0; 
        for(int i=0;i<copyArray.length;i++){
            if (copyArray[i].getOrderStatus()==2){ 
                deleverdArray = extendsArray(deleverdArray);
                deleverdArray[indexOfDeleverdArray]=copyArray[i];
                indexOfDeleverdArray++;
            }
        }
        return deleverdArray;
    }
        
    public static Burger[] searchCustomer(String name) throws IOException{
        Burger[] burgerArrayCopy=toBurgerArray();
        Burger[] customerArray=new Burger[0];
        int cArrayIndex=0;

        for (int i=0;i<burgerArrayCopy.length;i++){
            if(burgerArrayCopy[i].getCustomerId().equalsIgnoreCase(name)){
                customerArray = extendsArray(customerArray);
                customerArray[cArrayIndex]=burgerArrayCopy[i];

                cArrayIndex++;    
            }
        }
        return customerArray;
    }
    public static Burger[] prepairingOrders() throws FileNotFoundException, IOException{
        Burger[] copyArray = toBurgerArray();
        Burger [] prepairingArray = new Burger[0];
        int indexOfPrepairingArray=0; 
        for(int i=0;i<copyArray.length;i++){
            if (copyArray[i].getOrderStatus()==0){ 
                prepairingArray = extendsArray(prepairingArray);
                prepairingArray[indexOfPrepairingArray]=copyArray[i];
                indexOfPrepairingArray++;
            }
        }
        return prepairingArray;
    }
}