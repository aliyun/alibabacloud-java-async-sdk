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
         * <p>The workflow ID. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to query the workflow ID by name.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder businessId(Long businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>The change type. Valid values:</p>
         * <ul>
         * <li>0: addition</li>
         * <li>1: update</li>
         * <li>2: deletion</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder changeType(Integer changeType) {
            this.putQueryParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The start date for committing. Specify the date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01</p>
         */
        public Builder commitFrom(String commitFrom) {
            this.putQueryParameter("CommitFrom", commitFrom);
            this.commitFrom = commitFrom;
            return this;
        }

        /**
         * <p>The end date (included) for committing. Specify the date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-31</p>
         */
        public Builder commitTo(String commitTo) {
            this.putQueryParameter("CommitTo", commitTo);
            this.commitTo = commitTo;
            return this;
        }

        /**
         * <p>The ID of the user who commits the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2003****</p>
         */
        public Builder commitUserId(String commitUserId) {
            this.putQueryParameter("CommitUserId", commitUserId);
            this.commitUserId = commitUserId;
            return this;
        }

        /**
         * <p>The IDs of the files to be queried.</p>
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            String fileIdsShrink = shrink(fileIds, "FileIds", "json");
            this.putQueryParameter("FileIds", fileIdsShrink);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Filename</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The type of the code for the file.</p>
         * <p>The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>. You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the type of the code for the file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder fileType(Integer fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
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
         * <p>The solution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8065</p>
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
