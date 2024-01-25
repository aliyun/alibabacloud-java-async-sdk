// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemBackgroundsRequest} extends {@link RequestModel}
 *
 * <p>QueryItemBackgroundsRequest</p>
 */
public class QueryItemBackgroundsRequest extends Request {
    @Query
    @NameInMap("ItemIds")
    @Validation(required = true)
    private java.util.Map < String, ? > itemIds;

    private QueryItemBackgroundsRequest(Builder builder) {
        super(builder);
        this.itemIds = builder.itemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemBackgroundsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemIds
     */
    public java.util.Map < String, ? > getItemIds() {
        return this.itemIds;
    }

    public static final class Builder extends Request.Builder<QueryItemBackgroundsRequest, Builder> {
        private java.util.Map < String, ? > itemIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemBackgroundsRequest request) {
            super(request);
            this.itemIds = request.itemIds;
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

        @Override
        public QueryItemBackgroundsRequest build() {
            return new QueryItemBackgroundsRequest(this);
        } 

    } 

}
