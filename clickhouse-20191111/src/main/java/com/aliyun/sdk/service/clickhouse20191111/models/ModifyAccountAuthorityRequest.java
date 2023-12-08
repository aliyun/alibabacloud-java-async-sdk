// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountAuthorityRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountAuthorityRequest</p>
 */
public class ModifyAccountAuthorityRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AllowDatabases")
    @Validation(required = true)
    private String allowDatabases;

    @Query
    @NameInMap("AllowDictionaries")
    @Validation(required = true)
    private String allowDictionaries;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DdlAuthority")
    @Validation(required = true)
    private Boolean ddlAuthority;

    @Query
    @NameInMap("DmlAuthority")
    @Validation(required = true)
    private String dmlAuthority;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TotalDatabases")
    private String totalDatabases;

    @Query
    @NameInMap("TotalDictionaries")
    private String totalDictionaries;

    private ModifyAccountAuthorityRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.allowDatabases = builder.allowDatabases;
        this.allowDictionaries = builder.allowDictionaries;
        this.DBClusterId = builder.DBClusterId;
        this.ddlAuthority = builder.ddlAuthority;
        this.dmlAuthority = builder.dmlAuthority;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.totalDatabases = builder.totalDatabases;
        this.totalDictionaries = builder.totalDictionaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountAuthorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return allowDatabases
     */
    public String getAllowDatabases() {
        return this.allowDatabases;
    }

    /**
     * @return allowDictionaries
     */
    public String getAllowDictionaries() {
        return this.allowDictionaries;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ddlAuthority
     */
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    /**
     * @return dmlAuthority
     */
    public String getDmlAuthority() {
        return this.dmlAuthority;
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
     * @return totalDatabases
     */
    public String getTotalDatabases() {
        return this.totalDatabases;
    }

    /**
     * @return totalDictionaries
     */
    public String getTotalDictionaries() {
        return this.totalDictionaries;
    }

    public static final class Builder extends Request.Builder<ModifyAccountAuthorityRequest, Builder> {
        private String accountName; 
        private String allowDatabases; 
        private String allowDictionaries; 
        private String DBClusterId; 
        private Boolean ddlAuthority; 
        private String dmlAuthority; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String totalDatabases; 
        private String totalDictionaries; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountAuthorityRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.allowDatabases = request.allowDatabases;
            this.allowDictionaries = request.allowDictionaries;
            this.DBClusterId = request.DBClusterId;
            this.ddlAuthority = request.ddlAuthority;
            this.dmlAuthority = request.dmlAuthority;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.totalDatabases = request.totalDatabases;
            this.totalDictionaries = request.totalDictionaries;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AllowDatabases.
         */
        public Builder allowDatabases(String allowDatabases) {
            this.putQueryParameter("AllowDatabases", allowDatabases);
            this.allowDatabases = allowDatabases;
            return this;
        }

        /**
         * AllowDictionaries.
         */
        public Builder allowDictionaries(String allowDictionaries) {
            this.putQueryParameter("AllowDictionaries", allowDictionaries);
            this.allowDictionaries = allowDictionaries;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DdlAuthority.
         */
        public Builder ddlAuthority(Boolean ddlAuthority) {
            this.putQueryParameter("DdlAuthority", ddlAuthority);
            this.ddlAuthority = ddlAuthority;
            return this;
        }

        /**
         * DmlAuthority.
         */
        public Builder dmlAuthority(String dmlAuthority) {
            this.putQueryParameter("DmlAuthority", dmlAuthority);
            this.dmlAuthority = dmlAuthority;
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
         * TotalDatabases.
         */
        public Builder totalDatabases(String totalDatabases) {
            this.putQueryParameter("TotalDatabases", totalDatabases);
            this.totalDatabases = totalDatabases;
            return this;
        }

        /**
         * TotalDictionaries.
         */
        public Builder totalDictionaries(String totalDictionaries) {
            this.putQueryParameter("TotalDictionaries", totalDictionaries);
            this.totalDictionaries = totalDictionaries;
            return this;
        }

        @Override
        public ModifyAccountAuthorityRequest build() {
            return new ModifyAccountAuthorityRequest(this);
        } 

    } 

}
