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
         * The details about the IPv6 addresses.
         */
        public Builder ipv6Addresses(Ipv6Addresses ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * The number of the returned page. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
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
             * The exclusive Internet bandwidth of the IPv6 address. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The status of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **Normal**: normal
             * *   **FinancialLocked**: locked due to overdue payments
             * *   **SecurityLocked**: locked due to security reasons
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * HasReservationData.
             */
            public Builder hasReservationData(Boolean hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The billing method of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * **PostPaid**: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The billing method of the Internet bandwidth of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **PayByTraffic**: pay-by-data-transfer
             * *   **PayByBandwidth**: pay-by-bandwidth
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The instance ID of the Internet bandwidth of the IPv6 address.
             */
            public Builder ipv6InternetBandwidthId(String ipv6InternetBandwidthId) {
                this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
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
            public Builder reservationBandwidth(Long reservationBandwidth) {
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

            public Ipv6InternetBandwidth build() {
                return new Ipv6InternetBandwidth(this);
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

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Ipv6Address(Builder builder) {
            this.allocationTime = builder.allocationTime;
            this.associatedInstanceId = builder.associatedInstanceId;
            this.associatedInstanceType = builder.associatedInstanceType;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6AddressId = builder.ipv6AddressId;
            this.ipv6AddressName = builder.ipv6AddressName;
            this.ipv6GatewayId = builder.ipv6GatewayId;
            this.ipv6InternetBandwidth = builder.ipv6InternetBandwidth;
            this.ipv6Isp = builder.ipv6Isp;
            this.networkType = builder.networkType;
            this.realBandwidth = builder.realBandwidth;
            this.status = builder.status;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String ipv6AddressId; 
            private String ipv6AddressName; 
            private String ipv6GatewayId; 
            private Ipv6InternetBandwidth ipv6InternetBandwidth; 
            private String ipv6Isp; 
            private String networkType; 
            private Integer realBandwidth; 
            private String status; 
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
             * The ID of the instance that is assigned the IPv6 address.
             */
            public Builder associatedInstanceId(String associatedInstanceId) {
                this.associatedInstanceId = associatedInstanceId;
                return this;
            }

            /**
             * The type of the instance that is assigned the IPv6 address.
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
             * The information about the Internet bandwidth of the IPv6 address.
             */
            public Builder ipv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
                this.ipv6InternetBandwidth = ipv6InternetBandwidth;
                return this;
            }

            /**
             * The service provider of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **BGP**: Alibaba Cloud Border Gateway Protocol (BGP) IPv6. This is the default value.
             * *   **ChinaMobile**: China Mobile (single ISP).
             * *   **ChinaUnicom**: China Unicom (single ISP).
             * *   **ChinaTelecom**: China Telecom (single ISP).
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
                return this;
            }

            /**
             * The type of communication supported by the IPv6 address. Valid values:
             * <p>
             * 
             * *   **Private**: communication within private networks
             * *   **Public**: communication over the Internet
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The maximum bandwidth value of the IPv6 address.
             * <p>
             * 
             * *   If the IPv6 address is associated with an EIP bandwidth plan, the value of **RealBandwidth** is the maximum bandwidth value of the EIP bandwidth plan.
             * *   If the IPv6 address is not associated with an EIP bandwidth plan, the value of **RealBandwidth** is the maximum bandwidth value of the Internet bandwidth of the IPv6 address.
             * *   If the IPv6 address is not associated with an EIP bandwidth plan or an Internet bandwidth plan, the values of **RealBandwidth** and **Bandwidth** are both 0.
             */
            public Builder realBandwidth(Integer realBandwidth) {
                this.realBandwidth = realBandwidth;
                return this;
            }

            /**
             * The status of the IPv6 address. Valid values:
             * <p>
             * 
             * *   **Pending**: being configured
             * *   **Available**: available
             */
            public Builder status(String status) {
                this.status = status;
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
