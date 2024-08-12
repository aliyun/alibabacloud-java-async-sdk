// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportUserFbIssueRequest} extends {@link RequestModel}
 *
 * <p>ReportUserFbIssueRequest</p>
 */
public class ReportUserFbIssueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientModel")
    private String clientModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientOsName")
    private String clientOsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSn")
    private String clientSn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private String customerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    private Integer desktopType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FbType")
    private Integer fbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileList")
    private java.util.List < FileList> fileList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssueLabel")
    private String issueLabel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OccurTime")
    private Long occurTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedA")
    private String reservedA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedB")
    private String reservedB;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TelNo")
    @com.aliyun.core.annotation.Validation(maxLength = 20)
    private String telNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserEmail")
    private String userEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WyId")
    private String wyId;

    private ReportUserFbIssueRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientId = builder.clientId;
        this.clientModel = builder.clientModel;
        this.clientOsName = builder.clientOsName;
        this.clientSn = builder.clientSn;
        this.clientVersion = builder.clientVersion;
        this.customerId = builder.customerId;
        this.description = builder.description;
        this.desktopId = builder.desktopId;
        this.desktopType = builder.desktopType;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.fbType = builder.fbType;
        this.fileList = builder.fileList;
        this.issueLabel = builder.issueLabel;
        this.occurTime = builder.occurTime;
        this.reservedA = builder.reservedA;
        this.reservedB = builder.reservedB;
        this.telNo = builder.telNo;
        this.title = builder.title;
        this.userEmail = builder.userEmail;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.workspaceId = builder.workspaceId;
        this.wyId = builder.wyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportUserFbIssueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clientOsName
     */
    public String getClientOsName() {
        return this.clientOsName;
    }

    /**
     * @return clientSn
     */
    public String getClientSn() {
        return this.clientSn;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
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
     * @return desktopType
     */
    public Integer getDesktopType() {
        return this.desktopType;
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
     * @return issueLabel
     */
    public String getIssueLabel() {
        return this.issueLabel;
    }

    /**
     * @return occurTime
     */
    public Long getOccurTime() {
        return this.occurTime;
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
     * @return telNo
     */
    public String getTelNo() {
        return this.telNo;
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

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return wyId
     */
    public String getWyId() {
        return this.wyId;
    }

    public static final class Builder extends Request.Builder<ReportUserFbIssueRequest, Builder> {
        private String appId; 
        private String clientId; 
        private String clientModel; 
        private String clientOsName; 
        private String clientSn; 
        private String clientVersion; 
        private String customerId; 
        private String description; 
        private String desktopId; 
        private Integer desktopType; 
        private String errorCode; 
        private String errorMsg; 
        private Integer fbType; 
        private java.util.List < FileList> fileList; 
        private String issueLabel; 
        private Long occurTime; 
        private String reservedA; 
        private String reservedB; 
        private String telNo; 
        private String title; 
        private String userEmail; 
        private String userId; 
        private String userName; 
        private String workspaceId; 
        private String wyId; 

        private Builder() {
            super();
        } 

        private Builder(ReportUserFbIssueRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientId = request.clientId;
            this.clientModel = request.clientModel;
            this.clientOsName = request.clientOsName;
            this.clientSn = request.clientSn;
            this.clientVersion = request.clientVersion;
            this.customerId = request.customerId;
            this.description = request.description;
            this.desktopId = request.desktopId;
            this.desktopType = request.desktopType;
            this.errorCode = request.errorCode;
            this.errorMsg = request.errorMsg;
            this.fbType = request.fbType;
            this.fileList = request.fileList;
            this.issueLabel = request.issueLabel;
            this.occurTime = request.occurTime;
            this.reservedA = request.reservedA;
            this.reservedB = request.reservedB;
            this.telNo = request.telNo;
            this.title = request.title;
            this.userEmail = request.userEmail;
            this.userId = request.userId;
            this.userName = request.userName;
            this.workspaceId = request.workspaceId;
            this.wyId = request.wyId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientModel.
         */
        public Builder clientModel(String clientModel) {
            this.putBodyParameter("ClientModel", clientModel);
            this.clientModel = clientModel;
            return this;
        }

        /**
         * ClientOsName.
         */
        public Builder clientOsName(String clientOsName) {
            this.putBodyParameter("ClientOsName", clientOsName);
            this.clientOsName = clientOsName;
            return this;
        }

        /**
         * ClientSn.
         */
        public Builder clientSn(String clientSn) {
            this.putBodyParameter("ClientSn", clientSn);
            this.clientSn = clientSn;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * CustomerId.
         */
        public Builder customerId(String customerId) {
            this.putBodyParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putBodyParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * DesktopType.
         */
        public Builder desktopType(Integer desktopType) {
            this.putBodyParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putBodyParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.putBodyParameter("ErrorMsg", errorMsg);
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * FbType.
         */
        public Builder fbType(Integer fbType) {
            this.putBodyParameter("FbType", fbType);
            this.fbType = fbType;
            return this;
        }

        /**
         * FileList.
         */
        public Builder fileList(java.util.List < FileList> fileList) {
            String fileListShrink = shrink(fileList, "FileList", "json");
            this.putBodyParameter("FileList", fileListShrink);
            this.fileList = fileList;
            return this;
        }

        /**
         * IssueLabel.
         */
        public Builder issueLabel(String issueLabel) {
            this.putBodyParameter("IssueLabel", issueLabel);
            this.issueLabel = issueLabel;
            return this;
        }

        /**
         * OccurTime.
         */
        public Builder occurTime(Long occurTime) {
            this.putBodyParameter("OccurTime", occurTime);
            this.occurTime = occurTime;
            return this;
        }

        /**
         * ReservedA.
         */
        public Builder reservedA(String reservedA) {
            this.putBodyParameter("ReservedA", reservedA);
            this.reservedA = reservedA;
            return this;
        }

        /**
         * ReservedB.
         */
        public Builder reservedB(String reservedB) {
            this.putBodyParameter("ReservedB", reservedB);
            this.reservedB = reservedB;
            return this;
        }

        /**
         * TelNo.
         */
        public Builder telNo(String telNo) {
            this.putBodyParameter("TelNo", telNo);
            this.telNo = telNo;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserEmail.
         */
        public Builder userEmail(String userEmail) {
            this.putBodyParameter("UserEmail", userEmail);
            this.userEmail = userEmail;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WyId.
         */
        public Builder wyId(String wyId) {
            this.putBodyParameter("WyId", wyId);
            this.wyId = wyId;
            return this;
        }

        @Override
        public ReportUserFbIssueRequest build() {
            return new ReportUserFbIssueRequest(this);
        } 

    } 

    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private FileList(Builder builder) {
            this.fileMd5 = builder.fileMd5;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.ossUrl = builder.ossUrl;
            this.sessionId = builder.sessionId;
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

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String fileMd5; 
            private String fileName; 
            private Integer fileSize; 
            private Integer fileType; 
            private String ossUrl; 
            private String sessionId; 

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
}
