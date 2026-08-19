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
 * {@link ModifyForwardStrategyBindingItemsRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardStrategyBindingItemsRequest</p>
 */
public class ModifyForwardStrategyBindingItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForwardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.List<String> itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    private ModifyForwardStrategyBindingItemsRequest(Builder builder) {
        super(builder);
        this.forwardId = builder.forwardId;
        this.itemIds = builder.itemIds;
        this.matchMode = builder.matchMode;
        this.modifyType = builder.modifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardStrategyBindingItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardId
     */
    public String getForwardId() {
        return this.forwardId;
    }

    /**
     * @return itemIds
     */
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    public static final class Builder extends Request.Builder<ModifyForwardStrategyBindingItemsRequest, Builder> {
        private String forwardId; 
        private java.util.List<String> itemIds; 
        private String matchMode; 
        private String modifyType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardStrategyBindingItemsRequest request) {
            super(request);
            this.forwardId = request.forwardId;
            this.itemIds = request.itemIds;
            this.matchMode = request.matchMode;
            this.modifyType = request.modifyType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-849ac29396d9ea98</p>
         */
        public Builder forwardId(String forwardId) {
            this.putBodyParameter("ForwardId", forwardId);
            this.forwardId = forwardId;
            return this;
        }

        /**
         * ItemIds.
         */
        public Builder itemIds(java.util.List<String> itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        @Override
        public ModifyForwardStrategyBindingItemsRequest build() {
            return new ModifyForwardStrategyBindingItemsRequest(this);
        } 

    } 

}
