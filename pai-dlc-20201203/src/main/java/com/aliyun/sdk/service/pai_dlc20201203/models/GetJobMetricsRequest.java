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
 * {@link GetJobMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetJobMetricsRequest</p>
 */
public class GetJobMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStep")
    private String timeStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetJobMetricsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobMetricsRequest create() {
        return builder().build();
    }

@Override
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeStep
     */
    public String getTimeStep() {
        return this.timeStep;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetJobMetricsRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private String metricType; 
        private String startTime; 
        private String timeStep; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetJobMetricsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.metricType = request.metricType;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
            this.token = request.token;
        } 

        /**
         * <p>The node ID. You can call <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to obtain the IDs of all nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*******</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The end time (UTC) of the time range for querying monitoring data. Default value: the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metric type of the monitoring data to query. Valid values:</p>
         * <ul>
         * <li><p>GpuCoreUsage: GPU utilization.</p>
         * </li>
         * <li><p>GpuMemoryUsage: GPU memory usage.</p>
         * </li>
         * <li><p>CpuCoreUsage: CPU utilization.</p>
         * </li>
         * <li><p>MemoryUsage: memory usage.</p>
         * </li>
         * <li><p>NetworkInputRate: network input rate.</p>
         * </li>
         * <li><p>NetworkOutputRate: network output rate.</p>
         * </li>
         * <li><p>DiskReadRate: disk read rate.</p>
         * </li>
         * <li><p>DiskWriteRate: disk write rate.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GpuMemoryUsage</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The start time (UTC) of the time range for querying monitoring data. Default value: one hour before the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time interval at which monitoring data is returned. Default value: 5 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        public Builder timeStep(String timeStep) {
            this.putQueryParameter("TimeStep", timeStep);
            this.timeStep = timeStep;
            return this;
        }

        /**
         * <p>The temporary token used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>eyXXXX-XXXX.XXXXX</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetJobMetricsRequest build() {
            return new GetJobMetricsRequest(this);
        } 

    } 

}
