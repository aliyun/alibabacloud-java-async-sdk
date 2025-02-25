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
 * {@link ModifyLifecyclePolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyLifecyclePolicyRequest</p>
 */
public class ModifyLifecyclePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecyclePolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyLifecyclePolicyRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyName = builder.lifecyclePolicyName;
        this.lifecycleRuleName = builder.lifecycleRuleName;
        this.path = builder.path;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLifecyclePolicyRequest create() {
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
     * @return lifecyclePolicyName
     */
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    /**
     * @return lifecycleRuleName
     */
    public String getLifecycleRuleName() {
        return this.lifecycleRuleName;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ModifyLifecyclePolicyRequest, Builder> {
        private String fileSystemId; 
        private String lifecyclePolicyName; 
        private String lifecycleRuleName; 
        private String path; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLifecyclePolicyRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
            this.lifecycleRuleName = request.lifecycleRuleName;
            this.path = request.path;
            this.storageType = request.storageType;
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
         * <p>The name of the lifecycle policy.</p>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclepolicy_01</p>
         */
        public Builder lifecyclePolicyName(String lifecyclePolicyName) {
            this.putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }

        /**
         * <p>The management rule that is associated with the lifecycle policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DEFAULT_ATIME_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_ATIME_14</p>
         */
        public Builder lifecycleRuleName(String lifecycleRuleName) {
            this.putQueryParameter("LifecycleRuleName", lifecycleRuleName);
            this.lifecycleRuleName = lifecycleRuleName;
            return this;
        }

        /**
         * <p>The absolute path of a directory with which the lifecycle policy is associated.</p>
         * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>/pathway/to/folder</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The storage type of the data that is dumped to the IA storage medium.</p>
         * <p>Default value: InfrequentAccess (IA).</p>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ModifyLifecyclePolicyRequest build() {
            return new ModifyLifecyclePolicyRequest(this);
        } 

    } 

}
