// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainSSLCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainSSLCertificateRequest</p>
 */
public class SetCdnDomainSSLCertificateRequest extends Request {
    @Query
    @NameInMap("CertId")
    private Long certId;

    @Query
    @NameInMap("CertName")
    private String certName;

    @Query
    @NameInMap("CertRegion")
    private String certRegion;

    @Query
    @NameInMap("CertType")
    private String certType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Env")
    private String env;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SSLPri")
    private String SSLPri;

    @Query
    @NameInMap("SSLProtocol")
    @Validation(required = true)
    private String SSLProtocol;

    @Query
    @NameInMap("SSLPub")
    private String SSLPub;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetCdnDomainSSLCertificateRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.certRegion = builder.certRegion;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.env = builder.env;
        this.ownerId = builder.ownerId;
        this.SSLPri = builder.SSLPri;
        this.SSLProtocol = builder.SSLProtocol;
        this.SSLPub = builder.SSLPub;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainSSLCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certRegion
     */
    public String getCertRegion() {
        return this.certRegion;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return SSLPri
     */
    public String getSSLPri() {
        return this.SSLPri;
    }

    /**
     * @return SSLProtocol
     */
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    /**
     * @return SSLPub
     */
    public String getSSLPub() {
        return this.SSLPub;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetCdnDomainSSLCertificateRequest, Builder> {
        private Long certId; 
        private String certName; 
        private String certRegion; 
        private String certType; 
        private String domainName; 
        private String env; 
        private Long ownerId; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainSSLCertificateRequest request) {
            super(request);
            this.certId = request.certId;
            this.certName = request.certName;
            this.certRegion = request.certRegion;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.env = request.env;
            this.ownerId = request.ownerId;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the certificate.
         */
        public Builder certId(Long certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * The name of the SSL certificate. You can specify only one certificate name.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * The region ID of the certificate. Valid values: **cn-hangzhou** and **ap-southeast-1**. Default value: **cn-hangzhou**.
         */
        public Builder certRegion(String certRegion) {
            this.putQueryParameter("CertRegion", certRegion);
            this.certRegion = certRegion;
            return this;
        }

        /**
         * The type of the certificate.
         * <p>
         * 
         * *   **upload**: a user-uploaded SSL certificate.
         * *   **cas**: a certificate that is acquired through Certificate Management Service.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * The accelerated domain name for which you want to configure the SSL certificate. The type of request supported by the domain name must be HTTPS. You can specify only one domain name in each request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Specifies whether the certificate is issued in canary releases. If you set this parameter to **staging**, the certificate is issued in canary releases. If you do not specify this parameter or set this parameter to other values, the certificate is officially issued.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The private key. Specify the private key only if you want to enable the SSL certificate.
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
            return this;
        }

        /**
         * Specifies whether to enable the SSL certificate.
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder SSLProtocol(String SSLProtocol) {
            this.putQueryParameter("SSLProtocol", SSLProtocol);
            this.SSLProtocol = SSLProtocol;
            return this;
        }

        /**
         * The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate.
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetCdnDomainSSLCertificateRequest build() {
            return new SetCdnDomainSSLCertificateRequest(this);
        } 

    } 

}
