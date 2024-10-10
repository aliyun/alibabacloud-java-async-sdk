// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceQuotasWithUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceQuotasWithUsageResponseBody</p>
 */
public class ListInstanceQuotasWithUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List < Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListInstanceQuotasWithUsageResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceQuotasWithUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return quotas
     */
    public java.util.List < Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String instanceId; 
        private java.util.List < Quotas> quotas; 
        private String requestId; 
        private String status; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List < Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListInstanceQuotasWithUsageResponseBody build() {
            return new ListInstanceQuotasWithUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceQuotasWithUsageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceQuotasWithUsageResponseBody</p>
     */
    public static class SiteUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SiteUsage")
        private String siteUsage;

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
        public Long getSiteId() {
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
        public String getSiteUsage() {
            return this.siteUsage;
        }

        public static final class Builder {
            private Long siteId; 
            private String siteName; 
            private String siteUsage; 

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

            /**
             * SiteUsage.
             */
            public Builder siteUsage(String siteUsage) {
                this.siteUsage = siteUsage;
                return this;
            }

            public SiteUsage build() {
                return new SiteUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceQuotasWithUsageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceQuotasWithUsageResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private String quotaValue;

        @com.aliyun.core.annotation.NameInMap("SiteUsage")
        private java.util.List < SiteUsage> siteUsage;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private Quotas(Builder builder) {
            this.quotaName = builder.quotaName;
            this.quotaValue = builder.quotaValue;
            this.siteUsage = builder.siteUsage;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaValue
         */
        public String getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return siteUsage
         */
        public java.util.List < SiteUsage> getSiteUsage() {
            return this.siteUsage;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String quotaName; 
            private String quotaValue; 
            private java.util.List < SiteUsage> siteUsage; 
            private String usage; 

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * QuotaValue.
             */
            public Builder quotaValue(String quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * SiteUsage.
             */
            public Builder siteUsage(java.util.List < SiteUsage> siteUsage) {
                this.siteUsage = siteUsage;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
