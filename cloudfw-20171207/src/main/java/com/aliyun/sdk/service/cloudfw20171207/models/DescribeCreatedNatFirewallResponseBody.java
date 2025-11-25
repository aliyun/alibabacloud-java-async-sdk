// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeCreatedNatFirewallResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreatedNatFirewallResponseBody</p>
 */
public class DescribeCreatedNatFirewallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedNatFirewalls")
    private java.util.List<CreatedNatFirewalls> createdNatFirewalls;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCreatedNatFirewallResponseBody(Builder builder) {
        this.createdNatFirewalls = builder.createdNatFirewalls;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreatedNatFirewallResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdNatFirewalls
     */
    public java.util.List<CreatedNatFirewalls> getCreatedNatFirewalls() {
        return this.createdNatFirewalls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CreatedNatFirewalls> createdNatFirewalls; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCreatedNatFirewallResponseBody model) {
            this.createdNatFirewalls = model.createdNatFirewalls;
            this.requestId = model.requestId;
        } 

        /**
         * CreatedNatFirewalls.
         */
        public Builder createdNatFirewalls(java.util.List<CreatedNatFirewalls> createdNatFirewalls) {
            this.createdNatFirewalls = createdNatFirewalls;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCreatedNatFirewallResponseBody build() {
            return new DescribeCreatedNatFirewallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreatedNatFirewallResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreatedNatFirewallResponseBody</p>
     */
    public static class CreatedNatFirewalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatFirewallId")
        private String natFirewallId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        private CreatedNatFirewalls(Builder builder) {
            this.natFirewallId = builder.natFirewallId;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatedNatFirewalls create() {
            return builder().build();
        }

        /**
         * @return natFirewallId
         */
        public String getNatFirewallId() {
            return this.natFirewallId;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public static final class Builder {
            private String natFirewallId; 
            private String natGatewayId; 
            private String natGatewayName; 

            private Builder() {
            } 

            private Builder(CreatedNatFirewalls model) {
                this.natFirewallId = model.natFirewallId;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
            } 

            /**
             * NatFirewallId.
             */
            public Builder natFirewallId(String natFirewallId) {
                this.natFirewallId = natFirewallId;
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
             * NatGatewayName.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            public CreatedNatFirewalls build() {
                return new CreatedNatFirewalls(this);
            } 

        } 

    }
}
