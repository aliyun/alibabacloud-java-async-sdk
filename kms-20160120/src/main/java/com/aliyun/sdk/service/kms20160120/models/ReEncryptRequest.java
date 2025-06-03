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
         * <p>The ciphertext that you want to re-encrypt.</p>
         * <p>You can set this parameter to the ciphertext that is returned after a symmetric or asymmetric encryption operation.</p>
         * <ul>
         * <li>Symmetric encryption: the ciphertext returned after you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation</li>
         * <li>Asymmetric encryption: the public key-encrypted ciphertext returned after you call the <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation, or the ciphertext encrypted by using the public key of an asymmetric key pair outside KMS</li>
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
         * <p>A JSON string that consists of key-value pairs. This parameter specifies the EncryptionContext that is used to re-encrypt the decrypted data or data key.</p>
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
         * <p>The ID of the symmetric CMK that is used to re-encrypt the ciphertext after the ciphertext is decrypted.</p>
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
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The encryption algorithm based on which the public key is used to encrypt the ciphertext specified by CiphertextBlob. For more information about encryption algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RSAES_OAEP_SHA_256</li>
         * <li>RSAES_OAEP_SHA_1</li>
         * <li>SM2PKE</li>
         * </ul>
         * <blockquote>
         * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
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
         * <p>A JSON string that consists of key-value pairs. If you specify EncryptionContext when you call the <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a>, or <a href="https://help.aliyun.com/document_detail/176804.html">GenerateAndExportDataKey</a> operation to encrypt the data or data key, an equivalent value is required here. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
         * <blockquote>
         * <p> If you set CiphertextBlob to the ciphertext that is returned after a symmetric encryption operation, specify this parameter.</p>
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
         * <p>The ID of the CMK that is used to decrypt the ciphertext.</p>
         * <p>This parameter is the globally unique ID of the CMK.</p>
         * <blockquote>
         * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
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
         * <p>The ID of the CMK version that is used to decrypt the ciphertext.</p>
         * <blockquote>
         * <p> If you set CiphertextBlob to the public key-encrypted ciphertext that is returned after an asymmetric encryption operation, specify this parameter.</p>
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
