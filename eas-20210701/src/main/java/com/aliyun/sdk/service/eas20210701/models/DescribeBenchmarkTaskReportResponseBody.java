// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
         * <p>If the value of ReportType is set to RAW, the details about the stress testing report are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;TimestampList&quot;: [&quot;int64&quot;],
         *     &quot;QPSList&quot;: [&quot;float32&quot;],
         *     &quot;RTList&quot;: [
         *       {
         *         &quot;AVG&quot;: &quot;float32&quot;,
         *         &quot;TP100&quot;: &quot;float32&quot;,
         *         &quot;TP99&quot;: &quot;float32&quot;,
         *         &quot;TP90&quot;: &quot;float32&quot;,
         *         &quot;TP50&quot;: &quot;float32&quot;,
         *         &quot;TP10&quot;: &quot;float32&quot;
         *       }
         *     ],
         *     &quot;TrafficList&quot;: [
         *       {
         *         &quot;Send&quot;: &quot;float64&quot;,
         *         &quot;Receive&quot;: &quot;float64&quot;
         *       }
         *     ],
         *     &quot;StatusCode&quot;: {
         *       &quot;200&quot;: &quot;uint64&quot;,
         *       &quot;450&quot;: &quot;uint64&quot;,
         *       &quot;500&quot;: &quot;uint64&quot;
         *     },
         *     &quot;Count&quot;: &quot;uint64&quot;,
         *     &quot;Total&quot;: &quot;float64&quot;,
         *     &quot;MinRT&quot;: &quot;float32&quot;,
         *     &quot;AvgRT&quot;: &quot;float32&quot;,
         *     &quot;MaxRT&quot;: &quot;float32&quot;,
         *     &quot;QPS&quot;: &quot;float32&quot;,
         *     &quot;TotalSend&quot;: &quot;float64&quot;,
         *     &quot;TotalReceive&quot;: &quot;float64&quot;,
         *     &quot;RTDistribution&quot;: [
         *       {
         *         &quot;Latency&quot;: &quot;float32&quot;,
         *         &quot;Percentage&quot;: &quot;int&quot;
         *       }
         *     ],
         *     &quot;RTHistogram&quot;: [
         *       {
         *         &quot;Count&quot;: &quot;int&quot;,
         *         &quot;Mark&quot;: &quot;float32&quot;,
         *         &quot;Frequency&quot;: &quot;float32&quot;
         *       }
         *     ]
         *   }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>If the value of ReportType is set to Report, the URL of the stress testing report is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://eas-benchmark.oss-cn-chengdu.aliyuncs.com/summary/benchmark-larec-test-015d-10007.html">http://eas-benchmark.oss-cn-chengdu.aliyuncs.com/summary/benchmark-larec-test-015d-10007.html</a></p>
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82********</p>
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
