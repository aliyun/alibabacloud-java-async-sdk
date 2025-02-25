// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableGatewayNFSVersionRequest} extends {@link RequestModel}
 *
 * <p>DisableGatewayNFSVersionRequest</p>
 */
public class DisableGatewayNFSVersionRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("NFSVersion")
    @Validation(required = true)
    private String NFSVersion;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DisableGatewayNFSVersionRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.NFSVersion = builder.NFSVersion;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableGatewayNFSVersionRequest create() {
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
     * @return NFSVersion
     */
    public String getNFSVersion() {
        return this.NFSVersion;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DisableGatewayNFSVersionRequest, Builder> {
        private String gatewayId; 
        private String NFSVersion; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DisableGatewayNFSVersionRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.NFSVersion = request.NFSVersion;
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
         * NFSVersion.
         */
        public Builder NFSVersion(String NFSVersion) {
            this.putQueryParameter("NFSVersion", NFSVersion);
            this.NFSVersion = NFSVersion;
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
        public DisableGatewayNFSVersionRequest build() {
            return new DisableGatewayNFSVersionRequest(this);
        } 

    } 

}
