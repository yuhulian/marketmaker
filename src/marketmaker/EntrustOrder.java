/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketmaker;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author simon
 */
public class EntrustOrder {
    private Date entrustTime;       //ί��ʱ��
    private String entrustType;     //ί������
    private double entrustAmount;   //ί������
    private double entrustPrice;    //ί�м۸�
    private double dealAmount;      //�ɽ�����
    private double dealMoney;       //�ɽ����
    private double avgPrice;        //ƽ���۸�
    private double dealLeft;        //��δ�ɽ�
    private String entrustStatus;   //ί��״̬
    
    public ArrayList getOrder(){
        //��ȡ�������ί�ж�����Ϣ���������������������Ϣ
        ArrayList eo = null;
        return eo;
    }
    
    public void setBuyOrder(double amount,double price){
        //�趨��
        this.entrustAmount = amount;
        this.entrustPrice = price;
        this.entrustType = "buy";
    }
    
    public void setSellOrder(double amount,double price){
        //�趨��
        this.entrustAmount = amount;
        this.entrustPrice = price;
        this.entrustType = "sell";
    }
    
    public void cancelOrder(){
        //ȡ��ί��
        this.entrustStatus = "cancelled";
    }
    
}
