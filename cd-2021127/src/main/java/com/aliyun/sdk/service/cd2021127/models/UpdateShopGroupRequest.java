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
 * {@link UpdateShopGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateShopGroupRequest</p>
 */
public class UpdateShopGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopGroupName;

    private UpdateShopGroupRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopGroupId = builder.shopGroupId;
        this.shopGroupName = builder.shopGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateShopGroupRequest create() {
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
     * @return shopGroupName
     */
    public String getShopGroupName() {
        return this.shopGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateShopGroupRequest, Builder> {
        private String country; 
        private String shopGroupId; 
        private String shopGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateShopGroupRequest request) {
            super(request);
            this.country = request.country;
            this.shopGroupId = request.shopGroupId;
            this.shopGroupName = request.shopGroupName;
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
         * 
         * <strong>example:</strong>
         * <p>ShopGroupName</p>
         */
        public Builder shopGroupName(String shopGroupName) {
            this.putBodyParameter("ShopGroupName", shopGroupName);
            this.shopGroupName = shopGroupName;
            return this;
        }

        @Override
        public UpdateShopGroupRequest build() {
            return new UpdateShopGroupRequest(this);
        } 

    } 

}
