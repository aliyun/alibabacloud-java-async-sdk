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
 * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageVersionsResponseBody</p>
 */
public class ListImageVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListImageVersionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
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
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListImageVersionsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The pagination details.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID, used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListImageVersionsResponseBody build() {
            return new ListImageVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageVersionsResponseBody</p>
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
             * <p>The script content. Separate multiple package names with a comma (,).</p>
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
     * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageVersionsResponseBody</p>
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
             * <p>The pre-installation scripts.</p>
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
     * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageVersionsResponseBody</p>
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
             * <p>The supported module. Valid value:</p>
             * <ul>
             * <li><code>Scheduler</code>: The scheduler module.</li>
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
             * <p>The supported task types.</p>
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
     * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageVersionsResponseBody</p>
     */
    public static class ImageVersions extends TeaModel {
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

        private ImageVersions(Builder builder) {
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

        public static ImageVersions create() {
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

            private Builder(ImageVersions model) {
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
             * <p>The accessibility of the image. Valid values:</p>
             * <ul>
             * <li><p><code>Public</code>: The image is visible to all users.</p>
             * </li>
             * <li><p><code>Private</code>: The image is visible only to the creator.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * <p>The ID of the VPC associated with the ACR instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder acrAssociatedVpcId(String acrAssociatedVpcId) {
                this.acrAssociatedVpcId = acrAssociatedVpcId;
                return this;
            }

            /**
             * <p>The ACR endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder acrEndpoint(String acrEndpoint) {
                this.acrEndpoint = acrEndpoint;
                return this;
            }

            /**
             * <p>The ACR instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xxx</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The image build configuration.</p>
             */
            public Builder buildConfig(BuildConfig buildConfig) {
                this.buildConfig = buildConfig;
                return this;
            }

            /**
             * <p>The time when the image was created, as a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the image.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The image description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test image created by xxx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether MaxCompute synchronization is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSyncMaxCompute(Boolean enableSyncMaxCompute) {
                this.enableSyncMaxCompute = enableSyncMaxCompute;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom_image_xxxx_xxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The image URI.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * <p>The VPC URI of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
             */
            public Builder imageVpcUri(String imageVpcUri) {
                this.imageVpcUri = imageVpcUri;
                return this;
            }

            /**
             * <p>Indicates whether the image is the default image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The time when the image was last modified, as a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the image.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks_image</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Indicates whether the image is an official image.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder official(Boolean official) {
                this.official = official;
                return this;
            }

            /**
             * <p>The ID of the image from the provider.</p>
             * 
             * <strong>example:</strong>
             * <p>acr_image_id</p>
             */
            public Builder providerImageId(String providerImageId) {
                this.providerImageId = providerImageId;
                return this;
            }

            /**
             * <p>The type of the image provider. Valid values:</p>
             * <ul>
             * <li><p><code>ACR</code>: The image is from an ACR repository.</p>
             * </li>
             * <li><p><code>DataWorks</code>: The image is an official image provided by DataWorks.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACR</p>
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * <p>The publishing stage of the image. Valid values:</p>
             * <ul>
             * <li><p><code>Untest</code>: Not tested.</p>
             * </li>
             * <li><p><code>Testing</code>: Being tested.</p>
             * </li>
             * <li><p><code>TestFailed</code>: Test failed.</p>
             * </li>
             * <li><p><code>Unpublished</code>: Not published.</p>
             * </li>
             * <li><p><code>Publishing</code>: Being published.</p>
             * </li>
             * <li><p><code>Published</code>: Published.</p>
             * </li>
             * <li><p><code>PublishFailed</code>: Publishing failed.</p>
             * </li>
             * <li><p><code>Building</code>: Being built.</p>
             * </li>
             * <li><p><code>BuildSuccess</code>: Build succeeded.</p>
             * </li>
             * <li><p><code>BuildFailed</code>: Build failed.</p>
             * </li>
             * <li><p><code>Accelerating</code>: Being accelerated.</p>
             * </li>
             * <li><p><code>AccelerateSuccess</code>: Acceleration succeeded.</p>
             * </li>
             * <li><p><code>AccelerateFailed</code>: Acceleration failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder publishStage(String publishStage) {
                this.publishStage = publishStage;
                return this;
            }

            /**
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>repo_name</p>
             */
            public Builder repositoryName(String repositoryName) {
                this.repositoryName = repositoryName;
                return this;
            }

            /**
             * <p>The image size.</p>
             * 
             * <strong>example:</strong>
             * <p>1GB</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the image. Valid values:</p>
             * <ul>
             * <li><p><code>Disabled</code>: The image is disabled.</p>
             * </li>
             * <li><p><code>Expired</code>: The image is expired.</p>
             * </li>
             * <li><p><code>Available</code>: The image is available.</p>
             * </li>
             * <li><p><code>ReadOnly</code>: The image is read-only.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The supported modules and task types.</p>
             */
            public Builder supported(Supported supported) {
                this.supported = supported;
                return this;
            }

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ImageVersions build() {
                return new ImageVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImageVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageVersionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageVersions")
        private java.util.List<ImageVersions> imageVersions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.imageVersions = builder.imageVersions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return imageVersions
         */
        public java.util.List<ImageVersions> getImageVersions() {
            return this.imageVersions;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ImageVersions> imageVersions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.imageVersions = model.imageVersions;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of image version details.</p>
             */
            public Builder imageVersions(java.util.List<ImageVersions> imageVersions) {
                this.imageVersions = imageVersions;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
