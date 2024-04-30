// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticReportResponseBody</p>
 */
public class CreateDiagnosticReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDiagnosticReportResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticReportResponseBody create() {
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
         * The ID of the diagnostic report.
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

        public CreateDiagnosticReportResponseBody build() {
            return new CreateDiagnosticReportResponseBody(this);
        } 

    } 

}
