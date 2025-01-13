// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link SubmitFileRequest} extends {@link RequestModel}
 *
 * <p>SubmitFileRequest</p>
 */
public class SubmitFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkipAllDeployFileExtensions")
    private Boolean skipAllDeployFileExtensions;

    private SubmitFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.skipAllDeployFileExtensions = builder.skipAllDeployFileExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFileRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
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

    /**
     * @return skipAllDeployFileExtensions
     */
    public Boolean getSkipAllDeployFileExtensions() {
        return this.skipAllDeployFileExtensions;
    }

    public static final class Builder extends Request.Builder<SubmitFileRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Long fileId; 
        private Long projectId; 
        private String projectIdentifier; 
        private Boolean skipAllDeployFileExtensions; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.skipAllDeployFileExtensions = request.skipAllDeployFileExtensions;
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
         * <p>The description of the commit operation.</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
         * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace name. You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>Specifies whether to skip the pre-publish check after the file is committed. Valid values:</p>
         * <ul>
         * <li>false: indicates that the pre-publish check is not skipped. After the file is committed, the pre-publish check is automatically triggered. The file can be deployed only after the file passes the check.</li>
         * <li>true: indicates that the pre-publish check is skipped. After the file is submitted, the pre-publish check process is not triggered. You can directly deploy the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipAllDeployFileExtensions(Boolean skipAllDeployFileExtensions) {
            this.putBodyParameter("SkipAllDeployFileExtensions", skipAllDeployFileExtensions);
            this.skipAllDeployFileExtensions = skipAllDeployFileExtensions;
            return this;
        }

        @Override
        public SubmitFileRequest build() {
            return new SubmitFileRequest(this);
        } 

    } 

}
