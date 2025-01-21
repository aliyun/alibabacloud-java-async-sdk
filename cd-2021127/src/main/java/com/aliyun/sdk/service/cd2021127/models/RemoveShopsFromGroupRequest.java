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
 * {@link RemoveShopsFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveShopsFromGroupRequest</p>
 */
public class RemoveShopsFromGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> shopIdList;

    private RemoveShopsFromGroupRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopGroupId = builder.shopGroupId;
        this.shopIdList = builder.shopIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveShopsFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
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

    public static final class Builder extends Request.Builder<RemoveShopsFromGroupRequest, Builder> {
        private String country; 
        private String shopGroupId; 
        private java.util.List<String> shopIdList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveShopsFromGroupRequest request) {
            super(request);
            this.country = request.country;
            this.shopGroupId = request.shopGroupId;
            this.shopIdList = request.shopIdList;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
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
        public RemoveShopsFromGroupRequest build() {
            return new RemoveShopsFromGroupRequest(this);
        } 

    } 

}
