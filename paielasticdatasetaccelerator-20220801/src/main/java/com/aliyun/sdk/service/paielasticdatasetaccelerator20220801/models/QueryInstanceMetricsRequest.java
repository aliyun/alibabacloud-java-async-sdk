// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceMetricsRequest</p>
 */
public class QueryInstanceMetricsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Dimensions")
    private java.util.Map < String, ? > dimensions;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeStep")
    private String timeStep;

    private QueryInstanceMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceMetricsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dimensions
     */
    public java.util.Map < String, ? > getDimensions() {
        return this.dimensions;
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

    public static final class Builder extends Request.Builder<QueryInstanceMetricsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.Map < String, ? > dimensions; 
        private String endTime; 
        private String metricType; 
        private String startTime; 
        private String timeStep; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.metricType = request.metricType;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.Map < String, ? > dimensions) {
            String dimensionsShrink = shrink(dimensions, "Dimensions", "json");
            this.putQueryParameter("Dimensions", dimensionsShrink);
            this.dimensions = dimensions;
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
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
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

        /**
         * TimeStep.
         */
        public Builder timeStep(String timeStep) {
            this.putQueryParameter("TimeStep", timeStep);
            this.timeStep = timeStep;
            return this;
        }

        @Override
        public QueryInstanceMetricsRequest build() {
            return new QueryInstanceMetricsRequest(this);
        } 

    } 

}
