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
 * {@link UploadOriginCaCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadOriginCaCertificateRequest</p>
 */
public class UploadOriginCaCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Certificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UploadOriginCaCertificateRequest(Builder builder) {
        super(builder);
        this.certificate = builder.certificate;
        this.name = builder.name;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadOriginCaCertificateRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UploadOriginCaCertificateRequest, Builder> {
        private String certificate; 
        private String name; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UploadOriginCaCertificateRequest request) {
            super(request);
            this.certificate = request.certificate;
            this.name = request.name;
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
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890***</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UploadOriginCaCertificateRequest build() {
            return new UploadOriginCaCertificateRequest(this);
        } 

    } 

}
