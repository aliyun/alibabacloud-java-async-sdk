// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizItemListV2Request} extends {@link RequestModel}
 *
 * <p>QueryBizItemListV2Request</p>
 */
public class QueryBizItemListV2Request extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("CategoryId")
    private Long categoryId;

    @Query
    @NameInMap("ItemIds")
    private java.util.List < Long > itemIds;

    @Query
    @NameInMap("LmItemIds")
    private java.util.List < String > lmItemIds;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SubBizId")
    private String subBizId;

    @Query
    @NameInMap("UserId")
    private String userId;

    private QueryBizItemListV2Request(Builder builder) {
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

    public static QueryBizItemListV2Request create() {
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
    public java.util.List < Long > getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lmItemIds
     */
    public java.util.List < String > getLmItemIds() {
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

    public static final class Builder extends Request.Builder<QueryBizItemListV2Request, Builder> {
        private String bizId; 
        private Long categoryId; 
        private java.util.List < Long > itemIds; 
        private java.util.List < String > lmItemIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String subBizId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBizItemListV2Request request) {
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
         * BizId.
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
        public Builder itemIds(java.util.List < Long > itemIds) {
            String itemIdsShrink = shrink(itemIds, "ItemIds", "json");
            this.putQueryParameter("ItemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * LmItemIds.
         */
        public Builder lmItemIds(java.util.List < String > lmItemIds) {
            String lmItemIdsShrink = shrink(lmItemIds, "LmItemIds", "json");
            this.putQueryParameter("LmItemIds", lmItemIdsShrink);
            this.lmItemIds = lmItemIds;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
        public QueryBizItemListV2Request build() {
            return new QueryBizItemListV2Request(this);
        } 

    } 

}
