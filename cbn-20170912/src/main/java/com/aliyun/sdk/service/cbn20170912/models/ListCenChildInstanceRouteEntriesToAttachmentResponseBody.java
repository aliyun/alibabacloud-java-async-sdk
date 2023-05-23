// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCenChildInstanceRouteEntriesToAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenChildInstanceRouteEntriesToAttachmentResponseBody</p>
 */
public class ListCenChildInstanceRouteEntriesToAttachmentResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntry")
    private java.util.List < RouteEntry> routeEntry;

    private ListCenChildInstanceRouteEntriesToAttachmentResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeEntry = builder.routeEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenChildInstanceRouteEntriesToAttachmentResponseBody create() {
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
     * @return routeEntry
     */
    public java.util.List < RouteEntry> getRouteEntry() {
        return this.routeEntry;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < RouteEntry> routeEntry; 

        /**
         * The token that determines the start point of the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The detailed information about the route.
         */
        public Builder routeEntry(java.util.List < RouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBody build() {
            return new ListCenChildInstanceRouteEntriesToAttachmentResponseBody(this);
        } 

    } 

    public static class RouteEntry extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("ChildInstanceRouteTableId")
        private String childInstanceRouteTableId;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        private RouteEntry(Builder builder) {
            this.cenId = builder.cenId;
            this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntry create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return childInstanceRouteTableId
         */
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
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
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public static final class Builder {
            private String cenId; 
            private String childInstanceRouteTableId; 
            private String destinationCidrBlock; 
            private String serviceType; 
            private String status; 
            private String transitRouterAttachmentId; 

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The ID of the route table configured on the network instance.
             */
            public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
                this.childInstanceRouteTableId = childInstanceRouteTableId;
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
             * Indicates whether the route is hosted. If the parameter is empty, the route is not hosted. A value of TR indicates that the route is hosted on a transit router.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The status of the route. Valid values:
             * <p>
             * 
             * *   **Available**: The route is available.
             * *   **Pending**: The route is being configured.
             * *   **Modifying**: the route is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the network instance connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            public RouteEntry build() {
                return new RouteEntry(this);
            } 

        } 

    }
}
