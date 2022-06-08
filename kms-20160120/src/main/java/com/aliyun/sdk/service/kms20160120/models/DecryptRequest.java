// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptRequest} extends {@link RequestModel}
 *
 * <p>DecryptRequest</p>
 */
public class DecryptRequest extends Request {
    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    private String ciphertextBlob;

    @Query
    @NameInMap("EncryptionContext")
    private java.util.Map < String, ? > encryptionContext;

    private DecryptRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.encryptionContext = builder.encryptionContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return encryptionContext
     */
    public java.util.Map < String, ? > getEncryptionContext() {
        return this.encryptionContext;
    }

    public static final class Builder extends Request.Builder<DecryptRequest, Builder> {
        private String ciphertextBlob; 
        private java.util.Map < String, ? > encryptionContext; 

        private Builder() {
            super();
        } 

        private Builder(DecryptRequest request) {
            super(request);
            this.ciphertextBlob = request.ciphertextBlob;
            this.encryptionContext = request.encryptionContext;
        } 

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * EncryptionContext.
         */
        public Builder encryptionContext(java.util.Map < String, ? > encryptionContext) {
            String encryptionContextShrink = shrink(encryptionContext, "EncryptionContext", "json");
            this.putQueryParameter("EncryptionContext", encryptionContextShrink);
            this.encryptionContext = encryptionContext;
            return this;
        }

        @Override
        public DecryptRequest build() {
            return new DecryptRequest(this);
        } 

    } 

}
