// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAndExportDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateAndExportDataKeyRequest</p>
 */
public class GenerateAndExportDataKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionContext")
    private java.util.Map < String, ? > encryptionContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfBytes")
    @com.aliyun.core.annotation.Validation(maximum = 1024)
    private Integer numberOfBytes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrappingAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wrappingAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrappingKeySpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wrappingKeySpec;

    private GenerateAndExportDataKeyRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
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
        private String dryRun; 
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

        private Builder(GenerateAndExportDataKeyRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.encryptionContext = request.encryptionContext;
            this.keyId = request.keyId;
            this.keySpec = request.keySpec;
            this.numberOfBytes = request.numberOfBytes;
            this.publicKeyBlob = request.publicKeyBlob;
            this.wrappingAlgorithm = request.wrappingAlgorithm;
            this.wrappingKeySpec = request.wrappingKeySpec;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * A JSON string of key-value pairs. If you specify this parameter here, an equivalent value is required when you decrypt or re-encrypt the data key. For more information, see [EncryptionContext](~~42975~~).
         */
        public Builder encryptionContext(java.util.Map < String, ? > encryptionContext) {
            String encryptionContextShrink = shrink(encryptionContext, "EncryptionContext", "json");
            this.putQueryParameter("EncryptionContext", encryptionContextShrink);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see [Use aliases](~~68522~~).
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The length of the data key that you want to generate. Valid values:
         * <p>
         * 
         * *   AES\_256: a 256-bit symmetric key
         * *   AES\_128: a 128-bit symmetric key
         * 
         * >  We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If both parameters are not specified, KMS generates a 256-bit data key. If both parameters are specified, KMS ignores the KeySpec parameter.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * The length of the data key that you want to generate.
         * <p>
         * 
         * Valid values: 1 to 1024.
         * 
         * Unit: bytes.
         */
        public Builder numberOfBytes(Integer numberOfBytes) {
            this.putQueryParameter("NumberOfBytes", numberOfBytes);
            this.numberOfBytes = numberOfBytes;
            return this;
        }

        /**
         * A Base64-encoded public key.
         */
        public Builder publicKeyBlob(String publicKeyBlob) {
            this.putQueryParameter("PublicKeyBlob", publicKeyBlob);
            this.publicKeyBlob = publicKeyBlob;
            return this;
        }

        /**
         * The encryption algorithm based on which you want to use the public key specified by PublicKeyBlob to encrypt the data key. For more information about encryption algorithms, see [AsymmetricDecrypt](~~148130~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   RSAES_OAEP_SHA\_256
         * *   RSAES_OAEP_SHA\_1
         * *   SM2PKE
         */
        public Builder wrappingAlgorithm(String wrappingAlgorithm) {
            this.putQueryParameter("WrappingAlgorithm", wrappingAlgorithm);
            this.wrappingAlgorithm = wrappingAlgorithm;
            return this;
        }

        /**
         * The key type of the public key specified by PublicKeyBlob. For more information about key types, see [Introduction to asymmetric keys](~~148147~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   RSA\_2048
         * *   EC_SM2
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
