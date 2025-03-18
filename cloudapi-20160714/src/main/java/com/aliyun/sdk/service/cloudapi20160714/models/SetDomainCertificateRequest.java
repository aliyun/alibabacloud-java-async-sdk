// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
    @com.aliyun.core.annotation.NameInMap("ClientCertSDnPassThrough")
    private Boolean clientCertSDnPassThrough;

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
    @com.aliyun.core.annotation.NameInMap("SslOcspEnable")
    private Boolean sslOcspEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslVerifyDepth")
    private String sslVerifyDepth;

    private SetDomainCertificateRequest(Builder builder) {
        super(builder);
        this.caCertificateBody = builder.caCertificateBody;
        this.certificateBody = builder.certificateBody;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.clientCertSDnPassThrough = builder.clientCertSDnPassThrough;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.sslOcspEnable = builder.sslOcspEnable;
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
     * @return clientCertSDnPassThrough
     */
    public Boolean getClientCertSDnPassThrough() {
        return this.clientCertSDnPassThrough;
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
     * @return sslOcspEnable
     */
    public Boolean getSslOcspEnable() {
        return this.sslOcspEnable;
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
        private Boolean clientCertSDnPassThrough; 
        private String domainName; 
        private String groupId; 
        private String securityToken; 
        private Boolean sslOcspEnable; 
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
            this.clientCertSDnPassThrough = request.clientCertSDnPassThrough;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.sslOcspEnable = request.sslOcspEnable;
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
         * <p>If pass ssl_client_s_dn of the cert to backend header &quot;X-Client-S-Dn&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder clientCertSDnPassThrough(Boolean clientCertSDnPassThrough) {
            this.putQueryParameter("ClientCertSDnPassThrough", clientCertSDnPassThrough);
            this.clientCertSDnPassThrough = clientCertSDnPassThrough;
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
         * <p>If enable ssl OCSP.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder sslOcspEnable(Boolean sslOcspEnable) {
            this.putQueryParameter("SslOcspEnable", sslOcspEnable);
            this.sslOcspEnable = sslOcspEnable;
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
