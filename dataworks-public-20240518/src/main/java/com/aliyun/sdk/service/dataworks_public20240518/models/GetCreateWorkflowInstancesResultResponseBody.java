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

        private Builder(GetCreateWorkflowInstancesResultResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The creation result of the workflow instance.</p>
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

        @com.aliyun.core.annotation.NameInMap("UnifiedWorkflowInstanceIds")
        private java.util.List<Long> unifiedWorkflowInstanceIds;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceIds")
        private java.util.List<Long> workflowInstanceIds;

        @com.aliyun.core.annotation.NameInMap("WorkflowTaskInstanceIds")
        private java.util.List<Long> workflowTaskInstanceIds;

        private Result(Builder builder) {
            this.failureMessage = builder.failureMessage;
            this.status = builder.status;
            this.unifiedWorkflowInstanceIds = builder.unifiedWorkflowInstanceIds;
            this.workflowInstanceIds = builder.workflowInstanceIds;
            this.workflowTaskInstanceIds = builder.workflowTaskInstanceIds;
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
         * @return unifiedWorkflowInstanceIds
         */
        public java.util.List<Long> getUnifiedWorkflowInstanceIds() {
            return this.unifiedWorkflowInstanceIds;
        }

        /**
         * @return workflowInstanceIds
         */
        public java.util.List<Long> getWorkflowInstanceIds() {
            return this.workflowInstanceIds;
        }

        /**
         * @return workflowTaskInstanceIds
         */
        public java.util.List<Long> getWorkflowTaskInstanceIds() {
            return this.workflowTaskInstanceIds;
        }

        public static final class Builder {
            private String failureMessage; 
            private String status; 
            private java.util.List<Long> unifiedWorkflowInstanceIds; 
            private java.util.List<Long> workflowInstanceIds; 
            private java.util.List<Long> workflowTaskInstanceIds; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failureMessage = model.failureMessage;
                this.status = model.status;
                this.unifiedWorkflowInstanceIds = model.unifiedWorkflowInstanceIds;
                this.workflowInstanceIds = model.workflowInstanceIds;
                this.workflowTaskInstanceIds = model.workflowTaskInstanceIds;
            } 

            /**
             * <p>The error message. This parameter is returned only if the creation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid Param xxx</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The creation status. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Created</li>
             * <li>CreateFailure</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnifiedWorkflowInstanceIds.
             */
            public Builder unifiedWorkflowInstanceIds(java.util.List<Long> unifiedWorkflowInstanceIds) {
                this.unifiedWorkflowInstanceIds = unifiedWorkflowInstanceIds;
                return this;
            }

            /**
             * <p>The workflow instance IDs. This parameter is returned only if the creation is successful.</p>
             */
            public Builder workflowInstanceIds(java.util.List<Long> workflowInstanceIds) {
                this.workflowInstanceIds = workflowInstanceIds;
                return this;
            }

            /**
             * WorkflowTaskInstanceIds.
             */
            public Builder workflowTaskInstanceIds(java.util.List<Long> workflowTaskInstanceIds) {
                this.workflowTaskInstanceIds = workflowTaskInstanceIds;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
