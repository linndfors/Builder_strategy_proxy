package org.example.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public void sendmail(MailInfo mailinfo) throws MailjetSocketTimeoutException, MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("efe9d7258ee8b18fd180fa1f35b95e6c", "d21f78060076a71e4b0657f85f09da5c", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "olha.nahurna@ucu.edu.ua")
                                        .put("Name", "neOlha"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "olha.nahurna@ucu.edu.ua")
                                                .put("Name", "Olha")))
                                .put(Emailv31.Message.SUBJECT, "Greetings.")
                                .put(Emailv31.Message.TEXTPART, "Email for you")
                                .put(Emailv31.Message.HTMLPART, mailinfo.generate())
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
