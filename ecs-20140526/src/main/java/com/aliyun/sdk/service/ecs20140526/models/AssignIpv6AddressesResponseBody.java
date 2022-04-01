// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignIpv6AddressesResponseBody} extends {@link TeaModel}
 *
 * <p>AssignIpv6AddressesResponseBody</p>
 */
public class AssignIpv6AddressesResponseBody extends TeaModel {
    @NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @NameInMap("RequestId")
    private String requestId;

    private AssignIpv6AddressesResponseBody(Builder builder) {
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
        private Ipv6Sets ipv6Sets; 
        private String networkInterfaceId; 
        private String requestId; 

        /**
         * Ipv6Sets.
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        /**
         * NetworkInterfaceId.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignIpv6AddressesResponseBody build() {
            return new AssignIpv6AddressesResponseBody(this);
        } 

    } 

    public static class Ipv6Sets extends TeaModel {
        @NameInMap("Ipv6Address")
        private java.util.List < String > ipv6Address;

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
        public java.util.List < String > getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private java.util.List < String > ipv6Address; 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(java.util.List < String > ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
}
