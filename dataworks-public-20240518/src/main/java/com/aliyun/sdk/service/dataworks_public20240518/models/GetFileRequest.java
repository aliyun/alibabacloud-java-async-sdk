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
 * {@link GetFileRequest} extends {@link RequestModel}
 *
 * <p>GetFileRequest</p>
 */
public class GetFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    private Long fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    private GetFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileId = builder.fileId;
        this.nodeId = builder.nodeId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileRequest create() {
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

    public static final class Builder extends Request.Builder<GetFileRequest, Builder> {
        private String regionId; 
        private Long fileId; 
        private Long nodeId; 
        private Long projectId; 
        private String projectIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileId = request.fileId;
            this.nodeId = request.nodeId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
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
         * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the node that is scheduled. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the name.</p>
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
        public GetFileRequest build() {
            return new GetFileRequest(this);
        } 

    } 

}
