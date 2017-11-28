package com.dubbo.demo.provider;

import com.dubbo.demo.service.BroadCastMsg;

/**
 * @author 魏霖涛
 * @since 2017/11/28 0028
 */
public class BroadCastMsgImpl implements BroadCastMsg {
    @Override
    public String sendMsg(String msg) {
        return "接收到的消息:"+msg;
    }
}
