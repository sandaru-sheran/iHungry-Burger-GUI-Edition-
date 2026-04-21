/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burger;

import burger.model.Burger;

class BurgerList{

    private Node first;
    
    public String genarateOrderId(int size){
        String oidtemp="";
        if (size < 10) {
                oidtemp = "B000" + (size+1);
            } else if (size < 100) {
                oidtemp = "B00" + (size+1);
            } else if (size < 1000) {
                oidtemp = "B0" + (size+1);
            }else if (size<10000){
                oidtemp="B"+(size+1);
            }
        return oidtemp;
    }
    
    
    
    
    public boolean add(int index, Burger burger){
        if(index>=0 && index<=size()){
            Node node=new Node(burger);
            if(index==0){
                node.next=first;
                first=node;
            }else{
                int count=0;
                Node temp=first;
                while(count<index-1){
                    temp=temp.next;
                    count++;
                }
                node.next=temp.next;
                temp.next=node;
            }
            return true;
        }
        return false;
    }
    public boolean addFirst(Burger burger){
        return add(0, burger);
    }
    public boolean addLast(Burger burger){
        return add(size(), burger);
    }
    public boolean add(Burger burger){
        return addLast(burger);
    }
    public boolean remove(int index){
        if(index>=0 && index<size()){
            if(index==0){
                first=first.next;
            }else{
                int count=0;
                Node temp=first;
                while(count<index-1){
                    count++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                return true;
            }
        }
        return false;
    }
    public boolean removeFirst(){
        return remove(0);
    }
    public boolean removeLast(){
        return remove(size()-1);
    }
    public int size(){
        int count=0;
        Node temp=first;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void printBurgers(){
        System.out.print("{");
        Node temp=first;
        while(temp!=null){
            Burger burger=temp.burger;
            System.out.print(burger.toString()+", ");
            temp=temp.next;
        }
        System.out.println(isEmpty() ? "empty}":"\b\b}");
    }
    public boolean isEmpty(){
        return first==null;   
        
        
    }
      class Node{
        private Burger burger;
        private Node next;
        public Node(Burger burger){
            this.burger=burger;
        }
    }    

}