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
    private double moneyFlow;       //�����ֽ���Ŀ
    private double moneyFreeze;     //�����ֽ���Ŀ
    private double bitcoinFlow;     //���ñ��ر���Ŀ
    private double bitcoinFreeze;   //����ı��ر���Ŀ
    private double litecoinFlow;    //�������ر���Ŀ
    private double litecoinFreeze;  //�������ر���Ŀ
    private double balanceSheet;    //������
    
    public double getMoneyFlow(){
        //��ȡ��ǰ���ý��
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
