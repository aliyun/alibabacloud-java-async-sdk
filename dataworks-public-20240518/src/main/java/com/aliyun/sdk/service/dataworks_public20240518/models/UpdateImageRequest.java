// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageRequest</p>
 */
public class UpdateImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrAssociatedVpcId")
    private String acrAssociatedVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildConfig")
    private BuildConfig buildConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUri")
    private String imageUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderImageId")
    private String providerImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepositoryName")
    private String repositoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Supported")
    private Supported supported;

    private UpdateImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessibility = builder.accessibility;
        this.acrAssociatedVpcId = builder.acrAssociatedVpcId;
        this.acrInstanceId = builder.acrInstanceId;
        this.buildConfig = builder.buildConfig;
        this.description = builder.description;
        this.id = builder.id;
        this.imageUri = builder.imageUri;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.providerImageId = builder.providerImageId;
        this.repositoryName = builder.repositoryName;
        this.supported = builder.supported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return acrAssociatedVpcId
     */
    public String getAcrAssociatedVpcId() {
        return this.acrAssociatedVpcId;
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return buildConfig
     */
    public BuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
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

    /**
     * @return providerImageId
     */
    public String getProviderImageId() {
        return this.providerImageId;
    }

    /**
     * @return repositoryName
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * @return supported
     */
    public Supported getSupported() {
        return this.supported;
    }

    public static final class Builder extends Request.Builder<UpdateImageRequest, Builder> {
        private String regionId; 
        private String accessibility; 
        private String acrAssociatedVpcId; 
        private String acrInstanceId; 
        private BuildConfig buildConfig; 
        private String description; 
        private String id; 
        private String imageUri; 
        private String name; 
        private String namespace; 
        private String providerImageId; 
        private String repositoryName; 
        private Supported supported; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessibility = request.accessibility;
            this.acrAssociatedVpcId = request.acrAssociatedVpcId;
            this.acrInstanceId = request.acrInstanceId;
            this.buildConfig = request.buildConfig;
            this.description = request.description;
            this.id = request.id;
            this.imageUri = request.imageUri;
            this.name = request.name;
            this.namespace = request.namespace;
            this.providerImageId = request.providerImageId;
            this.repositoryName = request.repositoryName;
            this.supported = request.supported;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AcrAssociatedVpcId.
         */
        public Builder acrAssociatedVpcId(String acrAssociatedVpcId) {
            this.putQueryParameter("AcrAssociatedVpcId", acrAssociatedVpcId);
            this.acrAssociatedVpcId = acrAssociatedVpcId;
            return this;
        }

        /**
         * AcrInstanceId.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putQueryParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * BuildConfig.
         */
        public Builder buildConfig(BuildConfig buildConfig) {
            String buildConfigShrink = shrink(buildConfig, "BuildConfig", "json");
            this.putBodyParameter("BuildConfig", buildConfigShrink);
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom_image_xxxx_xxxx</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.putQueryParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ProviderImageId.
         */
        public Builder providerImageId(String providerImageId) {
            this.putBodyParameter("ProviderImageId", providerImageId);
            this.providerImageId = providerImageId;
            return this;
        }

        /**
         * RepositoryName.
         */
        public Builder repositoryName(String repositoryName) {
            this.putQueryParameter("RepositoryName", repositoryName);
            this.repositoryName = repositoryName;
            return this;
        }

        /**
         * Supported.
         */
        public Builder supported(Supported supported) {
            String supportedShrink = shrink(supported, "Supported", "json");
            this.putBodyParameter("Supported", supportedShrink);
            this.supported = supported;
            return this;
        }

        @Override
        public UpdateImageRequest build() {
            return new UpdateImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateImageRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageRequest</p>
     */
    public static class PackageInstallationScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PackageInstallationScripts(Builder builder) {
            this.content = builder.content;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageInstallationScripts create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String type; 

            private Builder() {
            } 

            private Builder(PackageInstallationScripts model) {
                this.content = model.content;
                this.type = model.type;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PackageInstallationScripts build() {
                return new PackageInstallationScripts(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateImageRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageRequest</p>
     */
    public static class BuildConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildType")
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("PackageInstallationScripts")
        private java.util.List<PackageInstallationScripts> packageInstallationScripts;

        private BuildConfig(Builder builder) {
            this.buildType = builder.buildType;
            this.packageInstallationScripts = builder.packageInstallationScripts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildConfig create() {
            return builder().build();
        }

        /**
         * @return buildType
         */
        public String getBuildType() {
            return this.buildType;
        }

        /**
         * @return packageInstallationScripts
         */
        public java.util.List<PackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

        public static final class Builder {
            private String buildType; 
            private java.util.List<PackageInstallationScripts> packageInstallationScripts; 

            private Builder() {
            } 

            private Builder(BuildConfig model) {
                this.buildType = model.buildType;
                this.packageInstallationScripts = model.packageInstallationScripts;
            } 

            /**
             * BuildType.
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * PackageInstallationScripts.
             */
            public Builder packageInstallationScripts(java.util.List<PackageInstallationScripts> packageInstallationScripts) {
                this.packageInstallationScripts = packageInstallationScripts;
                return this;
            }

            public BuildConfig build() {
                return new BuildConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateImageRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageRequest</p>
     */
    public static class Supported extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("TaskTypes")
        private java.util.List<String> taskTypes;

        private Supported(Builder builder) {
            this.module = builder.module;
            this.taskTypes = builder.taskTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Supported create() {
            return builder().build();
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return taskTypes
         */
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

        public static final class Builder {
            private String module; 
            private java.util.List<String> taskTypes; 

            private Builder() {
            } 

            private Builder(Supported model) {
                this.module = model.module;
                this.taskTypes = model.taskTypes;
            } 

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * TaskTypes.
             */
            public Builder taskTypes(java.util.List<String> taskTypes) {
                this.taskTypes = taskTypes;
                return this;
            }

            public Supported build() {
                return new Supported(this);
            } 

        } 

    }
}
