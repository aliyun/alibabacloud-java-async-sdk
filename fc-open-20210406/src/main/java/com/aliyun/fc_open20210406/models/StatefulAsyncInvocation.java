// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("functionName")
    private String functionName;

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
        this.functionName = builder.functionName;
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
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
        private String functionName; 
        private String invocationErrorMessage; 
        private String invocationId; 
        private String invocationPayload; 
        private String qualifier; 
        private String requestId; 
        private String serviceName; 
        private Long startedTime; 
        private String status; 

        /**
         * <p>alreadyRetriedTimes</p>
         */
        public Builder alreadyRetriedTimes(Long alreadyRetriedTimes) {
            this.alreadyRetriedTimes = alreadyRetriedTimes;
            return this;
        }

        /**
         * <p>destinationStatus</p>
         */
        public Builder destinationStatus(String destinationStatus) {
            this.destinationStatus = destinationStatus;
            return this;
        }

        /**
         * <p>endTime</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>functionName</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>invocationErrorMessage</p>
         */
        public Builder invocationErrorMessage(String invocationErrorMessage) {
            this.invocationErrorMessage = invocationErrorMessage;
            return this;
        }

        /**
         * <p>invocationId</p>
         */
        public Builder invocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }

        /**
         * <p>invocationPayload</p>
         */
        public Builder invocationPayload(String invocationPayload) {
            this.invocationPayload = invocationPayload;
            return this;
        }

        /**
         * <p>qualifier</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>requestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>serviceName</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>startedTime</p>
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * <p>status</p>
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
