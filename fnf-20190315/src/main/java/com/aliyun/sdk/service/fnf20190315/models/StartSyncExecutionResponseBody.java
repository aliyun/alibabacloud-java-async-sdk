// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSyncExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartSyncExecutionResponseBody</p>
 */
public class StartSyncExecutionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("FlowName")
    private String flowName;

    @NameInMap("Name")
    private String name;

    @NameInMap("Output")
    private String output;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartedTime")
    private String startedTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("StoppedTime")
    private String stoppedTime;

    private StartSyncExecutionResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.flowName = builder.flowName;
        this.name = builder.name;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
        this.stoppedTime = builder.stoppedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSyncExecutionResponseBody create() {
        return builder().build();
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
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedTime
     */
    public String getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedTime
     */
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String flowName; 
        private String name; 
        private String output; 
        private String requestId; 
        private String startedTime; 
        private String status; 
        private String stoppedTime; 

        /**
         * The error code that is returned if the execution failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message that indicates the execution timed out.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The name of the flow.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * The name of the execution.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The output of the execution, which is in the JSON format.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the execution started.
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * The status of the execution. Valid values:
         * <p>
         * 
         * *   **Starting**
         * *   **Running**
         * *   **Stopped**
         * *   **Succeeded**
         * *   **Failed**
         * *   **TimedOut**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the execution stopped.
         */
        public Builder stoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }

        public StartSyncExecutionResponseBody build() {
            return new StartSyncExecutionResponseBody(this);
        } 

    } 

}
