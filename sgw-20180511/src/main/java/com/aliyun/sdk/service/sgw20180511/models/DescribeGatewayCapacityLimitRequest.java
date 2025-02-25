// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayCapacityLimitRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayCapacityLimitRequest</p>
 */
public class DescribeGatewayCapacityLimitRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SizeInGB")
    private Long sizeInGB;

    private DescribeGatewayCapacityLimitRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.sizeInGB = builder.sizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayCapacityLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sizeInGB
     */
    public Long getSizeInGB() {
        return this.sizeInGB;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayCapacityLimitRequest, Builder> {
        private String gatewayId; 
        private String securityToken; 
        private Long sizeInGB; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayCapacityLimitRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.sizeInGB = request.sizeInGB;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
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

        /**
         * SizeInGB.
         */
        public Builder sizeInGB(Long sizeInGB) {
            this.putQueryParameter("SizeInGB", sizeInGB);
            this.sizeInGB = sizeInGB;
            return this;
        }

        @Override
        public DescribeGatewayCapacityLimitRequest build() {
            return new DescribeGatewayCapacityLimitRequest(this);
        } 

    } 

}
