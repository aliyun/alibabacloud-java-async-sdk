// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeRecommendInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecommendInstanceTypeRequest</p>
 */
public class DescribeRecommendInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private java.util.List<String> instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoOptimized")
    private String ioOptimized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPrice")
    private Float maxPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneMatchMode")
    private String zoneMatchMode;

    private DescribeRecommendInstanceTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.cores = builder.cores;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceType = builder.instanceType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.ioOptimized = builder.ioOptimized;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priorityStrategy = builder.priorityStrategy;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scene = builder.scene;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.zoneId = builder.zoneId;
        this.zoneMatchMode = builder.zoneMatchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendInstanceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeFamily
     */
    public java.util.List<String> getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneMatchMode
     */
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendInstanceTypeRequest, Builder> {
        private String sourceRegionId; 
        private Integer cores; 
        private String instanceChargeType; 
        private String instanceFamilyLevel; 
        private String instanceType; 
        private java.util.List<String> instanceTypeFamily; 
        private String ioOptimized; 
        private Float maxPrice; 
        private Float memory; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String priorityStrategy; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scene; 
        private String spotStrategy; 
        private String systemDiskCategory; 
        private String zoneId; 
        private String zoneMatchMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendInstanceTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.cores = request.cores;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceType = request.instanceType;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.ioOptimized = request.ioOptimized;
            this.maxPrice = request.maxPrice;
            this.memory = request.memory;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priorityStrategy = request.priorityStrategy;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scene = request.scene;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskCategory = request.systemDiskCategory;
            this.zoneId = request.zoneId;
            this.zoneMatchMode = request.zoneMatchMode;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The number of vCPUs of the instance.</p>
         * <blockquote>
         * <p>If you specify both <code>Cores</code> and <code>Memory</code>, the system returns all instance types that match the values of the parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * <p>The billing method of the ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The level of the instance family. Valid values:</p>
         * <ul>
         * <li>EntryLevel</li>
         * <li>EnterpriseLevel</li>
         * <li>CreditEntryLevel For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instance families</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
         * <blockquote>
         * <p>If you specify <code>InstanceType</code>, the <code>Cores</code> and <code>Memory</code> parameters are ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.hfg6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies the instance families from which the alternative instance types are selected. You can specify up to 10 instance families.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.hfg6</p>
         */
        public Builder instanceTypeFamily(java.util.List<String> instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>Specifies whether the instance is I/O optimized. The IoOptimized parameter cannot be specified when the instance is not I/O optimized. Valid values:</p>
         * <ul>
         * <li>optimized: The instance is I/O optimized.</li>
         * <li>none: The instance is not I/O optimized.</li>
         * </ul>
         * <p>Default value: optimized.</p>
         * <p>If you query alternative instance types for retired instance types, this parameter is set to none by default.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The maximum hourly price for pay-as-you-go instances or preemptible instances.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * <p>The memory size of the instance. Unit: GiB.</p>
         * <blockquote>
         * <p>If you specify both <code>Cores</code> and <code>Memory</code>, the system returns all instance types that match the values of the parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic</li>
         * <li>vpc</li>
         * </ul>
         * <p>Default value: vpc.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * <p>The policy that is used to recommend instance types. Valid values:</p>
         * <ul>
         * <li>InventoryFirst: recommends instance types in descending order of resource availability.</li>
         * <li>PriceFirst: recommends the most cost-effective instance types. Recommended instance types appear based on the hourly prices of vCPUs in ascending order.</li>
         * <li>NewProductFirst: recommends the latest instance types.</li>
         * </ul>
         * <p>Default value: InventoryFirst.</p>
         * 
         * <strong>example:</strong>
         * <p>PriceFirst</p>
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>Specifies the scenarios in which instance types are recommended. Valid values:</p>
         * <ul>
         * <li>UPGRADE: instance type upgrade or downgrade</li>
         * <li>CREATE: instance creation</li>
         * </ul>
         * <p>Default value: CREATE.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The bidding policy of the preemptible instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance for which you can specify the maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify <code>SpotStrategy</code>, you must set <code>InstanceChargeType</code> to <code>PostPaid</code>.</p>
         * </blockquote>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: SSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>cloud: basic disk</li>
         * </ul>
         * <p>For non-I/O optimized instances, the default value is cloud.</p>
         * <p>For I/O optimized instances, the default value is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <p>We recommend that you set the value of ZoneMatchMode to Include, which is the default value. This way, the system recommends instance types that are available in the zone specified by the ZoneId parameter based on priority. The system also recommends instance types that are available in other zones within the same region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>Specifies whether to recommend only instance types in the zone specified by ZoneId. Valid values:</p>
         * <ul>
         * <li>Strict: recommends only instance types that are available in zones specified by the ZoneId parameter.</li>
         * <li>Include: recommends instance types that are available in zones specified by the ZoneId parameter and other zones within the same region.</li>
         * </ul>
         * <p>If <code>ZoneId</code> is specified, the default value of this parameter is Strict. This value indicates that only alternative instance types in the zone specified by ZoneId are recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>Strict</p>
         */
        public Builder zoneMatchMode(String zoneMatchMode) {
            this.putQueryParameter("ZoneMatchMode", zoneMatchMode);
            this.zoneMatchMode = zoneMatchMode;
            return this;
        }

        @Override
        public DescribeRecommendInstanceTypeRequest build() {
            return new DescribeRecommendInstanceTypeRequest(this);
        } 

    } 

}
