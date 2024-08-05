// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficControlTaskTrafficRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficControlTaskTrafficRequest</p>
 */
public class UpdateTrafficControlTaskTrafficRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

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
    @com.aliyun.core.annotation.NameInMap("Traffics")
    private java.util.List < Traffics> traffics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("new-param-3")
    private String newParam3;

    private UpdateTrafficControlTaskTrafficRequest(Builder builder) {
        super(builder);
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.regionId = builder.regionId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.traffics = builder.traffics;
        this.newParam3 = builder.newParam3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficControlTaskTrafficRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
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
     * @return traffics
     */
    public java.util.List < Traffics> getTraffics() {
        return this.traffics;
    }

    /**
     * @return newParam3
     */
    public String getNewParam3() {
        return this.newParam3;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficControlTaskTrafficRequest, Builder> {
        private String trafficControlTaskId; 
        private String regionId; 
        private String environment; 
        private String instanceId; 
        private java.util.List < Traffics> traffics; 
        private String newParam3; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficControlTaskTrafficRequest request) {
            super(request);
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.traffics = request.traffics;
            this.newParam3 = request.newParam3;
        } 

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putPathParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
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
         * Traffics.
         */
        public Builder traffics(java.util.List < Traffics> traffics) {
            this.putBodyParameter("Traffics", traffics);
            this.traffics = traffics;
            return this;
        }

        /**
         * new-param-3.
         */
        public Builder newParam3(String newParam3) {
            this.putQueryParameter("new-param-3", newParam3);
            this.newParam3 = newParam3;
            return this;
        }

        @Override
        public UpdateTrafficControlTaskTrafficRequest build() {
            return new UpdateTrafficControlTaskTrafficRequest(this);
        } 

    } 

    public static class Traffics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemOrExperimentId")
        private String itemOrExperimentId;

        @com.aliyun.core.annotation.NameInMap("RecordTime")
        private String recordTime;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetAimTraffic")
        private Double trafficControlTargetAimTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
        private String trafficControlTargetId;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetTraffic")
        private Long trafficControlTargetTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTaskTraffic")
        private Long trafficControlTaskTraffic;

        private Traffics(Builder builder) {
            this.itemOrExperimentId = builder.itemOrExperimentId;
            this.recordTime = builder.recordTime;
            this.trafficControlTargetAimTraffic = builder.trafficControlTargetAimTraffic;
            this.trafficControlTargetId = builder.trafficControlTargetId;
            this.trafficControlTargetTraffic = builder.trafficControlTargetTraffic;
            this.trafficControlTaskTraffic = builder.trafficControlTaskTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traffics create() {
            return builder().build();
        }

        /**
         * @return itemOrExperimentId
         */
        public String getItemOrExperimentId() {
            return this.itemOrExperimentId;
        }

        /**
         * @return recordTime
         */
        public String getRecordTime() {
            return this.recordTime;
        }

        /**
         * @return trafficControlTargetAimTraffic
         */
        public Double getTrafficControlTargetAimTraffic() {
            return this.trafficControlTargetAimTraffic;
        }

        /**
         * @return trafficControlTargetId
         */
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        /**
         * @return trafficControlTargetTraffic
         */
        public Long getTrafficControlTargetTraffic() {
            return this.trafficControlTargetTraffic;
        }

        /**
         * @return trafficControlTaskTraffic
         */
        public Long getTrafficControlTaskTraffic() {
            return this.trafficControlTaskTraffic;
        }

        public static final class Builder {
            private String itemOrExperimentId; 
            private String recordTime; 
            private Double trafficControlTargetAimTraffic; 
            private String trafficControlTargetId; 
            private Long trafficControlTargetTraffic; 
            private Long trafficControlTaskTraffic; 

            /**
             * ItemOrExperimentId.
             */
            public Builder itemOrExperimentId(String itemOrExperimentId) {
                this.itemOrExperimentId = itemOrExperimentId;
                return this;
            }

            /**
             * RecordTime.
             */
            public Builder recordTime(String recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            /**
             * TrafficControlTargetAimTraffic.
             */
            public Builder trafficControlTargetAimTraffic(Double trafficControlTargetAimTraffic) {
                this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
                return this;
            }

            /**
             * TrafficControlTargetId.
             */
            public Builder trafficControlTargetId(String trafficControlTargetId) {
                this.trafficControlTargetId = trafficControlTargetId;
                return this;
            }

            /**
             * TrafficControlTargetTraffic.
             */
            public Builder trafficControlTargetTraffic(Long trafficControlTargetTraffic) {
                this.trafficControlTargetTraffic = trafficControlTargetTraffic;
                return this;
            }

            /**
             * TrafficControlTaskTraffic.
             */
            public Builder trafficControlTaskTraffic(Long trafficControlTaskTraffic) {
                this.trafficControlTaskTraffic = trafficControlTaskTraffic;
                return this;
            }

            public Traffics build() {
                return new Traffics(this);
            } 

        } 

    }
}
