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
 * {@link ListFileVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileVersionsResponseBody</p>
 */
public class ListFileVersionsResponseBody extends TeaModel {
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
         * <p>The file versions returned.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFileVersionsResponseBody build() {
            return new ListFileVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileVersionsResponseBody</p>
     */
    public static class FileVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CommitTime")
        private Long commitTime;

        @com.aliyun.core.annotation.NameInMap("CommitUser")
        private String commitUser;

        @com.aliyun.core.annotation.NameInMap("FileContent")
        private String fileContent;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePropertyContent")
        private String filePropertyContent;

        @com.aliyun.core.annotation.NameInMap("FileVersion")
        private Integer fileVersion;

        @com.aliyun.core.annotation.NameInMap("IsCurrentProd")
        private Boolean isCurrentProd;

        @com.aliyun.core.annotation.NameInMap("NodeContent")
        private String nodeContent;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UseType")
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
             * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The description of the file version.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the file version was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1593881265000</p>
             */
            public Builder commitTime(Long commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used to create the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>73842342****</p>
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * <p>The code in the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder fileContent(String fileContent) {
                this.fileContent = fileContent;
                return this;
            }

            /**
             * <p>The name of the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The basic information about the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fileName&quot;:&quot;ods_user_info_d&quot;,&quot;fileType&quot;:10}</p>
             */
            public Builder filePropertyContent(String filePropertyContent) {
                this.filePropertyContent = filePropertyContent;
                return this;
            }

            /**
             * <p>The version of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder fileVersion(Integer fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>Indicates whether the file version is the same as the latest file version in the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCurrentProd(Boolean isCurrentProd) {
                this.isCurrentProd = isCurrentProd;
                return this;
            }

            /**
             * <p>The scheduling configurations for the node that corresponds to the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cycleType&quot;:0,&quot;cronExpress&quot;:&quot;00 05 00 * * ?&quot;}</p>
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * <p>The ID of the auto triggered node that corresponds to the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The status of the file of the current version. Valid values: COMMITTING, COMMITTED, CHECK_OK, PACKAGED, DEPLOYING, DEPLOYED, and CANCELLED.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMITTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The functional module to which the file belongs. Valid values: NORMAL, MANUAL, MANUAL_BIZ, SKIP, ADHOCQUERY, and COMPONENT. The value SKIP indicates that the node corresponding to the file is run in dry-run mode.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
    /**
     * 
     * {@link ListFileVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileVersions")
        private java.util.List<FileVersions> fileVersions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<FileVersions> getFileVersions() {
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
            private java.util.List<FileVersions> fileVersions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The details of the file version.</p>
             */
            public Builder fileVersions(java.util.List<FileVersions> fileVersions) {
                this.fileVersions = fileVersions;
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
