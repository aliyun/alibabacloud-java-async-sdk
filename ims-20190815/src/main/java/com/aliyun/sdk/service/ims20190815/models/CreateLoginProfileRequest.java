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
 * {@link CreateLoginProfileRequest} extends {@link RequestModel}
 *
 * <p>CreateLoginProfileRequest</p>
 */
public class CreateLoginProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MFABindRequired")
    private Boolean MFABindRequired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordResetRequired")
    private Boolean passwordResetRequired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrincipalName;

    private CreateLoginProfileRequest(Builder builder) {
        super(builder);
        this.MFABindRequired = builder.MFABindRequired;
        this.password = builder.password;
        this.passwordResetRequired = builder.passwordResetRequired;
        this.status = builder.status;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoginProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return MFABindRequired
     */
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<CreateLoginProfileRequest, Builder> {
        private Boolean MFABindRequired; 
        private String password; 
        private Boolean passwordResetRequired; 
        private String status; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoginProfileRequest request) {
            super(request);
            this.MFABindRequired = request.MFABindRequired;
            this.password = request.password;
            this.passwordResetRequired = request.passwordResetRequired;
            this.status = request.status;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>Specifies whether multi-factor authentication (MFA) must be enabled. Valid values:</p>
         * <ul>
         * <li>true: MFA must be enabled. The RAM user must bind an MFA device at the next logon.</li>
         * <li>false: MFA is not enabled. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder MFABindRequired(Boolean MFABindRequired) {
            this.putQueryParameter("MFABindRequired", MFABindRequired);
            this.MFABindRequired = MFABindRequired;
            return this;
        }

        /**
         * <p>The password that is used to log on to the console.</p>
         * <p>The password must meet the complexity requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>mypassword</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether the RAM user must reset the password at the next logon. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordResetRequired(Boolean passwordResetRequired) {
            this.putQueryParameter("PasswordResetRequired", passwordResetRequired);
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }

        /**
         * <p>The status of password-based logon. Valid values:</p>
         * <ul>
         * <li>Active: Password-based logon is enabled. This is the default value.</li>
         * <li>Inactive: Password-based logon is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public CreateLoginProfileRequest build() {
            return new CreateLoginProfileRequest(this);
        } 

    } 

}
