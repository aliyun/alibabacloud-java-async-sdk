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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-12345</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>The name of the access instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>119898001566xxxx</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-1nmi412c28c374****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The type of the Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>internet</strong></p>
         * </li>
         * <li><p><strong>vpc</strong></p>
         * </li>
         * <li><p><strong>nat</strong></p>
         * </li>
         * </ul>
         */
        public Builder firewallType(java.util.List<String> firewallType) {
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The time when the endpoint was created. This is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715075765</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The IP protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The primary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder primaryDns(String primaryDns) {
            this.primaryDns = primaryDns;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vbno9zxz8j9qiot****</p>
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * <p>The IP address of the primary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        public Builder primaryVSwitchIp(String primaryVSwitchIp) {
            this.primaryVSwitchIp = primaryVSwitchIp;
            return this;
        }

        /**
         * <p>The zone of the primary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-d</p>
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>The type of the private DNS. Valid values:</p>
         * <ul>
         * <li><p><strong>PrivateZone</strong></p>
         * </li>
         * <li><p><strong>Custom</strong> (Default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder privateDnsType(String privateDnsType) {
            this.privateDnsType = privateDnsType;
            return this;
        }

        /**
         * <p>The ID of the region where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E7F94C7-781F-5192-86CF-DB0850****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The standby DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.2</p>
         */
        public Builder standbyDns(String standbyDns) {
            this.standbyDns = standbyDns;
            return this;
        }

        /**
         * <p>The ID of the standby vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb6jk75wfcwnuq****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The IP address of the standby vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.2</p>
         */
        public Builder standbyVSwitchIp(String standbyVSwitchIp) {
            this.standbyVSwitchIp = standbyVSwitchIp;
            return this;
        }

        /**
         * <p>The zone of the standby vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p><strong>creating</strong>: Creating.</p>
         * </li>
         * <li><p><strong>deleting</strong>: Deleting.</p>
         * </li>
         * <li><p><strong>normal</strong>: Normal.</p>
         * </li>
         * <li><p><strong>updating</strong>: Updating.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6b5lyul0x******</p>
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
