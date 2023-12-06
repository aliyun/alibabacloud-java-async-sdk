// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductComponentRelationDetail} extends {@link TeaModel}
 *
 * <p>ProductComponentRelationDetail</p>
 */
public class ProductComponentRelationDetail extends TeaModel {
    @NameInMap("appVersion")
    private String appVersion;

    @NameInMap("category")
    private String category;

    @NameInMap("class")
    private String _class;

    @NameInMap("componentName")
    private String componentName;

    @NameInMap("componentOrchestrationValues")
    private String componentOrchestrationValues;

    @NameInMap("componentUID")
    private String componentUID;

    @NameInMap("componentVersionSpecUID")
    private String componentVersionSpecUID;

    @NameInMap("componentVersionSpecValues")
    private String componentVersionSpecValues;

    @NameInMap("componentVersionUID")
    private String componentVersionUID;

    @NameInMap("createdAt")
    private String createdAt;

    @NameInMap("description")
    private String description;

    @NameInMap("documents")
    private String documents;

    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("imagesMapping")
    private String imagesMapping;

    @NameInMap("namespace")
    private String namespace;

    @NameInMap("orchestrationType")
    private String orchestrationType;

    @NameInMap("parentComponent")
    private Boolean parentComponent;

    @NameInMap("parentComponentVersionRelationUID")
    private String parentComponentVersionRelationUID;

    @NameInMap("parentComponentVersionUID")
    private String parentComponentVersionUID;

    @NameInMap("policy")
    private Policy policy;

    @NameInMap("priority")
    private Integer priority;

    @NameInMap("productVersionUID")
    private String productVersionUID;

    @NameInMap("provider")
    private String provider;

    @NameInMap("public")
    private Boolean _public;

    @NameInMap("readme")
    private String readme;

    @NameInMap("relationUID")
    private String relationUID;

    @NameInMap("releaseName")
    private String releaseName;

    @NameInMap("resources")
    private String resources;

    @NameInMap("sequence")
    private Integer sequence;

    @NameInMap("singleton")
    private Boolean singleton;

    @NameInMap("source")
    private String source;

    @NameInMap("version")
    private String version;

