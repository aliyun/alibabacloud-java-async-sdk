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
    @com.aliyun.core.annotation.NameInMap("EffectiveSceneIds")
    private java.util.List<Integer> effectiveSceneIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionTime")
    private String executionTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlinkResourceId")
    private String flinkResourceId;

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
    @com.aliyun.core.annotation.NameInMap("ServiceIds")
    private java.util.List<Integer> serviceIds;

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
        this.effectiveSceneIds = builder.effectiveSceneIds;
        this.endTime = builder.endTime;
        this.executionTime = builder.executionTime;
        this.flinkResourceId = builder.flinkResourceId;
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
        this.serviceIds = builder.serviceIds;
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
     * @return effectiveSceneIds
     */
    public java.util.List<Integer> getEffectiveSceneIds() {
        return this.effectiveSceneIds;
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
     * @return flinkResourceId
     */
    public String getFlinkResourceId() {
        return this.flinkResourceId;
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
     * @return serviceIds
     */
    public java.util.List<Integer> getServiceIds() {
        return this.serviceIds;
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
        private java.util.List<Integer> effectiveSceneIds; 
        private String endTime; 
        private String executionTime; 
        private String flinkResourceId; 
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
        private java.util.List<Integer> serviceIds; 
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
            this.effectiveSceneIds = request.effectiveSceneIds;
            this.endTime = request.endTime;
            this.executionTime = request.executionTime;
            this.flinkResourceId = request.flinkResourceId;
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
            this.serviceIds = request.serviceIds;
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
         * <p>The behavior table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder behaviorTableMetaId(String behaviorTableMetaId) {
            this.putBodyParameter("BehaviorTableMetaId", behaviorTableMetaId);
            this.behaviorTableMetaId = behaviorTableMetaId;
            return this;
        }

        /**
         * <p>The control granularity. Valid values: Global (applies globally) and Single (applies to a specific item).</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        public Builder controlGranularity(String controlGranularity) {
            this.putBodyParameter("ControlGranularity", controlGranularity);
            this.controlGranularity = controlGranularity;
            return this;
        }

        /**
         * <p>The control logic.</p>
         * <ul>
         * <li><p>Guaranteed: The system strictly enforces the control target.</p>
         * </li>
         * <li><p>Approach: The system attempts to meet the control target, but enforcement is not strict.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Guaranteed</p>
         */
        public Builder controlLogic(String controlLogic) {
            this.putBodyParameter("ControlLogic", controlLogic);
            this.controlLogic = controlLogic;
            return this;
        }

        /**
         * <p>The control type.</p>
         * <ul>
         * <li><p>Percent: Controls traffic by percentage.</p>
         * </li>
         * <li><p>Quantity: Controls traffic by quantity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Percent</p>
         */
        public Builder controlType(String controlType) {
            this.putBodyParameter("ControlType", controlType);
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
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>A list of effective scene IDs.</p>
         */
        public Builder effectiveSceneIds(java.util.List<Integer> effectiveSceneIds) {
            this.putBodyParameter("EffectiveSceneIds", effectiveSceneIds);
            this.effectiveSceneIds = effectiveSceneIds;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-26</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The execution time.</p>
         * <ul>
         * <li><p>Permanent: The task runs permanently.</p>
         * </li>
         * <li><p>TimeRange: The task runs within a specified time range. This option requires you to also specify the StartTime and EndTime parameters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TimeRange</p>
         */
        public Builder executionTime(String executionTime) {
            this.putBodyParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
            return this;
        }

        /**
         * <p>The Flink data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>res-***</p>
         */
        public Builder flinkResourceId(String flinkResourceId) {
            this.putBodyParameter("FlinkResourceId", flinkResourceId);
            this.flinkResourceId = flinkResourceId;
            return this;
        }

        /**
         * <p>The instance ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-***test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The item condition in array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.putBodyParameter("ItemConditionArray", itemConditionArray);
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * <p>The item condition in expression format.</p>
         * 
         * <strong>example:</strong>
         * <p>status=1</p>
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.putBodyParameter("ItemConditionExpress", itemConditionExpress);
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * <p>The item condition type.</p>
         * <ul>
         * <li><p>Array: Specifies the array format.</p>
         * </li>
         * <li><p>Expression: Specifies the expression format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Array</p>
         */
        public Builder itemConditionType(String itemConditionType) {
            this.putBodyParameter("ItemConditionType", itemConditionType);
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
            this.putBodyParameter("ItemTableMetaId", itemTableMetaId);
            this.itemTableMetaId = itemTableMetaId;
            return this;
        }

        /**
         * <p>The name of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The experiment IDs for the staging environment. Separate multiple IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder preExperimentIds(String preExperimentIds) {
            this.putBodyParameter("PreExperimentIds", preExperimentIds);
            this.preExperimentIds = preExperimentIds;
            return this;
        }

        /**
         * <p>The experiment IDs for the production environment. Separate multiple IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>4,5,6</p>
         */
        public Builder prodExperimentIds(String prodExperimentIds) {
            this.putBodyParameter("ProdExperimentIds", prodExperimentIds);
            this.prodExperimentIds = prodExperimentIds;
            return this;
        }

        /**
         * <p>The scene ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>A list of bound engine service IDs.</p>
         */
        public Builder serviceIds(java.util.List<Integer> serviceIds) {
            this.putBodyParameter("ServiceIds", serviceIds);
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
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The statistical behavior condition in array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;field\&quot;:\&quot;click\&quot;,\&quot;option\&quot;:\&quot;&lt;=\&quot;,\&quot;value\&quot;:\&quot;30\&quot;}]</p>
         */
        public Builder statisBehaviorConditionArray(String statisBehaviorConditionArray) {
            this.putBodyParameter("StatisBehaviorConditionArray", statisBehaviorConditionArray);
            this.statisBehaviorConditionArray = statisBehaviorConditionArray;
            return this;
        }

        /**
         * <p>The statistical behavior condition in expression format.</p>
         * 
         * <strong>example:</strong>
         * <p>click=30</p>
         */
        public Builder statisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
            this.putBodyParameter("StatisBehaviorConditionExpress", statisBehaviorConditionExpress);
            this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
            return this;
        }

        /**
         * <p>The condition type for the statistical behavior.</p>
         * <ul>
         * <li><p>Array: Specifies the array format.</p>
         * </li>
         * <li><p>Expression: Specifies the expression format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Array</p>
         */
        public Builder statisBehaviorConditionType(String statisBehaviorConditionType) {
            this.putBodyParameter("StatisBehaviorConditionType", statisBehaviorConditionType);
            this.statisBehaviorConditionType = statisBehaviorConditionType;
            return this;
        }

        /**
         * <p>A list of traffic control targets.</p>
         */
        public Builder trafficControlTargets(java.util.List<TrafficControlTargets> trafficControlTargets) {
            this.putBodyParameter("TrafficControlTargets", trafficControlTargets);
            this.trafficControlTargets = trafficControlTargets;
            return this;
        }

        /**
         * <p>The intervention user group condition in array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;field\&quot;:\&quot;gender\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;male\&quot;}]</p>
         */
        public Builder userConditionArray(String userConditionArray) {
            this.putBodyParameter("UserConditionArray", userConditionArray);
            this.userConditionArray = userConditionArray;
            return this;
        }

        /**
         * <p>The intervention user group condition in expression format.</p>
         * 
         * <strong>example:</strong>
         * <p>age&lt;=30&amp;&amp;(3&lt;=level&lt;=6)&amp;&amp;gender=male</p>
         */
        public Builder userConditionExpress(String userConditionExpress) {
            this.putBodyParameter("UserConditionExpress", userConditionExpress);
            this.userConditionExpress = userConditionExpress;
            return this;
        }

        /**
         * <p>The condition type for the intervention user group.</p>
         * <ul>
         * <li><p>Array: Specifies the array format.</p>
         * </li>
         * <li><p>Expression: Specifies the expression format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Array</p>
         */
        public Builder userConditionType(String userConditionType) {
            this.putBodyParameter("UserConditionType", userConditionType);
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

            private Builder() {
            } 

            private Builder(TrafficControlTargets model) {
                this.endTime = model.endTime;
                this.event = model.event;
                this.itemConditionArray = model.itemConditionArray;
                this.itemConditionExpress = model.itemConditionExpress;
                this.itemConditionType = model.itemConditionType;
                this.name = model.name;
                this.newProductRegulation = model.newProductRegulation;
                this.recallName = model.recallName;
                this.startTime = model.startTime;
                this.statisPeriod = model.statisPeriod;
                this.status = model.status;
                this.toleranceValue = model.toleranceValue;
                this.value = model.value;
            } 

            /**
             * <p>The end time of the traffic control target.</p>
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
             * <p>The item condition in array format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;field\&quot;:\&quot;status\&quot;,\&quot;option\&quot;:\&quot;=\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * <p>The item condition in expression format.</p>
             * 
             * <strong>example:</strong>
             * <p>status=1</p>
             */
            public Builder itemConditionExpress(String itemConditionExpress) {
                this.itemConditionExpress = itemConditionExpress;
                return this;
            }

            /**
             * <p>The condition type for item control.</p>
             * <ul>
             * <li><p>Array: Specifies the array format.</p>
             * </li>
             * <li><p>Expression: Specifies the expression format.</p>
             * </li>
             * </ul>
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
             * <p>target_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to enable new product regulation.</p>
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
             * <p>recall_1</p>
             */
            public Builder recallName(String recallName) {
                this.recallName = recallName;
                return this;
            }

            /**
             * <p>The start time of the traffic control target.</p>
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
             * <ul>
             * <li><p>Daily: Statistics are aggregated daily.</p>
             * </li>
             * <li><p>Hour: Statistics are aggregated hourly.</p>
             * </li>
             * </ul>
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
             * <ul>
             * <li><p>Opened: The traffic control target is enabled.</p>
             * </li>
             * <li><p>Closed: The traffic control target is disabled.</p>
             * </li>
             * </ul>
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
             * <p>20</p>
             */
            public Builder toleranceValue(Long toleranceValue) {
                this.toleranceValue = toleranceValue;
                return this;
            }

            /**
             * <p>The value of the traffic control target.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
