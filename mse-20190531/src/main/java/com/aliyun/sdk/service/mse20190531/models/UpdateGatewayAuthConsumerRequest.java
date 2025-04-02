// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGatewayAuthConsumerRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerRequest</p>
 */
public class UpdateGatewayAuthConsumerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

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

    private UpdateGatewayAuthConsumerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.description = builder.description;
        this.encodeType = builder.encodeType;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.jwks = builder.jwks;
        this.keyName = builder.keyName;
        this.keyValue = builder.keyValue;
        this.tokenName = builder.tokenName;
        this.tokenPass = builder.tokenPass;
        this.tokenPosition = builder.tokenPosition;
        this.tokenPrefix = builder.tokenPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayAuthConsumerRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateGatewayAuthConsumerRequest, Builder> {
        private String acceptLanguage; 
        private String description; 
        private String encodeType; 
        private String gatewayUniqueId; 
        private Long id; 
        private String jwks; 
        private String keyName; 
        private String keyValue; 
        private String tokenName; 
        private Boolean tokenPass; 
        private String tokenPosition; 
        private String tokenPrefix; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayAuthConsumerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.description = request.description;
            this.encodeType = request.encodeType;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.jwks = request.jwks;
            this.keyName = request.keyName;
            this.keyValue = request.keyValue;
            this.tokenName = request.tokenName;
            this.tokenPass = request.tokenPass;
            this.tokenPosition = request.tokenPosition;
            this.tokenPrefix = request.tokenPrefix;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The description of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The encryption type. Valid values:</p>
         * <ul>
         * <li>RSA</li>
         * <li>OCT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-90392d768a3847a7b804c505254d****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the consumer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JWT public key. The JSON format is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
         */
        public Builder jwks(String jwks) {
            this.putQueryParameter("Jwks", jwks);
            this.jwks = jwks;
            return this;
        }

        /**
         * <p>The name of the key used for JWT-based identity authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>iss</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>The value of the key used for JWT-based identity authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        public Builder keyValue(String keyValue) {
            this.putQueryParameter("KeyValue", keyValue);
            this.keyValue = keyValue;
            return this;
        }

        /**
         * <p>The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        public Builder tokenName(String tokenName) {
            this.putQueryParameter("TokenName", tokenName);
            this.tokenName = tokenName;
            return this;
        }

        /**
         * <p>Specifies whether to enable pass-through.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder tokenPass(Boolean tokenPass) {
            this.putQueryParameter("TokenPass", tokenPass);
            this.tokenPass = tokenPass;
            return this;
        }

        /**
         * <p>The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        public Builder tokenPosition(String tokenPosition) {
            this.putQueryParameter("TokenPosition", tokenPosition);
            this.tokenPosition = tokenPosition;
            return this;
        }

        /**
         * <p>The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        public Builder tokenPrefix(String tokenPrefix) {
            this.putQueryParameter("TokenPrefix", tokenPrefix);
            this.tokenPrefix = tokenPrefix;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerRequest build() {
            return new UpdateGatewayAuthConsumerRequest(this);
        } 

    } 

}
