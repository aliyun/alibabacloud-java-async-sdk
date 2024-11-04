// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAutoProvisioningGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoProvisioningGroupRequest</p>
 */
public class CreateAutoProvisioningGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchConfiguration")
    private LaunchConfiguration launchConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupType")
    private String autoProvisioningGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskConfig")
    private java.util.List < DataDiskConfig> dataDiskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcessCapacityTerminationPolicy")
    private String excessCapacityTerminationPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HibernationOptionsConfigured")
    private Boolean hibernationOptionsConfigured;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateConfig")
    private java.util.List < LaunchTemplateConfig> launchTemplateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSpotPrice")
    private Float maxSpotPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTargetCapacity")
    private String minTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAsYouGoAllocationStrategy")
    private String payAsYouGoAllocationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAsYouGoTargetCapacity")
    private String payAsYouGoTargetCapacity;

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
    @com.aliyun.core.annotation.NameInMap("ResourcePoolOptions")
    private ResourcePoolOptions resourcePoolOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotAllocationStrategy")
    private String spotAllocationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInstanceInterruptionBehavior")
    private String spotInstanceInterruptionBehavior;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInstancePoolsToUseCount")
    private Integer spotInstancePoolsToUseCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotTargetCapacity")
    private String spotTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskConfig")
    private java.util.List < SystemDiskConfig> systemDiskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminateInstances")
    private Boolean terminateInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminateInstancesWithExpiration")
    private Boolean terminateInstancesWithExpiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTargetCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String totalTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidFrom")
    private String validFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidUntil")
    private String validUntil;

    private CreateAutoProvisioningGroupRequest(Builder builder) {
        super(builder);
        this.launchConfiguration = builder.launchConfiguration;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.autoProvisioningGroupType = builder.autoProvisioningGroupType;
        this.clientToken = builder.clientToken;
        this.dataDiskConfig = builder.dataDiskConfig;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.description = builder.description;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
        this.hibernationOptionsConfigured = builder.hibernationOptionsConfigured;
        this.launchTemplateConfig = builder.launchTemplateConfig;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxSpotPrice = builder.maxSpotPrice;
        this.minTargetCapacity = builder.minTargetCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payAsYouGoAllocationStrategy = builder.payAsYouGoAllocationStrategy;
        this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolOptions = builder.resourcePoolOptions;
        this.spotAllocationStrategy = builder.spotAllocationStrategy;
        this.spotInstanceInterruptionBehavior = builder.spotInstanceInterruptionBehavior;
        this.spotInstancePoolsToUseCount = builder.spotInstancePoolsToUseCount;
        this.spotTargetCapacity = builder.spotTargetCapacity;
        this.systemDiskConfig = builder.systemDiskConfig;
        this.tag = builder.tag;
        this.terminateInstances = builder.terminateInstances;
        this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
        this.totalTargetCapacity = builder.totalTargetCapacity;
        this.validFrom = builder.validFrom;
        this.validUntil = builder.validUntil;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoProvisioningGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return launchConfiguration
     */
    public LaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    /**
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return autoProvisioningGroupType
     */
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataDiskConfig
     */
    public java.util.List < DataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return excessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * @return hibernationOptionsConfigured
     */
    public Boolean getHibernationOptionsConfigured() {
        return this.hibernationOptionsConfigured;
    }

    /**
     * @return launchTemplateConfig
     */
    public java.util.List < LaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return maxSpotPrice
     */
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    /**
     * @return minTargetCapacity
     */
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
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
     * @return payAsYouGoAllocationStrategy
     */
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    /**
     * @return payAsYouGoTargetCapacity
     */
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
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
     * @return resourcePoolOptions
     */
    public ResourcePoolOptions getResourcePoolOptions() {
        return this.resourcePoolOptions;
    }

    /**
     * @return spotAllocationStrategy
     */
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * @return spotInstanceInterruptionBehavior
     */
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    /**
     * @return spotInstancePoolsToUseCount
     */
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    /**
     * @return spotTargetCapacity
     */
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    /**
     * @return systemDiskConfig
     */
    public java.util.List < SystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return terminateInstances
     */
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * @return terminateInstancesWithExpiration
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * @return totalTargetCapacity
     */
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * @return validFrom
     */
    public String getValidFrom() {
        return this.validFrom;
    }

    /**
     * @return validUntil
     */
    public String getValidUntil() {
        return this.validUntil;
    }

    public static final class Builder extends Request.Builder<CreateAutoProvisioningGroupRequest, Builder> {
        private LaunchConfiguration launchConfiguration; 
        private String autoProvisioningGroupName; 
        private String autoProvisioningGroupType; 
        private String clientToken; 
        private java.util.List < DataDiskConfig> dataDiskConfig; 
        private String defaultTargetCapacityType; 
        private String description; 
        private String excessCapacityTerminationPolicy; 
        private Boolean hibernationOptionsConfigured; 
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private Float maxSpotPrice; 
        private String minTargetCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payAsYouGoAllocationStrategy; 
        private String payAsYouGoTargetCapacity; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ResourcePoolOptions resourcePoolOptions; 
        private String spotAllocationStrategy; 
        private String spotInstanceInterruptionBehavior; 
        private Integer spotInstancePoolsToUseCount; 
        private String spotTargetCapacity; 
        private java.util.List < SystemDiskConfig> systemDiskConfig; 
        private java.util.List < Tag> tag; 
        private Boolean terminateInstances; 
        private Boolean terminateInstancesWithExpiration; 
        private String totalTargetCapacity; 
        private String validFrom; 
        private String validUntil; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoProvisioningGroupRequest request) {
            super(request);
            this.launchConfiguration = request.launchConfiguration;
            this.autoProvisioningGroupName = request.autoProvisioningGroupName;
            this.autoProvisioningGroupType = request.autoProvisioningGroupType;
            this.clientToken = request.clientToken;
            this.dataDiskConfig = request.dataDiskConfig;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.description = request.description;
            this.excessCapacityTerminationPolicy = request.excessCapacityTerminationPolicy;
            this.hibernationOptionsConfigured = request.hibernationOptionsConfigured;
            this.launchTemplateConfig = request.launchTemplateConfig;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.maxSpotPrice = request.maxSpotPrice;
            this.minTargetCapacity = request.minTargetCapacity;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payAsYouGoAllocationStrategy = request.payAsYouGoAllocationStrategy;
            this.payAsYouGoTargetCapacity = request.payAsYouGoTargetCapacity;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolOptions = request.resourcePoolOptions;
            this.spotAllocationStrategy = request.spotAllocationStrategy;
            this.spotInstanceInterruptionBehavior = request.spotInstanceInterruptionBehavior;
            this.spotInstancePoolsToUseCount = request.spotInstancePoolsToUseCount;
            this.spotTargetCapacity = request.spotTargetCapacity;
            this.systemDiskConfig = request.systemDiskConfig;
            this.tag = request.tag;
            this.terminateInstances = request.terminateInstances;
            this.terminateInstancesWithExpiration = request.terminateInstancesWithExpiration;
            this.totalTargetCapacity = request.totalTargetCapacity;
            this.validFrom = request.validFrom;
            this.validUntil = request.validUntil;
        } 

        /**
         * LaunchConfiguration.
         */
        public Builder launchConfiguration(LaunchConfiguration launchConfiguration) {
            this.putQueryParameter("LaunchConfiguration", launchConfiguration);
            this.launchConfiguration = launchConfiguration;
            return this;
        }

        /**
         * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>apg-test</p>
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * <p>The delivery type of the auto provisioning group. Valid values:</p>
         * <ul>
         * <li>request: one-time asynchronous delivery. When the auto provisioning group is started, it attempts to asynchronously deliver an instance cluster that meets the target capacity only once. The group does not retry the operation regardless of whether all the instances are delivered.</li>
         * <li>instant: one-time synchronous delivery. When the auto provisioning group is started, it attempts to synchronously deliver an instance cluster that meets the target capacity only once. The list of delivered instances and the causes of delivery failures are returned in the response.</li>
         * <li>maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver an instance cluster that meets the target capacity, and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.</li>
         * </ul>
         * <p>Default value: maintain.</p>
         * 
         * <strong>example:</strong>
         * <p>maintain</p>
         */
        public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
            this.putQueryParameter("AutoProvisioningGroupType", autoProvisioningGroupType);
            this.autoProvisioningGroupType = autoProvisioningGroupType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The information of data disks on the instance.</p>
         */
        public Builder dataDiskConfig(java.util.List < DataDiskConfig> dataDiskConfig) {
            this.putQueryParameter("DataDiskConfig", dataDiskConfig);
            this.dataDiskConfig = dataDiskConfig;
            return this;
        }

        /**
         * <p>The type of supplemental instances. When the sum of the <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> values is smaller than the <code>TotalTargetCapacity</code> value, the auto provisioning group creates instances of the specified type to meet the total target capacity. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go instances</li>
         * <li>Spot: preemptible instances.</li>
         * </ul>
         * <p>Default value: Spot.</p>
         * 
         * <strong>example:</strong>
         * <p>Spot</p>
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * <p>The description of the auto provisioning group.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to release scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:</p>
         * <ul>
         * <li>termination: releases the scaled-in instances in the auto provisioning group.</li>
         * <li>no-termination: removes the scaled-in instances from the auto provisioning group but does not release the instances.</li>
         * </ul>
         * <p>Default value: no-termination.</p>
         * 
         * <strong>example:</strong>
         * <p>termination</p>
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
            this.putQueryParameter("HibernationOptionsConfigured", hibernationOptionsConfigured);
            this.hibernationOptionsConfigured = hibernationOptionsConfigured;
            return this;
        }

        /**
         * <p>The extended configurations of the launch template.</p>
         */
        public Builder launchTemplateConfig(java.util.List < LaunchTemplateConfig> launchTemplateConfig) {
            this.putQueryParameter("LaunchTemplateConfig", launchTemplateConfig);
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * <p>The ID of the launch template associated with the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> operation to query available launch templates. When both LaunchTemplateId and <code>LaunchConfiguration.*</code> parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp1fgzds4bdogu03****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The version of the launch template associated with the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a> operation to query the versions of available launch templates.</p>
         * <p>Default value: the default version of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * <p>The maximum price of preemptible instances in the auto provisioning group.</p>
         * <blockquote>
         * <p> When both <code>MaxSpotPrice</code> and <code>LaunchTemplateConfig.N.MaxPrice</code> are specified, the smaller one of the two parameter values is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxSpotPrice(Float maxSpotPrice) {
            this.putQueryParameter("MaxSpotPrice", maxSpotPrice);
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }

        /**
         * <p>The minimum target capacity of the auto provisioning group. The value must be a positive integer. When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when <code>AutoProvisioningGroupType</code> is set to instant. </li>
         * <li>If the number of instances that can be created in the current region is smaller than the value of this parameter, the operation cannot be called and no instances are created. </li>
         * <li>If the number of instances that can be created in the current region is greater than the value of this parameter, instances can be created based on the specified parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder minTargetCapacity(String minTargetCapacity) {
            this.putQueryParameter("MinTargetCapacity", minTargetCapacity);
            this.minTargetCapacity = minTargetCapacity;
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
         * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.</li>
         * <li>prioritized: priority-based policy. The auto provisioning group creates instances based on the priority specified by <code>LaunchTemplateConfig.N.Priority</code>.</li>
         * </ul>
         * <p>Default value: lowest-price.</p>
         * 
         * <strong>example:</strong>
         * <p>prioritized</p>
         */
        public Builder payAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
            this.putQueryParameter("PayAsYouGoAllocationStrategy", payAsYouGoAllocationStrategy);
            this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
            return this;
        }

        /**
         * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. The value must be less than or equal to the <code>TotalTargetCapacity</code> value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which to assign the auto provisioning group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
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
         * <p>The resource pool options to use to create instances. When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the auto provisioning group creates pay-as-you-go instances.</li>
         * <li>This parameter takes effect only if you set <code>AutoProvisioningGroupType</code> to instant.</li>
         * </ul>
         */
        public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
            String resourcePoolOptionsShrink = shrink(resourcePoolOptions, "ResourcePoolOptions", "json");
            this.putQueryParameter("ResourcePoolOptions", resourcePoolOptionsShrink);
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }

        /**
         * <p>The policy for creating preemptible instances. Valid values:</p>
         * <ul>
         * <li>lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.</li>
         * <li>diversified: balanced distribution policy. The auto provisioning group creates instances in zones that are specified in extended configurations and then evenly distributes the instances across the zones.</li>
         * <li>capacity-optimized: capacity-optimized distribution policy. The auto provisioning group creates instances of the optimal instance types across the optimal zones based on resource availability.</li>
         * </ul>
         * <p>Default value: lowest-price.</p>
         * 
         * <strong>example:</strong>
         * <p>diversified</p>
         */
        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            this.putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * <p>The operation to be performed on the preemptible instance when it is interrupted. Valid values:</p>
         * <ul>
         * <li>stop: stops the preemptible instance.</li>
         * <li>terminate: releases the preemptible instance.</li>
         * </ul>
         * <p>Default value: terminate.</p>
         * 
         * <strong>example:</strong>
         * <p>terminate</p>
         */
        public Builder spotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
            this.putQueryParameter("SpotInstanceInterruptionBehavior", spotInstanceInterruptionBehavior);
            this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
            return this;
        }

        /**
         * <p>The number of preemptible instances of the lowest-priced instance type to be created by the auto provisioning group. This parameter takes effect when <code>SpotAllocationStrategy</code> is set to <code>lowest-price</code>.</p>
         * <p>The value must be smaller than the N value specified in <code>LaunchTemplateConfig.N</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder spotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
            this.putQueryParameter("SpotInstancePoolsToUseCount", spotInstancePoolsToUseCount);
            this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
            return this;
        }

        /**
         * <p>The target capacity of preemptible instances in the auto provisioning group. The value must be less than or equal to the <code>TotalTargetCapacity</code> value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * <p>The information of system disks on the instance.</p>
         */
        public Builder systemDiskConfig(java.util.List < SystemDiskConfig> systemDiskConfig) {
            this.putQueryParameter("SystemDiskConfig", systemDiskConfig);
            this.systemDiskConfig = systemDiskConfig;
            return this;
        }

        /**
         * <p>The tags to add to the auto provisioning group.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to release instances in the auto provisioning group when the auto provisioning group is deleted. Valid values:</p>
         * <ul>
         * <li>true: releases the instances.</li>
         * <li>false: retains the instances.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder terminateInstances(Boolean terminateInstances) {
            this.putQueryParameter("TerminateInstances", terminateInstances);
            this.terminateInstances = terminateInstances;
            return this;
        }

        /**
         * <p>Specifies whether to release instances in the auto provisioning group when the group expires. Valid values:</p>
         * <ul>
         * <li>true: releases the instances.</li>
         * <li>false: only removes the instances from the auto provisioning group but does not release them.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * <p>The total target capacity of the auto provisioning group. The value must be a positive integer.</p>
         * <p>The total target capacity of the auto provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by <code>PayAsYouGoTargetCapacity</code> and the target capacity of preemptible instances specified by <code>SpotTargetCapacity</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalTargetCapacity(String totalTargetCapacity) {
            this.putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * <p>The time at which to start the auto provisioning group. The period of time between this point in time and the point in time specified by <code>ValidUntil</code> is the validity period of the auto provisioning group.</p>
         * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>By default, an auto provisioning group is started immediately after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-01T15:10:20Z</p>
         */
        public Builder validFrom(String validFrom) {
            this.putQueryParameter("ValidFrom", validFrom);
            this.validFrom = validFrom;
            return this;
        }

        /**
         * <p>The time at which the auto provisioning group expires. The period of time between this point in time and the point in time specified by <code>ValidFrom</code> is the validity period of the auto provisioning group.</p>
         * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>Default value: 2099-12-31T23:59:59Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-01T15:10:20Z</p>
         */
        public Builder validUntil(String validUntil) {
            this.putQueryParameter("ValidUntil", validUntil);
            this.validUntil = validUntil;
            return this;
        }

        @Override
        public CreateAutoProvisioningGroupRequest build() {
            return new CreateAutoProvisioningGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>34458433936495****:alice</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/adminrole</p>
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.kmsKeyId = builder.kmsKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encryptAlgorithm; 
            private Boolean encrypted; 
            private String kmsKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            /**
             * <p>Specifies whether to enable the performance burst feature for data disk N. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only if you set LaunchConfiguration.DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The category of data disk N. Valid values of N: 1 to 16. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to release data disk N when the instance to which the data disk is attached is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: true.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of data disk N. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>DataDisk_Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of data disk N. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/vd1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of data disk N. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
             * <p>This parameter is left empty by default.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdData</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt data disk N. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key to use for data disk N. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The performance level of the Enterprise SSD (ESSD) to use as data disk N. The value of N in this parameter must be the same as the value of N in <code>LaunchConfiguration.DataDisk.N.Category</code>. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as data disk N. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
             * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p> This parameter is available only if you set LaunchConfiguration.DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
             * <ul>
             * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_efficiency: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_ssd: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_essd: vary based on the <code>LaunchConfiguration.DataDisk.N.PerformanceLevel</code> value.</p>
             * <ul>
             * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL0: 40 to 32768.</li>
             * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL1: 20 to 32768.</li>
             * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL2: 461 to 32768.</li>
             * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud: 5 to 2000.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>LaunchConfiguration.DataDisk.N.SnapshotId</code>.</p>
             * </blockquote>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.</p>
             * <p>If you specify this parameter, <code>LaunchConfiguration.DataDisk.N.Size</code> is ignored. The size of data disk N is the same as that of the snapshot specified by this parameter. Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17441ohwka0yuh****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        private SystemDisk(Builder builder) {
            this.burstingEnabled = builder.burstingEnabled;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.provisionedIops = builder.provisionedIops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public static final class Builder {
            private Boolean burstingEnabled; 
            private String encryptAlgorithm; 
            private String encrypted; 
            private String KMSKeyId; 
            private Long provisionedIops; 

            /**
             * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only if you set <code>LaunchConfiguration.SystemDisk.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The algorithm to use to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>aes-256</li>
             * <li>sm4-128</li>
             * </ul>
             * <p>Default value: aes-256.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aes-256</p>
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key to use for the system disk.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
             * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p> This parameter is available only if you set LaunchConfiguration.SystemDisk.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class LaunchConfigurationTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LaunchConfigurationTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchConfigurationTag create() {
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
             * <p>The key of the tag. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain <code>http://</code> or <code>https://</code>. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain <code>http://</code> or <code>https://</code>. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LaunchConfigurationTag build() {
                return new LaunchConfigurationTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class LaunchConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private java.util.List < Arn> arn;

        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HostNames")
        private java.util.List < String > hostNames;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private String ioOptimized;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @com.aliyun.core.annotation.NameInMap("SystemDiskName")
        private String systemDiskName;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < LaunchConfigurationTag> tag;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private LaunchConfiguration(Builder builder) {
            this.arn = builder.arn;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.creditSpecification = builder.creditSpecification;
            this.dataDisk = builder.dataDisk;
            this.deploymentSetId = builder.deploymentSetId;
            this.hostName = builder.hostName;
            this.hostNames = builder.hostNames;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.instanceDescription = builder.instanceDescription;
            this.instanceName = builder.instanceName;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.keyPairName = builder.keyPairName;
            this.password = builder.password;
            this.passwordInherit = builder.passwordInherit;
            this.ramRoleName = builder.ramRoleName;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.systemDisk = builder.systemDisk;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskDescription = builder.systemDiskDescription;
            this.systemDiskName = builder.systemDiskName;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
            this.tag = builder.tag;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchConfiguration create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public java.util.List < Arn> getArn() {
            return this.arn;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return creditSpecification
         */
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        /**
         * @return dataDisk
         */
        public java.util.List < DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hostNames
         */
        public java.util.List < String > getHostNames() {
            return this.hostNames;
        }

        /**
         * @return imageFamily
         */
        public String getImageFamily() {
            return this.imageFamily;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskDescription
         */
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        /**
         * @return systemDiskName
         */
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tag
         */
        public java.util.List < LaunchConfigurationTag> getTag() {
            return this.tag;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private java.util.List < Arn> arn; 
            private String autoReleaseTime; 
            private String creditSpecification; 
            private java.util.List < DataDisk> dataDisk; 
            private String deploymentSetId; 
            private String hostName; 
            private java.util.List < String > hostNames; 
            private String imageFamily; 
            private String imageId; 
            private String instanceDescription; 
            private String instanceName; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private String keyPairName; 
            private String password; 
            private Boolean passwordInherit; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private SystemDisk systemDisk; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private java.util.List < LaunchConfigurationTag> tag; 
            private String userData; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             */
            public Builder arn(java.util.List < Arn> arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
             * <ul>
             * <li>If the value of <code>ss</code> is not <code>00</code>, the start time is automatically rounded down to the nearest minute based on the value of <code>mm</code>.</li>
             * <li>The specified time must be at least 30 minutes later than the current time.</li>
             * <li>The specified time can be at most three years later than the current time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2018-01-01T12:05:00Z</p>
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * <p>The performance mode of the burstable instance. Valid values:</p>
             * <ul>
             * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
             * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
             * </ul>
             * <p>This parameter is empty by default.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * <p>The cloud disks in the extended configurations of the launch template.</p>
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp1frxuzdg87zh4p****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>The instance hostname. Take note of the following items:</p>
             * <ul>
             * <li>The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-).</li>
             * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</li>
             * <li>For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
             * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned.</li>
             * <li>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>k8s-node-[1,4]-ecshost</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances. Take note of the following items:</p>
             * <ul>
             * <li>This parameter takes effect only when <code>AutoProvisioningGroupType</code> is set to instant. </li>
             * <li>The value of N indicates the number of instances. Valid values of N: 1 to 1000. The value of N must be the same as the TotalTargetCapacity value. </li>
             * <li>The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). </li>
             * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. The hostname can contain letters, digits, and hyphens (-). </li>
             * <li>For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). </li>
             * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned. </li>
             * <li>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs-host-01</p>
             */
            public Builder hostNames(java.util.List < String > hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * <p>The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>aliyun</code> or <code>acs:</code>. The name cannot contain <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou-daily-update</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The ID of the image to be used to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available image resources. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1g7004ksh0oeuc****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance description. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance_Description</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The instance name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>The default value of this parameter is the <code>InstanceId</code> value.</p>
             * <p>When you batch create instances, you can batch configure sequential names for the instances. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-node-[1,4]-alibabacloud</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The billing method for network usage. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: pay-by-bandwidth</li>
             * <li>PayByTraffic: pay-by-traffic</li>
             * </ul>
             * <blockquote>
             * <p> When the pay-by-traffic billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidth instead of guaranteed performance specifications. When demands outstrip resource supplies, the maximum bandwidths may be limited. If you want guaranteed bandwidth for your instance, use the pay-by-bandwidth billing method.</p>
             * </blockquote>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
             * <ul>
             * <li>When the maximum outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</li>
             * <li>When the maximum outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>, and the default value is the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>.</li>
             * </ul>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
             * <p>Default value: 0.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
             * <ul>
             * <li>none: The instance is not I/O optimized.</li>
             * <li>optimized: The instance is I/O optimized.</li>
             * </ul>
             * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>optimized</p>
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>The key pair name.</p>
             * <ul>
             * <li>For Windows instances, this parameter is ignored. This parameter is empty by default.</li>
             * <li>By default, password-based logon is disabled for Linux instances.</li>
             * </ul>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyPair_Name</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The instance password. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password can contain the following special characters:</p>
             * <p><code>( ) ` ~ ! @ # $ % ^ &amp; * - _ + = | { }  </code>: ; &quot; &lt; &gt; , . ? /``  For Windows instances, the password cannot start with a forward slash (/). When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence. `</p>
             * 
             * <strong>example:</strong>
             * <p>EcsV587!</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>Specifies whether to use the password preset in the image. Valid values:</p>
             * <ul>
             * <li>true: uses the password preset in the image.</li>
             * <li>false: does not use the password preset in the image.</li>
             * </ul>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * <p>The name of the instance Resource Access Management (RAM) role. You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>RAM_Name</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Specifies whether to enable security hardening. Valid values:</p>
             * <ul>
             * <li>Active: enables security hardening. This value is applicable only to public images.</li>
             * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
             * </ul>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * <p>The ID of the security group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp15ed6xe1yxeycg****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the security groups to which the new ECS instances belong.</p>
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The system disk information of instances. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: enhanced SSD (ESSD)</li>
             * <li>cloud: basic disk</li>
             * </ul>
             * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemDisk_Description</p>
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
             * <p>This parameter is empty by default.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdSystem</p>
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * <p>The performance level of the ESSD to be used as the system disk. Valid values:</p>
             * <ul>
             * <li>PL0 (default): A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Valid values: 20 to 500. Unit: GiB. The value must be at least 20 and greater than or equal to the size of the image specified by LaunchConfiguration.ImageId.</p>
             * <p>Default value: 40 or the size of the image specified by LaunchConfiguration.ImageId, whichever is greater.</p>
             * <p>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The tag in the extended configurations of the launch template.</p>
             */
            public Builder tag(java.util.List < LaunchConfigurationTag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The instance user data. The user data must be encoded in Base64. The raw data can be up to 32 KB in size. When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public LaunchConfiguration build() {
                return new LaunchConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class DataDiskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        private DataDiskConfig(Builder builder) {
            this.diskCategory = builder.diskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskConfig create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public static final class Builder {
            private String diskCategory; 

            /**
             * <p>The category of data disk N. You can use this parameter to specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: ESSD</li>
             * <li>cloud: basic disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            public DataDiskConfig build() {
                return new DataDiskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class LaunchTemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architectures")
        private java.util.List < String > architectures;

        @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private java.util.List < Integer > cores;

        @com.aliyun.core.annotation.NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Double maxPrice;

        @com.aliyun.core.annotation.NameInMap("MaxQuantity")
        private Integer maxQuantity;

        @com.aliyun.core.annotation.NameInMap("Memories")
        private java.util.List < Float > memories;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Double weightedCapacity;

        private LaunchTemplateConfig(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
            this.maxQuantity = builder.maxQuantity;
            this.memories = builder.memories;
            this.priority = builder.priority;
            this.vSwitchId = builder.vSwitchId;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfig create() {
            return builder().build();
        }

        /**
         * @return architectures
         */
        public java.util.List < String > getArchitectures() {
            return this.architectures;
        }

        /**
         * @return burstablePerformance
         */
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        /**
         * @return cores
         */
        public java.util.List < Integer > getCores() {
            return this.cores;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
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
         * @return maxPrice
         */
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return maxQuantity
         */
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        /**
         * @return memories
         */
        public java.util.List < Float > getMemories() {
            return this.memories;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return weightedCapacity
         */
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private java.util.List < Integer > cores; 
            private java.util.List < String > excludedInstanceTypes; 
            private String instanceFamilyLevel; 
            private String instanceType; 
            private Double maxPrice; 
            private Integer maxQuantity; 
            private java.util.List < Float > memories; 
            private Integer priority; 
            private String vSwitchId; 
            private Double weightedCapacity; 

            /**
             * <p>The architectures of the instance types.</p>
             */
            public Builder architectures(java.util.List < String > architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * <p>Specifies whether to include burstable instance types. Valid values:</p>
             * <ul>
             * <li>Exclude: does not include burstable instance types.</li>
             * <li>Include: includes burstable instance types.</li>
             * <li>Required: includes only burstable instance types.</li>
             * </ul>
             * <p>Default value: Include.</p>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * <p>The number of vCPU cores of the instance type.</p>
             */
            public Builder cores(java.util.List < Integer > cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The instance types that you want to exclude.</p>
             */
            public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * <p>The instance family level of the instance type in extended configuration N. This parameter is used to filter instance types. Valid values:</p>
             * <ul>
             * <li>EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
             * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for scenarios that require high stability. For more information, see the <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> topic.</li>
             * <li>CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * </ul>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price of preemptible instances in extended configuration N.</p>
             * <blockquote>
             * <p> If you specify one or more other <code>LaunchTemplateConfig.N.*</code> parameters, you must also specify <code>LaunchTemplateConfig.N.MaxPrice</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder maxQuantity(Integer maxQuantity) {
                this.maxQuantity = maxQuantity;
                return this;
            }

            /**
             * <p>The memory sizes of the instance type.</p>
             */
            public Builder memories(java.util.List < Float > memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>The priority of extended configuration N. A value of 0 indicates the highest priority. Valid values: 0 to ∞.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configuration is determined by the vSwitch.</p>
             * <blockquote>
             * <p> If you specify one or more other <code>LaunchTemplateConfig.N.*</code> parameters, you must also specify <code>LaunchTemplateConfig.N.VSwitchId</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-sn5bsitu4lfzgc5o7****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The weight of the instance type in extended configuration N. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.</p>
             * <p>The weight is calculated based on the computing power of the specified instance type and the minimum computing power of a single instance in the cluster to be created by the auto provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.</p>
             * <ul>
             * <li>For an instance type with 8 vCPUs and 60 GiB of memory, you can set the weight to 1.</li>
             * <li>For an instance type with 16 vCPUs and 120 GiB of memory, you can set the weight to 2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder weightedCapacity(Double weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateConfig build() {
                return new LaunchTemplateConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class ResourcePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivatePoolIds")
        private java.util.List < String > privatePoolIds;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private ResourcePoolOptions(Builder builder) {
            this.privatePoolIds = builder.privatePoolIds;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePoolOptions create() {
            return builder().build();
        }

        /**
         * @return privatePoolIds
         */
        public java.util.List < String > getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List < String > privatePoolIds; 
            private String strategy; 

            /**
             * <p>The IDs of private pools. The ID of a private pool is the same as the ID of the elasticity assurance or capacity reservation that is associated with the private pool. You can specify the IDs of only targeted private pools for this parameter.</p>
             */
            public Builder privatePoolIds(java.util.List < String > privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>Specifies which resource pools to use to create instances. Resource pools include the public pool and the private pools that are associated with elasticity assurance and capacity reservations in the Active state. Valid values:</p>
             * <ul>
             * <li>PrivatePoolFirst: uses private pools first. If you set this parameter to PrivatePoolFirst, you can specify ResourcePoolOptions.PrivatePoolIds or leave ResourcePoolOptions.PrivatePoolIds empty. If you specify ResourcePoolOptions.PrivatePoolIds, the specified private pools are used first. If you leave ResourcePoolOptions.PrivatePoolIds empty or the private pools that you specify in ResourcePoolOptions.PrivatePoolIds have insufficient capacity, matching open private pools are used. If no matching open private pools exist, the public pool is used.</li>
             * <li>PrivatePoolOnly: uses only private pools. If you set this parameter to PrivatePoolOnly, you must specify ResourcePoolOptions.PrivatePoolIds. If the private pools that you specify in ResourcePoolOptions.PrivatePoolIds have insufficient capacity, instances cannot be created.</li>
             * <li>PublicPoolOnly: uses the public pool.</li>
             * </ul>
             * <p>Default value: PublicPoolOnly.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivatePoolFirst</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public ResourcePoolOptions build() {
                return new ResourcePoolOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class SystemDiskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        private SystemDiskConfig(Builder builder) {
            this.diskCategory = builder.diskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskConfig create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public static final class Builder {
            private String diskCategory; 

            /**
             * <p>The category of the system disk. You can specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            public SystemDiskConfig build() {
                return new SystemDiskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
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
             * <p>The key of tag N to add to the auto provisioning group.</p>
             * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the auto provisioning group.</p>
             * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
