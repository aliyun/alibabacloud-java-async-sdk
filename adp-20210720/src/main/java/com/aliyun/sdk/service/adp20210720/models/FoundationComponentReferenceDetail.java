// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FoundationComponentReferenceDetail} extends {@link TeaModel}
 *
 * <p>FoundationComponentReferenceDetail</p>
 */
public class FoundationComponentReferenceDetail extends TeaModel {
    @NameInMap("appVersion")
    private String appVersion;

    @NameInMap("category")
    private String category;

    @NameInMap("class")
    private String _class;

    @NameInMap("componentDescription")
    private String componentDescription;

    @NameInMap("componentName")
    private String componentName;

    @NameInMap("componentReferenceUID")
    private String componentReferenceUID;

    @NameInMap("componentUID")
    private String componentUID;

    @NameInMap("componentVersionDescription")
    private String componentVersionDescription;

    @NameInMap("componentVersionUID")
    private String componentVersionUID;

    @NameInMap("createdAt")
    private String createdAt;

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

    @NameInMap("orchestrationValues")
    private String orchestrationValues;

    @NameInMap("parentComponent")
    private Boolean parentComponent;

    @NameInMap("parentComponentVersionUID")
    private String parentComponentVersionUID;

    @NameInMap("priority")
    private Integer priority;

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

    @NameInMap("values")
    private String values;

    @NameInMap("version")
    private String version;

    private FoundationComponentReferenceDetail(Builder builder) {
        this.appVersion = builder.appVersion;
        this.category = builder.category;
        this._class = builder._class;
        this.componentDescription = builder.componentDescription;
        this.componentName = builder.componentName;
        this.componentReferenceUID = builder.componentReferenceUID;
        this.componentUID = builder.componentUID;
        this.componentVersionDescription = builder.componentVersionDescription;
        this.componentVersionUID = builder.componentVersionUID;
        this.createdAt = builder.createdAt;
        this.documents = builder.documents;
        this.enable = builder.enable;
        this.imagesMapping = builder.imagesMapping;
        this.namespace = builder.namespace;
        this.orchestrationType = builder.orchestrationType;
        this.orchestrationValues = builder.orchestrationValues;
        this.parentComponent = builder.parentComponent;
        this.parentComponentVersionUID = builder.parentComponentVersionUID;
        this.priority = builder.priority;
        this.provider = builder.provider;
        this._public = builder._public;
        this.readme = builder.readme;
        this.relationUID = builder.relationUID;
        this.releaseName = builder.releaseName;
        this.resources = builder.resources;
        this.sequence = builder.sequence;
        this.singleton = builder.singleton;
        this.source = builder.source;
        this.values = builder.values;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FoundationComponentReferenceDetail create() {
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
     * @return componentDescription
     */
    public String getComponentDescription() {
        return this.componentDescription;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentReferenceUID
     */
    public String getComponentReferenceUID() {
        return this.componentReferenceUID;
    }

    /**
     * @return componentUID
     */
    public String getComponentUID() {
        return this.componentUID;
    }

    /**
     * @return componentVersionDescription
     */
    public String getComponentVersionDescription() {
        return this.componentVersionDescription;
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
     * @return orchestrationValues
     */
    public String getOrchestrationValues() {
        return this.orchestrationValues;
    }

    /**
     * @return parentComponent
     */
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    /**
     * @return parentComponentVersionUID
     */
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return values
     */
    public String getValues() {
        return this.values;
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
        private String componentDescription; 
        private String componentName; 
        private String componentReferenceUID; 
        private String componentUID; 
        private String componentVersionDescription; 
        private String componentVersionUID; 
        private String createdAt; 
        private String documents; 
        private Boolean enable; 
        private String imagesMapping; 
        private String namespace; 
        private String orchestrationType; 
        private String orchestrationValues; 
        private Boolean parentComponent; 
        private String parentComponentVersionUID; 
        private Integer priority; 
        private String provider; 
        private Boolean _public; 
        private String readme; 
        private String relationUID; 
        private String releaseName; 
        private String resources; 
        private Integer sequence; 
        private Boolean singleton; 
        private String source; 
        private String values; 
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
         * componentDescription.
         */
        public Builder componentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
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
         * componentReferenceUID.
         */
        public Builder componentReferenceUID(String componentReferenceUID) {
            this.componentReferenceUID = componentReferenceUID;
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
         * componentVersionDescription.
         */
        public Builder componentVersionDescription(String componentVersionDescription) {
            this.componentVersionDescription = componentVersionDescription;
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
         * orchestrationValues.
         */
        public Builder orchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
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
         * parentComponentVersionUID.
         */
        public Builder parentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
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
         * values.
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public FoundationComponentReferenceDetail build() {
            return new FoundationComponentReferenceDetail(this);
        } 

    } 

}
