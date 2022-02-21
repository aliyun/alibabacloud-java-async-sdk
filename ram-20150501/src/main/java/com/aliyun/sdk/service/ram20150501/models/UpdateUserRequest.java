// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
    @NameInMap("NewUserName")
    private String newUserName;

    @Query
    @NameInMap("UserName")
    private String userName;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.newComments = builder.newComments;
        this.newDisplayName = builder.newDisplayName;
        this.newEmail = builder.newEmail;
        this.newMobilePhone = builder.newMobilePhone;
        this.newUserName = builder.newUserName;
        this.userName = builder.userName;
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
     * @return newUserName
     */
    public String getNewUserName() {
        return this.newUserName;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String newComments; 
        private String newDisplayName; 
        private String newEmail; 
        private String newMobilePhone; 
        private String newUserName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest response) {
            super(response);
            this.newComments = response.newComments;
            this.newDisplayName = response.newDisplayName;
            this.newEmail = response.newEmail;
            this.newMobilePhone = response.newMobilePhone;
            this.newUserName = response.newUserName;
            this.userName = response.userName;
        } 

        /**
         * NewComments.
         */
        public Builder newComments(String newComments) {
            this.putQueryParameter("NewComments", newComments);
            this.newComments = newComments;
            return this;
        }

        /**
         * NewDisplayName.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * NewEmail.
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * NewMobilePhone.
         */
        public Builder newMobilePhone(String newMobilePhone) {
            this.putQueryParameter("NewMobilePhone", newMobilePhone);
            this.newMobilePhone = newMobilePhone;
            return this;
        }

        /**
         * NewUserName.
         */
        public Builder newUserName(String newUserName) {
            this.putQueryParameter("NewUserName", newUserName);
            this.newUserName = newUserName;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
