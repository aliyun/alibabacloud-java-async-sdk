// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayLoggingRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayLoggingRequest</p>
 */
public class DescribeGatewayLoggingRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayLoggingRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayLoggingRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeGatewayLoggingRequest, Builder> {
        private String gatewayId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayLoggingRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
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

        @Override
        public DescribeGatewayLoggingRequest build() {
            return new DescribeGatewayLoggingRequest(this);
        } 

    } 

}
