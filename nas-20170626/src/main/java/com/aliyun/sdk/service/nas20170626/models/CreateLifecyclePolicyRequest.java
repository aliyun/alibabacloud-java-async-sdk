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
 * {@link CreateLifecyclePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecyclePolicyRequest</p>
 */
public class CreateLifecyclePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
    private String lifecyclePolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyType")
    private String lifecyclePolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleRuleName")
    private String lifecycleRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paths")
    private java.util.List<String> paths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetrieveRules")
    private java.util.List<RetrieveRules> retrieveRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRules")
    private java.util.List<TransitRules> transitRules;

    private CreateLifecyclePolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyName = builder.lifecyclePolicyName;
        this.lifecyclePolicyType = builder.lifecyclePolicyType;
        this.lifecycleRuleName = builder.lifecycleRuleName;
        this.path = builder.path;
        this.paths = builder.paths;
        this.retrieveRules = builder.retrieveRules;
        this.storageType = builder.storageType;
        this.transitRules = builder.transitRules;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return lifecyclePolicyType
     */
    public String getLifecyclePolicyType() {
        return this.lifecyclePolicyType;
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
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    /**
     * @return retrieveRules
     */
    public java.util.List<RetrieveRules> getRetrieveRules() {
        return this.retrieveRules;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return transitRules
     */
    public java.util.List<TransitRules> getTransitRules() {
        return this.transitRules;
    }

    public static final class Builder extends Request.Builder<CreateLifecyclePolicyRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private String lifecyclePolicyName; 
        private String lifecyclePolicyType; 
        private String lifecycleRuleName; 
        private String path; 
        private java.util.List<String> paths; 
        private java.util.List<RetrieveRules> retrieveRules; 
        private String storageType; 
        private java.util.List<TransitRules> transitRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecyclePolicyRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
            this.lifecyclePolicyType = request.lifecyclePolicyType;
            this.lifecycleRuleName = request.lifecycleRuleName;
            this.path = request.path;
            this.paths = request.paths;
            this.retrieveRules = request.retrieveRules;
            this.storageType = request.storageType;
            this.transitRules = request.transitRules;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * <p>The name of the lifecycle policy. The name must be 3 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
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
         * LifecyclePolicyType.
         */
        public Builder lifecyclePolicyType(String lifecyclePolicyType) {
            this.putQueryParameter("LifecyclePolicyType", lifecyclePolicyType);
            this.lifecyclePolicyType = lifecyclePolicyType;
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
         * <p>The absolute path of the directory that is associated with the lifecycle policy.</p>
         * <p>If you specify this parameter, you can associate the lifecycle policy with only one directory. The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
         * <blockquote>
         * <p>We recommend that you specify the Paths.N parameter so that you can associate the lifecycle policy with multiple directories.</p>
         * </blockquote>
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
         * <p>The absolute paths of the directories that are associated with the lifecycle policy.</p>
         * <p>If you specify this parameter, you can associate the lifecycle policy with multiple directories. Each path must start with a forward slash (/) and must be a path that exists in the mount target. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;/path1&quot;, &quot;/path2&quot;</p>
         */
        public Builder paths(java.util.List<String> paths) {
            this.putQueryParameter("Paths", paths);
            this.paths = paths;
            return this;
        }

        /**
         * RetrieveRules.
         */
        public Builder retrieveRules(java.util.List<RetrieveRules> retrieveRules) {
            this.putQueryParameter("RetrieveRules", retrieveRules);
            this.retrieveRules = retrieveRules;
            return this;
        }

        /**
         * <p>The storage type of the data that is dumped to the IA storage medium.</p>
         * <p>Default value: InfrequentAccess (IA).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * TransitRules.
         */
        public Builder transitRules(java.util.List<TransitRules> transitRules) {
            this.putQueryParameter("TransitRules", transitRules);
            this.transitRules = transitRules;
            return this;
        }

        @Override
        public CreateLifecyclePolicyRequest build() {
            return new CreateLifecyclePolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLifecyclePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateLifecyclePolicyRequest</p>
     */
    public static class RetrieveRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private RetrieveRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrieveRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(RetrieveRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * Attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public RetrieveRules build() {
                return new RetrieveRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLifecyclePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateLifecyclePolicyRequest</p>
     */
    public static class TransitRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private TransitRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(TransitRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * Attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public TransitRules build() {
                return new TransitRules(this);
            } 

        } 

    }
}
