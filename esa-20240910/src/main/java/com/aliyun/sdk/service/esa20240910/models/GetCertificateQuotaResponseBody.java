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
 * {@link GetCertificateQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateQuotaResponseBody</p>
 */
public class GetCertificateQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("QuotaUsage")
    private Long quotaUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteCount")
    private Long siteCount;

    @com.aliyun.core.annotation.NameInMap("SiteUsage")
    private java.util.List<SiteUsage> siteUsage;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetCertificateQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.quotaUsage = builder.quotaUsage;
        this.requestId = builder.requestId;
        this.siteCount = builder.siteCount;
        this.siteUsage = builder.siteUsage;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * @return quotaUsage
     */
    public Long getQuotaUsage() {
        return this.quotaUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteCount
     */
    public Long getSiteCount() {
        return this.siteCount;
    }

    /**
     * @return siteUsage
     */
    public java.util.List<SiteUsage> getSiteUsage() {
        return this.siteUsage;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long quota; 
        private Long quotaUsage; 
        private String requestId; 
        private Long siteCount; 
        private java.util.List<SiteUsage> siteUsage; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetCertificateQuotaResponseBody model) {
            this.quota = model.quota;
            this.quotaUsage = model.quotaUsage;
            this.requestId = model.requestId;
            this.siteCount = model.siteCount;
            this.siteUsage = model.siteUsage;
            this.type = model.type;
        } 

        /**
         * <p>Free certificate quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>Usage of free certificate quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder quotaUsage(Long quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Number of sites.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder siteCount(Long siteCount) {
            this.siteCount = siteCount;
            return this;
        }

        /**
         * <p>List of site usage details.</p>
         */
        public Builder siteUsage(java.util.List<SiteUsage> siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }

        /**
         * <p>Certificate Quota type.</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetCertificateQuotaResponseBody build() {
            return new GetCertificateQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateQuotaResponseBody</p>
     */
    public static class SiteUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SiteUsage")
        private Long siteUsage;

        private SiteUsage(Builder builder) {
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.siteUsage = builder.siteUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteUsage create() {
            return builder().build();
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

        /**
         * @return siteUsage
         */
        public Long getSiteUsage() {
            return this.siteUsage;
        }

        public static final class Builder {
            private String siteId; 
            private String siteName; 
            private Long siteUsage; 

            private Builder() {
            } 

            private Builder(SiteUsage model) {
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.siteUsage = model.siteUsage;
            } 

            /**
             * <p>Site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>165929521496928</p>
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>Site name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>Site usage.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder siteUsage(Long siteUsage) {
                this.siteUsage = siteUsage;
                return this;
            }

            public SiteUsage build() {
                return new SiteUsage(this);
            } 

        } 

    }
}
