// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionByTopicResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubscriptionByTopicResponseBody</p>
 */
public class ListSubscriptionByTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSubscriptionByTopicResponseBody build() {
            return new ListSubscriptionByTopicResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("FilterTag")
        private String filterTag;

        @NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @NameInMap("NotifyContentFormat")
        private String notifyContentFormat;

        @NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @NameInMap("SubscriptionName")
        private String subscriptionName;

        @NameInMap("SubscriptionURL")
        private String subscriptionURL;

        @NameInMap("TopicName")
        private String topicName;

        @NameInMap("TopicOwner")
        private String topicOwner;

        private PageData(Builder builder) {
            this.createTime = builder.createTime;
            this.endpoint = builder.endpoint;
            this.filterTag = builder.filterTag;
            this.lastModifyTime = builder.lastModifyTime;
            this.notifyContentFormat = builder.notifyContentFormat;
            this.notifyStrategy = builder.notifyStrategy;
            this.subscriptionName = builder.subscriptionName;
            this.subscriptionURL = builder.subscriptionURL;
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
         * @return subscriptionURL
         */
        public String getSubscriptionURL() {
            return this.subscriptionURL;
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
            private String endpoint; 
            private String filterTag; 
            private Long lastModifyTime; 
            private String notifyContentFormat; 
            private String notifyStrategy; 
            private String subscriptionName; 
            private String subscriptionURL; 
            private String topicName; 
            private String topicOwner; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * FilterTag.
             */
            public Builder filterTag(String filterTag) {
                this.filterTag = filterTag;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * NotifyContentFormat.
             */
            public Builder notifyContentFormat(String notifyContentFormat) {
                this.notifyContentFormat = notifyContentFormat;
                return this;
            }

            /**
             * NotifyStrategy.
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * SubscriptionName.
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * SubscriptionURL.
             */
            public Builder subscriptionURL(String subscriptionURL) {
                this.subscriptionURL = subscriptionURL;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * TopicOwner.
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
    public static class Data extends TeaModel {
        @NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Pages")
        private Long pages;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
            private java.util.List < PageData> pageData; 
            private Long pageNum; 
            private Long pageSize; 
            private Long pages; 
            private Long size; 
            private Long total; 

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(Long pages) {
                this.pages = pages;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
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
