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
 * {@link DeleteSiteOriginClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSiteOriginClientCertificateResponseBody</p>
 */
public class DeleteSiteOriginClientCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    private DeleteSiteOriginClientCertificateResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSiteOriginClientCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String id; 
        private String requestId; 
        private Long siteId; 
        private String siteName; 

        private Builder() {
        } 

        private Builder(DeleteSiteOriginClientCertificateResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
        } 

        /**
         * <p>The certificate ID on ESA.</p>
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
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
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

        public DeleteSiteOriginClientCertificateResponseBody build() {
            return new DeleteSiteOriginClientCertificateResponseBody(this);
        } 

    } 

}
