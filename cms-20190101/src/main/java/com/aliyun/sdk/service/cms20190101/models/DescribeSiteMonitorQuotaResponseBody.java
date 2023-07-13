// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorQuotaResponseBody</p>
 */
public class DescribeSiteMonitorQuotaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The quotas and version of site monitoring.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorQuotaResponseBody build() {
            return new DescribeSiteMonitorQuotaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("SecondMonitor")
        private Boolean secondMonitor;

        @NameInMap("SiteMonitorIdcQuota")
        private Integer siteMonitorIdcQuota;

        @NameInMap("SiteMonitorOperatorQuotaQuota")
        private Integer siteMonitorOperatorQuotaQuota;

        @NameInMap("SiteMonitorQuotaTaskUsed")
        private Integer siteMonitorQuotaTaskUsed;

        @NameInMap("SiteMonitorTaskQuota")
        private Integer siteMonitorTaskQuota;

        @NameInMap("SiteMonitorVersion")
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
             * Indicates whether the second-level monitoring is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder secondMonitor(Boolean secondMonitor) {
                this.secondMonitor = secondMonitor;
                return this;
            }

            /**
             * The quota of detection points that are provided by Alibaba Cloud. Five detection points are provided for free.
             */
            public Builder siteMonitorIdcQuota(Integer siteMonitorIdcQuota) {
                this.siteMonitorIdcQuota = siteMonitorIdcQuota;
                return this;
            }

            /**
             * The quota of detection points that are not provided by Alibaba Cloud. Default value: 0.
             */
            public Builder siteMonitorOperatorQuotaQuota(Integer siteMonitorOperatorQuotaQuota) {
                this.siteMonitorOperatorQuotaQuota = siteMonitorOperatorQuotaQuota;
                return this;
            }

            /**
             * The used quota of site monitoring tasks.
             */
            public Builder siteMonitorQuotaTaskUsed(Integer siteMonitorQuotaTaskUsed) {
                this.siteMonitorQuotaTaskUsed = siteMonitorQuotaTaskUsed;
                return this;
            }

            /**
             * The quota of site monitoring tasks.
             */
            public Builder siteMonitorTaskQuota(Integer siteMonitorTaskQuota) {
                this.siteMonitorTaskQuota = siteMonitorTaskQuota;
                return this;
            }

            /**
             * The version of site monitoring. Valid values:
             * <p>
             * 
             * *   V1
             * *   V2
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
