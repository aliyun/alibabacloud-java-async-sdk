// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * FirewallRouteDetailList.
         */
        public Builder firewallRouteDetailList(java.util.List < FirewallRouteDetailList> firewallRouteDetailList) {
            this.firewallRouteDetailList = firewallRouteDetailList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrFirewallsV2RouteListResponseBody build() {
            return new DescribeTrFirewallsV2RouteListResponseBody(this);
        } 

    } 

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
             * TrFirewallRouteDestination.
             */
            public Builder trFirewallRouteDestination(String trFirewallRouteDestination) {
                this.trFirewallRouteDestination = trFirewallRouteDestination;
                return this;
            }

            /**
             * TrFirewallRouteNexthop.
             */
            public Builder trFirewallRouteNexthop(String trFirewallRouteNexthop) {
                this.trFirewallRouteNexthop = trFirewallRouteNexthop;
                return this;
            }

            /**
             * TrFirewallRoutePolicyId.
             */
            public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
                this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
                return this;
            }

            /**
             * TrFirewallRouteTableId.
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
