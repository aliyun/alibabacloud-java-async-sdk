// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link CreateImageCacheRequest} extends {@link RequestModel}
 *
 * <p>CreateImageCacheRequest</p>
 */
public class CreateImageCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfos")
    private java.util.List<AcrRegistryInfos> acrRegistryInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBaseImageCacheMatch")
    private Boolean enableBaseImageCacheMatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String imageCacheName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredentials")
    private java.util.List<ImageRegistryCredentials> imageRegistryCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateImageCacheRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfos = builder.acrRegistryInfos;
        this.clientToken = builder.clientToken;
        this.enableBaseImageCacheMatch = builder.enableBaseImageCacheMatch;
        this.imageCacheName = builder.imageCacheName;
        this.imageRegistryCredentials = builder.imageRegistryCredentials;
        this.images = builder.images;
        this.networkConfig = builder.networkConfig;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrRegistryInfos
     */
    public java.util.List<AcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableBaseImageCacheMatch
     */
    public Boolean getEnableBaseImageCacheMatch() {
        return this.enableBaseImageCacheMatch;
    }

    /**
     * @return imageCacheName
     */
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    /**
     * @return imageRegistryCredentials
     */
    public java.util.List<ImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    /**
     * @return images
     */
    public java.util.List<String> getImages() {
        return this.images;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateImageCacheRequest, Builder> {
        private java.util.List<AcrRegistryInfos> acrRegistryInfos; 
        private String clientToken; 
        private Boolean enableBaseImageCacheMatch; 
        private String imageCacheName; 
        private java.util.List<ImageRegistryCredentials> imageRegistryCredentials; 
        private java.util.List<String> images; 
        private NetworkConfig networkConfig; 
        private String platform; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageCacheRequest request) {
            super(request);
            this.acrRegistryInfos = request.acrRegistryInfos;
            this.clientToken = request.clientToken;
            this.enableBaseImageCacheMatch = request.enableBaseImageCacheMatch;
            this.imageCacheName = request.imageCacheName;
            this.imageRegistryCredentials = request.imageRegistryCredentials;
            this.images = request.images;
            this.networkConfig = request.networkConfig;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.type = request.type;
        } 

        /**
         * <p>The ACR Enterprise instance information.</p>
         */
        public Builder acrRegistryInfos(java.util.List<AcrRegistryInfos> acrRegistryInfos) {
            this.putQueryParameter("AcrRegistryInfos", acrRegistryInfos);
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>7f3a2c18-6c47-4eb7-a6bb-8432a394a620</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable base image cache matching. Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableBaseImageCacheMatch(Boolean enableBaseImageCacheMatch) {
            this.putQueryParameter("EnableBaseImageCacheMatch", enableBaseImageCacheMatch);
            this.enableBaseImageCacheMatch = enableBaseImageCacheMatch;
            return this;
        }

        /**
         * <p>The name of the image cache.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-imc</p>
         */
        public Builder imageCacheName(String imageCacheName) {
            this.putQueryParameter("ImageCacheName", imageCacheName);
            this.imageCacheName = imageCacheName;
            return this;
        }

        /**
         * <p>The credentials of the image registry.</p>
         */
        public Builder imageRegistryCredentials(java.util.List<ImageRegistryCredentials> imageRegistryCredentials) {
            this.putQueryParameter("ImageRegistryCredentials", imageRegistryCredentials);
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        /**
         * <p>The container images used to create the image cache. Currently, only one image is supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder images(java.util.List<String> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The network configurations for pulling images when creating the image cache.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            String networkConfigShrink = shrink(networkConfig, "NetworkConfig", "json");
            this.putQueryParameter("NetworkConfig", networkConfigShrink);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The platform type of the image cache. Valid values: linux/amd64 and windows/amd64. Default value: linux/amd64.</p>
         * 
         * <strong>example:</strong>
         * <p>windows/amd64</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzh43v*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags of the image cache. You can specify up to 20 tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the image cache. Valid values: <code>General</code> and <code>Base</code>. Default value: <code>General</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateImageCacheRequest build() {
            return new CreateImageCacheRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class AcrRegistryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AcrRegistryInfos model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the ACR Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region to which the ACR Enterprise instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfos build() {
                return new AcrRegistryInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class ImageRegistryCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("SkipCertVerification")
        private Boolean skipCertVerification;

        @com.aliyun.core.annotation.NameInMap("UsePlainHttp")
        private Boolean usePlainHttp;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private ImageRegistryCredentials(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.skipCertVerification = builder.skipCertVerification;
            this.usePlainHttp = builder.usePlainHttp;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredentials create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return skipCertVerification
         */
        public Boolean getSkipCertVerification() {
            return this.skipCertVerification;
        }

        /**
         * @return usePlainHttp
         */
        public Boolean getUsePlainHttp() {
            return this.usePlainHttp;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String server; 
            private Boolean skipCertVerification; 
            private Boolean usePlainHttp; 
            private String username; 

            private Builder() {
            } 

            private Builder(ImageRegistryCredentials model) {
                this.password = model.password;
                this.server = model.server;
                this.skipCertVerification = model.skipCertVerification;
                this.usePlainHttp = model.usePlainHttp;
                this.username = model.username;
            } 

            /**
             * <p>The password of the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>mypassword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The address of the image registry without the http:// or https:// prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>Specifies whether to skip certificate verification when you create an image cache by using images from a self-managed image registry that uses a self-signed certificate to prevent image pull failures caused by certificate verification failures.
             * Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipCertVerification(Boolean skipCertVerification) {
                this.skipCertVerification = skipCertVerification;
                return this;
            }

            /**
             * <p>Specifies whether the service uses the HTTP protocol to pull images to prevent image pull failures caused by protocol mismatches.
             * Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder usePlainHttp(Boolean usePlainHttp) {
                this.usePlainHttp = usePlainHttp;
                return this;
            }

            /**
             * <p>The username of the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>myusername</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ImageRegistryCredentials build() {
                return new ImageRegistryCredentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class EipInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreate")
        private Boolean autoCreate;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private EipInstance(Builder builder) {
            this.autoCreate = builder.autoCreate;
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInstance create() {
            return builder().build();
        }

        /**
         * @return autoCreate
         */
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean autoCreate; 
            private Integer bandwidth; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(EipInstance model) {
                this.autoCreate = model.autoCreate;
                this.bandwidth = model.bandwidth;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>Specifies whether automatic creation of an EIP is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreate(Boolean autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * <p>The bandwidth of the EIP for automatic creation. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The elastic IP address. This parameter takes precedence. If you specify this parameter, other parameters are ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-0jl0bx3fnpnjc9i4*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public EipInstance build() {
                return new EipInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipInstance")
        private EipInstance eipInstance;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> vSwitchIds;

        private NetworkConfig(Builder builder) {
            this.eipInstance = builder.eipInstance;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return eipInstance
         */
        public EipInstance getEipInstance() {
            return this.eipInstance;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private EipInstance eipInstance; 
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.eipInstance = model.eipInstance;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The configurations of the elastic IP address (EIP) instance.</p>
             */
            public Builder eipInstance(EipInstance eipInstance) {
                this.eipInstance = eipInstance;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-0jlgektkddwa42n*****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches. You can specify up to 10 vSwitch IDs. One of the vSwitches is selected to pull the image.</p>
             * <p>This parameter is required.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
