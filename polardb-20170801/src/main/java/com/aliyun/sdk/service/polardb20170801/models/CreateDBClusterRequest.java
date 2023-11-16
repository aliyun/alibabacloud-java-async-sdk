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
    @NameInMap("AllowShutDown")
    private String allowShutDown;

    @Query
    @NameInMap("Architecture")
    private String architecture;

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
    @NameInMap("DBNodeNum")
    private Integer DBNodeNum;

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
    @NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @Query
    @NameInMap("LoosePolarLogBin")
    private String loosePolarLogBin;

    @Query
    @NameInMap("LooseXEngine")
    private String looseXEngine;

    @Query
    @NameInMap("LooseXEngineUseMemoryPct")
    private String looseXEngineUseMemoryPct;

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
    @NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @Query
    @NameInMap("ProxyClass")
    private String proxyClass;

    @Query
    @NameInMap("ProxyType")
    private String proxyType;

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
    @NameInMap("ScaleMax")
    private String scaleMax;

    @Query
    @NameInMap("ScaleMin")
    private String scaleMin;

    @Query
    @NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @Query
    @NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @Query
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("ServerlessType")
    private String serverlessType;

    @Query
    @NameInMap("SourceResourceId")
    private String sourceResourceId;

    @Query
    @NameInMap("StandbyAZ")
    private String standbyAZ;

    @Query
    @NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @Query
    @NameInMap("StoragePayType")
    private String storagePayType;

    @Query
    @NameInMap("StorageSpace")
    @Validation(maximum = 64000, minimum = 20)
    private Long storageSpace;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("StorageUpperBound")
    @Validation(maximum = 64000, minimum = 20)
    private Long storageUpperBound;

    @Query
    @NameInMap("StrictConsistency")
    private String strictConsistency;

    @Query
    @NameInMap("TDEStatus")
    private Boolean TDEStatus;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
        this.allowShutDown = builder.allowShutDown;
        this.architecture = builder.architecture;
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
        this.DBNodeNum = builder.DBNodeNum;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.defaultTimeZone = builder.defaultTimeZone;
        this.GDNId = builder.GDNId;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.loosePolarLogBin = builder.loosePolarLogBin;
        this.looseXEngine = builder.looseXEngine;
        this.looseXEngineUseMemoryPct = builder.looseXEngineUseMemoryPct;
        this.lowerCaseTableNames = builder.lowerCaseTableNames;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupId = builder.parameterGroupId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.provisionedIops = builder.provisionedIops;
        this.proxyClass = builder.proxyClass;
        this.proxyType = builder.proxyType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
        this.securityIPList = builder.securityIPList;
        this.serverlessType = builder.serverlessType;
        this.sourceResourceId = builder.sourceResourceId;
        this.standbyAZ = builder.standbyAZ;
        this.storageAutoScale = builder.storageAutoScale;
        this.storagePayType = builder.storagePayType;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.storageUpperBound = builder.storageUpperBound;
        this.strictConsistency = builder.strictConsistency;
        this.TDEStatus = builder.TDEStatus;
        this.tag = builder.tag;
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
     * @return allowShutDown
     */
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
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
     * @return DBNodeNum
     */
    public Integer getDBNodeNum() {
        return this.DBNodeNum;
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
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return loosePolarLogBin
     */
    public String getLoosePolarLogBin() {
        return this.loosePolarLogBin;
    }

    /**
     * @return looseXEngine
     */
    public String getLooseXEngine() {
        return this.looseXEngine;
    }

    /**
     * @return looseXEngineUseMemoryPct
     */
    public String getLooseXEngineUseMemoryPct() {
        return this.looseXEngineUseMemoryPct;
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
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return proxyClass
     */
    public String getProxyClass() {
        return this.proxyClass;
    }

    /**
     * @return proxyType
     */
    public String getProxyType() {
        return this.proxyType;
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
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return serverlessType
     */
    public String getServerlessType() {
        return this.serverlessType;
    }

    /**
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * @return standbyAZ
     */
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storagePayType
     */
    public String getStoragePayType() {
        return this.storagePayType;
    }

    /**
     * @return storageSpace
     */
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return storageUpperBound
     */
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    /**
     * @return strictConsistency
     */
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    /**
     * @return TDEStatus
     */
    public Boolean getTDEStatus() {
        return this.TDEStatus;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
        private String allowShutDown; 
        private String architecture; 
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
        private Integer DBNodeNum; 
        private String DBType; 
        private String DBVersion; 
        private String defaultTimeZone; 
        private String GDNId; 
        private String hotStandbyCluster; 
        private String loosePolarLogBin; 
        private String looseXEngine; 
        private String looseXEngineUseMemoryPct; 
        private String lowerCaseTableNames; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupId; 
        private String payType; 
        private String period; 
        private Long provisionedIops; 
        private String proxyClass; 
        private String proxyType; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 
        private String securityIPList; 
        private String serverlessType; 
        private String sourceResourceId; 
        private String standbyAZ; 
        private String storageAutoScale; 
        private String storagePayType; 
        private Long storageSpace; 
        private String storageType; 
        private Long storageUpperBound; 
        private String strictConsistency; 
        private Boolean TDEStatus; 
        private java.util.List < Tag> tag; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest request) {
            super(request);
            this.allowShutDown = request.allowShutDown;
            this.architecture = request.architecture;
            this.autoRenew = request.autoRenew;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.clientToken = request.clientToken;
            this.cloneDataPoint = request.cloneDataPoint;
            this.clusterNetworkType = request.clusterNetworkType;
            this.creationCategory = request.creationCategory;
            this.creationOption = request.creationOption;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBMinorVersion = request.DBMinorVersion;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeNum = request.DBNodeNum;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.defaultTimeZone = request.defaultTimeZone;
            this.GDNId = request.GDNId;
            this.hotStandbyCluster = request.hotStandbyCluster;
            this.loosePolarLogBin = request.loosePolarLogBin;
            this.looseXEngine = request.looseXEngine;
            this.looseXEngineUseMemoryPct = request.looseXEngineUseMemoryPct;
            this.lowerCaseTableNames = request.lowerCaseTableNames;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameterGroupId = request.parameterGroupId;
            this.payType = request.payType;
            this.period = request.period;
            this.provisionedIops = request.provisionedIops;
            this.proxyClass = request.proxyClass;
            this.proxyType = request.proxyType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.scaleRoNumMax = request.scaleRoNumMax;
            this.scaleRoNumMin = request.scaleRoNumMin;
            this.securityIPList = request.securityIPList;
            this.serverlessType = request.serverlessType;
            this.sourceResourceId = request.sourceResourceId;
            this.standbyAZ = request.standbyAZ;
            this.storageAutoScale = request.storageAutoScale;
            this.storagePayType = request.storagePayType;
            this.storageSpace = request.storageSpace;
            this.storageType = request.storageType;
            this.storageUpperBound = request.storageUpperBound;
            this.strictConsistency = request.strictConsistency;
            this.TDEStatus = request.TDEStatus;
            this.tag = request.tag;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to enable the no-activity suspension feature. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder allowShutDown(String allowShutDown) {
            this.putQueryParameter("AllowShutDown", allowShutDown);
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * Default value: **false**.
         * 
         * > This parameter is valid only when the **PayType** parameter is set to **Prepaid**.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The retention policy for the backup sets when you delete the cluster. Valid values:
         * <p>
         * 
         * *   **ALL**: permanently retains all backups.
         * *   **LATEST**: permanently retains the last backup. A backup is automatically created before you delete the cluster.
         * *   **NONE**: No backup sets are retained after the cluster is deleted.
         * 
         * The default value is **NONE** after you create a cluster.
         * 
         * > 
         * 
         * *   This parameter is valid only when the **DBType** parameter is set to **MySQL**.
         * 
         * *   This parameter is invalid for serverless clusters.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The point in time when you want to clone data. Valid values:
         * <p>
         * 
         * *   **LATEST**: The data of the latest point in time is cloned.
         * *   **BackupID**: You can specify the ID of a backup set. In this case, data is cloned based on the specified backup set.
         * *   **Timestamp**: You can specify a point in time in the past in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.
         * 
         * Default value: **LATEST**.
         * 
         * > If the **CreationOption** parameter is set to **CloneFromRDS**, the value of this parameter must be **LATEST**.
         */
        public Builder cloneDataPoint(String cloneDataPoint) {
            this.putQueryParameter("CloneDataPoint", cloneDataPoint);
            this.cloneDataPoint = cloneDataPoint;
            return this;
        }

        /**
         * The network type of the cluster. Only virtual private clouds (VPCs) are supported. Set the value to **VPC**.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.putQueryParameter("ClusterNetworkType", clusterNetworkType);
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * The edition of the cluster. Default value: Normal. Valid values:
         * <p>
         * 
         * *   **Normal**: Cluster Edition
         * *   **Basic**: Single Node Edition
         * *   **ArchiveNormal**: X-Engine Edition
         * *   **NormalMultimaster**: Multi-master Cluster Edition
         * 
         * > 
         * 
         * *   Only when the **DBType** parameter is set to **MySQL** and **the DBVersion** parameter is set to **5.6**, **5.7**, or **8.0**, you can set this parameter to **Basic**.
         * 
         * *   Only when the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**, you can set this parameter to **ArchiveNormal** or **NormalMultimaster**.
         * 
         * For more information, see [Product editions](~~183258~~).
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * The method that is used to create a cluster. Valid values:
         * <p>
         * 
         * *   **Normal**: creates a PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:
         * 
         *     *   [Create a PolarDB for MySQL cluster](~~58769~~)
         *     *   [Create a PolarDB for PostgreSQL cluster](~~118063~~)
         *     *   [Create a PolarDB for Oracle cluster](~~118182~~)
         * 
         * *   **CloneFromPolarDB**: clones data from an existing PolarDB cluster to a new PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:
         * 
         *     *   [Clone a PolarDB for MySQL cluster](~~87966~~)
         *     *   [Clone a PolarDB for PostgreSQL cluster](~~118108~~)
         *     *   [Clone a PolarDB for Oracle cluster](~~118221~~)
         * 
         * *   **CloneFromRDS**: clones data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. For more information about how to perform this operation in the console, see [Create a PolarDB for MySQL cluster by cloning an ApsaraDB RDS for MySQL instance](~~121812~~).
         * 
         * *   **MigrationFromRDS**: migrates data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. By default, the created PolarDB cluster is in read-only mode, and the binary logging feature is enabled. For more information about how to perform this operation in the console, see [Create a PolarDB for MySQL cluster from an ApsaraDB RDS for MySQL instance](~~121582~~).
         * 
         * *   **CreateGdnStandby**: creates a secondary cluster. For more information about how to perform this operation in the console, see [Add a secondary cluster](~~160381~~).
         * 
         * Default value: **Normal**.
         * 
         * > 
         * 
         * *   If the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **5.6** or **5.7**, this parameter can be set to **CloneFromRDS** or **MigrationFromRDS**.
         * 
         * *   If the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**, this parameter can be set to **CreateGdnStandby**.
         */
        public Builder creationOption(String creationOption) {
            this.putQueryParameter("CreationOption", creationOption);
            this.creationOption = creationOption;
            return this;
        }

        /**
         * The name of the cluster. The name must meet the following requirements:
         * <p>
         * 
         * *   It cannot start with `http://` or `https://`.
         * *   It must be 2 to 256 characters in length.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * The minor version of the database engine. Valid values:
         * <p>
         * 
         * *   **8.0.2**
         * *   **8.0.1**
         * 
         * > This parameter is valid only when the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**.
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.putQueryParameter("DBMinorVersion", DBMinorVersion);
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * The specifications of the node.
         * <p>
         * 
         * *   For more information about specifications supported by PolarDB for MySQL, see [Specifications of compute nodes](~~102542~~).
         * *   For information about node specifications supported by the Oracle database engine, see [Specifications of compute nodes](~~207921~~).
         * *   For information about node specifications supported by the PostgreSQL database engine, see [Specifications of compute nodes](~~209380~~).
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * 标准版节点个数。
         */
        public Builder DBNodeNum(Integer DBNodeNum) {
            this.putQueryParameter("DBNodeNum", DBNodeNum);
            this.DBNodeNum = DBNodeNum;
            return this;
        }

        /**
         * The type of the database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PostgreSQL**
         * *   **Oracle**
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine.
         * <p>
         * 
         * *   Valid values for the MySQL database engine:
         * 
         *     *   **5.6**
         *     *   **5.7**
         *     *   **8.0**
         * 
         * *   Valid values for the PostgreSQL database engine:
         * 
         *     *   **11**
         *     *   **14**
         * 
         * *   Valid value for the Oracle database engine: **11**
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The time zone of the cluster. The time must be in UTC. You can set the parameter to a value that is on the hour from **-12:00 to +13:00**. Example: 00:00. Default value: **SYSTEM**, which means that the value is the same as the time zone of the region.
         * <p>
         * 
         * > This parameter is valid only when the **DBType** parameter is set to **MySQL**.
         */
        public Builder defaultTimeZone(String defaultTimeZone) {
            this.putQueryParameter("DefaultTimeZone", defaultTimeZone);
            this.defaultTimeZone = defaultTimeZone;
            return this;
        }

        /**
         * The ID of the Global Database Network (GDN).
         * <p>
         * 
         * > This parameter is required only when the **CreationOption** parameter is set to **CreateGdnStandby**.
         */
        public Builder GDNId(String GDNId) {
            this.putQueryParameter("GDNId", GDNId);
            this.GDNId = GDNId;
            return this;
        }

        /**
         * HotStandbyCluster.
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.putQueryParameter("HotStandbyCluster", hotStandbyCluster);
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * 开启Binlog功能，取值范围如下：
         * <p>
         * 
         * - **ON**：集群开启Binlog功能
         * - **OFF**：集群关闭Binlog功能
         * > 当参数**DBType**为**MySQL**时，该参数才生效。
         */
        public Builder loosePolarLogBin(String loosePolarLogBin) {
            this.putQueryParameter("LoosePolarLogBin", loosePolarLogBin);
            this.loosePolarLogBin = loosePolarLogBin;
            return this;
        }

        /**
         * 开启X-Engine存储引擎功能，取值范围如下：
         * <p>
         * 
         * - **ON**：集群开启X-Engine引擎
         * - **OFF**：集群关闭X-Engine引擎
         * > 当参数**CreationOption**不等于**CreateGdnStandby**，**DBType**为**MySQL**且**DBVersion**为**8.0**时，该参数才生效。开启X-Engine引擎的节点内存规格必须大于等于16 GB。
         */
        public Builder looseXEngine(String looseXEngine) {
            this.putQueryParameter("LooseXEngine", looseXEngine);
            this.looseXEngine = looseXEngine;
            return this;
        }

        /**
         * 设置开启X-Engine存储引擎比例，取值范围10~90的整数。
         * <p>
         * > 当参数**LooseXEngine**为**ON**时，该参数才生效。
         */
        public Builder looseXEngineUseMemoryPct(String looseXEngineUseMemoryPct) {
            this.putQueryParameter("LooseXEngineUseMemoryPct", looseXEngineUseMemoryPct);
            this.looseXEngineUseMemoryPct = looseXEngineUseMemoryPct;
            return this;
        }

        /**
         * Specifies whether the table names are case-sensitive. Valid values:
         * <p>
         * 
         * *   **1**: The table names are case-insensitive.
         * *   **0**: The table names are case-sensitive.
         * 
         * Default value: **1**.
         * 
         * > This parameter is valid only when the **DBType** parameter is set to **MySQL**.
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
         * The ID of the parameter template.
         * <p>
         * 
         * > You can call the [DescribeParameterGroups](~~207178~~) operation to query the details of all parameter templates of a specified region, such as the ID of a parameter template.
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription type of the subscription cluster. This parameter is required only when the PayType parameter is set to **Prepaid**. Valid values:
         * <p>
         * 
         * *   **Year**: annual subscription. Unit: years.
         * *   **Month**: monthly subscription. Unit: months.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * ProvisionedIops.
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * 标准版数据库代理规格。
         */
        public Builder proxyClass(String proxyClass) {
            this.putQueryParameter("ProxyClass", proxyClass);
            this.proxyClass = proxyClass;
            return this;
        }

        /**
         * 数据库代理类型，取值范围如下：
         * <p>
         * 
         * - **Exclusive**：企业独享版
         * - **General**：企业通用版
         */
        public Builder proxyType(String proxyType) {
            this.putQueryParameter("ProxyType", proxyType);
            this.proxyType = proxyType;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~98041~~) operation to query available regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
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
         * The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.
         * <p>
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.
         * <p>
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * The maximum number of read-only nodes for scaling. Valid values: 0 to 15.
         * <p>
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * The minimum number of read-only nodes for scaling. Valid values: 0 to 15.
         * <p>
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * The IP whitelist of the cluster.
         * <p>
         * 
         * > The whitelist can contain multiple IP addresses. Separate multiple IP addresses with commas (,).
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * The type of the serverless cluster. Set the value to **AgileServerless**.
         * <p>
         * 
         * > This parameter is valid only for serverless clusters.
         */
        public Builder serverlessType(String serverlessType) {
            this.putQueryParameter("ServerlessType", serverlessType);
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * The ID of the source ApsaraDB RDS instance or PolarDB cluster. This parameter is required only when the **CreationOption** parameter is set to **MigrationFromRDS**, **CloneFromRDS**, or **CloneFromPolarDB**.
         * <p>
         * 
         * *   If the **CreationOption** parameter is set to **MigrationFromRDS** or **CloneFromRDS**, you must set this parameter to the ID of the source ApsaraDB RDS instance. The source ApsaraDB RDS instance must use ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 High-availability Edition.
         * *   If the **CreationOption** parameter is set to **CloneFromPolarDB**, you must set this parameter to the ID of the source PolarDB cluster. By default, the value of DBType of the destination cluster must be the same as that of the source cluster. For example, if a MySQL 8.0 cluster is used as the source cluster, you must set the **DBType** parameter to **MySQL** and the **DBVersion** parameter to **8.0** for the destination cluster.
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.putQueryParameter("SourceResourceId", sourceResourceId);
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * 存储热备集群的可用区。适用于标准版3AZ场景。
         * <p>
         * 
         * > 开启了多可用区数据强一致，该参数才生效。
         */
        public Builder standbyAZ(String standbyAZ) {
            this.putQueryParameter("StandbyAZ", standbyAZ);
            this.standbyAZ = standbyAZ;
            return this;
        }

        /**
         * StorageAutoScale.
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * StoragePayType.
         */
        public Builder storagePayType(String storagePayType) {
            this.putQueryParameter("StoragePayType", storagePayType);
            this.storagePayType = storagePayType;
            return this;
        }

        /**
         * The storage space that uses the subscription billing method. Unit: GB.
         */
        public Builder storageSpace(Long storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * The storage type. Valid values for Enterprise Edition:
         * <p>
         * 
         * *   **PSL5**
         * *   **PSL4**
         * 
         * Valid values for Standard Edition:
         * 
         * *   **ESSDPL1**
         * *   **ESSDPL2**
         * *   **ESSDPL3**
         * 
         * > This parameter is invalid for serverless clusters.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * StorageUpperBound.
         */
        public Builder storageUpperBound(Long storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * 集群是否开启了多可用区数据强一致。取值范围：
         * <p>
         * 
         * - **ON**：表示开启了多可用区数据强一致，适用于标准版3AZ场景。
         * 
         * - **OFF**：表示未开启多可用区数据强一致。
         */
        public Builder strictConsistency(String strictConsistency) {
            this.putQueryParameter("StrictConsistency", strictConsistency);
            this.strictConsistency = strictConsistency;
            return this;
        }

        /**
         * Specifies whether to enable transparent data encryption (TDE). Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > 
         * 
         * *   This parameter is valid only when the **DBType** parameter is set to **PostgreSQL** or **Oracle**.
         * 
         * *   You can call the [ModifyDBClusterTDE](~~167982~~) operation to enable TDE for a PolarDB for MySQL cluster.
         * *   TDE cannot be disabled after it is enabled.
         */
        public Builder TDEStatus(Boolean TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        /**
         * 1
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * *   If the **Period** parameter is set to **Month**, the **UsedTime** parameter can be set to `1, 2, 3, 4, 5, 6, 7, 8, or 9`.
         * <p>
         * *   If the **Period** parameter is set to **Year**, the **UsedTime** parameter can be set to `1, 2, or 3`.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID of the cluster.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID of the cluster.
         * <p>
         * 
         * > If the VPCId parameter is specified, the VSwitchId parameter is required.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~98041~~) operation to query available zones.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the **+** icon.
             * <p>
             * 
             * > You can create up to 20 key-value pairs of tags at a time. Each value of the `Tag.N.Key` parameter is paired with a value of the `Tag.N.Value` parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the **+** icon.
             * <p>
             * 
             * > You can create up to 20 key-value pairs of tags at a time. Each value of the `Tag.N.Value` parameter is paired with a value of the `Tag.N.Key` parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
