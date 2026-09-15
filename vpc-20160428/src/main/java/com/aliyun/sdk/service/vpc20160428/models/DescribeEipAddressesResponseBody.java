// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponseBody</p>
 */
public class DescribeEipAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
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
        private EipAddresses eipAddresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEipAddressesResponseBody model) {
            this.eipAddresses = model.eipAddresses;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EipAddresses.
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipAddressesResponseBody build() {
            return new DescribeEipAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class LockReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            private Builder() {
            } 

            private Builder(LockReason model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private java.util.List<LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List<LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List<LockReason> lockReason; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * LockReason.
             */
            public Builder lockReason(java.util.List<LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class SecurityProtectionTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityProtectionType")
        private java.util.List<String> securityProtectionType;

        private SecurityProtectionTypes(Builder builder) {
            this.securityProtectionType = builder.securityProtectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityProtectionTypes create() {
            return builder().build();
        }

        /**
         * @return securityProtectionType
         */
        public java.util.List<String> getSecurityProtectionType() {
            return this.securityProtectionType;
        }

        public static final class Builder {
            private java.util.List<String> securityProtectionType; 

            private Builder() {
            } 

            private Builder(SecurityProtectionTypes model) {
                this.securityProtectionType = model.securityProtectionType;
            } 

            /**
             * SecurityProtectionType.
             */
            public Builder securityProtectionType(java.util.List<String> securityProtectionType) {
                this.securityProtectionType = securityProtectionType;
                return this;
            }

            public SecurityProtectionTypes build() {
                return new SecurityProtectionTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("AllocationTime")
        private String allocationTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageBandwidth")
        private String bandwidthPackageBandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EipBandwidth")
        private String eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HDMonitorStatus")
        private String HDMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
        private String instanceRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Netmode")
        private String netmode;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondLimited")
        private Boolean secondLimited;

        @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
        private SecurityProtectionTypes securityProtectionTypes;

        @com.aliyun.core.annotation.NameInMap("SegmentInstanceId")
        private String segmentInstanceId;

        @com.aliyun.core.annotation.NameInMap("ServiceID")
        private Long serviceID;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageBandwidth = builder.bandwidthPackageBandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageType = builder.bandwidthPackageType;
            this.bizType = builder.bizType;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.eipBandwidth = builder.eipBandwidth;
            this.expiredTime = builder.expiredTime;
            this.HDMonitorStatus = builder.HDMonitorStatus;
            this.hasReservationData = builder.hasReservationData;
            this.ISP = builder.ISP;
            this.instanceId = builder.instanceId;
            this.instanceRegionId = builder.instanceRegionId;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.mode = builder.mode;
            this.name = builder.name;
            this.netmode = builder.netmode;
            this.operationLocks = builder.operationLocks;
            this.privateIpAddress = builder.privateIpAddress;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.regionId = builder.regionId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondLimited = builder.secondLimited;
            this.securityProtectionTypes = builder.securityProtectionTypes;
            this.segmentInstanceId = builder.segmentInstanceId;
            this.serviceID = builder.serviceID;
            this.serviceManaged = builder.serviceManaged;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageBandwidth
         */
        public String getBandwidthPackageBandwidth() {
            return this.bandwidthPackageBandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageType
         */
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eipBandwidth
         */
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return HDMonitorStatus
         */
        public String getHDMonitorStatus() {
            return this.HDMonitorStatus;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRegionId
         */
        public String getInstanceRegionId() {
            return this.instanceRegionId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netmode
         */
        public String getNetmode() {
            return this.netmode;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservationActiveTime
         */
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        /**
         * @return reservationBandwidth
         */
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        /**
         * @return reservationInternetChargeType
         */
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondLimited
         */
        public Boolean getSecondLimited() {
            return this.secondLimited;
        }

        /**
         * @return securityProtectionTypes
         */
        public SecurityProtectionTypes getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
        }

        /**
         * @return segmentInstanceId
         */
        public String getSegmentInstanceId() {
            return this.segmentInstanceId;
        }

        /**
         * @return serviceID
         */
        public Long getServiceID() {
            return this.serviceID;
        }

        /**
         * @return serviceManaged
         */
        public Integer getServiceManaged() {
            return this.serviceManaged;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String allocationId; 
            private String allocationTime; 
            private String bandwidth; 
            private String bandwidthPackageBandwidth; 
            private String bandwidthPackageId; 
            private String bandwidthPackageType; 
            private String bizType; 
            private String businessStatus; 
            private String chargeType; 
            private Boolean deletionProtection; 
            private String description; 
            private String eipBandwidth; 
            private String expiredTime; 
            private String HDMonitorStatus; 
            private String hasReservationData; 
            private String ISP; 
            private String instanceId; 
            private String instanceRegionId; 
            private String instanceType; 
            private String internetChargeType; 
            private String ipAddress; 
            private String mode; 
            private String name; 
            private String netmode; 
            private OperationLocks operationLocks; 
            private String privateIpAddress; 
            private String publicIpAddressPoolId; 
            private String regionId; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private Boolean secondLimited; 
            private SecurityProtectionTypes securityProtectionTypes; 
            private String segmentInstanceId; 
            private Long serviceID; 
            private Integer serviceManaged; 
            private String status; 
            private Tags tags; 
            private String vpcId; 
            private String zone; 

            private Builder() {
            } 

            private Builder(EipAddress model) {
                this.allocationId = model.allocationId;
                this.allocationTime = model.allocationTime;
                this.bandwidth = model.bandwidth;
                this.bandwidthPackageBandwidth = model.bandwidthPackageBandwidth;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthPackageType = model.bandwidthPackageType;
                this.bizType = model.bizType;
                this.businessStatus = model.businessStatus;
                this.chargeType = model.chargeType;
                this.deletionProtection = model.deletionProtection;
                this.description = model.description;
                this.eipBandwidth = model.eipBandwidth;
                this.expiredTime = model.expiredTime;
                this.HDMonitorStatus = model.HDMonitorStatus;
                this.hasReservationData = model.hasReservationData;
                this.ISP = model.ISP;
                this.instanceId = model.instanceId;
                this.instanceRegionId = model.instanceRegionId;
                this.instanceType = model.instanceType;
                this.internetChargeType = model.internetChargeType;
                this.ipAddress = model.ipAddress;
                this.mode = model.mode;
                this.name = model.name;
                this.netmode = model.netmode;
                this.operationLocks = model.operationLocks;
                this.privateIpAddress = model.privateIpAddress;
                this.publicIpAddressPoolId = model.publicIpAddressPoolId;
                this.regionId = model.regionId;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationBandwidth = model.reservationBandwidth;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
                this.reservationOrderType = model.reservationOrderType;
                this.resourceGroupId = model.resourceGroupId;
                this.secondLimited = model.secondLimited;
                this.securityProtectionTypes = model.securityProtectionTypes;
                this.segmentInstanceId = model.segmentInstanceId;
                this.serviceID = model.serviceID;
                this.serviceManaged = model.serviceManaged;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.zone = model.zone;
            } 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * AllocationTime.
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BandwidthPackageBandwidth.
             */
            public Builder bandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
                this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
                return this;
            }

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * BandwidthPackageType.
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
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
             * EipBandwidth.
             */
            public Builder eipBandwidth(String eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
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
             * HDMonitorStatus.
             */
            public Builder HDMonitorStatus(String HDMonitorStatus) {
                this.HDMonitorStatus = HDMonitorStatus;
                return this;
            }

            /**
             * HasReservationData.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
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
             * InstanceRegionId.
             */
            public Builder instanceRegionId(String instanceRegionId) {
                this.instanceRegionId = instanceRegionId;
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
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
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
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
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
             * Netmode.
             */
            public Builder netmode(String netmode) {
                this.netmode = netmode;
                return this;
            }

            /**
             * OperationLocks.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
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
             * PublicIpAddressPoolId.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
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
             * ReservationActiveTime.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * ReservationBandwidth.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * ReservationInternetChargeType.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * ReservationOrderType.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
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
             * SecondLimited.
             */
            public Builder secondLimited(Boolean secondLimited) {
                this.secondLimited = secondLimited;
                return this;
            }

            /**
             * SecurityProtectionTypes.
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * SegmentInstanceId.
             */
            public Builder segmentInstanceId(String segmentInstanceId) {
                this.segmentInstanceId = segmentInstanceId;
                return this;
            }

            /**
             * ServiceID.
             */
            public Builder serviceID(Long serviceID) {
                this.serviceID = serviceID;
                return this;
            }

            /**
             * ServiceManaged.
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class EipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private java.util.List<EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List<EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List<EipAddress> eipAddress; 

            private Builder() {
            } 

            private Builder(EipAddresses model) {
                this.eipAddress = model.eipAddress;
            } 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List<EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
