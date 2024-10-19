// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDomainCertificateRequest</p>
 */
public class SetDomainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertificateBody")
    private String caCertificateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateBody")
    private String certificateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificatePrivateKey")
    private String certificatePrivateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslVerifyDepth")
    private String sslVerifyDepth;

    private SetDomainCertificateRequest(Builder builder) {
        super(builder);
        this.caCertificateBody = builder.caCertificateBody;
        this.certificateBody = builder.certificateBody;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.sslVerifyDepth = builder.sslVerifyDepth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertificateBody
     */
    public String getCaCertificateBody() {
        return this.caCertificateBody;
    }

    /**
     * @return certificateBody
     */
    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificatePrivateKey
     */
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sslVerifyDepth
     */
    public String getSslVerifyDepth() {
        return this.sslVerifyDepth;
    }

    public static final class Builder extends Request.Builder<SetDomainCertificateRequest, Builder> {
        private String caCertificateBody; 
        private String certificateBody; 
        private String certificateName; 
        private String certificatePrivateKey; 
        private String domainName; 
        private String groupId; 
        private String securityToken; 
        private String sslVerifyDepth; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainCertificateRequest request) {
            super(request);
            this.caCertificateBody = request.caCertificateBody;
            this.certificateBody = request.certificateBody;
            this.certificateName = request.certificateName;
            this.certificatePrivateKey = request.certificatePrivateKey;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.sslVerifyDepth = request.sslVerifyDepth;
        } 

        /**
         * <p>The content of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Content of the CA certificate</p>
         */
        public Builder caCertificateBody(String caCertificateBody) {
            this.putQueryParameter("CaCertificateBody", caCertificateBody);
            this.caCertificateBody = caCertificateBody;
            return this;
        }

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>For more information, see the following request examples</p>
         */
        public Builder certificateBody(String certificateBody) {
            this.putQueryParameter("CertificateBody", certificateBody);
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * <p>The name of the SSL certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_cert</p>
         */
        public Builder certificateName(String certificateName) {
            this.putQueryParameter("CertificateName", certificateName);
            this.certificateName = certificateName;
            return this;
        }

        /**
         * <p>The private key of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>For more information, see the following request examples</p>
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.putQueryParameter("CertificatePrivateKey", certificatePrivateKey);
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * <p>The custom domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>927d50c0f2e54b359919923d908bb015</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * <p>The certificate verification depth.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sslVerifyDepth(String sslVerifyDepth) {
            this.putQueryParameter("SslVerifyDepth", sslVerifyDepth);
            this.sslVerifyDepth = sslVerifyDepth;
            return this;
        }

        @Override
        public SetDomainCertificateRequest build() {
            return new SetDomainCertificateRequest(this);
        } 

    } 

}
