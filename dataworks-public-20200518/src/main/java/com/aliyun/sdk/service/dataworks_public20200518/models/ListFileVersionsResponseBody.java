// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileVersionsResponseBody</p>
 */
public class ListFileVersionsResponseBody extends TeaModel {
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

    private ListFileVersionsResponseBody(Builder builder) {
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

    public static ListFileVersionsResponseBody create() {
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
         * The file versions returned.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFileVersionsResponseBody build() {
            return new ListFileVersionsResponseBody(this);
        } 

    } 

    public static class FileVersions extends TeaModel {
        @NameInMap("ChangeType")
        private String changeType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CommitTime")
        private Long commitTime;

        @NameInMap("CommitUser")
        private String commitUser;

        @NameInMap("FileContent")
        private String fileContent;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FilePropertyContent")
        private String filePropertyContent;

        @NameInMap("FileVersion")
        private Integer fileVersion;

        @NameInMap("IsCurrentProd")
        private Boolean isCurrentProd;

        @NameInMap("NodeContent")
        private String nodeContent;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UseType")
        private String useType;

        private FileVersions(Builder builder) {
            this.changeType = builder.changeType;
            this.comment = builder.comment;
            this.commitTime = builder.commitTime;
            this.commitUser = builder.commitUser;
            this.fileContent = builder.fileContent;
            this.fileName = builder.fileName;
            this.filePropertyContent = builder.filePropertyContent;
            this.fileVersion = builder.fileVersion;
            this.isCurrentProd = builder.isCurrentProd;
            this.nodeContent = builder.nodeContent;
            this.nodeId = builder.nodeId;
            this.status = builder.status;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileVersions create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return commitTime
         */
        public Long getCommitTime() {
            return this.commitTime;
        }

        /**
         * @return commitUser
         */
        public String getCommitUser() {
            return this.commitUser;
        }

        /**
         * @return fileContent
         */
        public String getFileContent() {
            return this.fileContent;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePropertyContent
         */
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        /**
         * @return fileVersion
         */
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return isCurrentProd
         */
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        /**
         * @return nodeContent
         */
        public String getNodeContent() {
            return this.nodeContent;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String changeType; 
            private String comment; 
            private Long commitTime; 
            private String commitUser; 
            private String fileContent; 
            private String fileName; 
            private String filePropertyContent; 
            private Integer fileVersion; 
            private Boolean isCurrentProd; 
            private String nodeContent; 
            private Long nodeId; 
            private String status; 
            private String useType; 

            /**
             * The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * The description of the file version.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the file version was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder commitTime(Long commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used to create the file of the current version.
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * The code in the file of the current version.
             */
            public Builder fileContent(String fileContent) {
                this.fileContent = fileContent;
                return this;
            }

            /**
             * The name of the file of the current version.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The basic information about the file of the current version.
             */
            public Builder filePropertyContent(String filePropertyContent) {
                this.filePropertyContent = filePropertyContent;
                return this;
            }

            /**
             * The version of the file.
             */
            public Builder fileVersion(Integer fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * Indicates whether the file version is the same as the latest file version in the production environment.
             */
            public Builder isCurrentProd(Boolean isCurrentProd) {
                this.isCurrentProd = isCurrentProd;
                return this;
            }

            /**
             * The scheduling configurations for the node that corresponds to the file of the current version.
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * The ID of the auto triggered node that corresponds to the file of the current version.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The status of the file of the current version. Valid values: COMMITTING, COMMITTED, CHECK_OK, PACKAGED, DEPLOYING, DEPLOYED, and CANCELLED.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The functional module to which the file belongs. Valid values: NORMAL, MANUAL, MANUAL_BIZ, SKIP, ADHOCQUERY, and COMPONENT. The value SKIP indicates that the node corresponding to the file is run in dry-run mode.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public FileVersions build() {
                return new FileVersions(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("FileVersions")
        private java.util.List < FileVersions> fileVersions;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.fileVersions = builder.fileVersions;
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
         * @return fileVersions
         */
        public java.util.List < FileVersions> getFileVersions() {
            return this.fileVersions;
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
            private java.util.List < FileVersions> fileVersions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The details of the file version.
             */
            public Builder fileVersions(java.util.List < FileVersions> fileVersions) {
                this.fileVersions = fileVersions;
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
