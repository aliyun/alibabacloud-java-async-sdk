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
 * {@link UpdateProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductRequest</p>
 */
public class UpdateProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

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

    private UpdateProductRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductRequest create() {
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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

    public static final class Builder extends Request.Builder<UpdateProductRequest, Builder> {
        private String lang; 
        private String productId; 
        private String productName; 
        private String regionId; 
        private Long roleFor; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductRequest request) {
            super(request);
            this.lang = request.lang;
            this.productId = request.productId;
            this.productName = request.productName;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorName = request.vendorName;
        } 

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English. This parameter is required. If not provided, the service returns a 400 error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The product ID. Only products with ProductType set to custom support updates. System preset products (ProductType set to preset) cannot be modified. Calling this operation on a preset product returns a 403 error. To create a custom product, use the CreateProduct API first. This parameter is the resource identifier for the Update operation and is required. Only custom products can be updated. System preset products cannot be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The region where the data management center of Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID that the administrator uses to switch to another member\&quot;s view.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The vendor name.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder vendorName(String vendorName) {
            this.putBodyParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public UpdateProductRequest build() {
            return new UpdateProductRequest(this);
        } 

    } 

}
