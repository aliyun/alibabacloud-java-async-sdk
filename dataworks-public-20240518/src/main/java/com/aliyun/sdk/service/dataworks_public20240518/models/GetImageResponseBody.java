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
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetImageResponseBody(Builder builder) {
        this.image = builder.image;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Image image; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetImageResponseBody model) {
            this.image = model.image;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Image.
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
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
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
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
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
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
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("AcrAssociatedVpcId")
        private String acrAssociatedVpcId;

        @com.aliyun.core.annotation.NameInMap("AcrEndpoint")
        private String acrEndpoint;

        @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("BuildConfig")
        private BuildConfig buildConfig;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableSyncMaxCompute")
        private Boolean enableSyncMaxCompute;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("ImageUri")
        private String imageUri;

        @com.aliyun.core.annotation.NameInMap("ImageVpcUri")
        private String imageVpcUri;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Official")
        private Boolean official;

        @com.aliyun.core.annotation.NameInMap("ProviderImageId")
        private String providerImageId;

        @com.aliyun.core.annotation.NameInMap("ProviderType")
        private String providerType;

        @com.aliyun.core.annotation.NameInMap("PublishStage")
        private String publishStage;

        @com.aliyun.core.annotation.NameInMap("RepositoryName")
        private String repositoryName;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Supported")
        private Supported supported;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Image(Builder builder) {
            this.accessibility = builder.accessibility;
            this.acrAssociatedVpcId = builder.acrAssociatedVpcId;
            this.acrEndpoint = builder.acrEndpoint;
            this.acrInstanceId = builder.acrInstanceId;
            this.buildConfig = builder.buildConfig;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.enableSyncMaxCompute = builder.enableSyncMaxCompute;
            this.id = builder.id;
            this.imageTag = builder.imageTag;
            this.imageUri = builder.imageUri;
            this.imageVpcUri = builder.imageVpcUri;
            this.isDefault = builder.isDefault;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.official = builder.official;
            this.providerImageId = builder.providerImageId;
            this.providerType = builder.providerType;
            this.publishStage = builder.publishStage;
            this.repositoryName = builder.repositoryName;
            this.size = builder.size;
            this.status = builder.status;
            this.supported = builder.supported;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
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
         * @return acrEndpoint
         */
        public String getAcrEndpoint() {
            return this.acrEndpoint;
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
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return imageVpcUri
         */
        public String getImageVpcUri() {
            return this.imageVpcUri;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
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
         * @return official
         */
        public Boolean getOfficial() {
            return this.official;
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
         * @return publishStage
         */
        public String getPublishStage() {
            return this.publishStage;
        }

        /**
         * @return repositoryName
         */
        public String getRepositoryName() {
            return this.repositoryName;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supported
         */
        public Supported getSupported() {
            return this.supported;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String accessibility; 
            private String acrAssociatedVpcId; 
            private String acrEndpoint; 
            private String acrInstanceId; 
            private BuildConfig buildConfig; 
            private Long createdTime; 
            private String creator; 
            private String description; 
            private Boolean enableSyncMaxCompute; 
            private String id; 
            private String imageTag; 
            private String imageUri; 
            private String imageVpcUri; 
            private Boolean isDefault; 
            private Long lastModifiedTime; 
            private String modifier; 
            private String name; 
            private String namespace; 
            private Boolean official; 
            private String providerImageId; 
            private String providerType; 
            private String publishStage; 
            private String repositoryName; 
            private String size; 
            private String status; 
            private Supported supported; 
            private String version; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.accessibility = model.accessibility;
                this.acrAssociatedVpcId = model.acrAssociatedVpcId;
                this.acrEndpoint = model.acrEndpoint;
                this.acrInstanceId = model.acrInstanceId;
                this.buildConfig = model.buildConfig;
                this.createdTime = model.createdTime;
                this.creator = model.creator;
                this.description = model.description;
                this.enableSyncMaxCompute = model.enableSyncMaxCompute;
                this.id = model.id;
                this.imageTag = model.imageTag;
                this.imageUri = model.imageUri;
                this.imageVpcUri = model.imageVpcUri;
                this.isDefault = model.isDefault;
                this.lastModifiedTime = model.lastModifiedTime;
                this.modifier = model.modifier;
                this.name = model.name;
                this.namespace = model.namespace;
                this.official = model.official;
                this.providerImageId = model.providerImageId;
                this.providerType = model.providerType;
                this.publishStage = model.publishStage;
                this.repositoryName = model.repositoryName;
                this.size = model.size;
                this.status = model.status;
                this.supported = model.supported;
                this.version = model.version;
            } 

            /**
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * AcrAssociatedVpcId.
             */
            public Builder acrAssociatedVpcId(String acrAssociatedVpcId) {
                this.acrAssociatedVpcId = acrAssociatedVpcId;
                return this;
            }

            /**
             * <p>ACR Endpoint</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder acrEndpoint(String acrEndpoint) {
                this.acrEndpoint = acrEndpoint;
                return this;
            }

            /**
             * AcrInstanceId.
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * BuildConfig.
             */
            public Builder buildConfig(BuildConfig buildConfig) {
                this.buildConfig = buildConfig;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableSyncMaxCompute.
             */
            public Builder enableSyncMaxCompute(Boolean enableSyncMaxCompute) {
                this.enableSyncMaxCompute = enableSyncMaxCompute;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageTag.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * ImageUri.
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * ImageVpcUri.
             */
            public Builder imageVpcUri(String imageVpcUri) {
                this.imageVpcUri = imageVpcUri;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Official.
             */
            public Builder official(Boolean official) {
                this.official = official;
                return this;
            }

            /**
             * ProviderImageId.
             */
            public Builder providerImageId(String providerImageId) {
                this.providerImageId = providerImageId;
                return this;
            }

            /**
             * ProviderType.
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * PublishStage.
             */
            public Builder publishStage(String publishStage) {
                this.publishStage = publishStage;
                return this;
            }

            /**
             * RepositoryName.
             */
            public Builder repositoryName(String repositoryName) {
                this.repositoryName = repositoryName;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Supported.
             */
            public Builder supported(Supported supported) {
                this.supported = supported;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
