// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The email address of the user. The system returns the email address in the return value of the LoginToken parameter after the user logs on to the client.</p>
         * <ul>
         * <li>For a convenience user, the return value is the email address specified when the administrator creates the convenience user.</li>
         * <li>For an AD user, the return value is in the following format: <code>Username@Name of the AD domain</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>The account of the convenience user or the AD user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This is a parameter only for internal use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>edu</p>
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * <p>The token used to keep the user logged on. After the user logs on to the client and select the Keep Logon option, <code>KeepAliveToken</code> is returned when you call the operation. If the user does not select the Keep Logon option, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>006YwvYMsesWWsDBZnVB+Wq9AvJDVIqOY3YCktvtb7+KxMb3ClnNlV8+l/knhZYrXUmeP06IzkjF+IgcZ3vZKOyMprDyFHjCy1r27FRE/U7+geWCl8iQ+yF8GaCRHfJEkC2+ROs93HkT4tfHxyY1J8W7O7ZQGUC/cdCvm+cCP6FIy73IUuPuVR6PcKYXIpEZPW</p>
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * <p>The attribute of the convenience user. For an AD user, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test:sample</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * 
         * <strong>example:</strong>
         * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The next stage that is expected to enter. For example, an administrator enables MFA in the EDS console. When an end user enters the password, that is, the end user completes the <code>ADPassword</code> stage, this parameter returns <code>MFAVerify</code>. This indicates that MFA is required.</p>
         * <blockquote>
         * <p> For more information about the authentication stages, see the <code>CurrentStage</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MFAVerify</p>
         */
        public Builder nextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }

        /**
         * <blockquote>
         * <p>This is a parameter only for internal use.</p>
         * </blockquote>
         */
        public Builder passwordStrategy(PasswordStrategy passwordStrategy) {
            this.passwordStrategy = passwordStrategy;
            return this;
        }

        /**
         * <p>Enter the mobile number of the convenience user. For an AD user, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * <blockquote>
         * <p>This is a parameter only for internal use.</p>
         * </blockquote>
         */
        public Builder props(java.util.Map < String, String > props) {
            this.props = props;
            return this;
        }

        /**
         * <p>The QR code that is generated when the virtual MFA device is bound. The value is encoded in Base64. This parameter can be empty. This parameter is required only when the CurrentStage parameter is set to <code>MFABind</code>.</p>
         * <blockquote>
         * <p>For more information about each authentication stage, see the parameter description of the request parameter <code>CurrentStage</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5OCLLKKOJU5HPBX66H3QCTWY******</p>
         */
        public Builder qrCodePng(String qrCodePng) {
            this.qrCodePng = qrCodePng;
            return this;
        }

        /**
         * <blockquote>
         * <p>This is a parameter only for internal use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Risk identification information regarding the signin process.</p>
         */
        public Builder riskVerifyInfo(RiskVerifyInfo riskVerifyInfo) {
            this.riskVerifyInfo = riskVerifyInfo;
            return this;
        }

        /**
         * <p>The key that is generated when you bind the virtual MFA device. This parameter is required when the CurrentStage parameter is set to <code>MFABind</code>.</p>
         * <blockquote>
         * <p>For more information about each authentication stage, see the parameter description of the request parameter <code>CurrentStage</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5OCLLKKOJU5HPBX66H3QCTWYI7MH****</p>
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * <p>The ID of the session. The ID is returned the first time you call the <code>GetLoginToken</code> operation in the session. If MFA is required, you must specify this parameter in subsequent stages.</p>
         * <blockquote>
         * <p>For more information about each authentication stage, see the parameter description of the request parameter <code>CurrentStage</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d6ec166d-ab93-4286-bf7f-a18bb929****</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. The ID is used for hardware client authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>166353906220****</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This is a parameter only for internal use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mode</p>
         */
        public Builder windowDisplayMode(String windowDisplayMode) {
            this.windowDisplayMode = windowDisplayMode;
            return this;
        }

        public GetLoginTokenResponseBody build() {
            return new GetLoginTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
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
             * <blockquote>
             * <p>This is a parameter only for internal use.</p>
             * </blockquote>
             */
            public Builder tenantAlternativeChars(java.util.List < String > tenantAlternativeChars) {
                this.tenantAlternativeChars = tenantAlternativeChars;
                return this;
            }

            /**
             * <blockquote>
             * <p>This is a parameter only for internal use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
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
             * <p>The email used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@example.com">user@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The duration of the lock.</p>
             * 
             * <strong>example:</strong>
             * <p>1713749778</p>
             */
            public Builder lastLockDuration(Long lastLockDuration) {
                this.lastLockDuration = lastLockDuration;
                return this;
            }

            /**
             * <p>Whether the account is locked or not.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The mobile number used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>1388888****</p>
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
