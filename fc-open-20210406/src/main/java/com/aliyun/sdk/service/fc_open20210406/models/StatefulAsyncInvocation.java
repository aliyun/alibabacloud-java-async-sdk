// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatefulAsyncInvocation} extends {@link TeaModel}
 *
 * <p>StatefulAsyncInvocation</p>
 */
public class StatefulAsyncInvocation extends TeaModel {
    @NameInMap("alreadyRetriedTimes")
    private Long alreadyRetriedTimes;

    @NameInMap("destinationStatus")
    private String destinationStatus;

    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("events")
    private java.util.List < StatefulAsyncInvocationEvent > events;

    @NameInMap("functionName")
    private String functionName;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("invocationErrorMessage")
    private String invocationErrorMessage;

    @NameInMap("invocationId")
    private String invocationId;

    @NameInMap("invocationPayload")
    private String invocationPayload;

    @NameInMap("qualifier")
    private String qualifier;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("serviceName")
    private String serviceName;

    @NameInMap("startedTime")
    private Long startedTime;

    @NameInMap("status")
    private String status;

    private StatefulAsyncInvocation(Builder builder) {
        this.alreadyRetriedTimes = builder.alreadyRetriedTimes;
        this.destinationStatus = builder.destinationStatus;
        this.endTime = builder.endTime;
        this.events = builder.events;
        this.functionName = builder.functionName;
        this.instanceId = builder.instanceId;
        this.invocationErrorMessage = builder.invocationErrorMessage;
        this.invocationId = builder.invocationId;
        this.invocationPayload = builder.invocationPayload;
        this.qualifier = builder.qualifier;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatefulAsyncInvocation create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return events
     */
    public java.util.List < StatefulAsyncInvocationEvent > getEvents() {
        return this.events;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invocationErrorMessage
     */
    public String getInvocationErrorMessage() {
        return this.invocationErrorMessage;
    }

    /**
     * @return invocationId
     */
    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * @return invocationPayload
     */
    public String getInvocationPayload() {
        return this.invocationPayload;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
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

    public static final class Builder {
        private Long alreadyRetriedTimes; 
        private String destinationStatus; 
        private Long endTime; 
        private java.util.List < StatefulAsyncInvocationEvent > events; 
        private String functionName; 
        private String instanceId; 
        private String invocationErrorMessage; 
        private String invocationId; 
        private String invocationPayload; 
        private String qualifier; 
        private String requestId; 
        private String serviceName; 
        private Long startedTime; 
        private String status; 

        /**
         * 异步任务调用失败后的已重试次数。
         */
        public Builder alreadyRetriedTimes(Long alreadyRetriedTimes) {
            this.alreadyRetriedTimes = alreadyRetriedTimes;
            return this;
        }

        /**
         * 异步任务的目的状态。
         */
        public Builder destinationStatus(String destinationStatus) {
            this.destinationStatus = destinationStatus;
            return this;
        }

        /**
         * 异步任务的结束时间。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 异步任务事件列表。
         */
        public Builder events(java.util.List < StatefulAsyncInvocationEvent > events) {
            this.events = events;
            return this;
        }

        /**
         * 异步任务所属的函数的名称。
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * 异步任务的执行实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 异步任务的错误消息。
         */
        public Builder invocationErrorMessage(String invocationErrorMessage) {
            this.invocationErrorMessage = invocationErrorMessage;
            return this;
        }

        /**
         * 异步任务ID。
         */
        public Builder invocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }

        /**
         * 异步任务的任务触发事件。
         */
        public Builder invocationPayload(String invocationPayload) {
            this.invocationPayload = invocationPayload;
            return this;
        }

        /**
         * 异步任务所属的服务的别名或版本。
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * 异步任务的请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 异步任务所属的服务的名称。
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 异步任务的开始时间。
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * 异步任务的执行状态。      Enqueued：异步消息已入队，等待处理。      Succeeded：调用执行成功。      Failed：调用执行失败。      Running：调用执行中。      Stopped：调用执行终止。      Stopping：执行停止中。      Invalid：您的执行因函数被删除等原因处于无效状态（任务未被执行）。      Expired：您为任务配置了最长排队等待的期限。该任务因为超期被丢弃（任务未被执行）。      Retrying：异步调用因执行错误重试中。
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StatefulAsyncInvocation build() {
            return new StatefulAsyncInvocation(this);
        } 

    } 

}
