// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteEntryListResponseBody</p>
 */
public class DescribeRouteEntryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntrys")
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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the route.</p>
         */
        public Builder routeEntrys(RouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }

        public DescribeRouteEntryListResponseBody build() {
            return new DescribeRouteEntryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHopRelatedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The ID of the instance that is associated with the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1t36rn9l53iwbsf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the instance associated with the next hop. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: a VPC</li>
             * <li><strong>VBR</strong>: a VBR</li>
             * <li><strong>PCONN</strong>: an Express Connect circuit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region ID of the instance associated with the next hop. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ch-hangzhou</p>
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
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @com.aliyun.core.annotation.NameInMap("NextHopRelatedInfo")
        private NextHopRelatedInfo nextHopRelatedInfo;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>Indicates whether the route is available. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unavailable</li>
             * <li><strong>1</strong>: available</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>vpn-bp10zyaph5cc8b7c7****</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The ID of the region where the next hop is deployed.</p>
             * <blockquote>
             * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * <p>The information about the next hop.</p>
             */
            public Builder nextHopRelatedInfo(NextHopRelatedInfo nextHopRelatedInfo) {
                this.nextHopRelatedInfo = nextHopRelatedInfo;
                return this;
            }

            /**
             * <p>The next hop type. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong>: an ECS instance.</li>
             * <li><strong>HaVip</strong>: an HAVIP.</li>
             * <li><strong>VpnGateway</strong>: a VPN gateway.</li>
             * <li><strong>NatGateway</strong>: a NAT gateway.</li>
             * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
             * <li><strong>RouterInterface</strong>: a router interface.</li>
             * <li><strong>IPv6Gateway</strong>: an IPv6 gateway.</li>
             * <li><strong>Attachment</strong>: a transit router.</li>
             * <li><strong>Ipv4Gateway</strong>: an IPv4 gateway.</li>
             * <li><strong>GatewayEndpoint</strong>: a gateway endpoint.</li>
             * <li><strong>CenBasic</strong>: CEN does not support transit routers.</li>
             * <li><strong>Ecr</strong>: ECR.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The weight of the route.</p>
             * <blockquote>
             * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHop")
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
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class RouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("NextHops")
        private NextHops nextHops;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RouteEntryName")
        private String routeEntryName;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RouteEntry(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.gmtModified = builder.gmtModified;
            this.ipVersion = builder.ipVersion;
            this.nextHops = builder.nextHops;
            this.origin = builder.origin;
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
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
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
            private String origin; 
            private String routeEntryId; 
            private String routeEntryName; 
            private String routeTableId; 
            private String serviceType; 
            private String status; 
            private String type; 

            /**
             * <p>The description of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>RouteEntryDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.2.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The time when the route was modified. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-09T03:00:07Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The IP version. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>ipv4</strong></li>
             * <li><strong>ipv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The information about the next hops.</p>
             */
            public Builder nextHops(NextHops nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * <p>The route origin. Valid values:</p>
             * <ul>
             * <li><strong>RoutePropagation</strong>: The route is created by a dynamic propagation source.</li>
             * <li><strong>SystemCreate</strong>: The route is created by the system.</li>
             * <li><strong>CustomCreate</strong>: The route is created by a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RoutePropagation</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>rte-bp1mnnr2al0naomnp****</p>
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp15w5q90d2rk3bww****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>Indicates whether the route is hosted. If the parameter is empty, the route is not hosted.</p>
             * <p>If <strong>TR</strong> is returned, the route is hosted by a transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>TR</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The route status. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>Custom</strong>: custom routes.</li>
             * <li><strong>System</strong>: system routes.</li>
             * <li><strong>BGP</strong>: BGP routes.</li>
             * <li><strong>CEN</strong>: CEN routes.</li>
             * <li><strong>ECR</strong>: ECR routes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class RouteEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntry")
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
