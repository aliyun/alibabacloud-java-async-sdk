// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricEncryptRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricEncryptRequest</p>
 */
public class AsymmetricEncryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plaintext")
    @com.aliyun.core.annotation.Validation(required = true)
    private String plaintext;

    private AsymmetricEncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricEncryptRequest create() {
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

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<AsymmetricEncryptRequest, Builder> {
        private String algorithm; 
        private String keyId; 
        private String keyVersionId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricEncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
            this.plaintext = request.plaintext;
        } 

        /**
         * The encryption algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Overview of aliases](~~68522~~).
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The version ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  You can call the [ListKeyVersions](~~133966~~) operation to query the versions of a CMK. The ID of a version is specified by the KeyVersionId parameter.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The plaintext that you want to encrypt. The plaintext must be Base64-encoded.
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public AsymmetricEncryptRequest build() {
            return new AsymmetricEncryptRequest(this);
        } 

    } 

}
