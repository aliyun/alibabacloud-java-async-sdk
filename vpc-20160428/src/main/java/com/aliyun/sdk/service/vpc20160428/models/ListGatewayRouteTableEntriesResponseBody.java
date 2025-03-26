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
 * {@link ListGatewayRouteTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteTableEntriesResponseBody</p>
 */
public class ListGatewayRouteTableEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayRouteEntryModels")
    private java.util.List<GatewayRouteEntryModels> gatewayRouteEntryModels;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListGatewayRouteTableEntriesResponseBody(Builder builder) {
        this.gatewayRouteEntryModels = builder.gatewayRouteEntryModels;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayRouteTableEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayRouteEntryModels
     */
    public java.util.List<GatewayRouteEntryModels> getGatewayRouteEntryModels() {
        return this.gatewayRouteEntryModels;
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
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<GatewayRouteEntryModels> gatewayRouteEntryModels; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListGatewayRouteTableEntriesResponseBody model) {
            this.gatewayRouteEntryModels = model.gatewayRouteEntryModels;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the routes in the gateway route table.</p>
         */
        public Builder gatewayRouteEntryModels(java.util.List<GatewayRouteEntryModels> gatewayRouteEntryModels) {
            this.gatewayRouteEntryModels = gatewayRouteEntryModels;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
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
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGatewayRouteTableEntriesResponseBody build() {
            return new ListGatewayRouteTableEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayRouteTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteTableEntriesResponseBody</p>
     */
    public static class NextHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private NextHops(Builder builder) {
            this.enabled = builder.enabled;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHops create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
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
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String enabled; 
            private String nextHopId; 
            private String nextHopType; 
            private String weight; 

            private Builder() {
            } 

            private Builder(NextHops model) {
                this.enabled = model.enabled;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.weight = model.weight;
            } 

            /**
             * <p>Indicates whether the route is available. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unavailable</li>
             * <li><strong>1</strong>: available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabled(String enabled) {
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
             * <p>The type of the next hop. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong> (default): an ECS instance</li>
             * <li><strong>HaVip</strong>: a high-availability virtual IP address (HAVIP).</li>
             * <li><strong>VpnGateway</strong>: a VPN gateway</li>
             * <li><strong>NatGateway</strong>: a NAT gateway</li>
             * <li><strong>NetworkInterface</strong>: a secondary ENI</li>
             * <li><strong>RouterInterface</strong>: a router interface</li>
             * <li><strong>IPv6Gateway</strong>: an IPv6 gateway</li>
             * <li><strong>Attachment</strong>: a transit router</li>
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
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteTableEntriesResponseBody</p>
     */
    public static class GatewayRouteEntryModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("NextHops")
        private java.util.List<NextHops> nextHops;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private GatewayRouteEntryModels(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.name = builder.name;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.nextHops = builder.nextHops;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayRouteEntryModels create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return nextHops
         */
        public java.util.List<NextHops> getNextHops() {
            return this.nextHops;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrBlock; 
            private String name; 
            private String nextHopId; 
            private String nextHopType; 
            private java.util.List<NextHops> nextHops; 
            private String status; 

            private Builder() {
            } 

            private Builder(GatewayRouteEntryModels model) {
                this.description = model.description;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.name = model.name;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.nextHops = model.nextHops;
                this.status = model.status;
            } 

            /**
             * <p>The name of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.5</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The name of the route entry.</p>
             * <p>The name must be 2 to 128 characters in length and can contain letter, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp11gcl0sm85t9bi****</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The type of the next hop. Valid values:</p>
             * <ul>
             * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>NetworkInterface</strong>: elastic network interfaces (ENIs).</li>
             * <li><strong>Local</strong>: local next hop</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsInstance</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The information about the next hop.</p>
             */
            public Builder nextHops(java.util.List<NextHops> nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * <p>The status of the route entry. Valid values:</p>
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

            public GatewayRouteEntryModels build() {
                return new GatewayRouteEntryModels(this);
            } 

        } 

    }
}
