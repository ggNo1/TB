package cn.gg3083.tb.controller;

import cn.gg3083.tb.json.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "tb/note")
public class CallBackController {

    @RequestMapping("callback")
    @ResponseBody
    public JsonResult random(){
        JsonResult jsonResult = new JsonResult();
        List<Integer> list = new LinkedList<>();
        Random num =   new Random( );
        for (int i = 0; i < 6; i++) {
         list.add( num.nextInt(32)+1 );
        }
        Collections.sort( list );
        list.add( num.nextInt(16)+1 );
        jsonResult.setObj( list );
        return jsonResult;
    }

}