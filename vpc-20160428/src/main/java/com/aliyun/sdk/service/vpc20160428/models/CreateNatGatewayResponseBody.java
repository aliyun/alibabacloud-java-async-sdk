// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    @com.aliyun.core.annotation.NameInMap("ForwardTableIds")
    private ForwardTableIds forwardTableIds;

    @com.aliyun.core.annotation.NameInMap("FullNatTableIds")
    private FullNatTableIds fullNatTableIds;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatTableIds")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateNatGatewayResponseBody model) {
            this.forwardTableIds = model.forwardTableIds;
            this.fullNatTableIds = model.fullNatTableIds;
            this.natGatewayId = model.natGatewayId;
            this.requestId = model.requestId;
            this.snatTableIds = model.snatTableIds;
        } 

        /**
         * <p>A list of DNAT entries.</p>
         */
        public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }

        /**
         * <p>A list of FULLNAT entries.</p>
         */
        public Builder fullNatTableIds(FullNatTableIds fullNatTableIds) {
            this.fullNatTableIds = fullNatTableIds;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-112za33e4****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of SNAT entries.</p>
         */
        public Builder snatTableIds(SnatTableIds snatTableIds) {
            this.snatTableIds = snatTableIds;
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
    /**
     * 
     * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNatGatewayResponseBody</p>
     */
    public static class FullNatTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullNatTableId")
        private java.util.List<String> fullNatTableId;

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
        public java.util.List<String> getFullNatTableId() {
            return this.fullNatTableId;
        }

        public static final class Builder {
            private java.util.List<String> fullNatTableId; 

            private Builder() {
            } 

            private Builder(FullNatTableIds model) {
                this.fullNatTableId = model.fullNatTableId;
            } 

            /**
             * FullNatTableId.
             */
            public Builder fullNatTableId(java.util.List<String> fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            public FullNatTableIds build() {
                return new FullNatTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNatGatewayResponseBody</p>
     */
    public static class SnatTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnatTableId")
        private java.util.List<String> snatTableId;

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
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

        public static final class Builder {
            private java.util.List<String> snatTableId; 

            private Builder() {
            } 

            private Builder(SnatTableIds model) {
                this.snatTableId = model.snatTableId;
            } 

            /**
             * SnatTableId.
             */
            public Builder snatTableId(java.util.List<String> snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            public SnatTableIds build() {
                return new SnatTableIds(this);
            } 

        } 

    }
}
