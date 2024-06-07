// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SplitTrafficControlTargetRequest} extends {@link RequestModel}
 *
 * <p>SplitTrafficControlTargetRequest</p>
 */
public class SplitTrafficControlTargetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SetValues")
    private java.util.List < Long > setValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    private java.util.List < Long > timePoints;

    private SplitTrafficControlTargetRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.setValues = builder.setValues;
        this.timePoints = builder.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SplitTrafficControlTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return setValues
     */
    public java.util.List < Long > getSetValues() {
        return this.setValues;
    }

    /**
     * @return timePoints
     */
    public java.util.List < Long > getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder extends Request.Builder<SplitTrafficControlTargetRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String environment; 
        private String instanceId; 
        private java.util.List < Long > setValues; 
        private java.util.List < Long > timePoints; 

        private Builder() {
            super();
        } 

        private Builder(SplitTrafficControlTargetRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.setValues = request.setValues;
            this.timePoints = request.timePoints;
        } 

        /**
         * TrafficControlTargetId.
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.putPathParameter("TrafficControlTargetId", trafficControlTargetId);
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
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
         * Environment.
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SetValues.
         */
        public Builder setValues(java.util.List < Long > setValues) {
            this.putBodyParameter("SetValues", setValues);
            this.setValues = setValues;
            return this;
        }

        /**
         * TimePoints.
         */
        public Builder timePoints(java.util.List < Long > timePoints) {
            this.putBodyParameter("TimePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public SplitTrafficControlTargetRequest build() {
            return new SplitTrafficControlTargetRequest(this);
        } 

    } 

}
