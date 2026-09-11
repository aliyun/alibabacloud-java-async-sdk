// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The absolute path of the directory in the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/sub1</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The UID or GID to cancel.</p>
         * <p>This parameter is required and valid only when UserType is set to Uid or Gid.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>To cancel the quota for the user whose UID is 500, set UserType to Uid and UserId to 500.</li>
         * <li>To cancel the quota for the user group whose GID is 100, set UserType to Gid and UserId to 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The user type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Uid: user ID</li>
         * <li>Gid: user group ID</li>
         * <li>AllUsers: all users.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Uid</p>
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
