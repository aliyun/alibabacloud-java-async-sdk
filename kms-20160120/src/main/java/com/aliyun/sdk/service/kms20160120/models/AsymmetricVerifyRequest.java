// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricVerifyRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricVerifyRequest</p>
 */
public class AsymmetricVerifyRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("Digest")
    @Validation(required = true)
    private String digest;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeyVersionId")
    @Validation(required = true)
    private String keyVersionId;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private AsymmetricVerifyRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.digest = builder.digest;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricVerifyRequest create() {
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
     * @return digest
     */
    public String getDigest() {
        return this.digest;
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<AsymmetricVerifyRequest, Builder> {
        private String algorithm; 
        private String digest; 
        private String keyId; 
        private String keyVersionId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricVerifyRequest response) {
            super(response);
            this.algorithm = response.algorithm;
            this.digest = response.digest;
            this.keyId = response.keyId;
            this.keyVersionId = response.keyVersionId;
            this.value = response.value;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Digest.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
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
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public AsymmetricVerifyRequest build() {
            return new AsymmetricVerifyRequest(this);
        } 

    } 

}
