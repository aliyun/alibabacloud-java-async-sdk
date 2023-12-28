// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricsDataRequest</p>
 */
public class DescribeMetricsDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("GroupByLabels")
    @Validation(required = true)
    private String groupByLabels;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Labels")
    @Validation(required = true)
    private String labels;

    @Query
    @NameInMap("Limit")
    private String limit;

    @Query
    @NameInMap("Metrics")
    @Validation(required = true)
    private String metrics;

    @Body
    @NameInMap("ReplicaType")
    private String replicaType;

    @Query
    @NameInMap("SortMetricKey")
    private String sortMetricKey;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeMetricsDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.groupByLabels = builder.groupByLabels;
        this.instanceId = builder.instanceId;
        this.labels = builder.labels;
        this.limit = builder.limit;
        this.metrics = builder.metrics;
        this.replicaType = builder.replicaType;
        this.sortMetricKey = builder.sortMetricKey;
        this.sortOrder = builder.sortOrder;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupByLabels
     */
    public String getGroupByLabels() {
        return this.groupByLabels;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return replicaType
     */
    public String getReplicaType() {
        return this.replicaType;
    }

    /**
     * @return sortMetricKey
     */
    public String getSortMetricKey() {
        return this.sortMetricKey;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricsDataRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String groupByLabels; 
        private String instanceId; 
        private String labels; 
        private String limit; 
        private String metrics; 
        private String replicaType; 
        private String sortMetricKey; 
        private String sortOrder; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricsDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.groupByLabels = request.groupByLabels;
            this.instanceId = request.instanceId;
            this.labels = request.labels;
            this.limit = request.limit;
            this.metrics = request.metrics;
            this.replicaType = request.replicaType;
            this.sortMetricKey = request.sortMetricKey;
            this.sortOrder = request.sortOrder;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupByLabels.
         */
        public Builder groupByLabels(String groupByLabels) {
            this.putQueryParameter("GroupByLabels", groupByLabels);
            this.groupByLabels = groupByLabels;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * ReplicaType.
         */
        public Builder replicaType(String replicaType) {
            this.putBodyParameter("ReplicaType", replicaType);
            this.replicaType = replicaType;
            return this;
        }

        /**
         * SortMetricKey.
         */
        public Builder sortMetricKey(String sortMetricKey) {
            this.putQueryParameter("SortMetricKey", sortMetricKey);
            this.sortMetricKey = sortMetricKey;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricsDataRequest build() {
            return new DescribeMetricsDataRequest(this);
        } 

    } 

}
