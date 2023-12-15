// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterCidrResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterCidrResponseBody</p>
 */
public class ListTransitRouterCidrResponseBody extends TeaModel {
    @NameInMap("CidrLists")
    private java.util.List < CidrLists> cidrLists;

    @NameInMap("RequestId")
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

    /**
     * @return cidrLists
     */
    public java.util.List < CidrLists> getCidrLists() {
        return this.cidrLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CidrLists> cidrLists; 
        private String requestId; 

        /**
         * The CIDR blocks of the transit router.
         */
        public Builder cidrLists(java.util.List < CidrLists> cidrLists) {
            this.cidrLists = cidrLists;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTransitRouterCidrResponseBody build() {
            return new ListTransitRouterCidrResponseBody(this);
        } 

    } 

    public static class CidrLists extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        @NameInMap("Family")
        private String family;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublishCidrRoute")
        private Boolean publishCidrRoute;

        @NameInMap("TransitRouterCidrId")
        private String transitRouterCidrId;

        @NameInMap("TransitRouterId")
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

            /**
             * The CIDR block of the transit router.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The description of the CIDR block.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The type of the CIDR block.
             * <p>
             * 
             * The value is set to **IPv4**, which indicates that the CIDR block is of the IPv4 type.
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * The name of the CIDR block.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the system is allowed to automatically add a route to the route table of the transit router.
             * <p>
             * 
             * - **true**: yes.
             * 
             *      A value of true indicates that if you create a private VPN connection and add a route learning policy for the VPC connection, the system automatically adds the following route to the route table of the transit router that is in route learning relationship with the VPN connection:
             *       
             *     A blackhole route whose destination CIDR block is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. 
             *           
             *    The blackhole route is advertised only to the route tables of VBRs that are connected to the transit router. 
             * 
             * - **false**: no.
             */
            public Builder publishCidrRoute(Boolean publishCidrRoute) {
                this.publishCidrRoute = publishCidrRoute;
                return this;
            }

            /**
             * The ID of the CIDR block.
             */
            public Builder transitRouterCidrId(String transitRouterCidrId) {
                this.transitRouterCidrId = transitRouterCidrId;
                return this;
            }

            /**
             * The ID of the transit router.
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
