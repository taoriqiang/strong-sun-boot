package org.example.dome;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;

/**
 * @author riqiang.tao
 * @date 10/19/2020 2:28 PM
 */
public class Dome2 {

    public static void main(String[] args) throws IOException {

//        try {
//            throw new RuntimeException("990909090-------");
//        } catch (Exception e) {
//            e.getStackTrace();
//            StringWriter sw = new StringWriter();
//            try (PrintWriter pw = new PrintWriter(sw);) {
//                e.printStackTrace(pw);
//            }
//            String curentUCM = e.getMessage().substring(0, e.getMessage().indexOf("="));
//            String errorInfo = "CCAD ERROR ： " + "starttime:endtime1:" + e.getMessage() + "\r\n==========\r\n" + sw.toString();
//            String error = "Dear User：:\r\n"
//                    + "\r\n"
//                    + "以下Account在系统推送中没能成功同步下游系统，请确认后并重新推送。 \r\n"
//                    + "\r\n"
//                    + "Account UCMID:  " + curentUCM + "\r\n"
//                    + "\r\n"
//                    + "Regards，\r\n"
//                    + "CCAD Team\r\n";
//        }
//        String path = "http://io/yio.html?nam=89&yi=90";
//        path = path.substring(path.lastIndexOf("/") + 1, path.length());
//        System.out.println(path);
//        System.out.println(Dome2.class.getClassLoader().getResource(""));
        String resourcesUrl = "webapp" + File.separator;
        resourcesUrl = Dome2.class.getResource("/")+ resourcesUrl;
        resourcesUrl = resourcesUrl + "index.html";
        URL url = new URL(resourcesUrl);
//        System.out.println(url.openStream());
        File file = new File(url.getFile());
        if(file.exists()){
            System.out.println("---");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        System.out.println(IOUtils.toString(bufferedInputStream));
    }
}
