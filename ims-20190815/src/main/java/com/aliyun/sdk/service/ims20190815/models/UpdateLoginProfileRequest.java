// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoginProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoginProfileRequest</p>
 */
public class UpdateLoginProfileRequest extends Request {
    @Query
    @NameInMap("MFABindRequired")
    private Boolean MFABindRequired;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PasswordResetRequired")
    private Boolean passwordResetRequired;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
    private String userPrincipalName;

    private UpdateLoginProfileRequest(Builder builder) {
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

    public static final class Builder extends Request.Builder<UpdateLoginProfileRequest, Builder> {
        private Boolean MFABindRequired; 
        private String password; 
        private Boolean passwordResetRequired; 
        private String status; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoginProfileRequest request) {
            super(request);
            this.MFABindRequired = request.MFABindRequired;
            this.password = request.password;
            this.passwordResetRequired = request.passwordResetRequired;
            this.status = request.status;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * MFABindRequired.
         */
        public Builder MFABindRequired(Boolean MFABindRequired) {
            this.putQueryParameter("MFABindRequired", MFABindRequired);
            this.MFABindRequired = MFABindRequired;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PasswordResetRequired.
         */
        public Builder passwordResetRequired(Boolean passwordResetRequired) {
            this.putQueryParameter("PasswordResetRequired", passwordResetRequired);
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public UpdateLoginProfileRequest build() {
            return new UpdateLoginProfileRequest(this);
        } 

    } 

}
