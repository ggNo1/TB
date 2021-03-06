package cn.gg3083.tb.controller;

import cn.gg3083.tb.json.JsonResult;
import org.apache.http.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@RestController
public class CallBackController {

    @RequestMapping("callback")
    public JsonResult random(){
        JsonResult jsonResult = new JsonResult();
        List<Integer> list = new LinkedList<>();
        Random num =   new Random( );
        for (int i = 0; i < 100; i++) {
            Integer no = num.nextInt(32) + 1;
            if (list.contains(no)) {
                continue;
            }
            list.add(no);
            if (list.size() == 6) {
                break;
            }
        }
        Collections.sort( list );
        list.add( num.nextInt(16)+1 );
        jsonResult.setObj( list );
        return jsonResult;
    }

}
