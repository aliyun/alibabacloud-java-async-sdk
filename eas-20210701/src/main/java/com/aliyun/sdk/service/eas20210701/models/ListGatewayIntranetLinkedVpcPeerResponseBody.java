// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayIntranetLinkedVpcPeerResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayIntranetLinkedVpcPeerResponseBody</p>
 */
public class ListGatewayIntranetLinkedVpcPeerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("PeerVpcList")
    private java.util.List < PeerVpcList> peerVpcList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayIntranetLinkedVpcPeerResponseBody(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.peerVpcList = builder.peerVpcList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetLinkedVpcPeerResponseBody create() {
        return builder().build();
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return peerVpcList
     */
    public java.util.List < PeerVpcList> getPeerVpcList() {
        return this.peerVpcList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gatewayId; 
        private java.util.List < PeerVpcList> peerVpcList; 
        private String requestId; 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * PeerVpcList.
         */
        public Builder peerVpcList(java.util.List < PeerVpcList> peerVpcList) {
            this.peerVpcList = peerVpcList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayIntranetLinkedVpcPeerResponseBody build() {
            return new ListGatewayIntranetLinkedVpcPeerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayIntranetLinkedVpcPeerResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayIntranetLinkedVpcPeerResponseBody</p>
     */
    public static class PeerVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private PeerVpcs(Builder builder) {
            this.region = builder.region;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpcs create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String region; 
            private String vpcId; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PeerVpcs build() {
                return new PeerVpcs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayIntranetLinkedVpcPeerResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayIntranetLinkedVpcPeerResponseBody</p>
     */
    public static class PeerVpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeerVpcs")
        private java.util.List < PeerVpcs> peerVpcs;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private PeerVpcList(Builder builder) {
            this.peerVpcs = builder.peerVpcs;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpcList create() {
            return builder().build();
        }

        /**
         * @return peerVpcs
         */
        public java.util.List < PeerVpcs> getPeerVpcs() {
            return this.peerVpcs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < PeerVpcs> peerVpcs; 
            private String vpcId; 

            /**
             * PeerVpcs.
             */
            public Builder peerVpcs(java.util.List < PeerVpcs> peerVpcs) {
                this.peerVpcs = peerVpcs;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PeerVpcList build() {
                return new PeerVpcList(this);
            } 

        } 

    }
}
