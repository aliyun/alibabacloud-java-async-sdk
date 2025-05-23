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
 * {@link ListDeploymentPackageFilesRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentPackageFilesRequest</p>
 */
public class ListDeploymentPackageFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessId")
    private Long businessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeType")
    private Integer changeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitFrom")
    private String commitFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitTo")
    private String commitTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitUserId")
    private String commitUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    private java.util.List<String> fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private Integer fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private Long solutionId;

    private ListDeploymentPackageFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessId = builder.businessId;
        this.changeType = builder.changeType;
        this.commitFrom = builder.commitFrom;
        this.commitTo = builder.commitTo;
        this.commitUserId = builder.commitUserId;
        this.fileIds = builder.fileIds;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentPackageFilesRequest create() {
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
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return changeType
     */
    public Integer getChangeType() {
        return this.changeType;
    }

    /**
     * @return commitFrom
     */
    public String getCommitFrom() {
        return this.commitFrom;
    }

    /**
     * @return commitTo
     */
    public String getCommitTo() {
        return this.commitTo;
    }

    /**
     * @return commitUserId
     */
    public String getCommitUserId() {
        return this.commitUserId;
    }

    /**
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public Integer getFileType() {
        return this.fileType;
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
     * @return solutionId
     */
    public Long getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<ListDeploymentPackageFilesRequest, Builder> {
        private String regionId; 
        private Long businessId; 
        private Integer changeType; 
        private String commitFrom; 
        private String commitTo; 
        private String commitUserId; 
        private java.util.List<String> fileIds; 
        private String fileName; 
        private Integer fileType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private Long solutionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentPackageFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessId = request.businessId;
            this.changeType = request.changeType;
            this.commitFrom = request.commitFrom;
            this.commitTo = request.commitTo;
            this.commitUserId = request.commitUserId;
            this.fileIds = request.fileIds;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.solutionId = request.solutionId;
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
         * BusinessId.
         */
        public Builder businessId(Long businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * ChangeType.
         */
        public Builder changeType(Integer changeType) {
            this.putQueryParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * CommitFrom.
         */
        public Builder commitFrom(String commitFrom) {
            this.putQueryParameter("CommitFrom", commitFrom);
            this.commitFrom = commitFrom;
            return this;
        }

        /**
         * CommitTo.
         */
        public Builder commitTo(String commitTo) {
            this.putQueryParameter("CommitTo", commitTo);
            this.commitTo = commitTo;
            return this;
        }

        /**
         * CommitUserId.
         */
        public Builder commitUserId(String commitUserId) {
            this.putQueryParameter("CommitUserId", commitUserId);
            this.commitUserId = commitUserId;
            return this;
        }

        /**
         * FileIds.
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            String fileIdsShrink = shrink(fileIds, "FileIds", "json");
            this.putQueryParameter("FileIds", fileIdsShrink);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(Integer fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SolutionId.
         */
        public Builder solutionId(Long solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public ListDeploymentPackageFilesRequest build() {
            return new ListDeploymentPackageFilesRequest(this);
        } 

    } 

}
