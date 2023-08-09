// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInternetTupleResponseBody} extends {@link TeaModel}
 *
 * <p>GetInternetTupleResponseBody</p>
 */
public class GetInternetTupleResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AccessRegion")
        private String accessRegion;

        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("ByteCount")
        private Double byteCount;

        @NameInMap("CloudCity")
        private String cloudCity;

        @NameInMap("CloudCountry")
        private String cloudCountry;

        @NameInMap("CloudIp")
        private String cloudIp;

        @NameInMap("CloudIsp")
        private String cloudIsp;

        @NameInMap("CloudPort")
        private String cloudPort;

        @NameInMap("CloudProduct")
        private String cloudProduct;

        @NameInMap("CloudProvince")
        private String cloudProvince;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("InByteCount")
        private Double inByteCount;

        @NameInMap("InOutOrderCount")
        private Double inOutOrderCount;

        @NameInMap("InPacketCount")
        private Double inPacketCount;

        @NameInMap("InRetranCount")
        private Double inRetranCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OtherCity")
        private String otherCity;

        @NameInMap("OtherCountry")
        private String otherCountry;

        @NameInMap("OtherIp")
        private String otherIp;

        @NameInMap("OtherIsp")
        private String otherIsp;

        @NameInMap("OtherPort")
        private String otherPort;

        @NameInMap("OtherProduct")
        private String otherProduct;

        @NameInMap("OtherProvince")
        private String otherProvince;

        @NameInMap("OutByteCount")
        private Double outByteCount;

        @NameInMap("OutOrderCount")
        private Double outOrderCount;

        @NameInMap("OutOutOrderCount")
        private Double outOutOrderCount;

        @NameInMap("OutPacketCount")
        private Double outPacketCount;

        @NameInMap("OutRetranCount")
        private Double outRetranCount;

        @NameInMap("PacketCount")
        private Double packetCount;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RetranCount")
        private Double retranCount;

        @NameInMap("Rtt")
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
            this.retranCount = builder.retranCount;
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
         * @return retranCount
         */
        public Double getRetranCount() {
            return this.retranCount;
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
            private Double retranCount; 
            private Double rtt; 

            /**
             * AccessRegion.
             */
            public Builder accessRegion(String accessRegion) {
                this.accessRegion = accessRegion;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ByteCount.
             */
            public Builder byteCount(Double byteCount) {
                this.byteCount = byteCount;
                return this;
            }

            /**
             * CloudCity.
             */
            public Builder cloudCity(String cloudCity) {
                this.cloudCity = cloudCity;
                return this;
            }

            /**
             * CloudCountry.
             */
            public Builder cloudCountry(String cloudCountry) {
                this.cloudCountry = cloudCountry;
                return this;
            }

            /**
             * CloudIp.
             */
            public Builder cloudIp(String cloudIp) {
                this.cloudIp = cloudIp;
                return this;
            }

            /**
             * CloudIsp.
             */
            public Builder cloudIsp(String cloudIsp) {
                this.cloudIsp = cloudIsp;
                return this;
            }

            /**
             * CloudPort.
             */
            public Builder cloudPort(String cloudPort) {
                this.cloudPort = cloudPort;
                return this;
            }

            /**
             * CloudProduct.
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * CloudProvince.
             */
            public Builder cloudProvince(String cloudProvince) {
                this.cloudProvince = cloudProvince;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * InByteCount.
             */
            public Builder inByteCount(Double inByteCount) {
                this.inByteCount = inByteCount;
                return this;
            }

            /**
             * InOutOrderCount.
             */
            public Builder inOutOrderCount(Double inOutOrderCount) {
                this.inOutOrderCount = inOutOrderCount;
                return this;
            }

            /**
             * InPacketCount.
             */
            public Builder inPacketCount(Double inPacketCount) {
                this.inPacketCount = inPacketCount;
                return this;
            }

            /**
             * InRetranCount.
             */
            public Builder inRetranCount(Double inRetranCount) {
                this.inRetranCount = inRetranCount;
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
             * OtherCity.
             */
            public Builder otherCity(String otherCity) {
                this.otherCity = otherCity;
                return this;
            }

            /**
             * OtherCountry.
             */
            public Builder otherCountry(String otherCountry) {
                this.otherCountry = otherCountry;
                return this;
            }

            /**
             * OtherIp.
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * OtherIsp.
             */
            public Builder otherIsp(String otherIsp) {
                this.otherIsp = otherIsp;
                return this;
            }

            /**
             * OtherPort.
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * OtherProduct.
             */
            public Builder otherProduct(String otherProduct) {
                this.otherProduct = otherProduct;
                return this;
            }

            /**
             * OtherProvince.
             */
            public Builder otherProvince(String otherProvince) {
                this.otherProvince = otherProvince;
                return this;
            }

            /**
             * OutByteCount.
             */
            public Builder outByteCount(Double outByteCount) {
                this.outByteCount = outByteCount;
                return this;
            }

            /**
             * OutOrderCount.
             */
            public Builder outOrderCount(Double outOrderCount) {
                this.outOrderCount = outOrderCount;
                return this;
            }

            /**
             * OutOutOrderCount.
             */
            public Builder outOutOrderCount(Double outOutOrderCount) {
                this.outOutOrderCount = outOutOrderCount;
                return this;
            }

            /**
             * OutPacketCount.
             */
            public Builder outPacketCount(Double outPacketCount) {
                this.outPacketCount = outPacketCount;
                return this;
            }

            /**
             * OutRetranCount.
             */
            public Builder outRetranCount(Double outRetranCount) {
                this.outRetranCount = outRetranCount;
                return this;
            }

            /**
             * PacketCount.
             */
            public Builder packetCount(Double packetCount) {
                this.packetCount = packetCount;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RetranCount.
             */
            public Builder retranCount(Double retranCount) {
                this.retranCount = retranCount;
                return this;
            }

            /**
             * Rtt.
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
