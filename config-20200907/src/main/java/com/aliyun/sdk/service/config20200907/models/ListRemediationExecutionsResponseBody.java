// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListRemediationExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemediationExecutionsResponseBody</p>
 */
public class ListRemediationExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationExecutionData")
    private RemediationExecutionData remediationExecutionData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRemediationExecutionsResponseBody(Builder builder) {
        this.remediationExecutionData = builder.remediationExecutionData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationExecutionsResponseBody create() {
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
         * <p>The queried remediation records.</p>
         */
        public Builder remediationExecutionData(RemediationExecutionData remediationExecutionData) {
            this.remediationExecutionData = remediationExecutionData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13E67493-3165-529A-A961-BE9E4B11BA11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRemediationExecutionsResponseBody build() {
            return new ListRemediationExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemediationExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemediationExecutionsResponseBody</p>
     */
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
             * <p>The time when the remediation record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-25T11:48:15Z</p>
             */
            public Builder executionCreateDate(String executionCreateDate) {
                this.executionCreateDate = executionCreateDate;
                return this;
            }

            /**
             * <p>The invocation ID of the remediation record.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-befded3781994ccf****</p>
             */
            public Builder executionInvocationId(String executionInvocationId) {
                this.executionInvocationId = executionInvocationId;
                return this;
            }

            /**
             * <p>The IDs of the resources to which the remediation belongs. Separate multiple resource IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>rm-0jlk629z240l8****</p>
             */
            public Builder executionResourceIds(String executionResourceIds) {
                this.executionResourceIds = executionResourceIds;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::RDS::DBInstance</p>
             */
            public Builder executionResourceType(String executionResourceType) {
                this.executionResourceType = executionResourceType;
                return this;
            }

            /**
             * <p>The status of the remediation record. Valid values:</p>
             * <ul>
             * <li>Success</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * <p>The error message returned when the remediation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Invocation time out.</p>
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
    /**
     * 
     * {@link ListRemediationExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemediationExecutionsResponseBody</p>
     */
    public static class RemediationExecutionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
        private Long maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("RemediationExecutions")
        private java.util.List<RemediationExecutions> remediationExecutions;

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
        public java.util.List<RemediationExecutions> getRemediationExecutions() {
            return this.remediationExecutions;
        }

        public static final class Builder {
            private Long maxResults; 
            private String nextToken; 
            private java.util.List<RemediationExecutions> remediationExecutions; 

            /**
             * <p>The maximum number of entries to return for a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Long maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>cMbjqNaYs0Ps7zSNiu37****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The queried remediation records.</p>
             */
            public Builder remediationExecutions(java.util.List<RemediationExecutions> remediationExecutions) {
                this.remediationExecutions = remediationExecutions;
                return this;
            }

            public RemediationExecutionData build() {
                return new RemediationExecutionData(this);
            } 

        } 

    }
}
