// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateDataKeyRequest</p>
 */
public class GenerateDataKeyRequest extends Request {
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

    private GenerateDataKeyRequest(Builder builder) {
        super(builder);
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keySpec = builder.keySpec;
        this.numberOfBytes = builder.numberOfBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDataKeyRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateDataKeyRequest, Builder> {
        private java.util.Map < String, ? > encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDataKeyRequest request) {
            super(request);
            this.encryptionContext = request.encryptionContext;
            this.keyId = request.keyId;
            this.keySpec = request.keySpec;
            this.numberOfBytes = request.numberOfBytes;
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

        @Override
        public GenerateDataKeyRequest build() {
            return new GenerateDataKeyRequest(this);
        } 

    } 

}
