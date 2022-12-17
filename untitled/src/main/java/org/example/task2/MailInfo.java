package org.example.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailcode;
    public String generate() {
        return mailcode.generate(client);
    }
}
