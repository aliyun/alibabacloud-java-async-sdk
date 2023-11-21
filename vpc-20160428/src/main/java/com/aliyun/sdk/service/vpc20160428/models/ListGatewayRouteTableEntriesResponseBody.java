// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteTableEntriesResponseBody</p>
 */
public class ListGatewayRouteTableEntriesResponseBody extends TeaModel {
    @NameInMap("GatewayRouteEntryModels")
    private java.util.List < GatewayRouteEntryModels> gatewayRouteEntryModels;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return gatewayRouteEntryModels
     */
    public java.util.List < GatewayRouteEntryModels> getGatewayRouteEntryModels() {
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
        private java.util.List < GatewayRouteEntryModels> gatewayRouteEntryModels; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The details of the routes in the gateway route table.
         */
        public Builder gatewayRouteEntryModels(java.util.List < GatewayRouteEntryModels> gatewayRouteEntryModels) {
            this.gatewayRouteEntryModels = gatewayRouteEntryModels;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is used to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGatewayRouteTableEntriesResponseBody build() {
            return new ListGatewayRouteTableEntriesResponseBody(this);
        } 

    } 

    public static class NextHops extends TeaModel {
        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("NextHopId")
        private String nextHopId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("Weight")
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

            /**
             * Indicates whether the route is available. Valid values:
             * <p>
             * 
             * *   **0**: unavailable
             * *   **1**: available
             */
            public Builder enabled(String enabled) {
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
             * The type of the next hop. Valid values:
             * <p>
             * 
             * *   **Instance** (default): an ECS instance
             * *   **HaVip**: a high-availability virtual IP address (HAVIP).
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
    public static class GatewayRouteEntryModels extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("Name")
        private String name;

        @NameInMap("NextHopId")
        private String nextHopId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("NextHops")
        private java.util.List < NextHops> nextHops;

        @NameInMap("Status")
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
        public java.util.List < NextHops> getNextHops() {
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
            private java.util.List < NextHops> nextHops; 
            private String status; 

            /**
             * The name of the route entry.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination CIDR block of the route.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The name of the route entry.
             * <p>
             * 
             * The name must be 2 to 128 characters in length and can contain letter, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The type of the next hop. Valid values:
             * <p>
             * 
             * *   **EcsInstance**: Elastic Compute Service (ECS) instance
             * *   **NetworkInterface**: elastic network interfaces (ENIs).
             * *   **Local**: local next hop
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The information about the next hop.
             */
            public Builder nextHops(java.util.List < NextHops> nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * The status of the route entry. Valid values:
             * <p>
             * 
             * *   **Pending**
             * *   **Available**
             * *   **Modifying**
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
