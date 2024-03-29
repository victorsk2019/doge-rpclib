package com.rpclib.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Victor Skovorodnikov
 */
public class RPCConnect 
{
    public RPCConnect()
    {}
    
    public String getResponse(RPCProperties props, String method, String param)
    {
        return processRequest(props, method, param);
    }
    
    private String processRequest(RPCProperties props, String method, String param)
    {
        String RPCResponse = "";
        
        try
        {
            URL cURL = new URL("http", props.getRPCIP(), props.getRPCPort(), "");
            String RQ = getJSONContent(method, param);
            HttpURLConnection conn = (HttpURLConnection)cURL.openConnection();
            
            String authParams = props.getRPCUser() + ":" + props.getRPCPassword();
            conn.setRequestProperty("Authorization", "Basic " + new String(Base64.getEncoder().encode(authParams.getBytes())));
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            
            OutputStream os = conn.getOutputStream();
            os.write(RQ.getBytes("UTF-8"), 0 , RQ.length());
            
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            
            while ((inputLine = in.readLine()) != null) 
            {
                RPCResponse += inputLine;
            }
            
            in.close();
            
            os.flush();
            os.close();
            conn.disconnect();
        }
        
        catch (MalformedURLException me)
        {
            me.printStackTrace();
        }
        
        catch (IOException ie)
        {
            ie.printStackTrace();
        }
        
        return RPCResponse;
    }
    
    private String getJSONContent(String method, String param)
    {
        return "{\"jsonrpc\":\"1.0\", \"id\":\"dogerpc\", \"method\": \"" + method + "\", \"params\": [" + param + "]}";
    }
}
