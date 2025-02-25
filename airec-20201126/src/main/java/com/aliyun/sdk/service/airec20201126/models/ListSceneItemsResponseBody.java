// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSceneItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSceneItemsResponseBody</p>
 */
public class ListSceneItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListSceneItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * <p>The time spent on the page.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the item expires.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The author of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSceneItemsResponseBody build() {
            return new ListSceneItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSceneItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSceneItemsResponseBody</p>
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
             * <p>The channel of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * <p>The item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder brandId(String brandId) {
                this.brandId = brandId;
                return this;
            }

            /**
             * <p>The number of items that can be recommended in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12_34</p>
             */
            public Builder categoryPath(String categoryPath) {
                this.categoryPath = categoryPath;
                return this;
            }

            /**
             * <p>The brand ID.</p>
             * 
             * <strong>example:</strong>
             * <p>The store ID.</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The time when the item was published.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Entertainment</p>
             * 
             * <strong>example:</strong>
             * <p>1612687809</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The information about the preview results.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The title of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>Indicates whether the item can be recommended. Valid values: 1: The item can be recommended. 0: The item cannot be recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>1612687809</p>
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * <p>The type of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * <p>The category path of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of weighted items in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
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
     * {@link ListSceneItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSceneItemsResponseBody</p>
     */
    public static class Total extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceRecommendItem")
        private Long instanceRecommendItem;

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
            private Long sceneRecommendItem; 
            private Long sceneWeightItem; 
            private Long totalCount; 
            private Long weightItem; 

            /**
             * <p>The number of weighted items in the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder instanceRecommendItem(Long instanceRecommendItem) {
                this.instanceRecommendItem = instanceRecommendItem;
                return this;
            }

            /**
             * <p>The statistical results.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sceneRecommendItem(Long sceneRecommendItem) {
                this.sceneRecommendItem = sceneRecommendItem;
                return this;
            }

            /**
             * <p>The returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sceneWeightItem(Long sceneWeightItem) {
                this.sceneWeightItem = sceneWeightItem;
                return this;
            }

            /**
             * <p>The number of queries.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of items in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
     * {@link ListSceneItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSceneItemsResponseBody</p>
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
             * <p>The number of items that can be recommended in the scene.</p>
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The preview type. Valid values:</p>
             * <p>PREVIEW_ITEM: previews only the results that are returned based on item selection rules.</p>
             * <p>PREVIEW_QUERY: previews the results that are returned based on all configurations.</p>
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
