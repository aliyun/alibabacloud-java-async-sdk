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
 * {@link ListSubscriptionByTopicResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubscriptionByTopicResponseBody</p>
 */
public class ListSubscriptionByTopicResponseBody extends TeaModel {
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

    private ListSubscriptionByTopicResponseBody(Builder builder) {
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

    public static ListSubscriptionByTopicResponseBody create() {
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

        private Builder(ListSubscriptionByTopicResponseBody model) {
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

        public ListSubscriptionByTopicResponseBody build() {
            return new ListSubscriptionByTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubscriptionByTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubscriptionByTopicResponseBody</p>
     */
    public static class DlqPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterTargetQueue")
        private String deadLetterTargetQueue;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private DlqPolicy(Builder builder) {
            this.deadLetterTargetQueue = builder.deadLetterTargetQueue;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlqPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetQueue
         */
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String deadLetterTargetQueue; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(DlqPolicy model) {
                this.deadLetterTargetQueue = model.deadLetterTargetQueue;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The queue to which dead-letter messages are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>dead-letter-queue</p>
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * <p>Specifies whether to enable the dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public DlqPolicy build() {
                return new DlqPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubscriptionByTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubscriptionByTopicResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DlqPolicy")
        private DlqPolicy dlqPolicy;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("FilterTag")
        private String filterTag;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
        private String notifyContentFormat;

        @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @com.aliyun.core.annotation.NameInMap("SubscriptionName")
        private String subscriptionName;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicOwner")
        private String topicOwner;

        private PageData(Builder builder) {
            this.createTime = builder.createTime;
            this.dlqPolicy = builder.dlqPolicy;
            this.endpoint = builder.endpoint;
            this.filterTag = builder.filterTag;
            this.lastModifyTime = builder.lastModifyTime;
            this.notifyContentFormat = builder.notifyContentFormat;
            this.notifyStrategy = builder.notifyStrategy;
            this.subscriptionName = builder.subscriptionName;
            this.topicName = builder.topicName;
            this.topicOwner = builder.topicOwner;
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
         * @return dlqPolicy
         */
        public DlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return filterTag
         */
        public String getFilterTag() {
            return this.filterTag;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return notifyContentFormat
         */
        public String getNotifyContentFormat() {
            return this.notifyContentFormat;
        }

        /**
         * @return notifyStrategy
         */
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        /**
         * @return subscriptionName
         */
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicOwner
         */
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public static final class Builder {
            private Long createTime; 
            private DlqPolicy dlqPolicy; 
            private String endpoint; 
            private String filterTag; 
            private Long lastModifyTime; 
            private String notifyContentFormat; 
            private String notifyStrategy; 
            private String subscriptionName; 
            private String topicName; 
            private String topicOwner; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.createTime = model.createTime;
                this.dlqPolicy = model.dlqPolicy;
                this.endpoint = model.endpoint;
                this.filterTag = model.filterTag;
                this.lastModifyTime = model.lastModifyTime;
                this.notifyContentFormat = model.notifyContentFormat;
                this.notifyStrategy = model.notifyStrategy;
                this.subscriptionName = model.subscriptionName;
                this.topicName = model.topicName;
                this.topicOwner = model.topicOwner;
            } 

            /**
             * <p>The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554806</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The dead-letter queue policy.</p>
             */
            public Builder dlqPolicy(DlqPolicy dlqPolicy) {
                this.dlqPolicy = dlqPolicy;
                return this;
            }

            /**
             * <p>The endpoint to which the messages are pushed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The tag that is used to filter messages. Only the messages that are attached with the specified tag can be pushed.</p>
             * 
             * <strong>example:</strong>
             * <p>important</p>
             */
            public Builder filterTag(String filterTag) {
                this.filterTag = filterTag;
                return this;
            }

            /**
             * <p>The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554806</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
             * <ul>
             * <li>XML</li>
             * <li>JSON</li>
             * <li>SIMPLIFIED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>XML</p>
             */
            public Builder notifyContentFormat(String notifyContentFormat) {
                this.notifyContentFormat = notifyContentFormat;
                return this;
            }

            /**
             * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
             * <ul>
             * <li>BACKOFF_RETRY</li>
             * <li>EXPONENTIAL_DECAY_RETRY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKOFF_RETRY</p>
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * <p>The name of the subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>MySubscription</p>
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>MyTopic</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the topic owner.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789098****</p>
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubscriptionByTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubscriptionByTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private Long pages;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageData = builder.pageData;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
            this.size = builder.size;
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
         * @return pages
         */
        public Long getPages() {
            return this.pages;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
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
            private Long pages; 
            private Long size; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageData = model.pageData;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pages = model.pages;
                this.size = model.size;
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
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pages(Long pages) {
                this.pages = pages;
                return this;
            }

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
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
