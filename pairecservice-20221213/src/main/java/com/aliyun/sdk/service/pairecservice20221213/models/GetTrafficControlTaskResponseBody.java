// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficControlTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficControlTaskResponseBody</p>
 */
public class GetTrafficControlTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BehaviorTableMetaId")
    private String behaviorTableMetaId;

    @com.aliyun.core.annotation.NameInMap("ControlGranularity")
    private String controlGranularity;

    @com.aliyun.core.annotation.NameInMap("ControlLogic")
    private String controlLogic;

    @com.aliyun.core.annotation.NameInMap("ControlType")
    private String controlType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EverPublished")
    private Boolean everPublished;

    @com.aliyun.core.annotation.NameInMap("ExecutionTime")
    private String executionTime;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
    private String itemConditionArray;

    @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
    private String itemConditionExpress;

    @com.aliyun.core.annotation.NameInMap("ItemConditionType")
    private String itemConditionType;

    @com.aliyun.core.annotation.NameInMap("ItemTableMetaId")
    private String itemTableMetaId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PrepubStatus")
    private String prepubStatus;

    @com.aliyun.core.annotation.NameInMap("ProductStatus")
    private String productStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionArray")
    private String statisBehaviorConditionArray;

    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionExpress")
    private String statisBehaviorConditionExpress;

    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionType")
    private String statisBehaviorConditionType;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTargets")
    private java.util.List < TrafficControlTargets> trafficControlTargets;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.NameInMap("UserConditionArray")
    private String userConditionArray;

    @com.aliyun.core.annotation.NameInMap("UserConditionExpress")
    private String userConditionExpress;

    @com.aliyun.core.annotation.NameInMap("UserConditionType")
    private String userConditionType;

    @com.aliyun.core.annotation.NameInMap("UserTableMetaId")
    private String userTableMetaId;

    private GetTrafficControlTaskResponseBody(Builder builder) {
        this.behaviorTableMetaId = builder.behaviorTableMetaId;
        this.controlGranularity = builder.controlGranularity;
        this.controlLogic = builder.controlLogic;
        this.controlType = builder.controlType;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.everPublished = builder.everPublished;
        this.executionTime = builder.executionTime;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.itemConditionArray = builder.itemConditionArray;
        this.itemConditionExpress = builder.itemConditionExpress;
        this.itemConditionType = builder.itemConditionType;
        this.itemTableMetaId = builder.itemTableMetaId;
        this.name = builder.name;
        this.prepubStatus = builder.prepubStatus;
        this.productStatus = builder.productStatus;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
        this.startTime = builder.startTime;
        this.statisBehaviorConditionArray = builder.statisBehaviorConditionArray;
        this.statisBehaviorConditionExpress = builder.statisBehaviorConditionExpress;
        this.statisBehaviorConditionType = builder.statisBehaviorConditionType;
        this.trafficControlTargets = builder.trafficControlTargets;
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.userConditionArray = builder.userConditionArray;
        this.userConditionExpress = builder.userConditionExpress;
        this.userConditionType = builder.userConditionType;
        this.userTableMetaId = builder.userTableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficControlTaskResponseBody create() {
        return builder().build();
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
     * @return everPublished
     */
    public Boolean getEverPublished() {
        return this.everPublished;
    }

    /**
     * @return executionTime
     */
    public String getExecutionTime() {
        return this.executionTime;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return prepubStatus
     */
    public String getPrepubStatus() {
        return this.prepubStatus;
    }

    /**
     * @return productStatus
     */
    public String getProductStatus() {
        return this.productStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
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
    public java.util.List < TrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
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

    public static final class Builder {
        private String behaviorTableMetaId; 
        private String controlGranularity; 
        private String controlLogic; 
        private String controlType; 
        private String description; 
        private String endTime; 
        private Boolean everPublished; 
        private String executionTime; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String itemConditionArray; 
        private String itemConditionExpress; 
        private String itemConditionType; 
        private String itemTableMetaId; 
        private String name; 
        private String prepubStatus; 
        private String productStatus; 
        private String requestId; 
        private String sceneId; 
        private String sceneName; 
        private String startTime; 
        private String statisBehaviorConditionArray; 
        private String statisBehaviorConditionExpress; 
        private String statisBehaviorConditionType; 
        private java.util.List < TrafficControlTargets> trafficControlTargets; 
        private String trafficControlTaskId; 
        private String userConditionArray; 
        private String userConditionExpress; 
        private String userConditionType; 
        private String userTableMetaId; 

        /**
         * BehaviorTableMetaId.
         */
        public Builder behaviorTableMetaId(String behaviorTableMetaId) {
            this.behaviorTableMetaId = behaviorTableMetaId;
            return this;
        }

        /**
         * ControlGranularity.
         */
        public Builder controlGranularity(String controlGranularity) {
            this.controlGranularity = controlGranularity;
            return this;
        }

        /**
         * ControlLogic.
         */
        public Builder controlLogic(String controlLogic) {
            this.controlLogic = controlLogic;
            return this;
        }

        /**
         * ControlType.
         */
        public Builder controlType(String controlType) {
            this.controlType = controlType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * EverPublished.
         */
        public Builder everPublished(Boolean everPublished) {
            this.everPublished = everPublished;
            return this;
        }

        /**
         * ExecutionTime.
         */
        public Builder executionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
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
         * ItemTableMetaId.
         */
        public Builder itemTableMetaId(String itemTableMetaId) {
            this.itemTableMetaId = itemTableMetaId;
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
         * PrepubStatus.
         */
        public Builder prepubStatus(String prepubStatus) {
            this.prepubStatus = prepubStatus;
            return this;
        }

        /**
         * ProductStatus.
         */
        public Builder productStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.sceneName = sceneName;
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
         * StatisBehaviorConditionArray.
         */
        public Builder statisBehaviorConditionArray(String statisBehaviorConditionArray) {
            this.statisBehaviorConditionArray = statisBehaviorConditionArray;
            return this;
        }

        /**
         * StatisBehaviorConditionExpress.
         */
        public Builder statisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
            this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
            return this;
        }

        /**
         * StatisBehaviorConditionType.
         */
        public Builder statisBehaviorConditionType(String statisBehaviorConditionType) {
            this.statisBehaviorConditionType = statisBehaviorConditionType;
            return this;
        }

        /**
         * TrafficControlTargets.
         */
        public Builder trafficControlTargets(java.util.List < TrafficControlTargets> trafficControlTargets) {
            this.trafficControlTargets = trafficControlTargets;
            return this;
        }

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        /**
         * UserConditionArray.
         */
        public Builder userConditionArray(String userConditionArray) {
            this.userConditionArray = userConditionArray;
            return this;
        }

        /**
         * UserConditionExpress.
         */
        public Builder userConditionExpress(String userConditionExpress) {
            this.userConditionExpress = userConditionExpress;
            return this;
        }

        /**
         * UserConditionType.
         */
        public Builder userConditionType(String userConditionType) {
            this.userConditionType = userConditionType;
            return this;
        }

        /**
         * UserTableMetaId.
         */
        public Builder userTableMetaId(String userTableMetaId) {
            this.userTableMetaId = userTableMetaId;
            return this;
        }

        public GetTrafficControlTaskResponseBody build() {
            return new GetTrafficControlTaskResponseBody(this);
        } 

    } 

    public static class SplitParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SetPoints")
        private java.util.List < Integer > setPoints;

        @com.aliyun.core.annotation.NameInMap("SetValues")
        private java.util.List < Long > setValues;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private java.util.List < Integer > timePoints;

        private SplitParts(Builder builder) {
            this.setPoints = builder.setPoints;
            this.setValues = builder.setValues;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SplitParts create() {
            return builder().build();
        }

        /**
         * @return setPoints
         */
        public java.util.List < Integer > getSetPoints() {
            return this.setPoints;
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
        public java.util.List < Integer > getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private java.util.List < Integer > setPoints; 
            private java.util.List < Long > setValues; 
            private java.util.List < Integer > timePoints; 

            /**
             * SetPoints.
             */
            public Builder setPoints(java.util.List < Integer > setPoints) {
                this.setPoints = setPoints;
                return this;
            }

            /**
             * SetValues.
             */
            public Builder setValues(java.util.List < Long > setValues) {
                this.setValues = setValues;
                return this;
            }

            /**
             * TimePoints.
             */
            public Builder timePoints(java.util.List < Integer > timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public SplitParts build() {
                return new SplitParts(this);
            } 

        } 

    }
    public static class TrafficControlTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

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

        @com.aliyun.core.annotation.NameInMap("SplitParts")
        private SplitParts splitParts;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatisPeriod")
        private String statisPeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToleranceValue")
        private Long toleranceValue;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
        private String trafficControlTargetId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TrafficControlTargets(Builder builder) {
            this.endTime = builder.endTime;
            this.event = builder.event;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemConditionExpress = builder.itemConditionExpress;
            this.itemConditionType = builder.itemConditionType;
            this.name = builder.name;
            this.newProductRegulation = builder.newProductRegulation;
            this.recallName = builder.recallName;
            this.splitParts = builder.splitParts;
            this.startTime = builder.startTime;
            this.statisPeriod = builder.statisPeriod;
            this.status = builder.status;
            this.toleranceValue = builder.toleranceValue;
            this.trafficControlTargetId = builder.trafficControlTargetId;
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
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
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
         * @return splitParts
         */
        public SplitParts getSplitParts() {
            return this.splitParts;
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
         * @return trafficControlTargetId
         */
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
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
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String itemConditionArray; 
            private String itemConditionExpress; 
            private String itemConditionType; 
            private String name; 
            private Boolean newProductRegulation; 
            private String recallName; 
            private SplitParts splitParts; 
            private String startTime; 
            private String statisPeriod; 
            private String status; 
            private Long toleranceValue; 
            private String trafficControlTargetId; 
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
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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
             * SplitParts.
             */
            public Builder splitParts(SplitParts splitParts) {
                this.splitParts = splitParts;
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
             * TrafficControlTargetId.
             */
            public Builder trafficControlTargetId(String trafficControlTargetId) {
                this.trafficControlTargetId = trafficControlTargetId;
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
