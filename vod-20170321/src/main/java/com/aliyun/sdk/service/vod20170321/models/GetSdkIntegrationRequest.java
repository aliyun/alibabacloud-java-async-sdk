// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetSdkIntegrationRequest} extends {@link RequestModel}
 *
 * <p>GetSdkIntegrationRequest</p>
 */
public class GetSdkIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationType")
    private String integrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkCodeId")
    private Integer sdkCodeId;

    private GetSdkIntegrationRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.integrationType = builder.integrationType;
        this.platform = builder.platform;
        this.product = builder.product;
        this.sdkCodeId = builder.sdkCodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSdkIntegrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return integrationType
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return sdkCodeId
     */
    public Integer getSdkCodeId() {
        return this.sdkCodeId;
    }

    public static final class Builder extends Request.Builder<GetSdkIntegrationRequest, Builder> {
        private String businessType; 
        private String integrationType; 
        private String platform; 
        private String product; 
        private Integer sdkCodeId; 

        private Builder() {
            super();
        } 

        private Builder(GetSdkIntegrationRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.integrationType = request.integrationType;
            this.platform = request.platform;
            this.product = request.product;
            this.sdkCodeId = request.sdkCodeId;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * IntegrationType.
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
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
         * SdkCodeId.
         */
        public Builder sdkCodeId(Integer sdkCodeId) {
            this.putQueryParameter("SdkCodeId", sdkCodeId);
            this.sdkCodeId = sdkCodeId;
            return this;
        }

        @Override
        public GetSdkIntegrationRequest build() {
            return new GetSdkIntegrationRequest(this);
        } 

    } 

}
