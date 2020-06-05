package com.zhao.guyu.thirdParty.service;

import com.zhao.guyu.commons.constant.UrlConstant;
import com.zhao.guyu.commons.utlis.OkHttpUtil;
import com.zhao.guyu.model.bank.BankCode;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BankCodeThirdPartyServiceImpl implements BankCodeThirdPartyService {
    @Autowired
    OkHttpUtil okHttpUtil;
    @Override
    public List<BankCode> getAllBank() {
        Response response=okHttpUtil.getData(UrlConstant.BANK_LIST_URL);
        return null;
    }
}
