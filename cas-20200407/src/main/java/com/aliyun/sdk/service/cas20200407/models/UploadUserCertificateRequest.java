// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UploadUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadUserCertificateRequest</p>
 */
public class UploadUserCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private UploadUserCertificateRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.clientToken = builder.clientToken;
        this.encryptCert = builder.encryptCert;
        this.encryptPrivateKey = builder.encryptPrivateKey;
        this.key = builder.key;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.signCert = builder.signCert;
        this.signPrivateKey = builder.signPrivateKey;
        this.tags = builder.tags;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UploadUserCertificateRequest, Builder> {
        private String cert; 
        private String clientToken; 
        private String encryptCert; 
        private String encryptPrivateKey; 
        private String key; 
        private String name; 
        private String resourceGroupId; 
        private String signCert; 
        private String signPrivateKey; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UploadUserCertificateRequest request) {
            super(request);
            this.cert = request.cert;
            this.clientToken = request.clientToken;
            this.encryptCert = request.encryptCert;
            this.encryptPrivateKey = request.encryptPrivateKey;
            this.key = request.key;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.signCert = request.signCert;
            this.signPrivateKey = request.signPrivateKey;
            this.tags = request.tags;
        } 

        /**
         * <p>The non-China SM certificate content in PEM format.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The encryption certificate content of the China SM certificate in PEM format. This field is invalid when Cert and Key are not empty.</p>
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
         * <p>The private key content of the encryption certificate of the China SM certificate in PEM format. This field is invalid when Cert and Key are not empty.</p>
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
         * <p>The private key content of the non-China SM certificate in PEM format.</p>
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
         * <p>The custom certificate name. Maximum length: 63 characters. All character types are supported, including letters, digits, and underscores.</p>
         * <blockquote>
         * <p>Certificate names must be unique within the same user account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The resource group ID.</p>
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
         * <p>The signing certificate content of the China SM certificate in PEM format. This field is invalid when Cert and Key are not empty.</p>
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
         * <p>The private key content of the signing certificate of the China SM certificate in PEM format. This field is invalid when Cert and Key are not empty.</p>
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

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UploadUserCertificateRequest build() {
            return new UploadUserCertificateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadUserCertificateRequest} extends {@link TeaModel}
     *
     * <p>UploadUserCertificateRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
