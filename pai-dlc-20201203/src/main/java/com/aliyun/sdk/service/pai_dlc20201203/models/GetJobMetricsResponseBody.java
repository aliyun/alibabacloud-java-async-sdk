// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetJobMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobMetricsResponseBody</p>
 */
public class GetJobMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PodMetrics")
    private java.util.List<PodMetric> podMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetJobMetricsResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.podMetrics = builder.podMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return podMetrics
     */
    public java.util.List<PodMetric> getPodMetrics() {
        return this.podMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private java.util.List<PodMetric> podMetrics; 
        private String requestId; 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * PodMetrics.
         */
        public Builder podMetrics(java.util.List<PodMetric> podMetrics) {
            this.podMetrics = podMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobMetricsResponseBody build() {
            return new GetJobMetricsResponseBody(this);
        } 

    } 

}
