// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InstallAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InstallAgentResponseBody</p>
 */
public class InstallAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ExecutionResultList")
    private ExecutionResultList executionResultList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InstallAgentResponseBody model) {
            this.code = model.code;
            this.executionResultList = model.executionResultList;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution result.</p>
         */
        public Builder executionResultList(ExecutionResultList executionResultList) {
            this.executionResultList = executionResultList;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-7ca7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallAgentResponseBody build() {
            return new InstallAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstallAgentResponseBody} extends {@link TeaModel}
     *
     * <p>InstallAgentResponseBody</p>
     */
    public static class ExecutionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(ExecutionResult model) {
                this.finishedTime = model.finishedTime;
                this.instanceId = model.instanceId;
                this.invokeRecordStatus = model.invokeRecordStatus;
                this.status = model.status;
                this.success = model.success;
            } 

            /**
             * <p>The time when the installation was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>20**-11-10T07:02:17Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze7s2v0b789k*******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The state of the installation.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * <p>The state of the installation command.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the installation was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link InstallAgentResponseBody} extends {@link TeaModel}
     *
     * <p>InstallAgentResponseBody</p>
     */
    public static class ExecutionResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionResult")
        private java.util.List<ExecutionResult> executionResult;

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
        public java.util.List<ExecutionResult> getExecutionResult() {
            return this.executionResult;
        }

        public static final class Builder {
            private java.util.List<ExecutionResult> executionResult; 

            private Builder() {
            } 

            private Builder(ExecutionResultList model) {
                this.executionResult = model.executionResult;
            } 

            /**
             * ExecutionResult.
             */
            public Builder executionResult(java.util.List<ExecutionResult> executionResult) {
                this.executionResult = executionResult;
                return this;
            }

            public ExecutionResultList build() {
                return new ExecutionResultList(this);
            } 

        } 

    }
}
