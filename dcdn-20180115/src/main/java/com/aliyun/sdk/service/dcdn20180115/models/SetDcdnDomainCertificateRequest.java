// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDcdnDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainCertificateRequest</p>
 */
public class SetDcdnDomainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceSet")
    private String forceSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPri")
    private String SSLPri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SSLProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPub")
    private String SSLPub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private SetDcdnDomainCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.forceSet = builder.forceSet;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.SSLPri = builder.SSLPri;
        this.SSLProtocol = builder.SSLProtocol;
        this.SSLPub = builder.SSLPub;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainCertificateRequest create() {
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
     * @return forceSet
     */
    public String getForceSet() {
        return this.forceSet;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<SetDcdnDomainCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domainName; 
        private String forceSet; 
        private Long ownerId; 
        private String region; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.forceSet = request.forceSet;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The certificate type.</p>
         * <ul>
         * <li><strong>upload</strong>: a user-uploaded SSL certificate.</li>
         * <li><strong>cas</strong>: a certificate that is acquired through Certificate Management Service.</li>
         * </ul>
         * <blockquote>
         * <p>If the value of the CertType parameter is <strong>cas</strong>, the <strong>SSLPri</strong> parameter is not required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
         * <p>HTTPS acceleration must be enabled for the accelerated domain name.</p>
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
         * <p>Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information about the existing certificate that uses the same name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder forceSet(String forceSet) {
            this.putQueryParameter("ForceSet", forceSet);
            this.forceSet = forceSet;
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
         * <p>The region. Default value: ch-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The private key. This parameter is required only if you enable the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SSLPri</p>
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SSL certificate.</p>
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
         * <p>The certificate content. This parameter is required only if you enable the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SSLPub</p>
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
        public SetDcdnDomainCertificateRequest build() {
            return new SetDcdnDomainCertificateRequest(this);
        } 

    } 

}
