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
         * <p>Training job ID.</p>
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
         * <p>End time in UTC, in ISO 8601 format. If empty, use the current time.</p>
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
         * <p>Instance ID.</p>
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
         * <p>Metric type:</p>
         * <ul>
         * <li><p>GpuCoreUsage: POD GPU usage</p>
         * </li>
         * <li><p>GpuMemoryUsage: POD GPU memory usage</p>
         * </li>
         * <li><p>CpuCoreUsage: POD CPU usage</p>
         * </li>
         * <li><p>MemoryUsage: POD memory usage</p>
         * </li>
         * <li><p>NetworkInputRate: POD network input rate (TCP/IP) (MB/s)</p>
         * </li>
         * <li><p>NetworkOutputRate: POD network output rate (TCP/IP) (MB/s)</p>
         * </li>
         * <li><p>DiskReadRate: POD disk read rate (MB/s)</p>
         * </li>
         * <li><p>DiskWriteRate: POD disk write rate (MB/s)</p>
         * </li>
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
         * <p>Start time in UTC, in ISO 8601 format. If empty, use the job start time.</p>
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
         * <p>Time interval. Valid values: 1h, 30m, 5m, 10s.</p>
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
