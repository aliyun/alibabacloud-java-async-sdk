// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDLinkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceDLinkResponseBody</p>
 */
public class DescribeResourceDLinkResponseBody extends TeaModel {
    @NameInMap("AuxVSwitchList")
    private java.util.List < String > auxVSwitchList;

    @NameInMap("DestinationCIDRs")
    private String destinationCIDRs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
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
         * AuxVSwitchList.
         */
        public Builder auxVSwitchList(java.util.List < String > auxVSwitchList) {
            this.auxVSwitchList = auxVSwitchList;
            return this;
        }

        /**
         * DestinationCIDRs.
         */
        public Builder destinationCIDRs(String destinationCIDRs) {
            this.destinationCIDRs = destinationCIDRs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeResourceDLinkResponseBody build() {
            return new DescribeResourceDLinkResponseBody(this);
        } 

    } 

}
