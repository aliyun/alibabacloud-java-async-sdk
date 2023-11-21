// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBgpGroupsResponseBody</p>
 */
public class DescribeBgpGroupsResponseBody extends TeaModel {
    @NameInMap("BgpGroups")
    private BgpGroups bgpGroups;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBgpGroupsResponseBody(Builder builder) {
        this.bgpGroups = builder.bgpGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBgpGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpGroups
     */
    public BgpGroups getBgpGroups() {
        return this.bgpGroups;
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
        private BgpGroups bgpGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The detailed information about the BGP group.
         */
        public Builder bgpGroups(BgpGroups bgpGroups) {
            this.bgpGroups = bgpGroups;
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

        public DescribeBgpGroupsResponseBody build() {
            return new DescribeBgpGroupsResponseBody(this);
        } 

    } 

    public static class BgpGroup extends TeaModel {
        @NameInMap("AuthKey")
        private String authKey;

        @NameInMap("BgpGroupId")
        private String bgpGroupId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Hold")
        private String hold;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("IsFake")
        private String isFake;

        @NameInMap("Keepalive")
        private String keepalive;

        @NameInMap("LocalAsn")
        private String localAsn;

        @NameInMap("Name")
        private String name;

        @NameInMap("PeerAsn")
        private String peerAsn;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RouteLimit")
        private String routeLimit;

        @NameInMap("RouterId")
        private String routerId;

        @NameInMap("Status")
        private String status;

        private BgpGroup(Builder builder) {
            this.authKey = builder.authKey;
            this.bgpGroupId = builder.bgpGroupId;
            this.description = builder.description;
            this.hold = builder.hold;
            this.ipVersion = builder.ipVersion;
            this.isFake = builder.isFake;
            this.keepalive = builder.keepalive;
            this.localAsn = builder.localAsn;
            this.name = builder.name;
            this.peerAsn = builder.peerAsn;
            this.regionId = builder.regionId;
            this.routeLimit = builder.routeLimit;
            this.routerId = builder.routerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpGroup create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return bgpGroupId
         */
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public String getIsFake() {
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
            private String authKey; 
            private String bgpGroupId; 
            private String description; 
            private String hold; 
            private String ipVersion; 
            private String isFake; 
            private String keepalive; 
            private String localAsn; 
            private String name; 
            private String peerAsn; 
            private String regionId; 
            private String routeLimit; 
            private String routerId; 
            private String status; 

            /**
             * The key used by the BGP group.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
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
             * The description of the BGP group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The hold time to receive BGP messages. Unit: seconds.
             * <p>
             * 
             * >  If no message is received within the hold time, the BGP peer is considered disconnected.
             */
            public Builder hold(String hold) {
                this.hold = hold;
                return this;
            }

            /**
             * The IP version of the BGP group. Valid values:
             * <p>
             * 
             * *   **ipv4**: IPv4
             * *   **ipv6**: IPv6. IPv6 is supported only if the VBR of the BGP group has IPv6 enabled.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether the ASN is fake. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder isFake(String isFake) {
                this.isFake = isFake;
                return this;
            }

            /**
             * The keepalive time. Unit: seconds.
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
             * The name of the BGP group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The autonomous system number (ASN) of the on-premises device in the data center.
             */
            public Builder peerAsn(String peerAsn) {
                this.peerAsn = peerAsn;
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
             * The maximum number of route entries for BGP dynamic route learning.
             */
            public Builder routeLimit(String routeLimit) {
                this.routeLimit = routeLimit;
                return this;
            }

            /**
             * The ID of the VBR.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * The status of the BGP group.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BgpGroup build() {
                return new BgpGroup(this);
            } 

        } 

    }
    public static class BgpGroups extends TeaModel {
        @NameInMap("BgpGroup")
        private java.util.List < BgpGroup> bgpGroup;

        private BgpGroups(Builder builder) {
            this.bgpGroup = builder.bgpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpGroups create() {
            return builder().build();
        }

        /**
         * @return bgpGroup
         */
        public java.util.List < BgpGroup> getBgpGroup() {
            return this.bgpGroup;
        }

        public static final class Builder {
            private java.util.List < BgpGroup> bgpGroup; 

            /**
             * BgpGroup.
             */
            public Builder bgpGroup(java.util.List < BgpGroup> bgpGroup) {
                this.bgpGroup = bgpGroup;
                return this;
            }

            public BgpGroups build() {
                return new BgpGroups(this);
            } 

        } 

    }
}
