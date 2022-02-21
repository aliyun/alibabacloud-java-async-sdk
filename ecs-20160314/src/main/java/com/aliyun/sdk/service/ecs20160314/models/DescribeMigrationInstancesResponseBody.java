// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationInstancesResponseBody</p>
 */
public class DescribeMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("MigrationInstanceSet")
    private MigrationInstanceSet migrationInstanceSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMigrationInstancesResponseBody(Builder builder) {
        this.migrationInstanceSet = builder.migrationInstanceSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return migrationInstanceSet
     */
    public MigrationInstanceSet getMigrationInstanceSet() {
        return this.migrationInstanceSet;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private MigrationInstanceSet migrationInstanceSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MigrationInstanceSet.
         */
        public Builder migrationInstanceSet(MigrationInstanceSet migrationInstanceSet) {
            this.migrationInstanceSet = migrationInstanceSet;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMigrationInstancesResponseBody build() {
            return new DescribeMigrationInstancesResponseBody(this);
        } 

    } 

    public static class SecurityGroupIdSets extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private SecurityGroupIdSets(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIdSets create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIdSets build() {
                return new SecurityGroupIdSets(this);
            } 

        } 

    }
    public static class SecurityGroupIdSetsAfterTransition extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private SecurityGroupIdSetsAfterTransition(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIdSetsAfterTransition create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIdSetsAfterTransition build() {
                return new SecurityGroupIdSetsAfterTransition(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class MigrationInstance extends TeaModel {
        @NameInMap("BusinessMigrationType")
        private String businessMigrationType;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChangePublicIp")
        private Boolean changePublicIp;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("HasLocalDisk")
        private Boolean hasLocalDisk;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("InternetIpAfterTransition")
        private String internetIpAfterTransition;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("IntranetIpAfterTransition")
        private String intranetIpAfterTransition;

        @NameInMap("LoadProgress")
        private String loadProgress;

        @NameInMap("MacAddressAfterTransition")
        private String macAddressAfterTransition;

        @NameInMap("MergeProgress")
        private String mergeProgress;

        @NameInMap("MigrationPlanId")
        private String migrationPlanId;

        @NameInMap("MigrationStatus")
        private String migrationStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetworkConnectivityStatus")
        private Boolean networkConnectivityStatus;

        @NameInMap("NetworkMigrationType")
        private Integer networkMigrationType;

        @NameInMap("NonStandardInstanceType")
        private Boolean nonStandardInstanceType;

        @NameInMap("PrivateMacAddress")
        private String privateMacAddress;

        @NameInMap("PublicMacAddress")
        private String publicMacAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityGroupIdSets")
        private SecurityGroupIdSets securityGroupIdSets;

        @NameInMap("SecurityGroupIdSetsAfterTransition")
        private SecurityGroupIdSetsAfterTransition securityGroupIdSetsAfterTransition;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TargetVSwitchId")
        private String targetVSwitchId;

        @NameInMap("TargetVpcId")
        private String targetVpcId;

        @NameInMap("TargetZoneId")
        private String targetZoneId;

        @NameInMap("TransitionTime")
        private String transitionTime;

        @NameInMap("ZoneId")
        private String zoneId;

        private MigrationInstance(Builder builder) {
            this.businessMigrationType = builder.businessMigrationType;
            this.businessStatus = builder.businessStatus;
            this.changePublicIp = builder.changePublicIp;
            this.finishTime = builder.finishTime;
            this.hasLocalDisk = builder.hasLocalDisk;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.internetIp = builder.internetIp;
            this.internetIpAfterTransition = builder.internetIpAfterTransition;
            this.intranetIp = builder.intranetIp;
            this.intranetIpAfterTransition = builder.intranetIpAfterTransition;
            this.loadProgress = builder.loadProgress;
            this.macAddressAfterTransition = builder.macAddressAfterTransition;
            this.mergeProgress = builder.mergeProgress;
            this.migrationPlanId = builder.migrationPlanId;
            this.migrationStatus = builder.migrationStatus;
            this.name = builder.name;
            this.networkConnectivityStatus = builder.networkConnectivityStatus;
            this.networkMigrationType = builder.networkMigrationType;
            this.nonStandardInstanceType = builder.nonStandardInstanceType;
            this.privateMacAddress = builder.privateMacAddress;
            this.publicMacAddress = builder.publicMacAddress;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupIdSets = builder.securityGroupIdSets;
            this.securityGroupIdSetsAfterTransition = builder.securityGroupIdSetsAfterTransition;
            this.status = builder.status;
            this.tags = builder.tags;
            this.targetVSwitchId = builder.targetVSwitchId;
            this.targetVpcId = builder.targetVpcId;
            this.targetZoneId = builder.targetZoneId;
            this.transitionTime = builder.transitionTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationInstance create() {
            return builder().build();
        }

        /**
         * @return businessMigrationType
         */
        public String getBusinessMigrationType() {
            return this.businessMigrationType;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return changePublicIp
         */
        public Boolean getChangePublicIp() {
            return this.changePublicIp;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return hasLocalDisk
         */
        public Boolean getHasLocalDisk() {
            return this.hasLocalDisk;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return internetIpAfterTransition
         */
        public String getInternetIpAfterTransition() {
            return this.internetIpAfterTransition;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return intranetIpAfterTransition
         */
        public String getIntranetIpAfterTransition() {
            return this.intranetIpAfterTransition;
        }

        /**
         * @return loadProgress
         */
        public String getLoadProgress() {
            return this.loadProgress;
        }

        /**
         * @return macAddressAfterTransition
         */
        public String getMacAddressAfterTransition() {
            return this.macAddressAfterTransition;
        }

        /**
         * @return mergeProgress
         */
        public String getMergeProgress() {
            return this.mergeProgress;
        }

        /**
         * @return migrationPlanId
         */
        public String getMigrationPlanId() {
            return this.migrationPlanId;
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkConnectivityStatus
         */
        public Boolean getNetworkConnectivityStatus() {
            return this.networkConnectivityStatus;
        }

        /**
         * @return networkMigrationType
         */
        public Integer getNetworkMigrationType() {
            return this.networkMigrationType;
        }

        /**
         * @return nonStandardInstanceType
         */
        public Boolean getNonStandardInstanceType() {
            return this.nonStandardInstanceType;
        }

        /**
         * @return privateMacAddress
         */
        public String getPrivateMacAddress() {
            return this.privateMacAddress;
        }

        /**
         * @return publicMacAddress
         */
        public String getPublicMacAddress() {
            return this.publicMacAddress;
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
         * @return securityGroupIdSets
         */
        public SecurityGroupIdSets getSecurityGroupIdSets() {
            return this.securityGroupIdSets;
        }

        /**
         * @return securityGroupIdSetsAfterTransition
         */
        public SecurityGroupIdSetsAfterTransition getSecurityGroupIdSetsAfterTransition() {
            return this.securityGroupIdSetsAfterTransition;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetVSwitchId
         */
        public String getTargetVSwitchId() {
            return this.targetVSwitchId;
        }

        /**
         * @return targetVpcId
         */
        public String getTargetVpcId() {
            return this.targetVpcId;
        }

        /**
         * @return targetZoneId
         */
        public String getTargetZoneId() {
            return this.targetZoneId;
        }

        /**
         * @return transitionTime
         */
        public String getTransitionTime() {
            return this.transitionTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String businessMigrationType; 
            private String businessStatus; 
            private Boolean changePublicIp; 
            private String finishTime; 
            private Boolean hasLocalDisk; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceType; 
            private String internetIp; 
            private String internetIpAfterTransition; 
            private String intranetIp; 
            private String intranetIpAfterTransition; 
            private String loadProgress; 
            private String macAddressAfterTransition; 
            private String mergeProgress; 
            private String migrationPlanId; 
            private String migrationStatus; 
            private String name; 
            private Boolean networkConnectivityStatus; 
            private Integer networkMigrationType; 
            private Boolean nonStandardInstanceType; 
            private String privateMacAddress; 
            private String publicMacAddress; 
            private String regionId; 
            private String resourceGroupId; 
            private SecurityGroupIdSets securityGroupIdSets; 
            private SecurityGroupIdSetsAfterTransition securityGroupIdSetsAfterTransition; 
            private String status; 
            private Tags tags; 
            private String targetVSwitchId; 
            private String targetVpcId; 
            private String targetZoneId; 
            private String transitionTime; 
            private String zoneId; 

            /**
             * BusinessMigrationType.
             */
            public Builder businessMigrationType(String businessMigrationType) {
                this.businessMigrationType = businessMigrationType;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * ChangePublicIp.
             */
            public Builder changePublicIp(Boolean changePublicIp) {
                this.changePublicIp = changePublicIp;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * HasLocalDisk.
             */
            public Builder hasLocalDisk(Boolean hasLocalDisk) {
                this.hasLocalDisk = hasLocalDisk;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * InternetIpAfterTransition.
             */
            public Builder internetIpAfterTransition(String internetIpAfterTransition) {
                this.internetIpAfterTransition = internetIpAfterTransition;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * IntranetIpAfterTransition.
             */
            public Builder intranetIpAfterTransition(String intranetIpAfterTransition) {
                this.intranetIpAfterTransition = intranetIpAfterTransition;
                return this;
            }

            /**
             * LoadProgress.
             */
            public Builder loadProgress(String loadProgress) {
                this.loadProgress = loadProgress;
                return this;
            }

            /**
             * MacAddressAfterTransition.
             */
            public Builder macAddressAfterTransition(String macAddressAfterTransition) {
                this.macAddressAfterTransition = macAddressAfterTransition;
                return this;
            }

            /**
             * MergeProgress.
             */
            public Builder mergeProgress(String mergeProgress) {
                this.mergeProgress = mergeProgress;
                return this;
            }

            /**
             * MigrationPlanId.
             */
            public Builder migrationPlanId(String migrationPlanId) {
                this.migrationPlanId = migrationPlanId;
                return this;
            }

            /**
             * MigrationStatus.
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
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
             * NetworkConnectivityStatus.
             */
            public Builder networkConnectivityStatus(Boolean networkConnectivityStatus) {
                this.networkConnectivityStatus = networkConnectivityStatus;
                return this;
            }

            /**
             * NetworkMigrationType.
             */
            public Builder networkMigrationType(Integer networkMigrationType) {
                this.networkMigrationType = networkMigrationType;
                return this;
            }

            /**
             * NonStandardInstanceType.
             */
            public Builder nonStandardInstanceType(Boolean nonStandardInstanceType) {
                this.nonStandardInstanceType = nonStandardInstanceType;
                return this;
            }

            /**
             * PrivateMacAddress.
             */
            public Builder privateMacAddress(String privateMacAddress) {
                this.privateMacAddress = privateMacAddress;
                return this;
            }

            /**
             * PublicMacAddress.
             */
            public Builder publicMacAddress(String publicMacAddress) {
                this.publicMacAddress = publicMacAddress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityGroupIdSets.
             */
            public Builder securityGroupIdSets(SecurityGroupIdSets securityGroupIdSets) {
                this.securityGroupIdSets = securityGroupIdSets;
                return this;
            }

            /**
             * SecurityGroupIdSetsAfterTransition.
             */
            public Builder securityGroupIdSetsAfterTransition(SecurityGroupIdSetsAfterTransition securityGroupIdSetsAfterTransition) {
                this.securityGroupIdSetsAfterTransition = securityGroupIdSetsAfterTransition;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetVSwitchId.
             */
            public Builder targetVSwitchId(String targetVSwitchId) {
                this.targetVSwitchId = targetVSwitchId;
                return this;
            }

            /**
             * TargetVpcId.
             */
            public Builder targetVpcId(String targetVpcId) {
                this.targetVpcId = targetVpcId;
                return this;
            }

            /**
             * TargetZoneId.
             */
            public Builder targetZoneId(String targetZoneId) {
                this.targetZoneId = targetZoneId;
                return this;
            }

            /**
             * TransitionTime.
             */
            public Builder transitionTime(String transitionTime) {
                this.transitionTime = transitionTime;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MigrationInstance build() {
                return new MigrationInstance(this);
            } 

        } 

    }
    public static class MigrationInstanceSet extends TeaModel {
        @NameInMap("MigrationInstance")
        private java.util.List < MigrationInstance> migrationInstance;

        private MigrationInstanceSet(Builder builder) {
            this.migrationInstance = builder.migrationInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationInstanceSet create() {
            return builder().build();
        }

        /**
         * @return migrationInstance
         */
        public java.util.List < MigrationInstance> getMigrationInstance() {
            return this.migrationInstance;
        }

        public static final class Builder {
            private java.util.List < MigrationInstance> migrationInstance; 

            /**
             * MigrationInstance.
             */
            public Builder migrationInstance(java.util.List < MigrationInstance> migrationInstance) {
                this.migrationInstance = migrationInstance;
                return this;
            }

            public MigrationInstanceSet build() {
                return new MigrationInstanceSet(this);
            } 

        } 

    }
}
