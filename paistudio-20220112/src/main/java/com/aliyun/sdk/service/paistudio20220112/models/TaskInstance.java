// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtEndTime")
    private String gmtEndTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    private String taskInstanceId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private TaskInstance(Builder builder) {
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtEndTime = builder.gmtEndTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskInstanceId = builder.taskInstanceId;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskInstance create() {
        return builder().build();
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtEndTime
     */
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInstanceId
     */
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String gmtCreatedTime; 
        private String gmtEndTime; 
        private String status; 
        private String taskId; 
        private String taskInstanceId; 
        private String tenantId; 
        private String userId; 

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * GmtEndTime.
         */
        public Builder gmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskInstanceId.
         */
        public Builder taskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public TaskInstance build() {
            return new TaskInstance(this);
        } 

    } 

}
