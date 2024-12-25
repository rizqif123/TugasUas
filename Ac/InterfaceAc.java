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
public interface InterfaceAc {
    public static final int KONDISI_HIDUP_AC=1;
public static final int KONDISI_MATI_AC=0;
public static final int KONDISI_DINGIN_AC=1;
public static final int KONDISI_PANAS_AC=0;

public abstract void hidupkan();
public abstract void matikan();
public abstract void dinginkan();
public abstract void panaskan();
    
}
