// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetInternetTupleResponseBody} extends {@link TeaModel}
 *
 * <p>GetInternetTupleResponseBody</p>
 */
public class GetInternetTupleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInternetTupleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ranking result of Internet traffic data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInternetTupleResponseBody build() {
            return new GetInternetTupleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInternetTupleResponseBody} extends {@link TeaModel}
     *
     * <p>GetInternetTupleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessRegion = model.accessRegion;
                this.beginTime = model.beginTime;
                this.byteCount = model.byteCount;
                this.cloudCity = model.cloudCity;
                this.cloudCountry = model.cloudCountry;
                this.cloudIp = model.cloudIp;
                this.cloudIsp = model.cloudIsp;
                this.cloudPort = model.cloudPort;
                this.cloudProduct = model.cloudProduct;
                this.cloudProvince = model.cloudProvince;
                this.direction = model.direction;
                this.inByteCount = model.inByteCount;
                this.inOutOrderCount = model.inOutOrderCount;
                this.inPacketCount = model.inPacketCount;
                this.inRetranCount = model.inRetranCount;
                this.instanceId = model.instanceId;
                this.otherCity = model.otherCity;
                this.otherCountry = model.otherCountry;
                this.otherIp = model.otherIp;
                this.otherIsp = model.otherIsp;
                this.otherPort = model.otherPort;
                this.otherProduct = model.otherProduct;
                this.otherProvince = model.otherProvince;
                this.outByteCount = model.outByteCount;
                this.outOrderCount = model.outOrderCount;
                this.outOutOrderCount = model.outOutOrderCount;
                this.outPacketCount = model.outPacketCount;
                this.outRetranCount = model.outRetranCount;
                this.packetCount = model.packetCount;
                this.protocol = model.protocol;
                this.retransmitRate = model.retransmitRate;
                this.rtt = model.rtt;
            } 

            /**
             * <p>The access point of Alibaba Cloud.</p>
             * <blockquote>
             * <p> This parameter is valid only if you set <strong>InstanceId</strong> to the instance ID of an Anycast elastic IP address (EIP).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong-pop</p>
             */
            public Builder accessRegion(String accessRegion) {
                this.accessRegion = accessRegion;
                return this;
            }

            /**
             * <p>The beginning of the time range that you queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1684373600099</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The traffic volume. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder byteCount(Double byteCount) {
                this.byteCount = byteCount;
                return this;
            }

            /**
             * <p>The local city.</p>
             * 
             * <strong>example:</strong>
             * <p>Nanjing</p>
             */
            public Builder cloudCity(String cloudCity) {
                this.cloudCity = cloudCity;
                return this;
            }

            /**
             * <p>The local country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder cloudCountry(String cloudCountry) {
                this.cloudCountry = cloudCountry;
                return this;
            }

            /**
             * <p>The local IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>112.74.XX.XX</p>
             */
            public Builder cloudIp(String cloudIp) {
                this.cloudIp = cloudIp;
                return this;
            }

            /**
             * <p>The local ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>China Mobile</p>
             */
            public Builder cloudIsp(String cloudIsp) {
                this.cloudIsp = cloudIsp;
                return this;
            }

            /**
             * <p>The local port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder cloudPort(String cloudPort) {
                this.cloudPort = cloudPort;
                return this;
            }

            /**
             * <p>The service code of the instance to which the local IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>EIP</p>
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * <p>The local province.</p>
             * 
             * <strong>example:</strong>
             * <p>Jiangsu</p>
             */
            public Builder cloudProvince(String cloudProvince) {
                this.cloudProvince = cloudProvince;
                return this;
            }

            /**
             * <p>The direction of Internet traffic. Valid values:</p>
             * <ul>
             * <li><strong>in</strong>: inbound</li>
             * <li><strong>out</strong>: outbound</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The inbound traffic volume. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder inByteCount(Double inByteCount) {
                this.inByteCount = inByteCount;
                return this;
            }

            /**
             * <p>The number of inbound disordered packets.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder inOutOrderCount(Double inOutOrderCount) {
                this.inOutOrderCount = inOutOrderCount;
                return this;
            }

            /**
             * <p>The number of inbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder inPacketCount(Double inPacketCount) {
                this.inPacketCount = inPacketCount;
                return this;
            }

            /**
             * <p>The number of inbound repeated packets.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inRetranCount(Double inRetranCount) {
                this.inRetranCount = inRetranCount;
                return this;
            }

            /**
             * <p>The ID of the instance to which the local IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-sample*</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The remote city. In most cases, this parameter is empty if you set <strong>OtherCountry</strong> to a country except China.</p>
             * 
             * <strong>example:</strong>
             * <p>Austin</p>
             */
            public Builder otherCity(String otherCity) {
                this.otherCity = otherCity;
                return this;
            }

            /**
             * <p>The remote country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>United States</p>
             */
            public Builder otherCountry(String otherCountry) {
                this.otherCountry = otherCountry;
                return this;
            }

            /**
             * <p>The remote IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>122.112.XX.XX</p>
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * <p>The remote ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>amazon.com</p>
             */
            public Builder otherIsp(String otherIsp) {
                this.otherIsp = otherIsp;
                return this;
            }

            /**
             * <p>The remote port.</p>
             * 
             * <strong>example:</strong>
             * <p>40002</p>
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * <p>The service code of the instance to which the remote IP address belongs. If the IP address is not on the cloud, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder otherProduct(String otherProduct) {
                this.otherProduct = otherProduct;
                return this;
            }

            /**
             * <p>The remote province. In most cases, this parameter is empty if you set <strong>OtherCountry</strong> to a country except China.</p>
             * 
             * <strong>example:</strong>
             * <p>Texas</p>
             */
            public Builder otherProvince(String otherProvince) {
                this.otherProvince = otherProvince;
                return this;
            }

            /**
             * <p>The outbound traffic volume. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder outByteCount(Double outByteCount) {
                this.outByteCount = outByteCount;
                return this;
            }

            /**
             * <p>The number of disordered packets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outOrderCount(Double outOrderCount) {
                this.outOrderCount = outOrderCount;
                return this;
            }

            /**
             * <p>The number of outbound disordered packets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outOutOrderCount(Double outOutOrderCount) {
                this.outOutOrderCount = outOutOrderCount;
                return this;
            }

            /**
             * <p>The number of outbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder outPacketCount(Double outPacketCount) {
                this.outPacketCount = outPacketCount;
                return this;
            }

            /**
             * <p>The number of outbound repeated packets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outRetranCount(Double outRetranCount) {
                this.outRetranCount = outRetranCount;
                return this;
            }

            /**
             * <p>The number of packets.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder packetCount(Double packetCount) {
                this.packetCount = packetCount;
                return this;
            }

            /**
             * <p>The protocol number.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The retransmission rate of TCP packets.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder retransmitRate(Double retransmitRate) {
                this.retransmitRate = retransmitRate;
                return this;
            }

            /**
             * <p>The round-trip time (RTT). Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
