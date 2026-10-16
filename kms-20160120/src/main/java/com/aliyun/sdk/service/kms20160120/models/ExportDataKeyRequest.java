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
 * {@link ExportDataKeyRequest} extends {@link RequestModel}
 *
 * <p>ExportDataKeyRequest</p>
 */
public class ExportDataKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionContext")
    private java.util.Map<String, ?> encryptionContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrappingAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wrappingAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrappingKeySpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wrappingKeySpec;

    private ExportDataKeyRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.dryRun = builder.dryRun;
        this.encryptionContext = builder.encryptionContext;
        this.publicKeyBlob = builder.publicKeyBlob;
        this.wrappingAlgorithm = builder.wrappingAlgorithm;
        this.wrappingKeySpec = builder.wrappingKeySpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDataKeyRequest create() {
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return encryptionContext
     */
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    /**
     * @return publicKeyBlob
     */
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    /**
     * @return wrappingAlgorithm
     */
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    /**
     * @return wrappingKeySpec
     */
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public static final class Builder extends Request.Builder<ExportDataKeyRequest, Builder> {
        private String ciphertextBlob; 
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 
        private String publicKeyBlob; 
        private String wrappingAlgorithm; 
        private String wrappingKeySpec; 

        private Builder() {
            super();
        } 

        private Builder(ExportDataKeyRequest request) {
            super(request);
            this.ciphertextBlob = request.ciphertextBlob;
            this.dryRun = request.dryRun;
            this.encryptionContext = request.encryptionContext;
            this.publicKeyBlob = request.publicKeyBlob;
            this.wrappingAlgorithm = request.wrappingAlgorithm;
            this.wrappingKeySpec = request.wrappingKeySpec;
        } 

        /**
         * <p>The ciphertext of the data key that is encrypted using a master key (CMK).</p>
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
         * <p>Specifies whether to enable the DryRun mode.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * <p>The DryRun mode is used to test the API call and verify the permissions on the specified resources and the validity of the request parameters. If you enable the DryRun mode, KMS returns a failure response and a failure reason. The failure reasons include the following:</p>
         * <ul>
         * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter was not specified.</p>
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
         * <p>A JSON string that consists of key-value pairs. EncryptionContext is the encryption context that is passed in when the data key is encrypted using a CMK. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
         */
        public Builder encryptionContext(java.util.Map<String, ?> encryptionContext) {
            String encryptionContextShrink = shrink(encryptionContext, "EncryptionContext", "json");
            this.putQueryParameter("EncryptionContext", encryptionContextShrink);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * <p>The public key in Base64 format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAndKfC2ReLL2+y8a0+ZBBeAft/uBYo86GZiYJuflqgUzKxpyuvlo3uQkBv6b+nx+0tz8g8v7GhpPWMSW5L9mNHYsvYFsa7jTxsYdt17yj6GlUHPuMIs8hr5qbwl38IHU1iIa7nYWwE2fb3ePOvLDACRJVgGpU0yxioW80d2QD+9aU4jF5dlAahcfgsNzo2CXzCUc1+xbmNuq7Rp+H9VJB9dyYOwqnW3RhOLBo21FzpORapf0UiRlrHRpk1V6ez+aE1dofaYh/9bh0m6ioxj7j5hpZbWccuEZTMBKd+cbuBkRhJzc6Tti6qwZbDiu4fUwbZS0Tqpuo1UadiyxMW********</p>
         */
        public Builder publicKeyBlob(String publicKeyBlob) {
            this.putQueryParameter("PublicKeyBlob", publicKeyBlob);
            this.publicKeyBlob = publicKeyBlob;
            return this;
        }

        /**
         * <p>The encryption algorithm that is used to encrypt the data key using the public key specified by PublicKeyBlob. For more information about the algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.<br> Valid values:<br><br></p>
         * <ul>
         * <li><p>RSAES_OAEP_SHA_256</p>
         * </li>
         * <li><p>RSAES_OAEP_SHA_1</p>
         * </li>
         * <li><p>SM2PKE</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSAES_OAEP_SHA_256</p>
         */
        public Builder wrappingAlgorithm(String wrappingAlgorithm) {
            this.putQueryParameter("WrappingAlgorithm", wrappingAlgorithm);
            this.wrappingAlgorithm = wrappingAlgorithm;
            return this;
        }

        /**
         * <p>The type of the public key specified by PublicKeyBlob. For more information about key types, see <a href="https://help.aliyun.com/document_detail/148147.html">Introduction to asymmetric keys</a>.<br> Valid values:<br><br></p>
         * <ul>
         * <li><p>RSA_2048</p>
         * </li>
         * <li><p>EC_SM2</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder wrappingKeySpec(String wrappingKeySpec) {
            this.putQueryParameter("WrappingKeySpec", wrappingKeySpec);
            this.wrappingKeySpec = wrappingKeySpec;
            return this;
        }

        @Override
        public ExportDataKeyRequest build() {
            return new ExportDataKeyRequest(this);
        } 

    } 

}
