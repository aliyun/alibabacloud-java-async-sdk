// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInternetTupleResponseBody} extends {@link TeaModel}
 *
 * <p>GetInternetTupleResponseBody</p>
 */
public class GetInternetTupleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInternetTupleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInternetTupleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The ranking result of Internet traffic data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInternetTupleResponseBody build() {
            return new GetInternetTupleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRegion")
        private String accessRegion;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("ByteCount")
        private Double byteCount;

        @com.aliyun.core.annotation.NameInMap("CloudCity")
        private String cloudCity;

        @com.aliyun.core.annotation.NameInMap("CloudCountry")
        private String cloudCountry;

        @com.aliyun.core.annotation.NameInMap("CloudIp")
        private String cloudIp;

        @com.aliyun.core.annotation.NameInMap("CloudIsp")
        private String cloudIsp;

        @com.aliyun.core.annotation.NameInMap("CloudPort")
        private String cloudPort;

        @com.aliyun.core.annotation.NameInMap("CloudProduct")
        private String cloudProduct;

        @com.aliyun.core.annotation.NameInMap("CloudProvince")
        private String cloudProvince;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("InByteCount")
        private Double inByteCount;

        @com.aliyun.core.annotation.NameInMap("InOutOrderCount")
        private Double inOutOrderCount;

        @com.aliyun.core.annotation.NameInMap("InPacketCount")
        private Double inPacketCount;

        @com.aliyun.core.annotation.NameInMap("InRetranCount")
        private Double inRetranCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OtherCity")
        private String otherCity;

        @com.aliyun.core.annotation.NameInMap("OtherCountry")
        private String otherCountry;

        @com.aliyun.core.annotation.NameInMap("OtherIp")
        private String otherIp;

        @com.aliyun.core.annotation.NameInMap("OtherIsp")
        private String otherIsp;

        @com.aliyun.core.annotation.NameInMap("OtherPort")
        private String otherPort;

        @com.aliyun.core.annotation.NameInMap("OtherProduct")
        private String otherProduct;

        @com.aliyun.core.annotation.NameInMap("OtherProvince")
        private String otherProvince;

        @com.aliyun.core.annotation.NameInMap("OutByteCount")
        private Double outByteCount;

        @com.aliyun.core.annotation.NameInMap("OutOrderCount")
        private Double outOrderCount;

        @com.aliyun.core.annotation.NameInMap("OutOutOrderCount")
        private Double outOutOrderCount;

        @com.aliyun.core.annotation.NameInMap("OutPacketCount")
        private Double outPacketCount;

        @com.aliyun.core.annotation.NameInMap("OutRetranCount")
        private Double outRetranCount;

        @com.aliyun.core.annotation.NameInMap("PacketCount")
        private Double packetCount;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RetransmitRate")
        private Double retransmitRate;

        @com.aliyun.core.annotation.NameInMap("Rtt")
        private Double rtt;

