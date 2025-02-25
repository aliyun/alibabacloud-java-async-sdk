// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUpgradeVersionRequest} extends {@link RequestModel}
 *
 * <p>CheckUpgradeVersionRequest</p>
 */
public class CheckUpgradeVersionRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    @Validation(required = true)
    private String clientUUID;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("GatewayVersion")
    private String gatewayVersion;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CheckUpgradeVersionRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.gatewayId = builder.gatewayId;
        this.gatewayVersion = builder.gatewayVersion;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUpgradeVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientUUID
     */
    public String getClientUUID() {
        return this.clientUUID;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayVersion
     */
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CheckUpgradeVersionRequest, Builder> {
        private String clientUUID; 
        private String gatewayId; 
        private String gatewayVersion; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CheckUpgradeVersionRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.gatewayId = request.gatewayId;
            this.gatewayVersion = request.gatewayVersion;
            this.securityToken = request.securityToken;
        } 

        /**
         * ClientUUID.
         */
        public Builder clientUUID(String clientUUID) {
            this.putQueryParameter("ClientUUID", clientUUID);
            this.clientUUID = clientUUID;
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
         * GatewayVersion.
         */
        public Builder gatewayVersion(String gatewayVersion) {
            this.putQueryParameter("GatewayVersion", gatewayVersion);
            this.gatewayVersion = gatewayVersion;
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
        public CheckUpgradeVersionRequest build() {
            return new CheckUpgradeVersionRequest(this);
        } 

    } 

}
