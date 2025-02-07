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
    @com.aliyun.core.annotation.NameInMap("NewUserPrincipalName")
    private String newUserPrincipalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
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
         * <p>The name must be 1 to 24 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>The new email address of the RAM user.</p>
         * <blockquote>
         * <p>This parameter is valid only on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
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
         * <p>This parameter is valid only on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1868888****</p>
         */
        public Builder newMobilePhone(String newMobilePhone) {
            this.putQueryParameter("NewMobilePhone", newMobilePhone);
            this.newMobilePhone = newMobilePhone;
            return this;
        }

        /**
         * <p>The new logon name of the RAM user.</p>
         * <p>The name is in the format of <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>. <code>&lt;username&gt;</code> indicates the name of the RAM user. <code>&lt;AccountAlias&gt;.onaliyun.com</code> indicates the default domain name.</p>
         * <p>The value of <code>NewUserPrincipalName</code> must be <code>1 to 128</code> characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The value of <code>&lt;username&gt;</code> must be <code>1 to 64</code> characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:new@example.onaliyun.com">new@example.onaliyun.com</a></p>
         */
        public Builder newUserPrincipalName(String newUserPrincipalName) {
            this.putQueryParameter("NewUserPrincipalName", newUserPrincipalName);
            this.newUserPrincipalName = newUserPrincipalName;
            return this;
        }

        /**
         * <p>The ID of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
         * </blockquote>
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
