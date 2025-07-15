// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SetLiveDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetLiveDomainCertificateRequest</p>
 */
public class SetLiveDomainCertificateRequest extends Request {
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

    private SetLiveDomainCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.forceSet = builder.forceSet;
        this.ownerId = builder.ownerId;
        this.SSLPri = builder.SSLPri;
        this.SSLProtocol = builder.SSLProtocol;
        this.SSLPub = builder.SSLPub;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveDomainCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<SetLiveDomainCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domainName; 
        private String forceSet; 
        private Long ownerId; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveDomainCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.forceSet = request.forceSet;
            this.ownerId = request.ownerId;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cert-****</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: a custom certificate</li>
         * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service</li>
         * <li><strong>free</strong>: a free certificate (for testing)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The domain name that is secured by the certificate. The domain name uses <code>HTTPS</code>-based acceleration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>developer.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to check the certificate name for duplicates. A value of 1 indicates that the system does not perform the check and overwrites the information about the certificate that has the same name. Set the value to <strong>1</strong>.</p>
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
         * <p>The private key.</p>
         * <blockquote>
         * <p> This parameter is required only if you set the SSLProtocol parameter to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
            return this;
        }

        /**
         * <p>Specifies whether to enable the HTTPS certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>. If you set this parameter to <strong>on</strong>, you must also specify the SSLPub and SSLPri parameters.</li>
         * <li><strong>off</strong>. This is the default value.</li>
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
         * <p>The public key.</p>
         * <blockquote>
         * <p> This parameter is required only if you set the SSLProtocol parameter to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
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
        public SetLiveDomainCertificateRequest build() {
            return new SetLiveDomainCertificateRequest(this);
        } 

    } 

}
