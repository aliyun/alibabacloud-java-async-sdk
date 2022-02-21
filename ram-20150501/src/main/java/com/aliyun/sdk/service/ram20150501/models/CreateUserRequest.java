// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @Query
    @NameInMap("Comments")
    private String comments;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("MobilePhone")
    private String mobilePhone;

    @Query
    @NameInMap("UserName")
    private String userName;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.comments = builder.comments;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.mobilePhone = builder.mobilePhone;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String comments; 
        private String displayName; 
        private String email; 
        private String mobilePhone; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest response) {
            super(response);
            this.comments = response.comments;
            this.displayName = response.displayName;
            this.email = response.email;
            this.mobilePhone = response.mobilePhone;
            this.userName = response.userName;
        } 

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * MobilePhone.
         */
        public Builder mobilePhone(String mobilePhone) {
            this.putQueryParameter("MobilePhone", mobilePhone);
            this.mobilePhone = mobilePhone;
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
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
