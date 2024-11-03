// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDomainServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDomainServerCertificateRequest</p>
 */
public class SetDomainServerCertificateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificate")
    private String serverCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificateStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverCertificateStatus;

    private SetDomainServerCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.forceSet = builder.forceSet;
        this.ownerId = builder.ownerId;
        this.privateKey = builder.privateKey;
        this.securityToken = builder.securityToken;
        this.serverCertificate = builder.serverCertificate;
        this.serverCertificateStatus = builder.serverCertificateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainServerCertificateRequest create() {
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
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    /**
     * @return serverCertificateStatus
     */
    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

    public static final class Builder extends Request.Builder<SetDomainServerCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domainName; 
        private String forceSet; 
        private Long ownerId; 
        private String privateKey; 
        private String securityToken; 
        private String serverCertificate; 
        private String serverCertificateStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainServerCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.forceSet = request.forceSet;
            this.ownerId = request.ownerId;
            this.privateKey = request.privateKey;
            this.securityToken = request.securityToken;
            this.serverCertificate = request.serverCertificate;
            this.serverCertificateStatus = request.serverCertificateStatus;
        } 

        /**
         * <p>The name of the SSL certificate. You can specify only one name.</p>
         * 
         * <strong>example:</strong>
         * <p>myCert1</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: a user-uploaded SSL certificate.</li>
         * <li><strong>cas</strong>: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <strong>cas</strong>, the <strong>PrivateKey</strong> parameter is optional.</p>
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
         * <p>The accelerated domain name for which you want to configure the SSL certificate. The type of request supported by the domain name must be HTTPS.</p>
         * <p>You can specify one domain name in each call.</p>
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
         * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>----BEGIN RSA PRIVATE KEY-----QswCQ****----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
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

        /**
         * <p>The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate. You can use one of the following methods to obtain the content of the SSL certificate:</p>
         * <ul>
         * <li>Method 1: Call the <a href="https://help.aliyun.com/document_detail/91182.html">DescribeDomainCertificateInfo</a> API operation to query the information about the SSL certificate corresponding to the accelerated domain name and obtain the public key of the ServerCertificate certificate from the returned data.</li>
         * <li>Method 2: Call the <a href="https://help.aliyun.com/document_detail/91181.html">DescribeCdnCertificateList</a> API operation to query the SSL certificate list corresponding to the accelerated domain name, and obtain the value of CertName from the returned data. Then, Call the <a href="https://help.aliyun.com/document_detail/131905.html">DescribeCdnCertificateDetail</a> API operation with CertName as a parameter to obtain the details about the certificate, and obtain the public key of the Cert certificate from the returned data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>----BEGIN CERTIFICATE----- MIIFz****-----END CERTIFICATE-----</p>
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SSL certificate. Default value: off. Valid values:</p>
         * <ul>
         * <li><strong>on</strong> : enables the SSL certificate.</li>
         * <li><strong>off</strong>: disables the SSL certificate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder serverCertificateStatus(String serverCertificateStatus) {
            this.putQueryParameter("ServerCertificateStatus", serverCertificateStatus);
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }

        @Override
        public SetDomainServerCertificateRequest build() {
            return new SetDomainServerCertificateRequest(this);
        } 

    } 

}
