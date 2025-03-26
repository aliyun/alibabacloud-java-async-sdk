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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBgpPeersResponseBody model) {
            this.bgpPeers = model.bgpPeers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the BGP peer.</p>
         */
        public Builder bgpPeers(BgpPeers bgpPeers) {
            this.bgpPeers = bgpPeers;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBgpPeersResponseBody build() {
            return new DescribeBgpPeersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBgpPeersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBgpPeersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BgpPeer model) {
                this.advertisedRouteCount = model.advertisedRouteCount;
                this.authKey = model.authKey;
                this.bfdMultiHop = model.bfdMultiHop;
                this.bgpGroupId = model.bgpGroupId;
                this.bgpPeerId = model.bgpPeerId;
                this.bgpStatus = model.bgpStatus;
                this.description = model.description;
                this.enableBfd = model.enableBfd;
                this.gmtModified = model.gmtModified;
                this.hold = model.hold;
                this.ipVersion = model.ipVersion;
                this.isFake = model.isFake;
                this.keepalive = model.keepalive;
                this.localAsn = model.localAsn;
                this.name = model.name;
                this.peerAsn = model.peerAsn;
                this.peerIpAddress = model.peerIpAddress;
                this.receivedRouteCount = model.receivedRouteCount;
                this.regionId = model.regionId;
                this.routeLimit = model.routeLimit;
                this.routerId = model.routerId;
                this.status = model.status;
            } 

            /**
             * <p>The number of advertised routes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder advertisedRouteCount(Integer advertisedRouteCount) {
                this.advertisedRouteCount = advertisedRouteCount;
                return this;
            }

            /**
             * <p>The authentication key of the BGP group.</p>
             * 
             * <strong>example:</strong>
             * <p>!PWZ****</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>The Bidirectional Forwarding Detection (BFD) hop count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bfdMultiHop(Integer bfdMultiHop) {
                this.bfdMultiHop = bfdMultiHop;
                return this;
            }

            /**
             * <p>The ID of the BGP group.</p>
             * 
             * <strong>example:</strong>
             * <p>bgpg-2zev8h2wo414sfh****</p>
             */
            public Builder bgpGroupId(String bgpGroupId) {
                this.bgpGroupId = bgpGroupId;
                return this;
            }

            /**
             * <p>The ID of the BGP peer.</p>
             * 
             * <strong>example:</strong>
             * <p>bgp-2ze3un0ft1jd1xd****</p>
             */
            public Builder bgpPeerId(String bgpPeerId) {
                this.bgpPeerId = bgpPeerId;
                return this;
            }

            /**
             * <p>The status of the BGP connection. Valid values:</p>
             * <ul>
             * <li><strong>Idle</strong>: The BGP connection is not used.</li>
             * <li><strong>Connect</strong>: The BGP connection is used.</li>
             * <li><strong>Active</strong>: The BGP connection is available.</li>
             * <li><strong>Established</strong>: The BGP connection is established.</li>
             * <li><strong>Down</strong>: The BGP connection is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connect</p>
             */
            public Builder bgpStatus(String bgpStatus) {
                this.bgpStatus = bgpStatus;
                return this;
            }

            /**
             * <p>The description of the BGP group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether BFD is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableBfd(Boolean enableBfd) {
                this.enableBfd = enableBfd;
                return this;
            }

            /**
             * <p>The time when the BGP peer is modified.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-20T07:29:08Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The hold time.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder hold(String hold) {
                this.hold = hold;
                return this;
            }

            /**
             * <p>The version of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>Indicates whether a fake autonomous system number (ASN) is used. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFake(Boolean isFake) {
                this.isFake = isFake;
                return this;
            }

            /**
             * <p>The Keepalive interval.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder keepalive(String keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * <p>The ASN of the device on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>45104</p>
             */
            public Builder localAsn(String localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The name of the BGP peer.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The autonomous system number (ASN)of the BGP peer.</p>
             * 
             * <strong>example:</strong>
             * <p>65515</p>
             */
            public Builder peerAsn(String peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>The IP address of the BGP peer.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder peerIpAddress(String peerIpAddress) {
                this.peerIpAddress = peerIpAddress;
                return this;
            }

            /**
             * <p>The number of received routes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder receivedRouteCount(Integer receivedRouteCount) {
                this.receivedRouteCount = receivedRouteCount;
                return this;
            }

            /**
             * <p>The ID of the region to which the BGP group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The maximum number of routes.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder routeLimit(String routeLimit) {
                this.routeLimit = routeLimit;
                return this;
            }

            /**
             * <p>The Router ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-2zecmmvg5gvu8i4te****</p>
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * <p>The status of the BGP peer. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
    /**
     * 
     * {@link DescribeBgpPeersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBgpPeersResponseBody</p>
     */
    public static class BgpPeers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpPeer")
        private java.util.List<BgpPeer> bgpPeer;

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
        public java.util.List<BgpPeer> getBgpPeer() {
            return this.bgpPeer;
        }

        public static final class Builder {
            private java.util.List<BgpPeer> bgpPeer; 

            private Builder() {
            } 

            private Builder(BgpPeers model) {
                this.bgpPeer = model.bgpPeer;
            } 

            /**
             * BgpPeer.
             */
            public Builder bgpPeer(java.util.List<BgpPeer> bgpPeer) {
                this.bgpPeer = bgpPeer;
                return this;
            }

            public BgpPeers build() {
                return new BgpPeers(this);
            } 

        } 

    }
}
