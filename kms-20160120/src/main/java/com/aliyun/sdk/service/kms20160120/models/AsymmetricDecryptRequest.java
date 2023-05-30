// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricDecryptRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricDecryptRequest</p>
 */
public class AsymmetricDecryptRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    private String ciphertextBlob;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeyVersionId")
    @Validation(required = true)
    private String keyVersionId;

    private AsymmetricDecryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricDecryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public static final class Builder extends Request.Builder<AsymmetricDecryptRequest, Builder> {
        private String algorithm; 
        private String ciphertextBlob; 
        private String keyId; 
        private String keyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricDecryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.ciphertextBlob = request.ciphertextBlob;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
        } 

        /**
         * The decryption algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The ciphertext that you want to decrypt.
         * <p>
         * 
         * > * The value is encoded in Base64.
         * > * You can call the [AsymmetricEncrypt](~~148131~~) operation to generate the ciphertext.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The ID of the customer master key (CMK). The ID must be globally unique.
         * <p>
         * 
         * >  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Alias overview](~~68522~~).
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The version ID of the CMK. The ID must be globally unique.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        @Override
        public AsymmetricDecryptRequest build() {
            return new AsymmetricDecryptRequest(this);
        } 

    } 

}
