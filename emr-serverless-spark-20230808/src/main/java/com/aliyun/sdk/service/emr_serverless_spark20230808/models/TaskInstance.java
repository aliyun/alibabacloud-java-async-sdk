// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link TaskInstance} extends {@link TeaModel}
 *
 * <p>TaskInstance</p>
 */
public class TaskInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("creator")
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("fenixRunId")
    private String fenixRunId;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("taskBizId")
    private String taskBizId;

    @com.aliyun.core.annotation.NameInMap("taskInfo")
    private Task taskInfo;

    @com.aliyun.core.annotation.NameInMap("taskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    private TaskInstance(Builder builder) {
        this.bizId = builder.bizId;
        this.creator = builder.creator;
        this.fenixRunId = builder.fenixRunId;
        this.gmtCreated = builder.gmtCreated;
        this.taskBizId = builder.taskBizId;
        this.taskInfo = builder.taskInfo;
        this.taskStatus = builder.taskStatus;
        this.workspaceBizId = builder.workspaceBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskInstance create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return fenixRunId
     */
    public String getFenixRunId() {
        return this.fenixRunId;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    /**
     * @return taskInfo
     */
    public Task getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    public static final class Builder {
        private String bizId; 
        private Long creator; 
        private String fenixRunId; 
        private String gmtCreated; 
        private String taskBizId; 
        private Task taskInfo; 
        private String taskStatus; 
        private String workspaceBizId; 

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * fenixRunId.
         */
        public Builder fenixRunId(String fenixRunId) {
            this.fenixRunId = fenixRunId;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * taskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.taskBizId = taskBizId;
            return this;
        }

        /**
         * taskInfo.
         */
        public Builder taskInfo(Task taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * taskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * workspaceBizId.
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        public TaskInstance build() {
            return new TaskInstance(this);
        } 

    } 

}
