// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeFaultReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultReportResponseBody</p>
 */
public class DescribeFaultReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DiagnosisType")
    private String diagnosisType;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeFaultReportResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.diagnosisType = builder.diagnosisType;
        this.errorMessage = builder.errorMessage;
        this.finishTime = builder.finishTime;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diagnosisType
     */
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String createTime; 
        private String description; 
        private String diagnosisType; 
        private String errorMessage; 
        private String finishTime; 
        private String reportId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeFaultReportResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.createTime = model.createTime;
            this.description = model.description;
            this.diagnosisType = model.diagnosisType;
            this.errorMessage = model.errorMessage;
            this.finishTime = model.finishTime;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The time when the fault report was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-06 17:31:33</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the fault report.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The diagnosis type.</p>
         * 
         * <strong>example:</strong>
         * <p>QUICK</p>
         */
        public Builder diagnosisType(String diagnosisType) {
            this.diagnosisType = diagnosisType;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource Not Found</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The time when the fault report was processed. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07 17:41:33</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100184932123</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the fault report.</p>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeFaultReportResponseBody build() {
            return new DescribeFaultReportResponseBody(this);
        } 

    } 

}
