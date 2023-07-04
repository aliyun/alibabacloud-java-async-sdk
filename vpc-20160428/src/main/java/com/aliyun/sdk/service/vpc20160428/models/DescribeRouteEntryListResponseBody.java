// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteEntryListResponseBody</p>
 */
public class DescribeRouteEntryListResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntrys")
    private RouteEntrys routeEntrys;

    private DescribeRouteEntryListResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeEntrys = builder.routeEntrys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteEntryListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeEntrys
     */
    public RouteEntrys getRouteEntrys() {
        return this.routeEntrys;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private RouteEntrys routeEntrys; 

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the routes.
         */
        public Builder routeEntrys(RouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }

        public DescribeRouteEntryListResponseBody build() {
            return new DescribeRouteEntryListResponseBody(this);
        } 

    } 

    public static class NextHopRelatedInfo extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("RegionId")
        private String regionId;

        private NextHopRelatedInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHopRelatedInfo create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 
            private String regionId; 

            /**
             * The ID of the instance associated with the next hop.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the instance associated with the next hop. Valid values:
             * <p>
             * 
             * *   **VPC**: a virtual private cloud (VPC)
             * *   **VBR**: a VBR
             * *   **PCONN**: an Express Connect circuit
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The region ID of the instance associated with the next hop.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public NextHopRelatedInfo build() {
                return new NextHopRelatedInfo(this);
            } 

        } 

    }
    public static class NextHop extends TeaModel {
        @NameInMap("Enabled")
        private Integer enabled;

        @NameInMap("NextHopId")
        private String nextHopId;

        @NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @NameInMap("NextHopRelatedInfo")
        private NextHopRelatedInfo nextHopRelatedInfo;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("Weight")
        private Integer weight;

        private NextHop(Builder builder) {
            this.enabled = builder.enabled;
            this.nextHopId = builder.nextHopId;
            this.nextHopRegionId = builder.nextHopRegionId;
            this.nextHopRelatedInfo = builder.nextHopRelatedInfo;
            this.nextHopType = builder.nextHopType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHop create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopRegionId
         */
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        /**
         * @return nextHopRelatedInfo
         */
        public NextHopRelatedInfo getNextHopRelatedInfo() {
            return this.nextHopRelatedInfo;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer enabled; 
            private String nextHopId; 
            private String nextHopRegionId; 
            private NextHopRelatedInfo nextHopRelatedInfo; 
            private String nextHopType; 
            private Integer weight; 

            /**
             * Indicates whether the route is available. Valid values:
             * <p>
             * 
             * *   **0**: unavailable
             * *   **1**: available
             * 
             * >  This parameter is returned if the next hop type is set to **RouterInterface**.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The ID of the next hop.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * The region ID of the next hop.
             * <p>
             * 
             * >  This parameter is returned if the next hop type is set to **RouterInterface**.
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * The information about the next hop.
             */
            public Builder nextHopRelatedInfo(NextHopRelatedInfo nextHopRelatedInfo) {
                this.nextHopRelatedInfo = nextHopRelatedInfo;
                return this;
            }

            /**
             * The type of the next hop. Valid values:
             * <p>
             * 
             * *   **Instance**: an ECS instance
             * *   **HaVip**: an HAVIP
             * *   **VpnGateway**: a VPN gateway
             * *   **NatGateway**: a NAT gateway
             * *   **NetworkInterface**: a secondary ENI
             * *   **RouterInterface**: a router interface
             * *   **IPv6Gateway**: an IPv6 gateway
             * *   **Attachment**: a transit router
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The weight of the route.
             * <p>
             * 
             * >  This parameter is returned if the next hop type is set to **RouterInterface**.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public NextHop build() {
                return new NextHop(this);
            } 

        } 

    }
    public static class NextHops extends TeaModel {
        @NameInMap("NextHop")
        private java.util.List < NextHop> nextHop;

        private NextHops(Builder builder) {
            this.nextHop = builder.nextHop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHops create() {
            return builder().build();
        }

        /**
         * @return nextHop
         */
        public java.util.List < NextHop> getNextHop() {
            return this.nextHop;
        }

        public static final class Builder {
            private java.util.List < NextHop> nextHop; 

            /**
             * NextHop.
             */
            public Builder nextHop(java.util.List < NextHop> nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    public static class RouteEntry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("NextHops")
        private NextHops nextHops;

        @NameInMap("RouteEntryId")
        private String routeEntryId;

        @NameInMap("RouteEntryName")
        private String routeEntryName;

        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private RouteEntry(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.gmtModified = builder.gmtModified;
            this.ipVersion = builder.ipVersion;
            this.nextHops = builder.nextHops;
            this.routeEntryId = builder.routeEntryId;
            this.routeEntryName = builder.routeEntryName;
            this.routeTableId = builder.routeTableId;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntry create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return nextHops
         */
        public NextHops getNextHops() {
            return this.nextHops;
        }

        /**
         * @return routeEntryId
         */
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        /**
         * @return routeEntryName
         */
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrBlock; 
            private String gmtModified; 
            private String ipVersion; 
            private NextHops nextHops; 
            private String routeEntryId; 
            private String routeEntryName; 
            private String routeTableId; 
            private String serviceType; 
            private String status; 
            private String type; 

            /**
             * The description of the route.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination CIDR blocks of the route.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The time when the route was modified. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The IP version. Valid values:
             * <p>
             * 
             * *   **IPv4**
             * *   **IPv6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The information about the next hops.
             */
            public Builder nextHops(NextHops nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * The ID of the route.
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * The name of the route.
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
                return this;
            }

            /**
             * The ID of the route table.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * Indicates whether the route is hosted. If the parameter is empty, the route is not hosted. 
             * <p>
             * 
             * If the value is set to **TR**, the route is hosted by a transit router.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The status of the route. Valid values:
             * <p>
             * 
             * *   **Pending**: The route is being configured.
             * *   **Available**: The route is available.
             * *   **Modifying**: The route is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the route. Valid values:
             * <p>
             * 
             * *   **Custom**: a custom route
             * *   **System**: a system route
             * *   **BGP**: a BGP route
             * *   **CEN**: a CEN route
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RouteEntry build() {
                return new RouteEntry(this);
            } 

        } 

    }
    public static class RouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        private java.util.List < RouteEntry> routeEntry;

        private RouteEntrys(Builder builder) {
            this.routeEntry = builder.routeEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntrys create() {
            return builder().build();
        }

        /**
         * @return routeEntry
         */
        public java.util.List < RouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

        public static final class Builder {
            private java.util.List < RouteEntry> routeEntry; 

            /**
             * RouteEntry.
             */
            public Builder routeEntry(java.util.List < RouteEntry> routeEntry) {
                this.routeEntry = routeEntry;
                return this;
            }

            public RouteEntrys build() {
                return new RouteEntrys(this);
            } 

        } 

    }
}
