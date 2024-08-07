// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginTokenResponseBody</p>
 */
public class GetLoginTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.NameInMap("Industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("KeepAliveToken")
    private String keepAliveToken;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.NameInMap("NextStage")
    private String nextStage;

    @com.aliyun.core.annotation.NameInMap("PasswordStrategy")
    private PasswordStrategy passwordStrategy;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("Props")
    private java.util.Map < String, String > props;

    @com.aliyun.core.annotation.NameInMap("QrCodePng")
    private String qrCodePng;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskVerifyInfo")
    private RiskVerifyInfo riskVerifyInfo;

    @com.aliyun.core.annotation.NameInMap("Secret")
    private String secret;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("WindowDisplayMode")
    private String windowDisplayMode;

    private GetLoginTokenResponseBody(Builder builder) {
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.industry = builder.industry;
        this.keepAliveToken = builder.keepAliveToken;
        this.label = builder.label;
        this.loginToken = builder.loginToken;
        this.nextStage = builder.nextStage;
        this.passwordStrategy = builder.passwordStrategy;
        this.phone = builder.phone;
        this.props = builder.props;
        this.qrCodePng = builder.qrCodePng;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.riskVerifyInfo = builder.riskVerifyInfo;
        this.secret = builder.secret;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.windowDisplayMode = builder.windowDisplayMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return keepAliveToken
     */
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return nextStage
     */
    public String getNextStage() {
        return this.nextStage;
    }

    /**
     * @return passwordStrategy
     */
    public PasswordStrategy getPasswordStrategy() {
        return this.passwordStrategy;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return props
     */
    public java.util.Map < String, String > getProps() {
        return this.props;
    }

    /**
     * @return qrCodePng
     */
    public String getQrCodePng() {
        return this.qrCodePng;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskVerifyInfo
     */
    public RiskVerifyInfo getRiskVerifyInfo() {
        return this.riskVerifyInfo;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return windowDisplayMode
     */
    public String getWindowDisplayMode() {
        return this.windowDisplayMode;
    }

    public static final class Builder {
        private String email; 
        private String endUserId; 
        private String industry; 
        private String keepAliveToken; 
        private String label; 
        private String loginToken; 
        private String nextStage; 
        private PasswordStrategy passwordStrategy; 
        private String phone; 
        private java.util.Map < String, String > props; 
        private String qrCodePng; 
        private String reason; 
        private String requestId; 
        private RiskVerifyInfo riskVerifyInfo; 
        private String secret; 
        private String sessionId; 
        private Long tenantId; 
        private String windowDisplayMode; 

        /**
         * The email address of the user. The system returns the email address in the return value of the LoginToken parameter after the user logs on to the client.
         * <p>
         * 
         * *   For a convenience user, the return value is the email address specified when the administrator creates the convenience user.
         * *   For an AD user, the return value is in the following format: `Username@Name of the AD domain`.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * The account of the convenience user or the AD user.
         */
        public Builder endUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }

        /**
         * > This is a parameter only for internal use.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * The token used to keep the user logged on. After the user logs on to the client and select the Keep Logon option, `KeepAliveToken` is returned when you call the operation. If the user does not select the Keep Logon option, null is returned.
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * The attribute of the convenience user. For an AD user, null is returned.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * The logon token.
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * The next stage that is expected to enter. For example, if the administrator enables MFA authentication in the EDS console, `MFAVerify` is returned after the username and password pass the authentication (after you set CurrentStage to `ADPassword` stage). This indicates that the MFA authentication is required.
         * <p>
         * 
         * > For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.
         */
        public Builder nextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }

        /**
         * PasswordStrategy.
         */
        public Builder passwordStrategy(PasswordStrategy passwordStrategy) {
            this.passwordStrategy = passwordStrategy;
            return this;
        }

        /**
         * Enter the mobile number of the convenience user. For an AD user, null is returned.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * > This is a parameter only for internal use.
         */
        public Builder props(java.util.Map < String, String > props) {
            this.props = props;
            return this;
        }

        /**
         * The QR code that is generated when the virtual MFA device is bound. The value is encoded in Base64. This parameter can be empty. This parameter is required only when the CurrentStage parameter is set to `MFABind`.
         * <p>
         * 
         * > For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.
         */
        public Builder qrCodePng(String qrCodePng) {
            this.qrCodePng = qrCodePng;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * RiskVerifyInfo.
         */
        public Builder riskVerifyInfo(RiskVerifyInfo riskVerifyInfo) {
            this.riskVerifyInfo = riskVerifyInfo;
            return this;
        }

        /**
         * The key that is generated when you bind the virtual MFA device. This parameter is required when the CurrentStage parameter is set to `MFABind`.
         * <p>
         * 
         * > For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * The ID of the session. The ID is returned the first time you call the `GetLoginToken` operation in the session. If MFA is required, you must specify this parameter in subsequent stages.
         * <p>
         * 
         * > For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. The ID is used for hardware client authentication.
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * > This is a parameter only for internal use.
         */
        public Builder windowDisplayMode(String windowDisplayMode) {
            this.windowDisplayMode = windowDisplayMode;
            return this;
        }

        public GetLoginTokenResponseBody build() {
            return new GetLoginTokenResponseBody(this);
        } 

    } 

    public static class PasswordStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantAlternativeChars")
        private java.util.List < String > tenantAlternativeChars;

        @com.aliyun.core.annotation.NameInMap("TenantPasswordLength")
        private String tenantPasswordLength;

        private PasswordStrategy(Builder builder) {
            this.tenantAlternativeChars = builder.tenantAlternativeChars;
            this.tenantPasswordLength = builder.tenantPasswordLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordStrategy create() {
            return builder().build();
        }

        /**
         * @return tenantAlternativeChars
         */
        public java.util.List < String > getTenantAlternativeChars() {
            return this.tenantAlternativeChars;
        }

        /**
         * @return tenantPasswordLength
         */
        public String getTenantPasswordLength() {
            return this.tenantPasswordLength;
        }

        public static final class Builder {
            private java.util.List < String > tenantAlternativeChars; 
            private String tenantPasswordLength; 

            /**
             * TenantAlternativeChars.
             */
            public Builder tenantAlternativeChars(java.util.List < String > tenantAlternativeChars) {
                this.tenantAlternativeChars = tenantAlternativeChars;
                return this;
            }

            /**
             * TenantPasswordLength.
             */
            public Builder tenantPasswordLength(String tenantPasswordLength) {
                this.tenantPasswordLength = tenantPasswordLength;
                return this;
            }

            public PasswordStrategy build() {
                return new PasswordStrategy(this);
            } 

        } 

    }
    public static class RiskVerifyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LastLockDuration")
        private Long lastLockDuration;

        @com.aliyun.core.annotation.NameInMap("Locked")
        private String locked;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private RiskVerifyInfo(Builder builder) {
            this.email = builder.email;
            this.lastLockDuration = builder.lastLockDuration;
            this.locked = builder.locked;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskVerifyInfo create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return lastLockDuration
         */
        public Long getLastLockDuration() {
            return this.lastLockDuration;
        }

        /**
         * @return locked
         */
        public String getLocked() {
            return this.locked;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private Long lastLockDuration; 
            private String locked; 
            private String phone; 

            /**
             * The email address of the user. The system returns the email address in the return value of the LoginToken parameter after the user logs on to the client.
             * <p>
             * 
             * *   For a convenience user, the return value is the email address specified when the administrator creates the convenience user.
             * *   For an AD user, the return value is in the following format: `Username@Name of the AD domain`.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LastLockDuration.
             */
            public Builder lastLockDuration(Long lastLockDuration) {
                this.lastLockDuration = lastLockDuration;
                return this;
            }

            /**
             * Locked.
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * Enter the mobile number of the convenience user. For an AD user, null is returned.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public RiskVerifyInfo build() {
                return new RiskVerifyInfo(this);
            } 

        } 

    }
}
