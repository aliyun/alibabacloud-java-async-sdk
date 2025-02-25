// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetGatewayPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetGatewayPasswordRequest</p>
 */
public class ResetGatewayPasswordRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private ResetGatewayPasswordRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.password = builder.password;
        this.securityToken = builder.securityToken;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetGatewayPasswordRequest create() {
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ResetGatewayPasswordRequest, Builder> {
        private String gatewayId; 
        private String password; 
        private String securityToken; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ResetGatewayPasswordRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.password = request.password;
            this.securityToken = request.securityToken;
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
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ResetGatewayPasswordRequest build() {
            return new ResetGatewayPasswordRequest(this);
        } 

    } 

}
