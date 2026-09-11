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
 * {@link SetDirQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetDirQuotaRequest</p>
 */
public class SetDirQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCountLimit")
    @com.aliyun.core.annotation.Validation(maximum = 1000000000)
    private Long fileCountLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SizeLimit")
    @com.aliyun.core.annotation.Validation(maximum = 10000000)
    private Long sizeLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The maximum number of files in the directory.</p>
         * <p>This includes files, directories, and special files.</p>
         * <p>When QuotaType is set to Enforcement, you must specify at least one of SizeLimit and FileCountLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder fileCountLimit(Long fileCountLimit) {
            this.putQueryParameter("FileCountLimit", fileCountLimit);
            this.fileCountLimit = fileCountLimit;
            return this;
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
         * <blockquote>
         * <ul>
         * <li>You can set a quota only for a directory that has been created in the NAS file system. The directory path for the quota is the absolute path in the NAS file system, not the local path on a compute node (for example, an ECS instance or container).</li>
         * <li>Directories whose path names contain Chinese characters are not supported.</li>
         * </ul>
         * </blockquote>
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
         * <p>The quota type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Accounting: statistical quota. Only tracks usage.</li>
         * <li>Enforcement: restrictive quota. When usage exceeds the limit, operations such as creating files or directories and appending data fail.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Accounting</p>
         */
        public Builder quotaType(String quotaType) {
            this.putQueryParameter("QuotaType", quotaType);
            this.quotaType = quotaType;
            return this;
        }

        /**
         * <p>The total capacity limit for files in the directory.</p>
         * <p>Unit: GiB.</p>
         * <p>When QuotaType is set to Enforcement, you must specify at least one of SizeLimit and FileCountLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder sizeLimit(Long sizeLimit) {
            this.putQueryParameter("SizeLimit", sizeLimit);
            this.sizeLimit = sizeLimit;
            return this;
        }

        /**
         * <p>The UID or GID to restrict.</p>
         * <p>This parameter is required and valid only when UserType is set to Uid or Gid.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>To restrict the user whose UID is 500, set UserType to Uid and UserId to 500.</li>
         * <li>To restrict the user group whose GID is 100, set UserType to Gid and UserId to 100.</li>
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
         * <li>AllUsers: all users</li>
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
        public SetDirQuotaRequest build() {
            return new SetDirQuotaRequest(this);
        } 

    } 

}
