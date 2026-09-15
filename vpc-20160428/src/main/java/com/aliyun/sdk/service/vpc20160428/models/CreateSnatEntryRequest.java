// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateSnatEntryRequest</p>
 */
public class CreateSnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipAffinity")
    private Integer eipAffinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    private String snatEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatIp")
    private String snatIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCIDR")
    private String sourceCIDR;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceVSwitchId")
    private String sourceVSwitchId;

    private CreateSnatEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.eipAffinity = builder.eipAffinity;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatTableId = builder.snatTableId;
        this.sourceCIDR = builder.sourceCIDR;
        this.sourceVSwitchId = builder.sourceVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnatEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return eipAffinity
     */
    public Integer getEipAffinity() {
        return this.eipAffinity;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return snatTableId
     */
    public String getSnatTableId() {
        return this.snatTableId;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return sourceVSwitchId
     */
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateSnatEntryRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Integer eipAffinity; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snatEntryName; 
        private String snatIp; 
        private String snatTableId; 
        private String sourceCIDR; 
        private String sourceVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnatEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.eipAffinity = request.eipAffinity;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.snatTableId = request.snatTableId;
            this.sourceCIDR = request.sourceCIDR;
            this.sourceVSwitchId = request.sourceVSwitchId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>ClientToken</code> value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without creating the SNAT entry. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a Normal request, and the SNAT entry is created after the check succeeds. A 2xx HTTP status code is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable EIP affinity. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): disables EIP affinity.</p>
         * </li>
         * <li><p><strong>1</strong>: enables EIP affinity.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After EIP affinity is enabled, if the SNAT entry is bindded with multiple EIPs or NAT IP addresses, the same client uses the same EIP or NAT IP address to access the same destination IP address. Otherwise, the client randomly selects an EIP or NAT IP address from the bindded ones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eipAffinity(Integer eipAffinity) {
            this.putQueryParameter("EipAffinity", eipAffinity);
            this.eipAffinity = eipAffinity;
            return this;
        }

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * <blockquote>
         * <p>The IPv4 address set of the ENI is used as the SNAT address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eni-gw8g131ef2dnbu3k****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway. </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The name of the SNAT entry.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SnatEntry-1</p>
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * <p>When you add an SNAT entry for an Internet NAT gateway:</p>
         * <ul>
         * <li><p>The SnatIp parameter is required.</p>
         * </li>
         * <li><p>This parameter specifies the EIPs in the SNAT entry. Separate multiple EIPs with commas (,).</p>
         * </li>
         * <li><p>If SnatIp specifies only one public IP address, the ECS instance uses the specified public IP address to access the Internet.</p>
         * </li>
         * <li><p>If SnatIp specifies multiple public IP addresses, the ECS instance randomly uses one of the public IP addresses in SnatIp to access the Internet.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify multiple EIPs to configure an SNAT IP IPAM pool, connections are allocated to multiple EIPs by using a hash algorithm. Because the traffic of each connection varies, service traffic may be unevenly distributed among the EIPs. Add each EIP to the same Internet Shared Bandwidth instance to prevent service interruptions caused by bandwidth exhaustion on a single EIP.</p>
         * </blockquote>
         * <p>When you add an SNAT entry for a VPC NAT gateway:</p>
         * <ul>
         * <li><p>This parameter specifies the NAT IP addresses in the SNAT entry. Separate multiple NAT IP addresses with commas (,).</p>
         * </li>
         * <li><p>You must specify one of the SnatIp and NetworkInterfaceId parameters, but you cannot specify both.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * <p>The ID of the SNAT table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stb-bp190wu8io1vgev****</p>
         */
        public Builder snatTableId(String snatTableId) {
            this.putQueryParameter("SnatTableId", snatTableId);
            this.snatTableId = snatTableId;
            return this;
        }

        /**
         * <p>The CIDR block of a VPC, vSwitch, or ECS instance. You can also specify a custom CIDR block.</p>
         * <p>SNAT entries support the following granularities: </p>
         * <ul>
         * <li><p>VPC granularity: the CIDR block of the VPC to which the NAT gateway belongs. All ECS instances in the VPC can access the Internet or external networks by using the SNAT rule.</p>
         * </li>
         * <li><p>vSwitch granularity: the CIDR block of a specified vSwitch (such as 192.168.1.0/24). ECS instances in the vSwitch can access the Internet or external networks by using the SNAT rule.</p>
         * </li>
         * <li><p>ECS granularity: the IP address of a specified ECS instance (such as 192.168.1.1/32). The ECS instance can access the Internet or external networks by using the SNAT rule.</p>
         * </li>
         * <li><p>Custom CIDR block: all ECS instances in the specified CIDR block can access the Internet or external networks by using the SNAT service.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify one of the <strong>SourceCIDR</strong> and <strong>SourceVSwitchId</strong> parameters, but you cannot specify both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24</p>
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * <ul>
         * <li><p>When you add an SNAT entry for an Internet NAT gateway, this parameter specifies that ECS instances in the vSwitch can access the Internet by using the SNAT rule. If you specify multiple EIPs to configure an SNAT IP IPAM pool, connections are allocated to multiple EIPs by using a hash algorithm. Because the traffic of each connection varies, service traffic may be unevenly distributed among the EIPs. Add each EIP to the same Internet Shared Bandwidth instance to prevent service interruptions caused by bandwidth exhaustion on a single EIP.</p>
         * </li>
         * <li><p>When you add an SNAT entry for a VPC NAT gateway, this parameter specifies that ECS instances in the vSwitch can access external networks by using the SNAT rule.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify one of the <strong>SourceCIDR</strong> and <strong>SourceVSwitchId</strong> parameters, but you cannot specify both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1nhx2s9ui5o****</p>
         */
        public Builder sourceVSwitchId(String sourceVSwitchId) {
            this.putQueryParameter("SourceVSwitchId", sourceVSwitchId);
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }

        @Override
        public CreateSnatEntryRequest build() {
            return new CreateSnatEntryRequest(this);
        } 

    } 

}
