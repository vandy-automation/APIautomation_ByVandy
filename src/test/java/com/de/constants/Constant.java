package com.de.constants;

public class Constant {

    private String phpSessId;
    public static String baseUri="http://admin.newdiningedge.baitek.org:";
    public static String qaEnv=baseUri+"8100";
    public static String uatEnv=baseUri+"81";

    public String getPhpSessId() {
        return this.phpSessId;
    }

    public void setPhpSessId(String phpSessId) {
        this.phpSessId = phpSessId;

    }

}
