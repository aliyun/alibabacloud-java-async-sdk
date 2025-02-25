// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthenticationLogsResponseBody</p>
 */
public class ListAuthenticationLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthenticationLogContent")
    private java.util.List < AuthenticationLogContent> authenticationLogContent;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthenticationLogsResponseBody(Builder builder) {
        this.authenticationLogContent = builder.authenticationLogContent;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticationLogsResponseBody create() {
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

        public ListAuthenticationLogsResponseBody build() {
            return new ListAuthenticationLogsResponseBody(this);
        } 

    } 

    public static class AuthenticationLogContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
        private String applicationExternalId;

        @com.aliyun.core.annotation.NameInMap("ApplicationUuid")
        private String applicationUuid;

        @com.aliyun.core.annotation.NameInMap("AuthenticationAction")
        private String authenticationAction;

        @com.aliyun.core.annotation.NameInMap("AuthenticationTime")
        private Long authenticationTime;

        @com.aliyun.core.annotation.NameInMap("AuthenticatorName")
        private String authenticatorName;

        @com.aliyun.core.annotation.NameInMap("AuthenticatorType")
        private String authenticatorType;

        @com.aliyun.core.annotation.NameInMap("AuthenticatorUuid")
        private String authenticatorUuid;

        @com.aliyun.core.annotation.NameInMap("ChallengeBase64")
        private String challengeBase64;

        @com.aliyun.core.annotation.NameInMap("CredentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("LogParams")
        private String logParams;

        @com.aliyun.core.annotation.NameInMap("LogTag")
        private String logTag;

        @com.aliyun.core.annotation.NameInMap("RawAuthenticationContext")
        private String rawAuthenticationContext;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserAgent")
        private String userAgent;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserSourceIp")
        private String userSourceIp;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private Boolean verifyResult;

        private AuthenticationLogContent(Builder builder) {
            this.aliUid = builder.aliUid;
            this.applicationExternalId = builder.applicationExternalId;
            this.applicationUuid = builder.applicationUuid;
            this.authenticationAction = builder.authenticationAction;
            this.authenticationTime = builder.authenticationTime;
            this.authenticatorName = builder.authenticatorName;
            this.authenticatorType = builder.authenticatorType;
            this.authenticatorUuid = builder.authenticatorUuid;
            this.challengeBase64 = builder.challengeBase64;
            this.credentialId = builder.credentialId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.logParams = builder.logParams;
            this.logTag = builder.logTag;
            this.rawAuthenticationContext = builder.rawAuthenticationContext;
            this.tenantId = builder.tenantId;
            this.userAgent = builder.userAgent;
            this.userId = builder.userId;
            this.userSourceIp = builder.userSourceIp;
            this.verifyResult = builder.verifyResult;
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
         * @return authenticationAction
         */
        public String getAuthenticationAction() {
            return this.authenticationAction;
        }

        /**
         * @return authenticationTime
         */
        public Long getAuthenticationTime() {
            return this.authenticationTime;
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
         * @return logTag
         */
        public String getLogTag() {
            return this.logTag;
        }

        /**
         * @return rawAuthenticationContext
         */
        public String getRawAuthenticationContext() {
            return this.rawAuthenticationContext;
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

        /**
         * @return verifyResult
         */
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String aliUid; 
            private String applicationExternalId; 
            private String applicationUuid; 
            private String authenticationAction; 
            private Long authenticationTime; 
            private String authenticatorName; 
            private String authenticatorType; 
            private String authenticatorUuid; 
            private String challengeBase64; 
            private String credentialId; 
            private String errorCode; 
            private String errorMessage; 
            private String logParams; 
            private String logTag; 
            private String rawAuthenticationContext; 
            private String tenantId; 
            private String userAgent; 
            private String userId; 
            private String userSourceIp; 
            private Boolean verifyResult; 

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
             * AuthenticationAction.
             */
            public Builder authenticationAction(String authenticationAction) {
                this.authenticationAction = authenticationAction;
                return this;
            }

            /**
             * AuthenticationTime.
             */
            public Builder authenticationTime(Long authenticationTime) {
                this.authenticationTime = authenticationTime;
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
             * LogTag.
             */
            public Builder logTag(String logTag) {
                this.logTag = logTag;
                return this;
            }

            /**
             * RawAuthenticationContext.
             */
            public Builder rawAuthenticationContext(String rawAuthenticationContext) {
                this.rawAuthenticationContext = rawAuthenticationContext;
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

            /**
             * VerifyResult.
             */
            public Builder verifyResult(Boolean verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public AuthenticationLogContent build() {
                return new AuthenticationLogContent(this);
            } 

        } 

    }
}
