// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateCrossProjectPipelineRunRequest} extends {@link RequestModel}
 *
 * <p>CreateCrossProjectPipelineRunRequest</p>
 */
public class CreateCrossProjectPipelineRunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentEnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deploymentEnvironmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 4096)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateCrossProjectPipelineRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deploymentEnvironmentId = builder.deploymentEnvironmentId;
        this.description = builder.description;
        this.objectIds = builder.objectIds;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrossProjectPipelineRunRequest create() {
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
     * @return deploymentEnvironmentId
     */
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return objectIds
     */
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCrossProjectPipelineRunRequest, Builder> {
        private String regionId; 
        private Long deploymentEnvironmentId; 
        private String description; 
        private java.util.List<String> objectIds; 
        private Long projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCrossProjectPipelineRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deploymentEnvironmentId = request.deploymentEnvironmentId;
            this.description = request.description;
            this.objectIds = request.objectIds;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The cross-workspace deployment environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder deploymentEnvironmentId(Long deploymentEnvironmentId) {
            this.putBodyParameter("DeploymentEnvironmentId", deploymentEnvironmentId);
            this.deploymentEnvironmentId = deploymentEnvironmentId;
            return this;
        }

        /**
         * <p>The deployment description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a business process created through the API</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of top-level object IDs from the source project to deploy. The list must contain exactly one object. Child objects of composite objects such as workflows are automatically included by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1&quot;]</p>
         */
        public Builder objectIds(java.util.List<String> objectIds) {
            String objectIdsShrink = shrink(objectIds, "ObjectIds", "json");
            this.putBodyParameter("ObjectIds", objectIdsShrink);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li>Offline: Offline deployment.</li>
         * <li>Online: Online deployment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCrossProjectPipelineRunRequest build() {
            return new CreateCrossProjectPipelineRunRequest(this);
        } 

    } 

}
