// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetThreadDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetThreadDataResponseBody</p>
 */
public class GetThreadDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    private GetThreadDataResponseBody(Builder builder) {
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.maxResults = builder.maxResults;
        this.messages = builder.messages;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThreadDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
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
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder {
        private String digitalEmployeeName; 
        private Long maxResults; 
        private java.util.List<Messages> messages; 
        private String nextToken; 
        private String requestId; 
        private String threadId; 

        private Builder() {
        } 

        private Builder(GetThreadDataResponseBody model) {
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.maxResults = model.maxResults;
            this.messages = model.messages;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.threadId = model.threadId;
        } 

        /**
         * digitalEmployeeName.
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        public GetThreadDataResponseBody build() {
            return new GetThreadDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThreadDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetThreadDataResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("callerUid")
        private String callerUid;

        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private String digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<java.util.Map<String, ?>> items;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("ownerUid")
        private String ownerUid;

        @com.aliyun.core.annotation.NameInMap("parentMessageId")
        private String parentMessageId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("threadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.Map<String, String> variables;

        private Messages(Builder builder) {
            this.callerUid = builder.callerUid;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.items = builder.items;
            this.messageId = builder.messageId;
            this.ownerUid = builder.ownerUid;
            this.parentMessageId = builder.parentMessageId;
            this.region = builder.region;
            this.role = builder.role;
            this.runId = builder.runId;
            this.threadId = builder.threadId;
            this.timestamp = builder.timestamp;
            this.traceId = builder.traceId;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return callerUid
         */
        public String getCallerUid() {
            return this.callerUid;
        }

        /**
         * @return digitalEmployeeName
         */
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return items
         */
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return ownerUid
         */
        public String getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return parentMessageId
         */
        public String getParentMessageId() {
            return this.parentMessageId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return variables
         */
        public java.util.Map<String, String> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String callerUid; 
            private String digitalEmployeeName; 
            private java.util.List<java.util.Map<String, ?>> items; 
            private String messageId; 
            private String ownerUid; 
            private String parentMessageId; 
            private String region; 
            private String role; 
            private String runId; 
            private String threadId; 
            private String timestamp; 
            private String traceId; 
            private java.util.Map<String, String> variables; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.callerUid = model.callerUid;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.items = model.items;
                this.messageId = model.messageId;
                this.ownerUid = model.ownerUid;
                this.parentMessageId = model.parentMessageId;
                this.region = model.region;
                this.role = model.role;
                this.runId = model.runId;
                this.threadId = model.threadId;
                this.timestamp = model.timestamp;
                this.traceId = model.traceId;
                this.variables = model.variables;
            } 

            /**
             * callerUid.
             */
            public Builder callerUid(String callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * digitalEmployeeName.
             */
            public Builder digitalEmployeeName(String digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            /**
             * messageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * ownerUid.
             */
            public Builder ownerUid(String ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * parentMessageId.
             */
            public Builder parentMessageId(String parentMessageId) {
                this.parentMessageId = parentMessageId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * threadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.Map<String, String> variables) {
                this.variables = variables;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
