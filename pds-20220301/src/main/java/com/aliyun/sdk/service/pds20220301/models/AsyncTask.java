// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsyncTask} extends {@link TeaModel}
 *
 * <p>AsyncTask</p>
 */
public class AsyncTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("consumed_process")
    private Long consumedProcess;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("finished_at")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("started_at")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("task_type")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("total_process")
    private Long totalProcess;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private AsyncTask(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.category = builder.category;
        this.consumedProcess = builder.consumedProcess;
        this.createdAt = builder.createdAt;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.finishedAt = builder.finishedAt;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.taskType = builder.taskType;
        this.totalProcess = builder.totalProcess;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncTask create() {
        return builder().build();
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return consumedProcess
     */
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return totalProcess
     */
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String category; 
        private Long consumedProcess; 
        private String createdAt; 
        private String errorCode; 
        private String errorMessage; 
        private String finishedAt; 
        private String startedAt; 
        private String state; 
        private String taskType; 
        private Long totalProcess; 
        private String userId; 

        /**
         * async_task_id.
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * consumed_process.
         */
        public Builder consumedProcess(Long consumedProcess) {
            this.consumedProcess = consumedProcess;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * finished_at.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * started_at.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * task_type.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * total_process.
         */
        public Builder totalProcess(Long totalProcess) {
            this.totalProcess = totalProcess;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AsyncTask build() {
            return new AsyncTask(this);
        } 

    } 

}
