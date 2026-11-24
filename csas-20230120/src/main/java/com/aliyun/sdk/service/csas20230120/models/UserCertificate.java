// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UserCertificate} extends {@link TeaModel}
 *
 * <p>UserCertificate</p>
 */
public class UserCertificate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DnsNames")
    private java.util.List<String> dnsNames;

    @com.aliyun.core.annotation.NameInMap("ExpTimeUnix")
    private Long expTimeUnix;

    @com.aliyun.core.annotation.NameInMap("GmtCreateUnix")
    private Long gmtCreateUnix;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedUnix")
    private Long gmtModifiedUnix;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    private UserCertificate(Builder builder) {
        this.certId = builder.certId;
        this.certificate = builder.certificate;
        this.description = builder.description;
        this.dnsNames = builder.dnsNames;
        this.expTimeUnix = builder.expTimeUnix;
        this.gmtCreateUnix = builder.gmtCreateUnix;
        this.gmtModifiedUnix = builder.gmtModifiedUnix;
        this.name = builder.name;
        this.privateKey = builder.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserCertificate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dnsNames
     */
    public java.util.List<String> getDnsNames() {
        return this.dnsNames;
    }

    /**
     * @return expTimeUnix
     */
    public Long getExpTimeUnix() {
        return this.expTimeUnix;
    }

    /**
     * @return gmtCreateUnix
     */
    public Long getGmtCreateUnix() {
        return this.gmtCreateUnix;
    }

    /**
     * @return gmtModifiedUnix
     */
    public Long getGmtModifiedUnix() {
        return this.gmtModifiedUnix;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static final class Builder {
        private String certId; 
        private String certificate; 
        private String description; 
        private java.util.List<String> dnsNames; 
        private Long expTimeUnix; 
        private Long gmtCreateUnix; 
        private Long gmtModifiedUnix; 
        private String name; 
        private String privateKey; 

        private Builder() {
        } 

        private Builder(UserCertificate model) {
            this.certId = model.certId;
            this.certificate = model.certificate;
            this.description = model.description;
            this.dnsNames = model.dnsNames;
            this.expTimeUnix = model.expTimeUnix;
            this.gmtCreateUnix = model.gmtCreateUnix;
            this.gmtModifiedUnix = model.gmtModifiedUnix;
            this.name = model.name;
            this.privateKey = model.privateKey;
        } 

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-aabbccdd</p>
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The certificate content in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIID...****
         * -----END CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The certificate description.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal network application access certificate</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The domain names for which the certificate is valid.</p>
         */
        public Builder dnsNames(java.util.List<String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1734492686</p>
         */
        public Builder expTimeUnix(Long expTimeUnix) {
            this.expTimeUnix = expTimeUnix;
            return this;
        }

        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1734523812</p>
         */
        public Builder gmtCreateUnix(Long gmtCreateUnix) {
            this.gmtCreateUnix = gmtCreateUnix;
            return this;
        }

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1734523812</p>
         */
        public Builder gmtModifiedUnix(Long gmtModifiedUnix) {
            this.gmtModifiedUnix = gmtModifiedUnix;
            return this;
        }

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>Certificate 1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The PEM private key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----
         * MIIE...****
         * -----END PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public UserCertificate build() {
            return new UserCertificate(this);
        } 

    } 

}
