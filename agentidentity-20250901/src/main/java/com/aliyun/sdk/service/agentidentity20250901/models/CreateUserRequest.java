// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.status = builder.status;
        this.userName = builder.userName;
        this.userPoolName = builder.userPoolName;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String description; 
        private String displayName; 
        private String email; 
        private String status; 
        private String userName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.email = request.email;
            this.status = request.status;
            this.userName = request.userName;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The description of the user. It must be 0 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Analyst</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the user. It must be 0 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>Disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The username. It can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
