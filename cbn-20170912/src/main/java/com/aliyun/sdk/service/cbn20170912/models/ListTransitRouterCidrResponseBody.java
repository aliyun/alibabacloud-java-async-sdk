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
         * CidrLists.
         */
        public Builder cidrLists(java.util.List < CidrLists> cidrLists) {
            this.cidrLists = cidrLists;
            return this;
        }

        /**
         * RequestId.
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
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Family.
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublishCidrRoute.
             */
            public Builder publishCidrRoute(Boolean publishCidrRoute) {
                this.publishCidrRoute = publishCidrRoute;
                return this;
            }

            /**
             * TransitRouterCidrId.
             */
            public Builder transitRouterCidrId(String transitRouterCidrId) {
                this.transitRouterCidrId = transitRouterCidrId;
                return this;
            }

            /**
             * TransitRouterId.
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
