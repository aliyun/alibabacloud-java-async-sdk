// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceExecutionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceExecutionStatusResponseBody</p>
 */
public class ListResourceExecutionStatusResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceExecutionStatus")
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
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution information of the resource.
         */
        public Builder resourceExecutionStatus(java.util.List < ResourceExecutionStatus> resourceExecutionStatus) {
            this.resourceExecutionStatus = resourceExecutionStatus;
            return this;
        }

        public ListResourceExecutionStatusResponseBody build() {
            return new ListResourceExecutionStatusResponseBody(this);
        } 

    } 

    public static class ResourceExecutionStatus extends TeaModel {
        @NameInMap("ExecutionId")
        private String executionId;

        @NameInMap("ExecutionTime")
        private String executionTime;

        @NameInMap("Outputs")
        private String outputs;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Status")
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
             * The ID of the execution.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * The time when the execution started running.
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * The output of the template.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The status of the execution.
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
