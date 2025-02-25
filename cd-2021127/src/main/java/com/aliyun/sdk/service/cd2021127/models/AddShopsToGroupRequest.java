// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link AddShopsToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddShopsToGroupRequest</p>
 */
public class AddShopsToGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> shopIdList;

    private AddShopsToGroupRequest(Builder builder) {
        super(builder);
        this.shopGroupId = builder.shopGroupId;
        this.shopIdList = builder.shopIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShopsToGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return shopGroupId
     */
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    /**
     * @return shopIdList
     */
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public static final class Builder extends Request.Builder<AddShopsToGroupRequest, Builder> {
        private String shopGroupId; 
        private java.util.List<String> shopIdList; 

        private Builder() {
            super();
        } 

        private Builder(AddShopsToGroupRequest request) {
            super(request);
            this.shopGroupId = request.shopGroupId;
            this.shopIdList = request.shopIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ShopGroupId</p>
         */
        public Builder shopGroupId(String shopGroupId) {
            this.putBodyParameter("ShopGroupId", shopGroupId);
            this.shopGroupId = shopGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder shopIdList(java.util.List<String> shopIdList) {
            String shopIdListShrink = shrink(shopIdList, "ShopIdList", "json");
            this.putBodyParameter("ShopIdList", shopIdListShrink);
            this.shopIdList = shopIdList;
            return this;
        }

        @Override
        public AddShopsToGroupRequest build() {
            return new AddShopsToGroupRequest(this);
        } 

    } 

}
