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
    //市场信息取买卖信息
    private HashMap buy;
    private HashMap sell;
    
    public void getMinSellOrder(){
        //获取市场最小卖单（最优卖单）信息
        this.buy = buy;
    }
    
    public void getMaxBuyOrder(){
        //获取市场最大买单（最优买单）信息
    }
    
    public void getMarketDepth(URL url){
        //获取市场信息
    }
}
