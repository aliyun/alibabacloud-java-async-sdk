// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateStsTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateStsTokenRequest</p>
 */
public class GenerateStsTokenRequest extends Request {
    @Query
    @NameInMap("ExpireInSeconds")
    private Long expireInSeconds;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TokenType")
    private String tokenType;

    private GenerateStsTokenRequest(Builder builder) {
        super(builder);
        this.expireInSeconds = builder.expireInSeconds;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateStsTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireInSeconds
     */
    public Long getExpireInSeconds() {
        return this.expireInSeconds;
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
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<GenerateStsTokenRequest, Builder> {
        private Long expireInSeconds; 
        private String gatewayId; 
        private String securityToken; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateStsTokenRequest request) {
            super(request);
            this.expireInSeconds = request.expireInSeconds;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.tokenType = request.tokenType;
        } 

        /**
         * ExpireInSeconds.
         */
        public Builder expireInSeconds(Long expireInSeconds) {
            this.putQueryParameter("ExpireInSeconds", expireInSeconds);
            this.expireInSeconds = expireInSeconds;
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

        /**
         * TokenType.
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public GenerateStsTokenRequest build() {
            return new GenerateStsTokenRequest(this);
        } 

    } 

}
