// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link Task} extends {@link TeaModel}
 *
 * <p>Task</p>
 */
public class Task extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List<Action> actions;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtActivatedTime")
    private String gmtActivatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private Task(Builder builder) {
        this.actions = builder.actions;
        this.description = builder.description;
        this.gmtActivatedTime = builder.gmtActivatedTime;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtStoppedTime = builder.gmtStoppedTime;
        this.quotaId = builder.quotaId;
        this.rules = builder.rules;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Task create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<Action> getActions() {
        return this.actions;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtActivatedTime
     */
    public String getGmtActivatedTime() {
        return this.gmtActivatedTime;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtStoppedTime
     */
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private java.util.List<Action> actions; 
        private String description; 
        private String gmtActivatedTime; 
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private String gmtStoppedTime; 
        private String quotaId; 
        private Rules rules; 
        private String status; 
        private String taskId; 
        private String taskName; 
        private String userId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(Task model) {
            this.actions = model.actions;
            this.description = model.description;
            this.gmtActivatedTime = model.gmtActivatedTime;
            this.gmtCreatedTime = model.gmtCreatedTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtStoppedTime = model.gmtStoppedTime;
            this.quotaId = model.quotaId;
            this.rules = model.rules;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.userId = model.userId;
            this.userName = model.userName;
        } 

        /**
         * <p>The actions performed by the task.</p>
         */
        public Builder actions(java.util.List<Action> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test quota</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the task was activated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtActivatedTime(String gmtActivatedTime) {
            this.gmtActivatedTime = gmtActivatedTime;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * <p>The time when the task was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The time when the task was stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quotad2kd8ljpsno</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The execution rules of the task.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>taskxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Task build() {
            return new Task(this);
        } 

    } 

}
