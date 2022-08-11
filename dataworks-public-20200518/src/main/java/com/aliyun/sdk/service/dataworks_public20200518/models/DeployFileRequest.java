// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFileRequest} extends {@link RequestModel}
 *
 * <p>DeployFileRequest</p>
 */
public class DeployFileRequest extends Request {
    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("FileId")
    private Long fileId;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeployFileRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.fileId = builder.fileId;
        this.nodeId = builder.nodeId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeployFileRequest, Builder> {
        private String comment; 
        private Long fileId; 
        private Long nodeId; 
        private Long projectId; 
        private String projectIdentifier; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeployFileRequest request) {
            super(request);
            this.comment = request.comment;
            this.fileId = request.fileId;
            this.nodeId = request.nodeId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.regionId = request.regionId;
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
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeployFileRequest build() {
            return new DeployFileRequest(this);
        } 

    } 

}
