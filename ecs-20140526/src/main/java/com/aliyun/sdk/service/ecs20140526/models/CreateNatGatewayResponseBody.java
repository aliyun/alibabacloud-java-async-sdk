// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatGatewayResponseBody</p>
 */
public class CreateNatGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageIds")
    private BandwidthPackageIds bandwidthPackageIds;

    @com.aliyun.core.annotation.NameInMap("ForwardTableIds")
    private ForwardTableIds forwardTableIds;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateNatGatewayResponseBody model) {
            this.bandwidthPackageIds = model.bandwidthPackageIds;
            this.forwardTableIds = model.forwardTableIds;
            this.natGatewayId = model.natGatewayId;
            this.requestId = model.requestId;
        } 

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

    /**
     * 
     * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNatGatewayResponseBody</p>
     */
    public static class BandwidthPackageIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private java.util.List<String> bandwidthPackageId;

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
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public static final class Builder {
            private java.util.List<String> bandwidthPackageId; 

            private Builder() {
            } 

            private Builder(BandwidthPackageIds model) {
                this.bandwidthPackageId = model.bandwidthPackageId;
            } 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(java.util.List<String> bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            public BandwidthPackageIds build() {
                return new BandwidthPackageIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNatGatewayResponseBody</p>
     */
    public static class ForwardTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardTableId")
        private java.util.List<String> forwardTableId;

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
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private java.util.List<String> forwardTableId; 

            private Builder() {
            } 

            private Builder(ForwardTableIds model) {
                this.forwardTableId = model.forwardTableId;
            } 

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(java.util.List<String> forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTableIds build() {
                return new ForwardTableIds(this);
            } 

        } 

    }
}
