// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFilesResponseBody</p>
 */
public class ListFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The files returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can troubleshoot errors based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFilesResponseBody build() {
            return new ListFilesResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @NameInMap("AutoParsing")
        private Boolean autoParsing;

        @NameInMap("BizId")
        private Long bizId;

        @NameInMap("BusinessId")
        private Long businessId;

        @NameInMap("CommitStatus")
        private Integer commitStatus;

        @NameInMap("ConnectionName")
        private String connectionName;

        @NameInMap("Content")
        private String content;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("CurrentVersion")
        private Integer currentVersion;

        @NameInMap("FileDescription")
        private String fileDescription;

        @NameInMap("FileFolderId")
        private String fileFolderId;

        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileType")
        private Integer fileType;

        @NameInMap("IsMaxCompute")
        private Boolean isMaxCompute;

        @NameInMap("LastEditTime")
        private Long lastEditTime;

        @NameInMap("LastEditUser")
        private String lastEditUser;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("UseType")
        private String useType;

        private Files(Builder builder) {
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
             * Specifies whether the automatic parsing feature is enabled for the file. Valid values:
             * <p>
             * 
             * *   true: The automatic parsing feature is enabled for the file.
             * *   false: The automatic parsing feature is not enabled for the file.
             * 
             * This parameter is equivalent to the Analyze Code parameter in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * The ID of the workflow to which the file belongs. This parameter is deprecated and replaced by the BusinessId parameter.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * The ID of the workflow to which the file belongs.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * Indicates whether the latest code in the file is committed. Valid values: 0 and 1. The value 0 indicates that the latest code in the file is not committed. The value 1 indicates that the latest code in the file is committed.
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * The ID of the compute engine instance that is used to run the node that corresponds to the file.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * This parameter is deprecated. You can call the [GetFile](~~173954#doc-api-dataworks-public-GetFile~~) operation to query the details of the file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the file.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The latest version number of the file.
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The description of the file.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * The ID of the folder to which the file belongs.
             */
            public Builder fileFolderId(String fileFolderId) {
                this.fileFolderId = fileFolderId;
                return this;
            }

            /**
             * The ID of the file.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The type of the code in the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Indicates whether the file needs to be uploaded to MaxCompute if the file is a MaxCompute resource file.
             * <p>
             * 
             * This parameter is returned only if the file is a MaxCompute resource file.
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * The time when the file was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to last modify the file.
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * The ID of the auto triggered node that is generated in the scheduling system after the file is committed.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the file owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the node group file to which the current file belongs. This parameter is returned only if the current file is an inner file of the node group file.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The module to which the file belongs. Valid values:
             * <p>
             * 
             * *   NORMAL: The file is used for DataStudio.
             * *   MANUAL: The file is used for a manually triggered node.
             * *   MANUAL_BIZ: The file is used for a manually triggered workflow.
             * *   SKIP: The files is used for a dry-run node in DataStudio.
             * *   ADHOCQUERY: The file is used for an ad hoc query.
             * *   COMPONENT: The file is used for a snippet.
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
    public static class Data extends TeaModel {
        @NameInMap("Files")
        private java.util.List < Files> files;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < Files> getFiles() {
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
            private java.util.List < Files> files; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The details of the files.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
