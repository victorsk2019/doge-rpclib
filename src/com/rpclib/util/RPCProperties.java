package com.rpclib.util;

/**
 *
 * @author Victor Skovorodnikov
 */

public class RPCProperties 
{
    private String rpcuser_ = "";
    private String rpcpassword_ = "";
    private int rpcport_ = 0;
    private String rpcip_ = "";
    
    RPCProperties(String rpcuser, String rpcpassword, int rpcport, String rpcip)
    {
        rpcuser_ = rpcuser;
        rpcpassword_ = rpcpassword;
        rpcport_ = rpcport;
        rpcip_ = rpcip;
    }

    public String getRPCUser()
    {
        return rpcuser_;
    }
    
    public String getRPCPassword()
    {
        return rpcpassword_;
    }
    
    public int getRPCPort()
    {
        return rpcport_;
    }
    
    public String getRPCIP()
    {
        return rpcip_;
    }
}
