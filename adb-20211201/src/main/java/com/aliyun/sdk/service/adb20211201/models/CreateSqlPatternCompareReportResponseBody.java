// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateSqlPatternCompareReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSqlPatternCompareReportResponseBody</p>
 */
public class CreateSqlPatternCompareReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSqlPatternCompareReportResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlPatternCompareReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long reportId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateSqlPatternCompareReportResponseBody model) {
            this.reportId = model.reportId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the created report. This value only indicates that the request has been accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSqlPatternCompareReportResponseBody build() {
            return new CreateSqlPatternCompareReportResponseBody(this);
        } 

    } 

}
