// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPfsMetricTrendsRequest} extends {@link RequestModel}
 *
 * <p>GetPfsMetricTrendsRequest</p>
 */
public class GetPfsMetricTrendsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private GetPfsMetricTrendsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metric = builder.metric;
        this.nodeId = builder.nodeId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPfsMetricTrendsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPfsMetricTrendsRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String metric; 
        private String nodeId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPfsMetricTrendsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metric = request.metric;
            this.nodeId = request.nodeId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. You can view the data of up to seven days in the previous 30 days.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The metric whose trend you want to query. Valid values:
         * <p>
         * 
         * *   **count**: the number of executions.
         * *   **avgRt**: the average execution duration.
         * *   **rtRate**: the execution duration percentage.
         * *   **rowsExamined**: the total number of scanned rows.
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  You must specify this parameter for an ApsaraDB RDS for MySQL cluster instance and a PolarDB for MySQL cluster.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPfsMetricTrendsRequest build() {
            return new GetPfsMetricTrendsRequest(this);
        } 

    } 

}
