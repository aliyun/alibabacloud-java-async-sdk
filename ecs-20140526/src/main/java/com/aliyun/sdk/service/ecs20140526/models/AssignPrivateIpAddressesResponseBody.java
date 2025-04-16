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
 * {@link AssignPrivateIpAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>AssignPrivateIpAddressesResponseBody</p>
 */
public class AssignPrivateIpAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssignedPrivateIpAddressesSet")
    private AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssignPrivateIpAddressesResponseBody(Builder builder) {
        this.assignedPrivateIpAddressesSet = builder.assignedPrivateIpAddressesSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignPrivateIpAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignedPrivateIpAddressesSet
     */
    public AssignedPrivateIpAddressesSet getAssignedPrivateIpAddressesSet() {
        return this.assignedPrivateIpAddressesSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssignPrivateIpAddressesResponseBody model) {
            this.assignedPrivateIpAddressesSet = model.assignedPrivateIpAddressesSet;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the ENI and the secondary private IP addresses that are assigned to the ENI.</p>
         */
        public Builder assignedPrivateIpAddressesSet(AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet) {
            this.assignedPrivateIpAddressesSet = assignedPrivateIpAddressesSet;
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

        public AssignPrivateIpAddressesResponseBody build() {
            return new AssignPrivateIpAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssignPrivateIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>AssignPrivateIpAddressesResponseBody</p>
     */
    public static class Ipv4PrefixSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Prefixes")
        private java.util.List<String> ipv4Prefixes;

        private Ipv4PrefixSet(Builder builder) {
            this.ipv4Prefixes = builder.ipv4Prefixes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4PrefixSet create() {
            return builder().build();
        }

        /**
         * @return ipv4Prefixes
         */
        public java.util.List<String> getIpv4Prefixes() {
            return this.ipv4Prefixes;
        }

        public static final class Builder {
            private java.util.List<String> ipv4Prefixes; 

            private Builder() {
            } 

            private Builder(Ipv4PrefixSet model) {
                this.ipv4Prefixes = model.ipv4Prefixes;
            } 

            /**
             * Ipv4Prefixes.
             */
            public Builder ipv4Prefixes(java.util.List<String> ipv4Prefixes) {
                this.ipv4Prefixes = ipv4Prefixes;
                return this;
            }

            public Ipv4PrefixSet build() {
                return new Ipv4PrefixSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssignPrivateIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>AssignPrivateIpAddressesResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private java.util.List<String> privateIpAddress;

        private PrivateIpSet(Builder builder) {
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSet create() {
            return builder().build();
        }

        /**
         * @return privateIpAddress
         */
        public java.util.List<String> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private java.util.List<String> privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpSet model) {
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(java.util.List<String> privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSet build() {
                return new PrivateIpSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssignPrivateIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>AssignPrivateIpAddressesResponseBody</p>
     */
    public static class AssignedPrivateIpAddressesSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4PrefixSet")
        private Ipv4PrefixSet ipv4PrefixSet;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSet")
        private PrivateIpSet privateIpSet;

        private AssignedPrivateIpAddressesSet(Builder builder) {
            this.ipv4PrefixSet = builder.ipv4PrefixSet;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpSet = builder.privateIpSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignedPrivateIpAddressesSet create() {
            return builder().build();
        }

        /**
         * @return ipv4PrefixSet
         */
        public Ipv4PrefixSet getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return privateIpSet
         */
        public PrivateIpSet getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private Ipv4PrefixSet ipv4PrefixSet; 
            private String networkInterfaceId; 
            private PrivateIpSet privateIpSet; 

            private Builder() {
            } 

            private Builder(AssignedPrivateIpAddressesSet model) {
                this.ipv4PrefixSet = model.ipv4PrefixSet;
                this.networkInterfaceId = model.networkInterfaceId;
                this.privateIpSet = model.privateIpSet;
            } 

            /**
             * <p>Details about the assigned IPv4 prefixes.</p>
             */
            public Builder ipv4PrefixSet(Ipv4PrefixSet ipv4PrefixSet) {
                this.ipv4PrefixSet = ipv4PrefixSet;
                return this;
            }

            /**
             * <p>The ENI ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp125p95hhdhn3ot****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The secondary private IP addresses that are assigned to the ENI.</p>
             */
            public Builder privateIpSet(PrivateIpSet privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public AssignedPrivateIpAddressesSet build() {
                return new AssignedPrivateIpAddressesSet(this);
            } 

        } 

    }
}
