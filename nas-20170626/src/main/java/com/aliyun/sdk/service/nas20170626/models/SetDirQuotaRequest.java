// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDirQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetDirQuotaRequest</p>
 */
public class SetDirQuotaRequest extends Request {
    @Query
    @NameInMap("FileCountLimit")
    @Validation(maximum = 1000000000)
    private Long fileCountLimit;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("QuotaType")
    @Validation(required = true)
    private String quotaType;

    @Query
    @NameInMap("SizeLimit")
    @Validation(maximum = 10000000)
    private Long sizeLimit;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserType")
    @Validation(required = true)
    private String userType;

    private SetDirQuotaRequest(Builder builder) {
        super(builder);
        this.fileCountLimit = builder.fileCountLimit;
        this.fileSystemId = builder.fileSystemId;
        this.path = builder.path;
        this.quotaType = builder.quotaType;
        this.sizeLimit = builder.sizeLimit;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDirQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileCountLimit
     */
    public Long getFileCountLimit() {
        return this.fileCountLimit;
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
     * @return quotaType
     */
    public String getQuotaType() {
        return this.quotaType;
    }

    /**
     * @return sizeLimit
     */
    public Long getSizeLimit() {
        return this.sizeLimit;
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

    public static final class Builder extends Request.Builder<SetDirQuotaRequest, Builder> {
        private Long fileCountLimit; 
        private String fileSystemId; 
        private String path; 
        private String quotaType; 
        private Long sizeLimit; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(SetDirQuotaRequest request) {
            super(request);
            this.fileCountLimit = request.fileCountLimit;
            this.fileSystemId = request.fileSystemId;
            this.path = request.path;
            this.quotaType = request.quotaType;
            this.sizeLimit = request.sizeLimit;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
         * The number of files that a user can create in the directory.
         * <p>
         * 
         * This number includes the number of files, subdirectories, and special files.
         * 
         * If you set the QuotaType parameter to Enforcement, you must specify at least one of the SizeLimit and FileCountLimit parameters.
         */
        public Builder fileCountLimit(Long fileCountLimit) {
            this.putQueryParameter("FileCountLimit", fileCountLimit);
            this.fileCountLimit = fileCountLimit;
            return this;
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
         * The type of the quota.
         * <p>
         * 
         * Valid values:
         * 
         * *   Accounting: a statistical quota. If you set this parameter to Accounting, NAS calculates only the storage usage of the directory.
         * *   Enforcement: a restricted quota. If you set this parameter to Enforcement and the storage usage exceeds the quota, you can no longer create files or subdirectories for the directory, or write data to the directory.
         */
        public Builder quotaType(String quotaType) {
            this.putQueryParameter("QuotaType", quotaType);
            this.quotaType = quotaType;
            return this;
        }

        /**
         * The size of files that a user can create in the directory.
         * <p>
         * 
         * Unit: GiB.
         * 
         * If you set the QuotaType parameter to Enforcement, you must specify at least one of the SizeLimit and FileCountLimit parameters.
         */
        public Builder sizeLimit(Long sizeLimit) {
            this.putQueryParameter("SizeLimit", sizeLimit);
            this.sizeLimit = sizeLimit;
            return this;
        }

        /**
         * The UID or GID of the user for whom you want to set a directory quota.
         * <p>
         * 
         * This parameter is required and valid only if the UserType parameter is set to Uid or Gid.
         * 
         * Examples:
         * 
         * *   If you want to set a directory quota for a user whose UID is 500, set the UserType parameter to Uid and set the UserId parameter to 500.
         * *   If you want to set a directory quota for a user group whose GID is 100, set the UserType parameter to Gid and set the UserId parameter to 100.
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
        public SetDirQuotaRequest build() {
            return new SetDirQuotaRequest(this);
        } 

    } 

}
