// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmrAvailableConfigResponseBody</p>
 */
public class ListEmrAvailableConfigResponseBody extends TeaModel {
    @NameInMap("EmrMainVersionList")
    private EmrMainVersionList emrMainVersionList;

    @NameInMap("KeyPairNameList")
    private KeyPairNameList keyPairNameList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupList")
    private SecurityGroupList securityGroupList;

    @NameInMap("VpcInfoList")
    private VpcInfoList vpcInfoList;

    private ListEmrAvailableConfigResponseBody(Builder builder) {
        this.emrMainVersionList = builder.emrMainVersionList;
        this.keyPairNameList = builder.keyPairNameList;
        this.requestId = builder.requestId;
        this.securityGroupList = builder.securityGroupList;
        this.vpcInfoList = builder.vpcInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrAvailableConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return emrMainVersionList
     */
    public EmrMainVersionList getEmrMainVersionList() {
        return this.emrMainVersionList;
    }

    /**
     * @return keyPairNameList
     */
    public KeyPairNameList getKeyPairNameList() {
        return this.keyPairNameList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupList
     */
    public SecurityGroupList getSecurityGroupList() {
        return this.securityGroupList;
    }

    /**
     * @return vpcInfoList
     */
    public VpcInfoList getVpcInfoList() {
        return this.vpcInfoList;
    }

    public static final class Builder {
        private EmrMainVersionList emrMainVersionList; 
        private KeyPairNameList keyPairNameList; 
        private String requestId; 
        private SecurityGroupList securityGroupList; 
        private VpcInfoList vpcInfoList; 

        /**
         * EmrMainVersionList.
         */
        public Builder emrMainVersionList(EmrMainVersionList emrMainVersionList) {
            this.emrMainVersionList = emrMainVersionList;
            return this;
        }

        /**
         * KeyPairNameList.
         */
        public Builder keyPairNameList(KeyPairNameList keyPairNameList) {
            this.keyPairNameList = keyPairNameList;
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
         * SecurityGroupList.
         */
        public Builder securityGroupList(SecurityGroupList securityGroupList) {
            this.securityGroupList = securityGroupList;
            return this;
        }

        /**
         * VpcInfoList.
         */
        public Builder vpcInfoList(VpcInfoList vpcInfoList) {
            this.vpcInfoList = vpcInfoList;
            return this;
        }

        public ListEmrAvailableConfigResponseBody build() {
            return new ListEmrAvailableConfigResponseBody(this);
        } 

    } 

    public static class ClusterServiceInfo extends TeaModel {
        @NameInMap("Mandatory")
        private Boolean mandatory;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        private ClusterServiceInfo(Builder builder) {
            this.mandatory = builder.mandatory;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServiceInfo create() {
            return builder().build();
        }

        /**
         * @return mandatory
         */
        public Boolean getMandatory() {
            return this.mandatory;
        }

        /**
         * @return serviceDisplayName
         */
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private Boolean mandatory; 
            private String serviceDisplayName; 
            private String serviceName; 
            private String serviceVersion; 

            /**
             * Mandatory.
             */
            public Builder mandatory(Boolean mandatory) {
                this.mandatory = mandatory;
                return this;
            }

            /**
             * ServiceDisplayName.
             */
            public Builder serviceDisplayName(String serviceDisplayName) {
                this.serviceDisplayName = serviceDisplayName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public ClusterServiceInfo build() {
                return new ClusterServiceInfo(this);
            } 

        } 

    }
    public static class ClusterServiceInfoList extends TeaModel {
        @NameInMap("ClusterServiceInfo")
        private java.util.List < ClusterServiceInfo> clusterServiceInfo;

        private ClusterServiceInfoList(Builder builder) {
            this.clusterServiceInfo = builder.clusterServiceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServiceInfoList create() {
            return builder().build();
        }

        /**
         * @return clusterServiceInfo
         */
        public java.util.List < ClusterServiceInfo> getClusterServiceInfo() {
            return this.clusterServiceInfo;
        }

        public static final class Builder {
            private java.util.List < ClusterServiceInfo> clusterServiceInfo; 

            /**
             * ClusterServiceInfo.
             */
            public Builder clusterServiceInfo(java.util.List < ClusterServiceInfo> clusterServiceInfo) {
                this.clusterServiceInfo = clusterServiceInfo;
                return this;
            }

            public ClusterServiceInfoList build() {
                return new ClusterServiceInfoList(this);
            } 

        } 

    }
    public static class ClusterTypeInfo extends TeaModel {
        @NameInMap("ClusterServiceInfoList")
        private ClusterServiceInfoList clusterServiceInfoList;

        @NameInMap("ClusterType")
        private String clusterType;

        private ClusterTypeInfo(Builder builder) {
            this.clusterServiceInfoList = builder.clusterServiceInfoList;
            this.clusterType = builder.clusterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfo create() {
            return builder().build();
        }

        /**
         * @return clusterServiceInfoList
         */
        public ClusterServiceInfoList getClusterServiceInfoList() {
            return this.clusterServiceInfoList;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        public static final class Builder {
            private ClusterServiceInfoList clusterServiceInfoList; 
            private String clusterType; 

            /**
             * ClusterServiceInfoList.
             */
            public Builder clusterServiceInfoList(ClusterServiceInfoList clusterServiceInfoList) {
                this.clusterServiceInfoList = clusterServiceInfoList;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            public ClusterTypeInfo build() {
                return new ClusterTypeInfo(this);
            } 

        } 

    }
    public static class ClusterTypeInfoList extends TeaModel {
        @NameInMap("ClusterTypeInfo")
        private java.util.List < ClusterTypeInfo> clusterTypeInfo;

        private ClusterTypeInfoList(Builder builder) {
            this.clusterTypeInfo = builder.clusterTypeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfoList create() {
            return builder().build();
        }

        /**
         * @return clusterTypeInfo
         */
        public java.util.List < ClusterTypeInfo> getClusterTypeInfo() {
            return this.clusterTypeInfo;
        }

        public static final class Builder {
            private java.util.List < ClusterTypeInfo> clusterTypeInfo; 

            /**
             * ClusterTypeInfo.
             */
            public Builder clusterTypeInfo(java.util.List < ClusterTypeInfo> clusterTypeInfo) {
                this.clusterTypeInfo = clusterTypeInfo;
                return this;
            }

            public ClusterTypeInfoList build() {
                return new ClusterTypeInfoList(this);
            } 

        } 

    }
    public static class EmrMainVersion extends TeaModel {
        @NameInMap("ClusterTypeInfoList")
        private ClusterTypeInfoList clusterTypeInfoList;

        @NameInMap("EcmVersion")
        private Boolean ecmVersion;

        @NameInMap("ExtraInfo")
        private String extraInfo;

        @NameInMap("MainVersionName")
        private String mainVersionName;

        @NameInMap("OnCloudNative")
        private Boolean onCloudNative;

        @NameInMap("PublishType")
        private String publishType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("StackVersion")
        private String stackVersion;

        private EmrMainVersion(Builder builder) {
            this.clusterTypeInfoList = builder.clusterTypeInfoList;
            this.ecmVersion = builder.ecmVersion;
            this.extraInfo = builder.extraInfo;
            this.mainVersionName = builder.mainVersionName;
            this.onCloudNative = builder.onCloudNative;
            this.publishType = builder.publishType;
            this.regionId = builder.regionId;
            this.stackName = builder.stackName;
            this.stackVersion = builder.stackVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrMainVersion create() {
            return builder().build();
        }

        /**
         * @return clusterTypeInfoList
         */
        public ClusterTypeInfoList getClusterTypeInfoList() {
            return this.clusterTypeInfoList;
        }

        /**
         * @return ecmVersion
         */
        public Boolean getEcmVersion() {
            return this.ecmVersion;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return mainVersionName
         */
        public String getMainVersionName() {
            return this.mainVersionName;
        }

        /**
         * @return onCloudNative
         */
        public Boolean getOnCloudNative() {
            return this.onCloudNative;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return stackVersion
         */
        public String getStackVersion() {
            return this.stackVersion;
        }

        public static final class Builder {
            private ClusterTypeInfoList clusterTypeInfoList; 
            private Boolean ecmVersion; 
            private String extraInfo; 
            private String mainVersionName; 
            private Boolean onCloudNative; 
            private String publishType; 
            private String regionId; 
            private String stackName; 
            private String stackVersion; 

            /**
             * ClusterTypeInfoList.
             */
            public Builder clusterTypeInfoList(ClusterTypeInfoList clusterTypeInfoList) {
                this.clusterTypeInfoList = clusterTypeInfoList;
                return this;
            }

            /**
             * EcmVersion.
             */
            public Builder ecmVersion(Boolean ecmVersion) {
                this.ecmVersion = ecmVersion;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * MainVersionName.
             */
            public Builder mainVersionName(String mainVersionName) {
                this.mainVersionName = mainVersionName;
                return this;
            }

            /**
             * OnCloudNative.
             */
            public Builder onCloudNative(Boolean onCloudNative) {
                this.onCloudNative = onCloudNative;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
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
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * StackVersion.
             */
            public Builder stackVersion(String stackVersion) {
                this.stackVersion = stackVersion;
                return this;
            }

            public EmrMainVersion build() {
                return new EmrMainVersion(this);
            } 

        } 

    }
    public static class EmrMainVersionList extends TeaModel {
        @NameInMap("EmrMainVersion")
        private java.util.List < EmrMainVersion> emrMainVersion;

        private EmrMainVersionList(Builder builder) {
            this.emrMainVersion = builder.emrMainVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrMainVersionList create() {
            return builder().build();
        }

        /**
         * @return emrMainVersion
         */
        public java.util.List < EmrMainVersion> getEmrMainVersion() {
            return this.emrMainVersion;
        }

        public static final class Builder {
            private java.util.List < EmrMainVersion> emrMainVersion; 

            /**
             * EmrMainVersion.
             */
            public Builder emrMainVersion(java.util.List < EmrMainVersion> emrMainVersion) {
                this.emrMainVersion = emrMainVersion;
                return this;
            }

            public EmrMainVersionList build() {
                return new EmrMainVersionList(this);
            } 

        } 

    }
    public static class KeyPairNameList extends TeaModel {
        @NameInMap("KeyPairName")
        private java.util.List < String > keyPairName;

        private KeyPairNameList(Builder builder) {
            this.keyPairName = builder.keyPairName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPairNameList create() {
            return builder().build();
        }

        /**
         * @return keyPairName
         */
        public java.util.List < String > getKeyPairName() {
            return this.keyPairName;
        }

        public static final class Builder {
            private java.util.List < String > keyPairName; 

            /**
             * KeyPairName.
             */
            public Builder keyPairName(java.util.List < String > keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            public KeyPairNameList build() {
                return new KeyPairNameList(this);
            } 

        } 

    }
    public static class SecurityGroup extends TeaModel {
        @NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsCount")
        private Integer ecsCount;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        @NameInMap("SecurityGroupType")
        private String securityGroupType;

        @NameInMap("VpcId")
        private String vpcId;

        private SecurityGroup(Builder builder) {
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ecsCount = builder.ecsCount;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.securityGroupType = builder.securityGroupType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return availableInstanceAmount
         */
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return securityGroupType
         */
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer availableInstanceAmount; 
            private String creationTime; 
            private String description; 
            private Integer ecsCount; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String securityGroupType; 
            private String vpcId; 

            /**
             * AvailableInstanceAmount.
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * SecurityGroupType.
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
                return this;
            }

            /**
             * VPC ID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    public static class SecurityGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

        private SecurityGroupList(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupList create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityGroup> securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroupList build() {
                return new SecurityGroupList(this);
            } 

        } 

    }
    public static class VswitchInfo extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("VswitchName")
        private String vswitchName;

        @NameInMap("ZoneId")
        private String zoneId;

        private VswitchInfo(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.vswitchName = builder.vswitchName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchInfo create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return vswitchName
         */
        public String getVswitchName() {
            return this.vswitchName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long availableIpAddressCount; 
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private String vpcId; 
            private String vswitchId; 
            private String vswitchName; 
            private String zoneId; 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * VPC ID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * VswitchName.
             */
            public Builder vswitchName(String vswitchName) {
                this.vswitchName = vswitchName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VswitchInfo build() {
                return new VswitchInfo(this);
            } 

        } 

    }
    public static class VswitchInfoList extends TeaModel {
        @NameInMap("VswitchInfo")
        private java.util.List < VswitchInfo> vswitchInfo;

        private VswitchInfoList(Builder builder) {
            this.vswitchInfo = builder.vswitchInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchInfoList create() {
            return builder().build();
        }

        /**
         * @return vswitchInfo
         */
        public java.util.List < VswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

        public static final class Builder {
            private java.util.List < VswitchInfo> vswitchInfo; 

            /**
             * VswitchInfo.
             */
            public Builder vswitchInfo(java.util.List < VswitchInfo> vswitchInfo) {
                this.vswitchInfo = vswitchInfo;
                return this;
            }

            public VswitchInfoList build() {
                return new VswitchInfoList(this);
            } 

        } 

    }
    public static class VpcInfo extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("VRouterId")
        private String vRouterId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        @NameInMap("VswitchInfoList")
        private VswitchInfoList vswitchInfoList;

        private VpcInfo(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.vRouterId = builder.vRouterId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vswitchInfoList = builder.vswitchInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return vRouterId
         */
        public String getVRouterId() {
            return this.vRouterId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        /**
         * @return vswitchInfoList
         */
        public VswitchInfoList getVswitchInfoList() {
            return this.vswitchInfoList;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private String vRouterId; 
            private String vpcId; 
            private String vpcName; 
            private VswitchInfoList vswitchInfoList; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * VRouterId.
             */
            public Builder vRouterId(String vRouterId) {
                this.vRouterId = vRouterId;
                return this;
            }

            /**
             * VPC ID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * VswitchInfoList.
             */
            public Builder vswitchInfoList(VswitchInfoList vswitchInfoList) {
                this.vswitchInfoList = vswitchInfoList;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
    public static class VpcInfoList extends TeaModel {
        @NameInMap("VpcInfo")
        private java.util.List < VpcInfo> vpcInfo;

        private VpcInfoList(Builder builder) {
            this.vpcInfo = builder.vpcInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfoList create() {
            return builder().build();
        }

        /**
         * @return vpcInfo
         */
        public java.util.List < VpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

        public static final class Builder {
            private java.util.List < VpcInfo> vpcInfo; 

            /**
             * VpcInfo.
             */
            public Builder vpcInfo(java.util.List < VpcInfo> vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            public VpcInfoList build() {
                return new VpcInfoList(this);
            } 

        } 

    }
}
