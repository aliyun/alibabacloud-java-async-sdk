// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewDisplayName")
    private String newDisplayName;

    @Query
    @NameInMap("NewEmail")
    private String newEmail;

    @Query
    @NameInMap("NewFirstName")
    private String newFirstName;

    @Query
    @NameInMap("NewLastName")
    private String newLastName;

    @Query
    @NameInMap("UserId")
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
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The new description of the user.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * The new display name of the user.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * The new email address of the user.
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * The new first name of the user.
         */
        public Builder newFirstName(String newFirstName) {
            this.putQueryParameter("NewFirstName", newFirstName);
            this.newFirstName = newFirstName;
            return this;
        }

        /**
         * The new last name of the user.
         */
        public Builder newLastName(String newLastName) {
            this.putQueryParameter("NewLastName", newLastName);
            this.newLastName = newLastName;
            return this;
        }

        /**
         * The ID of the user.
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
