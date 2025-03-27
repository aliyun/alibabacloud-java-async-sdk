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
 * {@link ApplyCertificateRequest} extends {@link RequestModel}
 *
 * <p>ApplyCertificateRequest</p>
 */
public class ApplyCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ApplyCertificateRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
        this.siteId = builder.siteId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public String getDomains() {
        return this.domains;
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

    public static final class Builder extends Request.Builder<ApplyCertificateRequest, Builder> {
        private String domains; 
        private Long siteId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ApplyCertificateRequest request) {
            super(request);
            this.domains = request.domains;
            this.siteId = request.siteId;
            this.type = request.type;
        } 

        /**
         * <p>List of domains, separated by commas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,blog.example.com">www.example.com,blog.example.com</a></p>
         */
        public Builder domains(String domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        /**
         * <p>Site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The certificate type. Valid values: lets_encrypt, digicert_single, and digicert_wildcard.</p>
         * 
         * <strong>example:</strong>
         * <p>lets_encrypt</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ApplyCertificateRequest build() {
            return new ApplyCertificateRequest(this);
        } 

    } 

}
