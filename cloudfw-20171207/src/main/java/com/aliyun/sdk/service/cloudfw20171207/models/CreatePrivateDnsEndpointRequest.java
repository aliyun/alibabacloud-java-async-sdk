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
 * {@link CreatePrivateDnsEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateDnsEndpointRequest</p>
 */
public class CreatePrivateDnsEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryDns")
    private String primaryDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchIp")
    private String primaryVSwitchIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateDnsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privateDnsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyDns")
    private String standbyDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchIp")
    private String standbyVSwitchIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreatePrivateDnsEndpointRequest(Builder builder) {
        super(builder);
        this.accessInstanceName = builder.accessInstanceName;
        this.firewallType = builder.firewallType;
        this.ipProtocol = builder.ipProtocol;
        this.memberUid = builder.memberUid;
        this.port = builder.port;
        this.primaryDns = builder.primaryDns;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryVSwitchIp = builder.primaryVSwitchIp;
        this.privateDnsType = builder.privateDnsType;
        this.regionNo = builder.regionNo;
        this.standbyDns = builder.standbyDns;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyVSwitchIp = builder.standbyVSwitchIp;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateDnsEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceName
     */
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    /**
     * @return firewallType
     */
    public java.util.List<String> getFirewallType() {
        return this.firewallType;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreatePrivateDnsEndpointRequest, Builder> {
        private String accessInstanceName; 
        private java.util.List<String> firewallType; 
        private String ipProtocol; 
        private Long memberUid; 
        private Integer port; 
        private String primaryDns; 
        private String primaryVSwitchId; 
        private String primaryVSwitchIp; 
        private String privateDnsType; 
        private String regionNo; 
        private String standbyDns; 
        private String standbyVSwitchId; 
        private String standbyVSwitchIp; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateDnsEndpointRequest request) {
            super(request);
            this.accessInstanceName = request.accessInstanceName;
            this.firewallType = request.firewallType;
            this.ipProtocol = request.ipProtocol;
            this.memberUid = request.memberUid;
            this.port = request.port;
            this.primaryDns = request.primaryDns;
            this.primaryVSwitchId = request.primaryVSwitchId;
            this.primaryVSwitchIp = request.primaryVSwitchIp;
            this.privateDnsType = request.privateDnsType;
            this.regionNo = request.regionNo;
            this.standbyDns = request.standbyDns;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyVSwitchIp = request.standbyVSwitchIp;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The name of the private instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.putQueryParameter("AccessInstanceName", accessInstanceName);
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * <p>The type of the cloud firewall. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong></li>
         * <li><strong>vpc</strong></li>
         * <li><strong>nat</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder firewallType(java.util.List<String> firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The IP protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
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
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The primary DNS server.</p>
         * <blockquote>
         * <p>When PrivateDnsType is set to Custom, you must specify PrimaryDns and StandbyDns.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder primaryDns(String primaryDns) {
            this.putQueryParameter("PrimaryDns", primaryDns);
            this.primaryDns = primaryDns;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch. The zone of PrimaryVSwitchId and StandbyVSwitchId must be a zone that supports private DNS. Otherwise, an error is returned. The region must also be in the supported list.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6b0dkyryer8******</p>
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
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
            this.putQueryParameter("PrimaryVSwitchIp", primaryVSwitchIp);
            this.primaryVSwitchIp = primaryVSwitchIp;
            return this;
        }

        /**
         * <p>The type of private DNS. When PrivateDnsType is set to Custom, Port and IpProtocol are required. When PrivateDnsType is set to PrivateZone, the backend automatically sets the port to 53 and uses the default protocol. Valid values:</p>
         * <ul>
         * <li><strong>PrivateZone</strong></li>
         * <li><strong>Custom</strong> (default)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder privateDnsType(String privateDnsType) {
            this.putQueryParameter("PrivateDnsType", privateDnsType);
            this.privateDnsType = privateDnsType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The secondary DNS server.</p>
         * <blockquote>
         * <p>When PrivateDnsType is set to Custom, you must specify PrimaryDns and StandbyDns.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.2</p>
         */
        public Builder standbyDns(String standbyDns) {
            this.putQueryParameter("StandbyDns", standbyDns);
            this.standbyDns = standbyDns;
            return this;
        }

        /**
         * <p>The ID of the secondary vSwitch. The zone of PrimaryVSwitchId and StandbyVSwitchId must be a zone that supports private DNS. Otherwise, error code -200534 is returned. The region must also be in the supported list.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb6jk75wfcwn******</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The IP address of the secondary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>10.2.2.2</p>
         */
        public Builder standbyVSwitchIp(String standbyVSwitchIp) {
            this.putQueryParameter("StandbyVSwitchIp", standbyVSwitchIp);
            this.standbyVSwitchIp = standbyVSwitchIp;
            return this;
        }

        /**
         * <p>The instance ID of the VPC-connected instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6b5lyul0x******</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreatePrivateDnsEndpointRequest build() {
            return new CreatePrivateDnsEndpointRequest(this);
        } 

    } 

}
