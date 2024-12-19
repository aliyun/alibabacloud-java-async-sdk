// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLoginProfileResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLoginProfileResponseBody</p>
 */
public class UpdateLoginProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginProfile")
    private LoginProfile loginProfile;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateLoginProfileResponseBody(Builder builder) {
        this.loginProfile = builder.loginProfile;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoginProfileResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BCDB6A7F-2199-41D9-B577-4FA536A5ADE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLoginProfileResponseBody build() {
            return new UpdateLoginProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoginProfileResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLoginProfileResponseBody</p>
     */
    public static class LoginProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDisableLoginStatus")
        private String autoDisableLoginStatus;

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
            this.autoDisableLoginStatus = builder.autoDisableLoginStatus;
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
         * @return autoDisableLoginStatus
         */
        public String getAutoDisableLoginStatus() {
            return this.autoDisableLoginStatus;
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
            private String autoDisableLoginStatus; 
            private Boolean MFABindRequired; 
            private Boolean passwordResetRequired; 
            private String status; 
            private String updateDate; 
            private String userPrincipalName; 

            /**
             * AutoDisableLoginStatus.
             */
            public Builder autoDisableLoginStatus(String autoDisableLoginStatus) {
                this.autoDisableLoginStatus = autoDisableLoginStatus;
                return this;
            }

            /**
             * <p>Indicates whether MFA must be enabled.</p>
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
             * <p>2020-10-14T07:48:41Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example11.onaliyun.com">test@example11.onaliyun.com</a></p>
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
