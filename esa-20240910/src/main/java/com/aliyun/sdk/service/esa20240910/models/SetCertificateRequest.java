// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetCertificateRequest</p>
 */
public class SetCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CasId")
    private Long casId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private SetCertificateRequest(Builder builder) {
        super(builder);
        this.casId = builder.casId;
        this.certificate = builder.certificate;
        this.id = builder.id;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.privateKey = builder.privateKey;
        this.region = builder.region;
        this.securityToken = builder.securityToken;
        this.siteId = builder.siteId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casId
     */
    public Long getCasId() {
        return this.casId;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SetCertificateRequest, Builder> {
        private Long casId; 
        private String certificate; 
        private String id; 
        private String name; 
        private Long ownerId; 
        private String privateKey; 
        private String region; 
        private String securityToken; 
        private Long siteId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SetCertificateRequest request) {
            super(request);
            this.casId = request.casId;
            this.certificate = request.certificate;
            this.id = request.id;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.privateKey = request.privateKey;
            this.region = request.region;
            this.securityToken = request.securityToken;
            this.siteId = request.siteId;
            this.type = request.type;
        } 

        /**
         * <p>The certificate ID on Certificate Management Service.</p>
         * 
         * <strong>example:</strong>
         * <p>30000478</p>
         */
        public Builder casId(Long casId) {
            this.putBodyParameter("CasId", casId);
            this.casId = casId;
            return this;
        }

        /**
         * <p>The certificate content.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.putBodyParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The certificate ID on ESA.</p>
         * 
         * <strong>example:</strong>
         * <p>30001303</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * <p>The private key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.putBodyParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
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
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li>cas: a certificate purchased by using Certificate Management Service.</li>
         * <li>upload: a custom certificate that you upload.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SetCertificateRequest build() {
            return new SetCertificateRequest(this);
        } 

    } 

}
