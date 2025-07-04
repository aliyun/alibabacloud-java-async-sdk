// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewEmail")
    private String newEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewFirstName")
    private String newFirstName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewLastName")
    private String newLastName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDescription = builder.newDescription;
        this.newDisplayName = builder.newDisplayName;
        this.newEmail = builder.newEmail;
        this.newFirstName = builder.newFirstName;
        this.newLastName = builder.newLastName;
        this.userId = builder.userId;
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
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
     * @return newFirstName
     */
    public String getNewFirstName() {
        return this.newFirstName;
    }

    /**
     * @return newLastName
     */
    public String getNewLastName() {
        return this.newLastName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String directoryId; 
        private String newDescription; 
        private String newDisplayName; 
        private String newEmail; 
        private String newFirstName; 
        private String newLastName; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newDescription = request.newDescription;
            this.newDisplayName = request.newDisplayName;
            this.newEmail = request.newEmail;
            this.newFirstName = request.newFirstName;
            this.newLastName = request.newLastName;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The new description of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The new display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>AliceLee</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>The new email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:AliceLee@example.com">AliceLee@example.com</a></p>
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * <p>The new first name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder newFirstName(String newFirstName) {
            this.putQueryParameter("NewFirstName", newFirstName);
            this.newFirstName = newFirstName;
            return this;
        }

        /**
         * <p>The new last name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Lee</p>
         */
        public Builder newLastName(String newLastName) {
            this.putQueryParameter("NewLastName", newLastName);
            this.newLastName = newLastName;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
