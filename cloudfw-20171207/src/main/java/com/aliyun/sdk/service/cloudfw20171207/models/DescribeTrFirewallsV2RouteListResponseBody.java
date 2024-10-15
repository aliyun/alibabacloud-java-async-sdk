// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTrFirewallsV2RouteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2RouteListResponseBody</p>
 */
public class DescribeTrFirewallsV2RouteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallRouteDetailList")
    private java.util.List < FirewallRouteDetailList> firewallRouteDetailList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTrFirewallsV2RouteListResponseBody(Builder builder) {
        this.firewallRouteDetailList = builder.firewallRouteDetailList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2RouteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallRouteDetailList
     */
    public java.util.List < FirewallRouteDetailList> getFirewallRouteDetailList() {
        return this.firewallRouteDetailList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FirewallRouteDetailList> firewallRouteDetailList; 
        private String requestId; 

        /**
         * <p>The route tables of Cloud Firewall.</p>
         */
        public Builder firewallRouteDetailList(java.util.List < FirewallRouteDetailList> firewallRouteDetailList) {
            this.firewallRouteDetailList = firewallRouteDetailList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABF190A2-B4D0-53F6-995A-5690A721F91C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrFirewallsV2RouteListResponseBody build() {
            return new DescribeTrFirewallsV2RouteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallsV2RouteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2RouteListResponseBody</p>
     */
    public static class FirewallRouteDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrFirewallRouteDestination")
        private String trFirewallRouteDestination;

        @com.aliyun.core.annotation.NameInMap("TrFirewallRouteNexthop")
        private String trFirewallRouteNexthop;

        @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
        private String trFirewallRoutePolicyId;

        @com.aliyun.core.annotation.NameInMap("TrFirewallRouteTableId")
        private String trFirewallRouteTableId;

        private FirewallRouteDetailList(Builder builder) {
            this.trFirewallRouteDestination = builder.trFirewallRouteDestination;
            this.trFirewallRouteNexthop = builder.trFirewallRouteNexthop;
            this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
            this.trFirewallRouteTableId = builder.trFirewallRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallRouteDetailList create() {
            return builder().build();
        }

        /**
         * @return trFirewallRouteDestination
         */
        public String getTrFirewallRouteDestination() {
            return this.trFirewallRouteDestination;
        }

        /**
         * @return trFirewallRouteNexthop
         */
        public String getTrFirewallRouteNexthop() {
            return this.trFirewallRouteNexthop;
        }

        /**
         * @return trFirewallRoutePolicyId
         */
        public String getTrFirewallRoutePolicyId() {
            return this.trFirewallRoutePolicyId;
        }

        /**
         * @return trFirewallRouteTableId
         */
        public String getTrFirewallRouteTableId() {
            return this.trFirewallRouteTableId;
        }

        public static final class Builder {
            private String trFirewallRouteDestination; 
            private String trFirewallRouteNexthop; 
            private String trFirewallRoutePolicyId; 
            private String trFirewallRouteTableId; 

            /**
             * <p>The destination address of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/25</p>
             */
            public Builder trFirewallRouteDestination(String trFirewallRouteDestination) {
                this.trFirewallRouteDestination = trFirewallRouteDestination;
                return this;
            }

            /**
             * <p>The ID of the next hop for the route.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-hnxab1y0pxn16p****</p>
             */
            public Builder trFirewallRouteNexthop(String trFirewallRouteNexthop) {
                this.trFirewallRouteNexthop = trFirewallRouteNexthop;
                return this;
            }

            /**
             * <p>The ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-04ecbbc6720d4f90****</p>
             */
            public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
                this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
                return this;
            }

            /**
             * <p>The ID of the route table to which the route entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-2zeockxxxorv0mnhz****</p>
             */
            public Builder trFirewallRouteTableId(String trFirewallRouteTableId) {
                this.trFirewallRouteTableId = trFirewallRouteTableId;
                return this;
            }

            public FirewallRouteDetailList build() {
                return new FirewallRouteDetailList(this);
            } 

        } 

    }
}
