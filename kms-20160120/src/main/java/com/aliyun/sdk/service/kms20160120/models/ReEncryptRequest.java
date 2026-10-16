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
 * {@link ReEncryptRequest} extends {@link RequestModel}
 *
 * <p>ReEncryptRequest</p>
 */
public class ReEncryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEncryptionContext")
    private java.util.Map<String, ?> destinationEncryptionContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEncryptionAlgorithm")
    private String sourceEncryptionAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEncryptionContext")
    private java.util.Map<String, ?> sourceEncryptionContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceKeyId")
    private String sourceKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceKeyVersionId")
    private String sourceKeyVersionId;

    private ReEncryptRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.destinationEncryptionContext = builder.destinationEncryptionContext;
        this.destinationKeyId = builder.destinationKeyId;
        this.dryRun = builder.dryRun;
        this.sourceEncryptionAlgorithm = builder.sourceEncryptionAlgorithm;
        this.sourceEncryptionContext = builder.sourceEncryptionContext;
        this.sourceKeyId = builder.sourceKeyId;
        this.sourceKeyVersionId = builder.sourceKeyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReEncryptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return destinationEncryptionContext
     */
    public java.util.Map<String, ?> getDestinationEncryptionContext() {
        return this.destinationEncryptionContext;
    }

    /**
     * @return destinationKeyId
     */
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return sourceEncryptionAlgorithm
     */
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    /**
     * @return sourceEncryptionContext
     */
    public java.util.Map<String, ?> getSourceEncryptionContext() {
        return this.sourceEncryptionContext;
    }

    /**
     * @return sourceKeyId
     */
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    /**
     * @return sourceKeyVersionId
     */
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

    public static final class Builder extends Request.Builder<ReEncryptRequest, Builder> {
        private String ciphertextBlob; 
        private java.util.Map<String, ?> destinationEncryptionContext; 
        private String destinationKeyId; 
        private String dryRun; 
        private String sourceEncryptionAlgorithm; 
        private java.util.Map<String, ?> sourceEncryptionContext; 
        private String sourceKeyId; 
        private String sourceKeyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ReEncryptRequest request) {
            super(request);
            this.ciphertextBlob = request.ciphertextBlob;
            this.destinationEncryptionContext = request.destinationEncryptionContext;
            this.destinationKeyId = request.destinationKeyId;
            this.dryRun = request.dryRun;
            this.sourceEncryptionAlgorithm = request.sourceEncryptionAlgorithm;
            this.sourceEncryptionContext = request.sourceEncryptionContext;
            this.sourceKeyId = request.sourceKeyId;
            this.sourceKeyVersionId = request.sourceKeyVersionId;
        } 

        /**
         * <p>The ciphertext that you want to re-encrypt.<br> This parameter can be the ciphertext that is returned after symmetric or asymmetric key encryption.<br><br></p>
         * <ul>
         * <li><p>Symmetric encryption: the ciphertext that is returned after you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation.</p>
         * </li>
         * <li><p>Asymmetric key encryption: the data that is encrypted using a public key after you call the <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, or the data that is encrypted using an asymmetric public key in an external system.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901q********</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>A JSON string that consists of key-value pairs. This parameter specifies the encryption context for the destination master key.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
         */
        public Builder destinationEncryptionContext(java.util.Map<String, ?> destinationEncryptionContext) {
            String destinationEncryptionContextShrink = shrink(destinationEncryptionContext, "DestinationEncryptionContext", "json");
            this.putQueryParameter("DestinationEncryptionContext", destinationEncryptionContextShrink);
            this.destinationEncryptionContext = destinationEncryptionContext;
            return this;
        }

        /**
         * <p>The ID of the symmetric master key that is used to re-encrypt the data after the ciphertext is decrypted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder destinationKeyId(String destinationKeyId) {
            this.putQueryParameter("DestinationKeyId", destinationKeyId);
            this.destinationKeyId = destinationKeyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the DryRun mode.</p>
         * <ul>
         * <li><p>true: enables the DryRun mode.</p>
         * </li>
         * <li><p>false (default): disables the DryRun mode.</p>
         * </li>
         * </ul>
         * <p>The DryRun mode is used to test API calls, verify whether you have the permissions to perform operations on the required resources, and check whether the request parameters are valid. If you enable the DryRun mode, KMS always returns a failure and a reason for the failure. The reasons for the failure include the following:</p>
         * <ul>
         * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not configured.</p>
         * </li>
         * <li><p>ValidationError: The parameters specified in the request are invalid.</p>
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
         * <p>If CiphertextBlob is the result of public key encryption, specify the public key encryption algorithm. For more information about the algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.<br> Valid values:<br><br></p>
         * <ul>
         * <li><p>RSAES_OAEP_SHA_256</p>
         * </li>
         * <li><p>RSAES_OAEP_SHA_1</p>
         * </li>
         * <li><p>SM2PKE</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RSAES_OAEP_SHA_256</p>
         */
        public Builder sourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
            this.putQueryParameter("SourceEncryptionAlgorithm", sourceEncryptionAlgorithm);
            this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
            return this;
        }

        /**
         * <p>A JSON string that consists of key-value pairs. If you specify this parameter when you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, you must specify the same parameter to decrypt the data. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
         * <blockquote>
         * <p>You must specify this parameter when CiphertextBlob is the ciphertext that is returned after symmetric encryption.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
         */
        public Builder sourceEncryptionContext(java.util.Map<String, ?> sourceEncryptionContext) {
            String sourceEncryptionContextShrink = shrink(sourceEncryptionContext, "SourceEncryptionContext", "json");
            this.putQueryParameter("SourceEncryptionContext", sourceEncryptionContextShrink);
            this.sourceEncryptionContext = sourceEncryptionContext;
            return this;
        }

        /**
         * <p>The ID of the master key that is used to decrypt the ciphertext.<br> The globally unique identifier of the master key.<br><br></p>
         * <blockquote>
         * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
         */
        public Builder sourceKeyId(String sourceKeyId) {
            this.putQueryParameter("SourceKeyId", sourceKeyId);
            this.sourceKeyId = sourceKeyId;
            return this;
        }

        /**
         * <p>The ID of the key version that is used to decrypt the ciphertext.</p>
         * <blockquote>
         * <p>You must specify this parameter when CiphertextBlob is the data that is encrypted using a public key after asymmetric key encryption.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder sourceKeyVersionId(String sourceKeyVersionId) {
            this.putQueryParameter("SourceKeyVersionId", sourceKeyVersionId);
            this.sourceKeyVersionId = sourceKeyVersionId;
            return this;
        }

        @Override
        public ReEncryptRequest build() {
            return new ReEncryptRequest(this);
        } 

    } 

}
