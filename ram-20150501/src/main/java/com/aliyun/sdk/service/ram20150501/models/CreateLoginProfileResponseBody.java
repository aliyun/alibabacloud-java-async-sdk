// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
         * <p>The logon configurations of the RAM user.</p>
         */
        public Builder loginProfile(LoginProfile loginProfile) {
            this.loginProfile = loginProfile;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("MFABindRequired")
        private Boolean MFABindRequired;

        @com.aliyun.core.annotation.NameInMap("PasswordResetRequired")
        private Boolean passwordResetRequired;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private LoginProfile(Builder builder) {
            this.createDate = builder.createDate;
            this.MFABindRequired = builder.MFABindRequired;
            this.passwordResetRequired = builder.passwordResetRequired;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginProfile create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String createDate; 
            private Boolean MFABindRequired; 
            private Boolean passwordResetRequired; 
            private String userName; 

            /**
             * <p>The time when the logon configurations were created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>Indicates whether an MFA device must be attached to the RAM user upon logon.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder MFABindRequired(Boolean MFABindRequired) {
                this.MFABindRequired = MFABindRequired;
                return this;
            }

            /**
             * <p>Indicates whether the RAM user must change the password upon logon.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder passwordResetRequired(Boolean passwordResetRequired) {
                this.passwordResetRequired = passwordResetRequired;
                return this;
            }

            /**
             * <p>The name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangq****</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public LoginProfile build() {
                return new LoginProfile(this);
            } 

        } 

    }
}
