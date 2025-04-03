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
 * {@link GetAggregateConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRulesReportResponseBody</p>
 */
public class GetAggregateConfigRulesReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRulesReport")
    private ConfigRulesReport configRulesReport;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateConfigRulesReportResponseBody(Builder builder) {
        this.configRulesReport = builder.configRulesReport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRulesReportResponseBody create() {
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

        private Builder(GetAggregateConfigRulesReportResponseBody model) {
            this.configRulesReport = model.configRulesReport;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance evaluation report.</p>
         */
        public Builder configRulesReport(ConfigRulesReport configRulesReport) {
            this.configRulesReport = configRulesReport;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0BCC7B2-D0E4-49B0-95D2-6689CFB08D31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateConfigRulesReportResponseBody build() {
            return new GetAggregateConfigRulesReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateConfigRulesReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateConfigRulesReportResponseBody</p>
     */
    public static class ConfigRulesReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

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
            this.aggregatorId = builder.aggregatorId;
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
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
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
            private String aggregatorId; 
            private Long reportCreateTimestamp; 
            private String reportId; 
            private String reportStatus; 
            private String reportUrl; 

            private Builder() {
            } 

            private Builder(ConfigRulesReport model) {
                this.accountId = model.accountId;
                this.aggregatorId = model.aggregatorId;
                this.reportCreateTimestamp = model.reportCreateTimestamp;
                this.reportId = model.reportId;
                this.reportStatus = model.reportStatus;
                this.reportUrl = model.reportUrl;
            } 

            /**
             * <p>The ID of the management account to which the rules belong.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-f632626622af0079****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624332329593</p>
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
             * <li>COMPLETE: The compliance evaluation report was generated.</li>
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
             * <p>The URL used to download the compliance evaluation report.</p>
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
