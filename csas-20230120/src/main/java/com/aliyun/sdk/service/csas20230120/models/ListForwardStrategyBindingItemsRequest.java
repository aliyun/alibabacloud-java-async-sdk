// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListForwardStrategyBindingItemsRequest} extends {@link RequestModel}
 *
 * <p>ListForwardStrategyBindingItemsRequest</p>
 */
public class ListForwardStrategyBindingItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> forwardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemType")
    private String itemType;

    private ListForwardStrategyBindingItemsRequest(Builder builder) {
        super(builder);
        this.forwardIds = builder.forwardIds;
        this.itemType = builder.itemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListForwardStrategyBindingItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardIds
     */
    public java.util.List<String> getForwardIds() {
        return this.forwardIds;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    public static final class Builder extends Request.Builder<ListForwardStrategyBindingItemsRequest, Builder> {
        private java.util.List<String> forwardIds; 
        private String itemType; 

        private Builder() {
            super();
        } 

        private Builder(ListForwardStrategyBindingItemsRequest request) {
            super(request);
            this.forwardIds = request.forwardIds;
            this.itemType = request.itemType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder forwardIds(java.util.List<String> forwardIds) {
            this.putQueryParameter("ForwardIds", forwardIds);
            this.forwardIds = forwardIds;
            return this;
        }

        /**
         * ItemType.
         */
        public Builder itemType(String itemType) {
            this.putQueryParameter("ItemType", itemType);
            this.itemType = itemType;
            return this;
        }

        @Override
        public ListForwardStrategyBindingItemsRequest build() {
            return new ListForwardStrategyBindingItemsRequest(this);
        } 

    } 

}
