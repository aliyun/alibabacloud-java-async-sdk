// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AsyncTask} extends {@link TeaModel}
 *
 * <p>AsyncTask</p>
 */
public class AsyncTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alreadyRetriedTimes")
    private Long alreadyRetriedTimes;

    @com.aliyun.core.annotation.NameInMap("destinationStatus")
    private String destinationStatus;

    @com.aliyun.core.annotation.NameInMap("durationMs")
    private Long durationMs;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List < AsyncTaskEvent > events;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("returnPayload")
    private String returnPayload;

    @com.aliyun.core.annotation.NameInMap("startedTime")
    private Long startedTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskErrorMessage")
    private String taskErrorMessage;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskPayload")
    private String taskPayload;

    private AsyncTask(Builder builder) {
        this.alreadyRetriedTimes = builder.alreadyRetriedTimes;
        this.destinationStatus = builder.destinationStatus;
        this.durationMs = builder.durationMs;
        this.endTime = builder.endTime;
        this.events = builder.events;
        this.functionArn = builder.functionArn;
        this.instanceId = builder.instanceId;
        this.qualifier = builder.qualifier;
        this.requestId = builder.requestId;
        this.returnPayload = builder.returnPayload;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
        this.taskErrorMessage = builder.taskErrorMessage;
        this.taskId = builder.taskId;
        this.taskPayload = builder.taskPayload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncTask create() {
        return builder().build();
    }

    /**
     * @return alreadyRetriedTimes
     */
    public Long getAlreadyRetriedTimes() {
        return this.alreadyRetriedTimes;
    }

    /**
     * @return destinationStatus
     */
    public String getDestinationStatus() {
        return this.destinationStatus;
    }

    /**
     * @return durationMs
     */
    public Long getDurationMs() {
        return this.durationMs;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return events
     */
    public java.util.List < AsyncTaskEvent > getEvents() {
        return this.events;
    }

    /**
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return returnPayload
     */
    public String getReturnPayload() {
        return this.returnPayload;
    }

    /**
     * @return startedTime
     */
    public Long getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskErrorMessage
     */
    public String getTaskErrorMessage() {
        return this.taskErrorMessage;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskPayload
     */
    public String getTaskPayload() {
        return this.taskPayload;
    }

    public static final class Builder {
        private Long alreadyRetriedTimes; 
        private String destinationStatus; 
        private Long durationMs; 
        private Long endTime; 
        private java.util.List < AsyncTaskEvent > events; 
        private String functionArn; 
        private String instanceId; 
        private String qualifier; 
        private String requestId; 
        private String returnPayload; 
        private Long startedTime; 
        private String status; 
        private String taskErrorMessage; 
        private String taskId; 
        private String taskPayload; 

        /**
         * alreadyRetriedTimes.
         */
        public Builder alreadyRetriedTimes(Long alreadyRetriedTimes) {
            this.alreadyRetriedTimes = alreadyRetriedTimes;
            return this;
        }

        /**
         * destinationStatus.
         */
        public Builder destinationStatus(String destinationStatus) {
            this.destinationStatus = destinationStatus;
            return this;
        }

        /**
         * durationMs.
         */
        public Builder durationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * events.
         */
        public Builder events(java.util.List < AsyncTaskEvent > events) {
            this.events = events;
            return this;
        }

        /**
         * functionArn.
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
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
         * returnPayload.
         */
        public Builder returnPayload(String returnPayload) {
            this.returnPayload = returnPayload;
            return this;
        }

        /**
         * startedTime.
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
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
         * taskErrorMessage.
         */
        public Builder taskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * taskPayload.
         */
        public Builder taskPayload(String taskPayload) {
            this.taskPayload = taskPayload;
            return this;
        }

        public AsyncTask build() {
            return new AsyncTask(this);
        } 

    } 

}
