// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetOptimizeRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetOptimizeRunResponseBody</p>
 */
public class GetOptimizeRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attemptCount")
    private Integer attemptCount;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("currentStage")
    private String currentStage;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("maxAttempts")
    private Integer maxAttempts;

    @com.aliyun.core.annotation.NameInMap("optimizeRunId")
    private String optimizeRunId;

    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.NameInMap("progress")
    private java.util.Map<String, ?> progress;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("trajectoryCount")
    private Long trajectoryCount;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("windowEndTime")
    private Long windowEndTime;

    @com.aliyun.core.annotation.NameInMap("windowStartTime")
    private Long windowStartTime;

    private GetOptimizeRunResponseBody(Builder builder) {
        this.attemptCount = builder.attemptCount;
        this.createTime = builder.createTime;
        this.currentStage = builder.currentStage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.extra = builder.extra;
        this.finishTime = builder.finishTime;
        this.maxAttempts = builder.maxAttempts;
        this.optimizeRunId = builder.optimizeRunId;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.trajectoryCount = builder.trajectoryCount;
        this.triggerType = builder.triggerType;
        this.type = builder.type;
        this.windowEndTime = builder.windowEndTime;
        this.windowStartTime = builder.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptimizeRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attemptCount
     */
    public Integer getAttemptCount() {
        return this.attemptCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return currentStage
     */
    public String getCurrentStage() {
        return this.currentStage;
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
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return maxAttempts
     */
    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * @return optimizeRunId
     */
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    /**
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    /**
     * @return progress
     */
    public java.util.Map<String, ?> getProgress() {
        return this.progress;
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trajectoryCount
     */
    public Long getTrajectoryCount() {
        return this.trajectoryCount;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return windowEndTime
     */
    public Long getWindowEndTime() {
        return this.windowEndTime;
    }

    /**
     * @return windowStartTime
     */
    public Long getWindowStartTime() {
        return this.windowStartTime;
    }

    public static final class Builder {
        private Integer attemptCount; 
        private String createTime; 
        private String currentStage; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.Map<String, ?> extra; 
        private String finishTime; 
        private Integer maxAttempts; 
        private String optimizeRunId; 
        private String optimizeTaskName; 
        private java.util.Map<String, ?> progress; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private Long trajectoryCount; 
        private String triggerType; 
        private String type; 
        private Long windowEndTime; 
        private Long windowStartTime; 

        private Builder() {
        } 

        private Builder(GetOptimizeRunResponseBody model) {
            this.attemptCount = model.attemptCount;
            this.createTime = model.createTime;
            this.currentStage = model.currentStage;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.extra = model.extra;
            this.finishTime = model.finishTime;
            this.maxAttempts = model.maxAttempts;
            this.optimizeRunId = model.optimizeRunId;
            this.optimizeTaskName = model.optimizeTaskName;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.trajectoryCount = model.trajectoryCount;
            this.triggerType = model.triggerType;
            this.type = model.type;
            this.windowEndTime = model.windowEndTime;
            this.windowStartTime = model.windowStartTime;
        } 

        /**
         * attemptCount.
         */
        public Builder attemptCount(Integer attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * currentStage.
         */
        public Builder currentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * finishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * maxAttempts.
         */
        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * optimizeRunId.
         */
        public Builder optimizeRunId(String optimizeRunId) {
            this.optimizeRunId = optimizeRunId;
            return this;
        }

        /**
         * optimizeTaskName.
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(java.util.Map<String, ?> progress) {
            this.progress = progress;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * trajectoryCount.
         */
        public Builder trajectoryCount(Long trajectoryCount) {
            this.trajectoryCount = trajectoryCount;
            return this;
        }

        /**
         * triggerType.
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * windowEndTime.
         */
        public Builder windowEndTime(Long windowEndTime) {
            this.windowEndTime = windowEndTime;
            return this;
        }

        /**
         * windowStartTime.
         */
        public Builder windowStartTime(Long windowStartTime) {
            this.windowStartTime = windowStartTime;
            return this;
        }

        public GetOptimizeRunResponseBody build() {
            return new GetOptimizeRunResponseBody(this);
        } 

    } 

}