        private Data(Builder builder) {
            this.accessRegion = builder.accessRegion;
            this.beginTime = builder.beginTime;
            this.byteCount = builder.byteCount;
            this.cloudCity = builder.cloudCity;
            this.cloudCountry = builder.cloudCountry;
            this.cloudIp = builder.cloudIp;
            this.cloudIsp = builder.cloudIsp;
            this.cloudPort = builder.cloudPort;
            this.cloudProduct = builder.cloudProduct;
            this.cloudProvince = builder.cloudProvince;
            this.direction = builder.direction;
            this.inByteCount = builder.inByteCount;
            this.inOutOrderCount = builder.inOutOrderCount;
            this.inPacketCount = builder.inPacketCount;
            this.inRetranCount = builder.inRetranCount;
            this.instanceId = builder.instanceId;
            this.otherCity = builder.otherCity;
            this.otherCountry = builder.otherCountry;
            this.otherIp = builder.otherIp;
            this.otherIsp = builder.otherIsp;
            this.otherPort = builder.otherPort;
            this.otherProduct = builder.otherProduct;
            this.otherProvince = builder.otherProvince;
            this.outByteCount = builder.outByteCount;
            this.outOrderCount = builder.outOrderCount;
            this.outOutOrderCount = builder.outOutOrderCount;
            this.outPacketCount = builder.outPacketCount;
            this.outRetranCount = builder.outRetranCount;
            this.packetCount = builder.packetCount;
            this.protocol = builder.protocol;
            this.retransmitRate = builder.retransmitRate;
            this.rtt = builder.rtt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessRegion
         */
        public String getAccessRegion() {
            return this.accessRegion;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return byteCount
         */
        public Double getByteCount() {
            return this.byteCount;
        }

        /**
         * @return cloudCity
         */
        public String getCloudCity() {
            return this.cloudCity;
        }

        /**
         * @return cloudCountry
         */
        public String getCloudCountry() {
            return this.cloudCountry;
        }

        /**
         * @return cloudIp
         */
        public String getCloudIp() {
            return this.cloudIp;
        }

        /**
         * @return cloudIsp
         */
        public String getCloudIsp() {
            return this.cloudIsp;
        }

        /**
         * @return cloudPort
         */
        public String getCloudPort() {
            return this.cloudPort;
        }

        /**
         * @return cloudProduct
         */
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        /**
         * @return cloudProvince
         */
        public String getCloudProvince() {
            return this.cloudProvince;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return inByteCount
         */
        public Double getInByteCount() {
            return this.inByteCount;
        }

        /**
         * @return inOutOrderCount
         */
        public Double getInOutOrderCount() {
            return this.inOutOrderCount;
        }

        /**
         * @return inPacketCount
         */
        public Double getInPacketCount() {
            return this.inPacketCount;
        }

        /**
         * @return inRetranCount
         */
        public Double getInRetranCount() {
            return this.inRetranCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return otherCity
         */
        public String getOtherCity() {
            return this.otherCity;
        }

        /**
         * @return otherCountry
         */
        public String getOtherCountry() {
            return this.otherCountry;
        }

        /**
         * @return otherIp
         */
        public String getOtherIp() {
            return this.otherIp;
        }

        /**
         * @return otherIsp
         */
        public String getOtherIsp() {
            return this.otherIsp;
        }

        /**
         * @return otherPort
         */
        public String getOtherPort() {
            return this.otherPort;
        }

        /**
         * @return otherProduct
         */
        public String getOtherProduct() {
            return this.otherProduct;
        }

        /**
         * @return otherProvince
         */
        public String getOtherProvince() {
            return this.otherProvince;
        }

        /**
         * @return outByteCount
         */
        public Double getOutByteCount() {
            return this.outByteCount;
        }

        /**
         * @return outOrderCount
         */
        public Double getOutOrderCount() {
            return this.outOrderCount;
        }

        /**
         * @return outOutOrderCount
         */
        public Double getOutOutOrderCount() {
            return this.outOutOrderCount;
        }

        /**
         * @return outPacketCount
         */
        public Double getOutPacketCount() {
            return this.outPacketCount;
        }

        /**
         * @return outRetranCount
         */
        public Double getOutRetranCount() {
            return this.outRetranCount;
        }

        /**
         * @return packetCount
         */
        public Double getPacketCount() {
            return this.packetCount;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return retransmitRate
         */
        public Double getRetransmitRate() {
            return this.retransmitRate;
        }

        /**
         * @return rtt
         */
        public Double getRtt() {
            return this.rtt;
        }

        public static final class Builder {
            private String accessRegion; 
            private String beginTime; 
            private Double byteCount; 
            private String cloudCity; 
            private String cloudCountry; 
            private String cloudIp; 
            private String cloudIsp; 
            private String cloudPort; 
            private String cloudProduct; 
            private String cloudProvince; 
            private String direction; 
            private Double inByteCount; 
            private Double inOutOrderCount; 
            private Double inPacketCount; 
            private Double inRetranCount; 
            private String instanceId; 
            private String otherCity; 
            private String otherCountry; 
            private String otherIp; 
            private String otherIsp; 
            private String otherPort; 
            private String otherProduct; 
            private String otherProvince; 
            private Double outByteCount; 
            private Double outOrderCount; 
            private Double outOutOrderCount; 
            private Double outPacketCount; 
            private Double outRetranCount; 
            private Double packetCount; 
            private String protocol; 
            private Double retransmitRate; 
            private Double rtt; 

            /**
             * The access point of Alibaba Cloud.
             * <p>
             * 
             * >  This parameter is valid only if you set **InstanceId** to the instance ID of an Anycast elastic IP address (EIP).
             */
            public Builder accessRegion(String accessRegion) {
                this.accessRegion = accessRegion;
                return this;
            }

            /**
             * The beginning of the time range that you queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * The traffic volume. Unit: bytes.
             */
            public Builder byteCount(Double byteCount) {
                this.byteCount = byteCount;
                return this;
            }

            /**
             * The local city.
             */
            public Builder cloudCity(String cloudCity) {
                this.cloudCity = cloudCity;
                return this;
            }

            /**
             * The local country or region.
             */
            public Builder cloudCountry(String cloudCountry) {
                this.cloudCountry = cloudCountry;
                return this;
            }

            /**
             * The local IP address.
             */
            public Builder cloudIp(String cloudIp) {
                this.cloudIp = cloudIp;
                return this;
            }

            /**
             * The local ISP.
             */
            public Builder cloudIsp(String cloudIsp) {
                this.cloudIsp = cloudIsp;
                return this;
            }

            /**
             * The local port.
             */
            public Builder cloudPort(String cloudPort) {
                this.cloudPort = cloudPort;
                return this;
            }

            /**
             * The service code of the instance to which the local IP address belongs.
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * The local province.
             */
            public Builder cloudProvince(String cloudProvince) {
                this.cloudProvince = cloudProvince;
                return this;
            }

            /**
             * The direction of Internet traffic. Valid values:
             * <p>
             * 
             * *   **in**: inbound
             * *   **out**: outbound
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The inbound traffic volume. Unit: bytes.
             */
            public Builder inByteCount(Double inByteCount) {
                this.inByteCount = inByteCount;
                return this;
            }

            /**
             * The number of inbound disordered packets.
             */
            public Builder inOutOrderCount(Double inOutOrderCount) {
                this.inOutOrderCount = inOutOrderCount;
                return this;
            }

            /**
             * The number of inbound packets.
             */
            public Builder inPacketCount(Double inPacketCount) {
                this.inPacketCount = inPacketCount;
                return this;
            }

            /**
             * The number of inbound repeated packets.
             */
            public Builder inRetranCount(Double inRetranCount) {
                this.inRetranCount = inRetranCount;
                return this;
            }

            /**
             * The ID of the instance to which the local IP address belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The remote city. In most cases, this parameter is empty if you set **OtherCountry** to a country except China.
             */
            public Builder otherCity(String otherCity) {
                this.otherCity = otherCity;
                return this;
            }

            /**
             * The remote country or region.
             */
            public Builder otherCountry(String otherCountry) {
                this.otherCountry = otherCountry;
                return this;
            }

            /**
             * The remote IP address.
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * The remote ISP.
             */
            public Builder otherIsp(String otherIsp) {
                this.otherIsp = otherIsp;
                return this;
            }

            /**
             * The remote port.
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * The service code of the instance to which the remote IP address belongs. If the IP address is not on the cloud, this parameter is empty.
             */
            public Builder otherProduct(String otherProduct) {
                this.otherProduct = otherProduct;
                return this;
            }

            /**
             * The remote province. In most cases, this parameter is empty if you set **OtherCountry** to a country except China.
             */
            public Builder otherProvince(String otherProvince) {
                this.otherProvince = otherProvince;
                return this;
            }

            /**
             * The outbound traffic volume. Unit: bytes.
             */
            public Builder outByteCount(Double outByteCount) {
                this.outByteCount = outByteCount;
                return this;
            }

            /**
             * The number of disordered packets.
             */
            public Builder outOrderCount(Double outOrderCount) {
                this.outOrderCount = outOrderCount;
                return this;
            }

            /**
             * The number of outbound disordered packets.
             */
            public Builder outOutOrderCount(Double outOutOrderCount) {
                this.outOutOrderCount = outOutOrderCount;
                return this;
            }

            /**
             * The number of outbound packets.
             */
            public Builder outPacketCount(Double outPacketCount) {
                this.outPacketCount = outPacketCount;
                return this;
            }

            /**
             * The number of outbound repeated packets.
             */
            public Builder outRetranCount(Double outRetranCount) {
                this.outRetranCount = outRetranCount;
                return this;
            }

            /**
             * The number of packets.
             */
            public Builder packetCount(Double packetCount) {
                this.packetCount = packetCount;
                return this;
            }

            /**
             * The protocol number.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The retransmission rate of TCP packets.
             */
            public Builder retransmitRate(Double retransmitRate) {
                this.retransmitRate = retransmitRate;
                return this;
            }

            /**
             * The round-trip time (RTT). Unit: milliseconds.
             */
            public Builder rtt(Double rtt) {
                this.rtt = rtt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
