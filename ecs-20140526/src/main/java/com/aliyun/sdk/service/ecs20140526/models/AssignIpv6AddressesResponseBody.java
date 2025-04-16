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
 * {@link AssignIpv6AddressesResponseBody} extends {@link TeaModel}
 *
 * <p>AssignIpv6AddressesResponseBody</p>
 */
public class AssignIpv6AddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6PrefixSets")
    private Ipv6PrefixSets ipv6PrefixSets;

    @com.aliyun.core.annotation.NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssignIpv6AddressesResponseBody(Builder builder) {
        this.ipv6PrefixSets = builder.ipv6PrefixSets;
        this.ipv6Sets = builder.ipv6Sets;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignIpv6AddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv6PrefixSets
     */
    public Ipv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    /**
     * @return ipv6Sets
     */
    public Ipv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Ipv6PrefixSets ipv6PrefixSets; 
        private Ipv6Sets ipv6Sets; 
        private String networkInterfaceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssignIpv6AddressesResponseBody model) {
            this.ipv6PrefixSets = model.ipv6PrefixSets;
            this.ipv6Sets = model.ipv6Sets;
            this.networkInterfaceId = model.networkInterfaceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IPv6 prefixes of the ENI.</p>
         */
        public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }

        /**
         * <p>The IPv6 addresses assigned to the ENI.</p>
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        /**
         * <p>The ENI ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1iqejowblx6h8j****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignIpv6AddressesResponseBody build() {
            return new AssignIpv6AddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssignIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>AssignIpv6AddressesResponseBody</p>
     */
    public static class Ipv6PrefixSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Prefix")
        private java.util.List<String> ipv6Prefix;

        private Ipv6PrefixSets(Builder builder) {
            this.ipv6Prefix = builder.ipv6Prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6PrefixSets create() {
            return builder().build();
        }

        /**
         * @return ipv6Prefix
         */
        public java.util.List<String> getIpv6Prefix() {
            return this.ipv6Prefix;
        }

        public static final class Builder {
            private java.util.List<String> ipv6Prefix; 

            private Builder() {
            } 

            private Builder(Ipv6PrefixSets model) {
                this.ipv6Prefix = model.ipv6Prefix;
            } 

            /**
             * Ipv6Prefix.
             */
            public Builder ipv6Prefix(java.util.List<String> ipv6Prefix) {
                this.ipv6Prefix = ipv6Prefix;
                return this;
            }

            public Ipv6PrefixSets build() {
                return new Ipv6PrefixSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssignIpv6AddressesResponseBody} extends {@link TeaModel}
     *
     * <p>AssignIpv6AddressesResponseBody</p>
     */
    public static class Ipv6Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private java.util.List<String> ipv6Address;

        private Ipv6Sets(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Sets create() {
            return builder().build();
        }

        /**
         * @return ipv6Address
         */
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private java.util.List<String> ipv6Address; 

            private Builder() {
            } 

            private Builder(Ipv6Sets model) {
                this.ipv6Address = model.ipv6Address;
            } 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(java.util.List<String> ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
}
