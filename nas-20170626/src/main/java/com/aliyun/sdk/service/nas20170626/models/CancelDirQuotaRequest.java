// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDirQuotaRequest} extends {@link RequestModel}
 *
 * <p>CancelDirQuotaRequest</p>
 */
public class CancelDirQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    private CancelDirQuotaRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.path = builder.path;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDirQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<CancelDirQuotaRequest, Builder> {
        private String fileSystemId; 
        private String path; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(CancelDirQuotaRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.path = request.path;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The absolute path of a directory.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The UID or GID of a user for whom you want to cancel the directory quota.
         * <p>
         * 
         * This parameter is required and valid only if the UserType parameter is set to Uid or Gid.
         * 
         * Examples:
         * 
         * *   If you want to cancel a quota for a user whose UID is 500, set the UserType parameter to Uid and set the UserId parameter to 500.
         * *   If you want to cancel a quota for a group whose GID is 100, set the UserType parameter to Gid and set the UserId parameter to 100.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The type of the user.
         * <p>
         * 
         * Valid values:
         * 
         * *   Uid: user ID
         * *   Gid: user group ID
         * *   AllUsers: all users
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public CancelDirQuotaRequest build() {
            return new CancelDirQuotaRequest(this);
        } 

    } 

}
