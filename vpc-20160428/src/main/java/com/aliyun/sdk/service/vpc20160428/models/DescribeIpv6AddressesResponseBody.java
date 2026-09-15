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
 * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6AddressesResponseBody</p>
 */
public class DescribeIpv6AddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6Addresses")
    private Ipv6Addresses ipv6Addresses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeIpv6AddressesResponseBody model) {
            this.ipv6Addresses = model.ipv6Addresses;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Ipv6Addresses.
         */
        public Builder ipv6Addresses(Ipv6Addresses ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging queries. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>AA4486A8-B6AE-469E-AB09-820EF8ECFA2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpv6AddressesResponseBody build() {
            return new DescribeIpv6AddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6AddressesResponseBody</p>
     */
    public static class Ipv6InternetBandwidth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private Boolean hasReservationData;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("Ipv6InternetBandwidthId")
        private String ipv6InternetBandwidthId;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationBandwidth")
        private Long reservationBandwidth;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
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

            private Builder() {
            } 

            private Builder(Ipv6InternetBandwidth model) {
                this.bandwidth = model.bandwidth;
                this.businessStatus = model.businessStatus;
                this.hasReservationData = model.hasReservationData;
                this.instanceChargeType = model.instanceChargeType;
                this.internetChargeType = model.internetChargeType;
                this.ipv6InternetBandwidthId = model.ipv6InternetBandwidthId;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationBandwidth = model.reservationBandwidth;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
                this.reservationOrderType = model.reservationOrderType;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
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
             * HasReservationData.
             */
            public Builder hasReservationData(Boolean hasReservationData) {
                this.hasReservationData = hasReservationData;
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
             * Ipv6InternetBandwidthId.
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
    /**
     * 
     * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6AddressesResponseBody</p>
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
     * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6AddressesResponseBody</p>
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
     * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6AddressesResponseBody</p>
     */
    public static class Ipv6Address extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("AllocationTime")
        private String allocationTime;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstanceId")
        private String associatedInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstanceType")
        private String associatedInstanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressDescription")
        private String ipv6AddressDescription;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressId")
        private String ipv6AddressId;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressName")
        private String ipv6AddressName;

        @com.aliyun.core.annotation.NameInMap("Ipv6GatewayId")
        private String ipv6GatewayId;

        @com.aliyun.core.annotation.NameInMap("Ipv6InternetBandwidth")
        private Ipv6InternetBandwidth ipv6InternetBandwidth;

        @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
        private String ipv6Isp;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RealBandwidth")
        private Integer realBandwidth;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Ipv6Address(Builder builder) {
            this.addressType = builder.addressType;
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
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
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
            private String addressType; 
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

            private Builder() {
            } 

            private Builder(Ipv6Address model) {
                this.addressType = model.addressType;
                this.allocationTime = model.allocationTime;
                this.associatedInstanceId = model.associatedInstanceId;
                this.associatedInstanceType = model.associatedInstanceType;
                this.ipv6Address = model.ipv6Address;
                this.ipv6AddressDescription = model.ipv6AddressDescription;
                this.ipv6AddressId = model.ipv6AddressId;
                this.ipv6AddressName = model.ipv6AddressName;
                this.ipv6GatewayId = model.ipv6GatewayId;
                this.ipv6InternetBandwidth = model.ipv6InternetBandwidth;
                this.ipv6Isp = model.ipv6Isp;
                this.networkType = model.networkType;
                this.realBandwidth = model.realBandwidth;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceManaged = model.serviceManaged;
                this.status = model.status;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * AddressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
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
             * AssociatedInstanceId.
             */
            public Builder associatedInstanceId(String associatedInstanceId) {
                this.associatedInstanceId = associatedInstanceId;
                return this;
            }

            /**
             * AssociatedInstanceType.
             */
            public Builder associatedInstanceType(String associatedInstanceType) {
                this.associatedInstanceType = associatedInstanceType;
                return this;
            }

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * Ipv6AddressDescription.
             */
            public Builder ipv6AddressDescription(String ipv6AddressDescription) {
                this.ipv6AddressDescription = ipv6AddressDescription;
                return this;
            }

            /**
             * Ipv6AddressId.
             */
            public Builder ipv6AddressId(String ipv6AddressId) {
                this.ipv6AddressId = ipv6AddressId;
                return this;
            }

            /**
             * Ipv6AddressName.
             */
            public Builder ipv6AddressName(String ipv6AddressName) {
                this.ipv6AddressName = ipv6AddressName;
                return this;
            }

            /**
             * Ipv6GatewayId.
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
                return this;
            }

            /**
             * Ipv6InternetBandwidth.
             */
            public Builder ipv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
                this.ipv6InternetBandwidth = ipv6InternetBandwidth;
                return this;
            }

            /**
             * Ipv6Isp.
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
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
             * RealBandwidth.
             */
            public Builder realBandwidth(Integer realBandwidth) {
                this.realBandwidth = realBandwidth;
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
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
    /**
     * 
     * {@link DescribeIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6AddressesResponseBody</p>
     */
    public static class Ipv6Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private java.util.List<Ipv6Address> ipv6Address;

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
        public java.util.List<Ipv6Address> getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private java.util.List<Ipv6Address> ipv6Address; 

            private Builder() {
            } 

            private Builder(Ipv6Addresses model) {
                this.ipv6Address = model.ipv6Address;
            } 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(java.util.List<Ipv6Address> ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Addresses build() {
                return new Ipv6Addresses(this);
            } 

        } 

    }
}
