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
    private Date entrustTime;       //委托时间
    private String entrustType;     //委托类型
    private double entrustAmount;   //委托数量
    private double entrustPrice;    //委托价格
    private double dealAmount;      //成交数量
    private double dealMoney;       //成交金额
    private double avgPrice;        //平均价格
    private double dealLeft;        //尚未成交
    private String entrustStatus;   //委单状态
    
    public ArrayList getOrder(){
        //获取最近两笔委托订单信息，包括最近的卖单和买单信息
        ArrayList eo = null;
        return eo;
    }
    
    public void setBuyOrder(double amount,double price){
        //设定买单
        this.entrustAmount = amount;
        this.entrustPrice = price;
        this.entrustType = "buy";
    }
    
    public void setSellOrder(double amount,double price){
        //设定买单
        this.entrustAmount = amount;
        this.entrustPrice = price;
        this.entrustType = "sell";
    }
    
    public void cancelOrder(){
        //取消委单
        this.entrustStatus = "cancelled";
    }
    
}
