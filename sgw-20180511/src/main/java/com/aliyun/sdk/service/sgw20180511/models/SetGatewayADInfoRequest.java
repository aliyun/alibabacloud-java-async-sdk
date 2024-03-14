// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGatewayADInfoRequest} extends {@link RequestModel}
 *
 * <p>SetGatewayADInfoRequest</p>
 */
public class SetGatewayADInfoRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ServerIp")
    private String serverIp;

    @Query
    @NameInMap("Username")
    private String username;

    private SetGatewayADInfoRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.isEnabled = builder.isEnabled;
        this.password = builder.password;
        this.securityToken = builder.securityToken;
        this.serverIp = builder.serverIp;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGatewayADInfoRequest create() {
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
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<SetGatewayADInfoRequest, Builder> {
        private String gatewayId; 
        private Boolean isEnabled; 
        private String password; 
        private String securityToken; 
        private String serverIp; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(SetGatewayADInfoRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.isEnabled = request.isEnabled;
            this.password = request.password;
            this.securityToken = request.securityToken;
            this.serverIp = request.serverIp;
            this.username = request.username;
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
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.putQueryParameter("IsEnabled", isEnabled);
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
         * ServerIp.
         */
        public Builder serverIp(String serverIp) {
            this.putQueryParameter("ServerIp", serverIp);
            this.serverIp = serverIp;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public SetGatewayADInfoRequest build() {
            return new SetGatewayADInfoRequest(this);
        } 

    } 

}
