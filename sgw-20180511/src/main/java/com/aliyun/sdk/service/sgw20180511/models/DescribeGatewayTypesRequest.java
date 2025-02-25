// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayTypesRequest</p>
 */
public class DescribeGatewayTypesRequest extends Request {
    @Query
    @NameInMap("GatewayLocation")
    @Validation(required = true)
    private String gatewayLocation;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayTypesRequest(Builder builder) {
        super(builder);
        this.gatewayLocation = builder.gatewayLocation;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayLocation
     */
    public String getGatewayLocation() {
        return this.gatewayLocation;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayTypesRequest, Builder> {
        private String gatewayLocation; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayTypesRequest request) {
            super(request);
            this.gatewayLocation = request.gatewayLocation;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayLocation.
         */
        public Builder gatewayLocation(String gatewayLocation) {
            this.putQueryParameter("GatewayLocation", gatewayLocation);
            this.gatewayLocation = gatewayLocation;
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
        public DescribeGatewayTypesRequest build() {
            return new DescribeGatewayTypesRequest(this);
        } 

    } 

}
