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
         * <p>The ciphertext of the data key encrypted by using a CMK.</p>
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
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>A JSON string that consists of key-value pairs. If you specify this parameter when you use a CMK to encrypt the data key, an equivalent value is required here. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
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
         * <p>A Base64-encoded public key.</p>
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
         * <p>The encryption algorithm based on which you want to use the public key specified by PublicKeyBlob to encrypt the data key. For more information about encryption algorithms, see <a href="https://help.aliyun.com/document_detail/148130.html">AsymmetricDecrypt</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RSAES_OAEP_SHA_256</li>
         * <li>RSAES_OAEP_SHA_1</li>
         * <li>SM2PKE</li>
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
         * <p>The key type of the public key specified by PublicKeyBlob. For more information about key types, see <a href="https://help.aliyun.com/document_detail/148147.html">Introduction to asymmetric keys</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RSA_2048</li>
         * <li>EC_SM2</li>
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
