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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewComments")
    private String newComments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewEmail")
    private String newEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewMobilePhone")
    private String newMobilePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewUserName")
    private String newUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
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

        private Builder(UpdateUserRequest request) {
            super(request);
            this.newComments = request.newComments;
            this.newDisplayName = request.newDisplayName;
            this.newEmail = request.newEmail;
            this.newMobilePhone = request.newMobilePhone;
            this.newUserName = request.newUserName;
            this.userName = request.userName;
        } 

        /**
         * <p>The new description of the RAM user.</p>
         * <p>The description must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a cloud computing engineer.</p>
         */
        public Builder newComments(String newComments) {
            this.putQueryParameter("NewComments", newComments);
            this.newComments = newComments;
            return this;
        }

        /**
         * <p>The new display name of the RAM user.</p>
         * <p>The name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoq****</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>The new email address of the RAM user.</p>
         * <blockquote>
         * <p> This parameter applies only to the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xiaoq****@example.com</p>
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * <p>The new mobile phone number of the RAM user.</p>
         * <p>Format: &lt;Country code&gt;-&lt;Mobile phone number&gt;.</p>
         * <blockquote>
         * <p> This parameter applies only to the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1860000****</p>
         */
        public Builder newMobilePhone(String newMobilePhone) {
            this.putQueryParameter("NewMobilePhone", newMobilePhone);
            this.newMobilePhone = newMobilePhone;
            return this;
        }

        /**
         * <p>The new username of the RAM user.</p>
         * <p>The username must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoq****</p>
         */
        public Builder newUserName(String newUserName) {
            this.putQueryParameter("NewUserName", newUserName);
            this.newUserName = newUserName;
            return this;
        }

        /**
         * <p>The username of the RAM user.</p>
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
