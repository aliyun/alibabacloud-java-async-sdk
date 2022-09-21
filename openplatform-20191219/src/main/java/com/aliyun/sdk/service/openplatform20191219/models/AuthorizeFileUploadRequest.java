// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openplatform20191219.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeFileUploadRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeFileUploadRequest</p>
 */
public class AuthorizeFileUploadRequest extends Request {
    @Query
    @NameInMap("Product")
    @Validation(required = true)
    private String product;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private AuthorizeFileUploadRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeFileUploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AuthorizeFileUploadRequest, Builder> {
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeFileUploadRequest request) {
            super(request);
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AuthorizeFileUploadRequest build() {
            return new AuthorizeFileUploadRequest(this);
        } 

    } 

}
