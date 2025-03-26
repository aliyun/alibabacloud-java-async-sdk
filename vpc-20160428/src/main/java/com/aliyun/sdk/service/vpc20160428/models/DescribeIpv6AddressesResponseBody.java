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
         * <p>The details of the IPv6 address.</p>
         */
        public Builder ipv6Addresses(Ipv6Addresses ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>The number of returned entries.</p>
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
             * <p>The dedicated Internet bandwidth of the IPv6 address. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The status of the Internet bandwidth of the IPv6 address. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * <li><strong>SecurityLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>Indicates whether renewal data is included. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong> <strong>true</strong> is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong> and some orders have not taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReservationData(Boolean hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * <p>The billing method of the Internet bandwidth of the IPv6 address. Valid values:</p>
             * <p>Only <strong>PostPaid</strong> may be returned, which indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The billing method of the Internet bandwidth of the IPv6 address. Valid values:</p>
             * <ul>
             * <li><strong>PayByTraffic</strong></li>
             * <li><strong>PayByBandwidth</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The Internet bandwidth ID of the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6bw-hp3b35oq1fj50kbv****</p>
             */
            public Builder ipv6InternetBandwidthId(String ipv6InternetBandwidthId) {
                this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
                return this;
            }

            /**
             * <p>The time when the renewal takes effect. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T16:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder reservationBandwidth(Long reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The metering method that is used after the renewal takes effect.</p>
             * <ul>
             * <li><strong>PayByTraffic</strong></li>
             * <li><strong>PayByBandwidth</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The type of the renewal order. Only <strong>RENEW</strong> may be returned, which indicates that the order is placed for service renewal.</p>
             * 
             * <strong>example:</strong>
             * <p>RENEW</p>
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
             * <p>The tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be up to 128 characters in length. It can be an empty string. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>yunke</p>
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
             * <p>The type of IPv6 address. Valid values:</p>
             * <ul>
             * <li>IPv6Address (default): indicates a single IPv6 IP.</li>
             * <li>IPv6Prefix: indicates IPv6 CIDR.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv6Address</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>The time when the IPv6 address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:56:09Z</p>
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * <p>The ID of the instance associated with the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze72wuqj4y3jl4f****</p>
             */
            public Builder associatedInstanceId(String associatedInstanceId) {
                this.associatedInstanceId = associatedInstanceId;
                return this;
            }

            /**
             * <p>The type of instance associated with the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsInstance</p>
             */
            public Builder associatedInstanceType(String associatedInstanceType) {
                this.associatedInstanceType = associatedInstanceType;
                return this;
            }

            /**
             * <p>The IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:153:3921:851c:c435:7b12:1c5f</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The description of the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipv6AddressDescription(String ipv6AddressDescription) {
                this.ipv6AddressDescription = ipv6AddressDescription;
                return this;
            }

            /**
             * <p>The ID of the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6-2zen5j4axcp5l5qyy****</p>
             */
            public Builder ipv6AddressId(String ipv6AddressId) {
                this.ipv6AddressId = ipv6AddressId;
                return this;
            }

            /**
             * <p>The name of the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipv6AddressName(String ipv6AddressName) {
                this.ipv6AddressName = ipv6AddressName;
                return this;
            }

            /**
             * <p>The ID of the IPv6 gateway to which the IPv6 address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6gw-2zewg0l66s73b4k2q****</p>
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
                return this;
            }

            /**
             * <p>The Internet bandwidth of the IPv6 address.</p>
             */
            public Builder ipv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
                this.ipv6InternetBandwidth = ipv6InternetBandwidth;
                return this;
            }

            /**
             * <p>The ISP of the IPv6 address. Valid values:</p>
             * <ul>
             * <li><strong>BGP</strong> (default)</li>
             * <li><strong>ChinaMobile</strong></li>
             * <li><strong>ChinaUnicom</strong></li>
             * <li><strong>ChinaTelecom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
                return this;
            }

            /**
             * <p>The type of connection supported by the IPv6 address. Valid values:</p>
             * <ul>
             * <li><strong>Private</strong></li>
             * <li><strong>Public</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The peak bandwidth of the IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder realBandwidth(Integer realBandwidth) {
                this.realBandwidth = realBandwidth;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the IPv6 gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the instance is managed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The status of the IPv6 address.</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the IPv6 address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-25navfgbue4g****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the IPv6 address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp15zckdt37pq72zv****</p>
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
             * <p>The IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:153:3921:851c:c435:7b12:1c5f</p>
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
