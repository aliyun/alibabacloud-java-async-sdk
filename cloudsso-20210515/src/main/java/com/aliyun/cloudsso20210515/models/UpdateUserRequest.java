// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String newDescription; 
        private String newDisplayName; 
        private String newEmail; 
        private String newFirstName; 
        private String newLastName; 
        private String userId; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>NewDescription.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>NewDisplayName.</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>NewEmail.</p>
         */
        public Builder newEmail(String newEmail) {
            this.putQueryParameter("NewEmail", newEmail);
            this.newEmail = newEmail;
            return this;
        }

        /**
         * <p>NewFirstName.</p>
         */
        public Builder newFirstName(String newFirstName) {
            this.putQueryParameter("NewFirstName", newFirstName);
            this.newFirstName = newFirstName;
            return this;
        }

        /**
         * <p>NewLastName.</p>
         */
        public Builder newLastName(String newLastName) {
            this.putQueryParameter("NewLastName", newLastName);
            this.newLastName = newLastName;
            return this;
        }

        /**
         * <p>UserId.</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
