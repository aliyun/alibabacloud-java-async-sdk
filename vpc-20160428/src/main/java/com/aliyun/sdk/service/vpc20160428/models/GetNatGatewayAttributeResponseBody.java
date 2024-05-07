// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatGatewayAttributeResponseBody</p>
 */
public class GetNatGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillingConfig")
    private BillingConfig billingConfig;

    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DeletionProtectionInfo")
    private DeletionProtectionInfo deletionProtectionInfo;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EcsMetricEnabled")
    private Boolean ecsMetricEnabled;

    @com.aliyun.core.annotation.NameInMap("EnableSessionLog")
    private Boolean enableSessionLog;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("ForwardTable")
    private ForwardTable forwardTable;

    @com.aliyun.core.annotation.NameInMap("FullNatTable")
    private FullNatTable fullNatTable;

    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @com.aliyun.core.annotation.NameInMap("LogDelivery")
    private LogDelivery logDelivery;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NatType")
    private String natType;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("PrivateInfo")
    private PrivateInfo privateInfo;

    @com.aliyun.core.annotation.NameInMap("PrivateLinkEnabled")
    private Boolean privateLinkEnabled;

    @com.aliyun.core.annotation.NameInMap("PrivateLinkMode")
    private String privateLinkMode;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SnatTable")
    private SnatTable snatTable;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private GetNatGatewayAttributeResponseBody(Builder builder) {
        this.billingConfig = builder.billingConfig;
        this.businessStatus = builder.businessStatus;
        this.creationTime = builder.creationTime;
        this.deletionProtectionInfo = builder.deletionProtectionInfo;
        this.description = builder.description;
        this.ecsMetricEnabled = builder.ecsMetricEnabled;
        this.enableSessionLog = builder.enableSessionLog;
        this.expiredTime = builder.expiredTime;
        this.forwardTable = builder.forwardTable;
        this.fullNatTable = builder.fullNatTable;
        this.ipList = builder.ipList;
        this.logDelivery = builder.logDelivery;
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
     * @return enableSessionLog
     */
    public Boolean getEnableSessionLog() {
        return this.enableSessionLog;
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
     * @return logDelivery
     */
    public LogDelivery getLogDelivery() {
        return this.logDelivery;
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
        private Boolean enableSessionLog; 
        private String expiredTime; 
        private ForwardTable forwardTable; 
        private FullNatTable fullNatTable; 
        private java.util.List < IpList> ipList; 
        private LogDelivery logDelivery; 
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
         * The billing information.
         */
        public Builder billingConfig(BillingConfig billingConfig) {
            this.billingConfig = billingConfig;
            return this;
        }

        /**
         * The service status of the NAT gateway. Valid values:
         * <p>
         * 
         * *   **Normal**: normal
         * *   **FinancialLocked**: locked due to overdue payments
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * The time when the NAT gateway was created. Format: YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The information about the deletion protection feature.
         */
        public Builder deletionProtectionInfo(DeletionProtectionInfo deletionProtectionInfo) {
            this.deletionProtectionInfo = deletionProtectionInfo;
            return this;
        }

        /**
         * The description of the NAT gateway.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether the traffic monitoring feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }

        /**
         * EnableSessionLog.
         */
        public Builder enableSessionLog(Boolean enableSessionLog) {
            this.enableSessionLog = enableSessionLog;
            return this;
        }

        /**
         * The time when the NAT gateway expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The information about the DNAT table.
         */
        public Builder forwardTable(ForwardTable forwardTable) {
            this.forwardTable = forwardTable;
            return this;
        }

        /**
         * The information about the FULLNAT table.
         */
        public Builder fullNatTable(FullNatTable fullNatTable) {
            this.fullNatTable = fullNatTable;
            return this;
        }

        /**
         * The elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * LogDelivery.
         */
        public Builder logDelivery(LogDelivery logDelivery) {
            this.logDelivery = logDelivery;
            return this;
        }

        /**
         * The name of the NAT gateway.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The type of the Internet NAT gateway. Only **Enhanced** is returned, which indicates an enhanced Internet NAT gateway.
         */
        public Builder natType(String natType) {
            this.natType = natType;
            return this;
        }

        /**
         * The type of the NAT gateway. Valid values:
         * <p>
         * 
         * *   **internet**: an Internet NAT gateway
         * *   **intranet**: a VPC NAT gateway
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * The private network information about the NAT gateway.
         */
        public Builder privateInfo(PrivateInfo privateInfo) {
            this.privateInfo = privateInfo;
            return this;
        }

        /**
         * Indicates whether the NAT gateway supports PrivateLink. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
            this.privateLinkEnabled = privateLinkEnabled;
            return this;
        }

        /**
         * The mode that is used by PrivateLink. Valid values:
         * <p>
         * 
         * *   **FullNat**: the FULLNAT mode
         * *   **Geneve**: the GENEVE mode
         */
        public Builder privateLinkMode(String privateLinkMode) {
            this.privateLinkMode = privateLinkMode;
            return this;
        }

        /**
         * The ID of the region where the NAT gateway is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The information about the SNAT table.
         */
        public Builder snatTable(SnatTable snatTable) {
            this.snatTable = snatTable;
            return this;
        }

        /**
         * The status of the NAT gateway. Valid values:
         * <p>
         * 
         * *   **Creating**: being created. The operation to create a NAT gateway is asynchronous. The NAT gateway remains in the **Creating** state until it is created.
         * *   **Available**: available. After a NAT gateway is created, it remains in a stable state.
         * *   **Modifying**: being modified. The operation to upgrade or downgrade a NAT gateway is asynchronous. The NAT gateway remains in the **Modifying** state until it is upgraded or downgraded.
         * *   **Deleting**: being deleted. The operation to delete a NAT gateway is asynchronous. The NAT gateway remains in the **Deleting** state until it is deleted.
         * *   **Converting**: being converted. The operation to convert a standard NAT gateway to an enhanced NAT gateway is asynchronous. The NAT gateway remains in the **Converting** state until it is converted.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ID of the VPC to which the NAT gateway belongs.
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
        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private String autoPay;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("Spec")
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
             * Indicates whether automatic payment is enabled. If the **InstanceChargeType** parameter is set to **PrePaid**, one of the following values is returned:
             * <p>
             * 
             * *   **false**: disabled. After an order is generated, you must go to the Order Center to complete the payment.
             * *   **true**: enabled. Payments are automatically completed.
             * 
             * The return value of this parameter is empty if **InstanceChargeType** is set to **PostPaid**.
             */
            public Builder autoPay(String autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * The billing method of the NAT gateway. The value is set to **PostPaid**, which indicates the pay-as-you-go billing method.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The metering method of the NAT gateway. Valid values:
             * <p>
             * 
             * *   **PayBySpec**: pay-by-specification
             * *   **PayByLcu**: pay-by-CU
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The specification of the Internet NAT gateway. If the **InternetChargeType** parameter is set to **PayBySpec**, one of the following values is returned:
             * <p>
             * 
             * *   **Small**: small
             * 
             * *   **Middle**: medium
             * 
             * *   **Large**: large
             * 
             *     The return value of this parameter is empty if **InternetChargeType** is set to **PayByLcu**.
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
        @com.aliyun.core.annotation.NameInMap("Enabled")
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
             * Indicates whether deletion protection is enabled.
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
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
        @com.aliyun.core.annotation.NameInMap("ForwardEntryCount")
        private Integer forwardEntryCount;

        @com.aliyun.core.annotation.NameInMap("ForwardTableId")
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
             * The number of DNAT entries.
             */
            public Builder forwardEntryCount(Integer forwardEntryCount) {
                this.forwardEntryCount = forwardEntryCount;
                return this;
            }

            /**
             * The ID of the DNAT table.
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
        @com.aliyun.core.annotation.NameInMap("FullNatEntryCount")
        private Long fullNatEntryCount;

        @com.aliyun.core.annotation.NameInMap("FullNatTableId")
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
             * The number of FULLNAT entries.
             */
            public Builder fullNatEntryCount(Long fullNatEntryCount) {
                this.fullNatEntryCount = fullNatEntryCount;
                return this;
            }

            /**
             * The ID of the FULLNAT table.
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
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("UsingStatus")
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
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The IP address of the EIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The association status of the EIP.
             * <p>
             * 
             * *   **idle**: The EIP is not specified in an SNAT entry or a DNAT entry.
             * *   **UsedBySnatTable**: The EIP is specified in an SNAT entry.
             * *   **UsedByForwardTable**: The EIP is specified in a DNAT entry.
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
    public static class LogDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliverLogsErrorMessage")
        private String deliverLogsErrorMessage;

        @com.aliyun.core.annotation.NameInMap("DeliveryStatus")
        private String deliveryStatus;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryType")
        private String logDeliveryType;

        @com.aliyun.core.annotation.NameInMap("LogDestination")
        private String logDestination;

        private LogDelivery(Builder builder) {
            this.deliverLogsErrorMessage = builder.deliverLogsErrorMessage;
            this.deliveryStatus = builder.deliveryStatus;
            this.logDeliveryType = builder.logDeliveryType;
            this.logDestination = builder.logDestination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDelivery create() {
            return builder().build();
        }

        /**
         * @return deliverLogsErrorMessage
         */
        public String getDeliverLogsErrorMessage() {
            return this.deliverLogsErrorMessage;
        }

        /**
         * @return deliveryStatus
         */
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        /**
         * @return logDeliveryType
         */
        public String getLogDeliveryType() {
            return this.logDeliveryType;
        }

        /**
         * @return logDestination
         */
        public String getLogDestination() {
            return this.logDestination;
        }

        public static final class Builder {
            private String deliverLogsErrorMessage; 
            private String deliveryStatus; 
            private String logDeliveryType; 
            private String logDestination; 

            /**
             * DeliverLogsErrorMessage.
             */
            public Builder deliverLogsErrorMessage(String deliverLogsErrorMessage) {
                this.deliverLogsErrorMessage = deliverLogsErrorMessage;
                return this;
            }

            /**
             * DeliveryStatus.
             */
            public Builder deliveryStatus(String deliveryStatus) {
                this.deliveryStatus = deliveryStatus;
                return this;
            }

            /**
             * LogDeliveryType.
             */
            public Builder logDeliveryType(String logDeliveryType) {
                this.logDeliveryType = logDeliveryType;
                return this;
            }

            /**
             * LogDestination.
             */
            public Builder logDestination(String logDestination) {
                this.logDestination = logDestination;
                return this;
            }

            public LogDelivery build() {
                return new LogDelivery(this);
            } 

        } 

    }
    public static class PrivateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private String eniInstanceId;

        @com.aliyun.core.annotation.NameInMap("IzNo")
        private String izNo;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
        private Integer maxBandwidth;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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
             * The ID of the elastic network interface (ENI).
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * The zone where the NAT gateway is deployed.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * The maximum bandwidth. Unit: Mbit/s.
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the vSwitch to which the NAT gateway belongs.
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
        @com.aliyun.core.annotation.NameInMap("SnatEntryCount")
        private Integer snatEntryCount;

        @com.aliyun.core.annotation.NameInMap("SnatTableId")
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
             * The number of SNAT entries.
             */
            public Builder snatEntryCount(Integer snatEntryCount) {
                this.snatEntryCount = snatEntryCount;
                return this;
            }

            /**
             * The ID of the SNAT table.
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
