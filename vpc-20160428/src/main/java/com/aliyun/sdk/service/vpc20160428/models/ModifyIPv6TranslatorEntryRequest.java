// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIPv6TranslatorEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyIPv6TranslatorEntryRequest</p>
 */
public class ModifyIPv6TranslatorEntryRequest extends Request {
    @Query
    @NameInMap("AclId")
    private String aclId;

    @Query
    @NameInMap("AclStatus")
    private String aclStatus;

    @Query
    @NameInMap("AclType")
    private String aclType;

    @Query
    @NameInMap("AllocateIpv6Port")
    private Integer allocateIpv6Port;

    @Query
    @NameInMap("BackendIpv4Addr")
    private String backendIpv4Addr;

    @Query
    @NameInMap("BackendIpv4Port")
    private Integer backendIpv4Port;

    @Query
    @NameInMap("EntryBandwidth")
    private Integer entryBandwidth;

    @Query
    @NameInMap("EntryDescription")
    private String entryDescription;

    @Query
    @NameInMap("EntryName")
    private String entryName;

    @Query
    @NameInMap("Ipv6TranslatorEntryId")
    @Validation(required = true)
    private String ipv6TranslatorEntryId;

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
    @NameInMap("TransProtocol")
    private String transProtocol;

    private ModifyIPv6TranslatorEntryRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.allocateIpv6Port = builder.allocateIpv6Port;
        this.backendIpv4Addr = builder.backendIpv4Addr;
        this.backendIpv4Port = builder.backendIpv4Port;
        this.entryBandwidth = builder.entryBandwidth;
        this.entryDescription = builder.entryDescription;
        this.entryName = builder.entryName;
        this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transProtocol = builder.transProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIPv6TranslatorEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclStatus
     */
    public String getAclStatus() {
        return this.aclStatus;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return allocateIpv6Port
     */
    public Integer getAllocateIpv6Port() {
        return this.allocateIpv6Port;
    }

    /**
     * @return backendIpv4Addr
     */
    public String getBackendIpv4Addr() {
        return this.backendIpv4Addr;
    }

    /**
     * @return backendIpv4Port
     */
    public Integer getBackendIpv4Port() {
        return this.backendIpv4Port;
    }

    /**
     * @return entryBandwidth
     */
    public Integer getEntryBandwidth() {
        return this.entryBandwidth;
    }

    /**
     * @return entryDescription
     */
    public String getEntryDescription() {
        return this.entryDescription;
    }

    /**
     * @return entryName
     */
    public String getEntryName() {
        return this.entryName;
    }

    /**
     * @return ipv6TranslatorEntryId
     */
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
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
     * @return transProtocol
     */
    public String getTransProtocol() {
        return this.transProtocol;
    }

    public static final class Builder extends Request.Builder<ModifyIPv6TranslatorEntryRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer allocateIpv6Port; 
        private String backendIpv4Addr; 
        private Integer backendIpv4Port; 
        private Integer entryBandwidth; 
        private String entryDescription; 
        private String entryName; 
        private String ipv6TranslatorEntryId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transProtocol; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIPv6TranslatorEntryRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.aclStatus = response.aclStatus;
            this.aclType = response.aclType;
            this.allocateIpv6Port = response.allocateIpv6Port;
            this.backendIpv4Addr = response.backendIpv4Addr;
            this.backendIpv4Port = response.backendIpv4Port;
            this.entryBandwidth = response.entryBandwidth;
            this.entryDescription = response.entryDescription;
            this.entryName = response.entryName;
            this.ipv6TranslatorEntryId = response.ipv6TranslatorEntryId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.transProtocol = response.transProtocol;
        } 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * AclStatus.
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * AllocateIpv6Port.
         */
        public Builder allocateIpv6Port(Integer allocateIpv6Port) {
            this.putQueryParameter("AllocateIpv6Port", allocateIpv6Port);
            this.allocateIpv6Port = allocateIpv6Port;
            return this;
        }

        /**
         * BackendIpv4Addr.
         */
        public Builder backendIpv4Addr(String backendIpv4Addr) {
            this.putQueryParameter("BackendIpv4Addr", backendIpv4Addr);
            this.backendIpv4Addr = backendIpv4Addr;
            return this;
        }

        /**
         * BackendIpv4Port.
         */
        public Builder backendIpv4Port(Integer backendIpv4Port) {
            this.putQueryParameter("BackendIpv4Port", backendIpv4Port);
            this.backendIpv4Port = backendIpv4Port;
            return this;
        }

        /**
         * EntryBandwidth.
         */
        public Builder entryBandwidth(Integer entryBandwidth) {
            this.putQueryParameter("EntryBandwidth", entryBandwidth);
            this.entryBandwidth = entryBandwidth;
            return this;
        }

        /**
         * EntryDescription.
         */
        public Builder entryDescription(String entryDescription) {
            this.putQueryParameter("EntryDescription", entryDescription);
            this.entryDescription = entryDescription;
            return this;
        }

        /**
         * EntryName.
         */
        public Builder entryName(String entryName) {
            this.putQueryParameter("EntryName", entryName);
            this.entryName = entryName;
            return this;
        }

        /**
         * Ipv6TranslatorEntryId.
         */
        public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.putQueryParameter("Ipv6TranslatorEntryId", ipv6TranslatorEntryId);
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
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

        /**
         * TransProtocol.
         */
        public Builder transProtocol(String transProtocol) {
            this.putQueryParameter("TransProtocol", transProtocol);
            this.transProtocol = transProtocol;
            return this;
        }

        @Override
        public ModifyIPv6TranslatorEntryRequest build() {
            return new ModifyIPv6TranslatorEntryRequest(this);
        } 

    } 

}
