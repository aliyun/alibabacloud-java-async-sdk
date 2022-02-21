// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatGatewayAttributeResponseBody</p>
 */
public class GetNatGatewayAttributeResponseBody extends TeaModel {
    @NameInMap("BillingConfig")
    private BillingConfig billingConfig;

    @NameInMap("BusinessStatus")
    private String businessStatus;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("DeletionProtectionInfo")
    private DeletionProtectionInfo deletionProtectionInfo;

    @NameInMap("Description")
    private String description;

    @NameInMap("EcsMetricEnabled")
    private Boolean ecsMetricEnabled;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("ForwardTable")
    private ForwardTable forwardTable;

    @NameInMap("FullNatTable")
    private FullNatTable fullNatTable;

    @NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @NameInMap("Name")
    private String name;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("NatType")
    private String natType;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("PrivateInfo")
    private PrivateInfo privateInfo;

    @NameInMap("PrivateLinkEnabled")
    private Boolean privateLinkEnabled;

    @NameInMap("PrivateLinkMode")
    private String privateLinkMode;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SnatTable")
    private SnatTable snatTable;

    @NameInMap("Status")
    private String status;

    @NameInMap("VpcId")
    private String vpcId;

    private GetNatGatewayAttributeResponseBody(Builder builder) {
        this.billingConfig = builder.billingConfig;
        this.businessStatus = builder.businessStatus;
        this.creationTime = builder.creationTime;
        this.deletionProtectionInfo = builder.deletionProtectionInfo;
        this.description = builder.description;
        this.ecsMetricEnabled = builder.ecsMetricEnabled;
        this.expiredTime = builder.expiredTime;
        this.forwardTable = builder.forwardTable;
        this.fullNatTable = builder.fullNatTable;
        this.ipList = builder.ipList;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.natType = builder.natType;
        this.networkType = builder.networkType;
        this.privateInfo = builder.privateInfo;
        this.privateLinkEnabled = builder.privateLinkEnabled;
        this.privateLinkMode = builder.privateLinkMode;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.snatTable = builder.snatTable;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatGatewayAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return billingConfig
     */
    public BillingConfig getBillingConfig() {
        return this.billingConfig;
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return deletionProtectionInfo
     */
    public DeletionProtectionInfo getDeletionProtectionInfo() {
        return this.deletionProtectionInfo;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ecsMetricEnabled
     */
    public Boolean getEcsMetricEnabled() {
        return this.ecsMetricEnabled;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return forwardTable
     */
    public ForwardTable getForwardTable() {
        return this.forwardTable;
    }

    /**
     * @return fullNatTable
     */
    public FullNatTable getFullNatTable() {
        return this.fullNatTable;
    }

    /**
     * @return ipList
     */
    public java.util.List < IpList> getIpList() {
        return this.ipList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natType
     */
    public String getNatType() {
        return this.natType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return privateInfo
     */
    public PrivateInfo getPrivateInfo() {
        return this.privateInfo;
    }

    /**
     * @return privateLinkEnabled
     */
    public Boolean getPrivateLinkEnabled() {
        return this.privateLinkEnabled;
    }

    /**
     * @return privateLinkMode
     */
    public String getPrivateLinkMode() {
        return this.privateLinkMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return snatTable
     */
    public SnatTable getSnatTable() {
        return this.snatTable;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private BillingConfig billingConfig; 
        private String businessStatus; 
        private String creationTime; 
        private DeletionProtectionInfo deletionProtectionInfo; 
        private String description; 
        private Boolean ecsMetricEnabled; 
        private String expiredTime; 
        private ForwardTable forwardTable; 
        private FullNatTable fullNatTable; 
        private java.util.List < IpList> ipList; 
        private String name; 
        private String natGatewayId; 
        private String natType; 
        private String networkType; 
        private PrivateInfo privateInfo; 
        private Boolean privateLinkEnabled; 
        private String privateLinkMode; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private SnatTable snatTable; 
        private String status; 
        private String vpcId; 

        /**
         * BillingConfig.
         */
        public Builder billingConfig(BillingConfig billingConfig) {
            this.billingConfig = billingConfig;
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
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * DeletionProtectionInfo.
         */
        public Builder deletionProtectionInfo(DeletionProtectionInfo deletionProtectionInfo) {
            this.deletionProtectionInfo = deletionProtectionInfo;
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
         * EcsMetricEnabled.
         */
        public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * ForwardTable.
         */
        public Builder forwardTable(ForwardTable forwardTable) {
            this.forwardTable = forwardTable;
            return this;
        }

        /**
         * FullNatTable.
         */
        public Builder fullNatTable(FullNatTable fullNatTable) {
            this.fullNatTable = fullNatTable;
            return this;
        }

        /**
         * IpList.
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
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
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * NatType.
         */
        public Builder natType(String natType) {
            this.natType = natType;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * PrivateInfo.
         */
        public Builder privateInfo(PrivateInfo privateInfo) {
            this.privateInfo = privateInfo;
            return this;
        }

        /**
         * 默认不支持私网链接。设置为1则意味着支持私网链接
         */
        public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
            this.privateLinkEnabled = privateLinkEnabled;
            return this;
        }

        /**
         * Fullnat：使用FullNat模式 Geneve：使用Geneve模式。 预估大部分场景都是非Geneve模式的。
         */
        public Builder privateLinkMode(String privateLinkMode) {
            this.privateLinkMode = privateLinkMode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * SnatTable.
         */
        public Builder snatTable(SnatTable snatTable) {
            this.snatTable = snatTable;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GetNatGatewayAttributeResponseBody build() {
            return new GetNatGatewayAttributeResponseBody(this);
        } 

    } 

    public static class BillingConfig extends TeaModel {
        @NameInMap("AutoPay")
        private String autoPay;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("Spec")
        private String spec;

        private BillingConfig(Builder builder) {
            this.autoPay = builder.autoPay;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingConfig create() {
            return builder().build();
        }

        /**
         * @return autoPay
         */
        public String getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String autoPay; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String spec; 

            /**
             * AutoPay.
             */
            public Builder autoPay(String autoPay) {
                this.autoPay = autoPay;
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
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public BillingConfig build() {
                return new BillingConfig(this);
            } 

        } 

    }
    public static class DeletionProtectionInfo extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        private DeletionProtectionInfo(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletionProtectionInfo create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public DeletionProtectionInfo build() {
                return new DeletionProtectionInfo(this);
            } 

        } 

    }
    public static class ForwardTable extends TeaModel {
        @NameInMap("ForwardEntryCount")
        private Integer forwardEntryCount;

        @NameInMap("ForwardTableId")
        private String forwardTableId;

        private ForwardTable(Builder builder) {
            this.forwardEntryCount = builder.forwardEntryCount;
            this.forwardTableId = builder.forwardTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTable create() {
            return builder().build();
        }

        /**
         * @return forwardEntryCount
         */
        public Integer getForwardEntryCount() {
            return this.forwardEntryCount;
        }

        /**
         * @return forwardTableId
         */
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private Integer forwardEntryCount; 
            private String forwardTableId; 

            /**
             * ForwardEntryCount.
             */
            public Builder forwardEntryCount(Integer forwardEntryCount) {
                this.forwardEntryCount = forwardEntryCount;
                return this;
            }

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(String forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTable build() {
                return new ForwardTable(this);
            } 

        } 

    }
    public static class FullNatTable extends TeaModel {
        @NameInMap("FullNatEntryCount")
        private Long fullNatEntryCount;

        @NameInMap("FullNatTableId")
        private String fullNatTableId;

        private FullNatTable(Builder builder) {
            this.fullNatEntryCount = builder.fullNatEntryCount;
            this.fullNatTableId = builder.fullNatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNatTable create() {
            return builder().build();
        }

        /**
         * @return fullNatEntryCount
         */
        public Long getFullNatEntryCount() {
            return this.fullNatEntryCount;
        }

        /**
         * @return fullNatTableId
         */
        public String getFullNatTableId() {
            return this.fullNatTableId;
        }

        public static final class Builder {
            private Long fullNatEntryCount; 
            private String fullNatTableId; 

            /**
             * FullNatEntryCount.
             */
            public Builder fullNatEntryCount(Long fullNatEntryCount) {
                this.fullNatEntryCount = fullNatEntryCount;
                return this;
            }

            /**
             * FullNatTableId.
             */
            public Builder fullNatTableId(String fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            public FullNatTable build() {
                return new FullNatTable(this);
            } 

        } 

    }
    public static class IpList extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("UsingStatus")
        private String usingStatus;

        private IpList(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
            this.usingStatus = builder.usingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return usingStatus
         */
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 
            private String usingStatus; 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * UsingStatus.
             */
            public Builder usingStatus(String usingStatus) {
                this.usingStatus = usingStatus;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
    public static class PrivateInfo extends TeaModel {
        @NameInMap("EniInstanceId")
        private String eniInstanceId;

        @NameInMap("IzNo")
        private String izNo;

        @NameInMap("MaxBandwidth")
        private Integer maxBandwidth;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("VswitchId")
        private String vswitchId;

        private PrivateInfo(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
            this.izNo = builder.izNo;
            this.maxBandwidth = builder.maxBandwidth;
            this.privateIpAddress = builder.privateIpAddress;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateInfo create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return maxBandwidth
         */
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String eniInstanceId; 
            private String izNo; 
            private Integer maxBandwidth; 
            private String privateIpAddress; 
            private String vswitchId; 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * MaxBandwidth.
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public PrivateInfo build() {
                return new PrivateInfo(this);
            } 

        } 

    }
    public static class SnatTable extends TeaModel {
        @NameInMap("SnatEntryCount")
        private Integer snatEntryCount;

        @NameInMap("SnatTableId")
        private String snatTableId;

        private SnatTable(Builder builder) {
            this.snatEntryCount = builder.snatEntryCount;
            this.snatTableId = builder.snatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTable create() {
            return builder().build();
        }

        /**
         * @return snatEntryCount
         */
        public Integer getSnatEntryCount() {
            return this.snatEntryCount;
        }

        /**
         * @return snatTableId
         */
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public static final class Builder {
            private Integer snatEntryCount; 
            private String snatTableId; 

            /**
             * SnatEntryCount.
             */
            public Builder snatEntryCount(Integer snatEntryCount) {
                this.snatEntryCount = snatEntryCount;
                return this;
            }

            /**
             * SnatTableId.
             */
            public Builder snatTableId(String snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            public SnatTable build() {
                return new SnatTable(this);
            } 

        } 

    }
}
