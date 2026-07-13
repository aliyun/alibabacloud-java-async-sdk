// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessagesResponseBody</p>
 */
public class ListMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMessagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMessagesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMessagesResponseBody build() {
            return new ListMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MessageLevel")
        private String messageLevel;

        @com.aliyun.core.annotation.NameInMap("MessageName")
        private String messageName;

        @com.aliyun.core.annotation.NameInMap("MessageSourceId")
        private String messageSourceId;

        @com.aliyun.core.annotation.NameInMap("MessageSourceRegionId")
        private String messageSourceRegionId;

        @com.aliyun.core.annotation.NameInMap("MessageSourceType")
        private String messageSourceType;

        @com.aliyun.core.annotation.NameInMap("MessageTime")
        private Long messageTime;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        private Content(Builder builder) {
            this.messageId = builder.messageId;
            this.messageLevel = builder.messageLevel;
            this.messageName = builder.messageName;
            this.messageSourceId = builder.messageSourceId;
            this.messageSourceRegionId = builder.messageSourceRegionId;
            this.messageSourceType = builder.messageSourceType;
            this.messageTime = builder.messageTime;
            this.messageType = builder.messageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageLevel
         */
        public String getMessageLevel() {
            return this.messageLevel;
        }

        /**
         * @return messageName
         */
        public String getMessageName() {
            return this.messageName;
        }

        /**
         * @return messageSourceId
         */
        public String getMessageSourceId() {
            return this.messageSourceId;
        }

        /**
         * @return messageSourceRegionId
         */
        public String getMessageSourceRegionId() {
            return this.messageSourceRegionId;
        }

        /**
         * @return messageSourceType
         */
        public String getMessageSourceType() {
            return this.messageSourceType;
        }

        /**
         * @return messageTime
         */
        public Long getMessageTime() {
            return this.messageTime;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        public static final class Builder {
            private String messageId; 
            private String messageLevel; 
            private String messageName; 
            private String messageSourceId; 
            private String messageSourceRegionId; 
            private String messageSourceType; 
            private Long messageTime; 
            private String messageType; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.messageId = model.messageId;
                this.messageLevel = model.messageLevel;
                this.messageName = model.messageName;
                this.messageSourceId = model.messageSourceId;
                this.messageSourceRegionId = model.messageSourceRegionId;
                this.messageSourceType = model.messageSourceType;
                this.messageTime = model.messageTime;
                this.messageType = model.messageType;
            } 

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * MessageLevel.
             */
            public Builder messageLevel(String messageLevel) {
                this.messageLevel = messageLevel;
                return this;
            }

            /**
             * MessageName.
             */
            public Builder messageName(String messageName) {
                this.messageName = messageName;
                return this;
            }

            /**
             * MessageSourceId.
             */
            public Builder messageSourceId(String messageSourceId) {
                this.messageSourceId = messageSourceId;
                return this;
            }

            /**
             * MessageSourceRegionId.
             */
            public Builder messageSourceRegionId(String messageSourceRegionId) {
                this.messageSourceRegionId = messageSourceRegionId;
                return this;
            }

            /**
             * MessageSourceType.
             */
            public Builder messageSourceType(String messageSourceType) {
                this.messageSourceType = messageSourceType;
                return this;
            }

            /**
             * MessageTime.
             */
            public Builder messageTime(Long messageTime) {
                this.messageTime = messageTime;
                return this;
            }

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
