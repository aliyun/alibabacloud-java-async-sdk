// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComponentVersion} extends {@link TeaModel}
 *
 * <p>ComponentVersion</p>
 */
public class ComponentVersion extends TeaModel {
    @NameInMap("appVersion")
    private String appVersion;

    @NameInMap("componentName")
    private String componentName;

    @NameInMap("componentUID")
    private String componentUID;

    @NameInMap("description")
    private String description;

    @NameInMap("documents")
    private String documents;

    @NameInMap("imagesMapping")
    private String imagesMapping;

    @NameInMap("namespace")
    private String namespace;

    @NameInMap("orchestrationType")
    private String orchestrationType;

    @NameInMap("orchestrationValues")
    private String orchestrationValues;

    @NameInMap("packageURL")
    private String packageURL;

    @NameInMap("parentComponent")
    private Boolean parentComponent;

    @NameInMap("platforms")
    private java.util.List < Platform > platforms;

    @NameInMap("readme")
    private String readme;

    @NameInMap("resources")
    private String resources;

    @NameInMap("source")
    private String source;

    @NameInMap("uid")
    private String uid;

    @NameInMap("version")
    private String version;

    private ComponentVersion(Builder builder) {
        this.appVersion = builder.appVersion;
        this.componentName = builder.componentName;
        this.componentUID = builder.componentUID;
        this.description = builder.description;
        this.documents = builder.documents;
        this.imagesMapping = builder.imagesMapping;
        this.namespace = builder.namespace;
        this.orchestrationType = builder.orchestrationType;
        this.orchestrationValues = builder.orchestrationValues;
        this.packageURL = builder.packageURL;
        this.parentComponent = builder.parentComponent;
        this.platforms = builder.platforms;
        this.readme = builder.readme;
        this.resources = builder.resources;
        this.source = builder.source;
        this.uid = builder.uid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentVersion create() {
        return builder().build();
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentUID
     */
    public String getComponentUID() {
        return this.componentUID;
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
     * @return packageURL
     */
    public String getPackageURL() {
        return this.packageURL;
    }

    /**
     * @return parentComponent
     */
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platform > getPlatforms() {
        return this.platforms;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String appVersion; 
        private String componentName; 
        private String componentUID; 
        private String description; 
        private String documents; 
        private String imagesMapping; 
        private String namespace; 
        private String orchestrationType; 
        private String orchestrationValues; 
        private String packageURL; 
        private Boolean parentComponent; 
        private java.util.List < Platform > platforms; 
        private String readme; 
        private String resources; 
        private String source; 
        private String uid; 
        private String version; 

        /**
         * appVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
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
         * componentUID.
         */
        public Builder componentUID(String componentUID) {
            this.componentUID = componentUID;
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
         * packageURL.
         */
        public Builder packageURL(String packageURL) {
            this.packageURL = packageURL;
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
         * platforms.
         */
        public Builder platforms(java.util.List < Platform > platforms) {
            this.platforms = platforms;
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
         * resources.
         */
        public Builder resources(String resources) {
            this.resources = resources;
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
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ComponentVersion build() {
            return new ComponentVersion(this);
        } 

    } 

}
