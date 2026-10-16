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
 * {@link AsymmetricDecryptRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricDecryptRequest</p>
 */
public class AsymmetricDecryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recipient")
    private String recipient;

    private AsymmetricDecryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.dryRun = builder.dryRun;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.recipient = builder.recipient;
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
     * @return recipient
     */
    public String getRecipient() {
        return this.recipient;
    }

    public static final class Builder extends Request.Builder<AsymmetricDecryptRequest, Builder> {
        private String algorithm; 
        private String ciphertextBlob; 
        private String dryRun; 
        private String keyId; 
        private String keyVersionId; 
        private String recipient; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricDecryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.ciphertextBlob = request.ciphertextBlob;
            this.dryRun = request.dryRun;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
            this.recipient = request.recipient;
        } 

        /**
         * <p>The decryption algorithm.</p>
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
         * <p>The ciphertext to decrypt, encoded in Base64. </p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/148131.html">AsymmetricEncrypt</a> operation to generate the ciphertext.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>Specifies whether to enable DryRun mode. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false (default): Disabled.</li>
         * </ul>
         * <p>DryRun mode is used to test API calls, verify that you have the required permissions on the relevant resources, and check whether the request parameters are configured correctly. When DryRun mode is enabled, KMS always returns a failure with a reason. The failure reasons include the following:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not specified.</li>
         * <li>ValidationError: A parameter specified in the request is invalid.</li>
         * <li>AccessDeniedError: You do not have permission to perform this operation on the KMS resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the key. You can also specify a key alias or a key Amazon Resource Name (ARN). For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
         * <blockquote>
         * <p>To access a key that belongs to another Alibaba Cloud account, you must specify the key ARN. The key ARN format is <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz630494463ejqjx****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The key version ID. The globally unique identifier of the key version.</p>
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
         * Recipient.
         */
        public Builder recipient(String recipient) {
            this.putBodyParameter("Recipient", recipient);
            this.recipient = recipient;
            return this;
        }

        @Override
        public AsymmetricDecryptRequest build() {
            return new AsymmetricDecryptRequest(this);
        } 

    } 

}
