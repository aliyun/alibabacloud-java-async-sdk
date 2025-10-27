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
         * <p>This parameter is required.</p>
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.putQueryParameter("AccessInstanceName", accessInstanceName);
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder firewallType(java.util.List<String> firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * PrimaryDns.
         */
        public Builder primaryDns(String primaryDns) {
            this.putQueryParameter("PrimaryDns", primaryDns);
            this.primaryDns = primaryDns;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryVSwitchIp.
         */
        public Builder primaryVSwitchIp(String primaryVSwitchIp) {
            this.putQueryParameter("PrimaryVSwitchIp", primaryVSwitchIp);
            this.primaryVSwitchIp = primaryVSwitchIp;
            return this;
        }

        /**
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
         * StandbyDns.
         */
        public Builder standbyDns(String standbyDns) {
            this.putQueryParameter("StandbyDns", standbyDns);
            this.standbyDns = standbyDns;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyVSwitchIp.
         */
        public Builder standbyVSwitchIp(String standbyVSwitchIp) {
            this.putQueryParameter("StandbyVSwitchIp", standbyVSwitchIp);
            this.standbyVSwitchIp = standbyVSwitchIp;
            return this;
        }

        /**
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
