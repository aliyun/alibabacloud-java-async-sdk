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
 * {@link GetShopGroupRequest} extends {@link RequestModel}
 *
 * <p>GetShopGroupRequest</p>
 */
public class GetShopGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopGroupId;

    private GetShopGroupRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopGroupId = builder.shopGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShopGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetShopGroupRequest, Builder> {
        private String country; 
        private String shopGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetShopGroupRequest request) {
            super(request);
            this.country = request.country;
            this.shopGroupId = request.shopGroupId;
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

        @Override
        public GetShopGroupRequest build() {
            return new GetShopGroupRequest(this);
        } 

    } 

}
