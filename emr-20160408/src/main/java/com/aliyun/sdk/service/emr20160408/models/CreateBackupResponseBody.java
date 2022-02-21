// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupResponseBody</p>
 */
public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("BizId")
    private String bizId;

    @NameInMap("ClusterBizId")
    private String clusterBizId;

    @NameInMap("DataSourceId")
    private Long dataSourceId;

    @NameInMap("EcmTaskId")
    private Long ecmTaskId;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("TaskDetail")
    private String taskDetail;

    @NameInMap("TaskProcess")
    private Integer taskProcess;

    @NameInMap("TaskResultDetail")
    private String taskResultDetail;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("TaskType")
    private String taskType;

    @NameInMap("TriggerType")
    private String triggerType;

    @NameInMap("TriggerUser")
    private String triggerUser;

    private CreateBackupResponseBody(Builder builder) {
        this.bizId = builder.bizId;
        this.clusterBizId = builder.clusterBizId;
        this.dataSourceId = builder.dataSourceId;
        this.ecmTaskId = builder.ecmTaskId;
        this.endTime = builder.endTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.hostName = builder.hostName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.taskDetail = builder.taskDetail;
        this.taskProcess = builder.taskProcess;
        this.taskResultDetail = builder.taskResultDetail;
        this.taskStatus = builder.taskStatus;
        this.taskType = builder.taskType;
        this.triggerType = builder.triggerType;
        this.triggerUser = builder.triggerUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return ecmTaskId
     */
    public Long getEcmTaskId() {
        return this.ecmTaskId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskDetail
     */
    public String getTaskDetail() {
        return this.taskDetail;
    }

    /**
     * @return taskProcess
     */
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    /**
     * @return taskResultDetail
     */
    public String getTaskResultDetail() {
        return this.taskResultDetail;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return triggerUser
     */
    public String getTriggerUser() {
        return this.triggerUser;
    }

    public static final class Builder {
        private String bizId; 
        private String clusterBizId; 
        private Long dataSourceId; 
        private Long ecmTaskId; 
        private Long endTime; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String hostName; 
        private String requestId; 
        private Long startTime; 
        private String taskDetail; 
        private Integer taskProcess; 
        private String taskResultDetail; 
        private String taskStatus; 
        private String taskType; 
        private String triggerType; 
        private String triggerUser; 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * EcmTaskId.
         */
        public Builder ecmTaskId(Long ecmTaskId) {
            this.ecmTaskId = ecmTaskId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskDetail.
         */
        public Builder taskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        /**
         * TaskProcess.
         */
        public Builder taskProcess(Integer taskProcess) {
            this.taskProcess = taskProcess;
            return this;
        }

        /**
         * TaskResultDetail.
         */
        public Builder taskResultDetail(String taskResultDetail) {
            this.taskResultDetail = taskResultDetail;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * TriggerType.
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * TriggerUser.
         */
        public Builder triggerUser(String triggerUser) {
            this.triggerUser = triggerUser;
            return this;
        }

        public CreateBackupResponseBody build() {
            return new CreateBackupResponseBody(this);
        } 

    } 

}
