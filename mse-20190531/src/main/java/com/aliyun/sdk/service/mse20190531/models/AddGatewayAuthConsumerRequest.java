// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayAuthConsumerRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayAuthConsumerRequest</p>
 */
public class AddGatewayAuthConsumerRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EncodeType")
    private String encodeType;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("Jwks")
    private String jwks;

    @Query
    @NameInMap("KeyName")
    private String keyName;

    @Query
    @NameInMap("KeyValue")
    private String keyValue;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("TokenName")
    private String tokenName;

    @Query
    @NameInMap("TokenPass")
    private Boolean tokenPass;

    @Query
    @NameInMap("TokenPosition")
    private String tokenPosition;

    @Query
    @NameInMap("TokenPrefix")
    private String tokenPrefix;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Jwks.
         */
        public Builder jwks(String jwks) {
            this.putQueryParameter("Jwks", jwks);
            this.jwks = jwks;
            return this;
        }

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * KeyValue.
         */
        public Builder keyValue(String keyValue) {
            this.putQueryParameter("KeyValue", keyValue);
            this.keyValue = keyValue;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TokenName.
         */
        public Builder tokenName(String tokenName) {
            this.putQueryParameter("TokenName", tokenName);
            this.tokenName = tokenName;
            return this;
        }

        /**
         * TokenPass.
         */
        public Builder tokenPass(Boolean tokenPass) {
            this.putQueryParameter("TokenPass", tokenPass);
            this.tokenPass = tokenPass;
            return this;
        }

        /**
         * TokenPosition.
         */
        public Builder tokenPosition(String tokenPosition) {
            this.putQueryParameter("TokenPosition", tokenPosition);
            this.tokenPosition = tokenPosition;
            return this;
        }

        /**
         * TokenPrefix.
         */
        public Builder tokenPrefix(String tokenPrefix) {
            this.putQueryParameter("TokenPrefix", tokenPrefix);
            this.tokenPrefix = tokenPrefix;
            return this;
        }

        /**
         * Type.
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
