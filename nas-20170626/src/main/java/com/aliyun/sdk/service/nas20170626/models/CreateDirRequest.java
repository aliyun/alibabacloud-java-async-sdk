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
 * {@link CreateDirRequest} extends {@link RequestModel}
 *
 * <p>CreateDirRequest</p>
 */
public class CreateDirRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ownerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recursion")
    private Boolean recursion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rootDirectory;

    private CreateDirRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.ownerGroupId = builder.ownerGroupId;
        this.ownerUserId = builder.ownerUserId;
        this.permission = builder.permission;
        this.recursion = builder.recursion;
        this.rootDirectory = builder.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDirRequest create() {
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
     * @return ownerGroupId
     */
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    /**
     * @return ownerUserId
     */
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return recursion
     */
    public Boolean getRecursion() {
        return this.recursion;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public static final class Builder extends Request.Builder<CreateDirRequest, Builder> {
        private String fileSystemId; 
        private Integer ownerGroupId; 
        private Integer ownerUserId; 
        private String permission; 
        private Boolean recursion; 
        private String rootDirectory; 

        private Builder() {
            super();
        } 

        private Builder(CreateDirRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.ownerGroupId = request.ownerGroupId;
            this.ownerUserId = request.ownerUserId;
            this.permission = request.permission;
            this.recursion = request.recursion;
            this.rootDirectory = request.rootDirectory;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the owner group for the directory. Valid values: 0 to 4294967295.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ownerGroupId(Integer ownerGroupId) {
            this.putQueryParameter("OwnerGroupId", ownerGroupId);
            this.ownerGroupId = ownerGroupId;
            return this;
        }

        /**
         * <p>The owner ID for the directory. Valid values: 0 to 4294967295.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerUserId(Integer ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The Portable Operating System Interface (POSIX) permissions applied to the root directory. The value is a valid octal number, such as 0755.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0755</p>
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>Specifies whether to create a multi-level directory. Valid values:</p>
         * <ul>
         * <li>true (default): If no multi-level directory exists, directories are created level by level.</li>
         * <li>false: Only the last level of directory is created. An error message is returned because the parent directory does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recursion(Boolean recursion) {
            this.putQueryParameter("Recursion", recursion);
            this.recursion = recursion;
            return this;
        }

        /**
         * <p>The directory name.</p>
         * <ul>
         * <li>The directory must start with a forward slash (/).</li>
         * <li>The directory can contain digits and letters.</li>
         * <li>The directory can contain underscores (_), hyphens (-), and periods (.).</li>
         * <li>The directory cannot contain symbolic links, such as the current directory (.), the upper-level directory (..), and other symbolic links.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the root directory does not exist, configure the information for directory creation. The system then automatically creates the specified root directory based on your settings.</li>
         * <li>If the root directory exists, you do not need to configure the information for directory creation. The configurations for directory creation are ignored even if you configure the information.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        @Override
        public CreateDirRequest build() {
            return new CreateDirRequest(this);
        } 

    } 

}
