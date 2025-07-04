// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
 * {@link UpdateImageCacheRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageCacheRequest</p>
 */
public class UpdateImageCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfo")
    private java.util.List<AcrRegistryInfo> acrRegistryInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoMatchImageCache")
    private Boolean autoMatchImageCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipInstanceId")
    private String eipInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EliminationStrategy")
    private String eliminationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Flash")
    private Boolean flash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashCopyCount")
    private Integer flashCopyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private java.util.List<String> image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageCacheId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheName")
    private String imageCacheName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheSize")
    private Integer imageCacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredential")
    private java.util.List<ImageRegistryCredential> imageRegistryCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardCopyCount")
    private Integer standardCopyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private UpdateImageCacheRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfo = builder.acrRegistryInfo;
        this.autoMatchImageCache = builder.autoMatchImageCache;
        this.clientToken = builder.clientToken;
        this.eipInstanceId = builder.eipInstanceId;
        this.eliminationStrategy = builder.eliminationStrategy;
        this.flash = builder.flash;
        this.flashCopyCount = builder.flashCopyCount;
        this.image = builder.image;
        this.imageCacheId = builder.imageCacheId;
        this.imageCacheName = builder.imageCacheName;
        this.imageCacheSize = builder.imageCacheSize;
        this.imageRegistryCredential = builder.imageRegistryCredential;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retentionDays = builder.retentionDays;
        this.securityGroupId = builder.securityGroupId;
        this.standardCopyCount = builder.standardCopyCount;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrRegistryInfo
     */
    public java.util.List<AcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    /**
     * @return autoMatchImageCache
     */
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return eipInstanceId
     */
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    /**
     * @return eliminationStrategy
     */
    public String getEliminationStrategy() {
        return this.eliminationStrategy;
    }

    /**
     * @return flash
     */
    public Boolean getFlash() {
        return this.flash;
    }

    /**
     * @return flashCopyCount
     */
    public Integer getFlashCopyCount() {
        return this.flashCopyCount;
    }

    /**
     * @return image
     */
    public java.util.List<String> getImage() {
        return this.image;
    }

    /**
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    /**
     * @return imageCacheName
     */
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    /**
     * @return imageCacheSize
     */
    public Integer getImageCacheSize() {
        return this.imageCacheSize;
    }

    /**
     * @return imageRegistryCredential
     */
    public java.util.List<ImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return standardCopyCount
     */
    public Integer getStandardCopyCount() {
        return this.standardCopyCount;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<UpdateImageCacheRequest, Builder> {
        private java.util.List<AcrRegistryInfo> acrRegistryInfo; 
        private Boolean autoMatchImageCache; 
        private String clientToken; 
        private String eipInstanceId; 
        private String eliminationStrategy; 
        private Boolean flash; 
        private Integer flashCopyCount; 
        private java.util.List<String> image; 
        private String imageCacheId; 
        private String imageCacheName; 
        private Integer imageCacheSize; 
        private java.util.List<ImageRegistryCredential> imageRegistryCredential; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retentionDays; 
        private String securityGroupId; 
        private Integer standardCopyCount; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageCacheRequest request) {
            super(request);
            this.acrRegistryInfo = request.acrRegistryInfo;
            this.autoMatchImageCache = request.autoMatchImageCache;
            this.clientToken = request.clientToken;
            this.eipInstanceId = request.eipInstanceId;
            this.eliminationStrategy = request.eliminationStrategy;
            this.flash = request.flash;
            this.flashCopyCount = request.flashCopyCount;
            this.image = request.image;
            this.imageCacheId = request.imageCacheId;
            this.imageCacheName = request.imageCacheName;
            this.imageCacheSize = request.imageCacheSize;
            this.imageRegistryCredential = request.imageRegistryCredential;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retentionDays = request.retentionDays;
            this.securityGroupId = request.securityGroupId;
            this.standardCopyCount = request.standardCopyCount;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The information about the Container Registry Enterprise Edition instance.</p>
         */
        public Builder acrRegistryInfo(java.util.List<AcrRegistryInfo> acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * <p>Specifies whether to enable reuse of image cache layers. If you enable this feature and the image cache that you want to create and an existing image cache contain duplicate image layers, the system reuses the duplicate image layers to create the new image cache. This accelerates the creation of the image cache. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
            this.putQueryParameter("AutoMatchImageCache", autoMatchImageCache);
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure the idempotence of a request?</a></p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-xxx-xxx-xxxx-42665544xxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the elastic IP address (EIP). If you want to pull public images, you must make sure that the elastic container instance can access the Internet. To enable Internet access, you can configure an EIP or a NAT gateway for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-2zedsm5mfl3uhdj2d****</p>
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * <p>The elimination policy for the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
         * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least recently used.</p>
         * 
         * <strong>example:</strong>
         * <p>LRU</p>
         */
        public Builder eliminationStrategy(String eliminationStrategy) {
            this.putQueryParameter("EliminationStrategy", eliminationStrategy);
            this.eliminationStrategy = eliminationStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to enable the instant image cache feature. The feature can accelerate the creation of image caches. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder flash(Boolean flash) {
            this.putQueryParameter("Flash", flash);
            this.flash = flash;
            return this;
        }

        /**
         * <p>The number of duplicates of temporary local snapshots. By default, the system creates one snapshot for each image cache. If you use the image cache to create multiple elastic container instances at a time, we recommend that you configure this parameter to create multiple snapshot duplicates for the image cache. We recommend that you create one snapshot duplicate for creation of every 1,000 elastic container instances.</p>
         * <blockquote>
         * <p>If you enable the instant image cache feature by setting Flash to true, a local snapshot is first created during the creation of the image cache. After the local snapshot is created, regular snapshots start to be created. After the regular snapshots are created, the local snapshot is automatically deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder flashCopyCount(Integer flashCopyCount) {
            this.putQueryParameter("FlashCopyCount", flashCopyCount);
            this.flashCopyCount = flashCopyCount;
            return this;
        }

        /**
         * <p>Container images that are used to create the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:1.15.10-perl</p>
         */
        public Builder image(java.util.List<String> image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The ID of the image cache.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-bp195erqe9o2pb09****</p>
         */
        public Builder imageCacheId(String imageCacheId) {
            this.putQueryParameter("ImageCacheId", imageCacheId);
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * <p>The name of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>testcache</p>
         */
        public Builder imageCacheName(String imageCacheName) {
            this.putQueryParameter("ImageCacheName", imageCacheName);
            this.imageCacheName = imageCacheName;
            return this;
        }

        /**
         * <p>The size of the image cache. Unit: GiB. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder imageCacheSize(Integer imageCacheSize) {
            this.putQueryParameter("ImageCacheSize", imageCacheSize);
            this.imageCacheSize = imageCacheSize;
            return this;
        }

        /**
         * <p>The information about the image repository.</p>
         */
        public Builder imageRegistryCredential(java.util.List<ImageRegistryCredential> imageRegistryCredential) {
            this.putQueryParameter("ImageRegistryCredential", imageRegistryCredential);
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the image cache.</p>
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
         * <p>The ID of the resource group to which the image cache belongs.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The retention period of the image cache. Unit: days. When the retention period elapses, the image cache expires and is deleted. By default, image caches never expire.</p>
         * <blockquote>
         * <p>The image caches that fail to be created are retained for only 1 day.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The ID of the security group to which the image cache belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf66jeqopgqa9hdn****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The number of duplicates of regular snapshots. By default, the system creates one snapshot for each image cache. If you use the image cache to create multiple elastic container instances at a time, we recommend that you configure this parameter to create multiple snapshot duplicates for the image cache. We recommend that you create one snapshot duplicate for creation of every 1,000 elastic container instances.</p>
         * <blockquote>
         * <p>If you disable the instant image cache feature by setting Flash to false, only regular snapshots are generated when you create an image cache.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder standardCopyCount(Integer standardCopyCount) {
            this.putQueryParameter("StandardCopyCount", standardCopyCount);
            this.standardCopyCount = standardCopyCount;
            return this;
        }

        /**
         * <p>The tags to add to the image cache. A maximum of 20 tags can be added to the image cache.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the image cache is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6h3rbwbm90urjwa****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public UpdateImageCacheRequest build() {
            return new UpdateImageCacheRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageCacheRequest</p>
     */
    public static class AcrRegistryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List<String> domain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfo(Builder builder) {
            this.domain = builder.domain;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfo create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List<String> domain; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AcrRegistryInfo model) {
                this.domain = model.domain;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>test****-registry.cn-hangzhou.cr.aliyuncs.com</p>
             */
            public Builder domain(java.util.List<String> domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfo build() {
                return new AcrRegistryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageCacheRequest</p>
     */
    public static class ImageRegistryCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private ImageRegistryCredential(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredential create() {
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String server; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ImageRegistryCredential model) {
                this.password = model.password;
                this.server = model.server;
                this.userName = model.userName;
            } 

            /**
             * <p>The password that is used to access the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The image repository address without <code>http://</code> or <code>https://</code> as a prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username that is used to access the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ImageRegistryCredential build() {
                return new ImageRegistryCredential(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>UpdateImageCacheRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N to add to the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
