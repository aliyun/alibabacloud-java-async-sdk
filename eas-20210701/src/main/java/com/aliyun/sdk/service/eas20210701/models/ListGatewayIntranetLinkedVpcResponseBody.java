// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListGatewayIntranetLinkedVpcResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayIntranetLinkedVpcResponseBody</p>
 */
public class ListGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("IntranetLinkedVpcList")
    private java.util.List<IntranetLinkedVpcList> intranetLinkedVpcList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<IntranetLinkedVpcList> getIntranetLinkedVpcList() {
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
        private java.util.List<IntranetLinkedVpcList> intranetLinkedVpcList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayIntranetLinkedVpcResponseBody model) {
            this.gatewayId = model.gatewayId;
            this.intranetLinkedVpcList = model.intranetLinkedVpcList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The private gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The internal endpoints.</p>
         */
        public Builder intranetLinkedVpcList(java.util.List<IntranetLinkedVpcList> intranetLinkedVpcList) {
            this.intranetLinkedVpcList = intranetLinkedVpcList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayIntranetLinkedVpcResponseBody build() {
            return new ListGatewayIntranetLinkedVpcResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayIntranetLinkedVpcResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayIntranetLinkedVpcResponseBody</p>
     */
    public static class IntranetLinkedVpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthoritativeDnsEnabled")
        private Boolean authoritativeDnsEnabled;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IntranetLinkedVpcList(Builder builder) {
            this.authoritativeDnsEnabled = builder.authoritativeDnsEnabled;
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
         * @return authoritativeDnsEnabled
         */
        public Boolean getAuthoritativeDnsEnabled() {
            return this.authoritativeDnsEnabled;
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
            private Boolean authoritativeDnsEnabled; 
            private String ip; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(IntranetLinkedVpcList model) {
                this.authoritativeDnsEnabled = model.authoritativeDnsEnabled;
                this.ip = model.ip;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * AuthoritativeDnsEnabled.
             */
            public Builder authoritativeDnsEnabled(Boolean authoritativeDnsEnabled) {
                this.authoritativeDnsEnabled = authoritativeDnsEnabled;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.11</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze4pgstgszvgq******</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The state of the private gateway.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Creating</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>The private gateway is being created.</p>
             * <!-- -->
             * </li>
             * <li><p>Running</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>The private gateway is running.</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-8vb2qjoiio6m9pg******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zetuli9ws0qgjd******</p>
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
