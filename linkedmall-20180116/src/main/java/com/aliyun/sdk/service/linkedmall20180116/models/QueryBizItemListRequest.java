// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryBizItemListRequest} extends {@link RequestModel}
 *
 * <p>QueryBizItemListRequest</p>
 */
public class QueryBizItemListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.Map<String, ?> itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemIds")
    private java.util.Map<String, ?> lmItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubBizId")
    private String subBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QueryBizItemListRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.categoryId = builder.categoryId;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.subBizId = builder.subBizId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return itemIds
     */
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lmItemIds
     */
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subBizId
     */
    public String getSubBizId() {
        return this.subBizId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryBizItemListRequest, Builder> {
        private String bizId; 
        private Long categoryId; 
        private java.util.Map<String, ?> itemIds; 
        private java.util.Map<String, ?> lmItemIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String subBizId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBizItemListRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.categoryId = request.categoryId;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.subBizId = request.subBizId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20211202****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * ItemIds.
         */
        public Builder itemIds(java.util.Map<String, ?> itemIds) {
            String itemIdsShrink = shrink(itemIds, "ItemIds", "json");
            this.putQueryParameter("ItemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * LmItemIds.
         */
        public Builder lmItemIds(java.util.Map<String, ?> lmItemIds) {
            String lmItemIdsShrink = shrink(lmItemIds, "LmItemIds", "json");
            this.putQueryParameter("LmItemIds", lmItemIdsShrink);
            this.lmItemIds = lmItemIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SubBizId.
         */
        public Builder subBizId(String subBizId) {
            this.putQueryParameter("SubBizId", subBizId);
            this.subBizId = subBizId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryBizItemListRequest build() {
            return new QueryBizItemListRequest(this);
        } 

    } 

}
