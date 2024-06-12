// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateRemediationExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateRemediationExecutionsResponseBody</p>
 */
public class ListAggregateRemediationExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationExecutionData")
    private RemediationExecutionData remediationExecutionData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateRemediationExecutionsResponseBody(Builder builder) {
        this.remediationExecutionData = builder.remediationExecutionData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateRemediationExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediationExecutionData
     */
    public RemediationExecutionData getRemediationExecutionData() {
        return this.remediationExecutionData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RemediationExecutionData remediationExecutionData; 
        private String requestId; 

        /**
         * The queried remediation records.
         */
        public Builder remediationExecutionData(RemediationExecutionData remediationExecutionData) {
            this.remediationExecutionData = remediationExecutionData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateRemediationExecutionsResponseBody build() {
            return new ListAggregateRemediationExecutionsResponseBody(this);
        } 

    } 

    public static class RemediationExecutions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionCreateDate")
        private String executionCreateDate;

        @com.aliyun.core.annotation.NameInMap("ExecutionInvocationId")
        private String executionInvocationId;

        @com.aliyun.core.annotation.NameInMap("ExecutionResourceIds")
        private String executionResourceIds;

        @com.aliyun.core.annotation.NameInMap("ExecutionResourceType")
        private String executionResourceType;

        @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
        private String executionStatus;

        @com.aliyun.core.annotation.NameInMap("ExecutionStatusMessage")
        private String executionStatusMessage;

        private RemediationExecutions(Builder builder) {
            this.executionCreateDate = builder.executionCreateDate;
            this.executionInvocationId = builder.executionInvocationId;
            this.executionResourceIds = builder.executionResourceIds;
            this.executionResourceType = builder.executionResourceType;
            this.executionStatus = builder.executionStatus;
            this.executionStatusMessage = builder.executionStatusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemediationExecutions create() {
            return builder().build();
        }

        /**
         * @return executionCreateDate
         */
        public String getExecutionCreateDate() {
            return this.executionCreateDate;
        }

        /**
         * @return executionInvocationId
         */
        public String getExecutionInvocationId() {
            return this.executionInvocationId;
        }

        /**
         * @return executionResourceIds
         */
        public String getExecutionResourceIds() {
            return this.executionResourceIds;
        }

        /**
         * @return executionResourceType
         */
        public String getExecutionResourceType() {
            return this.executionResourceType;
        }

        /**
         * @return executionStatus
         */
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        /**
         * @return executionStatusMessage
         */
        public String getExecutionStatusMessage() {
            return this.executionStatusMessage;
        }

        public static final class Builder {
            private String executionCreateDate; 
            private String executionInvocationId; 
            private String executionResourceIds; 
            private String executionResourceType; 
            private String executionStatus; 
            private String executionStatusMessage; 

            /**
             * The time when the remediation record was created.
             */
            public Builder executionCreateDate(String executionCreateDate) {
                this.executionCreateDate = executionCreateDate;
                return this;
            }

            /**
             * The invocation ID of the remediation record.
             */
            public Builder executionInvocationId(String executionInvocationId) {
                this.executionInvocationId = executionInvocationId;
                return this;
            }

            /**
             * The IDs of the remediated resources. Multiple resource IDs are separated with commas (,).
             */
            public Builder executionResourceIds(String executionResourceIds) {
                this.executionResourceIds = executionResourceIds;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder executionResourceType(String executionResourceType) {
                this.executionResourceType = executionResourceType;
                return this;
            }

            /**
             * The status of the remediation. Valid values:
             * <p>
             * 
             * *   Success
             * *   Failed
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * The error message returned when the remediation fails.
             */
            public Builder executionStatusMessage(String executionStatusMessage) {
                this.executionStatusMessage = executionStatusMessage;
                return this;
            }

            public RemediationExecutions build() {
                return new RemediationExecutions(this);
            } 

        } 

    }
    public static class RemediationExecutionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Long maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("RemediationExecutions")
        private java.util.List < RemediationExecutions> remediationExecutions;

        private RemediationExecutionData(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.remediationExecutions = builder.remediationExecutions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemediationExecutionData create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Long getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return remediationExecutions
         */
        public java.util.List < RemediationExecutions> getRemediationExecutions() {
            return this.remediationExecutions;
        }

        public static final class Builder {
            private Long maxResults; 
            private String nextToken; 
            private java.util.List < RemediationExecutions> remediationExecutions; 

            /**
             * The maximum number of entries returned for a single request.
             */
            public Builder maxResults(Long maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * A pagination token. It can be used in the next request to retrieve a new page of results.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The queried remediation records.
             */
            public Builder remediationExecutions(java.util.List < RemediationExecutions> remediationExecutions) {
                this.remediationExecutions = remediationExecutions;
                return this;
            }

            public RemediationExecutionData build() {
                return new RemediationExecutionData(this);
            } 

        } 

    }
}
