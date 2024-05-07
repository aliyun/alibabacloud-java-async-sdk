// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayAuthConsumerRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayAuthConsumerRequest</p>
 */
public class AddGatewayAuthConsumerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodeType")
    private String encodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Jwks")
    private String jwks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyValue")
    private String keyValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenName")
    private String tokenName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenPass")
    private Boolean tokenPass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenPosition")
    private String tokenPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenPrefix")
    private String tokenPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AddGatewayAuthConsumerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.description = builder.description;
        this.encodeType = builder.encodeType;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.jwks = builder.jwks;
        this.keyName = builder.keyName;
        this.keyValue = builder.keyValue;
        this.name = builder.name;
        this.tokenName = builder.tokenName;
        this.tokenPass = builder.tokenPass;
        this.tokenPosition = builder.tokenPosition;
        this.tokenPrefix = builder.tokenPrefix;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayAuthConsumerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return jwks
     */
    public String getJwks() {
        return this.jwks;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return keyValue
     */
    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tokenName
     */
    public String getTokenName() {
        return this.tokenName;
    }

    /**
     * @return tokenPass
     */
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    /**
     * @return tokenPosition
     */
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    /**
     * @return tokenPrefix
     */
    public String getTokenPrefix() {
        return this.tokenPrefix;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddGatewayAuthConsumerRequest, Builder> {
        private String acceptLanguage; 
        private String description; 
        private String encodeType; 
        private String gatewayUniqueId; 
        private String jwks; 
        private String keyName; 
        private String keyValue; 
        private String name; 
        private String tokenName; 
        private Boolean tokenPass; 
        private String tokenPosition; 
        private String tokenPrefix; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayAuthConsumerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.description = request.description;
            this.encodeType = request.encodeType;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.jwks = request.jwks;
            this.keyName = request.keyName;
            this.keyValue = request.keyValue;
            this.name = request.name;
            this.tokenName = request.tokenName;
            this.tokenPass = request.tokenPass;
            this.tokenPosition = request.tokenPosition;
            this.tokenPrefix = request.tokenPrefix;
            this.type = request.type;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The description of the consumer.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The encryption type. Valid values:
         * <p>
         * 
         * *   RSA
         * *   OCT
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The JWT public key. The JSON format is supported.
         */
        public Builder jwks(String jwks) {
            this.putQueryParameter("Jwks", jwks);
            this.jwks = jwks;
            return this;
        }

        /**
         * The name of the key used for JWT-based identity authentication.
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * The value of the key used for JWT-based identity authentication.
         */
        public Builder keyValue(String keyValue) {
            this.putQueryParameter("KeyValue", keyValue);
            this.keyValue = keyValue;
            return this;
        }

        /**
         * The name of the consumer.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.
         */
        public Builder tokenName(String tokenName) {
            this.putQueryParameter("TokenName", tokenName);
            this.tokenName = tokenName;
            return this;
        }

        /**
         * Specifies whether to enable pass-through.
         */
        public Builder tokenPass(Boolean tokenPass) {
            this.putQueryParameter("TokenPass", tokenPass);
            this.tokenPass = tokenPass;
            return this;
        }

        /**
         * The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.
         */
        public Builder tokenPosition(String tokenPosition) {
            this.putQueryParameter("TokenPosition", tokenPosition);
            this.tokenPosition = tokenPosition;
            return this;
        }

        /**
         * The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.
         */
        public Builder tokenPrefix(String tokenPrefix) {
            this.putQueryParameter("TokenPrefix", tokenPrefix);
            this.tokenPrefix = tokenPrefix;
            return this;
        }

        /**
         * The authentication type. Valid values:
         * <p>
         * 
         * *   JWT
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddGatewayAuthConsumerRequest build() {
            return new AddGatewayAuthConsumerRequest(this);
        } 

    } 

}
