/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketmaker;

import java.net.URL;
import java.util.HashMap;

/**
 *
 * @author simon
 */
public class Market {
    //�г���Ϣȡ������Ϣ
    private HashMap buy;
    private HashMap sell;
    
    public void getMinSellOrder(){
        //��ȡ�г���С������������������Ϣ
        this.buy = buy;
    }
    
    public void getMaxBuyOrder(){
        //��ȡ�г�����򵥣������򵥣���Ϣ
    }
    
    public void getMarketDepth(URL url){
        //��ȡ�г���Ϣ
    }
}
