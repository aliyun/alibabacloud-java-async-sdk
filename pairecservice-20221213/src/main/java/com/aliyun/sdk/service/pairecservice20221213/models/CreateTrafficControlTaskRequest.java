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
 * {@link CreateTrafficControlTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficControlTaskRequest</p>
 */
public class CreateTrafficControlTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BehaviorTableMetaId")
    private String behaviorTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlGranularity")
    private String controlGranularity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlLogic")
    private String controlLogic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlType")
    private String controlType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionTime")
    private String executionTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
    private String itemConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
    private String itemConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionType")
    private String itemConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTableMetaId")
    private String itemTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreExperimentIds")
    private String preExperimentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProdExperimentIds")
    private String prodExperimentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionArray")
    private String statisBehaviorConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionExpress")
    private String statisBehaviorConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionType")
    private String statisBehaviorConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargets")
    private java.util.List<TrafficControlTargets> trafficControlTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionArray")
    private String userConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionExpress")
    private String userConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionType")
    private String userConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTableMetaId")
    private String userTableMetaId;

    private CreateTrafficControlTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.behaviorTableMetaId = builder.behaviorTableMetaId;
        this.controlGranularity = builder.controlGranularity;
        this.controlLogic = builder.controlLogic;
        this.controlType = builder.controlType;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.executionTime = builder.executionTime;
        this.instanceId = builder.instanceId;
        this.itemConditionArray = builder.itemConditionArray;
        this.itemConditionExpress = builder.itemConditionExpress;
        this.itemConditionType = builder.itemConditionType;
        this.itemTableMetaId = builder.itemTableMetaId;
        this.name = builder.name;
        this.preExperimentIds = builder.preExperimentIds;
        this.prodExperimentIds = builder.prodExperimentIds;
        this.sceneId = builder.sceneId;
        this.serviceId = builder.serviceId;
        this.startTime = builder.startTime;
        this.statisBehaviorConditionArray = builder.statisBehaviorConditionArray;
        this.statisBehaviorConditionExpress = builder.statisBehaviorConditionExpress;
        this.statisBehaviorConditionType = builder.statisBehaviorConditionType;
        this.trafficControlTargets = builder.trafficControlTargets;
        this.userConditionArray = builder.userConditionArray;
        this.userConditionExpress = builder.userConditionExpress;
        this.userConditionType = builder.userConditionType;
        this.userTableMetaId = builder.userTableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlTaskRequest create() {
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
     * @return behaviorTableMetaId
     */
    public String getBehaviorTableMetaId() {
        return this.behaviorTableMetaId;
    }

    /**
     * @return controlGranularity
     */
    public String getControlGranularity() {
        return this.controlGranularity;
    }

    /**
     * @return controlLogic
     */
    public String getControlLogic() {
        return this.controlLogic;
    }

    /**
     * @return controlType
     */
    public String getControlType() {
        return this.controlType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executionTime
     */
    public String getExecutionTime() {
        return this.executionTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemConditionArray
     */
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    /**
     * @return itemConditionExpress
     */
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    /**
     * @return itemConditionType
     */
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    /**
     * @return itemTableMetaId
     */
    public String getItemTableMetaId() {
        return this.itemTableMetaId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return preExperimentIds
     */
    public String getPreExperimentIds() {
        return this.preExperimentIds;
    }

    /**
     * @return prodExperimentIds
     */
    public String getProdExperimentIds() {
        return this.prodExperimentIds;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisBehaviorConditionArray
     */
    public String getStatisBehaviorConditionArray() {
        return this.statisBehaviorConditionArray;
    }

    /**
     * @return statisBehaviorConditionExpress
     */
    public String getStatisBehaviorConditionExpress() {
        return this.statisBehaviorConditionExpress;
    }

    /**
     * @return statisBehaviorConditionType
     */
    public String getStatisBehaviorConditionType() {
        return this.statisBehaviorConditionType;
    }

    /**
     * @return trafficControlTargets
     */
    public java.util.List<TrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    /**
     * @return userConditionArray
     */
    public String getUserConditionArray() {
        return this.userConditionArray;
    }

    /**
     * @return userConditionExpress
     */
    public String getUserConditionExpress() {
        return this.userConditionExpress;
    }

    /**
     * @return userConditionType
     */
    public String getUserConditionType() {
        return this.userConditionType;
    }

    /**
     * @return userTableMetaId
     */
    public String getUserTableMetaId() {
        return this.userTableMetaId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficControlTaskRequest, Builder> {
        private String regionId; 
        private String behaviorTableMetaId; 
        private String controlGranularity; 
        private String controlLogic; 
        private String controlType; 
        private String description; 
        private String endTime; 
        private String executionTime; 
        private String instanceId; 
        private String itemConditionArray; 
        private String itemConditionExpress; 
        private String itemConditionType; 
        private String itemTableMetaId; 
        private String name; 
        private String preExperimentIds; 
        private String prodExperimentIds; 
        private String sceneId; 
        private String serviceId; 
        private String startTime; 
        private String statisBehaviorConditionArray; 
        private String statisBehaviorConditionExpress; 
        private String statisBehaviorConditionType; 
        private java.util.List<TrafficControlTargets> trafficControlTargets; 
        private String userConditionArray; 
        private String userConditionExpress; 
        private String userConditionType; 
        private String userTableMetaId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficControlTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.behaviorTableMetaId = request.behaviorTableMetaId;
            this.controlGranularity = request.controlGranularity;
            this.controlLogic = request.controlLogic;
            this.controlType = request.controlType;
            this.description = request.description;
            this.endTime = request.endTime;
            this.executionTime = request.executionTime;
            this.instanceId = request.instanceId;
            this.itemConditionArray = request.itemConditionArray;
            this.itemConditionExpress = request.itemConditionExpress;
            this.itemConditionType = request.itemConditionType;
            this.itemTableMetaId = request.itemTableMetaId;
            this.name = request.name;
            this.preExperimentIds = request.preExperimentIds;
            this.prodExperimentIds = request.prodExperimentIds;
            this.sceneId = request.sceneId;
            this.serviceId = request.serviceId;
            this.startTime = request.startTime;
            this.statisBehaviorConditionArray = request.statisBehaviorConditionArray;
            this.statisBehaviorConditionExpress = request.statisBehaviorConditionExpress;
            this.statisBehaviorConditionType = request.statisBehaviorConditionType;
            this.trafficControlTargets = request.trafficControlTargets;
            this.userConditionArray = request.userConditionArray;
            this.userConditionExpress = request.userConditionExpress;
            this.userConditionType = request.userConditionType;
            this.userTableMetaId = request.userTableMetaId;
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
         * BehaviorTableMetaId.
         */
        public Builder behaviorTableMetaId(String behaviorTableMetaId) {
            this.putBodyParameter("BehaviorTableMetaId", behaviorTableMetaId);
            this.behaviorTableMetaId = behaviorTableMetaId;
            return this;
        }

        /**
         * ControlGranularity.
         */
        public Builder controlGranularity(String controlGranularity) {
            this.putBodyParameter("ControlGranularity", controlGranularity);
            this.controlGranularity = controlGranularity;
            return this;
        }

        /**
         * ControlLogic.
         */
        public Builder controlLogic(String controlLogic) {
            this.putBodyParameter("ControlLogic", controlLogic);
            this.controlLogic = controlLogic;
            return this;
        }

        /**
         * ControlType.
         */
        public Builder controlType(String controlType) {
            this.putBodyParameter("ControlType", controlType);
            this.controlType = controlType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecutionTime.
         */
        public Builder executionTime(String executionTime) {
            this.putBodyParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
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
         * ItemConditionArray.
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.putBodyParameter("ItemConditionArray", itemConditionArray);
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * ItemConditionExpress.
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.putBodyParameter("ItemConditionExpress", itemConditionExpress);
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * ItemConditionType.
         */
        public Builder itemConditionType(String itemConditionType) {
            this.putBodyParameter("ItemConditionType", itemConditionType);
            this.itemConditionType = itemConditionType;
            return this;
        }

        /**
         * ItemTableMetaId.
         */
        public Builder itemTableMetaId(String itemTableMetaId) {
            this.putBodyParameter("ItemTableMetaId", itemTableMetaId);
            this.itemTableMetaId = itemTableMetaId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PreExperimentIds.
         */
        public Builder preExperimentIds(String preExperimentIds) {
            this.putBodyParameter("PreExperimentIds", preExperimentIds);
            this.preExperimentIds = preExperimentIds;
            return this;
        }

        /**
         * ProdExperimentIds.
         */
        public Builder prodExperimentIds(String prodExperimentIds) {
            this.putBodyParameter("ProdExperimentIds", prodExperimentIds);
            this.prodExperimentIds = prodExperimentIds;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StatisBehaviorConditionArray.
         */
        public Builder statisBehaviorConditionArray(String statisBehaviorConditionArray) {
            this.putBodyParameter("StatisBehaviorConditionArray", statisBehaviorConditionArray);
            this.statisBehaviorConditionArray = statisBehaviorConditionArray;
            return this;
        }

        /**
         * StatisBehaviorConditionExpress.
         */
        public Builder statisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
            this.putBodyParameter("StatisBehaviorConditionExpress", statisBehaviorConditionExpress);
            this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
            return this;
        }

        /**
         * StatisBehaviorConditionType.
         */
        public Builder statisBehaviorConditionType(String statisBehaviorConditionType) {
            this.putBodyParameter("StatisBehaviorConditionType", statisBehaviorConditionType);
            this.statisBehaviorConditionType = statisBehaviorConditionType;
            return this;
        }

        /**
         * TrafficControlTargets.
         */
        public Builder trafficControlTargets(java.util.List<TrafficControlTargets> trafficControlTargets) {
            this.putBodyParameter("TrafficControlTargets", trafficControlTargets);
            this.trafficControlTargets = trafficControlTargets;
            return this;
        }

        /**
         * UserConditionArray.
         */
        public Builder userConditionArray(String userConditionArray) {
            this.putBodyParameter("UserConditionArray", userConditionArray);
            this.userConditionArray = userConditionArray;
            return this;
        }

        /**
         * UserConditionExpress.
         */
        public Builder userConditionExpress(String userConditionExpress) {
            this.putBodyParameter("UserConditionExpress", userConditionExpress);
            this.userConditionExpress = userConditionExpress;
            return this;
        }

        /**
         * UserConditionType.
         */
        public Builder userConditionType(String userConditionType) {
            this.putBodyParameter("UserConditionType", userConditionType);
            this.userConditionType = userConditionType;
            return this;
        }

        /**
         * UserTableMetaId.
         */
        public Builder userTableMetaId(String userTableMetaId) {
            this.putBodyParameter("UserTableMetaId", userTableMetaId);
            this.userTableMetaId = userTableMetaId;
            return this;
        }

        @Override
        public CreateTrafficControlTaskRequest build() {
            return new CreateTrafficControlTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrafficControlTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTrafficControlTaskRequest</p>
     */
    public static class TrafficControlTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
        private String itemConditionArray;

        @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
        private String itemConditionExpress;

        @com.aliyun.core.annotation.NameInMap("ItemConditionType")
        private String itemConditionType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewProductRegulation")
        private Boolean newProductRegulation;

        @com.aliyun.core.annotation.NameInMap("RecallName")
        private String recallName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatisPeriod")
        private String statisPeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToleranceValue")
        private Long toleranceValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TrafficControlTargets(Builder builder) {
            this.endTime = builder.endTime;
            this.event = builder.event;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemConditionExpress = builder.itemConditionExpress;
            this.itemConditionType = builder.itemConditionType;
            this.name = builder.name;
            this.newProductRegulation = builder.newProductRegulation;
            this.recallName = builder.recallName;
            this.startTime = builder.startTime;
            this.statisPeriod = builder.statisPeriod;
            this.status = builder.status;
            this.toleranceValue = builder.toleranceValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTargets create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return itemConditionArray
         */
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        /**
         * @return itemConditionExpress
         */
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        /**
         * @return itemConditionType
         */
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newProductRegulation
         */
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        /**
         * @return recallName
         */
        public String getRecallName() {
            return this.recallName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statisPeriod
         */
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toleranceValue
         */
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String endTime; 
            private String event; 
            private String itemConditionArray; 
            private String itemConditionExpress; 
            private String itemConditionType; 
            private String name; 
            private Boolean newProductRegulation; 
            private String recallName; 
            private String startTime; 
            private String statisPeriod; 
            private String status; 
            private Long toleranceValue; 
            private Float value; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * ItemConditionArray.
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * ItemConditionExpress.
             */
            public Builder itemConditionExpress(String itemConditionExpress) {
                this.itemConditionExpress = itemConditionExpress;
                return this;
            }

            /**
             * ItemConditionType.
             */
            public Builder itemConditionType(String itemConditionType) {
                this.itemConditionType = itemConditionType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewProductRegulation.
             */
            public Builder newProductRegulation(Boolean newProductRegulation) {
                this.newProductRegulation = newProductRegulation;
                return this;
            }

            /**
             * RecallName.
             */
            public Builder recallName(String recallName) {
                this.recallName = recallName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatisPeriod.
             */
            public Builder statisPeriod(String statisPeriod) {
                this.statisPeriod = statisPeriod;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ToleranceValue.
             */
            public Builder toleranceValue(Long toleranceValue) {
                this.toleranceValue = toleranceValue;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TrafficControlTargets build() {
                return new TrafficControlTargets(this);
            } 

        } 

    }
}
