// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadUserCertificateRequest</p>
 */
public class UploadUserCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptCert")
    private String encryptCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptPrivateKey")
    private String encryptPrivateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignCert")
    private String signCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignPrivateKey")
    private String signPrivateKey;

    private UploadUserCertificateRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.encryptCert = builder.encryptCert;
        this.encryptPrivateKey = builder.encryptPrivateKey;
        this.key = builder.key;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.signCert = builder.signCert;
        this.signPrivateKey = builder.signPrivateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadUserCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return encryptCert
     */
    public String getEncryptCert() {
        return this.encryptCert;
    }

    /**
     * @return encryptPrivateKey
     */
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return signCert
     */
    public String getSignCert() {
        return this.signCert;
    }

    /**
     * @return signPrivateKey
     */
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

    public static final class Builder extends Request.Builder<UploadUserCertificateRequest, Builder> {
        private String cert; 
        private String encryptCert; 
        private String encryptPrivateKey; 
        private String key; 
        private String name; 
        private String resourceGroupId; 
        private String signCert; 
        private String signPrivateKey; 

        private Builder() {
            super();
        } 

        private Builder(UploadUserCertificateRequest request) {
            super(request);
            this.cert = request.cert;
            this.encryptCert = request.encryptCert;
            this.encryptPrivateKey = request.encryptPrivateKey;
            this.key = request.key;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.signCert = request.signCert;
            this.signPrivateKey = request.signPrivateKey;
        } 

        /**
         * <p>The content of the certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * <p>The content of the encryption certificate in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICDzCCA***
         * -----END CERTIFICATE-----</p>
         */
        public Builder encryptCert(String encryptCert) {
            this.putQueryParameter("EncryptCert", encryptCert);
            this.encryptCert = encryptCert;
            return this;
        }

        /**
         * <p>The private key of the encryption certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN EC PRIVATE KEY-----
         * MHcCAQEEI****
         * -----END EC PRIVATE KEY-----</p>
         */
        public Builder encryptPrivateKey(String encryptPrivateKey) {
            this.putQueryParameter("EncryptPrivateKey", encryptPrivateKey);
            this.encryptPrivateKey = encryptPrivateKey;
            return this;
        }

        /**
         * <p>The private key of the certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICDzCCAbagAw****
         * -----END CERTIFICATE-----</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The name of the certificate. The name can contain up to 128 characters in length. The name can contain all types of characters, such as letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p> The name must be unique within an Alibaba Cloud account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cert-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>the resource group id.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae****vty</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The content of the signing certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICDzCCAbagAw****
         * -----END CERTIFICATE-----</p>
         */
        public Builder signCert(String signCert) {
            this.putQueryParameter("SignCert", signCert);
            this.signCert = signCert;
            return this;
        }

        /**
         * <p>The private key of the signing certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN EC PRIVATE KEY-----
         * MHcCAQEEILR****
         * -----END EC PRIVATE KEY-----</p>
         */
        public Builder signPrivateKey(String signPrivateKey) {
            this.putQueryParameter("SignPrivateKey", signPrivateKey);
            this.signPrivateKey = signPrivateKey;
            return this;
        }

        @Override
        public UploadUserCertificateRequest build() {
            return new UploadUserCertificateRequest(this);
        } 

    } 

}
