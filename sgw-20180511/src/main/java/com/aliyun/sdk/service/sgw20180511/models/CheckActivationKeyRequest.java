// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckActivationKeyRequest} extends {@link RequestModel}
 *
 * <p>CheckActivationKeyRequest</p>
 */
public class CheckActivationKeyRequest extends Request {
    @Query
    @NameInMap("CryptKey")
    private String cryptKey;

    @Query
    @NameInMap("CryptText")
    private String cryptText;

    @Query
    @NameInMap("GatewayId")
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Token")
    private String token;

    private CheckActivationKeyRequest(Builder builder) {
        super(builder);
        this.cryptKey = builder.cryptKey;
        this.cryptText = builder.cryptText;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckActivationKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cryptKey
     */
    public String getCryptKey() {
        return this.cryptKey;
    }

    /**
     * @return cryptText
     */
    public String getCryptText() {
        return this.cryptText;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<CheckActivationKeyRequest, Builder> {
        private String cryptKey; 
        private String cryptText; 
        private String gatewayId; 
        private String securityToken; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(CheckActivationKeyRequest request) {
            super(request);
            this.cryptKey = request.cryptKey;
            this.cryptText = request.cryptText;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.token = request.token;
        } 

        /**
         * CryptKey.
         */
        public Builder cryptKey(String cryptKey) {
            this.putQueryParameter("CryptKey", cryptKey);
            this.cryptKey = cryptKey;
            return this;
        }

        /**
         * CryptText.
         */
        public Builder cryptText(String cryptText) {
            this.putQueryParameter("CryptText", cryptText);
            this.cryptText = cryptText;
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
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public CheckActivationKeyRequest build() {
            return new CheckActivationKeyRequest(this);
        } 

    } 

}
