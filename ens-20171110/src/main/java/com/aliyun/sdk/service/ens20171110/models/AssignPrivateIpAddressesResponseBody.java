// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Details about the ENI and the secondary private IP addresses that are assigned to the ENI.
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

    public static class AssignedPrivateIpAddressesSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSet")
        private java.util.List < String > privateIpSet;

        private AssignedPrivateIpAddressesSet(Builder builder) {
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
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return privateIpSet
         */
        public java.util.List < String > getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private String networkInterfaceId; 
            private java.util.List < String > privateIpSet; 

            /**
             * The ID of the ENI.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The secondary private IP addresses that are assigned to the ENI.
             */
            public Builder privateIpSet(java.util.List < String > privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public AssignedPrivateIpAddressesSet build() {
                return new AssignedPrivateIpAddressesSet(this);
            } 

        } 

    }
}
