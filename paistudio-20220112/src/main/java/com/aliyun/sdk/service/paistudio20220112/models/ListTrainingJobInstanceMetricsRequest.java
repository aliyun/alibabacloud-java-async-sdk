// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListTrainingJobInstanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListTrainingJobInstanceMetricsRequest</p>
 */
public class ListTrainingJobInstanceMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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

    private ListTrainingJobInstanceMetricsRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobInstanceMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<ListTrainingJobInstanceMetricsRequest, Builder> {
        private String trainingJobId; 
        private String endTime; 
        private String instanceId; 
        private String metricType; 
        private String startTime; 
        private String timeStep; 

        private Builder() {
            super();
        } 

        private Builder(ListTrainingJobInstanceMetricsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metricType = request.metricType;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
        } 

        /**
         * <p>The training job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trains930928remn</p>
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * <p>The end UTC time in ISO 8601 format. If left empty, the current time is used.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trains930928remn-master-0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li>GpuCoreUsage: POD GPU utilization.</li>
         * <li>GpuMemoryUsage: POD GPU memory utilization.</li>
         * <li>CpuCoreUsage: POD CPU utilization.</li>
         * <li>MemoryUsage: POD memory utilization.</li>
         * <li>NetworkInputRate: POD network write rate (TCP/IP) (MB/s).</li>
         * <li>NetworkOutputRate: POD network read rate (TCP/IP) (MB/s).</li>
         * <li>DiskReadRate: POD disk read rate (MB/s).</li>
         * <li>DiskWriteRate: POD disk write rate (MB/s).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GpuCoreUsage</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The start UTC time in ISO 8601 format. If left empty, the job start time is used.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
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
         * <p>The metric collection interval. Valid values: 1h, 30m, 5m, and 10s. h indicates hours, m indicates minutes, and s indicates seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10s</p>
         */
        public Builder timeStep(String timeStep) {
            this.putQueryParameter("TimeStep", timeStep);
            this.timeStep = timeStep;
            return this;
        }

        @Override
        public ListTrainingJobInstanceMetricsRequest build() {
            return new ListTrainingJobInstanceMetricsRequest(this);
        } 

    } 

}
