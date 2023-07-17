// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationTokenRequest} extends {@link RequestModel}
 *
 * <p>GetIntegrationTokenRequest</p>
 */
public class GetIntegrationTokenRequest extends Request {
    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetIntegrationTokenRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetIntegrationTokenRequest, Builder> {
        private String productType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetIntegrationTokenRequest request) {
            super(request);
            this.productType = request.productType;
            this.regionId = request.regionId;
        } 

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
        public GetIntegrationTokenRequest build() {
            return new GetIntegrationTokenRequest(this);
        } 

    } 

}
