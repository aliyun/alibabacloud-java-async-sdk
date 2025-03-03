// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link StartSyncExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartSyncExecutionResponseBody</p>
 */
public class StartSyncExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartedTime")
    private String startedTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StoppedTime")
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
         * <p>The error code that is returned if the execution failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ActionNotSupported</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that indicates the execution timed out.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard execution is not supported</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>my_flow_name</p>
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The name of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>my_exec_name:{UUID}</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The output of the execution, which is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * <p>The status of the execution. Valid values:</p>
         * <ul>
         * <li><strong>Starting</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Succeeded</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>TimedOut</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the execution stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
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
