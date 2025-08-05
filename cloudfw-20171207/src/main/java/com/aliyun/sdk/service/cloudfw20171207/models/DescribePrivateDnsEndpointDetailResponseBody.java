// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrivateDnsEndpointDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrivateDnsEndpointDetailResponseBody</p>
 */
public class DescribePrivateDnsEndpointDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    private String accessInstanceId;

    @com.aliyun.core.annotation.NameInMap("AccessInstanceName")
    private String accessInstanceName;

    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private java.util.List<String> firewallType;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("PrimaryDns")
    private String primaryDns;

    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchIp")
    private String primaryVSwitchIp;

    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @com.aliyun.core.annotation.NameInMap("PrivateDnsType")
    private String privateDnsType;

    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandbyDns")
    private String standbyDns;

    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchIp")
    private String standbyVSwitchIp;

    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribePrivateDnsEndpointDetailResponseBody(Builder builder) {
        this.accessInstanceId = builder.accessInstanceId;
        this.accessInstanceName = builder.accessInstanceName;
        this.aliUid = builder.aliUid;
        this.endpointId = builder.endpointId;
        this.firewallType = builder.firewallType;
        this.gmtCreate = builder.gmtCreate;
        this.ipProtocol = builder.ipProtocol;
        this.memberUid = builder.memberUid;
        this.port = builder.port;
        this.primaryDns = builder.primaryDns;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryVSwitchIp = builder.primaryVSwitchIp;
        this.primaryZoneId = builder.primaryZoneId;
        this.privateDnsType = builder.privateDnsType;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.standbyDns = builder.standbyDns;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyVSwitchIp = builder.standbyVSwitchIp;
        this.standbyZoneId = builder.standbyZoneId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsEndpointDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return accessInstanceName
     */
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return firewallType
     */
    public java.util.List<String> getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return this.primaryDns;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return primaryVSwitchIp
     */
    public String getPrimaryVSwitchIp() {
        return this.primaryVSwitchIp;
    }

    /**
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    /**
     * @return privateDnsType
     */
    public String getPrivateDnsType() {
        return this.privateDnsType;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standbyDns
     */
    public String getStandbyDns() {
        return this.standbyDns;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyVSwitchIp
     */
    public String getStandbyVSwitchIp() {
        return this.standbyVSwitchIp;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String accessInstanceId; 
        private String accessInstanceName; 
        private Long aliUid; 
        private String endpointId; 
        private java.util.List<String> firewallType; 
        private Long gmtCreate; 
        private String ipProtocol; 
        private Long memberUid; 
        private Integer port; 
        private String primaryDns; 
        private String primaryVSwitchId; 
        private String primaryVSwitchIp; 
        private String primaryZoneId; 
        private String privateDnsType; 
        private String regionNo; 
        private String requestId; 
        private String standbyDns; 
        private String standbyVSwitchId; 
        private String standbyVSwitchIp; 
        private String standbyZoneId; 
        private String status; 
        private String taskId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribePrivateDnsEndpointDetailResponseBody model) {
            this.accessInstanceId = model.accessInstanceId;
            this.accessInstanceName = model.accessInstanceName;
            this.aliUid = model.aliUid;
            this.endpointId = model.endpointId;
            this.firewallType = model.firewallType;
            this.gmtCreate = model.gmtCreate;
            this.ipProtocol = model.ipProtocol;
            this.memberUid = model.memberUid;
            this.port = model.port;
            this.primaryDns = model.primaryDns;
            this.primaryVSwitchId = model.primaryVSwitchId;
            this.primaryVSwitchIp = model.primaryVSwitchIp;
            this.primaryZoneId = model.primaryZoneId;
            this.privateDnsType = model.privateDnsType;
            this.regionNo = model.regionNo;
            this.requestId = model.requestId;
            this.standbyDns = model.standbyDns;
            this.standbyVSwitchId = model.standbyVSwitchId;
            this.standbyVSwitchIp = model.standbyVSwitchIp;
            this.standbyZoneId = model.standbyZoneId;
            this.status = model.status;
            this.taskId = model.taskId;
            this.vpcId = model.vpcId;
        } 

        /**
         * AccessInstanceId.
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * AccessInstanceName.
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * FirewallType.
         */
        public Builder firewallType(java.util.List<String> firewallType) {
            this.firewallType = firewallType;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * PrimaryDns.
         */
        public Builder primaryDns(String primaryDns) {
            this.primaryDns = primaryDns;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryVSwitchIp.
         */
        public Builder primaryVSwitchIp(String primaryVSwitchIp) {
            this.primaryVSwitchIp = primaryVSwitchIp;
            return this;
        }

        /**
         * PrimaryZoneId.
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * PrivateDnsType.
         */
        public Builder privateDnsType(String privateDnsType) {
            this.privateDnsType = privateDnsType;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
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
         * StandbyDns.
         */
        public Builder standbyDns(String standbyDns) {
            this.standbyDns = standbyDns;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyVSwitchIp.
         */
        public Builder standbyVSwitchIp(String standbyVSwitchIp) {
            this.standbyVSwitchIp = standbyVSwitchIp;
            return this;
        }

        /**
         * StandbyZoneId.
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribePrivateDnsEndpointDetailResponseBody build() {
            return new DescribePrivateDnsEndpointDetailResponseBody(this);
        } 

    } 

}
