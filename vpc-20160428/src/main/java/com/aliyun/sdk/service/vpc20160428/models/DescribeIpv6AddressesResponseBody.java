// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6AddressesResponseBody</p>
 */
public class DescribeIpv6AddressesResponseBody extends TeaModel {
    @NameInMap("Ipv6Addresses")
    private Ipv6Addresses ipv6Addresses;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpv6AddressesResponseBody(Builder builder) {
        this.ipv6Addresses = builder.ipv6Addresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6AddressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6Addresses
     */
    public Ipv6Addresses getIpv6Addresses() {
        return this.ipv6Addresses;
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
        private Ipv6Addresses ipv6Addresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the IPv6 address.
         */
        public Builder ipv6Addresses(Ipv6Addresses ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * The page number of the returned page. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpv6AddressesResponseBody build() {
            return new DescribeIpv6AddressesResponseBody(this);
        } 

    } 

    public static class Ipv6InternetBandwidth extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("HasReservationData")
        private Boolean hasReservationData;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("Ipv6InternetBandwidthId")
        private String ipv6InternetBandwidthId;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        private Long reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        private Ipv6InternetBandwidth(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.hasReservationData = builder.hasReservationData;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.ipv6InternetBandwidthId = builder.ipv6InternetBandwidthId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6InternetBandwidth create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return hasReservationData
         */
        public Boolean getHasReservationData() {
            return this.hasReservationData;
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
         * @return ipv6InternetBandwidthId
         */
        public String getIpv6InternetBandwidthId() {
            return this.ipv6InternetBandwidthId;
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
        public Long getReservationBandwidth() {
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

        public static final class Builder {
            private Integer bandwidth; 
            private String businessStatus; 
            private Boolean hasReservationData; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String ipv6InternetBandwidthId; 
            private String reservationActiveTime; 
            private Long reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 

            /**
             * The dedicated Internet bandwidth of the IPv6 address. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The status of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             * *   **SecurityLocked**
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * Indicates whether renewal data is included. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true** **true** is returned only when **IncludeReservationData** is set to **true** and some orders have not taken effect.
             */
            public Builder hasReservationData(Boolean hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The billing method of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * Only **PostPaid** may be returned, which indicates the pay-as-you-go billing method.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The billing method of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **PayByTraffic**
             * *   **PayByBandwidth**
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The Internet bandwidth ID of the IPv6 address.
             */
            public Builder ipv6InternetBandwidthId(String ipv6InternetBandwidthId) {
                this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
                return this;
            }

            /**
             * The time when the renewal takes effect. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(Long reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The metering method that is used after the renewal takes effect.
             * <p>
             * 
             * *   **PayByTraffic**
             * *   **PayByBandwidth**
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The type of the renewal order. Only **RENEW** may be returned, which indicates that the order is placed for service renewal.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            public Ipv6InternetBandwidth build() {
                return new Ipv6InternetBandwidth(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. The tag key cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be up to 128 characters in length. It can be an empty string. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             * 
             * Each tag key corresponds to one tag value. You can specify at most 20 tag values at a time.
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
    public static class Ipv6Address extends TeaModel {
        @NameInMap("AllocationTime")
        private String allocationTime;

        @NameInMap("AssociatedInstanceId")
        private String associatedInstanceId;

        @NameInMap("AssociatedInstanceType")
        private String associatedInstanceType;

        @NameInMap("Ipv6Address")
        private String ipv6Address;

        @NameInMap("Ipv6AddressDescription")
        private String ipv6AddressDescription;

        @NameInMap("Ipv6AddressId")
        private String ipv6AddressId;

        @NameInMap("Ipv6AddressName")
        private String ipv6AddressName;

        @NameInMap("Ipv6GatewayId")
        private String ipv6GatewayId;

        @NameInMap("Ipv6InternetBandwidth")
        private Ipv6InternetBandwidth ipv6InternetBandwidth;

        @NameInMap("Ipv6Isp")
        private String ipv6Isp;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RealBandwidth")
        private Integer realBandwidth;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Ipv6Address(Builder builder) {
            this.allocationTime = builder.allocationTime;
            this.associatedInstanceId = builder.associatedInstanceId;
            this.associatedInstanceType = builder.associatedInstanceType;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6AddressDescription = builder.ipv6AddressDescription;
            this.ipv6AddressId = builder.ipv6AddressId;
            this.ipv6AddressName = builder.ipv6AddressName;
            this.ipv6GatewayId = builder.ipv6GatewayId;
            this.ipv6InternetBandwidth = builder.ipv6InternetBandwidth;
            this.ipv6Isp = builder.ipv6Isp;
            this.networkType = builder.networkType;
            this.realBandwidth = builder.realBandwidth;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceManaged = builder.serviceManaged;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Address create() {
            return builder().build();
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return associatedInstanceId
         */
        public String getAssociatedInstanceId() {
            return this.associatedInstanceId;
        }

        /**
         * @return associatedInstanceType
         */
        public String getAssociatedInstanceType() {
            return this.associatedInstanceType;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6AddressDescription
         */
        public String getIpv6AddressDescription() {
            return this.ipv6AddressDescription;
        }

        /**
         * @return ipv6AddressId
         */
        public String getIpv6AddressId() {
            return this.ipv6AddressId;
        }

        /**
         * @return ipv6AddressName
         */
        public String getIpv6AddressName() {
            return this.ipv6AddressName;
        }

        /**
         * @return ipv6GatewayId
         */
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        /**
         * @return ipv6InternetBandwidth
         */
        public Ipv6InternetBandwidth getIpv6InternetBandwidth() {
            return this.ipv6InternetBandwidth;
        }

        /**
         * @return ipv6Isp
         */
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return realBandwidth
         */
        public Integer getRealBandwidth() {
            return this.realBandwidth;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String allocationTime; 
            private String associatedInstanceId; 
            private String associatedInstanceType; 
            private String ipv6Address; 
            private String ipv6AddressDescription; 
            private String ipv6AddressId; 
            private String ipv6AddressName; 
            private String ipv6GatewayId; 
            private Ipv6InternetBandwidth ipv6InternetBandwidth; 
            private String ipv6Isp; 
            private String networkType; 
            private Integer realBandwidth; 
            private String resourceGroupId; 
            private Integer serviceManaged; 
            private String status; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The time when the IPv6 address was created.
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * The ID of the instance associated with the IPv6 address.
             */
            public Builder associatedInstanceId(String associatedInstanceId) {
                this.associatedInstanceId = associatedInstanceId;
                return this;
            }

            /**
             * The type of instance associated with the IPv6 address.
             */
            public Builder associatedInstanceType(String associatedInstanceType) {
                this.associatedInstanceType = associatedInstanceType;
                return this;
            }

            /**
             * The IPv6 address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * The description of the IPv6 address.
             */
            public Builder ipv6AddressDescription(String ipv6AddressDescription) {
                this.ipv6AddressDescription = ipv6AddressDescription;
                return this;
            }

            /**
             * The ID of the IPv6 address.
             */
            public Builder ipv6AddressId(String ipv6AddressId) {
                this.ipv6AddressId = ipv6AddressId;
                return this;
            }

            /**
             * The name of the IPv6 address.
             */
            public Builder ipv6AddressName(String ipv6AddressName) {
                this.ipv6AddressName = ipv6AddressName;
                return this;
            }

            /**
             * The ID of the IPv6 gateway to which the IPv6 address belongs.
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
                return this;
            }

            /**
             * The Internet bandwidth of the IPv6 address.
             */
            public Builder ipv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
                this.ipv6InternetBandwidth = ipv6InternetBandwidth;
                return this;
            }

            /**
             * The ISP of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **BGP** (default)
             * *   **ChinaMobile**
             * *   **ChinaUnicom**
             * *   **ChinaTelecom**
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
                return this;
            }

            /**
             * The type of connection supported by the IPv6 address. Valid values:
             * <p>
             * 
             * *   **Private**
             * *   **Public**
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The peak bandwidth of the IPv6 address.
             */
            public Builder realBandwidth(Integer realBandwidth) {
                this.realBandwidth = realBandwidth;
                return this;
            }

            /**
             * The ID of the resource group to which the IPv6 gateway belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the instance is managed. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The status of the IPv6 address.
             * <p>
             * 
             * *   **Pending**
             * *   **Available**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch to which the IPv6 address belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC to which the IPv6 address belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Ipv6Address build() {
                return new Ipv6Address(this);
            } 

        } 

    }
    public static class Ipv6Addresses extends TeaModel {
        @NameInMap("Ipv6Address")
        private java.util.List < Ipv6Address> ipv6Address;

        private Ipv6Addresses(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Addresses create() {
            return builder().build();
        }

        /**
         * @return ipv6Address
         */
        public java.util.List < Ipv6Address> getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private java.util.List < Ipv6Address> ipv6Address; 

            /**
             * The IPv6 address.
             */
            public Builder ipv6Address(java.util.List < Ipv6Address> ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Addresses build() {
                return new Ipv6Addresses(this);
            } 

        } 

    }
}
