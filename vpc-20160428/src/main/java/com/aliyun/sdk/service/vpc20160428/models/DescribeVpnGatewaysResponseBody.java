// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewaysResponseBody</p>
 */
public class DescribeVpnGatewaysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnGateways")
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
         * The public IP address of the VPN gateway.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of SSL-VPN connections supported by the VPN gateway.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The maximum bandwidth of the VPN gateway. **M** indicates Mbit/s.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timestamp when the VPN gateway was created. Unit: milliseconds.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Indicates whether BGP routes are automatically advertised to the VPC. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder vpnGateways(VpnGateways vpnGateways) {
            this.vpnGateways = vpnGateways;
            return this;
        }

        public DescribeVpnGatewaysResponseBody build() {
            return new DescribeVpnGatewaysResponseBody(this);
        } 

    } 

    public static class ReservationData extends TeaModel {
        @NameInMap("ReservationEndTime")
        private String reservationEndTime;

        @NameInMap("ReservationIpsec")
        private String reservationIpsec;

        @NameInMap("ReservationMaxConnections")
        private Integer reservationMaxConnections;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @NameInMap("ReservationSpec")
        private String reservationSpec;

        @NameInMap("ReservationSsl")
        private String reservationSsl;

        @NameInMap("Status")
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
             * ReservationEndTime.
             */
            public Builder reservationEndTime(String reservationEndTime) {
                this.reservationEndTime = reservationEndTime;
                return this;
            }

            /**
             * ReservationIpsec.
             */
            public Builder reservationIpsec(String reservationIpsec) {
                this.reservationIpsec = reservationIpsec;
                return this;
            }

            /**
             * ReservationMaxConnections.
             */
            public Builder reservationMaxConnections(Integer reservationMaxConnections) {
                this.reservationMaxConnections = reservationMaxConnections;
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
             * ReservationSpec.
             */
            public Builder reservationSpec(String reservationSpec) {
                this.reservationSpec = reservationSpec;
                return this;
            }

            /**
             * ReservationSsl.
             */
            public Builder reservationSsl(String reservationSsl) {
                this.reservationSsl = reservationSsl;
                return this;
            }

            /**
             * Status.
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
             * The maximum number of concurrent SSL-VPN connections of the pending order.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * If the order type is **TEMP_UPGRADE** (temporary upgrade), this parameter specifies the time when the temporary upgrade expires. 
             * <p>
             * 
             * If the order type is **RENEWCHANGE** (renewal with an upgrade or a downgrade) or **RENEW** (renewal), this parameter indicates the time when the renewal or renewal with an upgrade or a downgrade takes effect.
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
    public static class VpnGateway extends TeaModel {
        @NameInMap("AutoPropagate")
        private Boolean autoPropagate;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisasterRecoveryInternetIp")
        private String disasterRecoveryInternetIp;

        @NameInMap("DisasterRecoveryVSwitchId")
        private String disasterRecoveryVSwitchId;

        @NameInMap("EnableBgp")
        private Boolean enableBgp;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IpsecVpn")
        private String ipsecVpn;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("ReservationData")
        private ReservationData reservationData;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("SslMaxConnections")
        private Long sslMaxConnections;

        @NameInMap("SslVpn")
        private String sslVpn;

        @NameInMap("SslVpnInternetIp")
        private String sslVpnInternetIp;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        @NameInMap("VpnType")
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
            this.internetIp = builder.internetIp;
            this.ipsecVpn = builder.ipsecVpn;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.reservationData = builder.reservationData;
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
            private String internetIp; 
            private String ipsecVpn; 
            private String name; 
            private String networkType; 
            private ReservationData reservationData; 
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
             * The BGP status of the VPN gateway.
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder autoPropagate(Boolean autoPropagate) {
                this.autoPropagate = autoPropagate;
                return this;
            }

            /**
             * The status of the pending order. 
             * <p>
             * 
             * - **1**: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.
             * - **2**: indicates that the order for a temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specification.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The payment status of the VPN gateway.
             * <p>
             * 
             * *   **Normal:** The VPN gateway is running as expected.
             * *   **FinancialLocked**: The VPN gateway is locked due to overdue payments.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The description of the VPN gateway.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisasterRecoveryInternetIp.
             */
            public Builder disasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
                this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
                return this;
            }

            /**
             * DisasterRecoveryVSwitchId.
             */
            public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
                this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
                return this;
            }

            /**
             * The information about the pending orders. 
             * <p>
             * 
             * >  This parameter is returned only when **IncludeReservationData** is set to **true**.
             */
            public Builder enableBgp(Boolean enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * The list of tags added to the VPN gateway.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the vSwitch to which the VPN gateway belongs.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The network type of the VPN gateway.
             * <p>
             * 
             * *   **public**: public VPN gateway
             * *   **private**: private VPN gateway
             */
            public Builder ipsecVpn(String ipsecVpn) {
                this.ipsecVpn = ipsecVpn;
                return this;
            }

            /**
             * The IPsec-VPN status of the order that has not taken effect. Valid values: 
             * <p>
             * 
             * - **enable**: enabled
             * - **disable**: disabled
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The bandwidth specification of the order that has not taken effect. Unit: Mbit/s.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * ReservationData.
             */
            public Builder reservationData(ReservationData reservationData) {
                this.reservationData = reservationData;
                return this;
            }

            /**
             * The timestamp when the VPN gateway expires. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Indicates whether IPsec-VPN is enabled for the VPN gateway.
             * <p>
             * 
             * *   **enable**: enabled
             * *   **disable**: disabled
             */
            public Builder sslMaxConnections(Long sslMaxConnections) {
                this.sslMaxConnections = sslMaxConnections;
                return this;
            }

            /**
             * The type of the order that has not taken effect. Valid values: 
             * <p>
             * 
             * - **RENEWCHANGE**: renewal with a specification change
             * - **TEMP_UPGRADE**: temporary upgrade
             * - **RENEW**: renewal
             */
            public Builder sslVpn(String sslVpn) {
                this.sslVpn = sslVpn;
                return this;
            }

            /**
             * SslVpnInternetIp.
             */
            public Builder sslVpnInternetIp(String sslVpnInternetIp) {
                this.sslVpnInternetIp = sslVpnInternetIp;
                return this;
            }

            /**
             * The ID of the VPN gateway.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the VPN gateway.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The SSL-VPN status of the order that has not taken effect. Valid values: 
             * <p>
             * 
             * - **enable**: enabled
             * - **disable**: disabled
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The automatically generated tag of the VPN gateway.
             * <p>
             * 
             * *   **VpnEnableBgp**: indicates whether the VPN gateway supports BGP. Valid values:
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * *   **VisuallySsl**: indicates whether the VPN gateway allows you to view information about connected SSL clients.
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * *   **PbrPriority**: indicates whether the VPN gateway allows you to configure priorities for policy-based routes.
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * *   **VpnNewImage**: indicates whether the VPN gateway is upgraded.
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * *   **description**: the description of the VPN gateway. This parameter is for internal system use only.
             * 
             * *   **VpnVersion**: the version of the VPN gateway.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Indicates whether SSL-VPN is enabled for the VPN gateway.
             * <p>
             * 
             * *   **enable**: enabled
             * *   **disable**: disabled
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            /**
             * The billing method of the VPN gateway.
             * <p>
             * 
             * The value is set to **POSTPAY**, which indicates the pay-as-you-go billing method.
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
        @NameInMap("VpnGateway")
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
