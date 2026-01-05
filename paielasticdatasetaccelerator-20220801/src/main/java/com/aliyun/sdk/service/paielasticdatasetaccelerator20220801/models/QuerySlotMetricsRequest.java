// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link QuerySlotMetricsRequest} extends {@link RequestModel}
 *
 * <p>QuerySlotMetricsRequest</p>
 */
public class QuerySlotMetricsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SlotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.Map<String, ?> dimensions;

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
    public java.util.Map<String, ?> getDimensions() {
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
        private java.util.Map<String, ?> dimensions; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>slot-abcdefgh12****</p>
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.Map<String, ?> dimensions) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkReceiveBytesPerSecond</p>
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
