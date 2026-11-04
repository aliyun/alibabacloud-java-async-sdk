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
         * <p>Specifies whether to enable the dry run mode. Valid values:</p>
         * <ul>
         * <li>true: enables the dry run mode.</li>
         * <li>false: disables the dry run mode. This is the default value.</li>
         * </ul>
         * <p>The dry run mode is used to test API calls and verify whether you have the required permissions on the resources and whether the request parameters are correctly configured. When the dry run mode is enabled, KMS always returns a failure and provides the cause of the failure. The causes include:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not configured.</li>
         * <li>ValidationError: A specified parameter in the request is invalid.</li>
         * <li>AccessDeniedError: You do not have permissions to perform the operation on the KMS resource.</li>
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
         * <p>The ID of the key. You can also specify the alias or Alibaba Cloud Resource Name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
         * <blockquote>
         * <p>To access a key that belongs to another Alibaba Cloud account, you must enter the ARN of the key. The ARN of a key is in the <code>acs:kms:${region}:${account}:key/${keyid}</code> format.</p>
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
         * <p>The ID of the key version. The globally unique identifier of the key version.  </p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/133966.html">ListKeyVersions</a> operation to obtain the key version ID.</p>
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
         * <p>The plaintext to be encrypted. The plaintext must be Base64-encoded.</p>
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
