// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginTokenResponseBody</p>
 */
public class GetLoginTokenResponseBody extends TeaModel {
    @NameInMap("Email")
    private String email;

    @NameInMap("EndUserId")
    private String endUserId;

    @NameInMap("Industry")
    private String industry;

    @NameInMap("KeepAliveToken")
    private String keepAliveToken;

    @NameInMap("Label")
    private String label;

    @NameInMap("LoginToken")
    private String loginToken;

    @NameInMap("NextStage")
    private String nextStage;

    @NameInMap("Phone")
    private String phone;

    @NameInMap("Props")
    private java.util.Map < String, String > props;

    @NameInMap("QrCodePng")
    private String qrCodePng;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskVerifyInfo")
    private RiskVerifyInfo riskVerifyInfo;

    @NameInMap("Secret")
    private String secret;

    @NameInMap("SessionId")
    private String sessionId;

    @NameInMap("TenantId")
    private Long tenantId;

    @NameInMap("WindowDisplayMode")
    private String windowDisplayMode;

    private GetLoginTokenResponseBody(Builder builder) {
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.industry = builder.industry;
        this.keepAliveToken = builder.keepAliveToken;
        this.label = builder.label;
        this.loginToken = builder.loginToken;
        this.nextStage = builder.nextStage;
        this.phone = builder.phone;
        this.props = builder.props;
        this.qrCodePng = builder.qrCodePng;
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
        private String phone; 
        private java.util.Map < String, String > props; 
        private String qrCodePng; 
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

    public static class RiskVerifyInfo extends TeaModel {
        @NameInMap("Email")
        private String email;

        @NameInMap("LastLockDuration")
        private Long lastLockDuration;

        @NameInMap("Locked")
        private String locked;

        @NameInMap("Phone")
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
