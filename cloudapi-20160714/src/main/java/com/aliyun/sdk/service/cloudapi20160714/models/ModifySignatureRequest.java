// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySignatureRequest} extends {@link RequestModel}
 *
 * <p>ModifySignatureRequest</p>
 */
public class ModifySignatureRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SignatureId")
    @Validation(required = true)
    private String signatureId;

    @Query
    @NameInMap("SignatureKey")
    private String signatureKey;

    @Query
    @NameInMap("SignatureName")
    private String signatureName;

    @Query
    @NameInMap("SignatureSecret")
    private String signatureSecret;

    private ModifySignatureRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.signatureId = builder.signatureId;
        this.signatureKey = builder.signatureKey;
        this.signatureName = builder.signatureName;
        this.signatureSecret = builder.signatureSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySignatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return signatureKey
     */
    public String getSignatureKey() {
        return this.signatureKey;
    }

    /**
     * @return signatureName
     */
    public String getSignatureName() {
        return this.signatureName;
    }

    /**
     * @return signatureSecret
     */
    public String getSignatureSecret() {
        return this.signatureSecret;
    }

    public static final class Builder extends Request.Builder<ModifySignatureRequest, Builder> {
        private String securityToken; 
        private String signatureId; 
        private String signatureKey; 
        private String signatureName; 
        private String signatureSecret; 

        private Builder() {
            super();
        } 

        private Builder(ModifySignatureRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.signatureId = request.signatureId;
            this.signatureKey = request.signatureKey;
            this.signatureName = request.signatureName;
            this.signatureSecret = request.signatureSecret;
        } 

        /**
         * The security token included in the WebSocket request header. The system uses this token to authenticate the request.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The ID of the signature key that you want to manage.
         */
        public Builder signatureId(String signatureId) {
            this.putQueryParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * The new Key value of the key. The value must be 6 to 20 characters in length and can contain letters, digits, and underscores (\_). It must start with a letter.
         */
        public Builder signatureKey(String signatureKey) {
            this.putQueryParameter("SignatureKey", signatureKey);
            this.signatureKey = signatureKey;
            return this;
        }

        /**
         * The new name of the key. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (\_). It must start with a letter.
         */
        public Builder signatureName(String signatureName) {
            this.putQueryParameter("SignatureName", signatureName);
            this.signatureName = signatureName;
            return this;
        }

        /**
         * The new Secret value of the key. The value must be 6 to 30 characters in length and can contain letters, digits, and special characters. Special characters include underscores (\_), at signs (@), number signs (#), exclamation points (!), and asterisks (\*). The value must start with a letter.
         */
        public Builder signatureSecret(String signatureSecret) {
            this.putQueryParameter("SignatureSecret", signatureSecret);
            this.signatureSecret = signatureSecret;
            return this;
        }

        @Override
        public ModifySignatureRequest build() {
            return new ModifySignatureRequest(this);
        } 

    } 

}
