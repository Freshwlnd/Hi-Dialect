package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Words;
import com.hidialect.hidialect_ws.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/words")
public class WordsController {
    @Autowired
    private IWordsService iWordsService;
    /* 日期：20200316
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/getWordsByVdoId",method = RequestMethod.POST)
    private Words[] getWordsByVdoId(@RequestParam int vdoId){
        return iWordsService.getWordsByVdoId(vdoId);
    }

    @RequestMapping(value = "/editWords",method = RequestMethod.POST)
    private void editWords(@RequestParam int vdoId, Words[] words){
        iWordsService.deleteWords(vdoId);
        iWordsService.insertWords(words);
    }


}
