package cn.gg3083.tb.controller;

import cn.gg3083.tb.domain.Log;
import cn.gg3083.tb.domain.User;
import cn.gg3083.tb.mapper.LogMapper;
import cn.gg3083.tb.util.NoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    private LogMapper logMapper;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Log log = new Log();
        String ip = request.getRemoteAddr();
        log.setPkLogId(NoUtil.getDateNo());
        log.setIp(ip);
        log.setOper("访问主页");
        if (user!=null){
            log.setFkUserId( user.getPkUserId() );
            log.setUserName( user.getUserName() );
        }
        logMapper.insertSelective(log);
        request.setAttribute("ip", ip);
        return "view/index";
    }
}
