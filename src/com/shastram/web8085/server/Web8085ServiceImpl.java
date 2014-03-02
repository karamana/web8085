package com.shastram.web8085.server;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.shastram.web8085.client.Web8085Service;

public class Web8085ServiceImpl extends RemoteServiceServlet implements
        Web8085Service {

    private static Logger logger = Logger.getLogger(Web8085Service.class.getName());

    private static final long serialVersionUID = 6343983694137057114L;

    @Override
    public List<String> getExampleNames() {
        List<String> list = Arrays.asList(TestInstructions.getTestNames());
        return list;
    }

    @Override
    public String getExampleSourceCode(String name) {
        // InputStream systemResourceAsStream =
        // ClassLoader.getSystemResourceAsStream(name);
        return "";
    }

    @Override
    public String saveToDrive(String src) {
        this.getThreadLocalRequest().getCookies();
        String scope = "&scope=https://www.googleapis.com/auth/drive "
                + "https://www.googleapis.com/auth/plus.login "
                + "https://www.googleapis.com/auth/plus.me "
                + "https://www.googleapis.com/auth/userinfo.email "
                + "https://www.googleapis.com/auth/userinfo.profile";
        String approval = "&approval_prompt=force&access_type=offline";
        String url = "https://accounts.google.com/o/oauth2/auth?"
                + "redirect_uri=http://127.0.0.1:8888/oauth2callback"
                + "&response_type=code"
                + "&client_id=1096071804926.apps.googleusercontent.com"
                + scope
                + approval;
        //return url;
        return "";
    }
}
