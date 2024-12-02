// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClientCertificateHostnamesResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientCertificateHostnamesResponseBody</p>
 */
public class GetClientCertificateHostnamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hostnames")
    private java.util.List < String > hostnames;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    private GetClientCertificateHostnamesResponseBody(Builder builder) {
        this.hostnames = builder.hostnames;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientCertificateHostnamesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static final class Builder {
        private java.util.List < String > hostnames; 
        private String id; 
        private String requestId; 
        private Long siteId; 
        private String siteName; 

        /**
         * Hostnames.
         */
        public Builder hostnames(java.util.List < String > hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        public GetClientCertificateHostnamesResponseBody build() {
            return new GetClientCertificateHostnamesResponseBody(this);
        } 

    } 

}
