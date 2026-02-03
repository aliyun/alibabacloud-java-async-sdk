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
 * {@link DescribeNisTrafficRankingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNisTrafficRankingResponseBody</p>
 */
public class DescribeNisTrafficRankingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowRankingList")
    private java.util.List<FlowRankingList> flowRankingList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NisTrafficRankingId")
    private String nisTrafficRankingId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNisTrafficRankingResponseBody(Builder builder) {
        this.flowRankingList = builder.flowRankingList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nisTrafficRankingId = builder.nisTrafficRankingId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisTrafficRankingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowRankingList
     */
    public java.util.List<FlowRankingList> getFlowRankingList() {
        return this.flowRankingList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nisTrafficRankingId
     */
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<FlowRankingList> flowRankingList; 
        private Integer maxResults; 
        private String nextToken; 
        private String nisTrafficRankingId; 
        private String requestId; 
        private String status; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNisTrafficRankingResponseBody model) {
            this.flowRankingList = model.flowRankingList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nisTrafficRankingId = model.nisTrafficRankingId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.totalCount = model.totalCount;
        } 

        /**
         * FlowRankingList.
         */
        public Builder flowRankingList(java.util.List<FlowRankingList> flowRankingList) {
            this.flowRankingList = flowRankingList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NisTrafficRankingId.
         */
        public Builder nisTrafficRankingId(String nisTrafficRankingId) {
            this.nisTrafficRankingId = nisTrafficRankingId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNisTrafficRankingResponseBody build() {
            return new DescribeNisTrafficRankingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNisTrafficRankingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNisTrafficRankingResponseBody</p>
     */
    public static class FlowRankingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingResourceId")
        private String bindingResourceId;

        @com.aliyun.core.annotation.NameInMap("BindingResourceType")
        private String bindingResourceType;

        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Double bytes;

        @com.aliyun.core.annotation.NameInMap("BytesRate")
        private Double bytesRate;

        @com.aliyun.core.annotation.NameInMap("ClientAsn")
        private String clientAsn;

        @com.aliyun.core.annotation.NameInMap("ClientCity")
        private String clientCity;

        @com.aliyun.core.annotation.NameInMap("ClientCountry")
        private String clientCountry;

        @com.aliyun.core.annotation.NameInMap("ClientIsp")
        private String clientIsp;

        @com.aliyun.core.annotation.NameInMap("ClientProvince")
        private String clientProvince;

        @com.aliyun.core.annotation.NameInMap("DestinationIp")
        private String destinationIp;

        @com.aliyun.core.annotation.NameInMap("DestinationPort")
        private String destinationPort;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionNo")
        private String destinationRegionNo;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("Dscp")
        private String dscp;

        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("Packets")
        private Double packets;

        @com.aliyun.core.annotation.NameInMap("PacketsLostBlackhole")
        private Double packetsLostBlackhole;

        @com.aliyun.core.annotation.NameInMap("PacketsLostNoRoute")
        private Double packetsLostNoRoute;

        @com.aliyun.core.annotation.NameInMap("PacketsLostTTLExpired")
        private Double packetsLostTTLExpired;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RoundTripTime")
        private Double roundTripTime;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private String sourcePort;

        @com.aliyun.core.annotation.NameInMap("SourceRegionNo")
        private String sourceRegionNo;

        @com.aliyun.core.annotation.NameInMap("TrafficPath")
        private String trafficPath;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDestinationAccountId")
        private String transitRouterDestinationAccountId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDestinationAvailableZone")
        private String transitRouterDestinationAvailableZone;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDestinationNetworkInterface")
        private String transitRouterDestinationNetworkInterface;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDestinationResourceId")
        private String transitRouterDestinationResourceId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDestinationVSwitchId")
        private String transitRouterDestinationVSwitchId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterPairAttachmentId")
        private String transitRouterPairAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterSourceAccountId")
        private String transitRouterSourceAccountId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterSourceAvailableZone")
        private String transitRouterSourceAvailableZone;

        @com.aliyun.core.annotation.NameInMap("TransitRouterSourceNetworkInterface")
        private String transitRouterSourceNetworkInterface;

        @com.aliyun.core.annotation.NameInMap("TransitRouterSourceResourceId")
        private String transitRouterSourceResourceId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterSourceVSwitchId")
        private String transitRouterSourceVSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private FlowRankingList(Builder builder) {
            this.bindingResourceId = builder.bindingResourceId;
            this.bindingResourceType = builder.bindingResourceType;
            this.bytes = builder.bytes;
            this.bytesRate = builder.bytesRate;
            this.clientAsn = builder.clientAsn;
            this.clientCity = builder.clientCity;
            this.clientCountry = builder.clientCountry;
            this.clientIsp = builder.clientIsp;
            this.clientProvince = builder.clientProvince;
            this.destinationIp = builder.destinationIp;
            this.destinationPort = builder.destinationPort;
            this.destinationRegionNo = builder.destinationRegionNo;
            this.direction = builder.direction;
            this.dscp = builder.dscp;
            this.ecsId = builder.ecsId;
            this.instanceId = builder.instanceId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.packets = builder.packets;
            this.packetsLostBlackhole = builder.packetsLostBlackhole;
            this.packetsLostNoRoute = builder.packetsLostNoRoute;
            this.packetsLostTTLExpired = builder.packetsLostTTLExpired;
            this.protocol = builder.protocol;
            this.publicIpAddress = builder.publicIpAddress;
            this.regionId = builder.regionId;
            this.roundTripTime = builder.roundTripTime;
            this.sourceIp = builder.sourceIp;
            this.sourcePort = builder.sourcePort;
            this.sourceRegionNo = builder.sourceRegionNo;
            this.trafficPath = builder.trafficPath;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterDestinationAccountId = builder.transitRouterDestinationAccountId;
            this.transitRouterDestinationAvailableZone = builder.transitRouterDestinationAvailableZone;
            this.transitRouterDestinationNetworkInterface = builder.transitRouterDestinationNetworkInterface;
            this.transitRouterDestinationResourceId = builder.transitRouterDestinationResourceId;
            this.transitRouterDestinationVSwitchId = builder.transitRouterDestinationVSwitchId;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterPairAttachmentId = builder.transitRouterPairAttachmentId;
            this.transitRouterSourceAccountId = builder.transitRouterSourceAccountId;
            this.transitRouterSourceAvailableZone = builder.transitRouterSourceAvailableZone;
            this.transitRouterSourceNetworkInterface = builder.transitRouterSourceNetworkInterface;
            this.transitRouterSourceResourceId = builder.transitRouterSourceResourceId;
            this.transitRouterSourceVSwitchId = builder.transitRouterSourceVSwitchId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowRankingList create() {
            return builder().build();
        }

        /**
         * @return bindingResourceId
         */
        public String getBindingResourceId() {
            return this.bindingResourceId;
        }

        /**
         * @return bindingResourceType
         */
        public String getBindingResourceType() {
            return this.bindingResourceType;
        }

        /**
         * @return bytes
         */
        public Double getBytes() {
            return this.bytes;
        }

        /**
         * @return bytesRate
         */
        public Double getBytesRate() {
            return this.bytesRate;
        }

        /**
         * @return clientAsn
         */
        public String getClientAsn() {
            return this.clientAsn;
        }

        /**
         * @return clientCity
         */
        public String getClientCity() {
            return this.clientCity;
        }

        /**
         * @return clientCountry
         */
        public String getClientCountry() {
            return this.clientCountry;
        }

        /**
         * @return clientIsp
         */
        public String getClientIsp() {
            return this.clientIsp;
        }

        /**
         * @return clientProvince
         */
        public String getClientProvince() {
            return this.clientProvince;
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
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
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dscp
         */
        public String getDscp() {
            return this.dscp;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return packets
         */
        public Double getPackets() {
            return this.packets;
        }

        /**
         * @return packetsLostBlackhole
         */
        public Double getPacketsLostBlackhole() {
            return this.packetsLostBlackhole;
        }

        /**
         * @return packetsLostNoRoute
         */
        public Double getPacketsLostNoRoute() {
            return this.packetsLostNoRoute;
        }

        /**
         * @return packetsLostTTLExpired
         */
        public Double getPacketsLostTTLExpired() {
            return this.packetsLostTTLExpired;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return roundTripTime
         */
        public Double getRoundTripTime() {
            return this.roundTripTime;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return sourceRegionNo
         */
        public String getSourceRegionNo() {
            return this.sourceRegionNo;
        }

        /**
         * @return trafficPath
         */
        public String getTrafficPath() {
            return this.trafficPath;
        }

        /**
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterDestinationAccountId
         */
        public String getTransitRouterDestinationAccountId() {
            return this.transitRouterDestinationAccountId;
        }

        /**
         * @return transitRouterDestinationAvailableZone
         */
        public String getTransitRouterDestinationAvailableZone() {
            return this.transitRouterDestinationAvailableZone;
        }

        /**
         * @return transitRouterDestinationNetworkInterface
         */
        public String getTransitRouterDestinationNetworkInterface() {
            return this.transitRouterDestinationNetworkInterface;
        }

        /**
         * @return transitRouterDestinationResourceId
         */
        public String getTransitRouterDestinationResourceId() {
            return this.transitRouterDestinationResourceId;
        }

        /**
         * @return transitRouterDestinationVSwitchId
         */
        public String getTransitRouterDestinationVSwitchId() {
            return this.transitRouterDestinationVSwitchId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterPairAttachmentId
         */
        public String getTransitRouterPairAttachmentId() {
            return this.transitRouterPairAttachmentId;
        }

        /**
         * @return transitRouterSourceAccountId
         */
        public String getTransitRouterSourceAccountId() {
            return this.transitRouterSourceAccountId;
        }

        /**
         * @return transitRouterSourceAvailableZone
         */
        public String getTransitRouterSourceAvailableZone() {
            return this.transitRouterSourceAvailableZone;
        }

        /**
         * @return transitRouterSourceNetworkInterface
         */
        public String getTransitRouterSourceNetworkInterface() {
            return this.transitRouterSourceNetworkInterface;
        }

        /**
         * @return transitRouterSourceResourceId
         */
        public String getTransitRouterSourceResourceId() {
            return this.transitRouterSourceResourceId;
        }

        /**
         * @return transitRouterSourceVSwitchId
         */
        public String getTransitRouterSourceVSwitchId() {
            return this.transitRouterSourceVSwitchId;
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
            private String bindingResourceId; 
            private String bindingResourceType; 
            private Double bytes; 
            private Double bytesRate; 
            private String clientAsn; 
            private String clientCity; 
            private String clientCountry; 
            private String clientIsp; 
            private String clientProvince; 
            private String destinationIp; 
            private String destinationPort; 
            private String destinationRegionNo; 
            private String direction; 
            private String dscp; 
            private String ecsId; 
            private String instanceId; 
            private String networkInterfaceId; 
            private Double packets; 
            private Double packetsLostBlackhole; 
            private Double packetsLostNoRoute; 
            private Double packetsLostTTLExpired; 
            private String protocol; 
            private String publicIpAddress; 
            private String regionId; 
            private Double roundTripTime; 
            private String sourceIp; 
            private String sourcePort; 
            private String sourceRegionNo; 
            private String trafficPath; 
            private String transitRouterAttachmentId; 
            private String transitRouterDestinationAccountId; 
            private String transitRouterDestinationAvailableZone; 
            private String transitRouterDestinationNetworkInterface; 
            private String transitRouterDestinationResourceId; 
            private String transitRouterDestinationVSwitchId; 
            private String transitRouterId; 
            private String transitRouterPairAttachmentId; 
            private String transitRouterSourceAccountId; 
            private String transitRouterSourceAvailableZone; 
            private String transitRouterSourceNetworkInterface; 
            private String transitRouterSourceResourceId; 
            private String transitRouterSourceVSwitchId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(FlowRankingList model) {
                this.bindingResourceId = model.bindingResourceId;
                this.bindingResourceType = model.bindingResourceType;
                this.bytes = model.bytes;
                this.bytesRate = model.bytesRate;
                this.clientAsn = model.clientAsn;
                this.clientCity = model.clientCity;
                this.clientCountry = model.clientCountry;
                this.clientIsp = model.clientIsp;
                this.clientProvince = model.clientProvince;
                this.destinationIp = model.destinationIp;
                this.destinationPort = model.destinationPort;
                this.destinationRegionNo = model.destinationRegionNo;
                this.direction = model.direction;
                this.dscp = model.dscp;
                this.ecsId = model.ecsId;
                this.instanceId = model.instanceId;
                this.networkInterfaceId = model.networkInterfaceId;
                this.packets = model.packets;
                this.packetsLostBlackhole = model.packetsLostBlackhole;
                this.packetsLostNoRoute = model.packetsLostNoRoute;
                this.packetsLostTTLExpired = model.packetsLostTTLExpired;
                this.protocol = model.protocol;
                this.publicIpAddress = model.publicIpAddress;
                this.regionId = model.regionId;
                this.roundTripTime = model.roundTripTime;
                this.sourceIp = model.sourceIp;
                this.sourcePort = model.sourcePort;
                this.sourceRegionNo = model.sourceRegionNo;
                this.trafficPath = model.trafficPath;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterDestinationAccountId = model.transitRouterDestinationAccountId;
                this.transitRouterDestinationAvailableZone = model.transitRouterDestinationAvailableZone;
                this.transitRouterDestinationNetworkInterface = model.transitRouterDestinationNetworkInterface;
                this.transitRouterDestinationResourceId = model.transitRouterDestinationResourceId;
                this.transitRouterDestinationVSwitchId = model.transitRouterDestinationVSwitchId;
                this.transitRouterId = model.transitRouterId;
                this.transitRouterPairAttachmentId = model.transitRouterPairAttachmentId;
                this.transitRouterSourceAccountId = model.transitRouterSourceAccountId;
                this.transitRouterSourceAvailableZone = model.transitRouterSourceAvailableZone;
                this.transitRouterSourceNetworkInterface = model.transitRouterSourceNetworkInterface;
                this.transitRouterSourceResourceId = model.transitRouterSourceResourceId;
                this.transitRouterSourceVSwitchId = model.transitRouterSourceVSwitchId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * BindingResourceId.
             */
            public Builder bindingResourceId(String bindingResourceId) {
                this.bindingResourceId = bindingResourceId;
                return this;
            }

            /**
             * BindingResourceType.
             */
            public Builder bindingResourceType(String bindingResourceType) {
                this.bindingResourceType = bindingResourceType;
                return this;
            }

            /**
             * Bytes.
             */
            public Builder bytes(Double bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * BytesRate.
             */
            public Builder bytesRate(Double bytesRate) {
                this.bytesRate = bytesRate;
                return this;
            }

            /**
             * ClientAsn.
             */
            public Builder clientAsn(String clientAsn) {
                this.clientAsn = clientAsn;
                return this;
            }

            /**
             * ClientCity.
             */
            public Builder clientCity(String clientCity) {
                this.clientCity = clientCity;
                return this;
            }

            /**
             * ClientCountry.
             */
            public Builder clientCountry(String clientCountry) {
                this.clientCountry = clientCountry;
                return this;
            }

            /**
             * ClientIsp.
             */
            public Builder clientIsp(String clientIsp) {
                this.clientIsp = clientIsp;
                return this;
            }

            /**
             * ClientProvince.
             */
            public Builder clientProvince(String clientProvince) {
                this.clientProvince = clientProvince;
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
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * Dscp.
             */
            public Builder dscp(String dscp) {
                this.dscp = dscp;
                return this;
            }

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
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
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * Packets.
             */
            public Builder packets(Double packets) {
                this.packets = packets;
                return this;
            }

            /**
             * PacketsLostBlackhole.
             */
            public Builder packetsLostBlackhole(Double packetsLostBlackhole) {
                this.packetsLostBlackhole = packetsLostBlackhole;
                return this;
            }

            /**
             * PacketsLostNoRoute.
             */
            public Builder packetsLostNoRoute(Double packetsLostNoRoute) {
                this.packetsLostNoRoute = packetsLostNoRoute;
                return this;
            }

            /**
             * PacketsLostTTLExpired.
             */
            public Builder packetsLostTTLExpired(Double packetsLostTTLExpired) {
                this.packetsLostTTLExpired = packetsLostTTLExpired;
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
             * PublicIpAddress.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RoundTripTime.
             */
            public Builder roundTripTime(Double roundTripTime) {
                this.roundTripTime = roundTripTime;
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
             * SourcePort.
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * SourceRegionNo.
             */
            public Builder sourceRegionNo(String sourceRegionNo) {
                this.sourceRegionNo = sourceRegionNo;
                return this;
            }

            /**
             * TrafficPath.
             */
            public Builder trafficPath(String trafficPath) {
                this.trafficPath = trafficPath;
                return this;
            }

            /**
             * TransitRouterAttachmentId.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * TransitRouterDestinationAccountId.
             */
            public Builder transitRouterDestinationAccountId(String transitRouterDestinationAccountId) {
                this.transitRouterDestinationAccountId = transitRouterDestinationAccountId;
                return this;
            }

            /**
             * TransitRouterDestinationAvailableZone.
             */
            public Builder transitRouterDestinationAvailableZone(String transitRouterDestinationAvailableZone) {
                this.transitRouterDestinationAvailableZone = transitRouterDestinationAvailableZone;
                return this;
            }

            /**
             * TransitRouterDestinationNetworkInterface.
             */
            public Builder transitRouterDestinationNetworkInterface(String transitRouterDestinationNetworkInterface) {
                this.transitRouterDestinationNetworkInterface = transitRouterDestinationNetworkInterface;
                return this;
            }

            /**
             * TransitRouterDestinationResourceId.
             */
            public Builder transitRouterDestinationResourceId(String transitRouterDestinationResourceId) {
                this.transitRouterDestinationResourceId = transitRouterDestinationResourceId;
                return this;
            }

            /**
             * TransitRouterDestinationVSwitchId.
             */
            public Builder transitRouterDestinationVSwitchId(String transitRouterDestinationVSwitchId) {
                this.transitRouterDestinationVSwitchId = transitRouterDestinationVSwitchId;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * TransitRouterPairAttachmentId.
             */
            public Builder transitRouterPairAttachmentId(String transitRouterPairAttachmentId) {
                this.transitRouterPairAttachmentId = transitRouterPairAttachmentId;
                return this;
            }

            /**
             * TransitRouterSourceAccountId.
             */
            public Builder transitRouterSourceAccountId(String transitRouterSourceAccountId) {
                this.transitRouterSourceAccountId = transitRouterSourceAccountId;
                return this;
            }

            /**
             * TransitRouterSourceAvailableZone.
             */
            public Builder transitRouterSourceAvailableZone(String transitRouterSourceAvailableZone) {
                this.transitRouterSourceAvailableZone = transitRouterSourceAvailableZone;
                return this;
            }

            /**
             * TransitRouterSourceNetworkInterface.
             */
            public Builder transitRouterSourceNetworkInterface(String transitRouterSourceNetworkInterface) {
                this.transitRouterSourceNetworkInterface = transitRouterSourceNetworkInterface;
                return this;
            }

            /**
             * TransitRouterSourceResourceId.
             */
            public Builder transitRouterSourceResourceId(String transitRouterSourceResourceId) {
                this.transitRouterSourceResourceId = transitRouterSourceResourceId;
                return this;
            }

            /**
             * TransitRouterSourceVSwitchId.
             */
            public Builder transitRouterSourceVSwitchId(String transitRouterSourceVSwitchId) {
                this.transitRouterSourceVSwitchId = transitRouterSourceVSwitchId;
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

            public FlowRankingList build() {
                return new FlowRankingList(this);
            } 

        } 

    }
}
