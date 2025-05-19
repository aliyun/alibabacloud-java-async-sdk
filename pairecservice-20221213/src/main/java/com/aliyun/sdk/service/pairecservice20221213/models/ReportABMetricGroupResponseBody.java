// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ReportABMetricGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ReportABMetricGroupResponseBody</p>
 */
public class ReportABMetricGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentReport")
    private java.util.Map<String, ExperimentReportValue> experimentReport;

    @com.aliyun.core.annotation.NameInMap("GroupDimension")
    private java.util.List<String> groupDimension;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReportABMetricGroupResponseBody(Builder builder) {
        this.experimentReport = builder.experimentReport;
        this.groupDimension = builder.groupDimension;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportABMetricGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentReport
     */
    public java.util.Map<String, ExperimentReportValue> getExperimentReport() {
        return this.experimentReport;
    }

    /**
     * @return groupDimension
     */
    public java.util.List<String> getGroupDimension() {
        return this.groupDimension;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ExperimentReportValue> experimentReport; 
        private java.util.List<String> groupDimension; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReportABMetricGroupResponseBody model) {
            this.experimentReport = model.experimentReport;
            this.groupDimension = model.groupDimension;
            this.requestId = model.requestId;
        } 

        /**
         * ExperimentReport.
         */
        public Builder experimentReport(java.util.Map<String, ExperimentReportValue> experimentReport) {
            this.experimentReport = experimentReport;
            return this;
        }

        /**
         * GroupDimension.
         */
        public Builder groupDimension(java.util.List<String> groupDimension) {
            this.groupDimension = groupDimension;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportABMetricGroupResponseBody build() {
            return new ReportABMetricGroupResponseBody(this);
        } 

    } 

}
