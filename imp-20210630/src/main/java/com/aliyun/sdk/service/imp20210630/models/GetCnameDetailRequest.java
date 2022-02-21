// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCnameDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCnameDetailRequest</p>
 */
public class GetCnameDetailRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetCnameDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.domainName = builder.domainName;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCnameDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetCnameDetailRequest, Builder> {
        private String appId; 
        private String domainName; 
        private String productCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCnameDetailRequest response) {
            super(response);
            this.appId = response.appId;
            this.domainName = response.domainName;
            this.productCode = response.productCode;
            this.regionId = response.regionId;
        } 

        /**
         * 应用id
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 域名的名称
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * 云产品code
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCnameDetailRequest build() {
            return new GetCnameDetailRequest(this);
        } 

    } 

}
