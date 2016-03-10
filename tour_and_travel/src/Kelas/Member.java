/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author Ferawidya
 */
public class Member {
    private static int jmlMember = 0;
    private Customer[] mem = new Customer[jmlMember];
    public void AddMember (Customer c) {
        this.mem[jmlMember] = c;
        this.jmlMember++;
    }
}
