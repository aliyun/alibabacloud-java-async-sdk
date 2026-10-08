// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    private java.util.List<AsyncTaskEvent> events;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<AsyncTaskEvent> getEvents() {
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
        private java.util.List<AsyncTaskEvent> events; 
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

        private Builder() {
        } 

        private Builder(AsyncTask model) {
            this.alreadyRetriedTimes = model.alreadyRetriedTimes;
            this.destinationStatus = model.destinationStatus;
            this.durationMs = model.durationMs;
            this.endTime = model.endTime;
            this.events = model.events;
            this.functionArn = model.functionArn;
            this.instanceId = model.instanceId;
            this.qualifier = model.qualifier;
            this.requestId = model.requestId;
            this.returnPayload = model.returnPayload;
            this.startedTime = model.startedTime;
            this.status = model.status;
            this.taskErrorMessage = model.taskErrorMessage;
            this.taskId = model.taskId;
            this.taskPayload = model.taskPayload;
        } 

        /**
         * <p>The number of retries after the asynchronous task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder alreadyRetriedTimes(Long alreadyRetriedTimes) {
            this.alreadyRetriedTimes = alreadyRetriedTimes;
            return this;
        }

        /**
         * <p>The final state of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder destinationStatus(String destinationStatus) {
            this.destinationStatus = destinationStatus;
            return this;
        }

        /**
         * <p>The execution duration of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder durationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * <p>The end time of the asynchronous task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633449590000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The events of the asynchronous task.</p>
         */
        public Builder events(java.util.List<AsyncTaskEvent> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:1234/functions/my-func</p>
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * <p>The ID of the instance that corresponds to the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>D4-*******9FD1-882707E</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The ID of the request corresponding to this asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>e026ae92-61e5-472f-b32d-1c9e3c4e****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The content of the response after the asynchronous task is executed. The maximum size is 1 MB. This parameter is in public preview. If you want to use this parameter, <a href="https://help.aliyun.com/document_detail/2513733.html">contact us</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>result</p>
         */
        public Builder returnPayload(String returnPayload) {
            this.returnPayload = returnPayload;
            return this;
        }

        /**
         * <p>The start time of the asynchronous task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633449590000</p>
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * <p>The state of the asynchronous task.</p>
         * <ul>
         * <li>Enqueued: The asynchronous invocation is enqueued and waiting to be executed.</li>
         * <li>Succeeded: The invocation is successful.</li>
         * <li>Failed: The invocation fails.</li>
         * <li>Running: The invocation is being executed.</li>
         * <li>Stopped: The invocation is terminated.</li>
         * <li>Stopping: The invocation is being terminated.</li>
         * <li>Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
         * <li>Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period of messages expires.</li>
         * <li>Retrying: The asynchronous invocation is being retried due to an execution error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The error message for an asynchronous task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>UnhandledInvocationError</p>
         */
        public Builder taskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>e026ae92-61e5-472f-b32d-1c9e3c4e****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The content of the input parameter during asynchronous task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
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
