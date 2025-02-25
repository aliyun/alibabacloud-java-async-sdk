// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDcdnDomainSMCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainSMCertificateRequest</p>
 */
public class SetDcdnDomainSMCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SSLProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private SetDcdnDomainSMCertificateRequest(Builder builder) {
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

    public static SetDcdnDomainSMCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<SetDcdnDomainSMCertificateRequest, Builder> {
        private String certIdentifier; 
        private String domainName; 
        private Long ownerId; 
        private String SSLProtocol; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainSMCertificateRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.SSLProtocol = request.SSLProtocol;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The identifier of the certificate. The value is Certificate ID-cn-hangzhou. If the ID of the certificate is 123, CertIdentifier is set to 123-cn-hangzhou.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The accelerated domain name for which the SM certificate is configured.</p>
         * <blockquote>
         * <p>The domain name must have HTTPS secure acceleration enabled.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <p>Specifies whether to enable the SSL certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
        public SetDcdnDomainSMCertificateRequest build() {
            return new SetDcdnDomainSMCertificateRequest(this);
        } 

    } 

}
