// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureRequest} extends {@link RequestModel}
 *
 * <p>CreateSignatureRequest</p>
 */
public class CreateSignatureRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SignatureKey")
    @Validation(required = true)
    private String signatureKey;

    @Query
    @NameInMap("SignatureName")
    @Validation(required = true)
    private String signatureName;

    @Query
    @NameInMap("SignatureSecret")
    @Validation(required = true)
    private String signatureSecret;

    private CreateSignatureRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.signatureKey = builder.signatureKey;
        this.signatureName = builder.signatureName;
        this.signatureSecret = builder.signatureSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignatureRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSignatureRequest, Builder> {
        private String securityToken; 
        private String signatureKey; 
        private String signatureName; 
        private String signatureSecret; 

        private Builder() {
            super();
        } 

        private Builder(CreateSignatureRequest response) {
            super(response);
            this.securityToken = response.securityToken;
            this.signatureKey = response.signatureKey;
            this.signatureName = response.signatureName;
            this.signatureSecret = response.signatureSecret;
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
         * SignatureKey.
         */
        public Builder signatureKey(String signatureKey) {
            this.putQueryParameter("SignatureKey", signatureKey);
            this.signatureKey = signatureKey;
            return this;
        }

        /**
         * SignatureName.
         */
        public Builder signatureName(String signatureName) {
            this.putQueryParameter("SignatureName", signatureName);
            this.signatureName = signatureName;
            return this;
        }

        /**
         * SignatureSecret.
         */
        public Builder signatureSecret(String signatureSecret) {
            this.putQueryParameter("SignatureSecret", signatureSecret);
            this.signatureSecret = signatureSecret;
            return this;
        }

        @Override
        public CreateSignatureRequest build() {
            return new CreateSignatureRequest(this);
        } 

    } 

}
