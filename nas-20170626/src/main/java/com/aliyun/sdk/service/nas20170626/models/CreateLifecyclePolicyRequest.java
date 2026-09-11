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
    @com.aliyun.core.annotation.NameInMap("DeleteRules")
    private java.util.List<DeleteRules> deleteRules;

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
        this.deleteRules = builder.deleteRules;
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
     * @return deleteRules
     */
    public java.util.List<DeleteRules> getDeleteRules() {
        return this.deleteRules;
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
        private java.util.List<DeleteRules> deleteRules; 
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
            this.deleteRules = request.deleteRules;
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
         * <p>The file data expiration and deletion rules. You can configure up to one rule.</p>
         */
        public Builder deleteRules(java.util.List<DeleteRules> deleteRules) {
            this.putQueryParameter("DeleteRules", deleteRules);
            this.deleteRules = deleteRules;
            return this;
        }

        /**
         * <p>The lifecycle policy description.</p>
         * <p>Format:
         * The description must be 3 to 64 characters in length, start with a letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun is supported.</p>
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
         * <p>The file system ID.</p>
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
         * <p>The lifecycle management policy name. The name must be 3 to 64 characters in length, start with an uppercase letter or lowercase letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
         * <blockquote>
         * <p>Required for General-purpose NAS. Not required for CPFS for Lingjun.</p>
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
         * <li>Auto (default): automatic execution.</li>
         * <li>OnDemand: on-demand execution.</li>
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
         * <p>The management rule associated with the lifecycle management policy. Only General-purpose NAS is supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DEFAULT_ATIME_14: files that have not been accessed for 14 days.</li>
         * <li>DEFAULT_ATIME_30: files that have not been accessed for 30 days.</li>
         * <li>DEFAULT_ATIME_60: files that have not been accessed for 60 days.</li>
         * <li>DEFAULT_ATIME_90: files that have not been accessed for 90 days.</li>
         * <li>DEFAULT_ATIME_180: files that have not been accessed for 180 days. DEFAULT_ATIME_180 is supported only when StorageType is set to Archive.<blockquote>
         * <ul>
         * <li>If an IA storage class policy has already been configured for the directory, the archive policy duration must be longer than the IA storage class policy duration.</li>
         * <li>Only General-purpose NAS supports this parameter.</li>
         * </ul>
         * </blockquote>
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
         * <p>The absolute path of the directory associated with the lifecycle management policy. Only General-purpose NAS is supported.</p>
         * <ul>
         * <li>General-purpose NAS supports associating only a single directory. The path must start with a forward slash (/) and must be an existing path in the mount target.</li>
         * </ul>
         * <blockquote>
         * <p>Only General-purpose NAS is supported. For General-purpose NAS, use Paths.N instead to associate multiple directories at the same time.</p>
         * <ul>
         * <li>Only one of Path and Paths can be specified.</li>
         * </ul>
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
         * <p>The absolute paths of directories associated with the lifecycle management policy.</p>
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
         * <p>The file data retrieval rules. You can configure up to one rule.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun file systems are supported.</p>
         * </blockquote>
         * <blockquote>
         * <p>When LifecyclePolicyType is set to OnDemand, at least one of TransitRules or RetrieveRules must be specified.</p>
         * </blockquote>
         */
        public Builder retrieveRules(java.util.List<RetrieveRules> retrieveRules) {
            this.putQueryParameter("RetrieveRules", retrieveRules);
            this.retrieveRules = retrieveRules;
            return this;
        }

        /**
         * <p>The storage tiering type.</p>
         * <ul>
         * <li>InfrequentAccess: IA storage class.</li>
         * <li>Archive: Archive storage class.</li>
         * </ul>
         * <blockquote>
         * <p>General-purpose NAS supports InfrequentAccess and Archive. CPFS for Lingjun supports only InfrequentAccess.</p>
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
         * <p>The file data transit rules. You can configure up to one rule.</p>
         * <blockquote>
         * <p>Supported only when LifecyclePolicyType is set to Auto for CPFS for Lingjun file systems.</p>
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
    public static class DeleteRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private DeleteRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteRules create() {
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

            private Builder(DeleteRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The rule attribute.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Atime: the last access time of the file.</li>
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
             * <p>The rule threshold.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>When Attribute is set to Atime, the value specifies the number of days since the file was last accessed. Valid values: 1 to 365.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public DeleteRules build() {
                return new DeleteRules(this);
            } 

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
             * <p>The rule attribute. Valid values:</p>
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
             * <p>The rule threshold. Valid values:</p>
             * <ul>
             * <li>RetrieveType<ul>
             * <li>AfterVisit: supported when LifecyclePolicyType is set to Auto. Indicates best-effort recall on visit.</li>
             * <li>All: supported when LifecyclePolicyType is set to OnDemand. Indicates retrieving all data.</li>
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
             * <p>The rule attribute.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Atime: the last access time of the file.</li>
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
             * <p>The rule threshold.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>When Attribute is set to Atime, the value specifies the number of days since the file was last accessed. Valid values: 0 to 365.</li>
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
