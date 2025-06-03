// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
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
        private String dryRun; 
        private String keyId; 
        private String keyVersionId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricEncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.dryRun = request.dryRun;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
            this.plaintext = request.plaintext;
        } 

        /**
         * <p>The encryption algorithm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSAES_OAEP_SHA_1</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
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
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <blockquote>
         * <p> You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Overview of aliases</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The version ID of the CMK. The ID must be globally unique.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/133966.html">ListKeyVersions</a> operation to query the versions of a CMK. The ID of a version is specified by the KeyVersionId parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The plaintext that you want to encrypt. The plaintext must be Base64-encoded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SGVsbG8gd29ybGQ=</p>
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
