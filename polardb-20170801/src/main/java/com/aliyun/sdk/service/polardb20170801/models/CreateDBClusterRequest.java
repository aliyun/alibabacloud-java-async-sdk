// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CloneDataPoint")
    private String cloneDataPoint;

    @Query
    @NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @Query
    @NameInMap("CreationCategory")
    private String creationCategory;

    @Query
    @NameInMap("CreationOption")
    private String creationOption;

    @Query
    @NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @Query
    @NameInMap("DBMinorVersion")
    private String DBMinorVersion;

    @Query
    @NameInMap("DBNodeClass")
    @Validation(required = true)
    private String DBNodeClass;

    @Query
    @NameInMap("DBType")
    @Validation(required = true)
    private String DBType;

    @Query
    @NameInMap("DBVersion")
    @Validation(required = true)
    private String DBVersion;

    @Query
    @NameInMap("DefaultTimeZone")
    private String defaultTimeZone;

    @Query
    @NameInMap("GDNId")
    private String GDNId;

    @Query
    @NameInMap("LowerCaseTableNames")
    private String lowerCaseTableNames;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("SourceResourceId")
    private String sourceResourceId;

    @Query
    @NameInMap("TDEStatus")
    private Boolean TDEStatus;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.clientToken = builder.clientToken;
        this.cloneDataPoint = builder.cloneDataPoint;
        this.clusterNetworkType = builder.clusterNetworkType;
        this.creationCategory = builder.creationCategory;
        this.creationOption = builder.creationOption;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBMinorVersion = builder.DBMinorVersion;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.defaultTimeZone = builder.defaultTimeZone;
        this.GDNId = builder.GDNId;
        this.lowerCaseTableNames = builder.lowerCaseTableNames;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupId = builder.parameterGroupId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIPList = builder.securityIPList;
        this.sourceResourceId = builder.sourceResourceId;
        this.TDEStatus = builder.TDEStatus;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloneDataPoint
     */
    public String getCloneDataPoint() {
        return this.cloneDataPoint;
    }

    /**
     * @return clusterNetworkType
     */
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return creationOption
     */
    public String getCreationOption() {
        return this.creationOption;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBMinorVersion
     */
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return defaultTimeZone
     */
    public String getDefaultTimeZone() {
        return this.defaultTimeZone;
    }

    /**
     * @return GDNId
     */
    public String getGDNId() {
        return this.GDNId;
    }

    /**
     * @return lowerCaseTableNames
     */
    public String getLowerCaseTableNames() {
        return this.lowerCaseTableNames;
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
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * @return TDEStatus
     */
    public Boolean getTDEStatus() {
        return this.TDEStatus;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterRequest, Builder> {
        private Boolean autoRenew; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String clientToken; 
        private String cloneDataPoint; 
        private String clusterNetworkType; 
        private String creationCategory; 
        private String creationOption; 
        private String DBClusterDescription; 
        private String DBMinorVersion; 
        private String DBNodeClass; 
        private String DBType; 
        private String DBVersion; 
        private String defaultTimeZone; 
        private String GDNId; 
        private String lowerCaseTableNames; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityIPList; 
        private String sourceResourceId; 
        private Boolean TDEStatus; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.backupRetentionPolicyOnClusterDeletion = response.backupRetentionPolicyOnClusterDeletion;
            this.clientToken = response.clientToken;
            this.cloneDataPoint = response.cloneDataPoint;
            this.clusterNetworkType = response.clusterNetworkType;
            this.creationCategory = response.creationCategory;
            this.creationOption = response.creationOption;
            this.DBClusterDescription = response.DBClusterDescription;
            this.DBMinorVersion = response.DBMinorVersion;
            this.DBNodeClass = response.DBNodeClass;
            this.DBType = response.DBType;
            this.DBVersion = response.DBVersion;
            this.defaultTimeZone = response.defaultTimeZone;
            this.GDNId = response.GDNId;
            this.lowerCaseTableNames = response.lowerCaseTableNames;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.parameterGroupId = response.parameterGroupId;
            this.payType = response.payType;
            this.period = response.period;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityIPList = response.securityIPList;
            this.sourceResourceId = response.sourceResourceId;
            this.TDEStatus = response.TDEStatus;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BackupRetentionPolicyOnClusterDeletion.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
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
         * CloneDataPoint.
         */
        public Builder cloneDataPoint(String cloneDataPoint) {
            this.putQueryParameter("CloneDataPoint", cloneDataPoint);
            this.cloneDataPoint = cloneDataPoint;
            return this;
        }

        /**
         * ClusterNetworkType.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.putQueryParameter("ClusterNetworkType", clusterNetworkType);
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * CreationCategory.
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * CreationOption.
         */
        public Builder creationOption(String creationOption) {
            this.putQueryParameter("CreationOption", creationOption);
            this.creationOption = creationOption;
            return this;
        }

        /**
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * DBMinorVersion.
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.putQueryParameter("DBMinorVersion", DBMinorVersion);
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * DBNodeClass.
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * DefaultTimeZone.
         */
        public Builder defaultTimeZone(String defaultTimeZone) {
            this.putQueryParameter("DefaultTimeZone", defaultTimeZone);
            this.defaultTimeZone = defaultTimeZone;
            return this;
        }

        /**
         * GDNId.
         */
        public Builder GDNId(String GDNId) {
            this.putQueryParameter("GDNId", GDNId);
            this.GDNId = GDNId;
            return this;
        }

        /**
         * LowerCaseTableNames.
         */
        public Builder lowerCaseTableNames(String lowerCaseTableNames) {
            this.putQueryParameter("LowerCaseTableNames", lowerCaseTableNames);
            this.lowerCaseTableNames = lowerCaseTableNames;
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
         * ParameterGroupId.
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SourceResourceId.
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.putQueryParameter("SourceResourceId", sourceResourceId);
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * TDEStatus.
         */
        public Builder TDEStatus(Boolean TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBClusterRequest build() {
            return new CreateDBClusterRequest(this);
        } 

    } 

}
