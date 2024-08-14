// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceFolderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceFolderRequest</p>
 */
public class CreateDataServiceFolderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tenantId;

    private CreateDataServiceFolderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.folderName = builder.folderName;
        this.groupId = builder.groupId;
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceFolderRequest create() {
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
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataServiceFolderRequest, Builder> {
        private String regionId; 
        private String folderName; 
        private String groupId; 
        private Long parentId; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceFolderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.folderName = request.folderName;
            this.groupId = request.groupId;
            this.parentId = request.parentId;
            this.projectId = request.projectId;
            this.tenantId = request.tenantId;
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
         * The name of the folder.
         */
        public Builder folderName(String folderName) {
            this.putBodyParameter("FolderName", folderName);
            this.folderName = folderName;
            return this;
        }

        /**
         * The ID of the desired workflow to which the folder belongs.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the desired parent folder of the folder. The ID of the root folder in a workflow is 0. The ID of the folder created by users in a workflow is greater than 0.
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The tenant ID.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDataServiceFolderRequest build() {
            return new CreateDataServiceFolderRequest(this);
        } 

    } 

}
