// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExperimentRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentRequest</p>
 */
public class CreateExperimentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoreMetricId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreMetricId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrowdIds")
    private String crowdIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Flow")
    private Integer flow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FocusMetricIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String focusMetricIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateExperimentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bucketType = builder.bucketType;
        this.condition = builder.condition;
        this.coreMetricId = builder.coreMetricId;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.flow = builder.flow;
        this.focusMetricIds = builder.focusMetricIds;
        this.layerId = builder.layerId;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentRequest create() {
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
     * @return bucketType
     */
    public String getBucketType() {
        return this.bucketType;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return coreMetricId
     */
    public String getCoreMetricId() {
        return this.coreMetricId;
    }

    /**
     * @return crowdIds
     */
    public String getCrowdIds() {
        return this.crowdIds;
    }

    /**
     * @return debugUsers
     */
    public String getDebugUsers() {
        return this.debugUsers;
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
     * @return flow
     */
    public Integer getFlow() {
        return this.flow;
    }

    /**
     * @return focusMetricIds
     */
    public String getFocusMetricIds() {
        return this.focusMetricIds;
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateExperimentRequest, Builder> {
        private String regionId; 
        private String bucketType; 
        private String condition; 
        private String coreMetricId; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private String endTime; 
        private Integer flow; 
        private String focusMetricIds; 
        private String layerId; 
        private String name; 
        private String startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bucketType = request.bucketType;
            this.condition = request.condition;
            this.coreMetricId = request.coreMetricId;
            this.crowdIds = request.crowdIds;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.endTime = request.endTime;
            this.flow = request.flow;
            this.focusMetricIds = request.focusMetricIds;
            this.layerId = request.layerId;
            this.name = request.name;
            this.startTime = request.startTime;
            this.workspaceId = request.workspaceId;
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
         * BucketType.
         */
        public Builder bucketType(String bucketType) {
            this.putBodyParameter("BucketType", bucketType);
            this.bucketType = bucketType;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.putBodyParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * CoreMetricId.
         */
        public Builder coreMetricId(String coreMetricId) {
            this.putBodyParameter("CoreMetricId", coreMetricId);
            this.coreMetricId = coreMetricId;
            return this;
        }

        /**
         * CrowdIds.
         */
        public Builder crowdIds(String crowdIds) {
            this.putBodyParameter("CrowdIds", crowdIds);
            this.crowdIds = crowdIds;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.putBodyParameter("DebugUsers", debugUsers);
            this.debugUsers = debugUsers;
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
         * Flow.
         */
        public Builder flow(Integer flow) {
            this.putBodyParameter("Flow", flow);
            this.flow = flow;
            return this;
        }

        /**
         * FocusMetricIds.
         */
        public Builder focusMetricIds(String focusMetricIds) {
            this.putBodyParameter("FocusMetricIds", focusMetricIds);
            this.focusMetricIds = focusMetricIds;
            return this;
        }

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putBodyParameter("LayerId", layerId);
            this.layerId = layerId;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateExperimentRequest build() {
            return new CreateExperimentRequest(this);
        } 

    } 

}
