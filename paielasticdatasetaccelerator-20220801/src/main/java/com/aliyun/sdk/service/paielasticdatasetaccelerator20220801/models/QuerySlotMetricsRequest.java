// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlotMetricsRequest} extends {@link RequestModel}
 *
 * <p>QuerySlotMetricsRequest</p>
 */
public class QuerySlotMetricsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("SlotId")
    @Validation(required = true)
    private String slotId;

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

    private QuerySlotMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.slotId = builder.slotId;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySlotMetricsRequest create() {
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
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
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

    public static final class Builder extends Request.Builder<QuerySlotMetricsRequest, Builder> {
        private String regionId; 
        private String slotId; 
        private java.util.Map < String, ? > dimensions; 
        private String endTime; 
        private String metricType; 
        private String startTime; 
        private String timeStep; 

        private Builder() {
            super();
        } 

        private Builder(QuerySlotMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.slotId = request.slotId;
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
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
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
        public QuerySlotMetricsRequest build() {
            return new QuerySlotMetricsRequest(this);
        } 

    } 

}
