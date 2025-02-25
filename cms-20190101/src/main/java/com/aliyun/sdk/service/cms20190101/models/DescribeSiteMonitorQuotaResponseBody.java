// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSiteMonitorQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorQuotaResponseBody</p>
 */
public class DescribeSiteMonitorQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSiteMonitorQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The responses code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The quota.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26860260-76C6-404E-AB7A-EB98D36A6885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorQuotaResponseBody build() {
            return new DescribeSiteMonitorQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteMonitorQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecondMonitor")
        private Boolean secondMonitor;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorIdcQuota")
        private Integer siteMonitorIdcQuota;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorOperatorQuotaQuota")
        private Integer siteMonitorOperatorQuotaQuota;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorQuotaTaskUsed")
        private Integer siteMonitorQuotaTaskUsed;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorTaskQuota")
        private Integer siteMonitorTaskQuota;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorVersion")
        private String siteMonitorVersion;

        private Data(Builder builder) {
            this.secondMonitor = builder.secondMonitor;
            this.siteMonitorIdcQuota = builder.siteMonitorIdcQuota;
            this.siteMonitorOperatorQuotaQuota = builder.siteMonitorOperatorQuotaQuota;
            this.siteMonitorQuotaTaskUsed = builder.siteMonitorQuotaTaskUsed;
            this.siteMonitorTaskQuota = builder.siteMonitorTaskQuota;
            this.siteMonitorVersion = builder.siteMonitorVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return secondMonitor
         */
        public Boolean getSecondMonitor() {
            return this.secondMonitor;
        }

        /**
         * @return siteMonitorIdcQuota
         */
        public Integer getSiteMonitorIdcQuota() {
            return this.siteMonitorIdcQuota;
        }

        /**
         * @return siteMonitorOperatorQuotaQuota
         */
        public Integer getSiteMonitorOperatorQuotaQuota() {
            return this.siteMonitorOperatorQuotaQuota;
        }

        /**
         * @return siteMonitorQuotaTaskUsed
         */
        public Integer getSiteMonitorQuotaTaskUsed() {
            return this.siteMonitorQuotaTaskUsed;
        }

        /**
         * @return siteMonitorTaskQuota
         */
        public Integer getSiteMonitorTaskQuota() {
            return this.siteMonitorTaskQuota;
        }

        /**
         * @return siteMonitorVersion
         */
        public String getSiteMonitorVersion() {
            return this.siteMonitorVersion;
        }

        public static final class Builder {
            private Boolean secondMonitor; 
            private Integer siteMonitorIdcQuota; 
            private Integer siteMonitorOperatorQuotaQuota; 
            private Integer siteMonitorQuotaTaskUsed; 
            private Integer siteMonitorTaskQuota; 
            private String siteMonitorVersion; 

            /**
             * <p>Indicates whether second-level monitoring is enabled. Valid values:</p>
             * <ul>
             * <li>true: Second-level monitoring is enabled.</li>
             * <li>false: Second-level monitoring is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder secondMonitor(Boolean secondMonitor) {
                this.secondMonitor = secondMonitor;
                return this;
            }

            /**
             * <p>The quota of detection points that are provided by Alibaba Cloud. Five detection points are provided for free.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder siteMonitorIdcQuota(Integer siteMonitorIdcQuota) {
                this.siteMonitorIdcQuota = siteMonitorIdcQuota;
                return this;
            }

            /**
             * <p>The quota of detection points that are not provided by Alibaba Cloud. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder siteMonitorOperatorQuotaQuota(Integer siteMonitorOperatorQuotaQuota) {
                this.siteMonitorOperatorQuotaQuota = siteMonitorOperatorQuotaQuota;
                return this;
            }

            /**
             * <p>The used quota of site monitoring tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder siteMonitorQuotaTaskUsed(Integer siteMonitorQuotaTaskUsed) {
                this.siteMonitorQuotaTaskUsed = siteMonitorQuotaTaskUsed;
                return this;
            }

            /**
             * <p>The quota of site monitoring tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder siteMonitorTaskQuota(Integer siteMonitorTaskQuota) {
                this.siteMonitorTaskQuota = siteMonitorTaskQuota;
                return this;
            }

            /**
             * <p>The version of site monitoring. Valid values:</p>
             * <ul>
             * <li>V1</li>
             * <li>V2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder siteMonitorVersion(String siteMonitorVersion) {
                this.siteMonitorVersion = siteMonitorVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
