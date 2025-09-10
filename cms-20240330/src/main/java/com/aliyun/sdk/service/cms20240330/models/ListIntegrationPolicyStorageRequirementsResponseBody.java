// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyStorageRequirementsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPolicyStorageRequirementsResponseBody</p>
 */
public class ListIntegrationPolicyStorageRequirementsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("storageRequirements")
    private java.util.List<StorageRequirements> storageRequirements;

    private ListIntegrationPolicyStorageRequirementsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageRequirements = builder.storageRequirements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyStorageRequirementsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageRequirements
     */
    public java.util.List<StorageRequirements> getStorageRequirements() {
        return this.storageRequirements;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StorageRequirements> storageRequirements; 

        private Builder() {
        } 

        private Builder(ListIntegrationPolicyStorageRequirementsResponseBody model) {
            this.requestId = model.requestId;
            this.storageRequirements = model.storageRequirements;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * storageRequirements.
         */
        public Builder storageRequirements(java.util.List<StorageRequirements> storageRequirements) {
            this.storageRequirements = storageRequirements;
            return this;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBody build() {
            return new ListIntegrationPolicyStorageRequirementsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPolicyStorageRequirementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyStorageRequirementsResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.Map<String, String> annotations;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        private Metadata(Builder builder) {
            this.annotations = builder.annotations;
            this.labels = builder.labels;
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private java.util.Map<String, String> annotations; 
            private java.util.Map<String, String> labels; 
            private String name; 
            private String namespace; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.annotations = model.annotations;
                this.labels = model.labels;
                this.name = model.name;
                this.namespace = model.namespace;
            } 

            /**
             * annotations.
             */
            public Builder annotations(java.util.Map<String, String> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyStorageRequirementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyStorageRequirementsResponseBody</p>
     */
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("shareScope")
        private String shareScope;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("systemTags")
        private java.util.Map<String, String> systemTags;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Spec(Builder builder) {
            this.entityId = builder.entityId;
            this.instance = builder.instance;
            this.instanceName = builder.instanceName;
            this.project = builder.project;
            this.region = builder.region;
            this.shareScope = builder.shareScope;
            this.storageType = builder.storageType;
            this.systemTags = builder.systemTags;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return shareScope
         */
        public String getShareScope() {
            return this.shareScope;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return systemTags
         */
        public java.util.Map<String, String> getSystemTags() {
            return this.systemTags;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String entityId; 
            private String instance; 
            private String instanceName; 
            private String project; 
            private String region; 
            private String shareScope; 
            private String storageType; 
            private java.util.Map<String, String> systemTags; 
            private java.util.Map<String, String> tags; 
            private String userId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Spec model) {
                this.entityId = model.entityId;
                this.instance = model.instance;
                this.instanceName = model.instanceName;
                this.project = model.project;
                this.region = model.region;
                this.shareScope = model.shareScope;
                this.storageType = model.storageType;
                this.systemTags = model.systemTags;
                this.tags = model.tags;
                this.userId = model.userId;
                this.workspace = model.workspace;
            } 

            /**
             * entityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * shareScope.
             */
            public Builder shareScope(String shareScope) {
                this.shareScope = shareScope;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * systemTags.
             */
            public Builder systemTags(java.util.Map<String, String> systemTags) {
                this.systemTags = systemTags;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyStorageRequirementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyStorageRequirementsResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("interUrl")
        private String interUrl;

        @com.aliyun.core.annotation.NameInMap("intraUrl")
        private String intraUrl;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("promMetricStore")
        private String promMetricStore;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Status(Builder builder) {
            this.instanceId = builder.instanceId;
            this.interUrl = builder.interUrl;
            this.intraUrl = builder.intraUrl;
            this.name = builder.name;
            this.project = builder.project;
            this.promMetricStore = builder.promMetricStore;
            this.region = builder.region;
            this.storageType = builder.storageType;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return interUrl
         */
        public String getInterUrl() {
            return this.interUrl;
        }

        /**
         * @return intraUrl
         */
        public String getIntraUrl() {
            return this.intraUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return promMetricStore
         */
        public String getPromMetricStore() {
            return this.promMetricStore;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String instanceId; 
            private String interUrl; 
            private String intraUrl; 
            private String name; 
            private String project; 
            private String promMetricStore; 
            private String region; 
            private String storageType; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.instanceId = model.instanceId;
                this.interUrl = model.interUrl;
                this.intraUrl = model.intraUrl;
                this.name = model.name;
                this.project = model.project;
                this.promMetricStore = model.promMetricStore;
                this.region = model.region;
                this.storageType = model.storageType;
                this.workspace = model.workspace;
            } 

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * interUrl.
             */
            public Builder interUrl(String interUrl) {
                this.interUrl = interUrl;
                return this;
            }

            /**
             * intraUrl.
             */
            public Builder intraUrl(String intraUrl) {
                this.intraUrl = intraUrl;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * promMetricStore.
             */
            public Builder promMetricStore(String promMetricStore) {
                this.promMetricStore = promMetricStore;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyStorageRequirementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyStorageRequirementsResponseBody</p>
     */
    public static class StorageRequirements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonReleaseNames")
        private java.util.List<String> addonReleaseNames;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("spec")
        private Spec spec;

        @com.aliyun.core.annotation.NameInMap("status")
        private Status status;

        private StorageRequirements(Builder builder) {
            this.addonReleaseNames = builder.addonReleaseNames;
            this.apiVersion = builder.apiVersion;
            this.kind = builder.kind;
            this.metadata = builder.metadata;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageRequirements create() {
            return builder().build();
        }

        /**
         * @return addonReleaseNames
         */
        public java.util.List<String> getAddonReleaseNames() {
            return this.addonReleaseNames;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> addonReleaseNames; 
            private String apiVersion; 
            private String kind; 
            private Metadata metadata; 
            private Spec spec; 
            private Status status; 

            private Builder() {
            } 

            private Builder(StorageRequirements model) {
                this.addonReleaseNames = model.addonReleaseNames;
                this.apiVersion = model.apiVersion;
                this.kind = model.kind;
                this.metadata = model.metadata;
                this.spec = model.spec;
                this.status = model.status;
            } 

            /**
             * addonReleaseNames.
             */
            public Builder addonReleaseNames(java.util.List<String> addonReleaseNames) {
                this.addonReleaseNames = addonReleaseNames;
                return this;
            }

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public StorageRequirements build() {
                return new StorageRequirements(this);
            } 

        } 

    }
}
