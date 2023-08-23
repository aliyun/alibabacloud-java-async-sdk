// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainSMCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainSMCertificateRequest</p>
 */
public class SetCdnDomainSMCertificateRequest extends Request {
    @Query
    @NameInMap("CertIdentifier")
    @Validation(required = true)
    private String certIdentifier;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SSLProtocol")
    @Validation(required = true)
    private String SSLProtocol;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetCdnDomainSMCertificateRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.SSLProtocol = builder.SSLProtocol;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainSMCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
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
     * @return SSLProtocol
     */
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetCdnDomainSMCertificateRequest, Builder> {
        private String certIdentifier; 
        private String domainName; 
        private Long ownerId; 
        private String SSLProtocol; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainSMCertificateRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.SSLProtocol = request.SSLProtocol;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the SM certificate that you want to configure. The identifier of the certificate. The value is Certificate ID-cn-hangzhou. For example, if the certificate ID is 123, set the value of this parameter to 123-cn-hangzhou.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * The accelerated domain name for which you want to configure the SM certificate.
         * <p>
         * 
         * > The domain name must use HTTPS acceleration.
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
         * Specifies whether to enable the SSL certificate. Valid values:
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetCdnDomainSMCertificateRequest build() {
            return new SetCdnDomainSMCertificateRequest(this);
        } 

    } 

}
