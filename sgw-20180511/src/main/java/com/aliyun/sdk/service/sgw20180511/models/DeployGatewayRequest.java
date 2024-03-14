// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeployGatewayRequest</p>
 */
public class DeployGatewayRequest extends Request {
    @Query
    @NameInMap("GatewayClass")
    private String gatewayClass;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeployGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayClass = builder.gatewayClass;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployGatewayRequest create() {
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

    public static final class Builder extends Request.Builder<DeployGatewayRequest, Builder> {
        private String gatewayClass; 
        private String gatewayId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeployGatewayRequest request) {
            super(request);
            this.gatewayClass = request.gatewayClass;
            this.gatewayId = request.gatewayId;
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
        public DeployGatewayRequest build() {
            return new DeployGatewayRequest(this);
        } 

    } 

}
