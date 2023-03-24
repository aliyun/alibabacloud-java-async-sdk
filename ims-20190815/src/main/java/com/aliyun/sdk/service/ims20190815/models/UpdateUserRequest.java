// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @Query
    @NameInMap("NewComments")
    private String newComments;

    @Query
    @NameInMap("NewDisplayName")
    private String newDisplayName;

    @Query
    @NameInMap("NewEmail")
    private String newEmail;

    @Query
    @NameInMap("NewMobilePhone")
    private String newMobilePhone;

    @Query
    @NameInMap("NewUserPrincipalName")
    private String newUserPrincipalName;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.newComments = builder.newComments;
        this.newDisplayName = builder.newDisplayName;
        this.newEmail = builder.newEmail;
        this.newMobilePhone = builder.newMobilePhone;
        this.newUserPrincipalName = builder.newUserPrincipalName;
        this.userId = builder.userId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newComments
     */
    public String getNewComments() {
        return this.newComments;
    }

    /**
     * @return newDisplayName
     */
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    /**
     * @return newEmail
     */
    public String getNewEmail() {
        return this.newEmail;
    }

    /**
     * @return newMobilePhone
     */
    public String getNewMobilePhone() {
        return this.newMobilePhone;
    }

    /**
     * @return newUserPrincipalName
     */
    public String getNewUserPrincipalName() {
        return this.newUserPrincipalName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String newComments; 
        private String newDisplayName; 
        private String newEmail; 
        private String newMobilePhone; 
        private String newUserPrincipalName; 
        private String userId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.newComments = request.newComments;
            this.newDisplayName = request.newDisplayName;
            this.newEmail = request.newEmail;
            this.newMobilePhone = request.newMobilePhone;
            this.newUserPrincipalName = request.newUserPrincipalName;
            this.userId = request.userId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * The new description of the RAM user.
         * <p>
         * 
         * The description must be 1 to 128 characters in length.
         */
        public Builder newComments(String newComments) {
            this.putQueryParameter("NewComments", newComments);
            this.newComments = newComments;
            return this;
        }

        /**
         * The new display name of the RAM user.
         * <p>
         * 
         * The name must be 1 to 24 characters in length.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * The new email address of the RAM user.
         * <p>
         * 
         * >  This parameter applies only to the China site (aliyun.com).
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * The new mobile phone number of the RAM user.
         * <p>
         * 
         * Format: Country calling code-Mobile phone number.
         * 
         * >  This parameter applies only to the China site (aliyun.com).
         */
        public Builder newMobilePhone(String newMobilePhone) {
            this.putQueryParameter("NewMobilePhone", newMobilePhone);
            this.newMobilePhone = newMobilePhone;
            return this;
        }

        /**
         * The new logon name of the RAM user.
         * <p>
         * 
         * The name is in the format of `<username>@<AccountAlias>.onaliyun.com`. `<username>` is the name of the RAM user. `<AccountAlias>.onaliyun.com` is the default domain name.
         * 
         * The value of `UserPrincipalName` must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (\_). The value of `<username>` must be 1 to 64 characters in length.
         */
        public Builder newUserPrincipalName(String newUserPrincipalName) {
            this.putQueryParameter("NewUserPrincipalName", newUserPrincipalName);
            this.newUserPrincipalName = newUserPrincipalName;
            return this;
        }

        /**
         * The ID of the RAM user.
         * <p>
         * 
         * >  You must specify only one of the following parameters: `UserPrincipalName` and `UserId`.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The logon name of the RAM user.
         * <p>
         * 
         * >  You must specify only one of the following parameters: `UserPrincipalName` and `UserId`.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
