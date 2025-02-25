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

    @NameInMap("durationMs")
    private Long durationMs;

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

    @NameInMap("returnPayload")
    private String returnPayload;

    @NameInMap("serviceName")
    private String serviceName;

    @NameInMap("startedTime")
    private Long startedTime;

    @NameInMap("status")
    private String status;

    private StatefulAsyncInvocation(Builder builder) {
        this.alreadyRetriedTimes = builder.alreadyRetriedTimes;
        this.destinationStatus = builder.destinationStatus;
        this.durationMs = builder.durationMs;
        this.endTime = builder.endTime;
        this.events = builder.events;
        this.functionName = builder.functionName;
        this.instanceId = builder.instanceId;
        this.invocationErrorMessage = builder.invocationErrorMessage;
        this.invocationId = builder.invocationId;
        this.invocationPayload = builder.invocationPayload;
        this.qualifier = builder.qualifier;
        this.requestId = builder.requestId;
        this.returnPayload = builder.returnPayload;
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
     * @return returnPayload
     */
    public String getReturnPayload() {
        return this.returnPayload;
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
        private Long durationMs; 
        private Long endTime; 
        private java.util.List < StatefulAsyncInvocationEvent > events; 
        private String functionName; 
        private String instanceId; 
        private String invocationErrorMessage; 
        private String invocationId; 
        private String invocationPayload; 
        private String qualifier; 
        private String requestId; 
        private String returnPayload; 
        private String serviceName; 
        private Long startedTime; 
        private String status; 

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
        public Builder events(java.util.List < StatefulAsyncInvocationEvent > events) {
            this.events = events;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
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
         * invocationErrorMessage.
         */
        public Builder invocationErrorMessage(String invocationErrorMessage) {
            this.invocationErrorMessage = invocationErrorMessage;
            return this;
        }

        /**
         * invocationId.
         */
        public Builder invocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }

        /**
         * invocationPayload.
         */
        public Builder invocationPayload(String invocationPayload) {
            this.invocationPayload = invocationPayload;
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
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
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

        public StatefulAsyncInvocation build() {
            return new StatefulAsyncInvocation(this);
        } 

    } 

}
