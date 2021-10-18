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
    
    public RPCProperties(String rpcuser, String rpcpassword, int rpcport, String rpcip)
    {
        this.rpcuser_ = rpcuser;
        this.rpcpassword_ = rpcpassword;
        this.rpcport_ = rpcport;
        this.rpcip_ = rpcip;
    }

    public String getRPCUser()
    {
        return this.rpcuser_;
    }
    
    public String getRPCPassword()
    {
        return this.rpcpassword_;
    }
    
    public int getRPCPort()
    {
        return this.rpcport_;
    }
    
    public String getRPCIP()
    {
        return this.rpcip_;
    }
}
