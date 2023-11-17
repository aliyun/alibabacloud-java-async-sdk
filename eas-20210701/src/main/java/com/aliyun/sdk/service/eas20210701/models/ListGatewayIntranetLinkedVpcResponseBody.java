// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayIntranetLinkedVpcResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayIntranetLinkedVpcResponseBody</p>
 */
public class ListGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    @NameInMap("GatewayId")
    private String gatewayId;

    @NameInMap("IntranetLinkedVpcList")
    private java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList;

    @NameInMap("RequestId")
    private String requestId;

    private ListGatewayIntranetLinkedVpcResponseBody(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.intranetLinkedVpcList = builder.intranetLinkedVpcList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetLinkedVpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return intranetLinkedVpcList
     */
    public java.util.List < IntranetLinkedVpcList> getIntranetLinkedVpcList() {
        return this.intranetLinkedVpcList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gatewayId; 
        private java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList; 
        private String requestId; 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IntranetLinkedVpcList.
         */
        public Builder intranetLinkedVpcList(java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList) {
            this.intranetLinkedVpcList = intranetLinkedVpcList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayIntranetLinkedVpcResponseBody build() {
            return new ListGatewayIntranetLinkedVpcResponseBody(this);
        } 

    } 

    public static class IntranetLinkedVpcList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private IntranetLinkedVpcList(Builder builder) {
            this.ip = builder.ip;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetLinkedVpcList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String ip; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IntranetLinkedVpcList build() {
                return new IntranetLinkedVpcList(this);
            } 

        } 

    }
}
