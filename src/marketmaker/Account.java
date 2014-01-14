/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marketmaker;

/**
 *
 * @author simon
 */
public class Account {
    private double moneyFlow;       //可用现金数目
    private double moneyFreeze;     //冻结现金数目
    private double bitcoinFlow;     //可用比特币数目
    private double bitcoinFreeze;   //冻结的比特币数目
    private double litecoinFlow;    //可用莱特币数目
    private double litecoinFreeze;  //冻结莱特币数目
    private double balanceSheet;    //账面金额
    
    public double getMoneyFlow(){
        //获取当前可用金额
        return this.moneyFlow;
    }
    
    public double getMoneyFreeze(){
        //
        return this.moneyFreeze;
    }
    
    public double getBitcoinFlow(){
        //
        return this.bitcoinFlow;
    }
    
    public double getBitcoinFreeze(){
        //
        return this.bitcoinFreeze;
    }
    
    public double getLitecoinFlow(){
        //
        return this.litecoinFlow;
    }
    
    public double getLiteCoinFreeze(){
        //
        return this.litecoinFreeze;
    }
    
    public double getBalanceSheet(){
        //
        return this.balanceSheet;
    }
    
}
