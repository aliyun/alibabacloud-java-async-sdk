// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateMqttTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateMqttTokenRequest</p>
 */
public class GenerateMqttTokenRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    @Validation(required = true)
    private String clientUUID;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private GenerateMqttTokenRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMqttTokenRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<GenerateMqttTokenRequest, Builder> {
        private String clientUUID; 
        private String gatewayId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(GenerateMqttTokenRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.gatewayId = request.gatewayId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public GenerateMqttTokenRequest build() {
            return new GenerateMqttTokenRequest(this);
        } 

    } 

}
