// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserFbIssuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserFbIssuesResponseBody</p>
 */
public class ListUserFbIssuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListUserFbIssuesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserFbIssuesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserFbIssuesResponseBody build() {
            return new ListUserFbIssuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserFbIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserFbIssuesResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        private FileList(Builder builder) {
            this.fileMd5 = builder.fileMd5;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.ossUrl = builder.ossUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileMd5
         */
        public String getFileMd5() {
            return this.fileMd5;
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
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        public static final class Builder {
            private String fileMd5; 
            private String fileName; 
            private Integer fileSize; 
            private Integer fileType; 
            private String ossUrl; 

            /**
             * FileMd5.
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
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
             * OssUrl.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserFbIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserFbIssuesResponseBody</p>
     */
    public static class FeedbackIssueData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientModel")
        private String clientModel;

        @com.aliyun.core.annotation.NameInMap("ClientSn")
        private String clientSn;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FbType")
        private Integer fbType;

        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List < FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("IssueId")
        private Integer issueId;

        @com.aliyun.core.annotation.NameInMap("IssueLabel")
        private String issueLabel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserEmail")
        private String userEmail;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private FeedbackIssueData(Builder builder) {
            this.appId = builder.appId;
            this.clientId = builder.clientId;
            this.clientModel = builder.clientModel;
            this.clientSn = builder.clientSn;
            this.customerId = builder.customerId;
            this.description = builder.description;
            this.desktopId = builder.desktopId;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.fbType = builder.fbType;
            this.fileList = builder.fileList;
            this.gmtCreated = builder.gmtCreated;
            this.issueId = builder.issueId;
            this.issueLabel = builder.issueLabel;
            this.status = builder.status;
            this.title = builder.title;
            this.userEmail = builder.userEmail;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeedbackIssueData create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientModel
         */
        public String getClientModel() {
            return this.clientModel;
        }

        /**
         * @return clientSn
         */
        public String getClientSn() {
            return this.clientSn;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return fbType
         */
        public Integer getFbType() {
            return this.fbType;
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
         * @return issueId
         */
        public Integer getIssueId() {
            return this.issueId;
        }

        /**
         * @return issueLabel
         */
        public String getIssueLabel() {
            return this.issueLabel;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userEmail
         */
        public String getUserEmail() {
            return this.userEmail;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String clientId; 
            private String clientModel; 
            private String clientSn; 
            private String customerId; 
            private String description; 
            private String desktopId; 
            private String errorCode; 
            private String errorMsg; 
            private Integer fbType; 
            private java.util.List < FileList> fileList; 
            private String gmtCreated; 
            private Integer issueId; 
            private String issueLabel; 
            private Integer status; 
            private String title; 
            private String userEmail; 
            private String userId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientModel.
             */
            public Builder clientModel(String clientModel) {
                this.clientModel = clientModel;
                return this;
            }

            /**
             * ClientSn.
             */
            public Builder clientSn(String clientSn) {
                this.clientSn = clientSn;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * FbType.
             */
            public Builder fbType(Integer fbType) {
                this.fbType = fbType;
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
             * IssueId.
             */
            public Builder issueId(Integer issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * IssueLabel.
             */
            public Builder issueLabel(String issueLabel) {
                this.issueLabel = issueLabel;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserEmail.
             */
            public Builder userEmail(String userEmail) {
                this.userEmail = userEmail;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FeedbackIssueData build() {
                return new FeedbackIssueData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserFbIssuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserFbIssuesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("FeedbackIssueData")
        private java.util.List < FeedbackIssueData> feedbackIssueData;

        private Data(Builder builder) {
            this.count = builder.count;
            this.feedbackIssueData = builder.feedbackIssueData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return feedbackIssueData
         */
        public java.util.List < FeedbackIssueData> getFeedbackIssueData() {
            return this.feedbackIssueData;
        }

        public static final class Builder {
            private String count; 
            private java.util.List < FeedbackIssueData> feedbackIssueData; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * FeedbackIssueData.
             */
            public Builder feedbackIssueData(java.util.List < FeedbackIssueData> feedbackIssueData) {
                this.feedbackIssueData = feedbackIssueData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
