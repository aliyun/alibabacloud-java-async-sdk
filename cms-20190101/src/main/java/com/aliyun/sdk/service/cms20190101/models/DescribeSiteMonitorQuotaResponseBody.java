// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSiteMonitorQuotaResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The value 200 indicates that the request was successful.</p>
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
         * <p>The quota information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Request succeeded.</p>
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
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.secondMonitor = model.secondMonitor;
                this.siteMonitorIdcQuota = model.siteMonitorIdcQuota;
                this.siteMonitorOperatorQuotaQuota = model.siteMonitorOperatorQuotaQuota;
                this.siteMonitorQuotaTaskUsed = model.siteMonitorQuotaTaskUsed;
                this.siteMonitorTaskQuota = model.siteMonitorTaskQuota;
                this.siteMonitorVersion = model.siteMonitorVersion;
            } 

            /**
             * <p>Indicates whether second-level monitoring is enabled. Valid values:</p>
             * <ul>
             * <li><p>true: enabled.</p>
             * </li>
             * <li><p>false: disabled.</p>
             * </li>
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
             * <p>The quota of Alibaba detection points. The free quota is 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder siteMonitorIdcQuota(Integer siteMonitorIdcQuota) {
                this.siteMonitorIdcQuota = siteMonitorIdcQuota;
                return this;
            }

            /**
             * <p>The quota of non-Alibaba detection points. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder siteMonitorOperatorQuotaQuota(Integer siteMonitorOperatorQuotaQuota) {
                this.siteMonitorOperatorQuotaQuota = siteMonitorOperatorQuotaQuota;
                return this;
            }

            /**
             * <p>The number of used site monitoring detection task quotas.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder siteMonitorQuotaTaskUsed(Integer siteMonitorQuotaTaskUsed) {
                this.siteMonitorQuotaTaskUsed = siteMonitorQuotaTaskUsed;
                return this;
            }

            /**
             * <p>The quota of site monitoring detection tasks.</p>
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
             * <li><p>V1: the old version.</p>
             * </li>
             * <li><p>V2: the new version.</p>
             * </li>
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
