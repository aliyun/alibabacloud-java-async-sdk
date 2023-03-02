// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFolderRequest} extends {@link RequestModel}
 *
 * <p>GetFolderRequest</p>
 */
public class GetFolderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("FolderId")
    private String folderId;

    @Body
    @NameInMap("FolderPath")
    private String folderPath;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private GetFolderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.folderId = builder.folderId;
        this.folderPath = builder.folderPath;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFolderRequest create() {
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
     * @return folderPath
     */
    public String getFolderPath() {
        return this.folderPath;
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

    public static final class Builder extends Request.Builder<GetFolderRequest, Builder> {
        private String regionId; 
        private String folderId; 
        private String folderPath; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetFolderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.folderId = request.folderId;
            this.folderPath = request.folderPath;
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
         * <p>
         * 
         * You must specify either this parameter or the FolderPath parameter.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The path of the folder. You can call the [ListFolders](~~173955~~) operation to query the path.
         * <p>
         * 
         * You must specify either this parameter or the FolderId parameter.
         */
        public Builder folderPath(String folderPath) {
            this.putBodyParameter("FolderPath", folderPath);
            this.folderPath = folderPath;
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
        public GetFolderRequest build() {
            return new GetFolderRequest(this);
        } 

    } 

}
