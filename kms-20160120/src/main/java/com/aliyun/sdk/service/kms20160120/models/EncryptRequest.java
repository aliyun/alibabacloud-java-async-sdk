// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncryptRequest} extends {@link RequestModel}
 *
 * <p>EncryptRequest</p>
 */
public class EncryptRequest extends Request {
    @Query
    @NameInMap("EncryptionContext")
    private java.util.Map < String, ? > encryptionContext;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("Plaintext")
    @Validation(required = true)
    private String plaintext;

    private EncryptRequest(Builder builder) {
        super(builder);
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptionContext
     */
    public java.util.Map < String, ? > getEncryptionContext() {
        return this.encryptionContext;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<EncryptRequest, Builder> {
        private java.util.Map < String, ? > encryptionContext; 
        private String keyId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(EncryptRequest response) {
            super(response);
            this.encryptionContext = response.encryptionContext;
            this.keyId = response.keyId;
            this.plaintext = response.plaintext;
        } 

        /**
         * EncryptionContext.
         */
        public Builder encryptionContext(java.util.Map < String, ? > encryptionContext) {
            this.putQueryParameter("EncryptionContext", encryptionContext);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * Plaintext.
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public EncryptRequest build() {
            return new EncryptRequest(this);
        } 

    } 

}
