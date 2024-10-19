// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSignatureRequest} extends {@link RequestModel}
 *
 * <p>CreateSignatureRequest</p>
 */
public class CreateSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureSecret")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreateSignatureRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.signatureKey = request.signatureKey;
            this.signatureName = request.signatureName;
            this.signatureSecret = request.signatureSecret;
        } 

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The Key value of the key. The value must be 6 to 20 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwertyuiop</p>
         */
        public Builder signatureKey(String signatureKey) {
            this.putQueryParameter("SignatureKey", signatureKey);
            this.signatureKey = signatureKey;
            return this;
        }

        /**
         * <p>The displayed name of the key. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>backendsignature</p>
         */
        public Builder signatureName(String signatureName) {
            this.putQueryParameter("SignatureName", signatureName);
            this.signatureName = signatureName;
            return this;
        }

        /**
         * <p>The Secret value of the key. The value must be 6 to 30 characters in length and can contain letters, digits, and special characters. Special characters include underscores (_), at signs (@), number signs (#), exclamation points (!), and asterisks (*). The value must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfghjkl</p>
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
