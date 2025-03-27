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
 * {@link SetOriginClientCertificateHostnamesRequest} extends {@link RequestModel}
 *
 * <p>SetOriginClientCertificateHostnamesRequest</p>
 */
public class SetOriginClientCertificateHostnamesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hostnames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> hostnames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private SetOriginClientCertificateHostnamesRequest(Builder builder) {
        super(builder);
        this.hostnames = builder.hostnames;
        this.id = builder.id;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOriginClientCertificateHostnamesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostnames
     */
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<SetOriginClientCertificateHostnamesRequest, Builder> {
        private java.util.List<String> hostnames; 
        private String id; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(SetOriginClientCertificateHostnamesRequest request) {
            super(request);
            this.hostnames = request.hostnames;
            this.id = request.id;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The domain names to associate.</p>
         * <p>This parameter is required.</p>
         */
        public Builder hostnames(java.util.List<String> hostnames) {
            String hostnamesShrink = shrink(hostnames, "Hostnames", "json");
            this.putBodyParameter("Hostnames", hostnamesShrink);
            this.hostnames = hostnames;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>babaabcd****</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public SetOriginClientCertificateHostnamesRequest build() {
            return new SetOriginClientCertificateHostnamesRequest(this);
        } 

    } 

}
