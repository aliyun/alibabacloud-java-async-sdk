// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentRequest</p>
 */
public class GetDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deploymentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private GetDeploymentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deploymentId = builder.deploymentId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentRequest create() {
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
     * @return deploymentId
     */
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public static final class Builder extends Request.Builder<GetDeploymentRequest, Builder> {
        private String regionId; 
        private Long deploymentId; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deploymentId = request.deploymentId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
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
         * The ID of the deployment task. A deployment task ID is generated when you call the [SubmitFile](~~173944~~) or [DeployFile](~~173956~~) operation.
         */
        public Builder deploymentId(Long deploymentId) {
            this.putBodyParameter("DeploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The GUID of the DataWorks workspace. You can view the GUID in the upper part of the DataStudio page. You can also select another GUID to switch to another workspace.
         * <p>
         * 
         * You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        @Override
        public GetDeploymentRequest build() {
            return new GetDeploymentRequest(this);
        } 

    } 

}
