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
 * {@link QueryBestSession4ItemsRequest} extends {@link RequestModel}
 *
 * <p>QueryBestSession4ItemsRequest</p>
 */
public class QueryBestSession4ItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.Map<String, ?> itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemIds")
    private java.util.Map<String, ?> lmItemIds;

    private QueryBestSession4ItemsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBestSession4ItemsRequest create() {
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
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lmItemIds
     */
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

    public static final class Builder extends Request.Builder<QueryBestSession4ItemsRequest, Builder> {
        private String bizId; 
        private java.util.Map<String, ?> itemIds; 
        private java.util.Map<String, ?> lmItemIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryBestSession4ItemsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20211118****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
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

        @Override
        public QueryBestSession4ItemsRequest build() {
            return new QueryBestSession4ItemsRequest(this);
        } 

    } 

}
