// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListTrafficControlTargetTrafficHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListTrafficControlTargetTrafficHistoryRequest</p>
 */
public class ListTrafficControlTargetTrafficHistoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private String itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private String threshold;

    private ListTrafficControlTargetTrafficHistoryRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.environment = builder.environment;
        this.experimentGroupId = builder.experimentGroupId;
        this.experimentId = builder.experimentId;
        this.instanceId = builder.instanceId;
        this.itemId = builder.itemId;
        this.startTime = builder.startTime;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficControlTargetTrafficHistoryRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return threshold
     */
    public String getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<ListTrafficControlTargetTrafficHistoryRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String endTime; 
        private String environment; 
        private String experimentGroupId; 
        private String experimentId; 
        private String instanceId; 
        private String itemId; 
        private String startTime; 
        private String threshold; 

        private Builder() {
            super();
        } 

        private Builder(ListTrafficControlTargetTrafficHistoryRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.environment = request.environment;
            this.experimentGroupId = request.experimentGroupId;
            this.experimentId = request.experimentId;
            this.instanceId = request.instanceId;
            this.itemId = request.itemId;
            this.startTime = request.startTime;
            this.threshold = request.threshold;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putQueryParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
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
         * Threshold.
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public ListTrafficControlTargetTrafficHistoryRequest build() {
            return new ListTrafficControlTargetTrafficHistoryRequest(this);
        } 

    } 

}
