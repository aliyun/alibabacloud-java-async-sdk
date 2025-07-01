// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetRerunWorkflowInstancesResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetRerunWorkflowInstancesResultResponseBody</p>
 */
public class GetRerunWorkflowInstancesResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetRerunWorkflowInstancesResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRerunWorkflowInstancesResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetRerunWorkflowInstancesResultResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID, used for log tracing and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the workflow instance rerun.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetRerunWorkflowInstancesResultResponseBody build() {
            return new GetRerunWorkflowInstancesResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRerunWorkflowInstancesResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetRerunWorkflowInstancesResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.failureMessage = builder.failureMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failureMessage
         */
        public String getFailureMessage() {
            return this.failureMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failureMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failureMessage = model.failureMessage;
                this.status = model.status;
            } 

            /**
             * <p>The failure message. Returned if the rerun fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid Param xxx</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The status. NotRun Success Failure</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
