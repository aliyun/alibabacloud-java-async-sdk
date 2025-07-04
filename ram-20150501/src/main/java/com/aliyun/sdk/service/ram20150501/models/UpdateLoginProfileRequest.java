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
 * {@link UpdateLoginProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoginProfileRequest</p>
 */
public class UpdateLoginProfileRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UpdateLoginProfileRequest(Builder builder) {
        super(builder);
        this.MFABindRequired = builder.MFABindRequired;
        this.password = builder.password;
        this.passwordResetRequired = builder.passwordResetRequired;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoginProfileRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateLoginProfileRequest, Builder> {
        private Boolean MFABindRequired; 
        private String password; 
        private Boolean passwordResetRequired; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoginProfileRequest request) {
            super(request);
            this.MFABindRequired = request.MFABindRequired;
            this.password = request.password;
            this.passwordResetRequired = request.passwordResetRequired;
            this.userName = request.userName;
        } 

        /**
         * <p>Specifies whether a multi-factor authentication (MFA) device must be bound to the RAM user upon logon.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder MFABindRequired(Boolean MFABindRequired) {
            this.putQueryParameter("MFABindRequired", MFABindRequired);
            this.MFABindRequired = MFABindRequired;
            return this;
        }

        /**
         * <p>The logon password of the RAM user. The password must meet the password strength requirements.</p>
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
         * <p>Specifies whether the RAM user has to change the password upon logon.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder passwordResetRequired(Boolean passwordResetRequired) {
            this.putQueryParameter("PasswordResetRequired", passwordResetRequired);
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
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateLoginProfileRequest build() {
            return new UpdateLoginProfileRequest(this);
        } 

    } 

}
