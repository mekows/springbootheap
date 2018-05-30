
import org.jdom2.JDOMException;
import java.io.IOException;
import org.json.JSONObject;
import org.json.XML;

/**
 * Created by 1250052380@qq.com on 2015/5/19.
 */
public class XmlUtil {

    public static void main(String[] args) throws JDOMException, IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?><MoBaoAccount MessageType=\"UserMobilePay\" PlatformID=\"b2ctest\"><OrderNo>M20150521084825</OrderNo><TradeAmt>5000.00</TradeAmt><Commission>0.5</Commission><UserID>zhuxiaolong</UserID><MerchID>zhuxiaolong1</MerchID><tradeType>0</tradeType><CustParam>123</CustParam> <NotifyUrl>http://mobaopay.com/callback.do</NotifyUrl><TradeSummary>订单</TradeSummary></MoBaoAccount>";
        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        System.out.println(xmlJSONObj.toString());
    }
}