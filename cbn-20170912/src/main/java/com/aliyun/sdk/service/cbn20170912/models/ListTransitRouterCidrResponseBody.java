// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTransitRouterCidrResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterCidrResponseBody</p>
 */
public class ListTransitRouterCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrLists")
    private java.util.List<CidrLists> cidrLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTransitRouterCidrResponseBody(Builder builder) {
        this.cidrLists = builder.cidrLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterCidrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrLists
     */
    public java.util.List<CidrLists> getCidrLists() {
        return this.cidrLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CidrLists> cidrLists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTransitRouterCidrResponseBody model) {
            this.cidrLists = model.cidrLists;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of transit router CIDR blocks.</p>
         */
        public Builder cidrLists(java.util.List<CidrLists> cidrLists) {
            this.cidrLists = cidrLists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTransitRouterCidrResponseBody build() {
            return new ListTransitRouterCidrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterCidrResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterCidrResponseBody</p>
     */
    public static class CidrLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Family")
        private String family;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishCidrRoute")
        private Boolean publishCidrRoute;

        @com.aliyun.core.annotation.NameInMap("TransitRouterCidrId")
        private String transitRouterCidrId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private CidrLists(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.family = builder.family;
            this.name = builder.name;
            this.publishCidrRoute = builder.publishCidrRoute;
            this.transitRouterCidrId = builder.transitRouterCidrId;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CidrLists create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return family
         */
        public String getFamily() {
            return this.family;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishCidrRoute
         */
        public Boolean getPublishCidrRoute() {
            return this.publishCidrRoute;
        }

        /**
         * @return transitRouterCidrId
         */
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String family; 
            private String name; 
            private Boolean publishCidrRoute; 
            private String transitRouterCidrId; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(CidrLists model) {
                this.cidr = model.cidr;
                this.description = model.description;
                this.family = model.family;
                this.name = model.name;
                this.publishCidrRoute = model.publishCidrRoute;
                this.transitRouterCidrId = model.transitRouterCidrId;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the transit router CIDR block.</p>
             * <p>The value is <strong>IPv4</strong> only, which indicates that the transit router CIDR block is of the IPv4 type.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * <p>The name of the transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the system is allowed to automatically add a route for the transit router CIDR block to the transit router route table.</p>
             * <ul>
             * <li><p><strong>true</strong>: allowed.</p>
             * <p>  If the value of this parameter is <strong>true</strong>, after you create a VPN connection of the private gateway type and create a route learning relationship for the VPN connection, the system automatically adds a route entry to the transit router route table that has a route learning relationship with the VPN connection:</p>
             * <p>The route entry is a blackhole route whose destination CIDR block is the transit router CIDR block from which gateway IP addresses have been allocated to the IPsec connection.</p>
             * <p>The blackhole route is propagated only to the route tables of VBR instances associated with the transit router.</p>
             * </li>
             * <li><p><strong>false</strong>: not allowed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publishCidrRoute(Boolean publishCidrRoute) {
                this.publishCidrRoute = publishCidrRoute;
                return this;
            }

            /**
             * <p>The ID of the transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>cidr-0zv0q9crqpntzz****</p>
             */
            public Builder transitRouterCidrId(String transitRouterCidrId) {
                this.transitRouterCidrId = transitRouterCidrId;
                return this;
            }

            /**
             * <p>The ID of the transit router instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-p0w3x8c9em72a40nw****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public CidrLists build() {
                return new CidrLists(this);
            } 

        } 

    }
}
