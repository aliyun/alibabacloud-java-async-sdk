// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListTopicResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06273500-249F-5863-121D-74D51123****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTopicResponseBody build() {
            return new ListTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link ListTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String topicInnerUrl; 
            private String topicName; 
            private String topicUrl; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.createTime = model.createTime;
                this.lastModifyTime = model.lastModifyTime;
                this.loggingEnabled = model.loggingEnabled;
                this.maxMessageSize = model.maxMessageSize;
                this.messageCount = model.messageCount;
                this.messageRetentionPeriod = model.messageRetentionPeriod;
                this.tags = model.tags;
                this.topicInnerUrl = model.topicInnerUrl;
                this.topicName = model.topicName;
                this.topicUrl = model.topicUrl;
            } 

            /**
             * <p>The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554962</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554962</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>Indicates whether the logging feature is enabled.</p>
             * <ul>
             * <li>True</li>
             * <li>False</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder loggingEnabled(Boolean loggingEnabled) {
                this.loggingEnabled = loggingEnabled;
                return this;
            }

            /**
             * <p>The maximum length of the message that is sent to the topic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder maxMessageSize(Long maxMessageSize) {
                this.maxMessageSize = maxMessageSize;
                return this;
            }

            /**
             * <p>The number of messages in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder messageCount(Long messageCount) {
                this.messageCount = messageCount;
                return this;
            }

            /**
             * <p>The maximum duration for which a message is retained in the topic. After the specified retention period ends, the message is deleted regardless of whether the message is received. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
                this.messageRetentionPeriod = messageRetentionPeriod;
                return this;
            }

            /**
             * <p>The tags added to the resources.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The internal URL of the message topic. The internal URL can be accessed over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>http:// 111111111****.mns.us-west-1-internal.aliyuncs.com/topics/testTopic</p>
             */
            public Builder topicInnerUrl(String topicInnerUrl) {
                this.topicInnerUrl = topicInnerUrl;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-topic</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The URL of the message topic.</p>
             * 
             * <strong>example:</strong>
             * <p>http:// 111111111****.mns.us-west-1.aliyuncs.com/topics/testTopic</p>
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
    /**
     * 
     * {@link ListTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

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
        public java.util.List<PageData> getPageData() {
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
            private java.util.List<PageData> pageData; 
            private Long pageNum; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageData = model.pageData;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The data returned on the current page.</p>
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
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
