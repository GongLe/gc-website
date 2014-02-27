package com.gc.core.web.account;

import com.gc.core.service.user.UserService;
import com.gc.core.web.CrudActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户管理Action.
 * 
 * 使用Struts2 convention-plugin annotation定义Action参数.
 * 演示带分页的管理界面.
 */
//定义URL映射对应/account/user.action
//@Namespace("/account")
//定义名为reload的result重定向到user.action, 其他result则按照convention默认.
@Results( { @Result(name = CrudActionSupport.RELOAD, location = "user.action", type = "redirect") })
public class UserAction extends CrudActionSupport<Object> {

	private static final long serialVersionUID = 8683878162525847072L;
    @Autowired
    private UserService userService;

    @Override
    public String list() throws Exception {
        userService.getAllUsers();
        logger.info("come in UserAction.list user:{}", userService.getAllUsers() );
        return SUCCESS;
    }

    @Override
    public String input() throws Exception {
        userService.getAllUsers();
        return INPUT ;
    }

    @Override
    public String save() throws Exception {
        return null; 
    }

    @Override
    public String delete() throws Exception {
        return null; 
    }

    @Override
    protected void prepareModel() throws Exception {
       
    }

    @Override
    public Object getModel() {
        return null; 
    }
}
