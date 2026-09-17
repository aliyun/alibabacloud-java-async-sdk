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
 * {@link CancelSqlPatternCompareReportResponseBody} extends {@link TeaModel}
 *
 * <p>CancelSqlPatternCompareReportResponseBody</p>
 */
public class CancelSqlPatternCompareReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CancelTime")
    private String cancelTime;

    @com.aliyun.core.annotation.NameInMap("Canceled")
    private Boolean canceled;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelSqlPatternCompareReportResponseBody(Builder builder) {
        this.cancelTime = builder.cancelTime;
        this.canceled = builder.canceled;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSqlPatternCompareReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelTime
     */
    public String getCancelTime() {
        return this.cancelTime;
    }

    /**
     * @return canceled
     */
    public Boolean getCanceled() {
        return this.canceled;
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
        private String cancelTime; 
        private Boolean canceled; 
        private Long reportId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CancelSqlPatternCompareReportResponseBody model) {
            this.cancelTime = model.cancelTime;
            this.canceled = model.canceled;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the report was first canceled. The time is in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T01:06Z</p>
         */
        public Builder cancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }

        /**
         * <p>Indicates whether the report is canceled. The value true is returned when the report is successfully canceled or canceled again.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canceled(Boolean canceled) {
            this.canceled = canceled;
            return this;
        }

        /**
         * <p>The SQL Pattern comparison report ID.</p>
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

        public CancelSqlPatternCompareReportResponseBody build() {
            return new CancelSqlPatternCompareReportResponseBody(this);
        } 

    } 

}
