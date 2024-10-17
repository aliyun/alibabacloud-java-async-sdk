// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
        this.exactFileName = builder.exactFileName;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileIdIn = builder.fileIdIn;
        this.fileTypes = builder.fileTypes;
        this.keyword = builder.keyword;
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
        private String exactFileName; 
        private String fileFolderPath; 
        private String fileIdIn; 
        private String fileTypes; 
        private String keyword; 
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
            this.exactFileName = request.exactFileName;
            this.fileFolderPath = request.fileFolderPath;
            this.fileIdIn = request.fileIdIn;
            this.fileTypes = request.fileTypes;
            this.keyword = request.keyword;
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
         * ExactFileName.
         */
        public Builder exactFileName(String exactFileName) {
            this.putBodyParameter("ExactFileName", exactFileName);
            this.exactFileName = exactFileName;
            return this;
        }

        /**
         * <p>The path of the files.</p>
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
         * <p>The types of the code in the files.</p>
         * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (node group), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1002 (PAI inner node), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), 1106 (for-each), and 1221 (PyODPS 3).</p>
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
         * <p>The keyword in the file names. The keyword is used to perform a fuzzy match. You can specify a keyword to query all files whose names contain the keyword.</p>
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
         * <p>The ID of the node that is scheduled. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the ID of the node.</p>
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
         * <p>The owner of the files.</p>
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
         * <p>The page number.</p>
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
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.</p>
         * <p>You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace name.</p>
         * <p>You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
         * <p>The module to which the files belong. Valid values:</p>
         * <ul>
         * <li>NORMAL: The files are used for DataStudio.</li>
         * <li>MANUAL: The files are used for manually triggered nodes.</li>
         * <li>MANUAL_BIZ: The files are used for manually triggered workflows.</li>
         * <li>SKIP: The files are used for dry-run nodes in DataStudio.</li>
         * <li>ADHOCQUERY: The files are used for ad hoc queries.</li>
         * <li>COMPONENT: The files are used for snippets.</li>
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
