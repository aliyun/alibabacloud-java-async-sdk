// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReportUserFbAcIssueRequest} extends {@link RequestModel}
 *
 * <p>ReportUserFbAcIssueRequest</p>
 */
public class ReportUserFbAcIssueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileList")
    private java.util.List < FileList> fileList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedA")
    private String reservedA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedB")
    private String reservedB;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserEmail")
    private String userEmail;

    private ReportUserFbAcIssueRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.clientVersion = builder.clientVersion;
        this.errorMsg = builder.errorMsg;
        this.fileList = builder.fileList;
        this.instanceId = builder.instanceId;
        this.labels = builder.labels;
        this.reservedA = builder.reservedA;
        this.reservedB = builder.reservedB;
        this.userEmail = builder.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportUserFbAcIssueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return fileList
     */
    public java.util.List < FileList> getFileList() {
        return this.fileList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
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

    public static final class Builder extends Request.Builder<ReportUserFbAcIssueRequest, Builder> {
        private String account; 
        private String clientVersion; 
        private String errorMsg; 
        private java.util.List < FileList> fileList; 
        private String instanceId; 
        private String labels; 
        private String reservedA; 
        private String reservedB; 
        private String userEmail; 

        private Builder() {
            super();
        } 

        private Builder(ReportUserFbAcIssueRequest request) {
            super(request);
            this.account = request.account;
            this.clientVersion = request.clientVersion;
            this.errorMsg = request.errorMsg;
            this.fileList = request.fileList;
            this.instanceId = request.instanceId;
            this.labels = request.labels;
            this.reservedA = request.reservedA;
            this.reservedB = request.reservedB;
            this.userEmail = request.userEmail;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putBodyParameter("Account", account);
            this.account = account;
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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.putBodyParameter("ErrorMsg", errorMsg);
            this.errorMsg = errorMsg;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
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
         * UserEmail.
         */
        public Builder userEmail(String userEmail) {
            this.putBodyParameter("UserEmail", userEmail);
            this.userEmail = userEmail;
            return this;
        }

        @Override
        public ReportUserFbAcIssueRequest build() {
            return new ReportUserFbAcIssueRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReportUserFbAcIssueRequest} extends {@link TeaModel}
     *
     * <p>ReportUserFbAcIssueRequest</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        @com.aliyun.core.annotation.Validation(required = true)
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
}
