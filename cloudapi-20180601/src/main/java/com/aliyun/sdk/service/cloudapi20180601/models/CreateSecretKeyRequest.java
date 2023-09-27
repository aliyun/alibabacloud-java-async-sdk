// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretKeyRequest</p>
 */
public class CreateSecretKeyRequest extends Request {
    @Query
    @NameInMap("SecretKey")
    @Validation(required = true)
    private String secretKey;

    @Query
    @NameInMap("SecretKeyName")
    @Validation(required = true)
    private String secretKeyName;

    @Query
    @NameInMap("SecretValue")
    @Validation(required = true)
    private String secretValue;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateSecretKeyRequest(Builder builder) {
        super(builder);
        this.secretKey = builder.secretKey;
        this.secretKeyName = builder.secretKeyName;
        this.secretValue = builder.secretValue;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return secretKeyName
     */
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

    /**
     * @return secretValue
     */
    public String getSecretValue() {
        return this.secretValue;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateSecretKeyRequest, Builder> {
        private String secretKey; 
        private String secretKeyName; 
        private String secretValue; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretKeyRequest request) {
            super(request);
            this.secretKey = request.secretKey;
            this.secretKeyName = request.secretKeyName;
            this.secretValue = request.secretValue;
            this.securityToken = request.securityToken;
        } 

        /**
         * SecretKey.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * SecretKeyName.
         */
        public Builder secretKeyName(String secretKeyName) {
            this.putQueryParameter("SecretKeyName", secretKeyName);
            this.secretKeyName = secretKeyName;
            return this;
        }

        /**
         * SecretValue.
         */
        public Builder secretValue(String secretValue) {
            this.putQueryParameter("SecretValue", secretValue);
            this.secretValue = secretValue;
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
        public CreateSecretKeyRequest build() {
            return new CreateSecretKeyRequest(this);
        } 

    } 

}
