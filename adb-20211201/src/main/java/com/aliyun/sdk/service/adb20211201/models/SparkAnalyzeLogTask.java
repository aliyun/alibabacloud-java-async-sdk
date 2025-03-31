// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SparkAnalyzeLogTask} extends {@link TeaModel}
 *
 * <p>SparkAnalyzeLogTask</p>
 */
public class SparkAnalyzeLogTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private LogAnalyzeResult result;

    @com.aliyun.core.annotation.NameInMap("RuleMatched")
    private Boolean ruleMatched;

    @com.aliyun.core.annotation.NameInMap("StartedTimeInMillis")
    private Long startedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("SubmittedTimeInMillis")
    private Long submittedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("TaskErrMsg")
    private String taskErrMsg;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskState")
    private String taskState;

    @com.aliyun.core.annotation.NameInMap("TerminatedTimeInMillis")
    private Long terminatedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private SparkAnalyzeLogTask(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.result = builder.result;
        this.ruleMatched = builder.ruleMatched;
        this.startedTimeInMillis = builder.startedTimeInMillis;
        this.submittedTimeInMillis = builder.submittedTimeInMillis;
        this.taskErrMsg = builder.taskErrMsg;
        this.taskId = builder.taskId;
        this.taskState = builder.taskState;
        this.terminatedTimeInMillis = builder.terminatedTimeInMillis;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkAnalyzeLogTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return result
     */
    public LogAnalyzeResult getResult() {
        return this.result;
    }

    /**
     * @return ruleMatched
     */
    public Boolean getRuleMatched() {
        return this.ruleMatched;
    }

    /**
     * @return startedTimeInMillis
     */
    public Long getStartedTimeInMillis() {
        return this.startedTimeInMillis;
    }

    /**
     * @return submittedTimeInMillis
     */
    public Long getSubmittedTimeInMillis() {
        return this.submittedTimeInMillis;
    }

    /**
     * @return taskErrMsg
     */
    public String getTaskErrMsg() {
        return this.taskErrMsg;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return terminatedTimeInMillis
     */
    public Long getTerminatedTimeInMillis() {
        return this.terminatedTimeInMillis;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private LogAnalyzeResult result; 
        private Boolean ruleMatched; 
        private Long startedTimeInMillis; 
        private Long submittedTimeInMillis; 
        private String taskErrMsg; 
        private Long taskId; 
        private String taskState; 
        private Long terminatedTimeInMillis; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(SparkAnalyzeLogTask model) {
            this.DBClusterId = model.DBClusterId;
            this.result = model.result;
            this.ruleMatched = model.ruleMatched;
            this.startedTimeInMillis = model.startedTimeInMillis;
            this.submittedTimeInMillis = model.submittedTimeInMillis;
            this.taskErrMsg = model.taskErrMsg;
            this.taskId = model.taskId;
            this.taskState = model.taskState;
            this.terminatedTimeInMillis = model.terminatedTimeInMillis;
            this.userId = model.userId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(LogAnalyzeResult result) {
            this.result = result;
            return this;
        }

        /**
         * RuleMatched.
         */
        public Builder ruleMatched(Boolean ruleMatched) {
            this.ruleMatched = ruleMatched;
            return this;
        }

        /**
         * StartedTimeInMillis.
         */
        public Builder startedTimeInMillis(Long startedTimeInMillis) {
            this.startedTimeInMillis = startedTimeInMillis;
            return this;
        }

        /**
         * SubmittedTimeInMillis.
         */
        public Builder submittedTimeInMillis(Long submittedTimeInMillis) {
            this.submittedTimeInMillis = submittedTimeInMillis;
            return this;
        }

        /**
         * TaskErrMsg.
         */
        public Builder taskErrMsg(String taskErrMsg) {
            this.taskErrMsg = taskErrMsg;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskState.
         */
        public Builder taskState(String taskState) {
            this.taskState = taskState;
            return this;
        }

        /**
         * TerminatedTimeInMillis.
         */
        public Builder terminatedTimeInMillis(Long terminatedTimeInMillis) {
            this.terminatedTimeInMillis = terminatedTimeInMillis;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public SparkAnalyzeLogTask build() {
            return new SparkAnalyzeLogTask(this);
        } 

    } 

}
