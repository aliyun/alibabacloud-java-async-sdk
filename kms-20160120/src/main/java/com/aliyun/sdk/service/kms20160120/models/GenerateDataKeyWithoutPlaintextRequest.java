// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDataKeyWithoutPlaintextRequest} extends {@link RequestModel}
 *
 * <p>GenerateDataKeyWithoutPlaintextRequest</p>
 */
public class GenerateDataKeyWithoutPlaintextRequest extends Request {
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

    private GenerateDataKeyWithoutPlaintextRequest(Builder builder) {
        super(builder);
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keySpec = builder.keySpec;
        this.numberOfBytes = builder.numberOfBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDataKeyWithoutPlaintextRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateDataKeyWithoutPlaintextRequest, Builder> {
        private java.util.Map < String, ? > encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDataKeyWithoutPlaintextRequest request) {
            super(request);
            this.encryptionContext = request.encryptionContext;
            this.keyId = request.keyId;
            this.keySpec = request.keySpec;
            this.numberOfBytes = request.numberOfBytes;
        } 

        /**
         * A JSON string that consists of key-value pairs. If you specify this parameter, an equivalent value is required when you call the Decrypt operation. For more information, see [EncryptionContext](~~42975~~).
         */
        public Builder encryptionContext(java.util.Map < String, ? > encryptionContext) {
            String encryptionContextShrink = shrink(encryptionContext, "EncryptionContext", "json");
            this.putQueryParameter("EncryptionContext", encryptionContextShrink);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see Use aliases.
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
         * *   AES\_256: 256-bit symmetric key
         * *   AES\_128: 128-bit symmetric key
         * 
         * >  We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If both of them are not specified, KMS generates a 256-bit data key. If both of them are specified, KMS ignores the KeySpec parameter.
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

        @Override
        public GenerateDataKeyWithoutPlaintextRequest build() {
            return new GenerateDataKeyWithoutPlaintextRequest(this);
        } 

    } 

}
