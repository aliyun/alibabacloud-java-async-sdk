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
         * <p>The current commit status of the file. Valid values: 0 (the latest code is not committed) and 1 (the latest code is committed).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder commitStatus(Integer commitStatus) {
            this.putBodyParameter("CommitStatus", commitStatus);
            this.commitStatus = commitStatus;
            return this;
        }

        /**
         * <p>The exact file name. The file name in the query result must exactly match this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_create.sql</p>
         */
        public Builder exactFileName(String exactFileName) {
            this.putBodyParameter("ExactFileName", exactFileName);
            this.exactFileName = exactFileName;
            return this;
        }

        /**
         * <p>The path to the folder where the file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * <p>The list of file IDs. The file IDs in the query result must be a subset of this list. You can specify up to 50 file IDs at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>78237,816123</p>
         */
        public Builder fileIdIn(String fileIdIn) {
            this.putBodyParameter("FileIdIn", fileIdIn);
            this.fileIdIn = fileIdIn;
            return this;
        }

        /**
         * <p>The code type of the file.</p>
         * <p>The code type of the file. Common code types and their corresponding file types include: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (Combined node), 99 (Virtual node), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (Real-time sync), 1002 (PAI internal node), 1089 (Cross-tenant node), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (Assignment node), 1106 (ForEach node), 1221 (PyODPS 3).</p>
         * 
         * <strong>example:</strong>
         * <p>10,23</p>
         */
        public Builder fileTypes(String fileTypes) {
            this.putBodyParameter("FileTypes", fileTypes);
            this.fileTypes = fileTypes;
            return this;
        }

        /**
         * <p>The keyword for the file name. Fuzzy match is supported. You can enter a keyword to query all files that contain the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>ods</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the user who last updated the file.</p>
         * 
         * <strong>example:</strong>
         * <p>11233***</p>
         */
        public Builder lastEditUser(String lastEditUser) {
            this.putBodyParameter("LastEditUser", lastEditUser);
            this.lastEditUser = lastEditUser;
            return this;
        }

        /**
         * <p>Specifies whether the query result includes the path to the folder where the file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needAbsoluteFolderPath(Boolean needAbsoluteFolderPath) {
            this.putBodyParameter("NeedAbsoluteFolderPath", needAbsoluteFolderPath);
            this.needAbsoluteFolderPath = needAbsoluteFolderPath;
            return this;
        }

        /**
         * <p>Specifies whether the query result includes the file content. For files with large content, network transmission delays may occur.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needContent(Boolean needContent) {
            this.putBodyParameter("NeedContent", needContent);
            this.needContent = needContent;
            return this;
        }

        /**
         * <p>The ID of the scheduling node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123541234</p>
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The ID of the file owner.</p>
         * 
         * <strong>example:</strong>
         * <p>3726346****</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
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
         * <p>The DataWorks workspace name. To obtain the workspace name, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
         * <p>You must specify either this parameter or ProjectId to identify the target DataWorks workspace for this API call.</p>
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
         * <p>The functional module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: Data Studio</li>
         * <li>MANUAL: Manually triggered node</li>
         * <li>MANUAL_BIZ: Manually triggered workflow</li>
         * <li>SKIP: Dry-run scheduling in Data Studio</li>
         * <li>ADHOCQUERY: Ad hoc query</li>
         * <li>COMPONENT: Component management</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
