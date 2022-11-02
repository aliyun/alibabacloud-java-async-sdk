// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskReportResponseBody</p>
 */
public class DescribeBenchmarkTaskReportResponseBody extends TeaModel {
    @NameInMap("Data")
    private Object data;

    @NameInMap("ReportUrl")
    private String reportUrl;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * ReportUrl.
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * RequestId.
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
