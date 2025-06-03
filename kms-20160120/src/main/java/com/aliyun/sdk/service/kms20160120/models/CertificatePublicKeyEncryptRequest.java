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
 * {@link CertificatePublicKeyEncryptRequest} extends {@link RequestModel}
 *
 * <p>CertificatePublicKeyEncryptRequest</p>
 */
public class CertificatePublicKeyEncryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plaintext")
    @com.aliyun.core.annotation.Validation(required = true)
    private String plaintext;

    private CertificatePublicKeyEncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyEncryptRequest create() {
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
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<CertificatePublicKeyEncryptRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePublicKeyEncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.plaintext = request.plaintext;
        } 

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li><p>RSAES_OAEP_SHA_1</p>
         * </li>
         * <li><p>RSAES_OAEP_SHA_256</p>
         * </li>
         * <li><p>SM2PKE</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The SM2PKE encryption algorithm is supported only in regions in mainland China. In these regions, managed hardware security modules (HSMs) are used. For more information, see <a href="https://help.aliyun.com/document_detail/125803.html">Managed HSM overview</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSAES_OAEP_SHA_256</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The data that you want to encrypt.</p>
         * <p>The value is encoded in Base64. For example, if the hexadecimal data that you want to encrypt is <code>[0x31, 0x32, 0x33, 0x34]</code>, the Base64-encoded data is <code>MTIzNA==</code>.</p>
         * <p>The size of data that can be encrypted varies based on the encryption algorithm that you use:</p>
         * <ul>
         * <li>RSAES_OAEP_SHA_1: 214 bytes</li>
         * <li>RSAES_OAEP_SHA_256: 190 bytes</li>
         * <li>SM2PKE: 6,047 bytes</li>
         * </ul>
         * <p>If the size of data that you want to encrypt exceeds the preceding limits, you can call the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation to generate a data key to encrypt the data. Then, call the CertificatePublicKeyEncrypt operation to encrypt the data key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</p>
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public CertificatePublicKeyEncryptRequest build() {
            return new CertificatePublicKeyEncryptRequest(this);
        } 

    } 

}
