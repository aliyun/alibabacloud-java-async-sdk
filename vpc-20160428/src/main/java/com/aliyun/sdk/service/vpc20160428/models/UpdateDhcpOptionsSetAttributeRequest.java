// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDhcpOptionsSetAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDhcpOptionsSetAttributeRequest</p>
 */
public class UpdateDhcpOptionsSetAttributeRequest extends Request {
    @Query
    @NameInMap("BootFileName")
    private String bootFileName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DhcpOptionsSetDescription")
    private String dhcpOptionsSetDescription;

    @Query
    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    private String dhcpOptionsSetId;

    @Query
    @NameInMap("DhcpOptionsSetName")
    private String dhcpOptionsSetName;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainNameServers")
    private String domainNameServers;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

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
    @NameInMap("TFTPServerName")
    private String TFTPServerName;

    private UpdateDhcpOptionsSetAttributeRequest(Builder builder) {
        super(builder);
        this.bootFileName = builder.bootFileName;
        this.clientToken = builder.clientToken;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.domainName = builder.domainName;
        this.domainNameServers = builder.domainNameServers;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.TFTPServerName = builder.TFTPServerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDhcpOptionsSetAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bootFileName
     */
    public String getBootFileName() {
        return this.bootFileName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dhcpOptionsSetDescription
     */
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    /**
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    /**
     * @return dhcpOptionsSetName
     */
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameServers
     */
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return TFTPServerName
     */
    public String getTFTPServerName() {
        return this.TFTPServerName;
    }

    public static final class Builder extends Request.Builder<UpdateDhcpOptionsSetAttributeRequest, Builder> {
        private String bootFileName; 
        private String clientToken; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetId; 
        private String dhcpOptionsSetName; 
        private String domainName; 
        private String domainNameServers; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String TFTPServerName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDhcpOptionsSetAttributeRequest response) {
            super(response);
            this.bootFileName = response.bootFileName;
            this.clientToken = response.clientToken;
            this.dhcpOptionsSetDescription = response.dhcpOptionsSetDescription;
            this.dhcpOptionsSetId = response.dhcpOptionsSetId;
            this.dhcpOptionsSetName = response.dhcpOptionsSetName;
            this.domainName = response.domainName;
            this.domainNameServers = response.domainNameServers;
            this.dryRun = response.dryRun;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.TFTPServerName = response.TFTPServerName;
        } 

        /**
         * BootFileName.
         */
        public Builder bootFileName(String bootFileName) {
            this.putQueryParameter("BootFileName", bootFileName);
            this.bootFileName = bootFileName;
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
         * DhcpOptionsSetDescription.
         */
        public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }

        /**
         * DhcpOptionsSetId.
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.putQueryParameter("DhcpOptionsSetId", dhcpOptionsSetId);
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * DhcpOptionsSetName.
         */
        public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
            this.putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainNameServers.
         */
        public Builder domainNameServers(String domainNameServers) {
            this.putQueryParameter("DomainNameServers", domainNameServers);
            this.domainNameServers = domainNameServers;
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
         * TFTPServerName.
         */
        public Builder TFTPServerName(String TFTPServerName) {
            this.putQueryParameter("TFTPServerName", TFTPServerName);
            this.TFTPServerName = TFTPServerName;
            return this;
        }

        @Override
        public UpdateDhcpOptionsSetAttributeRequest build() {
            return new UpdateDhcpOptionsSetAttributeRequest(this);
        } 

    } 

}
