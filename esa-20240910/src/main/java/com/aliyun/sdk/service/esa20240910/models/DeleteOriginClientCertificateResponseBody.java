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
 * {@link DeleteOriginClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteOriginClientCertificateResponseBody</p>
 */
public class DeleteOriginClientCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    private DeleteOriginClientCertificateResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOriginClientCertificateResponseBody create() {
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

        private Builder(DeleteOriginClientCertificateResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
        } 

        /**
         * <p>The certificate ID.</p>
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
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
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

        public DeleteOriginClientCertificateResponseBody build() {
            return new DeleteOriginClientCertificateResponseBody(this);
        } 

    } 

}
