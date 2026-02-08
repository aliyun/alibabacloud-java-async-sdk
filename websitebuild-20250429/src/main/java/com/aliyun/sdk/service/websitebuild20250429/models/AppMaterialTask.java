// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AppMaterialTask} extends {@link TeaModel}
 *
 * <p>AppMaterialTask</p>
 */
public class AppMaterialTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompleteTime")
    private String completeTime;

    @com.aliyun.core.annotation.NameInMap("CompleteTimeFormat")
    private String completeTimeFormat;

    @com.aliyun.core.annotation.NameInMap("FailReason")
    private String failReason;

    @com.aliyun.core.annotation.NameInMap("FinalFileUrls")
    private java.util.List<String> finalFileUrls;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    @com.aliyun.core.annotation.NameInMap("SubmitTime")
    private String submitTime;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskParam")
    private String taskParam;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private AppMaterialTask(Builder builder) {
        this.completeTime = builder.completeTime;
        this.completeTimeFormat = builder.completeTimeFormat;
        this.failReason = builder.failReason;
        this.finalFileUrls = builder.finalFileUrls;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
        this.submitTime = builder.submitTime;
        this.taskId = builder.taskId;
        this.taskParam = builder.taskParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppMaterialTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completeTime
     */
    public String getCompleteTime() {
        return this.completeTime;
    }

    /**
     * @return completeTimeFormat
     */
    public String getCompleteTimeFormat() {
        return this.completeTimeFormat;
    }

    /**
     * @return failReason
     */
    public String getFailReason() {
        return this.failReason;
    }

    /**
     * @return finalFileUrls
     */
    public java.util.List<String> getFinalFileUrls() {
        return this.finalFileUrls;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    /**
     * @return submitTime
     */
    public String getSubmitTime() {
        return this.submitTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskParam
     */
    public String getTaskParam() {
        return this.taskParam;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String completeTime; 
        private String completeTimeFormat; 
        private String failReason; 
        private java.util.List<String> finalFileUrls; 
        private String status; 
        private String subStatus; 
        private String submitTime; 
        private String taskId; 
        private String taskParam; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(AppMaterialTask model) {
            this.completeTime = model.completeTime;
            this.completeTimeFormat = model.completeTimeFormat;
            this.failReason = model.failReason;
            this.finalFileUrls = model.finalFileUrls;
            this.status = model.status;
            this.subStatus = model.subStatus;
            this.submitTime = model.submitTime;
            this.taskId = model.taskId;
            this.taskParam = model.taskParam;
            this.taskType = model.taskType;
        } 

        /**
         * CompleteTime.
         */
        public Builder completeTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }

        /**
         * CompleteTimeFormat.
         */
        public Builder completeTimeFormat(String completeTimeFormat) {
            this.completeTimeFormat = completeTimeFormat;
            return this;
        }

        /**
         * FailReason.
         */
        public Builder failReason(String failReason) {
            this.failReason = failReason;
            return this;
        }

        /**
         * FinalFileUrls.
         */
        public Builder finalFileUrls(java.util.List<String> finalFileUrls) {
            this.finalFileUrls = finalFileUrls;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * SubmitTime.
         */
        public Builder submitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskParam.
         */
        public Builder taskParam(String taskParam) {
            this.taskParam = taskParam;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public AppMaterialTask build() {
            return new AppMaterialTask(this);
        } 

    } 

}
