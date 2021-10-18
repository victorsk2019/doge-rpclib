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
        this.props_ = props;    
    }
    
    public String getRPCResponse(String method)
    {
        RPCConnect conn = new RPCConnect();
        String response = conn.getResponse(this.props_, method);
        return response;
    }
    
}
