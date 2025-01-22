// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link ListFailureMsgsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFailureMsgsResponseBody</p>
 */
public class ListFailureMsgsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureMsgs")
    private java.util.List<FailureMsgs> failureMsgs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFailureMsgsResponseBody(Builder builder) {
        this.failureMsgs = builder.failureMsgs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFailureMsgsResponseBody create() {
        return builder().build();
    }

    /**
     * @return failureMsgs
     */
    public java.util.List<FailureMsgs> getFailureMsgs() {
        return this.failureMsgs;
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

    public static final class Builder {
        private java.util.List<FailureMsgs> failureMsgs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * FailureMsgs.
         */
        public Builder failureMsgs(java.util.List<FailureMsgs> failureMsgs) {
            this.failureMsgs = failureMsgs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFailureMsgsResponseBody build() {
            return new ListFailureMsgsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFailureMsgsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFailureMsgsResponseBody</p>
     */
    public static class FailureMsgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("MessageBody")
        private String messageBody;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
        private String taskExecutionId;

        private FailureMsgs(Builder builder) {
            this.aliUid = builder.aliUid;
            this.executionId = builder.executionId;
            this.messageBody = builder.messageBody;
            this.reason = builder.reason;
            this.taskExecutionId = builder.taskExecutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureMsgs create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return messageBody
         */
        public String getMessageBody() {
            return this.messageBody;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return taskExecutionId
         */
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public static final class Builder {
            private String aliUid; 
            private String executionId; 
            private String messageBody; 
            private String reason; 
            private String taskExecutionId; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ExecutionId.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * MessageBody.
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * TaskExecutionId.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            public FailureMsgs build() {
                return new FailureMsgs(this);
            } 

        } 

    }
}
