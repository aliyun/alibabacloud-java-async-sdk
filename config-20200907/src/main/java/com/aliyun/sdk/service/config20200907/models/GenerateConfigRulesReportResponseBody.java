// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateConfigRulesReportResponseBody</p>
 */
public class GenerateConfigRulesReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateConfigRulesReportResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateConfigRulesReportResponseBody create() {
        return builder().build();
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
        private String reportId; 
        private String requestId; 

        /**
         * The ID of the compliance evaluation report.
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateConfigRulesReportResponseBody build() {
            return new GenerateConfigRulesReportResponseBody(this);
        } 

    } 

}
