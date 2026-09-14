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
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrAssociatedVpcId")
    private String acrAssociatedVpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildConfig")
    private BuildConfig buildConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSyncMaxCompute")
    private Boolean enableSyncMaxCompute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUri")
    private String imageUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderImageId")
    private String providerImageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RepositoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Supported")
    @com.aliyun.core.annotation.Validation(required = true)
    private Supported supported;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessibility = builder.accessibility;
        this.acrAssociatedVpcId = builder.acrAssociatedVpcId;
        this.acrInstanceId = builder.acrInstanceId;
        this.buildConfig = builder.buildConfig;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.enableSyncMaxCompute = builder.enableSyncMaxCompute;
        this.imageUri = builder.imageUri;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.providerImageId = builder.providerImageId;
        this.providerType = builder.providerType;
        this.repositoryName = builder.repositoryName;
        this.supported = builder.supported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableSyncMaxCompute
     */
    public Boolean getEnableSyncMaxCompute() {
        return this.enableSyncMaxCompute;
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
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
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

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String regionId; 
        private String accessibility; 
        private String acrAssociatedVpcId; 
        private String acrInstanceId; 
        private BuildConfig buildConfig; 
        private String clientToken; 
        private String description; 
        private Boolean enableSyncMaxCompute; 
        private String imageUri; 
        private String name; 
        private String namespace; 
        private String providerImageId; 
        private String providerType; 
        private String repositoryName; 
        private Supported supported; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessibility = request.accessibility;
            this.acrAssociatedVpcId = request.acrAssociatedVpcId;
            this.acrInstanceId = request.acrInstanceId;
            this.buildConfig = request.buildConfig;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.enableSyncMaxCompute = request.enableSyncMaxCompute;
            this.imageUri = request.imageUri;
            this.name = request.name;
            this.namespace = request.namespace;
            this.providerImageId = request.providerImageId;
            this.providerType = request.providerType;
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
         * <p>The image visibility. Valid values:</p>
         * <ul>
         * <li>Public: visible to all users.</li>
         * <li>Private: visible only to the creator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The VPC ID associated with the ACR instance. This parameter is required when referencing an ACR image.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        public Builder acrAssociatedVpcId(String acrAssociatedVpcId) {
            this.putBodyParameter("AcrAssociatedVpcId", acrAssociatedVpcId);
            this.acrAssociatedVpcId = acrAssociatedVpcId;
            return this;
        }

        /**
         * <p>The ACR instance ID. This parameter is required when referencing an ACR image.</p>
         * 
         * <strong>example:</strong>
         * <p>acr_instance_id</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putBodyParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The image build configuration.</p>
         */
        public Builder buildConfig(BuildConfig buildConfig) {
            String buildConfigShrink = shrink(buildConfig, "BuildConfig", "json");
            this.putBodyParameter("BuildConfig", buildConfigShrink);
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * <p>The client idempotency token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dasfsd-94fqwe-da8d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The image description, up to 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>create by xxxx</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to synchronize the image to MaxCompute. Specify this parameter when referencing an ACR image. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSyncMaxCompute(Boolean enableSyncMaxCompute) {
            this.putBodyParameter("EnableSyncMaxCompute", enableSyncMaxCompute);
            this.enableSyncMaxCompute = enableSyncMaxCompute;
            return this;
        }

        /**
         * <p>The image URI. This parameter is required when referencing an ACR image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.cr.aliyuncs.com/namespace/image:0.1.0</p>
         */
        public Builder imageUri(String imageUri) {
            this.putBodyParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * <p>The image name, which can contain lowercase letters, digits, and underscores (_), up to 128 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task_image_001</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The image namespace. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace_name</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The image ID from the image provider. This parameter is required when referencing a DataWorks official image.</p>
         * 
         * <strong>example:</strong>
         * <p>System_shell_20251201</p>
         */
        public Builder providerImageId(String providerImageId) {
            this.putBodyParameter("ProviderImageId", providerImageId);
            this.providerImageId = providerImageId;
            return this;
        }

        /**
         * <p>The image reference data type. Valid values:</p>
         * <ul>
         * <li>ACR: ACR image repository.</li>
         * <li>DataWorks: DataWorks official image.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        public Builder providerType(String providerType) {
            this.putBodyParameter("ProviderType", providerType);
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>The image repository name. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>repo_name</p>
         */
        public Builder repositoryName(String repositoryName) {
            this.putBodyParameter("RepositoryName", repositoryName);
            this.repositoryName = repositoryName;
            return this;
        }

        /**
         * <p>The image sub-purpose.</p>
         * <p>This parameter is required.</p>
         */
        public Builder supported(Supported supported) {
            String supportedShrink = shrink(supported, "Supported", "json");
            this.putBodyParameter("Supported", supportedShrink);
            this.supported = supported;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
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
             * <p>The script content. If the content consists of package names, separate them with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>requests</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The script type.</p>
             * 
             * <strong>example:</strong>
             * <p>Python3</p>
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
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
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
             * <p>The build type.</p>
             * 
             * <strong>example:</strong>
             * <p>PackageInstallation</p>
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * <p>The list of pre-installation scripts.</p>
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
     * {@link CreateImageRequest} extends {@link TeaModel}
     *
     * <p>CreateImageRequest</p>
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
             * <p>The image sub-module. Valid values:</p>
             * <ul>
             * <li>Scheduler: DataStudio.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The list of supported node types.</p>
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
