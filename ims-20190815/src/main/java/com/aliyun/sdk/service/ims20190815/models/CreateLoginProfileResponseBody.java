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
 * {@link CreateLoginProfileResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoginProfileResponseBody</p>
 */
public class CreateLoginProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginProfile")
    private LoginProfile loginProfile;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLoginProfileResponseBody(Builder builder) {
        this.loginProfile = builder.loginProfile;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoginProfileResponseBody create() {
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
         * <p>29CB303C-1F05-43A6-A6BC-EBC5A797F8DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLoginProfileResponseBody build() {
            return new CreateLoginProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoginProfileResponseBody} extends {@link TeaModel}
     *
     * <p>CreateLoginProfileResponseBody</p>
     */
    public static class LoginProfile extends TeaModel {
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
            private Boolean MFABindRequired; 
            private Boolean passwordResetRequired; 
            private String status; 
            private String updateDate; 
            private String userPrincipalName; 

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
             * <p>2020-10-14T03:47:51Z</p>
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
