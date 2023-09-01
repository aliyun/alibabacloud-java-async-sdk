// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceMetricsRequest</p>
 */
public class GetInstanceMetricsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeStep")
    private String timeStep;

    private GetInstanceMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metricType = builder.metricType;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetInstanceMetricsRequest, Builder> {
        private String endTime; 
        private String instanceId; 
        private String metricType; 
        private String regionId; 
        private String startTime; 
        private String timeStep; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceMetricsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metricType = request.metricType;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public GetInstanceMetricsRequest build() {
            return new GetInstanceMetricsRequest(this);
        } 

    } 

}
