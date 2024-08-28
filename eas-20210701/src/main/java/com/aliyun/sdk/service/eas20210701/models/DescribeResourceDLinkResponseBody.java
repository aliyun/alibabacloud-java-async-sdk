// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDLinkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceDLinkResponseBody</p>
 */
public class DescribeResourceDLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuxVSwitchList")
    private java.util.List < String > auxVSwitchList;

    @com.aliyun.core.annotation.NameInMap("DestinationCIDRs")
    private String destinationCIDRs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeResourceDLinkResponseBody(Builder builder) {
        this.auxVSwitchList = builder.auxVSwitchList;
        this.destinationCIDRs = builder.destinationCIDRs;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceDLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return auxVSwitchList
     */
    public java.util.List < String > getAuxVSwitchList() {
        return this.auxVSwitchList;
    }

    /**
     * @return destinationCIDRs
     */
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
        private java.util.List < String > auxVSwitchList; 
        private String destinationCIDRs; 
        private String requestId; 
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * The IDs of the secondary vSwitches that are directly connected.
         */
        public Builder auxVSwitchList(java.util.List < String > auxVSwitchList) {
            this.auxVSwitchList = auxVSwitchList;
            return this;
        }

        /**
         * The CIDR blocks of the clients that you want to connect to. After this parameter is specified, the CIDR blocks are added to the back-to-origin route of the server. Either this parameter or the VSwitchIdList parameter can be used to determine CIDR blocks.
         */
        public Builder destinationCIDRs(String destinationCIDRs) {
            this.destinationCIDRs = destinationCIDRs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the security group that is directly connected.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The ID of the primary vSwitch that is directly connected.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the VPC that is directly connected.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeResourceDLinkResponseBody build() {
            return new DescribeResourceDLinkResponseBody(this);
        } 

    } 

}
