// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CrowdIds")
    private String crowdIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Flow")
    private Long flow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bucketType = builder.bucketType;
        this.condition = builder.condition;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.flow = builder.flow;
        this.layerId = builder.layerId;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
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
     * @return flow
     */
    public Long getFlow() {
        return this.flow;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String regionId; 
        private String bucketType; 
        private String condition; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private Long flow; 
        private String layerId; 
        private String name; 
        private String projectId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bucketType = request.bucketType;
            this.condition = request.condition;
            this.crowdIds = request.crowdIds;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.flow = request.flow;
            this.layerId = request.layerId;
            this.name = request.name;
            this.projectId = request.projectId;
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
         * Flow.
         */
        public Builder flow(Long flow) {
            this.putBodyParameter("Flow", flow);
            this.flow = flow;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