    private ProductComponentRelationDetail(Builder builder) {
        this.appVersion = builder.appVersion;
        this.category = builder.category;
        this._class = builder._class;
        this.componentName = builder.componentName;
        this.componentOrchestrationValues = builder.componentOrchestrationValues;
        this.componentUID = builder.componentUID;
        this.componentVersionSpecUID = builder.componentVersionSpecUID;
        this.componentVersionSpecValues = builder.componentVersionSpecValues;
        this.componentVersionUID = builder.componentVersionUID;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.documents = builder.documents;
        this.enable = builder.enable;
        this.imagesMapping = builder.imagesMapping;
        this.namespace = builder.namespace;
        this.orchestrationType = builder.orchestrationType;
        this.parentComponent = builder.parentComponent;
        this.parentComponentVersionRelationUID = builder.parentComponentVersionRelationUID;
        this.parentComponentVersionUID = builder.parentComponentVersionUID;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.productVersionUID = builder.productVersionUID;
        this.provider = builder.provider;
        this._public = builder._public;
        this.readme = builder.readme;
        this.relationUID = builder.relationUID;
        this.releaseName = builder.releaseName;
        this.resources = builder.resources;
        this.sequence = builder.sequence;
        this.singleton = builder.singleton;
        this.source = builder.source;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductComponentRelationDetail create() {
        return builder().build();
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentOrchestrationValues
     */
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    /**
     * @return componentUID
     */
    public String getComponentUID() {
        return this.componentUID;
    }

    /**
     * @return componentVersionSpecUID
     */
    public String getComponentVersionSpecUID() {
        return this.componentVersionSpecUID;
    }

    /**
     * @return componentVersionSpecValues
     */
    public String getComponentVersionSpecValues() {
        return this.componentVersionSpecValues;
    }

    /**
     * @return componentVersionUID
     */
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documents
     */
    public String getDocuments() {
        return this.documents;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return imagesMapping
     */
    public String getImagesMapping() {
        return this.imagesMapping;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return orchestrationType
     */
    public String getOrchestrationType() {
        return this.orchestrationType;
    }

    /**
     * @return parentComponent
     */
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    /**
     * @return parentComponentVersionRelationUID
     */
    public String getParentComponentVersionRelationUID() {
        return this.parentComponentVersionRelationUID;
    }

    /**
     * @return parentComponentVersionUID
     */
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return _public
     */
    public Boolean get_public() {
        return this._public;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    /**
     * @return relationUID
     */
    public String getRelationUID() {
        return this.relationUID;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * @return singleton
     */
    public Boolean getSingleton() {
        return this.singleton;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String appVersion; 
        private String category; 
        private String _class; 
        private String componentName; 
        private String componentOrchestrationValues; 
        private String componentUID; 
        private String componentVersionSpecUID; 
        private String componentVersionSpecValues; 
        private String componentVersionUID; 
        private String createdAt; 
        private String description; 
        private String documents; 
        private Boolean enable; 
        private String imagesMapping; 
        private String namespace; 
        private String orchestrationType; 
        private Boolean parentComponent; 
        private String parentComponentVersionRelationUID; 
        private String parentComponentVersionUID; 
        private Policy policy; 
        private Integer priority; 
        private String productVersionUID; 
        private String provider; 
        private Boolean _public; 
        private String readme; 
        private String relationUID; 
        private String releaseName; 
        private String resources; 
        private Integer sequence; 
        private Boolean singleton; 
        private String source; 
        private String version; 

        /**
         * appVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * class.
         */
        public Builder _class(String _class) {
            this._class = _class;
            return this;
        }

        /**
         * componentName.
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * componentOrchestrationValues.
         */
        public Builder componentOrchestrationValues(String componentOrchestrationValues) {
            this.componentOrchestrationValues = componentOrchestrationValues;
            return this;
        }

        /**
         * componentUID.
         */
        public Builder componentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }

        /**
         * componentVersionSpecUID.
         */
        public Builder componentVersionSpecUID(String componentVersionSpecUID) {
            this.componentVersionSpecUID = componentVersionSpecUID;
            return this;
        }

        /**
         * componentVersionSpecValues.
         */
        public Builder componentVersionSpecValues(String componentVersionSpecValues) {
            this.componentVersionSpecValues = componentVersionSpecValues;
            return this;
        }

        /**
         * componentVersionUID.
         */
        public Builder componentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * documents.
         */
        public Builder documents(String documents) {
            this.documents = documents;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * imagesMapping.
         */
        public Builder imagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * orchestrationType.
         */
        public Builder orchestrationType(String orchestrationType) {
            this.orchestrationType = orchestrationType;
            return this;
        }

        /**
         * parentComponent.
         */
        public Builder parentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }

        /**
         * parentComponentVersionRelationUID.
         */
        public Builder parentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
            this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
            return this;
        }

        /**
         * parentComponentVersionUID.
         */
        public Builder parentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * public.
         */
        public Builder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        /**
         * readme.
         */
        public Builder readme(String readme) {
            this.readme = readme;
            return this;
        }

        /**
         * relationUID.
         */
        public Builder relationUID(String relationUID) {
            this.relationUID = relationUID;
            return this;
        }

        /**
         * releaseName.
         */
        public Builder releaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        /**
         * sequence.
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * singleton.
         */
        public Builder singleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ProductComponentRelationDetail build() {
            return new ProductComponentRelationDetail(this);
        } 

    } 

    public static class MultiCluster extends TeaModel {
        @NameInMap("targetClusters")
        private java.util.List < String > targetClusters;

        private MultiCluster(Builder builder) {
            this.targetClusters = builder.targetClusters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiCluster create() {
            return builder().build();
        }

        /**
         * @return targetClusters
         */
        public java.util.List < String > getTargetClusters() {
            return this.targetClusters;
        }

        public static final class Builder {
            private java.util.List < String > targetClusters; 

            /**
             * targetClusters.
             */
            public Builder targetClusters(java.util.List < String > targetClusters) {
                this.targetClusters = targetClusters;
                return this;
            }

            public MultiCluster build() {
                return new MultiCluster(this);
            } 

        } 

    }
    public static class Policy extends TeaModel {
        @NameInMap("multiCluster")
        private MultiCluster multiCluster;

        private Policy(Builder builder) {
            this.multiCluster = builder.multiCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return multiCluster
         */
        public MultiCluster getMultiCluster() {
            return this.multiCluster;
        }

        public static final class Builder {
            private MultiCluster multiCluster; 

            /**
             * multiCluster.
             */
            public Builder multiCluster(MultiCluster multiCluster) {
                this.multiCluster = multiCluster;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
