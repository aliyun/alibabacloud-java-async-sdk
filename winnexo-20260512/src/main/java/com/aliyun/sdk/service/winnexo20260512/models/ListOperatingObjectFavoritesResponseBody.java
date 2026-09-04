// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListOperatingObjectFavoritesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperatingObjectFavoritesResponseBody</p>
 */
public class ListOperatingObjectFavoritesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("objectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListOperatingObjectFavoritesResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperatingObjectFavoritesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String graphName; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private String nextToken; 
        private String objectType; 
        private String operatingObjectName; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListOperatingObjectFavoritesResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.objectType = model.objectType;
            this.operatingObjectName = model.operatingObjectName;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码：成功为 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>canonical 图谱技术名</p>
         * 
         * <strong>example:</strong>
         * <p>crm</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>是否还有下一页</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>下一页签名不透明游标；没有下一页时为空</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoxLCJpZCI6OTAyfQ.c2lnbmF0dXJlX2V4YW1wbGU</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>对象类型技术名</p>
         * 
         * <strong>example:</strong>
         * <p>contract</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>canonical 数字员工技术名</p>
         * 
         * <strong>example:</strong>
         * <p>customer_assistant</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>本次请求页大小</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>精确范围内去重后的关注总数</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListOperatingObjectFavoritesResponseBody build() {
            return new ListOperatingObjectFavoritesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperatingObjectFavoritesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperatingObjectFavoritesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("followedAt")
        private Long followedAt;

        @com.aliyun.core.annotation.NameInMap("graphName")
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private Items(Builder builder) {
            this.description = builder.description;
            this.followedAt = builder.followedAt;
            this.graphName = builder.graphName;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return followedAt
         */
        public Long getFollowedAt() {
            return this.followedAt;
        }

        /**
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String description; 
            private Long followedAt; 
            private String graphName; 
            private String objectId; 
            private String objectName; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.description = model.description;
                this.followedAt = model.followedAt;
                this.graphName = model.graphName;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>关注时间，Unix 秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1787822400</p>
             */
            public Builder followedAt(Long followedAt) {
                this.followedAt = followedAt;
                return this;
            }

            /**
             * <p>canonical 图谱技术名</p>
             * 
             * <strong>example:</strong>
             * <p>crm</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * objectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * objectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>对象类型技术名</p>
             * 
             * <strong>example:</strong>
             * <p>contract</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
