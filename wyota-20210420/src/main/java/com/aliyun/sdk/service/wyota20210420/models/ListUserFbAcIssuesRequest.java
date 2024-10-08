// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserFbAcIssuesRequest} extends {@link RequestModel}
 *
 * <p>ListUserFbAcIssuesRequest</p>
 */
public class ListUserFbAcIssuesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssueId")
    private String issueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedA")
    private String reservedA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedB")
    private String reservedB;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserEmail")
    private String userEmail;

    private ListUserFbAcIssuesRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.clientVersion = builder.clientVersion;
        this.errorMessage = builder.errorMessage;
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

    public static ListUserFbAcIssuesRequest create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public String getIssueId() {
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

    public static final class Builder extends Request.Builder<ListUserFbAcIssuesRequest, Builder> {
        private String account; 
        private String clientVersion; 
        private String errorMessage; 
        private String instanceId; 
        private String issueId; 
        private String label; 
        private String reservedA; 
        private String reservedB; 
        private String userEmail; 

        private Builder() {
            super();
        } 

        private Builder(ListUserFbAcIssuesRequest request) {
            super(request);
            this.account = request.account;
            this.clientVersion = request.clientVersion;
            this.errorMessage = request.errorMessage;
            this.instanceId = request.instanceId;
            this.issueId = request.issueId;
            this.label = request.label;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.putBodyParameter("ErrorMessage", errorMessage);
            this.errorMessage = errorMessage;
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
         * IssueId.
         */
        public Builder issueId(String issueId) {
            this.putBodyParameter("IssueId", issueId);
            this.issueId = issueId;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
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
        public ListUserFbAcIssuesRequest build() {
            return new ListUserFbAcIssuesRequest(this);
        } 

    } 

}
