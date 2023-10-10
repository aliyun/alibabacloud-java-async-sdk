// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InstallAgentResponseBody</p>
 */
public class InstallAgentResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ExecutionResultList")
    private ExecutionResultList executionResultList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InstallAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.executionResultList = builder.executionResultList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return executionResultList
     */
    public ExecutionResultList getExecutionResultList() {
        return this.executionResultList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private ExecutionResultList executionResultList; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The execution result.
         */
        public Builder executionResultList(ExecutionResultList executionResultList) {
            this.executionResultList = executionResultList;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallAgentResponseBody build() {
            return new InstallAgentResponseBody(this);
        } 

    } 

    public static class ExecutionResult extends TeaModel {
        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("Success")
        private Boolean success;

        private ExecutionResult(Builder builder) {
            this.finishedTime = builder.finishedTime;
            this.instanceId = builder.instanceId;
            this.invokeRecordStatus = builder.invokeRecordStatus;
            this.status = builder.status;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionResult create() {
            return builder().build();
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return invokeRecordStatus
         */
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String finishedTime; 
            private String instanceId; 
            private String invokeRecordStatus; 
            private String status; 
            private Boolean success; 

            /**
             * The time when the installation was complete.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The state of the installation.
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * The state of the installation command.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether the installation was successful.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public ExecutionResult build() {
                return new ExecutionResult(this);
            } 

        } 

    }
    public static class ExecutionResultList extends TeaModel {
        @NameInMap("ExecutionResult")
        private java.util.List < ExecutionResult> executionResult;

        private ExecutionResultList(Builder builder) {
            this.executionResult = builder.executionResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionResultList create() {
            return builder().build();
        }

        /**
         * @return executionResult
         */
        public java.util.List < ExecutionResult> getExecutionResult() {
            return this.executionResult;
        }

        public static final class Builder {
            private java.util.List < ExecutionResult> executionResult; 

            /**
             * ExecutionResult.
             */
            public Builder executionResult(java.util.List < ExecutionResult> executionResult) {
                this.executionResult = executionResult;
                return this;
            }

            public ExecutionResultList build() {
                return new ExecutionResultList(this);
            } 

        } 

    }
}
