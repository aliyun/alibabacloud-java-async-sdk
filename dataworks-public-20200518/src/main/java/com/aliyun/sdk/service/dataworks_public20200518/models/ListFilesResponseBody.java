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
 * {@link ListFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFilesResponseBody</p>
 */
public class ListFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFilesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The files returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFilesResponseBody build() {
            return new ListFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFilesResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbsoluteFolderPath")
        private String absoluteFolderPath;

        @com.aliyun.core.annotation.NameInMap("AutoParsing")
        private Boolean autoParsing;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("CommitStatus")
        private Integer commitStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private Integer currentVersion;

        @com.aliyun.core.annotation.NameInMap("FileDescription")
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileFolderId")
        private String fileFolderId;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("IsMaxCompute")
        private Boolean isMaxCompute;

        @com.aliyun.core.annotation.NameInMap("LastEditTime")
        private Long lastEditTime;

        @com.aliyun.core.annotation.NameInMap("LastEditUser")
        private String lastEditUser;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private Files(Builder builder) {
            this.absoluteFolderPath = builder.absoluteFolderPath;
            this.autoParsing = builder.autoParsing;
            this.bizId = builder.bizId;
            this.businessId = builder.businessId;
            this.commitStatus = builder.commitStatus;
            this.connectionName = builder.connectionName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.currentVersion = builder.currentVersion;
            this.fileDescription = builder.fileDescription;
            this.fileFolderId = builder.fileFolderId;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.isMaxCompute = builder.isMaxCompute;
            this.lastEditTime = builder.lastEditTime;
            this.lastEditUser = builder.lastEditUser;
            this.nodeId = builder.nodeId;
            this.owner = builder.owner;
            this.parentId = builder.parentId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return absoluteFolderPath
         */
        public String getAbsoluteFolderPath() {
            return this.absoluteFolderPath;
        }

        /**
         * @return autoParsing
         */
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return commitStatus
         */
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return currentVersion
         */
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileFolderId
         */
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
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
         * @return isMaxCompute
         */
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        /**
         * @return lastEditTime
         */
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return lastEditUser
         */
        public String getLastEditUser() {
            return this.lastEditUser;
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
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String absoluteFolderPath; 
            private Boolean autoParsing; 
            private Long bizId; 
            private Long businessId; 
            private Integer commitStatus; 
            private String connectionName; 
            private String content; 
            private Long createTime; 
            private String createUser; 
            private Integer currentVersion; 
            private String fileDescription; 
            private String fileFolderId; 
            private Long fileId; 
            private String fileName; 
            private Integer fileType; 
            private Boolean isMaxCompute; 
            private Long lastEditTime; 
            private String lastEditUser; 
            private Long nodeId; 
            private String owner; 
            private Long parentId; 
            private String useType; 

            /**
             * <p>The path of the folder where the file is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
             */
            public Builder absoluteFolderPath(String absoluteFolderPath) {
                this.absoluteFolderPath = absoluteFolderPath;
                return this;
            }

            /**
             * <p>Specifies whether the automatic parsing feature is enabled for the file. Valid values:</p>
             * <ul>
             * <li>true: The automatic parsing feature is enabled for the file.</li>
             * <li>false: The automatic parsing feature is not enabled for the file.</li>
             * </ul>
             * <p>This parameter is equivalent to the Analyze Code parameter in the Dependencies section of the Properties panel in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the file belongs. This parameter is deprecated and replaced by the BusinessId parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>Indicates whether the latest code in the file is committed. Valid values: 0 and 1. The value 0 indicates that the latest code in the file is not committed. The value 1 indicates that the latest code in the file is committed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * <p>The ID of the compute engine instance that is used to run the node that corresponds to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>This parameter is deprecated. You can call the <a href="~~173954#doc-api-dataworks-public-GetFile~~">GetFile</a> operation to query the details of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1593950832000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the file.</p>
             * 
             * <strong>example:</strong>
             * <p>382762****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The latest version number of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The description of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>my test datastudio file</p>
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * <p>The ID of the folder to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2735c2****</p>
             */
            public Builder fileFolderId(String fileFolderId) {
                this.fileFolderId = fileFolderId;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The type of the code in the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>Indicates whether the file needs to be uploaded to MaxCompute if the file is a MaxCompute resource file.</p>
             * <p>This parameter is returned only if the file is a MaxCompute resource file.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * <p>The time when the file was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1593950832000</p>
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to last modify the file.</p>
             * 
             * <strong>example:</strong>
             * <p>38748246285727</p>
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * <p>The ID of the auto triggered node that is generated in the scheduling system after the file is committed.</p>
             * 
             * <strong>example:</strong>
             * <p>300001</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the file owner.</p>
             * 
             * <strong>example:</strong>
             * <p>3872572****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the node group file to which the current file belongs. This parameter is returned only if the current file is an inner file of the node group file.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The module to which the file belongs. Valid values:</p>
             * <ul>
             * <li>NORMAL: The file is used for DataStudio.</li>
             * <li>MANUAL: The file is used for a manually triggered node.</li>
             * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
             * <li>SKIP: The files is used for a dry-run node in DataStudio.</li>
             * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
             * <li>COMPONENT: The file is used for a snippet.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.files = builder.files;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Files> files; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The details of the files.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
