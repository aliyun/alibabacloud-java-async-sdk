// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAggregateConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAggregateConfigRulesReportResponseBody</p>
 */
public class GenerateAggregateConfigRulesReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    private String aggregatorId;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateAggregateConfigRulesReportResponseBody(Builder builder) {
        this.aggregatorId = builder.aggregatorId;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAggregateConfigRulesReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aggregatorId; 
        private String reportId; 
        private String requestId; 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the compliance evaluation report.
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAggregateConfigRulesReportResponseBody build() {
            return new GenerateAggregateConfigRulesReportResponseBody(this);
        } 

    } 

}
