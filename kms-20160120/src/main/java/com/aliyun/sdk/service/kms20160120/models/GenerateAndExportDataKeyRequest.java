// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAndExportDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateAndExportDataKeyRequest</p>
 */
public class GenerateAndExportDataKeyRequest extends Request {
    @Query
    @NameInMap("EncryptionContext")
    private java.util.Map < String, ? > encryptionContext;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeySpec")
    private String keySpec;

    @Query
    @NameInMap("NumberOfBytes")
    @Validation(maximum = 1024)
    private Integer numberOfBytes;

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

    private GenerateAndExportDataKeyRequest(Builder builder) {
        super(builder);
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keySpec = builder.keySpec;
        this.numberOfBytes = builder.numberOfBytes;
        this.publicKeyBlob = builder.publicKeyBlob;
        this.wrappingAlgorithm = builder.wrappingAlgorithm;
        this.wrappingKeySpec = builder.wrappingKeySpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAndExportDataKeyRequest create() {
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
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return numberOfBytes
     */
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
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

    public static final class Builder extends Request.Builder<GenerateAndExportDataKeyRequest, Builder> {
        private java.util.Map < String, ? > encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 
        private String publicKeyBlob; 
        private String wrappingAlgorithm; 
        private String wrappingKeySpec; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAndExportDataKeyRequest response) {
            super(response);
            this.encryptionContext = response.encryptionContext;
            this.keyId = response.keyId;
            this.keySpec = response.keySpec;
            this.numberOfBytes = response.numberOfBytes;
            this.publicKeyBlob = response.publicKeyBlob;
            this.wrappingAlgorithm = response.wrappingAlgorithm;
            this.wrappingKeySpec = response.wrappingKeySpec;
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
         * KeySpec.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * NumberOfBytes.
         */
        public Builder numberOfBytes(Integer numberOfBytes) {
            this.putQueryParameter("NumberOfBytes", numberOfBytes);
            this.numberOfBytes = numberOfBytes;
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
        public GenerateAndExportDataKeyRequest build() {
            return new GenerateAndExportDataKeyRequest(this);
        } 

    } 

}
