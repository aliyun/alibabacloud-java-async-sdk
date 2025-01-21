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
 * {@link DeleteProductImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductImageRequest</p>
 */
public class DeleteProductImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductImageIds")
    private java.util.List<String> productImageIds;

    private DeleteProductImageRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.productCode = builder.productCode;
        this.productImageIds = builder.productImageIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductImageRequest create() {
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productImageIds
     */
    public java.util.List<String> getProductImageIds() {
        return this.productImageIds;
    }

    public static final class Builder extends Request.Builder<DeleteProductImageRequest, Builder> {
        private String country; 
        private String productCode; 
        private java.util.List<String> productImageIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductImageRequest request) {
            super(request);
            this.country = request.country;
            this.productCode = request.productCode;
            this.productImageIds = request.productImageIds;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductImageIds.
         */
        public Builder productImageIds(java.util.List<String> productImageIds) {
            String productImageIdsShrink = shrink(productImageIds, "ProductImageIds", "json");
            this.putBodyParameter("ProductImageIds", productImageIdsShrink);
            this.productImageIds = productImageIds;
            return this;
        }

        @Override
        public DeleteProductImageRequest build() {
            return new DeleteProductImageRequest(this);
        } 

    } 

}
