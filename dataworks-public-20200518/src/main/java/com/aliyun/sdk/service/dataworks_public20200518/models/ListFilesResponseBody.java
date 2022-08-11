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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * AutoParsing.
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BusinessId.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * CommitStatus.
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * ConnectionName.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * FileDescription.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * FileFolderId.
             */
            public Builder fileFolderId(String fileFolderId) {
                this.fileFolderId = fileFolderId;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * IsMaxCompute.
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * LastEditTime.
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * LastEditUser.
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * UseType.
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
             * Files.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
