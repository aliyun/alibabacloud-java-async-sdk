// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. You can view the data of up to seven days in the previous 30 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1678432430967</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5ea73876ukci****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metric whose trend you want to query. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: the number of executions.</li>
         * <li><strong>avgRt</strong>: the average execution duration.</li>
         * <li><strong>rtRate</strong>: the execution duration percentage.</li>
         * <li><strong>rowsExamined</strong>: the total number of scanned rows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter is required if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1677461663092</p>
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
