// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportEncryptionCertificateRequest} extends {@link RequestModel}
 *
 * <p>ImportEncryptionCertificateRequest</p>
 */
public class ImportEncryptionCertificateRequest extends Request {
    @Query
    @NameInMap("AsymmetricAlgorithm")
    @Validation(required = true)
    private String asymmetricAlgorithm;

    @Query
    @NameInMap("Certificate")
    @Validation(required = true)
    private String certificate;

    @Query
    @NameInMap("CertificateChain")
    private String certificateChain;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("EncryptedPrivateKey")
    @Validation(required = true)
    private String encryptedPrivateKey;

    @Query
    @NameInMap("EncryptedSymmetricKey")
    @Validation(required = true)
    private String encryptedSymmetricKey;

    @Query
    @NameInMap("SymmetricAlgorithm")
    @Validation(required = true)
    private String symmetricAlgorithm;

    private ImportEncryptionCertificateRequest(Builder builder) {
        super(builder);
        this.asymmetricAlgorithm = builder.asymmetricAlgorithm;
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.certificateId = builder.certificateId;
        this.encryptedPrivateKey = builder.encryptedPrivateKey;
        this.encryptedSymmetricKey = builder.encryptedSymmetricKey;
        this.symmetricAlgorithm = builder.symmetricAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportEncryptionCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asymmetricAlgorithm
     */
    public String getAsymmetricAlgorithm() {
        return this.asymmetricAlgorithm;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return certificateChain
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return encryptedPrivateKey
     */
    public String getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }

    /**
     * @return encryptedSymmetricKey
     */
    public String getEncryptedSymmetricKey() {
        return this.encryptedSymmetricKey;
    }

    /**
     * @return symmetricAlgorithm
     */
    public String getSymmetricAlgorithm() {
        return this.symmetricAlgorithm;
    }

    public static final class Builder extends Request.Builder<ImportEncryptionCertificateRequest, Builder> {
        private String asymmetricAlgorithm; 
        private String certificate; 
        private String certificateChain; 
        private String certificateId; 
        private String encryptedPrivateKey; 
        private String encryptedSymmetricKey; 
        private String symmetricAlgorithm; 

        private Builder() {
            super();
        } 

        private Builder(ImportEncryptionCertificateRequest response) {
            super(response);
            this.asymmetricAlgorithm = response.asymmetricAlgorithm;
            this.certificate = response.certificate;
            this.certificateChain = response.certificateChain;
            this.certificateId = response.certificateId;
            this.encryptedPrivateKey = response.encryptedPrivateKey;
            this.encryptedSymmetricKey = response.encryptedSymmetricKey;
            this.symmetricAlgorithm = response.symmetricAlgorithm;
        } 

        /**
         * AsymmetricAlgorithm.
         */
        public Builder asymmetricAlgorithm(String asymmetricAlgorithm) {
            this.putQueryParameter("AsymmetricAlgorithm", asymmetricAlgorithm);
            this.asymmetricAlgorithm = asymmetricAlgorithm;
            return this;
        }

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * CertificateChain.
         */
        public Builder certificateChain(String certificateChain) {
            this.putQueryParameter("CertificateChain", certificateChain);
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * EncryptedPrivateKey.
         */
        public Builder encryptedPrivateKey(String encryptedPrivateKey) {
            this.putQueryParameter("EncryptedPrivateKey", encryptedPrivateKey);
            this.encryptedPrivateKey = encryptedPrivateKey;
            return this;
        }

        /**
         * EncryptedSymmetricKey.
         */
        public Builder encryptedSymmetricKey(String encryptedSymmetricKey) {
            this.putQueryParameter("EncryptedSymmetricKey", encryptedSymmetricKey);
            this.encryptedSymmetricKey = encryptedSymmetricKey;
            return this;
        }

        /**
         * SymmetricAlgorithm.
         */
        public Builder symmetricAlgorithm(String symmetricAlgorithm) {
            this.putQueryParameter("SymmetricAlgorithm", symmetricAlgorithm);
            this.symmetricAlgorithm = symmetricAlgorithm;
            return this;
        }

        @Override
        public ImportEncryptionCertificateRequest build() {
            return new ImportEncryptionCertificateRequest(this);
        } 

    } 

}
