package com.github.kfcfans.common.request;

import lombok.Data;

/**
 * TaskTracker 将状态上报给服务器
 *
 * @author tjq
 * @since 2020/3/17
 */
@Data
public class TaskTrackerReportInstanceStatusReq {

    private String jobId;
    private String instanceId;

    private int instanceStatus;

    private String result;

    /* ********* 统计信息 ********* */
    private long totalTaskNum;
    private long runningTaskNum;
    private long succeedTaskNum;
    private long failedTaskNum;
}
