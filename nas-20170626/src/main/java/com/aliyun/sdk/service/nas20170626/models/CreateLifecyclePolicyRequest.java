// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLifecyclePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecyclePolicyRequest</p>
 */
public class CreateLifecyclePolicyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Paths")
    private java.util.List < String > paths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    private CreateLifecyclePolicyRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyName = builder.lifecyclePolicyName;
        this.lifecycleRuleName = builder.lifecycleRuleName;
        this.path = builder.path;
        this.paths = builder.paths;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLifecyclePolicyRequest create() {
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
     * @return paths
     */
    public java.util.List < String > getPaths() {
        return this.paths;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<CreateLifecyclePolicyRequest, Builder> {
        private String fileSystemId; 
        private String lifecyclePolicyName; 
        private String lifecycleRuleName; 
        private String path; 
        private java.util.List < String > paths; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecyclePolicyRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
            this.lifecycleRuleName = request.lifecycleRuleName;
            this.path = request.path;
            this.paths = request.paths;
            this.storageType = request.storageType;
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
         * The name of the lifecycle policy. The name must be 3 to 64 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder lifecyclePolicyName(String lifecyclePolicyName) {
            this.putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }

        /**
         * The management rule that is associated with the lifecycle policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   DEFAULT_ATIME\_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.
         * *   DEFAULT_ATIME\_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.
         * *   DEFAULT_ATIME\_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.
         * *   DEFAULT_ATIME\_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.
         */
        public Builder lifecycleRuleName(String lifecycleRuleName) {
            this.putQueryParameter("LifecycleRuleName", lifecycleRuleName);
            this.lifecycleRuleName = lifecycleRuleName;
            return this;
        }

        /**
         * The absolute path of the directory that is associated with the lifecycle policy.
         * <p>
         * 
         * If you specify this parameter, you can associate the lifecycle policy with only one directory. The path must start with a forward slash (/) and must be a path that exists in the mount target.
         * 
         * > We recommend that you specify the Paths.N parameter so that you can associate the lifecycle policy with multiple directories.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The absolute paths of the directories that are associated with the lifecycle policy.
         * <p>
         * 
         * If you specify this parameter, you can associate the lifecycle policy with multiple directories. Each path must start with a forward slash (/) and must be a path that exists in the mount target. Valid values of N: 1 to 10.
         */
        public Builder paths(java.util.List < String > paths) {
            this.putQueryParameter("Paths", paths);
            this.paths = paths;
            return this;
        }

        /**
         * The storage type of the data that is dumped to the IA storage medium.
         * <p>
         * 
         * Default value: InfrequentAccess (IA).
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public CreateLifecyclePolicyRequest build() {
            return new CreateLifecyclePolicyRequest(this);
        } 

    } 

}
