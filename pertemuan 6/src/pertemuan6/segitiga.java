/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ANONYMOUS
 */
public class segitiga {
    private int lebar;
    public segitiga(int lebar){
        this.lebar=lebar;
    }
    
public String gambarsegitiga(){
String r="";
for (int i = 1;i<=lebar;i++){
for(int j =1;j<=i;j++)
r = r+"[]";
r = r+"\n";
                }
        return r;
}
}

