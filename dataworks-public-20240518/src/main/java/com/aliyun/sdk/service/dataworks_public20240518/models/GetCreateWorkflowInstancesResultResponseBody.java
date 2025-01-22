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
 * {@link GetCreateWorkflowInstancesResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreateWorkflowInstancesResultResponseBody</p>
 */
public class GetCreateWorkflowInstancesResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetCreateWorkflowInstancesResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateWorkflowInstancesResultResponseBody create() {
        return builder().build();
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetCreateWorkflowInstancesResultResponseBody build() {
            return new GetCreateWorkflowInstancesResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCreateWorkflowInstancesResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetCreateWorkflowInstancesResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceIds")
        private java.util.List<Long> workflowInstanceIds;

        private Result(Builder builder) {
            this.failureMessage = builder.failureMessage;
            this.status = builder.status;
            this.workflowInstanceIds = builder.workflowInstanceIds;
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

        /**
         * @return workflowInstanceIds
         */
        public java.util.List<Long> getWorkflowInstanceIds() {
            return this.workflowInstanceIds;
        }

        public static final class Builder {
            private String failureMessage; 
            private String status; 
            private java.util.List<Long> workflowInstanceIds; 

            /**
             * FailureMessage.
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkflowInstanceIds.
             */
            public Builder workflowInstanceIds(java.util.List<Long> workflowInstanceIds) {
                this.workflowInstanceIds = workflowInstanceIds;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
