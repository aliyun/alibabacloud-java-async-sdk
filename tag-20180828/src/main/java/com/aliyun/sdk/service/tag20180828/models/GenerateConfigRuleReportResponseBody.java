// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateConfigRuleReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateConfigRuleReportResponseBody</p>
 */
public class GenerateConfigRuleReportResponseBody extends TeaModel {
    @NameInMap("ReportId")
    private String reportId;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateConfigRuleReportResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateConfigRuleReportResponseBody create() {
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
         * The ID of the resource non-compliance report.
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

        public GenerateConfigRuleReportResponseBody build() {
            return new GenerateConfigRuleReportResponseBody(this);
        } 

    } 

}
