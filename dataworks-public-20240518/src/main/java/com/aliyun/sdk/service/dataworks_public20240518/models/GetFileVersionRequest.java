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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The file version whose information you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder fileVersion(Integer fileVersion) {
            this.putBodyParameter("FileVersion", fileVersion);
            this.fileVersion = fileVersion;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace page and query the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000011</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The unique identifier of the DataWorks workspace. You can view the identifier in the upper part of the DataStudio page. You can also select another identifier to switch to another workspace.</p>
         * <p>You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
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
