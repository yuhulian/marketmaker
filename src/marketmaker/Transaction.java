/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketmaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.filters.OrFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableHeader;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;


/**
 *
 * @author simon
 */
public class Transaction {
    private Boolean flag = true;
    private String buyOrderStatus;
    private String sellOrderStatus;
    private double initBuyAmount = 1;   //��ʼ��������
    private double initBuyPrice = 143;  //��ʼ�������۸�
    private double initSellAmount = 1;  //��ʼ����������
    private double initSellPrice = 145; //��ʼ�������۸�
    private String symbol_ltc = "ltc_cny";
    private int symbol_btcentrust = 0;
    private int symbol_ltcentrust = 1;
    
    private String entrustStatus;
  //  enum entrustStatus{
    //    -1,0,1,2;
    private String responseCookie;

    public void init() throws IOException{
        // �ȳ�ʼ��2������,һ���򵥣�һ������
        EntrustOrder eo = new EntrustOrder();
        eo.setBuyOrder(initBuyAmount, initBuyPrice);
        eo.setSellOrder(initSellAmount, initSellPrice);
        String entrustUrl = "https://www.okcoin.com/entrust.do?symbol=1&status=-10000&currentPage=1";
        
        try {
            Parser myParser = new Parser(entrustUrl);
            //NodeFilter tableFilter = new NodeClassFilter(TableTag.class);
            //AndFilter filter = null;
	    NodeList nodeList = null;
            NodeFilter filter = new NodeClassFilter(TableTag.class);
            //filter = new AndFilter(new TagNameFilter("tr"),
			//		new HasAttributeFilter("class", "red"));
            nodeList = myParser.extractAllNodesThatMatch(filter);
            System.out.println(nodeList.size());
            //OrFilter lastFilter = new OrFilter();
            //lastFilter.setPredicates(new NodeFilter[] { tableFilter });
            //NodeList nodeList = null; 
            //nodeList =myParser.parse(lastFilter); 
            for (int i = 0; i <=nodeList.size(); i++) {
                //
                if (nodeList.elementAt(i)instanceof TableTag) {
                    TableTag tag = (TableTag)nodeList.elementAt(i);
                    TableRow[] rows = tag.getRows();
                    for (int j = 0; j < rows.length; ++j) {
                        //
                        TableRow row = (TableRow) rows[j];
                        TableHeader[] headers = row.getHeaders();
                        for (int k = 0; k < headers.length; ++k) {
                            //
                            System.out.println("tag��ǩΪ��" + headers[k].getTagName());
                            System.out.println("��ǩ������Ϊ��" + headers[k].getStringText());
                        }
                        
                        TableColumn[] columns = row.getColumns();
                        for (int k = 0; k < columns.length; ++k) {
                            //
                            String info = columns[k].toPlainTextString().trim();
                            System.out.println(info); 
                        }
                    }
                }
            }
            /*HttpURLConnection connection1 = (HttpURLConnection) orderurl.openConnection();
            connection1.setRequestProperty("Cookie", responseCookie);//���������͵�¼���cookie
            BufferedReader br1 = new BufferedReader(new InputStreamReader(connection1.getInputStream()));

            String line1= br1.readLine();

            while (line1 != null) {

            System.out.println(new String(line1.getBytes()));

            line1 = br1.readLine();

            }
            } catch (MalformedURLException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
            }
            //��ʼ����ѭ���������Զ�����״̬
            while(flag){
            //��ȡ��ǰί����Ϣ
            ArrayList al = eo.getOrder();
            for(int i=0;i<2;i++){
            //��ȡ�������������
            System.out.println(al.get(i));
            }
            //�����Զ�����ģʽ,����״̬��4�֣�
            // ��ȫ�ɽ�:entrustStatus2763198
            // ���ֳɽ�:
            // δ�ɽ�:entrustStatus10290385
            // �ѳ����� entrustStatus2768895
            switch(entrustStatus){
            case "succeeded":
            //�򵥳ɹ���֤���۸��µ�����ȡ��ԭ���������򵥺�������������
            eo.cancelOrder();//ȡ��δ�ɽ��Ķ�����������
            break;
            case "":
            //�����ɹ���֤���۸����ǣ���ȡ��ԭ�����򵥣��򵥺�������������
            eo.cancelOrder();//ȡ��δ�ɽ��Ķ���������
            break;
            default:System.out.println("waiting...");
            }
            }*/
        } catch (ParserException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

