// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretKeyRequest</p>
 */
public class DeleteSecretKeyRequest extends Request {
    @Query
    @NameInMap("SecretKeyId")
    @Validation(required = true)
    private String secretKeyId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteSecretKeyRequest(Builder builder) {
        super(builder);
        this.secretKeyId = builder.secretKeyId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretKeyId
     */
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteSecretKeyRequest, Builder> {
        private String secretKeyId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretKeyRequest request) {
            super(request);
            this.secretKeyId = request.secretKeyId;
            this.securityToken = request.securityToken;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteSecretKeyRequest build() {
            return new DeleteSecretKeyRequest(this);
        } 

    } 

}
