// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskItemsResponseBody</p>
 */
public class ListFlowControlTaskItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListFlowControlTaskItemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListFlowControlTaskItemsResponseBody build() {
            return new ListFlowControlTaskItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskItemsResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("categoryPath")
        private String categoryPath;

        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("lastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("pubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("weight")
        private String weight;

        private Detail(Builder builder) {
            this.author = builder.author;
            this.categoryPath = builder.categoryPath;
            this.channel = builder.channel;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.lastModifyTime = builder.lastModifyTime;
            this.pubTime = builder.pubTime;
            this.status = builder.status;
            this.title = builder.title;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return categoryPath
         */
        public String getCategoryPath() {
            return this.categoryPath;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String author; 
            private String categoryPath; 
            private String channel; 
            private String duration; 
            private String expireTime; 
            private String itemId; 
            private String itemType; 
            private String lastModifyTime; 
            private String pubTime; 
            private String status; 
            private String title; 
            private String weight; 

            /**
             * author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * categoryPath.
             */
            public Builder categoryPath(String categoryPath) {
                this.categoryPath = categoryPath;
                return this;
            }

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * itemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * lastModifyTime.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * pubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskItemsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.List < Detail> detail;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("validCount")
        private String validCount;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.totalCount = builder.totalCount;
            this.validCount = builder.validCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return validCount
         */
        public String getValidCount() {
            return this.validCount;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private String totalCount; 
            private String validCount; 

            /**
             * detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * validCount.
             */
            public Builder validCount(String validCount) {
                this.validCount = validCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
