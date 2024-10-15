// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfo")
    private java.util.List < AcrRegistryInfo> acrRegistryInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageCacheName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheSize")
    private Integer imageCacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredential")
    private java.util.List < ImageRegistryCredential> imageRegistryCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsecureRegistry")
    private String insecureRegistry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlainHttpRegistry")
    private String plainHttpRegistry;

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
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateImageCacheRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfo = builder.acrRegistryInfo;
        this.annotations = builder.annotations;
        this.autoMatchImageCache = builder.autoMatchImageCache;
        this.clientToken = builder.clientToken;
        this.eipInstanceId = builder.eipInstanceId;
        this.eliminationStrategy = builder.eliminationStrategy;
        this.flash = builder.flash;
        this.flashCopyCount = builder.flashCopyCount;
        this.image = builder.image;
        this.imageCacheName = builder.imageCacheName;
        this.imageCacheSize = builder.imageCacheSize;
        this.imageRegistryCredential = builder.imageRegistryCredential;
        this.insecureRegistry = builder.insecureRegistry;
        this.osType = builder.osType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plainHttpRegistry = builder.plainHttpRegistry;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retentionDays = builder.retentionDays;
        this.securityGroupId = builder.securityGroupId;
        this.standardCopyCount = builder.standardCopyCount;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
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
     * @return acrRegistryInfo
     */
    public java.util.List < AcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
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
    public java.util.List < String > getImage() {
        return this.image;
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
    public java.util.List < ImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    /**
     * @return insecureRegistry
     */
    public String getInsecureRegistry() {
        return this.insecureRegistry;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return plainHttpRegistry
     */
    public String getPlainHttpRegistry() {
        return this.plainHttpRegistry;
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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateImageCacheRequest, Builder> {
        private java.util.List < AcrRegistryInfo> acrRegistryInfo; 
        private String annotations; 
        private Boolean autoMatchImageCache; 
        private String clientToken; 
        private String eipInstanceId; 
        private String eliminationStrategy; 
        private Boolean flash; 
        private Integer flashCopyCount; 
        private java.util.List < String > image; 
        private String imageCacheName; 
        private Integer imageCacheSize; 
        private java.util.List < ImageRegistryCredential> imageRegistryCredential; 
        private String insecureRegistry; 
        private String osType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plainHttpRegistry; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retentionDays; 
        private String securityGroupId; 
        private Integer standardCopyCount; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageCacheRequest request) {
            super(request);
            this.acrRegistryInfo = request.acrRegistryInfo;
            this.annotations = request.annotations;
            this.autoMatchImageCache = request.autoMatchImageCache;
            this.clientToken = request.clientToken;
            this.eipInstanceId = request.eipInstanceId;
            this.eliminationStrategy = request.eliminationStrategy;
            this.flash = request.flash;
            this.flashCopyCount = request.flashCopyCount;
            this.image = request.image;
            this.imageCacheName = request.imageCacheName;
            this.imageCacheSize = request.imageCacheSize;
            this.imageRegistryCredential = request.imageRegistryCredential;
            this.insecureRegistry = request.insecureRegistry;
            this.osType = request.osType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plainHttpRegistry = request.plainHttpRegistry;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retentionDays = request.retentionDays;
            this.securityGroupId = request.securityGroupId;
            this.standardCopyCount = request.standardCopyCount;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Information about the Container Registry Enterprise Edition instance. For more information, see <a href="https://help.aliyun.com/document_detail/194250.html">Pull images from a Container Registry Enterprise Edition instance without using secrets</a>.</p>
         */
        public Builder acrRegistryInfo(java.util.List < AcrRegistryInfo> acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * <p>Comments.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>Specifies whether to enable reuse of image cache layers. If you enable this feature, and the image cache that you want to create and an existing image cache contain duplicate image layers, the system reuses the duplicate image layers to create the new image cache. This accelerates the creation of the image cache. Valid values:</p>
         * <ul>
         * <li>true: enables reuse of image cache layers.</li>
         * <li>false: disables reuse of image cache layers.</li>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure the idempotence of a request</a>.</p>
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
         * <p>The ID of the elastic IP address (EIP). If you want to pull images over the Internet, make sure that the elastic container instance can access the Internet. You can configure an EIP or a NAT gateway for the elastic container instance to access the Internet.</p>
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
         * <p>The elimination policy of the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
         * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least commonly used.</p>
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
         * <p>The number of temporary local snapshots. By default, the system creates one snapshot for each image cache. If an image cache is used to create multiple elastic container instances at a time, we recommend that you set this parameter to create multiple snapshots for the image cache. We recommend that you create one snapshot for creation of every 1,000 elastic container instances.</p>
         * <blockquote>
         * <p> If you set the Flash parameter to true, instant image cache is enabled. During the creation of the image cache, the system first creates a temporary local snapshot for you to instantly use the snapshot. After the temporary local snapshot is created, the system begins to create a regular snapshot. After the regular snapshot is created, the temporary local snapshot is automatically deleted.</p>
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
         * <p>Container image N that is used to create the image cache.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:1.15.10-perl</p>
         */
        public Builder image(java.util.List < String > image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The name of the image cache.</p>
         * <p>This parameter is required.</p>
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
         * <p>The image repository.</p>
         */
        public Builder imageRegistryCredential(java.util.List < ImageRegistryCredential> imageRegistryCredential) {
            this.putQueryParameter("ImageRegistryCredential", imageRegistryCredential);
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * <p>The address of the self-managed image repository.</p>
         * <p>When you create an image cache by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This can prevent the image from failing to pull due to certificate authentication failures.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
         */
        public Builder insecureRegistry(String insecureRegistry) {
            this.putQueryParameter("InsecureRegistry", insecureRegistry);
            this.insecureRegistry = insecureRegistry;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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
         * <p>The address of the self-managed image repository. When you create an image cache by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This way, Elastic Container Instance uses the HTTP protocol instead of the default HTTPS protocol to pull the image. This can prevent the image from failing to pull due to different protocols.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
         */
        public Builder plainHttpRegistry(String plainHttpRegistry) {
            this.putQueryParameter("PlainHttpRegistry", plainHttpRegistry);
            this.plainHttpRegistry = plainHttpRegistry;
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
         * <p>The retention period of the image cache. Unit: days. When the retention period ends, the image cache expires and is deleted. By default, image caches never expire.</p>
         * <blockquote>
         * <p> The image caches that fail to be created are only retained for one day.</p>
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
         * <p>The ID of the security group.</p>
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
         * <p>The number of regular snapshots. By default, the system creates one snapshot for each image cache. If an image cache is used to create multiple elastic container instances at a time, we recommend that you set this parameter to create multiple snapshots for the image cache. We recommend that you create one snapshot for creation of every 1,000 elastic container instances.</p>
         * <blockquote>
         * <p> If you set the Flash parameter to false, instant image cache is disabled. In this case, only regular snapshots are generated during the creation of the image cache.</p>
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
         * <p>The tag of the image cache.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. You can specify up to 10 vSwitch IDs. Separate multiple vSwitch IDs with commas (,). Example: <code>vsw-***,vsw-***</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6h3rbwbm90urjwa****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
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
    public static class AcrRegistryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArnService")
        private String arnService;

        @com.aliyun.core.annotation.NameInMap("ArnUser")
        private String arnUser;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List < String > domain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfo(Builder builder) {
            this.arnService = builder.arnService;
            this.arnUser = builder.arnUser;
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
         * @return arnService
         */
        public String getArnService() {
            return this.arnService;
        }

        /**
         * @return arnUser
         */
        public String getArnUser() {
            return this.arnUser;
        }

        /**
         * @return domain
         */
        public java.util.List < String > getDomain() {
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
            private String arnService; 
            private String arnUser; 
            private java.util.List < String > domain; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM roles in the Alibaba Cloud account to which the elastic container instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1609982529******:role/role-assume</p>
             */
            public Builder arnService(String arnService) {
                this.arnService = arnService;
                return this;
            }

            /**
             * <p>The ARN of the RAM roles in the Alibaba Cloud account to which the Container Registry Enterprise Edition instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1298452580******:role/role-acr</p>
             */
            public Builder arnUser(String arnUser) {
                this.arnUser = arnUser;
                return this;
            }

            /**
             * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>test****-registry.cn-beijing.cr.aliyuncs.com</p>
             */
            public Builder domain(java.util.List < String > domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of Container Registry Enterprise Edition instance N.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of Container Registry Enterprise Edition instance N.</p>
             * 
             * <strong>example:</strong>
             * <p>test****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID of Container Registry Enterprise Edition instance N.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
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

            /**
             * <p>The password that is used to log on to image repository N.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The address of the image repository without the <code>http://</code> or <code>https://</code> prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username that is used to log on to image repository N.</p>
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
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
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

            /**
             * <p>The key of tag N of the image cache. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the image cache. Valid values of N: 1 to 20.</p>
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
