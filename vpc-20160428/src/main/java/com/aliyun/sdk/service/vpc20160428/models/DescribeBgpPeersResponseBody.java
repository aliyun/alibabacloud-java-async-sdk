// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpPeersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBgpPeersResponseBody</p>
 */
public class DescribeBgpPeersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpPeers")
    private BgpPeers bgpPeers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBgpPeersResponseBody(Builder builder) {
        this.bgpPeers = builder.bgpPeers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBgpPeersResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpPeers
     */
    public BgpPeers getBgpPeers() {
        return this.bgpPeers;
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
        private BgpPeers bgpPeers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the BGP peer.
         */
        public Builder bgpPeers(BgpPeers bgpPeers) {
            this.bgpPeers = bgpPeers;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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

        public DescribeBgpPeersResponseBody build() {
            return new DescribeBgpPeersResponseBody(this);
        } 

    } 

    public static class BgpPeer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvertisedRouteCount")
        private Integer advertisedRouteCount;

        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("BfdMultiHop")
        private Integer bfdMultiHop;

        @com.aliyun.core.annotation.NameInMap("BgpGroupId")
        private String bgpGroupId;

        @com.aliyun.core.annotation.NameInMap("BgpPeerId")
        private String bgpPeerId;

        @com.aliyun.core.annotation.NameInMap("BgpStatus")
        private String bgpStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableBfd")
        private Boolean enableBfd;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Hold")
        private String hold;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IsFake")
        private Boolean isFake;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private String keepalive;

        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private String localAsn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private String peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerIpAddress")
        private String peerIpAddress;

        @com.aliyun.core.annotation.NameInMap("ReceivedRouteCount")
        private Integer receivedRouteCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteLimit")
        private String routeLimit;

        @com.aliyun.core.annotation.NameInMap("RouterId")
        private String routerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BgpPeer(Builder builder) {
            this.advertisedRouteCount = builder.advertisedRouteCount;
            this.authKey = builder.authKey;
            this.bfdMultiHop = builder.bfdMultiHop;
            this.bgpGroupId = builder.bgpGroupId;
            this.bgpPeerId = builder.bgpPeerId;
            this.bgpStatus = builder.bgpStatus;
            this.description = builder.description;
            this.enableBfd = builder.enableBfd;
            this.gmtModified = builder.gmtModified;
            this.hold = builder.hold;
            this.ipVersion = builder.ipVersion;
            this.isFake = builder.isFake;
            this.keepalive = builder.keepalive;
            this.localAsn = builder.localAsn;
            this.name = builder.name;
            this.peerAsn = builder.peerAsn;
            this.peerIpAddress = builder.peerIpAddress;
            this.receivedRouteCount = builder.receivedRouteCount;
            this.regionId = builder.regionId;
            this.routeLimit = builder.routeLimit;
            this.routerId = builder.routerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpPeer create() {
            return builder().build();
        }

        /**
         * @return advertisedRouteCount
         */
        public Integer getAdvertisedRouteCount() {
            return this.advertisedRouteCount;
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return bfdMultiHop
         */
        public Integer getBfdMultiHop() {
            return this.bfdMultiHop;
        }

        /**
         * @return bgpGroupId
         */
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        /**
         * @return bgpPeerId
         */
        public String getBgpPeerId() {
            return this.bgpPeerId;
        }

        /**
         * @return bgpStatus
         */
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableBfd
         */
        public Boolean getEnableBfd() {
            return this.enableBfd;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hold
         */
        public String getHold() {
            return this.hold;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isFake
         */
        public Boolean getIsFake() {
            return this.isFake;
        }

        /**
         * @return keepalive
         */
        public String getKeepalive() {
            return this.keepalive;
        }

        /**
         * @return localAsn
         */
        public String getLocalAsn() {
            return this.localAsn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return peerAsn
         */
        public String getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerIpAddress
         */
        public String getPeerIpAddress() {
            return this.peerIpAddress;
        }

        /**
         * @return receivedRouteCount
         */
        public Integer getReceivedRouteCount() {
            return this.receivedRouteCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeLimit
         */
        public String getRouteLimit() {
            return this.routeLimit;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer advertisedRouteCount; 
            private String authKey; 
            private Integer bfdMultiHop; 
            private String bgpGroupId; 
            private String bgpPeerId; 
            private String bgpStatus; 
            private String description; 
            private Boolean enableBfd; 
            private String gmtModified; 
            private String hold; 
            private String ipVersion; 
            private Boolean isFake; 
            private String keepalive; 
            private String localAsn; 
            private String name; 
            private String peerAsn; 
            private String peerIpAddress; 
            private Integer receivedRouteCount; 
            private String regionId; 
            private String routeLimit; 
            private String routerId; 
            private String status; 

            /**
             * The number of advertised routes.
             */
            public Builder advertisedRouteCount(Integer advertisedRouteCount) {
                this.advertisedRouteCount = advertisedRouteCount;
                return this;
            }

            /**
             * The authentication key of the BGP group.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * The Bidirectional Forwarding Detection (BFD) hop count.
             */
            public Builder bfdMultiHop(Integer bfdMultiHop) {
                this.bfdMultiHop = bfdMultiHop;
                return this;
            }

            /**
             * The ID of the BGP group.
             */
            public Builder bgpGroupId(String bgpGroupId) {
                this.bgpGroupId = bgpGroupId;
                return this;
            }

            /**
             * The ID of the BGP peer.
             */
            public Builder bgpPeerId(String bgpPeerId) {
                this.bgpPeerId = bgpPeerId;
                return this;
            }

            /**
             * The status of the BGP connection. Valid values:
             * <p>
             * 
             * *   **Idle**: The BGP connection is not used.
             * *   **Connect**: The BGP connection is used.
             * *   **Active**: The BGP connection is available.
             * *   **Established**: The BGP connection is established.
             * *   **Down**: The BGP connection is unavailable.
             */
            public Builder bgpStatus(String bgpStatus) {
                this.bgpStatus = bgpStatus;
                return this;
            }

            /**
             * The description of the BGP group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether BFD is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableBfd(Boolean enableBfd) {
                this.enableBfd = enableBfd;
                return this;
            }

            /**
             * The time when the BGP peer is modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The hold time.
             */
            public Builder hold(String hold) {
                this.hold = hold;
                return this;
            }

            /**
             * The version of the IP address.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether a fake autonomous system number (ASN) is used. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isFake(Boolean isFake) {
                this.isFake = isFake;
                return this;
            }

            /**
             * The Keepalive interval.
             */
            public Builder keepalive(String keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * The ASN of the device on the Alibaba Cloud side.
             */
            public Builder localAsn(String localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * The name of the BGP peer.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The autonomous system number (ASN)of the BGP peer.
             */
            public Builder peerAsn(String peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * The IP address of the BGP peer.
             */
            public Builder peerIpAddress(String peerIpAddress) {
                this.peerIpAddress = peerIpAddress;
                return this;
            }

            /**
             * The number of received routes.
             */
            public Builder receivedRouteCount(Integer receivedRouteCount) {
                this.receivedRouteCount = receivedRouteCount;
                return this;
            }

            /**
             * The ID of the region to which the BGP group belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The maximum number of routes.
             */
            public Builder routeLimit(String routeLimit) {
                this.routeLimit = routeLimit;
                return this;
            }

            /**
             * The Router ID.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * The status of the BGP peer. Valid values:
             * <p>
             * 
             * *   **Pending**
             * *   **Available**
             * *   **Modifying**
             * *   **Deleting**
             * *   **Deleted**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BgpPeer build() {
                return new BgpPeer(this);
            } 

        } 

    }
    public static class BgpPeers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpPeer")
        private java.util.List < BgpPeer> bgpPeer;

        private BgpPeers(Builder builder) {
            this.bgpPeer = builder.bgpPeer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpPeers create() {
            return builder().build();
        }

        /**
         * @return bgpPeer
         */
        public java.util.List < BgpPeer> getBgpPeer() {
            return this.bgpPeer;
        }

        public static final class Builder {
            private java.util.List < BgpPeer> bgpPeer; 

            /**
             * BgpPeer.
             */
            public Builder bgpPeer(java.util.List < BgpPeer> bgpPeer) {
                this.bgpPeer = bgpPeer;
                return this;
            }

            public BgpPeers build() {
                return new BgpPeers(this);
            } 

        } 

    }
}
