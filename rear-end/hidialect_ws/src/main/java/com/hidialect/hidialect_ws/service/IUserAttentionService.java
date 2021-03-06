package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.UserAttention;

import java.util.List;

public interface IUserAttentionService {
    void addAttention(UserAttention userAttention);
    void cancelAtten(Integer fanNo,Integer starNo);
    List<UserAttention> getUserAttentions(Integer fanNo);
    List<UserAttention> getUserFans(Integer starNo);
}
