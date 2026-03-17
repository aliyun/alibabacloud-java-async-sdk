// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagRouteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagRouteListResponseBody</p>
 */
public class DescribeSagRouteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Routes")
    private java.util.List<Routes> routes;

    private DescribeSagRouteListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagRouteListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routes
     */
    public java.util.List<Routes> getRoutes() {
        return this.routes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Routes> routes; 

        private Builder() {
        } 

        private Builder(DescribeSagRouteListResponseBody model) {
            this.requestId = model.requestId;
            this.routes = model.routes;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The routes.</p>
         */
        public Builder routes(java.util.List<Routes> routes) {
            this.routes = routes;
            return this;
        }

        public DescribeSagRouteListResponseBody build() {
            return new DescribeSagRouteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagRouteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagRouteListResponseBody</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictCidrs")
        private java.util.List<String> conflictCidrs;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private String cost;

        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("RouteProtocol")
        private String routeProtocol;

        private Routes(Builder builder) {
            this.conflictCidrs = builder.conflictCidrs;
            this.cost = builder.cost;
            this.destinationCidr = builder.destinationCidr;
            this.nextHop = builder.nextHop;
            this.portName = builder.portName;
            this.routeProtocol = builder.routeProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return conflictCidrs
         */
        public java.util.List<String> getConflictCidrs() {
            return this.conflictCidrs;
        }

        /**
         * @return cost
         */
        public String getCost() {
            return this.cost;
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return routeProtocol
         */
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

        public static final class Builder {
            private java.util.List<String> conflictCidrs; 
            private String cost; 
            private String destinationCidr; 
            private String nextHop; 
            private String portName; 
            private String routeProtocol; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.conflictCidrs = model.conflictCidrs;
                this.cost = model.cost;
                this.destinationCidr = model.destinationCidr;
                this.nextHop = model.nextHop;
                this.portName = model.portName;
                this.routeProtocol = model.routeProtocol;
            } 

            /**
             * <p>The list of CIDR blocks that overlap with each other.</p>
             */
            public Builder conflictCidrs(java.util.List<String> conflictCidrs) {
                this.conflictCidrs = conflictCidrs;
                return this;
            }

            /**
             * <p>The cost of the route.</p>
             * <p>The number on the left side of the forward slash (/) indicates the administrative distance (AD) of the routing protocol.</p>
             * <p>The number on the right side of the forward slash (/) indicates the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>[110/11]</p>
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>6.XX.XX.6/32</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The name of the port. If the port name is -1, data is transferred through a VPN tunnel to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The routing protocol. Valid values:</p>
             * <ul>
             * <li><strong>STATIC</strong>: a static routing protocol.</li>
             * <li><strong>OSPF</strong>: the Open Shortest Path First (OSPF) dynamic routing protocol.</li>
             * <li><strong>BGP</strong>: the Border Gateway Protocol (BGP) dynamic routing protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC</p>
             */
            public Builder routeProtocol(String routeProtocol) {
                this.routeProtocol = routeProtocol;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
