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

    private AsymmetricSignRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.digest = builder.digest;
        this.dryRun = builder.dryRun;
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

    public static final class Builder extends Request.Builder<AsymmetricSignRequest, Builder> {
        private String algorithm; 
        private String digest; 
        private String dryRun; 
        private String keyId; 
        private String keyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricSignRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.digest = request.digest;
            this.dryRun = request.dryRun;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
        } 

        /**
         * <p>The signature algorithm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_PSS_SHA_256</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The digest of the original message. The digest is generated using the hash algorithm that corresponds to the value of the Algorithm parameter.</p>
         * <blockquote>
         * <ul>
         * <li>The value is Base64-encoded.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For information about how to calculate a message digest, see the &quot;Pre-signing: calculate a message digest&quot; section of the <a href="https://help.aliyun.com/document_detail/148146.html">Asymmetric digital signature</a> topic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiu****=</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dry-run feature.</p>
         * <ul>
         * <li><p>true: enables the feature.</p>
         * </li>
         * <li><p>false (default): disables the feature.</p>
         * </li>
         * </ul>
         * <p>The dry-run feature is used to test API calls and verify the permissions on the resources that you have and the validity of the request parameters. If you enable the dry-run feature, KMS always returns a failure response and a failure reason. The failure reasons include the following:</p>
         * <ul>
         * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter is not configured.</p>
         * </li>
         * <li><p>ValidationError: The specified parameters in the request are invalid.</p>
         * </li>
         * <li><p>AccessDeniedError: You are not authorized to perform the operation on the KMS resource.</p>
         * </li>
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
         * <p>The globally unique identifier (GUID) of the customer master key (CMK).</p>
         * <blockquote>
         * <p>You can also specify the alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Overview of aliases</a>.</p>
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
         * <p>The ID of the key version. The ID must be the GUID of the key version.</p>
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

        @Override
        public AsymmetricSignRequest build() {
            return new AsymmetricSignRequest(this);
        } 

    } 

}
