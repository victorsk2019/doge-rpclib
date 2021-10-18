package com.rpclib.client;

import com.rpclib.util.RPCConnect;
import com.rpclib.util.RPCProperties;

/**
 *
 * @author Victor Skovorodnikov
 */
public class RPCClient 
{
    private RPCProperties props_;
    
    public RPCClient(RPCProperties props)
    {
        props_ = props;
    
    }
    
    public String getInfo()
    {
        RPCConnect conn = new RPCConnect();
        String response = conn.getResponse(props_, "getinfo");
        return response;
    }
    
}
