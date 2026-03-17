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
 * {@link ViewSmartAccessGatewayRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>ViewSmartAccessGatewayRoutesResponseBody</p>
 */
public class ViewSmartAccessGatewayRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Routes")
    private java.util.List<Routes> routes;

    private ViewSmartAccessGatewayRoutesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSmartAccessGatewayRoutesResponseBody create() {
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

        private Builder(ViewSmartAccessGatewayRoutesResponseBody model) {
            this.requestId = model.requestId;
            this.routes = model.routes;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F3D21D0B-5258-5412-AD1C-3929D297286B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the queried routes.</p>
         */
        public Builder routes(java.util.List<Routes> routes) {
            this.routes = routes;
            return this;
        }

        public ViewSmartAccessGatewayRoutesResponseBody build() {
            return new ViewSmartAccessGatewayRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ViewSmartAccessGatewayRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ViewSmartAccessGatewayRoutesResponseBody</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictCidrs")
        private java.util.List<String> conflictCidrs;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private String cost;

        @com.aliyun.core.annotation.NameInMap("Dst")
        private String dst;

        @com.aliyun.core.annotation.NameInMap("Idx")
        private Integer idx;

        @com.aliyun.core.annotation.NameInMap("Nexthop")
        private String nexthop;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Routes(Builder builder) {
            this.conflictCidrs = builder.conflictCidrs;
            this.cost = builder.cost;
            this.dst = builder.dst;
            this.idx = builder.idx;
            this.nexthop = builder.nexthop;
            this.role = builder.role;
            this.type = builder.type;
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
         * @return dst
         */
        public String getDst() {
            return this.dst;
        }

        /**
         * @return idx
         */
        public Integer getIdx() {
            return this.idx;
        }

        /**
         * @return nexthop
         */
        public String getNexthop() {
            return this.nexthop;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> conflictCidrs; 
            private String cost; 
            private String dst; 
            private Integer idx; 
            private String nexthop; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.conflictCidrs = model.conflictCidrs;
                this.cost = model.cost;
                this.dst = model.dst;
                this.idx = model.idx;
                this.nexthop = model.nexthop;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * <p>The CIDR blocks that overlap with each other.</p>
             */
            public Builder conflictCidrs(java.util.List<String> conflictCidrs) {
                this.conflictCidrs = conflictCidrs;
                return this;
            }

            /**
             * <p>The route cost.</p>
             * <p>The first <strong>0</strong> represents the administrative distance (AD).</p>
             * <p>The second <strong>0</strong> represents the router metric.</p>
             * 
             * <strong>example:</strong>
             * <p>[0/0]</p>
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>172.1.1.0/24</p>
             */
            public Builder dst(String dst) {
                this.dst = dst;
                return this;
            }

            /**
             * <p>The port number. A value of -1 indicates that the next hop points to a VPN tunnel.</p>
             * <p>Valid values: <strong>-1</strong> to <strong>4294967295</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder idx(Integer idx) {
                this.idx = idx;
                return this;
            }

            /**
             * <p>The next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>1.XX.XX.1</p>
             */
            public Builder nexthop(String nexthop) {
                this.nexthop = nexthop;
                return this;
            }

            /**
             * <p>The port role.</p>
             * 
             * <strong>example:</strong>
             * <p>WAN</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>static</strong></li>
             * <li><strong>bgp</strong></li>
             * <li><strong>ospf</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
