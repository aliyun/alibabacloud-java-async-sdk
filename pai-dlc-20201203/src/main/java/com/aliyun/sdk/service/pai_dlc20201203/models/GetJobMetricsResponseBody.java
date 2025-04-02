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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetJobMetricsResponseBody model) {
            this.jobId = model.jobId;
            this.podMetrics = model.podMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*******</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The monitoring metrics of the job.</p>
         */
        public Builder podMetrics(java.util.List<PodMetric> podMetrics) {
            this.podMetrics = podMetrics;
            return this;
        }

        /**
         * <p>The request ID. You can troubleshoot issues based on the request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
