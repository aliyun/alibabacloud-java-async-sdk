// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataKeyRequest} extends {@link RequestModel}
 *
 * <p>ExportDataKeyRequest</p>
 */
public class ExportDataKeyRequest extends Request {
    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    private String ciphertextBlob;

    @Query
    @NameInMap("EncryptionContext")
    private java.util.Map < String, ? > encryptionContext;

    @Query
    @NameInMap("PublicKeyBlob")
    @Validation(required = true)
    private String publicKeyBlob;

    @Query
    @NameInMap("WrappingAlgorithm")
    @Validation(required = true)
    private String wrappingAlgorithm;

    @Query
    @NameInMap("WrappingKeySpec")
    @Validation(required = true)
    private String wrappingKeySpec;

    private ExportDataKeyRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.encryptionContext = builder.encryptionContext;
        this.publicKeyBlob = builder.publicKeyBlob;
        this.wrappingAlgorithm = builder.wrappingAlgorithm;
        this.wrappingKeySpec = builder.wrappingKeySpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDataKeyRequest create() {
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

    /**
     * @return publicKeyBlob
     */
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    /**
     * @return wrappingAlgorithm
     */
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    /**
     * @return wrappingKeySpec
     */
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public static final class Builder extends Request.Builder<ExportDataKeyRequest, Builder> {
        private String ciphertextBlob; 
        private java.util.Map < String, ? > encryptionContext; 
        private String publicKeyBlob; 
        private String wrappingAlgorithm; 
        private String wrappingKeySpec; 

        private Builder() {
            super();
        } 

        private Builder(ExportDataKeyRequest response) {
            super(response);
            this.ciphertextBlob = response.ciphertextBlob;
            this.encryptionContext = response.encryptionContext;
            this.publicKeyBlob = response.publicKeyBlob;
            this.wrappingAlgorithm = response.wrappingAlgorithm;
            this.wrappingKeySpec = response.wrappingKeySpec;
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
            this.putQueryParameter("EncryptionContext", encryptionContext);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * PublicKeyBlob.
         */
        public Builder publicKeyBlob(String publicKeyBlob) {
            this.putQueryParameter("PublicKeyBlob", publicKeyBlob);
            this.publicKeyBlob = publicKeyBlob;
            return this;
        }

        /**
         * WrappingAlgorithm.
         */
        public Builder wrappingAlgorithm(String wrappingAlgorithm) {
            this.putQueryParameter("WrappingAlgorithm", wrappingAlgorithm);
            this.wrappingAlgorithm = wrappingAlgorithm;
            return this;
        }

        /**
         * WrappingKeySpec.
         */
        public Builder wrappingKeySpec(String wrappingKeySpec) {
            this.putQueryParameter("WrappingKeySpec", wrappingKeySpec);
            this.wrappingKeySpec = wrappingKeySpec;
            return this;
        }

        @Override
        public ExportDataKeyRequest build() {
            return new ExportDataKeyRequest(this);
        } 

    } 

}
