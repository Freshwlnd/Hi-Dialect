package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Comments;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentsDao {
    Comments[] viewComment(@Param("vdoId")int vdoId);
    Comments getCom(@Param("cmtId")int cmtId);
    void deleteCom(@Param("cmtId")int cmtId);
    void addComment(Comments cmt);
}
