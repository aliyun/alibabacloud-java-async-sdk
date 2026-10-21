// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListCopilotMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCopilotMessagesResponseBody</p>
 */
public class ListCopilotMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCopilotMessagesResponseBody(Builder builder) {
        this.apiVersion = builder.apiVersion;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
        private String apiVersion; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCopilotMessagesResponseBody model) {
            this.apiVersion = model.apiVersion;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The API version.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupProductions~~">DescribeGroupProductions</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1.2</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The list of conversation messages.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum amount of data read in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCopilotMessagesResponseBody build() {
            return new ListCopilotMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCopilotMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotMessagesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientMessageId")
        private String clientMessageId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MessageSequence")
        private Long messageSequence;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TurnId")
        private String turnId;

        private Items(Builder builder) {
            this.clientMessageId = builder.clientMessageId;
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.messageId = builder.messageId;
            this.messageSequence = builder.messageSequence;
            this.role = builder.role;
            this.status = builder.status;
            this.turnId = builder.turnId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return clientMessageId
         */
        public String getClientMessageId() {
            return this.clientMessageId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageSequence
         */
        public Long getMessageSequence() {
            return this.messageSequence;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        public static final class Builder {
            private String clientMessageId; 
            private String content; 
            private String createdAt; 
            private String messageId; 
            private Long messageSequence; 
            private String role; 
            private String status; 
            private String turnId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.clientMessageId = model.clientMessageId;
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.messageId = model.messageId;
                this.messageSequence = model.messageSequence;
                this.role = model.role;
                this.status = model.status;
                this.turnId = model.turnId;
            } 

            /**
             * <p>The client message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
             */
            public Builder clientMessageId(String clientMessageId) {
                this.clientMessageId = clientMessageId;
                return this;
            }

            /**
             * <p>The sent content.</p>
             * 
             * <strong>example:</strong>
             * <p>The correlation analysis of alerts and network logs has been completed</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-11T02:01:36Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AB917534-C484-5BA0-9077-0D5D1D2F****</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder messageSequence(Long messageSequence) {
                this.messageSequence = messageSequence;
                return this;
            }

            /**
             * <p>The message role.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
