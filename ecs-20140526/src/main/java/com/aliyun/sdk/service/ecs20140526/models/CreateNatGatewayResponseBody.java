// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatGatewayResponseBody</p>
 */
public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageIds")
    private BandwidthPackageIds bandwidthPackageIds;

    @NameInMap("ForwardTableIds")
    private ForwardTableIds forwardTableIds;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNatGatewayResponseBody(Builder builder) {
        this.bandwidthPackageIds = builder.bandwidthPackageIds;
        this.forwardTableIds = builder.forwardTableIds;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackageIds
     */
    public BandwidthPackageIds getBandwidthPackageIds() {
        return this.bandwidthPackageIds;
    }

    /**
     * @return forwardTableIds
     */
    public ForwardTableIds getForwardTableIds() {
        return this.forwardTableIds;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BandwidthPackageIds bandwidthPackageIds; 
        private ForwardTableIds forwardTableIds; 
        private String natGatewayId; 
        private String requestId; 

        /**
         * BandwidthPackageIds.
         */
        public Builder bandwidthPackageIds(BandwidthPackageIds bandwidthPackageIds) {
            this.bandwidthPackageIds = bandwidthPackageIds;
            return this;
        }

        /**
         * ForwardTableIds.
         */
        public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatGatewayResponseBody build() {
            return new CreateNatGatewayResponseBody(this);
        } 

    } 

    public static class BandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        private java.util.List < String > bandwidthPackageId;

        private BandwidthPackageIds(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackageIds create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public java.util.List < String > getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public static final class Builder {
            private java.util.List < String > bandwidthPackageId; 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(java.util.List < String > bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            public BandwidthPackageIds build() {
                return new BandwidthPackageIds(this);
            } 

        } 

    }
    public static class ForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        private java.util.List < String > forwardTableId;

        private ForwardTableIds(Builder builder) {
            this.forwardTableId = builder.forwardTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableIds create() {
            return builder().build();
        }

        /**
         * @return forwardTableId
         */
        public java.util.List < String > getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private java.util.List < String > forwardTableId; 

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(java.util.List < String > forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTableIds build() {
                return new ForwardTableIds(this);
            } 

        } 

    }
}
