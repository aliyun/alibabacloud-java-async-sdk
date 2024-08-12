// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserFbAcIssuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserFbAcIssuesResponseBody</p>
 */
public class ListUserFbAcIssuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserFbAcIssuesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserFbAcIssuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserFbAcIssuesResponseBody build() {
            return new ListUserFbAcIssuesResponseBody(this);
        } 

    } 

    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private FileList(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String fileName; 
            private Integer fileSize; 
            private Integer fileType; 
            private String sessionId; 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
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
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    public static class IssueDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List < FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IssueId")
        private Long issueId;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("ReservedA")
        private String reservedA;

        @com.aliyun.core.annotation.NameInMap("ReservedB")
        private String reservedB;

        @com.aliyun.core.annotation.NameInMap("UserEmail")
        private String userEmail;

        private IssueDataList(Builder builder) {
            this.account = builder.account;
            this.clientVersion = builder.clientVersion;
            this.errorMessage = builder.errorMessage;
            this.fileList = builder.fileList;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.issueId = builder.issueId;
            this.label = builder.label;
            this.reservedA = builder.reservedA;
            this.reservedB = builder.reservedB;
            this.userEmail = builder.userEmail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IssueDataList create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileList
         */
        public java.util.List < FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issueId
         */
        public Long getIssueId() {
            return this.issueId;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return reservedA
         */
        public String getReservedA() {
            return this.reservedA;
        }

        /**
         * @return reservedB
         */
        public String getReservedB() {
            return this.reservedB;
        }

        /**
         * @return userEmail
         */
        public String getUserEmail() {
            return this.userEmail;
        }

        public static final class Builder {
            private String account; 
            private String clientVersion; 
            private String errorMessage; 
            private java.util.List < FileList> fileList; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instanceId; 
            private Long issueId; 
            private String label; 
            private String reservedA; 
            private String reservedB; 
            private String userEmail; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
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
             * FileList.
             */
            public Builder fileList(java.util.List < FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IssueId.
             */
            public Builder issueId(Long issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * ReservedA.
             */
            public Builder reservedA(String reservedA) {
                this.reservedA = reservedA;
                return this;
            }

            /**
             * ReservedB.
             */
            public Builder reservedB(String reservedB) {
                this.reservedB = reservedB;
                return this;
            }

            /**
             * UserEmail.
             */
            public Builder userEmail(String userEmail) {
                this.userEmail = userEmail;
                return this;
            }

            public IssueDataList build() {
                return new IssueDataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssueDataList")
        private java.util.List < IssueDataList> issueDataList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.issueDataList = builder.issueDataList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return issueDataList
         */
        public java.util.List < IssueDataList> getIssueDataList() {
            return this.issueDataList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < IssueDataList> issueDataList; 
            private Long totalCount; 

            /**
             * IssueDataList.
             */
            public Builder issueDataList(java.util.List < IssueDataList> issueDataList) {
                this.issueDataList = issueDataList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
