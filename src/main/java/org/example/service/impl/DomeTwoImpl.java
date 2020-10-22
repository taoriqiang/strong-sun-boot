package org.example.service.impl;


import org.example.service.DomeTwoService;
import strong.sun.framework.annotation.Service;
import strong.sun.framework.annotation.Transactions;

/**
 * @author riqiang.tao
 * @date 10/10/2020 1:38 PM
 */

@Service
public class DomeTwoImpl implements DomeTwoService {

    @Transactions
    public void Dome2() {
        System.out.println("-----dome2");
    }
}
