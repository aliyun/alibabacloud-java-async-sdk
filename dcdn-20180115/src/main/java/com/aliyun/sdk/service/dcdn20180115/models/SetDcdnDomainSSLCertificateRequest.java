// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link SetDcdnDomainSSLCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainSSLCertificateRequest</p>
 */
public class SetDcdnDomainSSLCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertRegion")
    private String certRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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

    private SetDcdnDomainSSLCertificateRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.certRegion = builder.certRegion;
        this.certType = builder.certType;
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

    public static SetDcdnDomainSSLCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<SetDcdnDomainSSLCertificateRequest, Builder> {
        private Long certId; 
        private String certName; 
        private String certRegion; 
        private String certType; 
        private String domainName; 
        private Long ownerId; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainSSLCertificateRequest request) {
            super(request);
            this.certId = request.certId;
            this.certName = request.certName;
            this.certRegion = request.certRegion;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The certificate ID. This parameter is required and valid only when <strong>CertType</strong> is set to <strong>cas</strong>. If you specify this parameter, an existing certificate is used.</p>
         * 
         * <strong>example:</strong>
         * <p>8089870</p>
         */
        public Builder certId(Long certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The name of the new certificate. You can specify only one certificate name. This parameter is optional and valid only when <strong>CertType</strong> is set to <strong>upload</strong>.</p>
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
         * <p>The region of the SSL certificate. This parameter takes effect only when <strong>CertType</strong> is set to <strong>cas</strong>. Default value: <strong>cn-hangzhou</strong>. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder certRegion(String certRegion) {
            this.putQueryParameter("CertRegion", certRegion);
            this.certRegion = certRegion;
            return this;
        }

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: a user-uploaded SSL certificate.</li>
         * <li><strong>cas</strong>: a certificate that is acquired through Certificate Management Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upload</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The domain name that is secured by the SSL certificate.</p>
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
         * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>y****</p>
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
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
         * <p>off</p>
         */
        public Builder SSLProtocol(String SSLProtocol) {
            this.putQueryParameter("SSLProtocol", SSLProtocol);
            this.SSLProtocol = SSLProtocol;
            return this;
        }

        /**
         * <p>The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
        public SetDcdnDomainSSLCertificateRequest build() {
            return new SetDcdnDomainSSLCertificateRequest(this);
        } 

    } 

}
