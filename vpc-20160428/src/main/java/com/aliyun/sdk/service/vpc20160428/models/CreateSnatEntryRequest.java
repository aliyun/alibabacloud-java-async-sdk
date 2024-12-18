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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>client token</code> can contain only ASCII characters.</p>
         * <p>**</p>
         * <p><strong>Description</strong> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable EIP affinity. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <p>**</p>
         * <p><strong>Description</strong> After you enable EIP affinity, if multiple EIPs are associated with an SNAT entry, each client uses one EIP to access the Internet. If EIP affinity is disabled, each client uses a random EIP to access the Internet.</p>
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
         * NetworkInterfaceId.
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
         * <p>The region ID of the NAT gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ap-northeast-2-pop</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>ap-northeast-2-pop</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
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
         * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <ul>
         * <li>The EIPs in the SNAT entry when you add an SNAT entry to an Internet NAT gateway. Separate EIPs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p> If you specify multiple EIPs in the SNAT IP address pool, the service connection is allocated to multiple EIPs by using the hashing algorithm. The traffic of each EIP may be different. Therefore, we recommend that you associate the EIPs with an Internet Shared Bandwidth instance to prevent service interruptions caused by bandwidth exhaustion.</p>
         * </blockquote>
         * <ul>
         * <li>When you add SNAT entries for a VPC NAT gateway, this parameter specifies the NAT IP addresses in the SNAT entry. Separate multiple NAT IP addresses with commas (,).</li>
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
         * <p>You can specify the CIDR block of a VPC, a vSwitch, or an ECS instance or enter a custom CIDR block.</p>
         * <p>You can specify an SNAT entry in the following ways:</p>
         * <ul>
         * <li>You can specify the CIDR block of the VPC where the NAT gateway is deployed. Then, all ECS instances in the VPC can access the Internet or external networks by using SNAT.</li>
         * <li>You can specify the CIDR block of a vSwitch, for example, 192.168.1.0/24. Then, the ECS instances in the vSwitch can access the Internet or external networks by using SNAT.</li>
         * <li>You can specify the IP address of an ECS instance, for example, 192.168.1.1/32. Then, the ECS instance can access the Internet or external networks by using SNAT.</li>
         * <li>You can specify a custom CIDR block. Then, all ECS instances within the specified CIDR block can access the Internet or external networks by using SNAT.</li>
         * </ul>
         * <p>When you add an SNAT entry to an Internet NAT gateway, if <strong>SnatIp</strong> is set to an EIP, the ECS instance uses the specified EIP to access the Internet.</p>
         * <p>If <strong>SnatIp</strong> is set to multiple EIPs, the ECS instance randomly selects an EIP specified in the <strong>SnatIp</strong> parameter to access the Internet.</p>
         * <p>You cannot specify this parameter and <strong>SourceVSwtichId</strong> at the same time. If <strong>SourceVSwitchId</strong> is specified, you cannot specify <strong>SourceCIDR</strong>. If <strong>SourceCIDR</strong> is specified, you cannot specify <strong>SourceVSwitchId</strong>.</p>
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
         * <li>When you add an SNAT entry to an Internet NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access the Internet. If you select multiple elastic IP addresses (EIPs) to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic that passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limits on individual EIPs.</li>
         * <li>When you add an SNAT entry to a VPC NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access external networks.</li>
         * </ul>
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
