// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListItemsResponseBody</p>
 */
public class ListItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListItemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListItemsResponseBody create() {
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

        public ListItemsResponseBody build() {
            return new ListItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemsResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("brandId")
        private String brandId;

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

        @com.aliyun.core.annotation.NameInMap("pubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("shopId")
        private String shopId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Detail(Builder builder) {
            this.author = builder.author;
            this.brandId = builder.brandId;
            this.categoryPath = builder.categoryPath;
            this.channel = builder.channel;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.pubTime = builder.pubTime;
            this.shopId = builder.shopId;
            this.status = builder.status;
            this.title = builder.title;
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
         * @return brandId
         */
        public String getBrandId() {
            return this.brandId;
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
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return shopId
         */
        public String getShopId() {
            return this.shopId;
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

        public static final class Builder {
            private String author; 
            private String brandId; 
            private String categoryPath; 
            private String channel; 
            private String duration; 
            private String expireTime; 
            private String itemId; 
            private String itemType; 
            private String pubTime; 
            private String shopId; 
            private String status; 
            private String title; 

            /**
             * author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * brandId.
             */
            public Builder brandId(String brandId) {
                this.brandId = brandId;
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
             * pubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * shopId.
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
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

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemsResponseBody</p>
     */
    public static class Total extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceRecommendItem")
        private Long instanceRecommendItem;

        @com.aliyun.core.annotation.NameInMap("queryCount")
        private Long queryCount;

        @com.aliyun.core.annotation.NameInMap("sceneRecommendItem")
        private Long sceneRecommendItem;

        @com.aliyun.core.annotation.NameInMap("sceneWeightItem")
        private Long sceneWeightItem;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("weightItem")
        private Long weightItem;

        private Total(Builder builder) {
            this.instanceRecommendItem = builder.instanceRecommendItem;
            this.queryCount = builder.queryCount;
            this.sceneRecommendItem = builder.sceneRecommendItem;
            this.sceneWeightItem = builder.sceneWeightItem;
            this.totalCount = builder.totalCount;
            this.weightItem = builder.weightItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Total create() {
            return builder().build();
        }

        /**
         * @return instanceRecommendItem
         */
        public Long getInstanceRecommendItem() {
            return this.instanceRecommendItem;
        }

        /**
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return sceneRecommendItem
         */
        public Long getSceneRecommendItem() {
            return this.sceneRecommendItem;
        }

        /**
         * @return sceneWeightItem
         */
        public Long getSceneWeightItem() {
            return this.sceneWeightItem;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return weightItem
         */
        public Long getWeightItem() {
            return this.weightItem;
        }

        public static final class Builder {
            private Long instanceRecommendItem; 
            private Long queryCount; 
            private Long sceneRecommendItem; 
            private Long sceneWeightItem; 
            private Long totalCount; 
            private Long weightItem; 

            /**
             * instanceRecommendItem.
             */
            public Builder instanceRecommendItem(Long instanceRecommendItem) {
                this.instanceRecommendItem = instanceRecommendItem;
                return this;
            }

            /**
             * queryCount.
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * sceneRecommendItem.
             */
            public Builder sceneRecommendItem(Long sceneRecommendItem) {
                this.sceneRecommendItem = sceneRecommendItem;
                return this;
            }

            /**
             * sceneWeightItem.
             */
            public Builder sceneWeightItem(Long sceneWeightItem) {
                this.sceneWeightItem = sceneWeightItem;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * weightItem.
             */
            public Builder weightItem(Long weightItem) {
                this.weightItem = weightItem;
                return this;
            }

            public Total build() {
                return new Total(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.List < Detail> detail;

        @com.aliyun.core.annotation.NameInMap("total")
        private Total total;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.total = builder.total;
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
         * @return total
         */
        public Total getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private Total total; 

            /**
             * detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Total total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
