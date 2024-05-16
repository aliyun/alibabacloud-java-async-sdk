// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFileVersionRequest</p>
 */
public class GetFileVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer fileVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private GetFileVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileId = builder.fileId;
        this.fileVersion = builder.fileVersion;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileVersionRequest create() {
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
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return fileVersion
     */
    public Integer getFileVersion() {
        return this.fileVersion;
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

    public static final class Builder extends Request.Builder<GetFileVersionRequest, Builder> {
        private String regionId; 
        private Long fileId; 
        private Integer fileVersion; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetFileVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileId = request.fileId;
            this.fileVersion = request.fileVersion;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the file. You can call the [ListFiles](~~173942~~) operation to query the ID.
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The file version whose details you want to query.
         */
        public Builder fileVersion(Integer fileVersion) {
            this.putBodyParameter("FileVersion", fileVersion);
            this.fileVersion = fileVersion;
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
         * The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.
         * <p>
         * 
         * You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        @Override
        public GetFileVersionRequest build() {
            return new GetFileVersionRequest(this);
        } 

    } 

}
