// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilesRequest} extends {@link RequestModel}
 *
 * <p>ListFilesRequest</p>
 */
public class ListFilesRequest extends Request {
    @Body
    @NameInMap("FileFolderPath")
    private String fileFolderPath;

    @Body
    @NameInMap("FileTypes")
    private String fileTypes;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

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

    @Body
    @NameInMap("UseType")
    private String useType;

    private ListFilesRequest(Builder builder) {
        super(builder);
        this.fileFolderPath = builder.fileFolderPath;
        this.fileTypes = builder.fileTypes;
        this.keyword = builder.keyword;
        this.nodeId = builder.nodeId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.regionId = builder.regionId;
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
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder extends Request.Builder<ListFilesRequest, Builder> {
        private String fileFolderPath; 
        private String fileTypes; 
        private String keyword; 
        private Long nodeId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String projectIdentifier; 
        private String regionId; 
        private String useType; 

        private Builder() {
            super();
        } 

        private Builder(ListFilesRequest request) {
            super(request);
            this.fileFolderPath = request.fileFolderPath;
            this.fileTypes = request.fileTypes;
            this.keyword = request.keyword;
            this.nodeId = request.nodeId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.regionId = request.regionId;
            this.useType = request.useType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
