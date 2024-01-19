// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInventoryOfItemsInBizItemGroupRequest} extends {@link RequestModel}
 *
 * <p>QueryInventoryOfItemsInBizItemGroupRequest</p>
 */
public class QueryInventoryOfItemsInBizItemGroupRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("DivisionCode")
    private String divisionCode;

    @Query
    @NameInMap("ItemIds")
    private java.util.List < Long > itemIds;

    @Query
    @NameInMap("LmItemIds")
    private java.util.List < String > lmItemIds;

    @Query
    @NameInMap("SubBizId")
    @Validation(required = true)
    private String subBizId;

    private QueryInventoryOfItemsInBizItemGroupRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.divisionCode = builder.divisionCode;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
        this.subBizId = builder.subBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInventoryOfItemsInBizItemGroupRequest create() {
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
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
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
     * @return subBizId
     */
    public String getSubBizId() {
        return this.subBizId;
    }

    public static final class Builder extends Request.Builder<QueryInventoryOfItemsInBizItemGroupRequest, Builder> {
        private String bizId; 
        private String divisionCode; 
        private java.util.List < Long > itemIds; 
        private java.util.List < String > lmItemIds; 
        private String subBizId; 

        private Builder() {
            super();
        } 

        private Builder(QueryInventoryOfItemsInBizItemGroupRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.divisionCode = request.divisionCode;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
            this.subBizId = request.subBizId;
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
         * DivisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putQueryParameter("DivisionCode", divisionCode);
            this.divisionCode = divisionCode;
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
         * SubBizId.
         */
        public Builder subBizId(String subBizId) {
            this.putQueryParameter("SubBizId", subBizId);
            this.subBizId = subBizId;
            return this;
        }

        @Override
        public QueryInventoryOfItemsInBizItemGroupRequest build() {
            return new QueryInventoryOfItemsInBizItemGroupRequest(this);
        } 

    } 

}
