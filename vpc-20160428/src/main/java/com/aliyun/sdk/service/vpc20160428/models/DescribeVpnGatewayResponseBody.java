// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewayResponseBody</p>
 */
public class DescribeVpnGatewayResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReservationData")
    private ReservationData reservationData;

    @NameInMap("Spec")
    private String spec;

    @NameInMap("SslMaxConnections")
    private Long sslMaxConnections;

    @NameInMap("SslVpn")
    private String sslVpn;

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

    private DescribeVpnGatewayResponseBody(Builder builder) {
        this.autoPropagate = builder.autoPropagate;
        this.businessStatus = builder.businessStatus;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enableBgp = builder.enableBgp;
        this.endTime = builder.endTime;
        this.internetIp = builder.internetIp;
        this.ipsecVpn = builder.ipsecVpn;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.requestId = builder.requestId;
        this.reservationData = builder.reservationData;
        this.spec = builder.spec;
        this.sslMaxConnections = builder.sslMaxConnections;
        this.sslVpn = builder.sslVpn;
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

    public static DescribeVpnGatewayResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Boolean enableBgp; 
        private Long endTime; 
        private String internetIp; 
        private String ipsecVpn; 
        private String name; 
        private String networkType; 
        private String requestId; 
        private ReservationData reservationData; 
        private String spec; 
        private Long sslMaxConnections; 
        private String sslVpn; 
        private String status; 
        private String tag; 
        private Tags tags; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpnGatewayId; 
        private String vpnType; 

        /**
         * AutoPropagate.
         */
        public Builder autoPropagate(Boolean autoPropagate) {
            this.autoPropagate = autoPropagate;
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
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * EnableBgp.
         */
        public Builder enableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InternetIp.
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * IpsecVpn.
         */
        public Builder ipsecVpn(String ipsecVpn) {
            this.ipsecVpn = ipsecVpn;
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
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
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
         * ReservationData.
         */
        public Builder reservationData(ReservationData reservationData) {
            this.reservationData = reservationData;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * SslMaxConnections.
         */
        public Builder sslMaxConnections(Long sslMaxConnections) {
            this.sslMaxConnections = sslMaxConnections;
            return this;
        }

        /**
         * SslVpn.
         */
        public Builder sslVpn(String sslVpn) {
            this.sslVpn = sslVpn;
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
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

        /**
         * VpnGatewayId.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * VpnType.
         */
        public Builder vpnType(String vpnType) {
            this.vpnType = vpnType;
            return this;
        }

        public DescribeVpnGatewayResponseBody build() {
            return new DescribeVpnGatewayResponseBody(this);
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
}
