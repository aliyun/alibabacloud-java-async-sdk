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
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobilePhone")
    private String mobilePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
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

        private Builder(CreateUserRequest request) {
            super(request);
            this.comments = request.comments;
            this.displayName = request.displayName;
            this.email = request.email;
            this.mobilePhone = request.mobilePhone;
            this.userName = request.userName;
        } 

        /**
         * <p>The description of the RAM user.</p>
         * <p>The description must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a cloud computing engineer.</p>
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * <p>The display name of the RAM user.</p>
         * <p>The display name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address of the RAM user.</p>
         * <blockquote>
         * <p> This parameter applies only to the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The mobile phone number of the RAM user.</p>
         * <p>Format: Country code-Mobile phone number.</p>
         * <blockquote>
         * <p> This parameter applies only to the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1868888****</p>
         */
        public Builder mobilePhone(String mobilePhone) {
            this.putQueryParameter("MobilePhone", mobilePhone);
            this.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * <p>The username of the RAM user.</p>
         * <p>The username must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
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
