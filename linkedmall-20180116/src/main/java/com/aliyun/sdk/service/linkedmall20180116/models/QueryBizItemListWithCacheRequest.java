// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizItemListWithCacheRequest} extends {@link RequestModel}
 *
 * <p>QueryBizItemListWithCacheRequest</p>
 */
public class QueryBizItemListWithCacheRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ItemIds")
    @Validation(required = true)
    private java.util.List < Long > itemIds;

    @Query
    @NameInMap("LmItemIds")
    private java.util.List < String > lmItemIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SubBizCode")
    @Validation(required = true)
    private String subBizCode;

    private QueryBizItemListWithCacheRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.subBizCode = builder.subBizCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizItemListWithCacheRequest create() {
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
     * @return subBizCode
     */
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public static final class Builder extends Request.Builder<QueryBizItemListWithCacheRequest, Builder> {
        private String bizId; 
        private java.util.List < Long > itemIds; 
        private java.util.List < String > lmItemIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String subBizCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryBizItemListWithCacheRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.subBizCode = request.subBizCode;
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
         * SubBizCode.
         */
        public Builder subBizCode(String subBizCode) {
            this.putQueryParameter("SubBizCode", subBizCode);
            this.subBizCode = subBizCode;
            return this;
        }

        @Override
        public QueryBizItemListWithCacheRequest build() {
            return new QueryBizItemListWithCacheRequest(this);
        } 

    } 

}
