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
         * <p>The description of the lifecycle policy.</p>
         * <p>Format: The name must be 3 to 64 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
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
         * <p>The name of the lifecycle policy. The name must be 3 to 64 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> Required for General-purpose NAS.</p>
         * </blockquote>
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
         * <p>The policy type.</p>
         * <ul>
         * <li>Auto (default): The job is automatically triggered.</li>
         * <li>OnDemand: On-demand execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder lifecyclePolicyType(String lifecyclePolicyType) {
            this.putQueryParameter("LifecyclePolicyType", lifecyclePolicyType);
            this.lifecyclePolicyType = lifecyclePolicyType;
            return this;
        }

        /**
         * <p>The management rule associated with the lifecycle policy. Only General-purpose NAS supports this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DEFAULT_ATIME_14: Files not accessed for 14 days.</li>
         * <li>DEFAULT_ATIME_30: Files not accessed for 30 days.</li>
         * <li>DEFAULT_ATIME_60: Files not accessed for 60 days.</li>
         * <li>DEFAULT_ATIME_90: Files not accessed for 90 days.</li>
         * <li>DEFAULT_ATIME_180: Files not accessed for 180 days. DEFAULT_ATIME_180 is supported only when the StorageType parameter is set to Archive.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If an IA policy already exists for the directory, the new archive policy must have a longer transition period.</p>
         * </li>
         * <li><p>Only General-purpose NAS supports this parameter.</p>
         * </li>
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
         * <p>The absolute path of the directory associated with the lifecycle policy. Only General-purpose NAS supports this parameter.</p>
         * <ul>
         * <li>Single value only. The path must start with a forward slash (/) and must be a path that exists in the mount target.</li>
         * </ul>
         * <blockquote>
         * <p> We recommend configuring the Paths.N parameter so that you can associate the policy with multiple directories at a time.</p>
         * </blockquote>
         * <ul>
         * <li>Path and Paths are mutually exclusive. You must specify one.</li>
         * </ul>
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
         * <p>The absolute paths of the directories associated with the lifecycle policy.</p>
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
         * <p>The file data retrieval rule. Only one rule can be configured.</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         */
        public Builder retrieveRules(java.util.List<RetrieveRules> retrieveRules) {
            this.putQueryParameter("RetrieveRules", retrieveRules);
            this.retrieveRules = retrieveRules;
            return this;
        }

        /**
         * <p>The storage class.</p>
         * <ul>
         * <li>InfrequentAccess: the Infrequent Access (IA) storage class.</li>
         * <li>Archive: the Archive storage class.</li>
         * </ul>
         * <blockquote>
         * <p> General-purpose NAS supports InfrequentAccess and Archive. CPFS for Lingjun only supports InfrequentAccess.</p>
         * </blockquote>
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
         * <p>The data transition rule. Only one rule can be configured.</p>
         * <blockquote>
         * <p> Supported only for CPFS for Lingjun file systems with LifecyclePolicyType set to Auto.</p>
         * </blockquote>
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
             * <p>The attribute of the rule. Valid value:</p>
             * <ul>
             * <li>RetrieveType: the retrieval method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RetrieveType</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The threshold of the rule. Valid values:</p>
             * <ul>
             * <li><p>RetrieveType</p>
             * <ul>
             * <li>AfterVisit: Supported when LifecyclePolicyType is Auto. Represents a best-effort recall on access.</li>
             * <li>All: Supported when LifecyclePolicyType is OnDemand. Represents retrieving all data.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
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
             * <p>Attribute of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Atime: the access time of the file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Atime</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>Threshold for the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>If Attribute is set to Atime, this value represents the number of days since the file was last accessed. Valid values: [1, 365].</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
