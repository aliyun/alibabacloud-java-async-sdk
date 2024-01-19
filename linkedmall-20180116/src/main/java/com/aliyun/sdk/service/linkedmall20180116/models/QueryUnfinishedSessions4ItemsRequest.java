// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUnfinishedSessions4ItemsRequest} extends {@link RequestModel}
 *
 * <p>QueryUnfinishedSessions4ItemsRequest</p>
 */
public class QueryUnfinishedSessions4ItemsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ItemIds")
    private java.util.Map < String, ? > itemIds;

    @Query
    @NameInMap("LmItemIds")
    private java.util.Map < String, ? > lmItemIds;

    @Query
    @NameInMap("QueryTime")
    private Long queryTime;

    private QueryUnfinishedSessions4ItemsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
        this.queryTime = builder.queryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnfinishedSessions4ItemsRequest create() {
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
    public java.util.Map < String, ? > getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lmItemIds
     */
    public java.util.Map < String, ? > getLmItemIds() {
        return this.lmItemIds;
    }

    /**
     * @return queryTime
     */
    public Long getQueryTime() {
        return this.queryTime;
    }

    public static final class Builder extends Request.Builder<QueryUnfinishedSessions4ItemsRequest, Builder> {
        private String bizId; 
        private java.util.Map < String, ? > itemIds; 
        private java.util.Map < String, ? > lmItemIds; 
        private Long queryTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryUnfinishedSessions4ItemsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
            this.queryTime = request.queryTime;
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
        public Builder itemIds(java.util.Map < String, ? > itemIds) {
            String itemIdsShrink = shrink(itemIds, "ItemIds", "json");
            this.putQueryParameter("ItemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * LmItemIds.
         */
        public Builder lmItemIds(java.util.Map < String, ? > lmItemIds) {
            String lmItemIdsShrink = shrink(lmItemIds, "LmItemIds", "json");
            this.putQueryParameter("LmItemIds", lmItemIdsShrink);
            this.lmItemIds = lmItemIds;
            return this;
        }

        /**
         * QueryTime.
         */
        public Builder queryTime(Long queryTime) {
            this.putQueryParameter("QueryTime", queryTime);
            this.queryTime = queryTime;
            return this;
        }

        @Override
        public QueryUnfinishedSessions4ItemsRequest build() {
            return new QueryUnfinishedSessions4ItemsRequest(this);
        } 

    } 

}
