// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFileRequest} extends {@link RequestModel}
 *
 * <p>SubmitFileRequest</p>
 */
public class SubmitFileRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("FileId")
    @Validation(required = true)
    private Long fileId;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Body
    @NameInMap("SkipAllDeployFileExtensions")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * SkipAllDeployFileExtensions.
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
