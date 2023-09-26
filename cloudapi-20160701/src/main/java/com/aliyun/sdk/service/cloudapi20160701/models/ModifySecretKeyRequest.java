// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecretKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifySecretKeyRequest</p>
 */
public class ModifySecretKeyRequest extends Request {
    @Query
    @NameInMap("SecretKey")
    private String secretKey;

    @Query
    @NameInMap("SecretKeyId")
    @Validation(required = true)
    private String secretKeyId;

    @Query
    @NameInMap("SecretKeyName")
    private String secretKeyName;

    @Query
    @NameInMap("SecretValue")
    private String secretValue;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifySecretKeyRequest(Builder builder) {
        super(builder);
        this.secretKey = builder.secretKey;
        this.secretKeyId = builder.secretKeyId;
        this.secretKeyName = builder.secretKeyName;
        this.secretValue = builder.secretValue;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecretKeyRequest create() {
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
     * @return secretKeyId
     */
    public String getSecretKeyId() {
        return this.secretKeyId;
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

    public static final class Builder extends Request.Builder<ModifySecretKeyRequest, Builder> {
        private String secretKey; 
        private String secretKeyId; 
        private String secretKeyName; 
        private String secretValue; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecretKeyRequest request) {
            super(request);
            this.secretKey = request.secretKey;
            this.secretKeyId = request.secretKeyId;
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
         * SecretKeyId.
         */
        public Builder secretKeyId(String secretKeyId) {
            this.putQueryParameter("SecretKeyId", secretKeyId);
            this.secretKeyId = secretKeyId;
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
        public ModifySecretKeyRequest build() {
            return new ModifySecretKeyRequest(this);
        } 

    } 

}
