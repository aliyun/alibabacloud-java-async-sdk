// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticatorOpsLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthenticatorOpsLogsResponseBody</p>
 */
public class ListAuthenticatorOpsLogsResponseBody extends TeaModel {
    @NameInMap("AuthenticationLogContent")
    private java.util.List < AuthenticationLogContent> authenticationLogContent;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthenticatorOpsLogsResponseBody(Builder builder) {
        this.authenticationLogContent = builder.authenticationLogContent;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticatorOpsLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return authenticationLogContent
     */
    public java.util.List < AuthenticationLogContent> getAuthenticationLogContent() {
        return this.authenticationLogContent;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AuthenticationLogContent> authenticationLogContent; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * AuthenticationLogContent.
         */
        public Builder authenticationLogContent(java.util.List < AuthenticationLogContent> authenticationLogContent) {
            this.authenticationLogContent = authenticationLogContent;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthenticatorOpsLogsResponseBody build() {
            return new ListAuthenticatorOpsLogsResponseBody(this);
        } 

    } 

    public static class AuthenticationLogContent extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("ApplicationExternalId")
        private String applicationExternalId;

        @NameInMap("ApplicationUuid")
        private String applicationUuid;

        @NameInMap("AuthenticatorName")
        private String authenticatorName;

        @NameInMap("AuthenticatorType")
        private String authenticatorType;

        @NameInMap("AuthenticatorUuid")
        private String authenticatorUuid;

        @NameInMap("ChallengeBase64")
        private String challengeBase64;

        @NameInMap("CredentialId")
        private String credentialId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("LogParams")
        private String logParams;

        @NameInMap("OperationAction")
        private String operationAction;

        @NameInMap("OperationResult")
        private Boolean operationResult;

        @NameInMap("OperationTime")
        private Long operationTime;

        @NameInMap("RawContext")
        private String rawContext;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserAgent")
        private String userAgent;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserSourceIp")
        private String userSourceIp;

        private AuthenticationLogContent(Builder builder) {
            this.aliUid = builder.aliUid;
            this.applicationExternalId = builder.applicationExternalId;
            this.applicationUuid = builder.applicationUuid;
            this.authenticatorName = builder.authenticatorName;
            this.authenticatorType = builder.authenticatorType;
            this.authenticatorUuid = builder.authenticatorUuid;
            this.challengeBase64 = builder.challengeBase64;
            this.credentialId = builder.credentialId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.logParams = builder.logParams;
            this.operationAction = builder.operationAction;
            this.operationResult = builder.operationResult;
            this.operationTime = builder.operationTime;
            this.rawContext = builder.rawContext;
            this.tenantId = builder.tenantId;
            this.userAgent = builder.userAgent;
            this.userId = builder.userId;
            this.userSourceIp = builder.userSourceIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthenticationLogContent create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return applicationExternalId
         */
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        /**
         * @return applicationUuid
         */
        public String getApplicationUuid() {
            return this.applicationUuid;
        }

        /**
         * @return authenticatorName
         */
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        /**
         * @return authenticatorType
         */
        public String getAuthenticatorType() {
            return this.authenticatorType;
        }

        /**
         * @return authenticatorUuid
         */
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        /**
         * @return challengeBase64
         */
        public String getChallengeBase64() {
            return this.challengeBase64;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
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
         * @return logParams
         */
        public String getLogParams() {
            return this.logParams;
        }

        /**
         * @return operationAction
         */
        public String getOperationAction() {
            return this.operationAction;
        }

        /**
         * @return operationResult
         */
        public Boolean getOperationResult() {
            return this.operationResult;
        }

        /**
         * @return operationTime
         */
        public Long getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return rawContext
         */
        public String getRawContext() {
            return this.rawContext;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userAgent
         */
        public String getUserAgent() {
            return this.userAgent;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userSourceIp
         */
        public String getUserSourceIp() {
            return this.userSourceIp;
        }

        public static final class Builder {
            private String aliUid; 
            private String applicationExternalId; 
            private String applicationUuid; 
            private String authenticatorName; 
            private String authenticatorType; 
            private String authenticatorUuid; 
            private String challengeBase64; 
            private String credentialId; 
            private String errorCode; 
            private String errorMessage; 
            private String logParams; 
            private String operationAction; 
            private Boolean operationResult; 
            private Long operationTime; 
            private String rawContext; 
            private String tenantId; 
            private String userAgent; 
            private String userId; 
            private String userSourceIp; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ApplicationExternalId.
             */
            public Builder applicationExternalId(String applicationExternalId) {
                this.applicationExternalId = applicationExternalId;
                return this;
            }

            /**
             * ApplicationUuid.
             */
            public Builder applicationUuid(String applicationUuid) {
                this.applicationUuid = applicationUuid;
                return this;
            }

            /**
             * AuthenticatorName.
             */
            public Builder authenticatorName(String authenticatorName) {
                this.authenticatorName = authenticatorName;
                return this;
            }

            /**
             * AuthenticatorType.
             */
            public Builder authenticatorType(String authenticatorType) {
                this.authenticatorType = authenticatorType;
                return this;
            }

            /**
             * AuthenticatorUuid.
             */
            public Builder authenticatorUuid(String authenticatorUuid) {
                this.authenticatorUuid = authenticatorUuid;
                return this;
            }

            /**
             * ChallengeBase64.
             */
            public Builder challengeBase64(String challengeBase64) {
                this.challengeBase64 = challengeBase64;
                return this;
            }

            /**
             * CredentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
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
             * LogParams.
             */
            public Builder logParams(String logParams) {
                this.logParams = logParams;
                return this;
            }

            /**
             * OperationAction.
             */
            public Builder operationAction(String operationAction) {
                this.operationAction = operationAction;
                return this;
            }

            /**
             * OperationResult.
             */
            public Builder operationResult(Boolean operationResult) {
                this.operationResult = operationResult;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(Long operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * RawContext.
             */
            public Builder rawContext(String rawContext) {
                this.rawContext = rawContext;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserAgent.
             */
            public Builder userAgent(String userAgent) {
                this.userAgent = userAgent;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserSourceIp.
             */
            public Builder userSourceIp(String userSourceIp) {
                this.userSourceIp = userSourceIp;
                return this;
            }

            public AuthenticationLogContent build() {
                return new AuthenticationLogContent(this);
            } 

        } 

    }
}
