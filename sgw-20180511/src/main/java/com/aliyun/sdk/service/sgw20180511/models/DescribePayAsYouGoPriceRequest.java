// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePayAsYouGoPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePayAsYouGoPriceRequest</p>
 */
public class DescribePayAsYouGoPriceRequest extends Request {
    @Query
    @NameInMap("GatewayClass")
    @Validation(required = true)
    private String gatewayClass;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribePayAsYouGoPriceRequest(Builder builder) {
        super(builder);
        this.gatewayClass = builder.gatewayClass;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePayAsYouGoPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayClass
     */
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribePayAsYouGoPriceRequest, Builder> {
        private String gatewayClass; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribePayAsYouGoPriceRequest request) {
            super(request);
            this.gatewayClass = request.gatewayClass;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayClass.
         */
        public Builder gatewayClass(String gatewayClass) {
            this.putQueryParameter("GatewayClass", gatewayClass);
            this.gatewayClass = gatewayClass;
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

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribePayAsYouGoPriceRequest build() {
            return new DescribePayAsYouGoPriceRequest(this);
        } 

    } 

}
