package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Words;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IWordsDao {
    Words[] getWordsByVdoId(@Param("VdoId")int vdoId);
    void deleteWords(@Param("VdoId")int vdoId);
    void insertWords(Words word);
}
