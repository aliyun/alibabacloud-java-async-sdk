// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateSnatEntryRequest</p>
 */
public class CreateSnatEntryRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EipAffinity")
    private Integer eipAffinity;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SnatEntryName")
    private String snatEntryName;

    @Query
    @NameInMap("SnatIp")
    @Validation(required = true)
    private String snatIp;

    @Query
    @NameInMap("SnatTableId")
    @Validation(required = true)
    private String snatTableId;

    @Query
    @NameInMap("SourceCIDR")
    private String sourceCIDR;

    @Query
    @NameInMap("SourceVSwitchId")
    private String sourceVSwitchId;

    private CreateSnatEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.eipAffinity = builder.eipAffinity;
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
     * @return eipAffinity
     */
    public Integer getEipAffinity() {
        return this.eipAffinity;
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
        private Integer eipAffinity; 
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
            this.eipAffinity = request.eipAffinity;
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
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. `The token can contain only ASCII characters.`
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable EIP affinity. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         * 
         * >  If EIP affinity is enabled and the SNAT entry is associated with multiple EIPs, a client uses the same EIP to access the Internet. Otherwise, the client uses an EIP selected from the associated EIPs to access the Internet.
         */
        public Builder eipAffinity(Integer eipAffinity) {
            this.putQueryParameter("EipAffinity", eipAffinity);
            this.eipAffinity = eipAffinity;
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
         * The ID of the region where the NAT gateway is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * Enter a name for the SNAT entry.
         * <p>
         * 
         * The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * *   The EIPs in the SNAT entry when you add an SNAT entry to an Internet NAT gateway. Separate EIPs with commas (,).
         * <p>
         * 
         * >  If you select multiple EIPs to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic that passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limit of an individual EIP.
         * 
         * *   When you add an SNAT entry to a VPC NAT gateway, this parameter specifies the NAT IP address in the SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The ID of the SNAT table.
         */
        public Builder snatTableId(String snatTableId) {
            this.putQueryParameter("SnatTableId", snatTableId);
            this.snatTableId = snatTableId;
            return this;
        }

        /**
         * You can specify the CIDR block of a VPC, a vSwitch, or an ECS instance or enter a custom CIDR block.
         * <p>
         * 
         * You can specify an SNAT entry in the following ways:
         * 
         * *   You can specify the CIDR block of the VPC where the NAT gateway is deployed. Then, all ECS instances in the VPC can access the Internet or external networks by using SNAT.
         * *   You can specify the CIDR block of a vSwitch, for example, 192.168.1.0/24. Then, the ECS instances in the vSwitch can access the Internet or external networks by using SNAT.
         * *   You can specify the IP address of an ECS instance, for example, 192.168.1.1/32. Then, the ECS instance can access the Internet or external networks by using SNAT.
         * *   You can specify a custom CIDR block. Then, all ECS instances within the specified CIDR block can access the Internet or external networks by using SNAT.
         * 
         * When you add an SNAT entry to an Internet NAT gateway, if **SnatIp** is set to an EIP, the ECS instance uses the specified EIP to access the Internet.
         * 
         * If **SnatIp** is set to multiple EIPs, the ECS instance randomly selects an EIP specified in the **SnatIp** parameter to access the Internet.
         * 
         * You cannot set this parameter and **SourceVSwtichId** at the same time. If the **SourceVSwitchId** parameter is set, you cannot set the **SourceCIDR** parameter. If the **SourceCIDR** parameter is set, you cannot set the **SourceVSwitchId** parameter.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * The ID of the vSwitch.
         * <p>
         * 
         * *   When you add an SNAT entry to an Internet NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access the Internet. If you select multiple elastic IP addresses (EIPs) to create an SNAT address pool, connections are hashed to these EIPs. Network traffic may not be evenly distributed to the EIPs because the amount of traffic that passes through each connection varies. We recommend that you associate these EIPs with the same EIP bandwidth plan to prevent service interruptions due to the bandwidth limits on individual EIPs.
         * *   When you add an SNAT entry to a VPC NAT gateway, this parameter specifies that ECS instances in the vSwitch can use the SNAT entry to access external networks.
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
