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
    @com.aliyun.core.annotation.NameInMap("CandidateOptions")
    private CandidateOptions candidateOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskConfig")
    private java.util.List<DataDiskConfig> dataDiskConfig;

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
    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HibernationOptionsConfigured")
    private Boolean hibernationOptionsConfigured;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateConfig")
    private java.util.List<LaunchTemplateConfig> launchTemplateConfig;

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
    @com.aliyun.core.annotation.NameInMap("PrePaidOptions")
    private PrePaidOptions prePaidOptions;

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
    private java.util.List<SystemDiskConfig> systemDiskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
        this.candidateOptions = builder.candidateOptions;
        this.clientToken = builder.clientToken;
        this.dataDiskConfig = builder.dataDiskConfig;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.description = builder.description;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
        this.executionMode = builder.executionMode;
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
        this.prePaidOptions = builder.prePaidOptions;
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
     * @return candidateOptions
     */
    public CandidateOptions getCandidateOptions() {
        return this.candidateOptions;
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
    public java.util.List<DataDiskConfig> getDataDiskConfig() {
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
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
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
    public java.util.List<LaunchTemplateConfig> getLaunchTemplateConfig() {
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
     * @return prePaidOptions
     */
    public PrePaidOptions getPrePaidOptions() {
        return this.prePaidOptions;
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
    public java.util.List<SystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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
        private CandidateOptions candidateOptions; 
        private String clientToken; 
        private java.util.List<DataDiskConfig> dataDiskConfig; 
        private String defaultTargetCapacityType; 
        private String description; 
        private String excessCapacityTerminationPolicy; 
        private String executionMode; 
        private Boolean hibernationOptionsConfigured; 
        private java.util.List<LaunchTemplateConfig> launchTemplateConfig; 
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private Float maxSpotPrice; 
        private String minTargetCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payAsYouGoAllocationStrategy; 
        private String payAsYouGoTargetCapacity; 
        private PrePaidOptions prePaidOptions; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ResourcePoolOptions resourcePoolOptions; 
        private String spotAllocationStrategy; 
        private String spotInstanceInterruptionBehavior; 
        private Integer spotInstancePoolsToUseCount; 
        private String spotTargetCapacity; 
        private java.util.List<SystemDiskConfig> systemDiskConfig; 
        private java.util.List<Tag> tag; 
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
            this.candidateOptions = request.candidateOptions;
            this.clientToken = request.clientToken;
            this.dataDiskConfig = request.dataDiskConfig;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.description = request.description;
            this.excessCapacityTerminationPolicy = request.excessCapacityTerminationPolicy;
            this.executionMode = request.executionMode;
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
            this.prePaidOptions = request.prePaidOptions;
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
         * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <li><p>request: one-time asynchronous delivery. The group delivers the instance cluster asynchronously only at startup. If scheduling fails, no retry is performed.</p>
         * </li>
         * <li><p>instant: one-time synchronous delivery. The group synchronously creates instances only at startup and returns the list of successfully created instances and the causes of creation failures in the response.</p>
         * </li>
         * <li><p>maintain: continuous delivery. The group attempts to deliver the instance cluster at startup and monitors real-time capacity. If the target capacity is not reached, the group continues to create ECS instances.</p>
         * </li>
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
         * CandidateOptions.
         */
        public Builder candidateOptions(CandidateOptions candidateOptions) {
            this.putQueryParameter("CandidateOptions", candidateOptions);
            this.candidateOptions = candidateOptions;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The list of data disk configurations.</p>
         */
        public Builder dataDiskConfig(java.util.List<DataDiskConfig> dataDiskConfig) {
            this.putQueryParameter("DataDiskConfig", dataDiskConfig);
            this.dataDiskConfig = dataDiskConfig;
            return this;
        }

        /**
         * <p>The billing method for the capacity difference when the sum of <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> is less than <code>TotalTargetCapacity</code>. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go instances.</li>
         * <li>Spot: spot instances.</li>
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
         * <p>Specifies whether to release instances when the real-time capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:</p>
         * <ul>
         * <li>termination: releases the scaled-in instances.</li>
         * <li>no-termination: only removes the scaled-in instances from the auto provisioning group.</li>
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
         * ExecutionMode.
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
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
         * <p>The list of extended launch templates.</p>
         */
        public Builder launchTemplateConfig(java.util.List<LaunchTemplateConfig> launchTemplateConfig) {
            this.putQueryParameter("LaunchTemplateConfig", launchTemplateConfig);
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * <p>The ID of the instance launch template associated with the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> to query active instance launch templates. If you specify both a launch template and launch configuration information (<code>LaunchConfiguration.*</code>), the launch template takes precedence.</p>
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
         * <p>The version of the instance launch template associated with the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a> to query active instance launch template versions.</p>
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
         * <p>The maximum price for spot instances in the auto provisioning group.</p>
         * <blockquote>
         * <p>If both <code>MaxSpotPrice</code> and <code>LaunchTemplateConfig.N.MaxPrice</code> are specified, the lower value is used.</p>
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
         * <p>The target minimum capacity of the auto provisioning group. Valid values: positive integers.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (<code>AutoProvisioningGroupType=instant</code>).</li>
         * <li>If the instance inventory in the current region is less than this parameter value, the invoke operation fails and no instances are created.</li>
         * <li>If the instance inventory in the current region is greater than this parameter value, instances are created as expected based on other specified parameter values.</li>
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
         * <li><p>lowest-price: cost optimization policy. Selects the instance type with the lowest price.</p>
         * </li>
         * <li><p>prioritized: priority-based policy. Creates instances based on the priority specified by <code>LaunchTemplateConfig.N.Priority</code>.</p>
         * </li>
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
         * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. Valid values: less than or equal to the parameter value of <code>TotalTargetCapacity</code>.</p>
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
         * <p>The detailed capacity configuration for subscription instances.</p>
         */
        public Builder prePaidOptions(PrePaidOptions prePaidOptions) {
            this.putQueryParameter("PrePaidOptions", prePaidOptions);
            this.prePaidOptions = prePaidOptions;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the auto provisioning group belongs.</p>
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
         * <p>The resource pool policy used to create instances. Take note of the following items when you set this parameter:</p>
         * <ul>
         * <li>This parameter takes effect only when you create pay-as-you-go instances.</li>
         * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (<code>AutoProvisioningGroupType=instant</code>).</li>
         * </ul>
         */
        public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
            String resourcePoolOptionsShrink = shrink(resourcePoolOptions, "ResourcePoolOptions", "json");
            this.putQueryParameter("ResourcePoolOptions", resourcePoolOptionsShrink);
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }

        /**
         * <p>The policy for creating spot instances. Valid values:</p>
         * <ul>
         * <li><p>lowest-price: cost optimization policy. Selects the instance type with the lowest price.</p>
         * </li>
         * <li><p>diversified: balanced zone distribution policy. Creates instances in the zones specified in the extended launch template and distributes them evenly across zones.</p>
         * </li>
         * <li><p>capacity-optimized: capacity optimization distribution policy. Selects the optimal instance type and zone based on inventory availability.</p>
         * </li>
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
         * <p>The action to take when a spot instance is interrupted. Valid values:</p>
         * <ul>
         * <li><p>stop: stops the instance.</p>
         * </li>
         * <li><p>terminate: releases the instance.</p>
         * </li>
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
         * <p>Takes effect only when <code>SpotAllocationStrategy</code> is set to <code>lowest-price</code>. Specifies the number of instance types from which the auto provisioning group selects the lowest-priced ones to create instances.</p>
         * <p>Valid values: less than the value of N in <code>LaunchTemplateConfig.N</code>.</p>
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
         * <p>The target capacity of spot instances in the auto provisioning group. Valid values: less than or equal to the parameter value of <code>TotalTargetCapacity</code>.</p>
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
         * <p>The list of system disk configurations.</p>
         */
        public Builder systemDiskConfig(java.util.List<SystemDiskConfig> systemDiskConfig) {
            this.putQueryParameter("SystemDiskConfig", systemDiskConfig);
            this.systemDiskConfig = systemDiskConfig;
            return this;
        }

        /**
         * <p>The tags to attach to the auto provisioning group.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to release instances auto provisioning group when the auto-provisioning group is deleted. Valid values:</p>
         * <ul>
         * <li>true: releases instances auto provisioning group.</li>
         * <li>false: retains instances auto provisioning group.</li>
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
         * <p>Specifies whether to release instances auto provisioning group when the auto-provisioning group expires. Valid values:</p>
         * <ul>
         * <li>true: releases instances auto provisioning group.</li>
         * <li>false: only removes instances from the auto-provisioning group.</li>
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
         * <p>The total target capacity of the auto provisioning group. Valid values: positive integers.</p>
         * <p>The total capacity must be greater than or equal to the sum of <code>PayAsYouGoTargetCapacity</code> (the target capacity of pay-as-you-go instances) and <code>SpotTargetCapacity</code> (the target capacity of spot instances).</p>
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
         * <p>The time when the auto provisioning group starts. This parameter and <code>ValidUntil</code> together determine the validity period.</p>
         * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>Default value: the UNIX timestamp at which the request takes effect immediately.</p>
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
         * <p>The time when the auto provisioning group expires. This parameter and <code>ValidFrom</code> together determine the validity period.</p>
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

            private Builder() {
            } 

            private Builder(Arn model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleType = model.roleType;
                this.rolearn = model.rolearn;
            } 

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

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
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
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
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
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
            private String autoSnapshotPolicyId; 
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

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.device = model.device;
                this.diskName = model.diskName;
                this.encryptAlgorithm = model.encryptAlgorithm;
                this.encrypted = model.encrypted;
                this.kmsKeyId = model.kmsKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: disables the feature.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether the data disk is released when the instance is released. Valid values:</p>
             * <ul>
             * <li>true: the data disk is released when the instance is released.</li>
             * <li>false: the data disk is not released when the instance is released.</li>
             * </ul>
             * <p>Default value: true.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>DataDisk_Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of the data disk. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/vd1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
             * <p>Default value: empty.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <p>This parameter is not publicly available.</p>
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
             * <p>Specifies whether data disk N is encrypted. Valid values:</p>
             * <ul>
             * <li>true: encrypted.</li>
             * <li>false: not encrypted.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key for the data disk. If both a launch template and launch configuration are specified, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The performance level of the enterprise SSD used as a data disk. The value of N must be the same as that in <code>LaunchConfiguration.DataDisk.N.Category</code>. Valid values:</p>
             * <ul>
             * <li>PL0: up to 10,000 random read/write IOPS per disk.</li>
             * <li>PL1 (default): up to 50,000 random read/write IOPS per disk.</li>
             * <li>PL2: up to 100,000 random read/write IOPS per disk.</li>
             * <li>PL3: up to 1,000,000 random read/write IOPS per disk.</li>
             * </ul>
             * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
             * <li>cloud_efficiency: 20 to 32768.</li>
             * <li>cloud_ssd: 20 to 32768.</li>
             * <li>cloud_essd: depends on the value of <code>LaunchConfiguration.DataDisk.N.PerformanceLevel</code>.<ul>
             * <li>PL0: 40 to 32768.</li>
             * <li>PL1: 20 to 32768.</li>
             * <li>PL2: 461 to 32768.</li>
             * <li>PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li>cloud: 5 to 2000.</li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>LaunchConfiguration.DataDisk.N.SnapshotId</code>.</p>
             * </blockquote>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16.</p>
             * <p>After you specify this parameter, the <code>LaunchConfiguration.DataDisk.N.Size</code> parameter is ignored. The actual size of the created disk is the size of the specified snapshot. Snapshots created on or before July 15, 2013 cannot be used. Otherwise, the request is rejected.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

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
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
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
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
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
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String encryptAlgorithm; 
            private String encrypted; 
            private String KMSKeyId; 
            private Long provisionedIops; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.encryptAlgorithm = model.encryptAlgorithm;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.provisionedIops = model.provisionedIops;
            } 

            /**
             * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
             * <p>Take note of the following items when you set this parameter:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (AutoProvisioningGroupType=instant).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
             * <ul>
             * <li>true: enables the performance burst feature.</li>
             * <li>false: does not enable the performance burst feature.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
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
             * <p>The encryption algorithm for the system disk. Valid values:</p>
             * <ul>
             * <li><p>aes-256.</p>
             * </li>
             * <li><p>sm4-128.</p>
             * </li>
             * </ul>
             * <p>Default value: aes-256.</p>
             * <p>If you specify both a launch template and launch configurations, the launch template takes priority.</p>
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
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
             * <p>Specifies whether to encrypt system disk N. Valid values:</p>
             * <ul>
             * <li><p>true: encrypts the system disk.</p>
             * </li>
             * <li><p>false: does not encrypt the system disk.</p>
             * </li>
             * </ul>
             * <p>Default value: false.</p>
             * <p>If you specify both a launch template and launch configurations, the launch template takes priority.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The KMS key ID of the system disk.</p>
             * <p>When both a launch template and launch configuration information are specified, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
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

            private Builder() {
            } 

            private Builder(LaunchConfigurationTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instance. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with acs:. The tag value cannot contain <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        private CpuOptions(Builder builder) {
            this.core = builder.core;
            this.threadsPerCore = builder.threadsPerCore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public static final class Builder {
            private Integer core; 
            private Integer threadsPerCore; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.core = model.core;
                this.threadsPerCore = model.threadsPerCore;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * <p>Default value: see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/specify-and-view-cpu-options">Specify and view CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The number of threads per CPU core. The number of vCPUs of the ECS instance = CpuOptions.Core value × CpuOptions.ThreadsPerCore value.</p>
             * <p>CpuOptions.ThreadsPerCore=1 indicates that CPU hyper-threading is disabled.</p>
             * <p>Only specific instance types support custom CPU thread counts.</p>
             * <p>For valid values and default values, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/specify-and-view-cpu-options">Specify and view CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginAsNonRoot")
        private Boolean loginAsNonRoot;

        private ImageOptions(Builder builder) {
            this.loginAsNonRoot = builder.loginAsNonRoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public static final class Builder {
            private Boolean loginAsNonRoot; 

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.loginAsNonRoot = model.loginAsNonRoot;
            } 

            /**
             * <p>Specifies whether instances that use this image support logon with the ecs-user user. Valid values:</p>
             * <ul>
             * <li>true: supported.</li>
             * <li>false: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class SchedulerOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        private SchedulerOptions(Builder builder) {
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerOptions create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private String dedicatedHostClusterId; 
            private String dedicatedHostId; 

            private Builder() {
            } 

            private Builder(SchedulerOptions model) {
                this.dedicatedHostClusterId = model.dedicatedHostClusterId;
                this.dedicatedHostId = model.dedicatedHostId;
            } 

            /**
             * DedicatedHostClusterId.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public SchedulerOptions build() {
                return new SchedulerOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrustedSystemMode")
        private String trustedSystemMode;

        private SecurityOptions(Builder builder) {
            this.trustedSystemMode = builder.trustedSystemMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return trustedSystemMode
         */
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

        public static final class Builder {
            private String trustedSystemMode; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.trustedSystemMode = model.trustedSystemMode;
            } 

            /**
             * TrustedSystemMode.
             */
            public Builder trustedSystemMode(String trustedSystemMode) {
                this.trustedSystemMode = trustedSystemMode;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
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
        private java.util.List<Arn> arn;

        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HostNames")
        private java.util.List<String> hostNames;

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
        private java.util.List<String> securityGroupIds;

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
        private java.util.List<LaunchConfigurationTag> tag;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("CpuOptions")
        private CpuOptions cpuOptions;

        @com.aliyun.core.annotation.NameInMap("ImageOptions")
        private ImageOptions imageOptions;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
        private SchedulerOptions schedulerOptions;

        @com.aliyun.core.annotation.NameInMap("SecurityOptions")
        private SecurityOptions securityOptions;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

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
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.cpuOptions = builder.cpuOptions;
            this.imageOptions = builder.imageOptions;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.schedulerOptions = builder.schedulerOptions;
            this.securityOptions = builder.securityOptions;
            this.spotDuration = builder.spotDuration;
            this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
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
        public java.util.List<Arn> getArn() {
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
        public java.util.List<DataDisk> getDataDisk() {
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
        public java.util.List<String> getHostNames() {
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
        public java.util.List<String> getSecurityGroupIds() {
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
        public java.util.List<LaunchConfigurationTag> getTag() {
            return this.tag;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        /**
         * @return imageOptions
         */
        public ImageOptions getImageOptions() {
            return this.imageOptions;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return schedulerOptions
         */
        public SchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        /**
         * @return securityOptions
         */
        public SecurityOptions getSecurityOptions() {
            return this.securityOptions;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotInterruptionBehavior
         */
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public static final class Builder {
            private java.util.List<Arn> arn; 
            private String autoReleaseTime; 
            private String creditSpecification; 
            private java.util.List<DataDisk> dataDisk; 
            private String deploymentSetId; 
            private String hostName; 
            private java.util.List<String> hostNames; 
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
            private java.util.List<String> securityGroupIds; 
            private SystemDisk systemDisk; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private java.util.List<LaunchConfigurationTag> tag; 
            private String userData; 
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private CpuOptions cpuOptions; 
            private ImageOptions imageOptions; 
            private Integer period; 
            private String periodUnit; 
            private SchedulerOptions schedulerOptions; 
            private SecurityOptions securityOptions; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 

            private Builder() {
            } 

            private Builder(LaunchConfiguration model) {
                this.arn = model.arn;
                this.autoReleaseTime = model.autoReleaseTime;
                this.creditSpecification = model.creditSpecification;
                this.dataDisk = model.dataDisk;
                this.deploymentSetId = model.deploymentSetId;
                this.hostName = model.hostName;
                this.hostNames = model.hostNames;
                this.imageFamily = model.imageFamily;
                this.imageId = model.imageId;
                this.instanceDescription = model.instanceDescription;
                this.instanceName = model.instanceName;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.ioOptimized = model.ioOptimized;
                this.keyPairName = model.keyPairName;
                this.password = model.password;
                this.passwordInherit = model.passwordInherit;
                this.ramRoleName = model.ramRoleName;
                this.resourceGroupId = model.resourceGroupId;
                this.securityEnhancementStrategy = model.securityEnhancementStrategy;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.systemDisk = model.systemDisk;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskDescription = model.systemDiskDescription;
                this.systemDiskName = model.systemDiskName;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
                this.tag = model.tag;
                this.userData = model.userData;
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.cpuOptions = model.cpuOptions;
                this.imageOptions = model.imageOptions;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.schedulerOptions = model.schedulerOptions;
                this.securityOptions = model.securityOptions;
                this.spotDuration = model.spotDuration;
                this.spotInterruptionBehavior = model.spotInterruptionBehavior;
            } 

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             */
            public Builder arn(java.util.List<Arn> arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the UTC+0 time zone. The format is <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
             * <ul>
             * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the start time of the current minute (<code>mm</code>) is used.</p>
             * </li>
             * <li><p>The earliest release time is 30 minutes after the current time.</p>
             * </li>
             * <li><p>The latest release time cannot be more than three years from the current time.</p>
             * </li>
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
             * <p>The running mode of the burstable instance. Valid values:</p>
             * <ul>
             * <li>Standard: standard mode. For more information about instance performance, see the performance constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * <li>Unlimited: unlimited mode. For more information about instance performance, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * </ul>
             * <p>Default value: none.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * <p>The list of data disk configurations in the launch configuration.</p>
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
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
             * <p>The hostname of the instance. Take note of the following items:</p>
             * <ul>
             * <li>Periods (.) and hyphens (-) cannot be used as the first or last characters and cannot be used consecutively.</li>
             * <li>Windows instances: The hostname must be 2 to 15 characters in length and cannot contain periods (.) or consist entirely of digits. The hostname can contain letters, digits, and hyphens (-).</li>
             * <li>Instances that run other operating systems such as Linux: The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment separated by a period can contain letters, digits, and hyphens (-).</li>
             * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned.</li>
             * <li>If you specify both a launch template and launch configuration information, the launch template takes precedence.</li>
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
             * <p>The list of hostnames for one or more instances. Take note of the following items:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous delivery auto provisioning group (<code>AutoProvisioningGroupType=instant</code>).</li>
             * <li>N indicates the number of instances. Valid values of N: 1 to 1000. The value must be the same as the value of TotalTargetCapacity.</li>
             * <li>Periods (.) and hyphens (-) cannot be used as the first or last characters and cannot be used consecutively.</li>
             * <li>If you specify both a launch template and launch configuration information, the launch template takes precedence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs-host-01</p>
             */
            public Builder hostNames(java.util.List<String> hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * <p>The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter, and cannot start with <code>aliyun</code> or <code>acs:</code>. The name cannot contain <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), or hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou-daily-update</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The ID of the image used to create instances. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1g7004ksh0oeuc****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance_Description</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>Default value: the <code>InstanceId</code> of the instance.</p>
             * <p>When you create multiple ECS instances, you can batch configure sequential instance names. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <li>PayByBandwidth: pay-by-bandwidth.</li>
             * <li>PayByTraffic: pay-by-traffic.</li>
             * </ul>
             * <blockquote>
             * <p>In pay-by-traffic mode, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance metrics. When resources are contended for, the peak bandwidths may be limited. If you want guaranteed bandwidth for your business, use pay-by-bandwidth.</p>
             * </blockquote>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <li>If the maximum outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
             * <li>If the maximum outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>. Default value: the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>.</li>
             * </ul>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <li>none: non-I/O optimized.</li>
             * <li>optimized: I/O optimized.</li>
             * </ul>
             * <p>For retired instance types, the default value is none. For other instance types, the default value is optimized.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>optimized</p>
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>The name of the key pair.</p>
             * <ul>
             * <li>For Windows instances, this parameter is ignored. The default value is empty.</li>
             * <li>For Linux instances, password-based logon is disabled during initialization.</li>
             * </ul>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyPair_Name</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
             * <p><code>()`~!@#$%^&amp;*-_+=|{}`[]`:;\\&quot;&lt;&gt;,.?/</code></p>
             * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <li>true: uses the preset password.</li>
             * <li>false: does not use the preset password.</li>
             * </ul>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * <p>The name of the instance RAM role. You can call the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>RAM_Name</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
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
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * <p>The ID of the security group to which the instance belongs. If both a launch template and launch configuration information are specified, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp15ed6xe1yxeycg****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The list of security groups to which the instance belongs.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The system disk information of the instance. If you specify both a launch template and launch configuration information, the launch template takes precedence.
             * [_single.params.LaunchConfiguration~SystemD</p>
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * <p>For retired instance types that are non-I/O optimized, the default value is cloud. For other instance types, the default value is cloud_efficiency.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemDisk_Description</p>
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
             * <p>Default value: empty.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdSystem</p>
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * <p>The performance level (PL) of the enterprise SSD used as the system disk. Valid values:</p>
             * <ul>
             * <li>PL0 (default): up to 10,000 random read/write IOPS per disk.</li>
             * <li>PL1: up to 50,000 random read/write IOPS per disk.</li>
             * <li>PL2: up to 100,000 random read/write IOPS per disk.</li>
             * <li>PL3: up to 1,000,000 random read/write IOPS per disk.</li>
             * </ul>
             * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB. Valid values: 20 to 500. The value of this parameter must be greater than or equal to max{20, size of the image specified by LaunchConfiguration.ImageId}.</p>
             * <p>Default value: max{40, size of the image specified by LaunchConfiguration.ImageId}.</p>
             * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The list of tags in the launch configuration.</p>
             */
            public Builder tag(java.util.List<LaunchConfigurationTag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Instance user data of the instance. Instance user data must be Base64-encoded. The maximum size of the raw data is 32 KB. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-renewal. This parameter takes effect when you create subscription instances. Valid values:</p>
             * <ul>
             * <li>true: enables auto-renewal.</li>
             * <li>false (default): does not enable auto-renewal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal period. Valid values: </p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
             * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The CPU-related configurations.</p>
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * <p>The image-related property information.</p>
             * <p>Take note of the following items when you set this parameter:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (AutoProvisioningGroupType=instant).</li>
             * </ul>
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
                return this;
            }

            /**
             * <p>The subscription duration of the resource. Unit: specified by <code>PeriodUnit</code>. This parameter is required when you create subscription instances. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>If PeriodUnit is set to Week, valid values of Period are 1, 2, 3, and 4.</li>
             * <li>If PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 6, and 12.</p>
             * <p>&lt;props=&quot;partner&quot;&gt;If PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 6, and 12.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription billable methods duration. Valid values: </p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>Week.</li>
             * <li>Month (default).</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;Month (default).</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * SchedulerOptions.
             */
            public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
                this.schedulerOptions = schedulerOptions;
                return this;
            }

            /**
             * SecurityOptions.
             */
            public Builder securityOptions(SecurityOptions securityOptions) {
                this.securityOptions = securityOptions;
                return this;
            }

            /**
             * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
             * <ul>
             * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not subject to automatic release within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the marketplace price and checks the resource inventory to determine whether to retain or revoke the instance.</li>
             * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the marketplace price and checks the resource inventory to determine whether to retain or revoke the instance.</li>
             * </ul>
             * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. Select an appropriate protection period based on the expected task execution duration.</p>
             * <p>Take note of the following items when you set this parameter:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (AutoProvisioningGroupType=instant).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * <p>The break mode of the spot instance. Valid values:</p>
             * <ul>
             * <li><p>Terminate: directly releases the instance.</p>
             * </li>
             * <li><p>Stop: puts the instance into economical mode.</p>
             * </li>
             * </ul>
             * <p>For more information about economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
             * <p>Default value: Terminate.</p>
             * <p>Take note of the following items when you set this parameter:</p>
             * <ul>
             * <li>This parameter takes effect only when you create a one-time synchronous auto provisioning group (AutoProvisioningGroupType=instant).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Terminate</p>
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
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
    public static class CandidateOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Evaluate")
        private Boolean evaluate;

        @com.aliyun.core.annotation.NameInMap("TimeoutMinutes")
        private Integer timeoutMinutes;

        private CandidateOptions(Builder builder) {
            this.evaluate = builder.evaluate;
            this.timeoutMinutes = builder.timeoutMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CandidateOptions create() {
            return builder().build();
        }

        /**
         * @return evaluate
         */
        public Boolean getEvaluate() {
            return this.evaluate;
        }

        /**
         * @return timeoutMinutes
         */
        public Integer getTimeoutMinutes() {
            return this.timeoutMinutes;
        }

        public static final class Builder {
            private Boolean evaluate; 
            private Integer timeoutMinutes; 

            private Builder() {
            } 

            private Builder(CandidateOptions model) {
                this.evaluate = model.evaluate;
                this.timeoutMinutes = model.timeoutMinutes;
            } 

            /**
             * Evaluate.
             */
            public Builder evaluate(Boolean evaluate) {
                this.evaluate = evaluate;
                return this;
            }

            /**
             * TimeoutMinutes.
             */
            public Builder timeoutMinutes(Integer timeoutMinutes) {
                this.timeoutMinutes = timeoutMinutes;
                return this;
            }

            public CandidateOptions build() {
                return new CandidateOptions(this);
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

            private Builder() {
            } 

            private Builder(DataDiskConfig model) {
                this.diskCategory = model.diskCategory;
            } 

            /**
             * <p>The category of the data disk. You can specify multiple candidate disk categories. The specified order determines the priority of each disk category. When a disk category is unavailable, the system automatically switches to the next category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
             * <li>cloud: basic disk.</li>
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
        private java.util.List<String> architectures;

        @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private java.util.List<Integer> cores;

        @com.aliyun.core.annotation.NameInMap("ExcludedInstanceTypes")
        private java.util.List<String> excludedInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Double maxPrice;

        @com.aliyun.core.annotation.NameInMap("MaxQuantity")
        private Integer maxQuantity;

        @com.aliyun.core.annotation.NameInMap("Memories")
        private java.util.List<Float> memories;

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
            this.imageId = builder.imageId;
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
        public java.util.List<String> getArchitectures() {
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
        public java.util.List<Integer> getCores() {
            return this.cores;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
        public java.util.List<Float> getMemories() {
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
            private java.util.List<String> architectures; 
            private String burstablePerformance; 
            private java.util.List<Integer> cores; 
            private java.util.List<String> excludedInstanceTypes; 
            private String imageId; 
            private String instanceFamilyLevel; 
            private String instanceType; 
            private Double maxPrice; 
            private Integer maxQuantity; 
            private java.util.List<Float> memories; 
            private Integer priority; 
            private String vSwitchId; 
            private Double weightedCapacity; 

            private Builder() {
            } 

            private Builder(LaunchTemplateConfig model) {
                this.architectures = model.architectures;
                this.burstablePerformance = model.burstablePerformance;
                this.cores = model.cores;
                this.excludedInstanceTypes = model.excludedInstanceTypes;
                this.imageId = model.imageId;
                this.instanceFamilyLevel = model.instanceFamilyLevel;
                this.instanceType = model.instanceType;
                this.maxPrice = model.maxPrice;
                this.maxQuantity = model.maxQuantity;
                this.memories = model.memories;
                this.priority = model.priority;
                this.vSwitchId = model.vSwitchId;
                this.weightedCapacity = model.weightedCapacity;
            } 

            /**
             * <p>The list of architecture types for instance types.</p>
             */
            public Builder architectures(java.util.List<String> architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * <p>Specifies whether to include burstable instance types. Valid values:</p>
             * <ul>
             * <li>Exclude: excludes burstable instance types.</li>
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
             * <p>The list of vCPU core counts for instance types.</p>
             */
            public Builder cores(java.util.List<Integer> cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The list of instance types to exclude.</p>
             */
            public Builder excludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * <p>The image ID. You can use this parameter to specify the image for the current resource pool. If this parameter is not specified, the image specified by <code>LaunchConfiguration.ImageId</code> or the image configured in the launch template is used by default. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources.
             * Note: This parameter is supported only when <code>AutoProvisioningGroupType = instant</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20210425.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The level of the instance family, which is used to filter instance types that meet the requirements. Valid values:</p>
             * <ul>
             * <li>EntryLevel: entry level, which refers to shared instance types. These instance types are more cost-effective but cannot guarantee stable computing performance. They are suitable for scenarios where CPU utilization is typically low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
             * <li>EnterpriseLevel: enterprise level. These instance types provide stable performance and dedicated resources. They are suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
             * <li>CreditEntryLevel: credit-based entry level, which refers to burstable instances. These instance types use CPU credits to ensure computing performance. They are suitable for scenarios where CPU utilization is typically low with occasional bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
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
             * <p>The instance type in the extended launch template. Valid values of N: 1 to 20. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price for spot instances in the extended launch template.</p>
             * <blockquote>
             * <p>After you set <code>LaunchTemplateConfig</code>, <code>LaunchTemplateConfig.N.MaxPrice</code> is required.</p>
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
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>The list of memory sizes for instance types.</p>
             */
            public Builder memories(java.util.List<Float> memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>The priority of the extended launch template. A value of 0 indicates the highest priority. Valid values: 0 to +∞.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the ECS instance in the extended launch template is connected. The zone of the ECS instance created from the extended template is determined by the vSwitch.</p>
             * <blockquote>
             * <p>If you specify LaunchTemplateConfig, LaunchTemplateConfig.N.VSwitchId is required.</p>
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
             * <p>The weight of the instance type in the extended launch template. A higher value indicates that a single instance can meet more computing power requirements, which means fewer instances are required. Valid values: greater than 0.</p>
             * <p>You can calculate the weight based on the computing power of the specified instance type and the minimum computing power of a single node in the cluster. For example, if the minimum computing power of a single node is 8 vCPUs and 60 GiB:</p>
             * <ul>
             * <li>The weight of an instance type with 8 vCPUs and 60 GiB can be set to 1.</li>
             * <li>The weight of an instance type with 16 vCPUs and 120 GiB can be set to 2.</li>
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
    public static class SpecifyCapacityDistribution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("MinTargetCapacity")
        private Integer minTargetCapacity;

        private SpecifyCapacityDistribution(Builder builder) {
            this.instanceTypes = builder.instanceTypes;
            this.minTargetCapacity = builder.minTargetCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecifyCapacityDistribution create() {
            return builder().build();
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return minTargetCapacity
         */
        public Integer getMinTargetCapacity() {
            return this.minTargetCapacity;
        }

        public static final class Builder {
            private java.util.List<String> instanceTypes; 
            private Integer minTargetCapacity; 

            private Builder() {
            } 

            private Builder(SpecifyCapacityDistribution model) {
                this.instanceTypes = model.instanceTypes;
                this.minTargetCapacity = model.minTargetCapacity;
            } 

            /**
             * <p>The set of instance types. Duplicates are not allowed, and the instance types must be within the range of LaunchTemplateConfig.InstanceType.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The minimum number of instances to deliver within the <code>InstanceTypes</code> range.</p>
             * <blockquote>
             * <p>The sum of all MinTargetCapacity values (<code>sum(MinTargetCapacity)</code>) must be less than or equal to TotalTargetCapacity. If any instance type set cannot meet the MinTargetCapacity requirement due to insufficient inventory or other reasons, the entire request fails and no instances are created.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minTargetCapacity(Integer minTargetCapacity) {
                this.minTargetCapacity = minTargetCapacity;
                return this;
            }

            public SpecifyCapacityDistribution build() {
                return new SpecifyCapacityDistribution(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupRequest</p>
     */
    public static class PrePaidOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecifyCapacityDistribution")
        private java.util.List<SpecifyCapacityDistribution> specifyCapacityDistribution;

        private PrePaidOptions(Builder builder) {
            this.specifyCapacityDistribution = builder.specifyCapacityDistribution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrePaidOptions create() {
            return builder().build();
        }

        /**
         * @return specifyCapacityDistribution
         */
        public java.util.List<SpecifyCapacityDistribution> getSpecifyCapacityDistribution() {
            return this.specifyCapacityDistribution;
        }

        public static final class Builder {
            private java.util.List<SpecifyCapacityDistribution> specifyCapacityDistribution; 

            private Builder() {
            } 

            private Builder(PrePaidOptions model) {
                this.specifyCapacityDistribution = model.specifyCapacityDistribution;
            } 

            /**
             * <p>The minimum capacity set for different instance types. This parameter is supported only when <code>AutoProvisioningGroupType = request</code>.</p>
             */
            public Builder specifyCapacityDistribution(java.util.List<SpecifyCapacityDistribution> specifyCapacityDistribution) {
                this.specifyCapacityDistribution = specifyCapacityDistribution;
                return this;
            }

            public PrePaidOptions build() {
                return new PrePaidOptions(this);
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
        private java.util.List<String> privatePoolIds;

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
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<String> privatePoolIds; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(ResourcePoolOptions model) {
                this.privatePoolIds = model.privatePoolIds;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The list of private pool IDs. Valid values: 1 to 20.</p>
             */
            public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>The resource pool includes private pools generated after elasticity assurance or capacity reservation takes effect, and public pools for instance startup. Valid values:</p>
             * <ul>
             * <li><p>PrivatePoolFirst: private pool preferred. When this strategy is selected, if ResourcePoolOptions.PrivatePoolIds is specified, the specified private pools are used first. If no private pool is specified or the specified private pool has insufficient capacity, open-type private pools are automatically matched. If no eligible private pool is available, the public pool is used to create instances.</p>
             * </li>
             * <li><p>PrivatePoolOnly: private pool only. When this strategy is selected, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pool has insufficient capacity, the instance fails to start.</p>
             * </li>
             * <li><p>PublicPoolOnly: uses the public pool to create instances.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(SystemDiskConfig model) {
                this.diskCategory = model.diskCategory;
            } 

            /**
             * <p>The category of the system disk. You can specify multiple candidate disk categories. The specified order determines the priority of each disk category. When a disk category is unavailable, the system automatically switches to the next category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the auto provisioning group.</p>
             * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the auto provisioning group.</p>
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
