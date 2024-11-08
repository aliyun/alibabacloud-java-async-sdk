// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceExecutionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceExecutionStatusResponseBody</p>
 */
public class ListResourceExecutionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceExecutionStatus")
    private java.util.List < ResourceExecutionStatus> resourceExecutionStatus;

    private ListResourceExecutionStatusResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceExecutionStatus = builder.resourceExecutionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceExecutionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceExecutionStatus
     */
    public java.util.List < ResourceExecutionStatus> getResourceExecutionStatus() {
        return this.resourceExecutionStatus;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceExecutionStatus> resourceExecutionStatus; 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ED571CBD-9F96-419D-B919-CF340BBCA157</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution information of the resource.</p>
         */
        public Builder resourceExecutionStatus(java.util.List < ResourceExecutionStatus> resourceExecutionStatus) {
            this.resourceExecutionStatus = resourceExecutionStatus;
            return this;
        }

        public ListResourceExecutionStatusResponseBody build() {
            return new ListResourceExecutionStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceExecutionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExecutionStatusResponseBody</p>
     */
    public static class ResourceExecutionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private String executionTime;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceExecutionStatus(Builder builder) {
            this.executionId = builder.executionId;
            this.executionTime = builder.executionTime;
            this.outputs = builder.outputs;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceExecutionStatus create() {
            return builder().build();
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return executionTime
         */
        public String getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String executionId; 
            private String executionTime; 
            private String outputs; 
            private String resourceId; 
            private String status; 

            /**
             * <p>The ID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-6be6d6ff805349d9ac13</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>The time when the execution started running.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-13T08:48:34Z</p>
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The output of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>{ 				&quot;commandOutput&quot;: &quot;hello\n&quot; 			}</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1e1bxxxxxxxxxxxxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The status of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceExecutionStatus build() {
                return new ResourceExecutionStatus(this);
            } 

        } 

    }
}
