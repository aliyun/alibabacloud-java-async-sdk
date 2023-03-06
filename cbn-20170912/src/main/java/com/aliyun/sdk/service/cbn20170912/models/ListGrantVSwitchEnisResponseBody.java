// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGrantVSwitchEnisResponseBody} extends {@link TeaModel}
 *
 * <p>ListGrantVSwitchEnisResponseBody</p>
 */
public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    @NameInMap("GrantVSwitchEnis")
    private java.util.List < GrantVSwitchEnis> grantVSwitchEnis;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListGrantVSwitchEnisResponseBody(Builder builder) {
        this.grantVSwitchEnis = builder.grantVSwitchEnis;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGrantVSwitchEnisResponseBody create() {
        return builder().build();
    }

    /**
     * @return grantVSwitchEnis
     */
    public java.util.List < GrantVSwitchEnis> getGrantVSwitchEnis() {
        return this.grantVSwitchEnis;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < GrantVSwitchEnis> grantVSwitchEnis; 
        private String requestId; 
        private String totalCount; 

        /**
         * The list of ENIs.
         */
        public Builder grantVSwitchEnis(java.util.List < GrantVSwitchEnis> grantVSwitchEnis) {
            this.grantVSwitchEnis = grantVSwitchEnis;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGrantVSwitchEnisResponseBody build() {
            return new ListGrantVSwitchEnisResponseBody(this);
        } 

    } 

    public static class GrantVSwitchEnis extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("TransitRouterFlag")
        private Boolean transitRouterFlag;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private GrantVSwitchEnis(Builder builder) {
            this.description = builder.description;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.transitRouterFlag = builder.transitRouterFlag;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantVSwitchEnis create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return transitRouterFlag
         */
        public Boolean getTransitRouterFlag() {
            return this.transitRouterFlag;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String description; 
            private String networkInterfaceId; 
            private Boolean transitRouterFlag; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The description of the ENI.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Indicates whether the ENI is created by a transit router. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             * 
             * ENIs that are created by transit routers cannot be used as multicast sources or members.
             */
            public Builder transitRouterFlag(Boolean transitRouterFlag) {
                this.transitRouterFlag = transitRouterFlag;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public GrantVSwitchEnis build() {
                return new GrantVSwitchEnis(this);
            } 

        } 

    }
}
