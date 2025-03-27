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
 * {@link UploadSiteOriginClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadSiteOriginClientCertificateRequest</p>
 */
public class UploadSiteOriginClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Certificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UploadSiteOriginClientCertificateRequest(Builder builder) {
        super(builder);
        this.certificate = builder.certificate;
        this.name = builder.name;
        this.privateKey = builder.privateKey;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSiteOriginClientCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UploadSiteOriginClientCertificateRequest, Builder> {
        private String certificate; 
        private String name; 
        private String privateKey; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UploadSiteOriginClientCertificateRequest request) {
            super(request);
            this.certificate = request.certificate;
            this.name = request.name;
            this.privateKey = request.privateKey;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The certificate content.</p>
         * <p>This parameter is required.</p>
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
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The private key of the certificate.</p>
         * <p>This parameter is required.</p>
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
         * <p>Site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UploadSiteOriginClientCertificateRequest build() {
            return new UploadSiteOriginClientCertificateRequest(this);
        } 

    } 

}
