/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ac;

/**
 *
 * @author USER
 */
public class Ac implements InterfaceAc {
     int statusAC;
    int statussuhuAc;

    public void hidupkan() {
        if (statusAC == KONDISI_MATI_AC) {
            statusAC = KONDISI_HIDUP_AC;
            System.out.println("Hidupkan Ac --> Ac Hidup");
        } else {
            System.out.println("Hidupkan Ac --> Ac sudah Hidup");
        }
    }

    public void matikan() {
        if (statusAC == KONDISI_HIDUP_AC) {
            statusAC = KONDISI_MATI_AC;
            System.out.println("Matikan Ac --> Ac Mati");
        } else {
            System.out.println("Matikan Ac --> Ac sudah Mati");
        }
    }

    public void dinginkan() {
        if (statussuhuAc == KONDISI_PANAS_AC) {
            statussuhuAc = KONDISI_DINGIN_AC;
            System.out.println("Dinginkan Ac --> Ac didinginkan");
        } else {
            System.out.println("Dinginkan Ac --> Ac sudah didinginkan");
        }
    }

    public void panaskan() {
        if (statussuhuAc == KONDISI_DINGIN_AC) {
            statussuhuAc = KONDISI_PANAS_AC;
            System.out.println("Panaskan Ac --> Ac dipanaskan");
        } else {
            System.out.println("Panaskan Ac --> Ac sudah dipanaskan");
        }
    }
    
}
