// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateImageBuildRequest} extends {@link RequestModel}
 *
 * <p>CreateImageBuildRequest</p>
 */
public class CreateImageBuildRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private BuildConfig buildConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Image")
    @com.aliyun.core.annotation.Validation(required = true)
    private Image image;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageBuildJobName")
    private String imageBuildJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OverwriteImageTag")
    private Boolean overwriteImageTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Resource resource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetRegistry")
    @com.aliyun.core.annotation.Validation(required = true)
    private TargetRegistry targetRegistry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateImageBuildRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.accessibility = builder.accessibility;
        this.buildConfig = builder.buildConfig;
        this.image = builder.image;
        this.imageBuildJobName = builder.imageBuildJobName;
        this.overwriteImageTag = builder.overwriteImageTag;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.targetRegistry = builder.targetRegistry;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageBuildRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return buildConfig
     */
    public BuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return imageBuildJobName
     */
    public String getImageBuildJobName() {
        return this.imageBuildJobName;
    }

    /**
     * @return overwriteImageTag
     */
    public Boolean getOverwriteImageTag() {
        return this.overwriteImageTag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return targetRegistry
     */
    public TargetRegistry getTargetRegistry() {
        return this.targetRegistry;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateImageBuildRequest, Builder> {
        private String clientToken; 
        private String accessibility; 
        private BuildConfig buildConfig; 
        private Image image; 
        private String imageBuildJobName; 
        private Boolean overwriteImageTag; 
        private String regionId; 
        private Resource resource; 
        private TargetRegistry targetRegistry; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageBuildRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.accessibility = request.accessibility;
            this.buildConfig = request.buildConfig;
            this.image = request.image;
            this.imageBuildJobName = request.imageBuildJobName;
            this.overwriteImageTag = request.overwriteImageTag;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.targetRegistry = request.targetRegistry;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>镜像构建的可见性，可能值： - PUBLIC：当前工作空间所有成员都可以操作。 - PRIVATE：只有创建者可以操作。</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>构建配置，指定待构建的 Dockerfile 文件内容。</p>
         * <p>This parameter is required.</p>
         */
        public Builder buildConfig(BuildConfig buildConfig) {
            this.putBodyParameter("BuildConfig", buildConfig);
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder image(Image image) {
            this.putBodyParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * ImageBuildJobName.
         */
        public Builder imageBuildJobName(String imageBuildJobName) {
            this.putBodyParameter("ImageBuildJobName", imageBuildJobName);
            this.imageBuildJobName = imageBuildJobName;
            return this;
        }

        /**
         * <p>是否覆盖更新 ACR 镜像仓库中已存在的镜像 tag。</p>
         */
        public Builder overwriteImageTag(Boolean overwriteImageTag) {
            this.putBodyParameter("OverwriteImageTag", overwriteImageTag);
            this.overwriteImageTag = overwriteImageTag;
            return this;
        }

        /**
         * <p>代表region的资源属性字段</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>构建任务运行资源</p>
         * <p>This parameter is required.</p>
         */
        public Builder resource(Resource resource) {
            this.putBodyParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetRegistry(TargetRegistry targetRegistry) {
            this.putBodyParameter("TargetRegistry", targetRegistry);
            this.targetRegistry = targetRegistry;
            return this;
        }

        /**
         * <p>用户专有网络信息。使用企业版 ACR 实例时，此参数必填，指定在用户 ACR 实例的访问控制里已添加的专有网络。</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>镜像构建所属的工作空间ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateImageBuildRequest build() {
            return new CreateImageBuildRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class BuildConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("Dockerfile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dockerfile;

        @com.aliyun.core.annotation.NameInMap("RegistryAuths")
        private java.util.Map<String, ?> registryAuths;

        private BuildConfig(Builder builder) {
            this.buildType = builder.buildType;
            this.dockerfile = builder.dockerfile;
            this.registryAuths = builder.registryAuths;
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
         * @return dockerfile
         */
        public String getDockerfile() {
            return this.dockerfile;
        }

        /**
         * @return registryAuths
         */
        public java.util.Map<String, ?> getRegistryAuths() {
            return this.registryAuths;
        }

        public static final class Builder {
            private String buildType; 
            private String dockerfile; 
            private java.util.Map<String, ?> registryAuths; 

            private Builder() {
            } 

            private Builder(BuildConfig model) {
                this.buildType = model.buildType;
                this.dockerfile = model.dockerfile;
                this.registryAuths = model.registryAuths;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PackageInstallation</p>
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * <p>Dockerfile文件内容</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FROM ubuntu:18:04
             * RUN pip3 install numpy==1.19.5</p>
             */
            public Builder dockerfile(String dockerfile) {
                this.dockerfile = dockerfile;
                return this;
            }

            /**
             * RegistryAuths.
             */
            public Builder registryAuths(java.util.Map<String, ?> registryAuths) {
                this.registryAuths = registryAuths;
                return this;
            }

            public BuildConfig build() {
                return new BuildConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Uri")
        @com.aliyun.core.annotation.Validation(required = true)
        private String uri;

        private Image(Builder builder) {
            this.description = builder.description;
            this.labels = builder.labels;
            this.name = builder.name;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Labels> labels; 
            private String name; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.description = model.description;
                this.labels = model.labels;
                this.name = model.name;
                this.uri = model.uri;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-v1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user-test-registry-vpc.cn-wulanchabu.cr.aliyuncs.com/pai-test/pai-test:test-v1</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class ResourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        private ResourceConfig(Builder builder) {
            this.CPU = builder.CPU;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceConfig create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String CPU; 
            private String memory; 

            private Builder() {
            } 

            private Builder(ResourceConfig model) {
                this.CPU = model.CPU;
                this.memory = model.memory;
            } 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            public ResourceConfig build() {
                return new ResourceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsSpec")
        private String ecsSpec;

        @com.aliyun.core.annotation.NameInMap("ResourceConfig")
        private ResourceConfig resourceConfig;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resource(Builder builder) {
            this.ecsSpec = builder.ecsSpec;
            this.resourceConfig = builder.resourceConfig;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return ecsSpec
         */
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        /**
         * @return resourceConfig
         */
        public ResourceConfig getResourceConfig() {
            return this.resourceConfig;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String ecsSpec; 
            private ResourceConfig resourceConfig; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.ecsSpec = model.ecsSpec;
                this.resourceConfig = model.resourceConfig;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>后付费资源规格</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder ecsSpec(String ecsSpec) {
                this.ecsSpec = ecsSpec;
                return this;
            }

            /**
             * ResourceConfig.
             */
            public Builder resourceConfig(ResourceConfig resourceConfig) {
                this.resourceConfig = resourceConfig;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class TargetRegistry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private TargetRegistry(Builder builder) {
            this.instanceId = builder.instanceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetRegistry create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(TargetRegistry model) {
                this.instanceId = model.instanceId;
                this.type = model.type;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AcrEnterprise</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetRegistry build() {
                return new TargetRegistry(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateImageBuildRequest</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCidrs")
        private java.util.List<String> extendedCidrs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCidrs = builder.extendedCidrs;
            this.securityGroupId = builder.securityGroupId;
            this.switchId = builder.switchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCidrs
         */
        public java.util.List<String> getExtendedCidrs() {
            return this.extendedCidrs;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String defaultRoute; 
            private java.util.List<String> extendedCidrs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.defaultRoute = model.defaultRoute;
                this.extendedCidrs = model.extendedCidrs;
                this.securityGroupId = model.securityGroupId;
                this.switchId = model.switchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>默认路由网卡出口</p>
             * 
             * <strong>example:</strong>
             * <p>eth1</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>扩展网段</p>
             */
            public Builder extendedCidrs(java.util.List<String> extendedCidrs) {
                this.extendedCidrs = extendedCidrs;
                return this;
            }

            /**
             * <p>安全组 ID</p>
             * 
             * <strong>example:</strong>
             * <p>sg-abcdef**</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>交换机 ID</p>
             * 
             * <strong>example:</strong>
             * <p>vs-abcdef**</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>专有网络 ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-abcdef**</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
