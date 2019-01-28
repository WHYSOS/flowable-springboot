package com.haiyang.flowablespringboot.handler;


import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author puhaiyang
 * @date 2018/12/19
 */
public class BossTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
       /* delegateTask.setAssignee("老板");
        delegateTask.setAssignee("老板娘");*/
        List<String> userIdList = new ArrayList<>();
        userIdList.add("老板");
        userIdList.add("老板娘");
        delegateTask.addCandidateGroups(userIdList);
    }

}
