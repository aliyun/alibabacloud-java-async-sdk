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
 * {@link ListTrafficControlTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficControlTasksResponseBody</p>
 */
public class ListTrafficControlTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTasks")
    private java.util.List<TrafficControlTasks> trafficControlTasks;

    private ListTrafficControlTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficControlTasks = builder.trafficControlTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficControlTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficControlTasks
     */
    public java.util.List<TrafficControlTasks> getTrafficControlTasks() {
        return this.trafficControlTasks;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List<TrafficControlTasks> trafficControlTasks; 

        private Builder() {
        } 

        private Builder(ListTrafficControlTasksResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trafficControlTasks = model.trafficControlTasks;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3AAA45F6-0798-5461-9360-81D133823CE7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of traffic control tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of traffic control tasks.</p>
         */
        public Builder trafficControlTasks(java.util.List<TrafficControlTasks> trafficControlTasks) {
            this.trafficControlTasks = trafficControlTasks;
            return this;
        }

        public ListTrafficControlTasksResponseBody build() {
            return new ListTrafficControlTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficControlTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficControlTasksResponseBody</p>
     */
    public static class SplitParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SetValues")
        private java.util.List<Long> setValues;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private java.util.List<Long> timePoints;

        private SplitParts(Builder builder) {
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
         * @return setValues
         */
        public java.util.List<Long> getSetValues() {
            return this.setValues;
        }

        /**
         * @return timePoints
         */
        public java.util.List<Long> getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private java.util.List<Long> setValues; 
            private java.util.List<Long> timePoints; 

            private Builder() {
            } 

            private Builder(SplitParts model) {
                this.setValues = model.setValues;
                this.timePoints = model.timePoints;
            } 

            /**
             * <p>The list of value-based split points for the target.</p>
             */
            public Builder setValues(java.util.List<Long> setValues) {
                this.setValues = setValues;
                return this;
            }

            /**
             * <p>The list of time-based split points.</p>
             */
            public Builder timePoints(java.util.List<Long> timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public SplitParts build() {
                return new SplitParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTrafficControlTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficControlTasksResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
        private String trafficControlTaskId;

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
            this.trafficControlTaskId = builder.trafficControlTaskId;
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
         * @return trafficControlTaskId
         */
        public String getTrafficControlTaskId() {
            return this.trafficControlTaskId;
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
            private String trafficControlTaskId; 
            private Float value; 

            private Builder() {
            } 

            private Builder(TrafficControlTargets model) {
                this.endTime = model.endTime;
                this.event = model.event;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.itemConditionArray = model.itemConditionArray;
                this.itemConditionExpress = model.itemConditionExpress;
                this.itemConditionType = model.itemConditionType;
                this.name = model.name;
                this.newProductRegulation = model.newProductRegulation;
                this.recallName = model.recallName;
                this.splitParts = model.splitParts;
                this.startTime = model.startTime;
                this.statisPeriod = model.statisPeriod;
                this.status = model.status;
                this.toleranceValue = model.toleranceValue;
                this.trafficControlTargetId = model.trafficControlTargetId;
                this.trafficControlTaskId = model.trafficControlTaskId;
                this.value = model.value;
            } 

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-25</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The event for the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>click</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>The creation time of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-03T15:08:10.58+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last update time of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-21T16:26:58.57+08:00</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The item condition, in an array format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * <p>The item condition, in an expression format.</p>
             * 
             * <strong>example:</strong>
             * <p>status=1</p>
             */
            public Builder itemConditionExpress(String itemConditionExpress) {
                this.itemConditionExpress = itemConditionExpress;
                return this;
            }

            /**
             * <p>The item condition type.</p>
             * 
             * <strong>example:</strong>
             * <p>Array</p>
             */
            public Builder itemConditionType(String itemConditionType) {
                this.itemConditionType = itemConditionType;
                return this;
            }

            /**
             * <p>The name of the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>target-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the traffic control target is for a new product recall.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder newProductRegulation(Boolean newProductRegulation) {
                this.newProductRegulation = newProductRegulation;
                return this;
            }

            /**
             * <p>The name of the recall strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>recall-1</p>
             */
            public Builder recallName(String recallName) {
                this.recallName = recallName;
                return this;
            }

            /**
             * <p>The details of the split points.</p>
             */
            public Builder splitParts(SplitParts splitParts) {
                this.splitParts = splitParts;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-25</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The statistics period.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder statisPeriod(String statisPeriod) {
                this.statisPeriod = statisPeriod;
                return this;
            }

            /**
             * <p>The status of the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>Opened</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tolerance value for the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder toleranceValue(Long toleranceValue) {
                this.toleranceValue = toleranceValue;
                return this;
            }

            /**
             * <p>The traffic control target ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trafficControlTargetId(String trafficControlTargetId) {
                this.trafficControlTargetId = trafficControlTargetId;
                return this;
            }

            /**
             * <p>The traffic control task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trafficControlTaskId(String trafficControlTaskId) {
                this.trafficControlTaskId = trafficControlTaskId;
                return this;
            }

            /**
             * <p>The value of the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link ListTrafficControlTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficControlTasksResponseBody</p>
     */
    public static class TrafficControlTasks extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("EffectiveSceneIds")
        private java.util.List<Integer> effectiveSceneIds;

        @com.aliyun.core.annotation.NameInMap("EffectiveSceneNameList")
        private java.util.List<String> effectiveSceneNameList;

        @com.aliyun.core.annotation.NameInMap("EffectiveSceneNames")
        private java.util.List<Integer> effectiveSceneNames;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EverPublished")
        private Boolean everPublished;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private String executionTime;

        @com.aliyun.core.annotation.NameInMap("FlinkResourceId")
        private String flinkResourceId;

        @com.aliyun.core.annotation.NameInMap("FlinkResourceName")
        private String flinkResourceName;

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

        @com.aliyun.core.annotation.NameInMap("PreExperimentIds")
        private String preExperimentIds;

        @com.aliyun.core.annotation.NameInMap("PrepubStatus")
        private String prepubStatus;

        @com.aliyun.core.annotation.NameInMap("ProdExperimentIds")
        private String prodExperimentIds;

        @com.aliyun.core.annotation.NameInMap("ProductStatus")
        private String productStatus;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceIdList")
        private java.util.List<Integer> serviceIdList;

        @com.aliyun.core.annotation.NameInMap("ServiceIds")
        private java.util.List<String> serviceIds;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatisBahaviorConditionExpress")
        private String statisBahaviorConditionExpress;

        @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionArray")
        private String statisBehaviorConditionArray;

        @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionExpress")
        private String statisBehaviorConditionExpress;

        @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionType")
        private String statisBehaviorConditionType;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargets")
        private java.util.List<TrafficControlTargets> trafficControlTargets;

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

        private TrafficControlTasks(Builder builder) {
            this.behaviorTableMetaId = builder.behaviorTableMetaId;
            this.controlGranularity = builder.controlGranularity;
            this.controlLogic = builder.controlLogic;
            this.controlType = builder.controlType;
            this.description = builder.description;
            this.effectiveSceneIds = builder.effectiveSceneIds;
            this.effectiveSceneNameList = builder.effectiveSceneNameList;
            this.effectiveSceneNames = builder.effectiveSceneNames;
            this.endTime = builder.endTime;
            this.everPublished = builder.everPublished;
            this.executionTime = builder.executionTime;
            this.flinkResourceId = builder.flinkResourceId;
            this.flinkResourceName = builder.flinkResourceName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemConditionExpress = builder.itemConditionExpress;
            this.itemConditionType = builder.itemConditionType;
            this.itemTableMetaId = builder.itemTableMetaId;
            this.name = builder.name;
            this.preExperimentIds = builder.preExperimentIds;
            this.prepubStatus = builder.prepubStatus;
            this.prodExperimentIds = builder.prodExperimentIds;
            this.productStatus = builder.productStatus;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.serviceId = builder.serviceId;
            this.serviceIdList = builder.serviceIdList;
            this.serviceIds = builder.serviceIds;
            this.startTime = builder.startTime;
            this.statisBahaviorConditionExpress = builder.statisBahaviorConditionExpress;
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

        public static TrafficControlTasks create() {
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
         * @return effectiveSceneIds
         */
        public java.util.List<Integer> getEffectiveSceneIds() {
            return this.effectiveSceneIds;
        }

        /**
         * @return effectiveSceneNameList
         */
        public java.util.List<String> getEffectiveSceneNameList() {
            return this.effectiveSceneNameList;
        }

        /**
         * @return effectiveSceneNames
         */
        public java.util.List<Integer> getEffectiveSceneNames() {
            return this.effectiveSceneNames;
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
         * @return flinkResourceId
         */
        public String getFlinkResourceId() {
            return this.flinkResourceId;
        }

        /**
         * @return flinkResourceName
         */
        public String getFlinkResourceName() {
            return this.flinkResourceName;
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
         * @return preExperimentIds
         */
        public String getPreExperimentIds() {
            return this.preExperimentIds;
        }

        /**
         * @return prepubStatus
         */
        public String getPrepubStatus() {
            return this.prepubStatus;
        }

        /**
         * @return prodExperimentIds
         */
        public String getProdExperimentIds() {
            return this.prodExperimentIds;
        }

        /**
         * @return productStatus
         */
        public String getProductStatus() {
            return this.productStatus;
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
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceIdList
         */
        public java.util.List<Integer> getServiceIdList() {
            return this.serviceIdList;
        }

        /**
         * @return serviceIds
         */
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statisBahaviorConditionExpress
         */
        public String getStatisBahaviorConditionExpress() {
            return this.statisBahaviorConditionExpress;
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
            private java.util.List<Integer> effectiveSceneIds; 
            private java.util.List<String> effectiveSceneNameList; 
            private java.util.List<Integer> effectiveSceneNames; 
            private String endTime; 
            private Boolean everPublished; 
            private String executionTime; 
            private String flinkResourceId; 
            private String flinkResourceName; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String itemConditionArray; 
            private String itemConditionExpress; 
            private String itemConditionType; 
            private String itemTableMetaId; 
            private String name; 
            private String preExperimentIds; 
            private String prepubStatus; 
            private String prodExperimentIds; 
            private String productStatus; 
            private String sceneId; 
            private String sceneName; 
            private String serviceId; 
            private java.util.List<Integer> serviceIdList; 
            private java.util.List<String> serviceIds; 
            private String startTime; 
            private String statisBahaviorConditionExpress; 
            private String statisBehaviorConditionArray; 
            private String statisBehaviorConditionExpress; 
            private String statisBehaviorConditionType; 
            private java.util.List<TrafficControlTargets> trafficControlTargets; 
            private String trafficControlTaskId; 
            private String userConditionArray; 
            private String userConditionExpress; 
            private String userConditionType; 
            private String userTableMetaId; 

            private Builder() {
            } 

            private Builder(TrafficControlTasks model) {
                this.behaviorTableMetaId = model.behaviorTableMetaId;
                this.controlGranularity = model.controlGranularity;
                this.controlLogic = model.controlLogic;
                this.controlType = model.controlType;
                this.description = model.description;
                this.effectiveSceneIds = model.effectiveSceneIds;
                this.effectiveSceneNameList = model.effectiveSceneNameList;
                this.effectiveSceneNames = model.effectiveSceneNames;
                this.endTime = model.endTime;
                this.everPublished = model.everPublished;
                this.executionTime = model.executionTime;
                this.flinkResourceId = model.flinkResourceId;
                this.flinkResourceName = model.flinkResourceName;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.itemConditionArray = model.itemConditionArray;
                this.itemConditionExpress = model.itemConditionExpress;
                this.itemConditionType = model.itemConditionType;
                this.itemTableMetaId = model.itemTableMetaId;
                this.name = model.name;
                this.preExperimentIds = model.preExperimentIds;
                this.prepubStatus = model.prepubStatus;
                this.prodExperimentIds = model.prodExperimentIds;
                this.productStatus = model.productStatus;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.serviceId = model.serviceId;
                this.serviceIdList = model.serviceIdList;
                this.serviceIds = model.serviceIds;
                this.startTime = model.startTime;
                this.statisBahaviorConditionExpress = model.statisBahaviorConditionExpress;
                this.statisBehaviorConditionArray = model.statisBehaviorConditionArray;
                this.statisBehaviorConditionExpress = model.statisBehaviorConditionExpress;
                this.statisBehaviorConditionType = model.statisBehaviorConditionType;
                this.trafficControlTargets = model.trafficControlTargets;
                this.trafficControlTaskId = model.trafficControlTaskId;
                this.userConditionArray = model.userConditionArray;
                this.userConditionExpress = model.userConditionExpress;
                this.userConditionType = model.userConditionType;
                this.userTableMetaId = model.userTableMetaId;
            } 

            /**
             * <p>The behavior table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder behaviorTableMetaId(String behaviorTableMetaId) {
                this.behaviorTableMetaId = behaviorTableMetaId;
                return this;
            }

            /**
             * <p>The control granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder controlGranularity(String controlGranularity) {
                this.controlGranularity = controlGranularity;
                return this;
            }

            /**
             * <p>The control logic.</p>
             * 
             * <strong>example:</strong>
             * <p>Guaranteed</p>
             */
            public Builder controlLogic(String controlLogic) {
                this.controlLogic = controlLogic;
                return this;
            }

            /**
             * <p>The control type.</p>
             * 
             * <strong>example:</strong>
             * <p>Percent</p>
             */
            public Builder controlType(String controlType) {
                this.controlType = controlType;
                return this;
            }

            /**
             * <p>The description of the traffic control task.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a test task</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of effective scene IDs.</p>
             */
            public Builder effectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
                this.effectiveSceneIds = effectiveSceneIds;
                return this;
            }

            /**
             * <p>The list of effective scene names.</p>
             */
            public Builder effectiveSceneNameList(java.util.List<String> effectiveSceneNameList) {
                this.effectiveSceneNameList = effectiveSceneNameList;
                return this;
            }

            /**
             * <p>The list of effective scene names.</p>
             */
            public Builder effectiveSceneNames(java.util.List<Integer> effectiveSceneNames) {
                this.effectiveSceneNames = effectiveSceneNames;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-25</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the task has ever been published.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder everPublished(Boolean everPublished) {
                this.everPublished = everPublished;
                return this;
            }

            /**
             * <p>The execution schedule for the task. Valid values:</p>
             * <ul>
             * <li><p><code>Permanent</code>: The task runs indefinitely.</p>
             * </li>
             * <li><p><code>TimeRange</code>: The task runs within a specified time range. If you set this parameter to this value, you must also specify the <code>StartTime</code> and <code>EndTime</code> parameters.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Permanent</p>
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The Flink resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>resource-xxx</p>
             */
            public Builder flinkResourceId(String flinkResourceId) {
                this.flinkResourceId = flinkResourceId;
                return this;
            }

            /**
             * <p>The name of the Flink resource.</p>
             * 
             * <strong>example:</strong>
             * <p>flink_test</p>
             */
            public Builder flinkResourceName(String flinkResourceName) {
                this.flinkResourceName = flinkResourceName;
                return this;
            }

            /**
             * <p>The creation time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-25T06:04:28.441Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last update time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-25T06:04:28.441Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The item condition, in an array format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * <p>The item condition, in an expression format.</p>
             * 
             * <strong>example:</strong>
             * <p>status=1</p>
             */
            public Builder itemConditionExpress(String itemConditionExpress) {
                this.itemConditionExpress = itemConditionExpress;
                return this;
            }

            /**
             * <p>The item condition type.</p>
             * 
             * <strong>example:</strong>
             * <p>Array</p>
             */
            public Builder itemConditionType(String itemConditionType) {
                this.itemConditionType = itemConditionType;
                return this;
            }

            /**
             * <p>The item table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder itemTableMetaId(String itemTableMetaId) {
                this.itemTableMetaId = itemTableMetaId;
                return this;
            }

            /**
             * <p>The name of the traffic control task.</p>
             * 
             * <strong>example:</strong>
             * <p>task_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A comma-separated list of staging experiment IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2</p>
             */
            public Builder preExperimentIds(String preExperimentIds) {
                this.preExperimentIds = preExperimentIds;
                return this;
            }

            /**
             * <p>The staging environment status.</p>
             * 
             * <strong>example:</strong>
             * <p>Runnning</p>
             */
            public Builder prepubStatus(String prepubStatus) {
                this.prepubStatus = prepubStatus;
                return this;
            }

            /**
             * <p>A comma-separated list of production experiment IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>6,7</p>
             */
            public Builder prodExperimentIds(String prodExperimentIds) {
                this.prodExperimentIds = prodExperimentIds;
                return this;
            }

            /**
             * <p>The production environment status.</p>
             * 
             * <strong>example:</strong>
             * <p>Runnning</p>
             */
            public Builder productStatus(String productStatus) {
                this.productStatus = productStatus;
                return this;
            }

            /**
             * <p>The scene ID. You can obtain this ID by calling the <code>ListScenes</code> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The name of the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>home_feed</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The list of service IDs.</p>
             */
            public Builder serviceIdList(java.util.List<Integer> serviceIdList) {
                this.serviceIdList = serviceIdList;
                return this;
            }

            /**
             * <p>The list of bound engine service IDs.</p>
             */
            public Builder serviceIds(java.util.List<String> serviceIds) {
                this.serviceIds = serviceIds;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-25</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The behavior statistics expression.</p>
             * 
             * <strong>example:</strong>
             * <p>event=click</p>
             */
            public Builder statisBahaviorConditionExpress(String statisBahaviorConditionExpress) {
                this.statisBahaviorConditionExpress = statisBahaviorConditionExpress;
                return this;
            }

            /**
             * <p>The behavior statistics condition, in an array format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;click&quot;,&quot;option&quot;:&quot;&lt;=&quot;,&quot;value&quot;:&quot;30&quot;}]</p>
             */
            public Builder statisBehaviorConditionArray(String statisBehaviorConditionArray) {
                this.statisBehaviorConditionArray = statisBehaviorConditionArray;
                return this;
            }

            /**
             * <p>The behavior statistics expression.</p>
             * 
             * <strong>example:</strong>
             * <p>event=exposure</p>
             */
            public Builder statisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
                this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
                return this;
            }

            /**
             * <p>The condition type for behavior statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>Array</p>
             */
            public Builder statisBehaviorConditionType(String statisBehaviorConditionType) {
                this.statisBehaviorConditionType = statisBehaviorConditionType;
                return this;
            }

            /**
             * <p>The list of traffic control targets.</p>
             */
            public Builder trafficControlTargets(java.util.List<TrafficControlTargets> trafficControlTargets) {
                this.trafficControlTargets = trafficControlTargets;
                return this;
            }

            /**
             * <p>The traffic control task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trafficControlTaskId(String trafficControlTaskId) {
                this.trafficControlTaskId = trafficControlTaskId;
                return this;
            }

            /**
             * <p>The condition for the target user group, in an array format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;field&quot;:&quot;gender&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;male&quot;}]</p>
             */
            public Builder userConditionArray(String userConditionArray) {
                this.userConditionArray = userConditionArray;
                return this;
            }

            /**
             * <p>The condition for the target user group, in an expression format.</p>
             * 
             * <strong>example:</strong>
             * <p>age&lt;=30&amp;&amp;(3&lt;=level&lt;=6)&amp;&amp;gender=male</p>
             */
            public Builder userConditionExpress(String userConditionExpress) {
                this.userConditionExpress = userConditionExpress;
                return this;
            }

            /**
             * <p>The condition type for the target user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Array</p>
             */
            public Builder userConditionType(String userConditionType) {
                this.userConditionType = userConditionType;
                return this;
            }

            /**
             * <p>The user table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder userTableMetaId(String userTableMetaId) {
                this.userTableMetaId = userTableMetaId;
                return this;
            }

            public TrafficControlTasks build() {
                return new TrafficControlTasks(this);
            } 

        } 

    }
}
