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

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DnsNames.
         */
        public Builder dnsNames(java.util.List<String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }

        /**
         * ExpTimeUnix.
         */
        public Builder expTimeUnix(Long expTimeUnix) {
            this.expTimeUnix = expTimeUnix;
            return this;
        }

        /**
         * GmtCreateUnix.
         */
        public Builder gmtCreateUnix(Long gmtCreateUnix) {
            this.gmtCreateUnix = gmtCreateUnix;
            return this;
        }

        /**
         * GmtModifiedUnix.
         */
        public Builder gmtModifiedUnix(Long gmtModifiedUnix) {
            this.gmtModifiedUnix = gmtModifiedUnix;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PrivateKey.
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
