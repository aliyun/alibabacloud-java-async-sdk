// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserFbIssuesRequest} extends {@link RequestModel}
 *
 * <p>ListUserFbIssuesRequest</p>
 */
public class ListUserFbIssuesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientSn")
    private String clientSn;

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
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FbType")
    private Integer fbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssueId")
    private Integer issueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssueLabel")
    private String issueLabel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

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
    @com.aliyun.core.annotation.NameInMap("WasRead")
    private Integer wasRead;

    private ListUserFbIssuesRequest(Builder builder) {
        super(builder);
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
        this.issueId = builder.issueId;
        this.issueLabel = builder.issueLabel;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.title = builder.title;
        this.userEmail = builder.userEmail;
        this.userId = builder.userId;
        this.wasRead = builder.wasRead;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserFbIssuesRequest create() {
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

    /**
     * @return wasRead
     */
    public Integer getWasRead() {
        return this.wasRead;
    }

    public static final class Builder extends Request.Builder<ListUserFbIssuesRequest, Builder> {
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
        private Integer issueId; 
        private String issueLabel; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer status; 
        private String title; 
        private String userEmail; 
        private String userId; 
        private Integer wasRead; 

        private Builder() {
            super();
        } 

        private Builder(ListUserFbIssuesRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientId = request.clientId;
            this.clientModel = request.clientModel;
            this.clientSn = request.clientSn;
            this.customerId = request.customerId;
            this.description = request.description;
            this.desktopId = request.desktopId;
            this.errorCode = request.errorCode;
            this.errorMsg = request.errorMsg;
            this.fbType = request.fbType;
            this.issueId = request.issueId;
            this.issueLabel = request.issueLabel;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.title = request.title;
            this.userEmail = request.userEmail;
            this.userId = request.userId;
            this.wasRead = request.wasRead;
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
         * ClientSn.
         */
        public Builder clientSn(String clientSn) {
            this.putBodyParameter("ClientSn", clientSn);
            this.clientSn = clientSn;
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
         * IssueId.
         */
        public Builder issueId(Integer issueId) {
            this.putBodyParameter("IssueId", issueId);
            this.issueId = issueId;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
         * WasRead.
         */
        public Builder wasRead(Integer wasRead) {
            this.putBodyParameter("WasRead", wasRead);
            this.wasRead = wasRead;
            return this;
        }

        @Override
        public ListUserFbIssuesRequest build() {
            return new ListUserFbIssuesRequest(this);
        } 

    } 

}
