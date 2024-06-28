// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewaysResponseBody</p>
 */
public class DescribeVpnGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnGateways")
    private VpnGateways vpnGateways;

    private DescribeVpnGatewaysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnGateways = builder.vpnGateways;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnGatewaysResponseBody create() {
        return builder().build();
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

    /**
     * @return vpnGateways
     */
    public VpnGateways getVpnGateways() {
        return this.vpnGateways;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VpnGateways vpnGateways; 

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The VPN gateways.
         */
        public Builder vpnGateways(VpnGateways vpnGateways) {
            this.vpnGateways = vpnGateways;
            return this;
        }

        public DescribeVpnGatewaysResponseBody build() {
            return new DescribeVpnGatewaysResponseBody(this);
        } 

    } 

    public static class EniInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private java.util.List < String > eniInstanceId;

        private EniInstanceIds(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniInstanceIds create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public java.util.List < String > getEniInstanceId() {
            return this.eniInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > eniInstanceId; 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(java.util.List < String > eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            public EniInstanceIds build() {
                return new EniInstanceIds(this);
            } 

        } 

    }
    public static class ReservationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservationEndTime")
        private String reservationEndTime;

        @com.aliyun.core.annotation.NameInMap("ReservationIpsec")
        private String reservationIpsec;

        @com.aliyun.core.annotation.NameInMap("ReservationMaxConnections")
        private Integer reservationMaxConnections;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ReservationSpec")
        private String reservationSpec;

        @com.aliyun.core.annotation.NameInMap("ReservationSsl")
        private String reservationSsl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReservationData(Builder builder) {
            this.reservationEndTime = builder.reservationEndTime;
            this.reservationIpsec = builder.reservationIpsec;
            this.reservationMaxConnections = builder.reservationMaxConnections;
            this.reservationOrderType = builder.reservationOrderType;
            this.reservationSpec = builder.reservationSpec;
            this.reservationSsl = builder.reservationSsl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservationData create() {
            return builder().build();
        }

        /**
         * @return reservationEndTime
         */
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        /**
         * @return reservationIpsec
         */
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        /**
         * @return reservationMaxConnections
         */
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return reservationSpec
         */
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        /**
         * @return reservationSsl
         */
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reservationEndTime; 
            private String reservationIpsec; 
            private Integer reservationMaxConnections; 
            private String reservationOrderType; 
            private String reservationSpec; 
            private String reservationSsl; 
            private String status; 

            /**
             * If the value of ReservationOrderType is **TEMP_UPGRADE**, this parameter indicates the time when the temporary upgrade expires.
             * <p>
             * 
             * If the value of ReservationOrderType is **RENEWCHANGE** or **RENEW**, this parameter indicates the time when the renewal or renewal with a specification change takes effect.
             */
            public Builder reservationEndTime(String reservationEndTime) {
                this.reservationEndTime = reservationEndTime;
                return this;
            }

            /**
             * The IPsec-VPN status of the pending order. Valid values:
             * <p>
             * 
             * *   **enable**
             * *   **disable**
             */
            public Builder reservationIpsec(String reservationIpsec) {
                this.reservationIpsec = reservationIpsec;
                return this;
            }

            /**
             * The maximum number of concurrent SSL-VPN connections of the pending order.
             */
            public Builder reservationMaxConnections(Integer reservationMaxConnections) {
                this.reservationMaxConnections = reservationMaxConnections;
                return this;
            }

            /**
             * The type of the order that has not taken effect. Valid values:
             * <p>
             * 
             * *   **RENEWCHANGE**: renewal with upgrade or downgrade
             * *   **TEMP_UPGRADE**: temporary upgrade
             * *   **RENEW**: renewal
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * The bandwidth of the pending order. Unit: Mbit/s.
             */
            public Builder reservationSpec(String reservationSpec) {
                this.reservationSpec = reservationSpec;
                return this;
            }

            /**
             * The SSL-VPN status of the pending order. Valid values:
             * <p>
             * 
             * *   **enable**
             * *   **disable**
             */
            public Builder reservationSsl(String reservationSsl) {
                this.reservationSsl = reservationSsl;
                return this;
            }

            /**
             * The status of the pending order.
             * <p>
             * 
             * *   **1**: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.
             * *   **2**: indicates that the order of the temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, the values of **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specifications of the VPN gateway.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReservationData build() {
                return new ReservationData(this);
            } 

        } 

    }
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    public static class VpnGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPropagate")
        private Boolean autoPropagate;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryInternetIp")
        private String disasterRecoveryInternetIp;

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryVSwitchId")
        private String disasterRecoveryVSwitchId;

        @com.aliyun.core.annotation.NameInMap("EnableBgp")
        private Boolean enableBgp;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EniInstanceIds")
        private EniInstanceIds eniInstanceIds;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IpsecVpn")
        private String ipsecVpn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ReservationData")
        private ReservationData reservationData;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("SslMaxConnections")
        private Long sslMaxConnections;

        @com.aliyun.core.annotation.NameInMap("SslVpn")
        private String sslVpn;

        @com.aliyun.core.annotation.NameInMap("SslVpnInternetIp")
        private String sslVpnInternetIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        @com.aliyun.core.annotation.NameInMap("VpnType")
        private String vpnType;

        private VpnGateway(Builder builder) {
            this.autoPropagate = builder.autoPropagate;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.disasterRecoveryInternetIp = builder.disasterRecoveryInternetIp;
            this.disasterRecoveryVSwitchId = builder.disasterRecoveryVSwitchId;
            this.enableBgp = builder.enableBgp;
            this.endTime = builder.endTime;
            this.eniInstanceIds = builder.eniInstanceIds;
            this.internetIp = builder.internetIp;
            this.ipsecVpn = builder.ipsecVpn;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.reservationData = builder.reservationData;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.sslMaxConnections = builder.sslMaxConnections;
            this.sslVpn = builder.sslVpn;
            this.sslVpnInternetIp = builder.sslVpnInternetIp;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpnGatewayId = builder.vpnGatewayId;
            this.vpnType = builder.vpnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnGateway create() {
            return builder().build();
        }

        /**
         * @return autoPropagate
         */
        public Boolean getAutoPropagate() {
            return this.autoPropagate;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disasterRecoveryInternetIp
         */
        public String getDisasterRecoveryInternetIp() {
            return this.disasterRecoveryInternetIp;
        }

        /**
         * @return disasterRecoveryVSwitchId
         */
        public String getDisasterRecoveryVSwitchId() {
            return this.disasterRecoveryVSwitchId;
        }

        /**
         * @return enableBgp
         */
        public Boolean getEnableBgp() {
            return this.enableBgp;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eniInstanceIds
         */
        public EniInstanceIds getEniInstanceIds() {
            return this.eniInstanceIds;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return ipsecVpn
         */
        public String getIpsecVpn() {
            return this.ipsecVpn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return reservationData
         */
        public ReservationData getReservationData() {
            return this.reservationData;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return sslMaxConnections
         */
        public Long getSslMaxConnections() {
            return this.sslMaxConnections;
        }

        /**
         * @return sslVpn
         */
        public String getSslVpn() {
            return this.sslVpn;
        }

        /**
         * @return sslVpnInternetIp
         */
        public String getSslVpnInternetIp() {
            return this.sslVpnInternetIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
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

        /**
         * @return vpnGatewayId
         */
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        /**
         * @return vpnType
         */
        public String getVpnType() {
            return this.vpnType;
        }

        public static final class Builder {
            private Boolean autoPropagate; 
            private String businessStatus; 
            private String chargeType; 
            private Long createTime; 
            private String description; 
            private String disasterRecoveryInternetIp; 
            private String disasterRecoveryVSwitchId; 
            private Boolean enableBgp; 
            private Long endTime; 
            private EniInstanceIds eniInstanceIds; 
            private String internetIp; 
            private String ipsecVpn; 
            private String name; 
            private String networkType; 
            private ReservationData reservationData; 
            private String resourceGroupId; 
            private String spec; 
            private Long sslMaxConnections; 
            private String sslVpn; 
            private String sslVpnInternetIp; 
            private String status; 
            private String tag; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpnGatewayId; 
            private String vpnType; 

            /**
             * Indicates whether BGP routes are automatically advertised to the VPC.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder autoPropagate(Boolean autoPropagate) {
                this.autoPropagate = autoPropagate;
                return this;
            }

            /**
             * The payment status of the VPN gateway.
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The billing method of the VPN gateway.
             * <p>
             * 
             * Only **POSTPAY** may be returned, which indicates the pay-as-you-go billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The timestamp generated when the VPN gateway was created. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the VPN gateway.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The second IP address that is assigned to the VPN gateway to create IPsec-VPN connections.
             * <p>
             * 
             * This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.
             */
            public Builder disasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
                this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
                return this;
            }

            /**
             * The ID of the second vSwitch that is associated with the VPN gateway.
             * <p>
             * 
             * This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.
             */
            public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
                this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
                return this;
            }

            /**
             * The BGP status of the VPN gateway. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableBgp(Boolean enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * The timestamp generated when the VPN gateway expires. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ENIs created by the system for the VPN gateway.
             */
            public Builder eniInstanceIds(EniInstanceIds eniInstanceIds) {
                this.eniInstanceIds = eniInstanceIds;
                return this;
            }

            /**
             * *   If the VPN gateway supports IPsec-VPN connections in single-tunnel mode, the value of this parameter is the IP address of the VPN gateway, which can be used to create IPsec-VPN or SSL-VPN connections.
             * <p>
             * 
             * *   If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the value of this parameter is the first IP address that is used to create an IPsec-VPN connection. The IP address cannot be used to create SSL-VPN connections.
             * 
             *     If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the system assigns two IPsec addresses to the VPN gateway to create IPsec-VPN connections in dual-tunnel mode.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * Indicates whether IPsec-VPN is enabled for the VPN gateway. Valid values:
             * <p>
             * 
             * *   **enable**
             * *   **disable**
             */
            public Builder ipsecVpn(String ipsecVpn) {
                this.ipsecVpn = ipsecVpn;
                return this;
            }

            /**
             * The name of the VPN gateway.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network type of the VPN gateway.
             * <p>
             * 
             * *   **public**
             * *   **private**
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The information about pending orders.
             * <p>
             * 
             * > This parameter is returned only if **IncludeReservationData** is set to **true**.
             */
            public Builder reservationData(ReservationData reservationData) {
                this.reservationData = reservationData;
                return this;
            }

            /**
             * The ID of the resource group to which the VPN gateway belongs.
             * <p>
             * 
             * You can call the [ListResourceGroups](~~158855~~) operation to query resource groups.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The maximum bandwidth of the VPN gateway. Unit: **M**, which indicates Mbit/s.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The number of SSL-VPN connections supported by the VPN gateway.
             */
            public Builder sslMaxConnections(Long sslMaxConnections) {
                this.sslMaxConnections = sslMaxConnections;
                return this;
            }

            /**
             * Indicates whether SSL-VPN is enabled for the VPN gateway. Valid values:
             * <p>
             * 
             * *   **enable**
             * *   **disable**
             */
            public Builder sslVpn(String sslVpn) {
                this.sslVpn = sslVpn;
                return this;
            }

            /**
             * The IP address of the SSL-VPN connection.
             * <p>
             * 
             * This parameter is returned only if the VPN gateway is a public VPN gateway and supports IPsec-VPN connections in dual-tunnel mode. In addition, SSL-VPN must be enabled for the VPN gateway.
             */
            public Builder sslVpnInternetIp(String sslVpnInternetIp) {
                this.sslVpnInternetIp = sslVpnInternetIp;
                return this;
            }

            /**
             * The status of the VPN gateway. Valid values:
             * <p>
             * 
             * *   **init**
             * *   **provisioning**
             * *   **active**
             * *   **updating**
             * *   **deleting**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag that is automatically generated for the VPN gateway. The tag consists of the following parameters:
             * <p>
             * 
             * *   **VpnEnableBgp**: indicates whether the VPN gateway supports BGP. Valid values:
             * 
             *     *   **true**
             *     *   **false**
             * 
             * *   **VisuallySsl**: indicates whether the VPN gateway allows you to view the connection information of SSL clients. Valid values:
             * 
             *     *   **true**
             *     *   **false**
             * 
             * *   **PbrPriority**: indicates whether the VPN gateway allows you to configure priorities for policy-based routes. Valid values:
             * 
             *     *   **true**
             *     *   **false**
             * 
             * *   **VpnNewImage**: indicates whether the VPN gateway is upgraded. Valid values:
             * 
             *     *   **true**
             *     *   **false**: does not query only SQL statements that need to be optimized.
             * 
             * *   **description**: the description of the VPN gateway. This parameter is only for internal use.
             * 
             * *   **VpnVersion**: the version of the VPN gateway.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The tags that are added to the VPN gateway.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch to which the VPN gateway belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC to which the VPN gateway belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the VPN gateway.
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            /**
             * The type of VPN gateway.
             * <p>
             * 
             * Only **Normal** may be returned, which indicates a standard VPN gateway.
             */
            public Builder vpnType(String vpnType) {
                this.vpnType = vpnType;
                return this;
            }

            public VpnGateway build() {
                return new VpnGateway(this);
            } 

        } 

    }
    public static class VpnGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnGateway")
        private java.util.List < VpnGateway> vpnGateway;

        private VpnGateways(Builder builder) {
            this.vpnGateway = builder.vpnGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnGateways create() {
            return builder().build();
        }

        /**
         * @return vpnGateway
         */
        public java.util.List < VpnGateway> getVpnGateway() {
            return this.vpnGateway;
        }

        public static final class Builder {
            private java.util.List < VpnGateway> vpnGateway; 

            /**
             * VpnGateway.
             */
            public Builder vpnGateway(java.util.List < VpnGateway> vpnGateway) {
                this.vpnGateway = vpnGateway;
                return this;
            }

            public VpnGateways build() {
                return new VpnGateways(this);
            } 

        } 

    }
}
