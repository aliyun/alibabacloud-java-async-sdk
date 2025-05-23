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
 * {@link ListFilesRequest} extends {@link RequestModel}
 *
 * <p>ListFilesRequest</p>
 */
public class ListFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommitStatus")
    private Integer commitStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExactFileName")
    private String exactFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileFolderPath")
    private String fileFolderPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileIdIn")
    private String fileIdIn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileTypes")
    private String fileTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LastEditUser")
    private String lastEditUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedAbsoluteFolderPath")
    private Boolean needAbsoluteFolderPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedContent")
    private Boolean needContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseType")
    private String useType;

    private ListFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.commitStatus = builder.commitStatus;
        this.exactFileName = builder.exactFileName;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileIdIn = builder.fileIdIn;
        this.fileTypes = builder.fileTypes;
        this.keyword = builder.keyword;
        this.lastEditUser = builder.lastEditUser;
        this.needAbsoluteFolderPath = builder.needAbsoluteFolderPath;
        this.needContent = builder.needContent;
        this.nodeId = builder.nodeId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilesRequest create() {
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
     * @return commitStatus
     */
    public Integer getCommitStatus() {
        return this.commitStatus;
    }

    /**
     * @return exactFileName
     */
    public String getExactFileName() {
        return this.exactFileName;
    }

    /**
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    /**
     * @return fileIdIn
     */
    public String getFileIdIn() {
        return this.fileIdIn;
    }

    /**
     * @return fileTypes
     */
    public String getFileTypes() {
        return this.fileTypes;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lastEditUser
     */
    public String getLastEditUser() {
        return this.lastEditUser;
    }

    /**
     * @return needAbsoluteFolderPath
     */
    public Boolean getNeedAbsoluteFolderPath() {
        return this.needAbsoluteFolderPath;
    }

    /**
     * @return needContent
     */
    public Boolean getNeedContent() {
        return this.needContent;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder extends Request.Builder<ListFilesRequest, Builder> {
        private String regionId; 
        private Integer commitStatus; 
        private String exactFileName; 
        private String fileFolderPath; 
        private String fileIdIn; 
        private String fileTypes; 
        private String keyword; 
        private String lastEditUser; 
        private Boolean needAbsoluteFolderPath; 
        private Boolean needContent; 
        private Long nodeId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String projectIdentifier; 
        private String useType; 

        private Builder() {
            super();
        } 

        private Builder(ListFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.commitStatus = request.commitStatus;
            this.exactFileName = request.exactFileName;
            this.fileFolderPath = request.fileFolderPath;
            this.fileIdIn = request.fileIdIn;
            this.fileTypes = request.fileTypes;
            this.keyword = request.keyword;
            this.lastEditUser = request.lastEditUser;
            this.needAbsoluteFolderPath = request.needAbsoluteFolderPath;
            this.needContent = request.needContent;
            this.nodeId = request.nodeId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.useType = request.useType;
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
         * CommitStatus.
         */
        public Builder commitStatus(Integer commitStatus) {
            this.putBodyParameter("CommitStatus", commitStatus);
            this.commitStatus = commitStatus;
            return this;
        }

        /**
         * ExactFileName.
         */
        public Builder exactFileName(String exactFileName) {
            this.putBodyParameter("ExactFileName", exactFileName);
            this.exactFileName = exactFileName;
            return this;
        }

        /**
         * FileFolderPath.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * FileIdIn.
         */
        public Builder fileIdIn(String fileIdIn) {
            this.putBodyParameter("FileIdIn", fileIdIn);
            this.fileIdIn = fileIdIn;
            return this;
        }

        /**
         * FileTypes.
         */
        public Builder fileTypes(String fileTypes) {
            this.putBodyParameter("FileTypes", fileTypes);
            this.fileTypes = fileTypes;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * LastEditUser.
         */
        public Builder lastEditUser(String lastEditUser) {
            this.putBodyParameter("LastEditUser", lastEditUser);
            this.lastEditUser = lastEditUser;
            return this;
        }

        /**
         * NeedAbsoluteFolderPath.
         */
        public Builder needAbsoluteFolderPath(Boolean needAbsoluteFolderPath) {
            this.putBodyParameter("NeedAbsoluteFolderPath", needAbsoluteFolderPath);
            this.needAbsoluteFolderPath = needAbsoluteFolderPath;
            return this;
        }

        /**
         * NeedContent.
         */
        public Builder needContent(Boolean needContent) {
            this.putBodyParameter("NeedContent", needContent);
            this.needContent = needContent;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * UseType.
         */
        public Builder useType(String useType) {
            this.putBodyParameter("UseType", useType);
            this.useType = useType;
            return this;
        }

        @Override
        public ListFilesRequest build() {
            return new ListFilesRequest(this);
        } 

    } 

}
