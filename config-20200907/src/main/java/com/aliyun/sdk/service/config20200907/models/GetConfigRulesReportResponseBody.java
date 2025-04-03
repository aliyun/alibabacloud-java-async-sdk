// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRulesReportResponseBody</p>
 */
public class GetConfigRulesReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRulesReport")
    private ConfigRulesReport configRulesReport;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConfigRulesReportResponseBody(Builder builder) {
        this.configRulesReport = builder.configRulesReport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRulesReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRulesReport
     */
    public ConfigRulesReport getConfigRulesReport() {
        return this.configRulesReport;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigRulesReport configRulesReport; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetConfigRulesReportResponseBody model) {
            this.configRulesReport = model.configRulesReport;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the compliance evaluation report.</p>
         */
        public Builder configRulesReport(ConfigRulesReport configRulesReport) {
            this.configRulesReport = configRulesReport;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRulesReportResponseBody build() {
            return new GetConfigRulesReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigRulesReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRulesReportResponseBody</p>
     */
    public static class ConfigRulesReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("ReportCreateTimestamp")
        private Long reportCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("ReportUrl")
        private String reportUrl;

        private ConfigRulesReport(Builder builder) {
            this.accountId = builder.accountId;
            this.reportCreateTimestamp = builder.reportCreateTimestamp;
            this.reportId = builder.reportId;
            this.reportStatus = builder.reportStatus;
            this.reportUrl = builder.reportUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRulesReport create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return reportCreateTimestamp
         */
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return reportUrl
         */
        public String getReportUrl() {
            return this.reportUrl;
        }

        public static final class Builder {
            private Long accountId; 
            private Long reportCreateTimestamp; 
            private String reportId; 
            private String reportStatus; 
            private String reportUrl; 

            private Builder() {
            } 

            private Builder(ConfigRulesReport model) {
                this.accountId = model.accountId;
                this.reportCreateTimestamp = model.reportCreateTimestamp;
                this.reportId = model.reportId;
                this.reportStatus = model.reportStatus;
                this.reportUrl = model.reportUrl;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the rules belong.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614687022000</p>
             */
            public Builder reportCreateTimestamp(Long reportCreateTimestamp) {
                this.reportCreateTimestamp = reportCreateTimestamp;
                return this;
            }

            /**
             * <p>The ID of the compliance evaluation report.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-88176457e0d900c9****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The status of the compliance evaluation report. Valid values:</p>
             * <ul>
             * <li>NONE: The compliance evaluation report is not generated.</li>
             * <li>CREATING: The compliance evaluation report is being generated.</li>
             * <li>COMPLETE: The compliance evaluation report is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The URL that is used to download the compliance evaluation report.</p>
             */
            public Builder reportUrl(String reportUrl) {
                this.reportUrl = reportUrl;
                return this;
            }

            public ConfigRulesReport build() {
                return new ConfigRulesReport(this);
            } 

        } 

    }
}
