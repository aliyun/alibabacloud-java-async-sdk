// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicResponseBody} extends {@link TeaModel}
 *
 * <p>ListTopicResponseBody</p>
 */
public class ListTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * The response code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The response status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTopicResponseBody build() {
            return new ListTopicResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("LoggingEnabled")
        private Boolean loggingEnabled;

        @com.aliyun.core.annotation.NameInMap("MaxMessageSize")
        private Long maxMessageSize;

        @com.aliyun.core.annotation.NameInMap("MessageCount")
        private Long messageCount;

        @com.aliyun.core.annotation.NameInMap("MessageRetentionPeriod")
        private Long messageRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TopicInnerUrl")
        private String topicInnerUrl;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicUrl")
        private String topicUrl;

        private PageData(Builder builder) {
            this.createTime = builder.createTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.loggingEnabled = builder.loggingEnabled;
            this.maxMessageSize = builder.maxMessageSize;
            this.messageCount = builder.messageCount;
            this.messageRetentionPeriod = builder.messageRetentionPeriod;
            this.tags = builder.tags;
            this.topicInnerUrl = builder.topicInnerUrl;
            this.topicName = builder.topicName;
            this.topicUrl = builder.topicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return loggingEnabled
         */
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        /**
         * @return maxMessageSize
         */
        public Long getMaxMessageSize() {
            return this.maxMessageSize;
        }

        /**
         * @return messageCount
         */
        public Long getMessageCount() {
            return this.messageCount;
        }

        /**
         * @return messageRetentionPeriod
         */
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return topicInnerUrl
         */
        public String getTopicInnerUrl() {
            return this.topicInnerUrl;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicUrl
         */
        public String getTopicUrl() {
            return this.topicUrl;
        }

        public static final class Builder {
            private Long createTime; 
            private Long lastModifyTime; 
            private Boolean loggingEnabled; 
            private Long maxMessageSize; 
            private Long messageCount; 
            private Long messageRetentionPeriod; 
            private java.util.List < Tags> tags; 
            private String topicInnerUrl; 
            private String topicName; 
            private String topicUrl; 

            /**
             * The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * Indicates whether the logging feature is enabled.
             * <p>
             * 
             * *   True
             * *   False
             */
            public Builder loggingEnabled(Boolean loggingEnabled) {
                this.loggingEnabled = loggingEnabled;
                return this;
            }

            /**
             * The maximum length of the message that is sent to the topic. Unit: bytes.
             */
            public Builder maxMessageSize(Long maxMessageSize) {
                this.maxMessageSize = maxMessageSize;
                return this;
            }

            /**
             * The number of messages in the topic.
             */
            public Builder messageCount(Long messageCount) {
                this.messageCount = messageCount;
                return this;
            }

            /**
             * The maximum duration for which a message is retained in the topic. After the specified retention period ends, the message is deleted regardless of whether the message is received. Unit: seconds.
             */
            public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
                this.messageRetentionPeriod = messageRetentionPeriod;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TopicInnerUrl.
             */
            public Builder topicInnerUrl(String topicInnerUrl) {
                this.topicInnerUrl = topicInnerUrl;
                return this;
            }

            /**
             * The name of the topic.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * TopicUrl.
             */
            public Builder topicUrl(String topicUrl) {
                this.topicUrl = topicUrl;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageData = builder.pageData;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < PageData> pageData; 
            private Long pageNum; 
            private Long pageSize; 
            private Long total; 

            /**
             * The data returned on the current page.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
