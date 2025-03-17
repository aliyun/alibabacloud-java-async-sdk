// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateDifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDifyInstanceRequest</p>
 */
public class CreateDifyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdbpgInstanceMode")
    private String adbpgInstanceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseOption")
    private String databaseOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEngineType")
    private String dbEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEngineVersion")
    private String dbEngineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceAccount")
    private String dbInstanceAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceCategory")
    private String dbInstanceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceClass")
    private String dbInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstancePassword")
    private String dbInstancePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbResourceId")
    private Integer dbResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbStorageSize")
    private String dbStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbStorageType")
    private String dbStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuNodeSpec")
    private String gpuNodeSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreAccount")
    private String kvStoreAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreEngineVersion")
    private String kvStoreEngineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreInstanceClass")
    private String kvStoreInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreNodeType")
    private String kvStoreNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreOption")
    private String kvStoreOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStorePassword")
    private String kvStorePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreResourceId")
    private Integer kvStoreResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvStoreType")
    private String kvStoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelOption")
    private String modelOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayOption")
    private String natGatewayOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssPath")
    private String ossPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssResourceId")
    private Integer ossResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayPeriod")
    private Integer payPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayPeriodType")
    private String payPeriodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceQuota")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegDiskPerformanceLevel")
    private String segDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegNodeNum")
    private Integer segNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbAccount")
    private String vectordbAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbCategory")
    private String vectordbCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbEngineVersion")
    private String vectordbEngineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbInstanceSpec")
    private String vectordbInstanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbOption")
    private String vectordbOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbPassword")
    private String vectordbPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbResourceId")
    private Integer vectordbResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbStorageSize")
    private String vectordbStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbStorageType")
    private String vectordbStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectordbType")
    private String vectordbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceDescription")
    private String workspaceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceOption")
    private String workspaceOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDifyInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adbpgInstanceMode = builder.adbpgInstanceMode;
        this.clientToken = builder.clientToken;
        this.dataRegion = builder.dataRegion;
        this.databaseOption = builder.databaseOption;
        this.dbEngineType = builder.dbEngineType;
        this.dbEngineVersion = builder.dbEngineVersion;
        this.dbInstanceAccount = builder.dbInstanceAccount;
        this.dbInstanceCategory = builder.dbInstanceCategory;
        this.dbInstanceClass = builder.dbInstanceClass;
        this.dbInstancePassword = builder.dbInstancePassword;
        this.dbResourceId = builder.dbResourceId;
        this.dbStorageSize = builder.dbStorageSize;
        this.dbStorageType = builder.dbStorageType;
        this.dryRun = builder.dryRun;
        this.gpuNodeSpec = builder.gpuNodeSpec;
        this.kvStoreAccount = builder.kvStoreAccount;
        this.kvStoreEngineVersion = builder.kvStoreEngineVersion;
        this.kvStoreInstanceClass = builder.kvStoreInstanceClass;
        this.kvStoreNodeType = builder.kvStoreNodeType;
        this.kvStoreOption = builder.kvStoreOption;
        this.kvStorePassword = builder.kvStorePassword;
        this.kvStoreResourceId = builder.kvStoreResourceId;
        this.kvStoreType = builder.kvStoreType;
        this.modelId = builder.modelId;
        this.modelOption = builder.modelOption;
        this.natGatewayOption = builder.natGatewayOption;
        this.ossPath = builder.ossPath;
        this.ossResourceId = builder.ossResourceId;
        this.payPeriod = builder.payPeriod;
        this.payPeriodType = builder.payPeriodType;
        this.payType = builder.payType;
        this.replicas = builder.replicas;
        this.resourceQuota = builder.resourceQuota;
        this.securityGroupId = builder.securityGroupId;
        this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
        this.segNodeNum = builder.segNodeNum;
        this.storageType = builder.storageType;
        this.vSwitchId = builder.vSwitchId;
        this.vectordbAccount = builder.vectordbAccount;
        this.vectordbCategory = builder.vectordbCategory;
        this.vectordbEngineVersion = builder.vectordbEngineVersion;
        this.vectordbInstanceSpec = builder.vectordbInstanceSpec;
        this.vectordbOption = builder.vectordbOption;
        this.vectordbPassword = builder.vectordbPassword;
        this.vectordbResourceId = builder.vectordbResourceId;
        this.vectordbStorageSize = builder.vectordbStorageSize;
        this.vectordbStorageType = builder.vectordbStorageType;
        this.vectordbType = builder.vectordbType;
        this.vpcId = builder.vpcId;
        this.workspaceDescription = builder.workspaceDescription;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
        this.workspaceOption = builder.workspaceOption;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDifyInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adbpgInstanceMode
     */
    public String getAdbpgInstanceMode() {
        return this.adbpgInstanceMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataRegion
     */
    public String getDataRegion() {
        return this.dataRegion;
    }

    /**
     * @return databaseOption
     */
    public String getDatabaseOption() {
        return this.databaseOption;
    }

    /**
     * @return dbEngineType
     */
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    /**
     * @return dbEngineVersion
     */
    public String getDbEngineVersion() {
        return this.dbEngineVersion;
    }

    /**
     * @return dbInstanceAccount
     */
    public String getDbInstanceAccount() {
        return this.dbInstanceAccount;
    }

    /**
     * @return dbInstanceCategory
     */
    public String getDbInstanceCategory() {
        return this.dbInstanceCategory;
    }

    /**
     * @return dbInstanceClass
     */
    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * @return dbInstancePassword
     */
    public String getDbInstancePassword() {
        return this.dbInstancePassword;
    }

    /**
     * @return dbResourceId
     */
    public Integer getDbResourceId() {
        return this.dbResourceId;
    }

    /**
     * @return dbStorageSize
     */
    public String getDbStorageSize() {
        return this.dbStorageSize;
    }

    /**
     * @return dbStorageType
     */
    public String getDbStorageType() {
        return this.dbStorageType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return gpuNodeSpec
     */
    public String getGpuNodeSpec() {
        return this.gpuNodeSpec;
    }

    /**
     * @return kvStoreAccount
     */
    public String getKvStoreAccount() {
        return this.kvStoreAccount;
    }

    /**
     * @return kvStoreEngineVersion
     */
    public String getKvStoreEngineVersion() {
        return this.kvStoreEngineVersion;
    }

    /**
     * @return kvStoreInstanceClass
     */
    public String getKvStoreInstanceClass() {
        return this.kvStoreInstanceClass;
    }

    /**
     * @return kvStoreNodeType
     */
    public String getKvStoreNodeType() {
        return this.kvStoreNodeType;
    }

    /**
     * @return kvStoreOption
     */
    public String getKvStoreOption() {
        return this.kvStoreOption;
    }

    /**
     * @return kvStorePassword
     */
    public String getKvStorePassword() {
        return this.kvStorePassword;
    }

    /**
     * @return kvStoreResourceId
     */
    public Integer getKvStoreResourceId() {
        return this.kvStoreResourceId;
    }

    /**
     * @return kvStoreType
     */
    public String getKvStoreType() {
        return this.kvStoreType;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelOption
     */
    public String getModelOption() {
        return this.modelOption;
    }

    /**
     * @return natGatewayOption
     */
    public String getNatGatewayOption() {
        return this.natGatewayOption;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return ossResourceId
     */
    public Integer getOssResourceId() {
        return this.ossResourceId;
    }

    /**
     * @return payPeriod
     */
    public Integer getPayPeriod() {
        return this.payPeriod;
    }

    /**
     * @return payPeriodType
     */
    public String getPayPeriodType() {
        return this.payPeriodType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return resourceQuota
     */
    public String getResourceQuota() {
        return this.resourceQuota;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return segDiskPerformanceLevel
     */
    public String getSegDiskPerformanceLevel() {
        return this.segDiskPerformanceLevel;
    }

    /**
     * @return segNodeNum
     */
    public Integer getSegNodeNum() {
        return this.segNodeNum;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vectordbAccount
     */
    public String getVectordbAccount() {
        return this.vectordbAccount;
    }

    /**
     * @return vectordbCategory
     */
    public String getVectordbCategory() {
        return this.vectordbCategory;
    }

    /**
     * @return vectordbEngineVersion
     */
    public String getVectordbEngineVersion() {
        return this.vectordbEngineVersion;
    }

    /**
     * @return vectordbInstanceSpec
     */
    public String getVectordbInstanceSpec() {
        return this.vectordbInstanceSpec;
    }

    /**
     * @return vectordbOption
     */
    public String getVectordbOption() {
        return this.vectordbOption;
    }

    /**
     * @return vectordbPassword
     */
    public String getVectordbPassword() {
        return this.vectordbPassword;
    }

    /**
     * @return vectordbResourceId
     */
    public Integer getVectordbResourceId() {
        return this.vectordbResourceId;
    }

    /**
     * @return vectordbStorageSize
     */
    public String getVectordbStorageSize() {
        return this.vectordbStorageSize;
    }

    /**
     * @return vectordbStorageType
     */
    public String getVectordbStorageType() {
        return this.vectordbStorageType;
    }

    /**
     * @return vectordbType
     */
    public String getVectordbType() {
        return this.vectordbType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return workspaceDescription
     */
    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return workspaceOption
     */
    public String getWorkspaceOption() {
        return this.workspaceOption;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDifyInstanceRequest, Builder> {
        private String regionId; 
        private String adbpgInstanceMode; 
        private String clientToken; 
        private String dataRegion; 
        private String databaseOption; 
        private String dbEngineType; 
        private String dbEngineVersion; 
        private String dbInstanceAccount; 
        private String dbInstanceCategory; 
        private String dbInstanceClass; 
        private String dbInstancePassword; 
        private Integer dbResourceId; 
        private String dbStorageSize; 
        private String dbStorageType; 
        private Boolean dryRun; 
        private String gpuNodeSpec; 
        private String kvStoreAccount; 
        private String kvStoreEngineVersion; 
        private String kvStoreInstanceClass; 
        private String kvStoreNodeType; 
        private String kvStoreOption; 
        private String kvStorePassword; 
        private Integer kvStoreResourceId; 
        private String kvStoreType; 
        private String modelId; 
        private String modelOption; 
        private String natGatewayOption; 
        private String ossPath; 
        private Integer ossResourceId; 
        private Integer payPeriod; 
        private String payPeriodType; 
        private String payType; 
        private Integer replicas; 
        private String resourceQuota; 
        private String securityGroupId; 
        private String segDiskPerformanceLevel; 
        private Integer segNodeNum; 
        private String storageType; 
        private String vSwitchId; 
        private String vectordbAccount; 
        private String vectordbCategory; 
        private String vectordbEngineVersion; 
        private String vectordbInstanceSpec; 
        private String vectordbOption; 
        private String vectordbPassword; 
        private Integer vectordbResourceId; 
        private String vectordbStorageSize; 
        private String vectordbStorageType; 
        private String vectordbType; 
        private String vpcId; 
        private String workspaceDescription; 
        private String workspaceId; 
        private String workspaceName; 
        private String workspaceOption; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDifyInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adbpgInstanceMode = request.adbpgInstanceMode;
            this.clientToken = request.clientToken;
            this.dataRegion = request.dataRegion;
            this.databaseOption = request.databaseOption;
            this.dbEngineType = request.dbEngineType;
            this.dbEngineVersion = request.dbEngineVersion;
            this.dbInstanceAccount = request.dbInstanceAccount;
            this.dbInstanceCategory = request.dbInstanceCategory;
            this.dbInstanceClass = request.dbInstanceClass;
            this.dbInstancePassword = request.dbInstancePassword;
            this.dbResourceId = request.dbResourceId;
            this.dbStorageSize = request.dbStorageSize;
            this.dbStorageType = request.dbStorageType;
            this.dryRun = request.dryRun;
            this.gpuNodeSpec = request.gpuNodeSpec;
            this.kvStoreAccount = request.kvStoreAccount;
            this.kvStoreEngineVersion = request.kvStoreEngineVersion;
            this.kvStoreInstanceClass = request.kvStoreInstanceClass;
            this.kvStoreNodeType = request.kvStoreNodeType;
            this.kvStoreOption = request.kvStoreOption;
            this.kvStorePassword = request.kvStorePassword;
            this.kvStoreResourceId = request.kvStoreResourceId;
            this.kvStoreType = request.kvStoreType;
            this.modelId = request.modelId;
            this.modelOption = request.modelOption;
            this.natGatewayOption = request.natGatewayOption;
            this.ossPath = request.ossPath;
            this.ossResourceId = request.ossResourceId;
            this.payPeriod = request.payPeriod;
            this.payPeriodType = request.payPeriodType;
            this.payType = request.payType;
            this.replicas = request.replicas;
            this.resourceQuota = request.resourceQuota;
            this.securityGroupId = request.securityGroupId;
            this.segDiskPerformanceLevel = request.segDiskPerformanceLevel;
            this.segNodeNum = request.segNodeNum;
            this.storageType = request.storageType;
            this.vSwitchId = request.vSwitchId;
            this.vectordbAccount = request.vectordbAccount;
            this.vectordbCategory = request.vectordbCategory;
            this.vectordbEngineVersion = request.vectordbEngineVersion;
            this.vectordbInstanceSpec = request.vectordbInstanceSpec;
            this.vectordbOption = request.vectordbOption;
            this.vectordbPassword = request.vectordbPassword;
            this.vectordbResourceId = request.vectordbResourceId;
            this.vectordbStorageSize = request.vectordbStorageSize;
            this.vectordbStorageType = request.vectordbStorageType;
            this.vectordbType = request.vectordbType;
            this.vpcId = request.vpcId;
            this.workspaceDescription = request.workspaceDescription;
            this.workspaceId = request.workspaceId;
            this.workspaceName = request.workspaceName;
            this.workspaceOption = request.workspaceOption;
            this.zoneId = request.zoneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AdbpgInstanceMode.
         */
        public Builder adbpgInstanceMode(String adbpgInstanceMode) {
            this.putQueryParameter("AdbpgInstanceMode", adbpgInstanceMode);
            this.adbpgInstanceMode = adbpgInstanceMode;
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
         * <p>This parameter is required.</p>
         */
        public Builder dataRegion(String dataRegion) {
            this.putQueryParameter("DataRegion", dataRegion);
            this.dataRegion = dataRegion;
            return this;
        }

        /**
         * DatabaseOption.
         */
        public Builder databaseOption(String databaseOption) {
            this.putQueryParameter("DatabaseOption", databaseOption);
            this.databaseOption = databaseOption;
            return this;
        }

        /**
         * DbEngineType.
         */
        public Builder dbEngineType(String dbEngineType) {
            this.putQueryParameter("DbEngineType", dbEngineType);
            this.dbEngineType = dbEngineType;
            return this;
        }

        /**
         * DbEngineVersion.
         */
        public Builder dbEngineVersion(String dbEngineVersion) {
            this.putQueryParameter("DbEngineVersion", dbEngineVersion);
            this.dbEngineVersion = dbEngineVersion;
            return this;
        }

        /**
         * DbInstanceAccount.
         */
        public Builder dbInstanceAccount(String dbInstanceAccount) {
            this.putQueryParameter("DbInstanceAccount", dbInstanceAccount);
            this.dbInstanceAccount = dbInstanceAccount;
            return this;
        }

        /**
         * DbInstanceCategory.
         */
        public Builder dbInstanceCategory(String dbInstanceCategory) {
            this.putQueryParameter("DbInstanceCategory", dbInstanceCategory);
            this.dbInstanceCategory = dbInstanceCategory;
            return this;
        }

        /**
         * DbInstanceClass.
         */
        public Builder dbInstanceClass(String dbInstanceClass) {
            this.putQueryParameter("DbInstanceClass", dbInstanceClass);
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }

        /**
         * DbInstancePassword.
         */
        public Builder dbInstancePassword(String dbInstancePassword) {
            this.putQueryParameter("DbInstancePassword", dbInstancePassword);
            this.dbInstancePassword = dbInstancePassword;
            return this;
        }

        /**
         * DbResourceId.
         */
        public Builder dbResourceId(Integer dbResourceId) {
            this.putQueryParameter("DbResourceId", dbResourceId);
            this.dbResourceId = dbResourceId;
            return this;
        }

        /**
         * DbStorageSize.
         */
        public Builder dbStorageSize(String dbStorageSize) {
            this.putQueryParameter("DbStorageSize", dbStorageSize);
            this.dbStorageSize = dbStorageSize;
            return this;
        }

        /**
         * DbStorageType.
         */
        public Builder dbStorageType(String dbStorageType) {
            this.putQueryParameter("DbStorageType", dbStorageType);
            this.dbStorageType = dbStorageType;
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
         * GpuNodeSpec.
         */
        public Builder gpuNodeSpec(String gpuNodeSpec) {
            this.putQueryParameter("GpuNodeSpec", gpuNodeSpec);
            this.gpuNodeSpec = gpuNodeSpec;
            return this;
        }

        /**
         * KvStoreAccount.
         */
        public Builder kvStoreAccount(String kvStoreAccount) {
            this.putQueryParameter("KvStoreAccount", kvStoreAccount);
            this.kvStoreAccount = kvStoreAccount;
            return this;
        }

        /**
         * KvStoreEngineVersion.
         */
        public Builder kvStoreEngineVersion(String kvStoreEngineVersion) {
            this.putQueryParameter("KvStoreEngineVersion", kvStoreEngineVersion);
            this.kvStoreEngineVersion = kvStoreEngineVersion;
            return this;
        }

        /**
         * KvStoreInstanceClass.
         */
        public Builder kvStoreInstanceClass(String kvStoreInstanceClass) {
            this.putQueryParameter("KvStoreInstanceClass", kvStoreInstanceClass);
            this.kvStoreInstanceClass = kvStoreInstanceClass;
            return this;
        }

        /**
         * KvStoreNodeType.
         */
        public Builder kvStoreNodeType(String kvStoreNodeType) {
            this.putQueryParameter("KvStoreNodeType", kvStoreNodeType);
            this.kvStoreNodeType = kvStoreNodeType;
            return this;
        }

        /**
         * KvStoreOption.
         */
        public Builder kvStoreOption(String kvStoreOption) {
            this.putQueryParameter("KvStoreOption", kvStoreOption);
            this.kvStoreOption = kvStoreOption;
            return this;
        }

        /**
         * KvStorePassword.
         */
        public Builder kvStorePassword(String kvStorePassword) {
            this.putQueryParameter("KvStorePassword", kvStorePassword);
            this.kvStorePassword = kvStorePassword;
            return this;
        }

        /**
         * KvStoreResourceId.
         */
        public Builder kvStoreResourceId(Integer kvStoreResourceId) {
            this.putQueryParameter("KvStoreResourceId", kvStoreResourceId);
            this.kvStoreResourceId = kvStoreResourceId;
            return this;
        }

        /**
         * KvStoreType.
         */
        public Builder kvStoreType(String kvStoreType) {
            this.putQueryParameter("KvStoreType", kvStoreType);
            this.kvStoreType = kvStoreType;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelOption.
         */
        public Builder modelOption(String modelOption) {
            this.putQueryParameter("ModelOption", modelOption);
            this.modelOption = modelOption;
            return this;
        }

        /**
         * NatGatewayOption.
         */
        public Builder natGatewayOption(String natGatewayOption) {
            this.putQueryParameter("NatGatewayOption", natGatewayOption);
            this.natGatewayOption = natGatewayOption;
            return this;
        }

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.putQueryParameter("OssPath", ossPath);
            this.ossPath = ossPath;
            return this;
        }

        /**
         * OssResourceId.
         */
        public Builder ossResourceId(Integer ossResourceId) {
            this.putQueryParameter("OssResourceId", ossResourceId);
            this.ossResourceId = ossResourceId;
            return this;
        }

        /**
         * PayPeriod.
         */
        public Builder payPeriod(Integer payPeriod) {
            this.putQueryParameter("PayPeriod", payPeriod);
            this.payPeriod = payPeriod;
            return this;
        }

        /**
         * PayPeriodType.
         */
        public Builder payPeriodType(String payPeriodType) {
            this.putQueryParameter("PayPeriodType", payPeriodType);
            this.payPeriodType = payPeriodType;
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
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceQuota(String resourceQuota) {
            this.putQueryParameter("ResourceQuota", resourceQuota);
            this.resourceQuota = resourceQuota;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SegDiskPerformanceLevel.
         */
        public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
            this.putQueryParameter("SegDiskPerformanceLevel", segDiskPerformanceLevel);
            this.segDiskPerformanceLevel = segDiskPerformanceLevel;
            return this;
        }

        /**
         * SegNodeNum.
         */
        public Builder segNodeNum(Integer segNodeNum) {
            this.putQueryParameter("SegNodeNum", segNodeNum);
            this.segNodeNum = segNodeNum;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VectordbAccount.
         */
        public Builder vectordbAccount(String vectordbAccount) {
            this.putQueryParameter("VectordbAccount", vectordbAccount);
            this.vectordbAccount = vectordbAccount;
            return this;
        }

        /**
         * VectordbCategory.
         */
        public Builder vectordbCategory(String vectordbCategory) {
            this.putQueryParameter("VectordbCategory", vectordbCategory);
            this.vectordbCategory = vectordbCategory;
            return this;
        }

        /**
         * VectordbEngineVersion.
         */
        public Builder vectordbEngineVersion(String vectordbEngineVersion) {
            this.putQueryParameter("VectordbEngineVersion", vectordbEngineVersion);
            this.vectordbEngineVersion = vectordbEngineVersion;
            return this;
        }

        /**
         * VectordbInstanceSpec.
         */
        public Builder vectordbInstanceSpec(String vectordbInstanceSpec) {
            this.putQueryParameter("VectordbInstanceSpec", vectordbInstanceSpec);
            this.vectordbInstanceSpec = vectordbInstanceSpec;
            return this;
        }

        /**
         * VectordbOption.
         */
        public Builder vectordbOption(String vectordbOption) {
            this.putQueryParameter("VectordbOption", vectordbOption);
            this.vectordbOption = vectordbOption;
            return this;
        }

        /**
         * VectordbPassword.
         */
        public Builder vectordbPassword(String vectordbPassword) {
            this.putQueryParameter("VectordbPassword", vectordbPassword);
            this.vectordbPassword = vectordbPassword;
            return this;
        }

        /**
         * VectordbResourceId.
         */
        public Builder vectordbResourceId(Integer vectordbResourceId) {
            this.putQueryParameter("VectordbResourceId", vectordbResourceId);
            this.vectordbResourceId = vectordbResourceId;
            return this;
        }

        /**
         * VectordbStorageSize.
         */
        public Builder vectordbStorageSize(String vectordbStorageSize) {
            this.putQueryParameter("VectordbStorageSize", vectordbStorageSize);
            this.vectordbStorageSize = vectordbStorageSize;
            return this;
        }

        /**
         * VectordbStorageType.
         */
        public Builder vectordbStorageType(String vectordbStorageType) {
            this.putQueryParameter("VectordbStorageType", vectordbStorageType);
            this.vectordbStorageType = vectordbStorageType;
            return this;
        }

        /**
         * VectordbType.
         */
        public Builder vectordbType(String vectordbType) {
            this.putQueryParameter("VectordbType", vectordbType);
            this.vectordbType = vectordbType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WorkspaceDescription.
         */
        public Builder workspaceDescription(String workspaceDescription) {
            this.putQueryParameter("WorkspaceDescription", workspaceDescription);
            this.workspaceDescription = workspaceDescription;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * WorkspaceOption.
         */
        public Builder workspaceOption(String workspaceOption) {
            this.putQueryParameter("WorkspaceOption", workspaceOption);
            this.workspaceOption = workspaceOption;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDifyInstanceRequest build() {
            return new CreateDifyInstanceRequest(this);
        } 

    } 

}
