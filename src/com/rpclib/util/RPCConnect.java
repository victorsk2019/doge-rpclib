package com.rpclib.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Victor Skovorodnikov
 */
public class RPCConnect 
{
    public RPCConnect()
    {}
    
    public String getResponse(RPCProperties props, String method)
    {
        String response = "";
        return response;
    }
    
    private String processRequest(RPCProperties props, String method)
    {
        try
        {
            URL cURL = new URL("http", props.getRPCIP(), props.getRPCPort(), "");
            HttpURLConnection conn = (HttpURLConnection)cURL.openConnection();
            
            
        }
        
        catch (MalformedURLException me)
        {
            me.printStackTrace();
        }
        
        catch (IOException ie)
        {
            
        }
        
        return "";
    }
}
