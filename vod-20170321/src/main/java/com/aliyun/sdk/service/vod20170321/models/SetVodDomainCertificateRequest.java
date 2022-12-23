// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVodDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetVodDomainCertificateRequest</p>
 */
public class SetVodDomainCertificateRequest extends Request {
    @Query
    @NameInMap("CertName")
    private String certName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

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

    private SetVodDomainCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.SSLPri = builder.SSLPri;
        this.SSLProtocol = builder.SSLProtocol;
        this.SSLPub = builder.SSLPub;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVodDomainCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<SetVodDomainCertificateRequest, Builder> {
        private String certName; 
        private String domainName; 
        private Long ownerId; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetVodDomainCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
            this.securityToken = request.securityToken;
        } 

        /**
         * The name of the certificate.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * The domain name that is secured by the certificate. The domain name uses HTTPS acceleration.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * The private key. This parameter is required only if you enable the SSL certificate.
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
            return this;
        }

        /**
         * Specifies whether to enable the SSL certificate. Valid values:
         * <p>
         * 
         * *   **on**: enables the SSL certificate.
         * *   **off**: disables the SSL certificate. Default value: off.
         */
        public Builder SSLProtocol(String SSLProtocol) {
            this.putQueryParameter("SSLProtocol", SSLProtocol);
            this.SSLProtocol = SSLProtocol;
            return this;
        }

        /**
         * The content of the certificate. This parameter is required only if you enable the SSL certificate.
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
        public SetVodDomainCertificateRequest build() {
            return new SetVodDomainCertificateRequest(this);
        } 

    } 

}
