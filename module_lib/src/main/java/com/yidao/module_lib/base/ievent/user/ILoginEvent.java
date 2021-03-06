package com.yidao.module_lib.base.ievent.user;

import com.yidao.module_lib.base.ibase.IBaseEvent;

/**
 * Created with XIAOYUDEXIEE.
 * Date: 2019/8/7
 */
public interface ILoginEvent extends IBaseEvent {

    void login(int type);

    void loginSuccess();

    void loginFail(String msg);
}
