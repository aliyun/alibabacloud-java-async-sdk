// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignPrivateIpAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>AssignPrivateIpAddressesResponseBody</p>
 */
public class AssignPrivateIpAddressesResponseBody extends TeaModel {
    @NameInMap("AssignedPrivateIpAddressesSet")
    private AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

    @NameInMap("RequestId")
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

        /**
         * Details about the ENI.
         */
        public Builder assignedPrivateIpAddressesSet(AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet) {
            this.assignedPrivateIpAddressesSet = assignedPrivateIpAddressesSet;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignPrivateIpAddressesResponseBody build() {
            return new AssignPrivateIpAddressesResponseBody(this);
        } 

    } 

    public static class Ipv4PrefixSet extends TeaModel {
        @NameInMap("Ipv4Prefixes")
        private java.util.List < String > ipv4Prefixes;

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
        public java.util.List < String > getIpv4Prefixes() {
            return this.ipv4Prefixes;
        }

        public static final class Builder {
            private java.util.List < String > ipv4Prefixes; 

            /**
             * Ipv4Prefixes.
             */
            public Builder ipv4Prefixes(java.util.List < String > ipv4Prefixes) {
                this.ipv4Prefixes = ipv4Prefixes;
                return this;
            }

            public Ipv4PrefixSet build() {
                return new Ipv4PrefixSet(this);
            } 

        } 

    }
    public static class PrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        private java.util.List < String > privateIpAddress;

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
        public java.util.List < String > getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private java.util.List < String > privateIpAddress; 

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSet build() {
                return new PrivateIpSet(this);
            } 

        } 

    }
    public static class AssignedPrivateIpAddressesSet extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        private Ipv4PrefixSet ipv4PrefixSet;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("PrivateIpSet")
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

            /**
             * > This parameter is in invitational preview and is unavailable to general users.
             */
            public Builder ipv4PrefixSet(Ipv4PrefixSet ipv4PrefixSet) {
                this.ipv4PrefixSet = ipv4PrefixSet;
                return this;
            }

            /**
             * The ID of the ENI.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The private IP addresses assigned to the ENI.
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
