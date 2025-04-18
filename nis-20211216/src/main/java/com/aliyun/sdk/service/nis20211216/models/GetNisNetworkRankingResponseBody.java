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
 * {@link GetNisNetworkRankingResponseBody} extends {@link TeaModel}
 *
 * <p>GetNisNetworkRankingResponseBody</p>
 */
public class GetNisNetworkRankingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNisNetworkRankingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisNetworkRankingResponseBody create() {
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

        private Builder(GetNisNetworkRankingResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public GetNisNetworkRankingResponseBody build() {
            return new GetNisNetworkRankingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNisNetworkRankingResponseBody} extends {@link TeaModel}
     *
     * <p>GetNisNetworkRankingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Double activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("Asn")
        private String asn;

        @com.aliyun.core.annotation.NameInMap("AttachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("ByteCount")
        private Double byteCount;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("DestinationIp")
        private String destinationIp;

        @com.aliyun.core.annotation.NameInMap("DestinationIsp")
        private String destinationIsp;

        @com.aliyun.core.annotation.NameInMap("DestinationPort")
        private String destinationPort;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionNo")
        private String destinationRegionNo;

        @com.aliyun.core.annotation.NameInMap("DestinationZone")
        private String destinationZone;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InBps")
        private Double inBps;

        @com.aliyun.core.annotation.NameInMap("InPps")
        private Double inPps;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("NewSessionPerSecond")
        private Double newSessionPerSecond;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Double outBps;

        @com.aliyun.core.annotation.NameInMap("OutPps")
        private Double outPps;

        @com.aliyun.core.annotation.NameInMap("PacketCount")
        private Double packetCount;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RTT")
        private Double RTT;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RetransmitRate")
        private Double retransmitRate;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SourceIsp")
        private String sourceIsp;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private String sourcePort;

        @com.aliyun.core.annotation.NameInMap("SourceZone")
        private String sourceZone;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        private Data(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.asn = builder.asn;
            this.attachmentId = builder.attachmentId;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.byteCount = builder.byteCount;
            this.city = builder.city;
            this.country = builder.country;
            this.destinationIp = builder.destinationIp;
            this.destinationIsp = builder.destinationIsp;
            this.destinationPort = builder.destinationPort;
            this.destinationRegionNo = builder.destinationRegionNo;
            this.destinationZone = builder.destinationZone;
            this.ip = builder.ip;
            this.inBps = builder.inBps;
            this.inPps = builder.inPps;
            this.instanceId = builder.instanceId;
            this.isp = builder.isp;
            this.newSessionPerSecond = builder.newSessionPerSecond;
            this.outBps = builder.outBps;
            this.outPps = builder.outPps;
            this.packetCount = builder.packetCount;
            this.protocol = builder.protocol;
            this.province = builder.province;
            this.RTT = builder.RTT;
            this.regionNo = builder.regionNo;
            this.retransmitRate = builder.retransmitRate;
            this.sourceIp = builder.sourceIp;
            this.sourceIsp = builder.sourceIsp;
            this.sourcePort = builder.sourcePort;
            this.sourceZone = builder.sourceZone;
            this.vbrId = builder.vbrId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Double getActiveSessionCount() {
            return this.activeSessionCount;
        }

        /**
         * @return asn
         */
        public String getAsn() {
            return this.asn;
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return byteCount
         */
        public Double getByteCount() {
            return this.byteCount;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
        }

        /**
         * @return destinationIsp
         */
        public String getDestinationIsp() {
            return this.destinationIsp;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return destinationRegionNo
         */
        public String getDestinationRegionNo() {
            return this.destinationRegionNo;
        }

        /**
         * @return destinationZone
         */
        public String getDestinationZone() {
            return this.destinationZone;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return inBps
         */
        public Double getInBps() {
            return this.inBps;
        }

        /**
         * @return inPps
         */
        public Double getInPps() {
            return this.inPps;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return newSessionPerSecond
         */
        public Double getNewSessionPerSecond() {
            return this.newSessionPerSecond;
        }

        /**
         * @return outBps
         */
        public Double getOutBps() {
            return this.outBps;
        }

        /**
         * @return outPps
         */
        public Double getOutPps() {
            return this.outPps;
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
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return RTT
         */
        public Double getRTT() {
            return this.RTT;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return retransmitRate
         */
        public Double getRetransmitRate() {
            return this.retransmitRate;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return sourceIsp
         */
        public String getSourceIsp() {
            return this.sourceIsp;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return sourceZone
         */
        public String getSourceZone() {
            return this.sourceZone;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        public static final class Builder {
            private Double activeSessionCount; 
            private String asn; 
            private String attachmentId; 
            private String bandwidthPackageId; 
            private Double byteCount; 
            private String city; 
            private String country; 
            private String destinationIp; 
            private String destinationIsp; 
            private String destinationPort; 
            private String destinationRegionNo; 
            private String destinationZone; 
            private String ip; 
            private Double inBps; 
            private Double inPps; 
            private String instanceId; 
            private String isp; 
            private Double newSessionPerSecond; 
            private Double outBps; 
            private Double outPps; 
            private Double packetCount; 
            private String protocol; 
            private String province; 
            private Double RTT; 
            private String regionNo; 
            private Double retransmitRate; 
            private String sourceIp; 
            private String sourceIsp; 
            private String sourcePort; 
            private String sourceZone; 
            private String vbrId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeSessionCount = model.activeSessionCount;
                this.asn = model.asn;
                this.attachmentId = model.attachmentId;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.byteCount = model.byteCount;
                this.city = model.city;
                this.country = model.country;
                this.destinationIp = model.destinationIp;
                this.destinationIsp = model.destinationIsp;
                this.destinationPort = model.destinationPort;
                this.destinationRegionNo = model.destinationRegionNo;
                this.destinationZone = model.destinationZone;
                this.ip = model.ip;
                this.inBps = model.inBps;
                this.inPps = model.inPps;
                this.instanceId = model.instanceId;
                this.isp = model.isp;
                this.newSessionPerSecond = model.newSessionPerSecond;
                this.outBps = model.outBps;
                this.outPps = model.outPps;
                this.packetCount = model.packetCount;
                this.protocol = model.protocol;
                this.province = model.province;
                this.RTT = model.RTT;
                this.regionNo = model.regionNo;
                this.retransmitRate = model.retransmitRate;
                this.sourceIp = model.sourceIp;
                this.sourceIsp = model.sourceIsp;
                this.sourcePort = model.sourcePort;
                this.sourceZone = model.sourceZone;
                this.vbrId = model.vbrId;
            } 

            /**
             * ActiveSessionCount.
             */
            public Builder activeSessionCount(Double activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * Asn.
             */
            public Builder asn(String asn) {
                this.asn = asn;
                return this;
            }

            /**
             * AttachmentId.
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * DestinationIp.
             */
            public Builder destinationIp(String destinationIp) {
                this.destinationIp = destinationIp;
                return this;
            }

            /**
             * DestinationIsp.
             */
            public Builder destinationIsp(String destinationIsp) {
                this.destinationIsp = destinationIsp;
                return this;
            }

            /**
             * DestinationPort.
             */
            public Builder destinationPort(String destinationPort) {
                this.destinationPort = destinationPort;
                return this;
            }

            /**
             * DestinationRegionNo.
             */
            public Builder destinationRegionNo(String destinationRegionNo) {
                this.destinationRegionNo = destinationRegionNo;
                return this;
            }

            /**
             * DestinationZone.
             */
            public Builder destinationZone(String destinationZone) {
                this.destinationZone = destinationZone;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InBps.
             */
            public Builder inBps(Double inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * InPps.
             */
            public Builder inPps(Double inPps) {
                this.inPps = inPps;
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
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * NewSessionPerSecond.
             */
            public Builder newSessionPerSecond(Double newSessionPerSecond) {
                this.newSessionPerSecond = newSessionPerSecond;
                return this;
            }

            /**
             * OutBps.
             */
            public Builder outBps(Double outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * OutPps.
             */
            public Builder outPps(Double outPps) {
                this.outPps = outPps;
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
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * RTT.
             */
            public Builder RTT(Double RTT) {
                this.RTT = RTT;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * RetransmitRate.
             */
            public Builder retransmitRate(Double retransmitRate) {
                this.retransmitRate = retransmitRate;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * SourceIsp.
             */
            public Builder sourceIsp(String sourceIsp) {
                this.sourceIsp = sourceIsp;
                return this;
            }

            /**
             * SourcePort.
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * SourceZone.
             */
            public Builder sourceZone(String sourceZone) {
                this.sourceZone = sourceZone;
                return this;
            }

            /**
             * VbrId.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
