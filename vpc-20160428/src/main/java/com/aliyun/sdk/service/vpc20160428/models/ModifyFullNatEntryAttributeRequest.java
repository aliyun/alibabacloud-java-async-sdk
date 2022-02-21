// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFullNatEntryAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullNatEntryAttributeRequest</p>
 */
public class ModifyFullNatEntryAttributeRequest extends Request {
    @Query
    @NameInMap("AccessIp")
    private String accessIp;

    @Query
    @NameInMap("AccessPort")
    private String accessPort;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FullNatEntryDescription")
    private String fullNatEntryDescription;

    @Query
    @NameInMap("FullNatEntryId")
    @Validation(required = true)
    private String fullNatEntryId;

    @Query
    @NameInMap("FullNatEntryName")
    private String fullNatEntryName;

    @Query
    @NameInMap("FullNatTableId")
    @Validation(required = true)
    private String fullNatTableId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("NatIp")
    private String natIp;

    @Query
    @NameInMap("NatIpPort")
    private String natIpPort;

    @Query
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

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

    private ModifyFullNatEntryAttributeRequest(Builder builder) {
        super(builder);
        this.accessIp = builder.accessIp;
        this.accessPort = builder.accessPort;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fullNatEntryDescription = builder.fullNatEntryDescription;
        this.fullNatEntryId = builder.fullNatEntryId;
        this.fullNatEntryName = builder.fullNatEntryName;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.natIp = builder.natIp;
        this.natIpPort = builder.natIpPort;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFullNatEntryAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessIp
     */
    public String getAccessIp() {
        return this.accessIp;
    }

    /**
     * @return accessPort
     */
    public String getAccessPort() {
        return this.accessPort;
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
     * @return fullNatEntryDescription
     */
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    /**
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return fullNatEntryName
     */
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpPort
     */
    public String getNatIpPort() {
        return this.natIpPort;
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

    public static final class Builder extends Request.Builder<ModifyFullNatEntryAttributeRequest, Builder> {
        private String accessIp; 
        private String accessPort; 
        private String clientToken; 
        private Boolean dryRun; 
        private String fullNatEntryDescription; 
        private String fullNatEntryId; 
        private String fullNatEntryName; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private String natIp; 
        private String natIpPort; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullNatEntryAttributeRequest response) {
            super(response);
            this.accessIp = response.accessIp;
            this.accessPort = response.accessPort;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.fullNatEntryDescription = response.fullNatEntryDescription;
            this.fullNatEntryId = response.fullNatEntryId;
            this.fullNatEntryName = response.fullNatEntryName;
            this.fullNatTableId = response.fullNatTableId;
            this.ipProtocol = response.ipProtocol;
            this.natIp = response.natIp;
            this.natIpPort = response.natIpPort;
            this.networkInterfaceId = response.networkInterfaceId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * AccessIp.
         */
        public Builder accessIp(String accessIp) {
            this.putQueryParameter("AccessIp", accessIp);
            this.accessIp = accessIp;
            return this;
        }

        /**
         * AccessPort.
         */
        public Builder accessPort(String accessPort) {
            this.putQueryParameter("AccessPort", accessPort);
            this.accessPort = accessPort;
            return this;
        }

        /**
         * ClientToken.
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
         * FullNatEntryDescription.
         */
        public Builder fullNatEntryDescription(String fullNatEntryDescription) {
            this.putQueryParameter("FullNatEntryDescription", fullNatEntryDescription);
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }

        /**
         * FullNatEntryId.
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.putQueryParameter("FullNatEntryId", fullNatEntryId);
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * FullNatEntryName.
         */
        public Builder fullNatEntryName(String fullNatEntryName) {
            this.putQueryParameter("FullNatEntryName", fullNatEntryName);
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }

        /**
         * FullNatTableId.
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.putQueryParameter("FullNatTableId", fullNatTableId);
            this.fullNatTableId = fullNatTableId;
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
         * NatIp.
         */
        public Builder natIp(String natIp) {
            this.putQueryParameter("NatIp", natIp);
            this.natIp = natIp;
            return this;
        }

        /**
         * NatIpPort.
         */
        public Builder natIpPort(String natIpPort) {
            this.putQueryParameter("NatIpPort", natIpPort);
            this.natIpPort = natIpPort;
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
         * RegionId.
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

        @Override
        public ModifyFullNatEntryAttributeRequest build() {
            return new ModifyFullNatEntryAttributeRequest(this);
        } 

    } 

}
