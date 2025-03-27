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
 * {@link SetOriginClientCertificateHostnamesResponseBody} extends {@link TeaModel}
 *
 * <p>SetOriginClientCertificateHostnamesResponseBody</p>
 */
public class SetOriginClientCertificateHostnamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hostnames")
    private java.util.List<String> hostnames;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    private SetOriginClientCertificateHostnamesResponseBody(Builder builder) {
        this.hostnames = builder.hostnames;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOriginClientCertificateHostnamesResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static final class Builder {
        private java.util.List<String> hostnames; 
        private String id; 
        private String requestId; 
        private String siteId; 
        private String siteName; 

        private Builder() {
        } 

        private Builder(SetOriginClientCertificateHostnamesResponseBody model) {
            this.hostnames = model.hostnames;
            this.id = model.id;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
        } 

        /**
         * <p>The domain name.</p>
         */
        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        /**
         * <p>The ID of the client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>babaabcd****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(String siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        public SetOriginClientCertificateHostnamesResponseBody build() {
            return new SetOriginClientCertificateHostnamesResponseBody(this);
        } 

    } 

}
