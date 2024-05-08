// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricSignRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricSignRequest</p>
 */
public class AsymmetricSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String digest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyVersionId;

    private AsymmetricSignRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.digest = builder.digest;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricSignRequest create() {
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

    public static final class Builder extends Request.Builder<AsymmetricSignRequest, Builder> {
        private String algorithm; 
        private String digest; 
        private String keyId; 
        private String keyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricSignRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.digest = request.digest;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
        } 

        /**
         * The version ID of the CMK. The ID must be globally unique.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The signature algorithm.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **AsymmetricSign**.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The ID of the customer master key (CMK). The ID must be globally unique.
         * <p>
         * 
         * >  You can also set this parameter to an alias that is bound to the CMK. For more information, see [Alias overview](~~68522~~).
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        @Override
        public AsymmetricSignRequest build() {
            return new AsymmetricSignRequest(this);
        } 

    } 

}
