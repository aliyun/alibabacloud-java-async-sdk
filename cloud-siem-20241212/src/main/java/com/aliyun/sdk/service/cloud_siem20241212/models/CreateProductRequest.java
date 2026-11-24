// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateProductRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRequest</p>
 */
public class CreateProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorName")
    private String vendorName;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.productName = builder.productName;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String lang; 
        private String productName; 
        private String regionId; 
        private Long roleFor; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest request) {
            super(request);
            this.lang = request.lang;
            this.productName = request.productName;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorName = request.vendorName;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * VendorName.
         */
        public Builder vendorName(String vendorName) {
            this.putBodyParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

}
