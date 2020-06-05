package com.zhao.guyu.model.bank;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankCode {
    private Long id;
    private String bankName;//银行名称
    private String bankCode;//银行简称
    private String bankNo;
    private String bankType;

}
