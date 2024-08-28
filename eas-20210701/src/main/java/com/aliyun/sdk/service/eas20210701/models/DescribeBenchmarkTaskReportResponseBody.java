// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskReportResponseBody</p>
 */
public class DescribeBenchmarkTaskReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("ReportUrl")
    private String reportUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBenchmarkTaskReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.reportUrl = builder.reportUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBenchmarkTaskReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return reportUrl
     */
    public String getReportUrl() {
        return this.reportUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String reportUrl; 
        private String requestId; 

        /**
         * If the value of ReportType is set to RAW, the details about the stress testing report are returned.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * If the value of ReportType is set to Report, the URL of the stress testing report is returned.
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBenchmarkTaskReportResponseBody build() {
            return new DescribeBenchmarkTaskReportResponseBody(this);
        } 

    } 

}
