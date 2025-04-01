// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link LogRunMetricsRequest} extends {@link RequestModel}
 *
 * <p>LogRunMetricsRequest</p>
 */
public class LogRunMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<RunMetric> metrics;

    private LogRunMetricsRequest(Builder builder) {
        super(builder);
        this.runId = builder.runId;
        this.metrics = builder.metrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogRunMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return metrics
     */
    public java.util.List<RunMetric> getMetrics() {
        return this.metrics;
    }

    public static final class Builder extends Request.Builder<LogRunMetricsRequest, Builder> {
        private String runId; 
        private java.util.List<RunMetric> metrics; 

        private Builder() {
            super();
        } 

        private Builder(LogRunMetricsRequest request) {
            super(request);
            this.runId = request.runId;
            this.metrics = request.metrics;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1qJhzJ2YXgX****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<RunMetric> metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        @Override
        public LogRunMetricsRequest build() {
            return new LogRunMetricsRequest(this);
        } 

    } 

}
