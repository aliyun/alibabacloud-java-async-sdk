// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayStockRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayStockRequest</p>
 */
public class DescribeGatewayStockRequest extends Request {
    @Query
    @NameInMap("GatewayRegionId")
    @Validation(required = true)
    private String gatewayRegionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayStockRequest(Builder builder) {
        super(builder);
        this.gatewayRegionId = builder.gatewayRegionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayStockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayRegionId
     */
    public String getGatewayRegionId() {
        return this.gatewayRegionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayStockRequest, Builder> {
        private String gatewayRegionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayStockRequest request) {
            super(request);
            this.gatewayRegionId = request.gatewayRegionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayRegionId.
         */
        public Builder gatewayRegionId(String gatewayRegionId) {
            this.putQueryParameter("GatewayRegionId", gatewayRegionId);
            this.gatewayRegionId = gatewayRegionId;
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
        public DescribeGatewayStockRequest build() {
            return new DescribeGatewayStockRequest(this);
        } 

    } 

}
