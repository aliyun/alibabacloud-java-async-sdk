// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstName")
    private String firstName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastName")
    private String lastName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.status = builder.status;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
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

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String displayName; 
        private String email; 
        private String firstName; 
        private String lastName; 
        private String status; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.displayName = request.displayName;
            this.email = request.email;
            this.firstName = request.firstName;
            this.lastName = request.lastName;
            this.status = request.status;
            this.userName = request.userName;
        } 

        /**
         * The description of the user.
         * <p>
         * 
         * The description can be up to 1,024 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The display name of the user.
         * <p>
         * 
         * The name can be up to 256 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The email address of the user. The email address must be unique within the directory.
         * <p>
         * 
         * The email address can be up to 128 characters in length.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The first name of the user.
         * <p>
         * 
         * The name can be up to 64 characters in length.
         */
        public Builder firstName(String firstName) {
            this.putQueryParameter("FirstName", firstName);
            this.firstName = firstName;
            return this;
        }

        /**
         * The last name of the user.
         * <p>
         * 
         * The name can be up to 64 characters in length.
         */
        public Builder lastName(String lastName) {
            this.putQueryParameter("LastName", lastName);
            this.lastName = lastName;
            return this;
        }

        /**
         * The status of the user. Valid values:
         * <p>
         * 
         * *   Enabled: The logon of the user is enabled. This is the default value.
         * *   Disabled: The logon of the user is disabled.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The name of the user. The name must be unique within the directory. The name cannot be changed.
         * <p>
         * 
         * The name can contain numbers, letters, and the following special characters: `@_-.`
         * 
         * The name can be up to 64 characters in length.
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
