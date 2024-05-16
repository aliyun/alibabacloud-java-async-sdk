// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFolderRequest} extends {@link RequestModel}
 *
 * <p>UpdateFolderRequest</p>
 */
public class UpdateFolderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private UpdateFolderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFolderRequest create() {
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
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
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

    public static final class Builder extends Request.Builder<UpdateFolderRequest, Builder> {
        private String regionId; 
        private String folderId; 
        private String folderName; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFolderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.folderId = request.folderId;
            this.folderName = request.folderName;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the folder. You can call the [ListFolders](~~173955~~) operation to query the ID.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
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
         * The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID. You must specify either this parameter or ProjectIdentifier to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Settings panel to obtain the name. You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        @Override
        public UpdateFolderRequest build() {
            return new UpdateFolderRequest(this);
        } 

    } 

}
