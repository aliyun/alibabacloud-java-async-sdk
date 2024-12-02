// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetClientCertificateHostnamesRequest} extends {@link RequestModel}
 *
 * <p>SetClientCertificateHostnamesRequest</p>
 */
public class SetClientCertificateHostnamesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hostnames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > hostnames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private SetClientCertificateHostnamesRequest(Builder builder) {
        super(builder);
        this.hostnames = builder.hostnames;
        this.id = builder.id;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClientCertificateHostnamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostnames
     */
    public java.util.List < String > getHostnames() {
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

    public static final class Builder extends Request.Builder<SetClientCertificateHostnamesRequest, Builder> {
        private java.util.List < String > hostnames; 
        private String id; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(SetClientCertificateHostnamesRequest request) {
            super(request);
            this.hostnames = request.hostnames;
            this.id = request.id;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hostnames(java.util.List < String > hostnames) {
            String hostnamesShrink = shrink(hostnames, "Hostnames", "json");
            this.putBodyParameter("Hostnames", hostnamesShrink);
            this.hostnames = hostnames;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
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

        @Override
        public SetClientCertificateHostnamesRequest build() {
            return new SetClientCertificateHostnamesRequest(this);
        } 

    } 

}
