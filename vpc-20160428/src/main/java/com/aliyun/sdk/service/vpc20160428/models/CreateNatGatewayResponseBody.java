// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    @NameInMap("ForwardTableIds")
    private ForwardTableIds forwardTableIds;

    @NameInMap("FullNatTableIds")
    private FullNatTableIds fullNatTableIds;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnatTableIds")
    private SnatTableIds snatTableIds;

    private CreateNatGatewayResponseBody(Builder builder) {
        this.forwardTableIds = builder.forwardTableIds;
        this.fullNatTableIds = builder.fullNatTableIds;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.snatTableIds = builder.snatTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardTableIds
     */
    public ForwardTableIds getForwardTableIds() {
        return this.forwardTableIds;
    }

    /**
     * @return fullNatTableIds
     */
    public FullNatTableIds getFullNatTableIds() {
        return this.fullNatTableIds;
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

    /**
     * @return snatTableIds
     */
    public SnatTableIds getSnatTableIds() {
        return this.snatTableIds;
    }

    public static final class Builder {
        private ForwardTableIds forwardTableIds; 
        private FullNatTableIds fullNatTableIds; 
        private String natGatewayId; 
        private String requestId; 
        private SnatTableIds snatTableIds; 

        /**
         * A list of DNAT entries.
         */
        public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }

        /**
         * A list of FULLNAT entries.
         */
        public Builder fullNatTableIds(FullNatTableIds fullNatTableIds) {
            this.fullNatTableIds = fullNatTableIds;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of SNAT entries.
         */
        public Builder snatTableIds(SnatTableIds snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }

        public CreateNatGatewayResponseBody build() {
            return new CreateNatGatewayResponseBody(this);
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
    public static class FullNatTableIds extends TeaModel {
        @NameInMap("FullNatTableId")
        private java.util.List < String > fullNatTableId;

        private FullNatTableIds(Builder builder) {
            this.fullNatTableId = builder.fullNatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNatTableIds create() {
            return builder().build();
        }

        /**
         * @return fullNatTableId
         */
        public java.util.List < String > getFullNatTableId() {
            return this.fullNatTableId;
        }

        public static final class Builder {
            private java.util.List < String > fullNatTableId; 

            /**
             * FullNatTableId.
             */
            public Builder fullNatTableId(java.util.List < String > fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            public FullNatTableIds build() {
                return new FullNatTableIds(this);
            } 

        } 

    }
    public static class SnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        private java.util.List < String > snatTableId;

        private SnatTableIds(Builder builder) {
            this.snatTableId = builder.snatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableIds create() {
            return builder().build();
        }

        /**
         * @return snatTableId
         */
        public java.util.List < String > getSnatTableId() {
            return this.snatTableId;
        }

        public static final class Builder {
            private java.util.List < String > snatTableId; 

            /**
             * SnatTableId.
             */
            public Builder snatTableId(java.util.List < String > snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            public SnatTableIds build() {
                return new SnatTableIds(this);
            } 

        } 

    }
}
