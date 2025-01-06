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
 * {@link ListCenChildInstanceRouteEntriesToAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenChildInstanceRouteEntriesToAttachmentResponseBody</p>
 */
public class ListCenChildInstanceRouteEntriesToAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntry")
    private java.util.List<RouteEntry> routeEntry;

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
    public java.util.List<RouteEntry> getRouteEntry() {
        return this.routeEntry;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteEntry> routeEntry; 

        /**
         * <p>The token that determines the start point of the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>530BC816-F575-412A-AAB2-435125D26328</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about the route.</p>
         */
        public Builder routeEntry(java.util.List<RouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBody build() {
            return new ListCenChildInstanceRouteEntriesToAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCenChildInstanceRouteEntriesToAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCenChildInstanceRouteEntriesToAttachmentResponseBody</p>
     */
    public static class RouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceRouteTableId")
        private String childInstanceRouteTableId;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
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
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-9adwg6ghpq8oq4dp7q</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The ID of the route table configured on the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1tlaj1c4nxr2t3e****</p>
             */
            public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
                this.childInstanceRouteTableId = childInstanceRouteTableId;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>Indicates whether the route is hosted. If the parameter is empty, the route is not hosted. A value of TR indicates that the route is hosted on a transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>TR</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The status of the route. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: The route is available.</li>
             * <li><strong>Pending</strong>: The route is being configured.</li>
             * <li><strong>Modifying</strong>: the route is being modified.</li>
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
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-y463sghkkv1loe****</p>
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
