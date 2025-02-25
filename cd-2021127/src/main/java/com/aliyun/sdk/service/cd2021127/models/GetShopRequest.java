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
 * {@link GetShopRequest} extends {@link RequestModel}
 *
 * <p>GetShopRequest</p>
 */
public class GetShopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopId;

    private GetShopRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopId = builder.shopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShopRequest create() {
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
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    public static final class Builder extends Request.Builder<GetShopRequest, Builder> {
        private String country; 
        private String shopId; 

        private Builder() {
            super();
        } 

        private Builder(GetShopRequest request) {
            super(request);
            this.country = request.country;
            this.shopId = request.shopId;
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
         * <p>ShopId</p>
         */
        public Builder shopId(String shopId) {
            this.putBodyParameter("ShopId", shopId);
            this.shopId = shopId;
            return this;
        }

        @Override
        public GetShopRequest build() {
            return new GetShopRequest(this);
        } 

    } 

}
