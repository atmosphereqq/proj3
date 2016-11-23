package com.sanqing.action;

/**
 * Created by mi on 2016/11/23.
 */


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Subject;
import com.sanqing.service.SubjectService;
import com.sanqing.service.SubjectServiceImpl;
/*
 * 查看试题详细信息
 */
public class SubjectParticularAction extends ActionSupport{
    private int subjectID;
    private SubjectService subjectService = new SubjectServiceImpl();
    public int getSubjectID() {
        return subjectID;
    }
    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
    public String execute() throws Exception {
        Subject subject = subjectService.showSubjectParticular(subjectID);
        ServletActionContext.getRequest().setAttribute("subject", subject);
        return SUCCESS;
    }
}
