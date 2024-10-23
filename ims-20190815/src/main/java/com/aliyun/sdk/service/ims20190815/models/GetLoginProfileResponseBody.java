// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLoginProfileResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginProfileResponseBody</p>
 */
public class GetLoginProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginProfile")
    private LoginProfile loginProfile;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLoginProfileResponseBody(Builder builder) {
        this.loginProfile = builder.loginProfile;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return loginProfile
     */
    public LoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LoginProfile loginProfile; 
        private String requestId; 

        /**
         * <p>The logon information.</p>
         */
        public Builder loginProfile(LoginProfile loginProfile) {
            this.loginProfile = loginProfile;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E517F18B-632C-48FC-93F1-CDCBCC6F8444</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginProfileResponseBody build() {
            return new GetLoginProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginProfileResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginProfileResponseBody</p>
     */
    public static class LoginProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastLoginTime")
        private String lastLoginTime;

        @com.aliyun.core.annotation.NameInMap("MFABindRequired")
        private Boolean MFABindRequired;

        @com.aliyun.core.annotation.NameInMap("PasswordResetRequired")
        private Boolean passwordResetRequired;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private LoginProfile(Builder builder) {
            this.lastLoginTime = builder.lastLoginTime;
            this.MFABindRequired = builder.MFABindRequired;
            this.passwordResetRequired = builder.passwordResetRequired;
            this.status = builder.status;
            this.updateDate = builder.updateDate;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginProfile create() {
            return builder().build();
        }

        /**
         * @return lastLoginTime
         */
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        /**
         * @return MFABindRequired
         */
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        /**
         * @return passwordResetRequired
         */
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String lastLoginTime; 
            private Boolean MFABindRequired; 
            private Boolean passwordResetRequired; 
            private String status; 
            private String updateDate; 
            private String userPrincipalName; 

            /**
             * <p>The last time when the RAM user logged on to the console.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T07:25:25Z</p>
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * <p>Indicates whether multi-factor authentication (MFA) must be enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder MFABindRequired(Boolean MFABindRequired) {
                this.MFABindRequired = MFABindRequired;
                return this;
            }

            /**
             * <p>Indicates whether the RAM user must reset the password at the next logon.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder passwordResetRequired(Boolean passwordResetRequired) {
                this.passwordResetRequired = passwordResetRequired;
                return this;
            }

            /**
             * <p>The status of password-based logon.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T06:56:45Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public LoginProfile build() {
                return new LoginProfile(this);
            } 

        } 

    }
}
