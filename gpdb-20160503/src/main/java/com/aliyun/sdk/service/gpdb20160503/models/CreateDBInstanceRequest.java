// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodeSpecInfos")
    private java.util.List<AINodeSpecInfos> AINodeSpecInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheStorageSize")
    private String cacheStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSampleData")
    private Boolean createSampleData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceCategory")
    private String DBInstanceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceGroupCount")
    private String DBInstanceGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSSL")
    private Boolean enableSSL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private String encryptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTime")
    private Integer idleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterAISpec")
    private String masterAISpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterCU")
    private Integer masterCU;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterNodeNum")
    private String masterNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdType")
    private String prodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegDiskPerformanceLevel")
    private String segDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegNodeNum")
    private String segNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegStorageType")
    private String segStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessMode")
    private String serverlessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessResource")
    private Integer serverlessResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDbInstanceName")
    private String srcDbInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectorConfigurationStatus")
    private String vectorConfigurationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.AINodeSpecInfos = builder.AINodeSpecInfos;
        this.backupId = builder.backupId;
        this.cacheStorageSize = builder.cacheStorageSize;
        this.clientToken = builder.clientToken;
        this.createSampleData = builder.createSampleData;
        this.DBInstanceCategory = builder.DBInstanceCategory;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceMode = builder.DBInstanceMode;
        this.deployMode = builder.deployMode;
        this.enableSSL = builder.enableSSL;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.idleTime = builder.idleTime;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceSpec = builder.instanceSpec;
        this.masterAISpec = builder.masterAISpec;
        this.masterCU = builder.masterCU;
        this.masterNodeNum = builder.masterNodeNum;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.prodType = builder.prodType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
        this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
        this.segNodeNum = builder.segNodeNum;
        this.segStorageType = builder.segStorageType;
        this.serverlessMode = builder.serverlessMode;
        this.serverlessResource = builder.serverlessResource;
        this.srcDbInstanceName = builder.srcDbInstanceName;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.storageSize = builder.storageSize;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.vectorConfigurationStatus = builder.vectorConfigurationStatus;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AINodeSpecInfos
     */
    public java.util.List<AINodeSpecInfos> getAINodeSpecInfos() {
        return this.AINodeSpecInfos;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return cacheStorageSize
     */
    public String getCacheStorageSize() {
        return this.cacheStorageSize;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createSampleData
     */
    public Boolean getCreateSampleData() {
        return this.createSampleData;
    }

    /**
     * @return DBInstanceCategory
     */
    public String getDBInstanceCategory() {
        return this.DBInstanceCategory;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceGroupCount
     */
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    /**
     * @return DBInstanceMode
     */
    public String getDBInstanceMode() {
        return this.DBInstanceMode;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return enableSSL
     */
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return idleTime
     */
    public Integer getIdleTime() {
        return this.idleTime;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return masterAISpec
     */
    public String getMasterAISpec() {
        return this.masterAISpec;
    }

    /**
     * @return masterCU
     */
    public Integer getMasterCU() {
        return this.masterCU;
    }

    /**
     * @return masterNodeNum
     */
    public String getMasterNodeNum() {
        return this.masterNodeNum;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return prodType
     */
    public String getProdType() {
        return this.prodType;
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
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
    public String getSegNodeNum() {
        return this.segNodeNum;
    }

    /**
     * @return segStorageType
     */
    public String getSegStorageType() {
        return this.segStorageType;
    }

    /**
     * @return serverlessMode
     */
    public String getServerlessMode() {
        return this.serverlessMode;
    }

    /**
     * @return serverlessResource
     */
    public Integer getServerlessResource() {
        return this.serverlessResource;
    }

    /**
     * @return srcDbInstanceName
     */
    public String getSrcDbInstanceName() {
        return this.srcDbInstanceName;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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
     * @return vectorConfigurationStatus
     */
    public String getVectorConfigurationStatus() {
        return this.vectorConfigurationStatus;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private java.util.List<AINodeSpecInfos> AINodeSpecInfos; 
        private String backupId; 
        private String cacheStorageSize; 
        private String clientToken; 
        private Boolean createSampleData; 
        private String DBInstanceCategory; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceGroupCount; 
        private String DBInstanceMode; 
        private String deployMode; 
        private Boolean enableSSL; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String engineVersion; 
        private Integer idleTime; 
        private String instanceNetworkType; 
        private String instanceSpec; 
        private String masterAISpec; 
        private Integer masterCU; 
        private String masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String prodType; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String segDiskPerformanceLevel; 
        private String segNodeNum; 
        private String segStorageType; 
        private String serverlessMode; 
        private Integer serverlessResource; 
        private String srcDbInstanceName; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private Long storageSize; 
        private String storageType; 
        private java.util.List<Tag> tag; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String vectorConfigurationStatus; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.AINodeSpecInfos = request.AINodeSpecInfos;
            this.backupId = request.backupId;
            this.cacheStorageSize = request.cacheStorageSize;
            this.clientToken = request.clientToken;
            this.createSampleData = request.createSampleData;
            this.DBInstanceCategory = request.DBInstanceCategory;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceGroupCount = request.DBInstanceGroupCount;
            this.DBInstanceMode = request.DBInstanceMode;
            this.deployMode = request.deployMode;
            this.enableSSL = request.enableSSL;
            this.encryptionKey = request.encryptionKey;
            this.encryptionType = request.encryptionType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.idleTime = request.idleTime;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instanceSpec = request.instanceSpec;
            this.masterAISpec = request.masterAISpec;
            this.masterCU = request.masterCU;
            this.masterNodeNum = request.masterNodeNum;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.prodType = request.prodType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityIPList = request.securityIPList;
            this.segDiskPerformanceLevel = request.segDiskPerformanceLevel;
            this.segNodeNum = request.segNodeNum;
            this.segStorageType = request.segStorageType;
            this.serverlessMode = request.serverlessMode;
            this.serverlessResource = request.serverlessResource;
            this.srcDbInstanceName = request.srcDbInstanceName;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyZoneId = request.standbyZoneId;
            this.storageSize = request.storageSize;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.vectorConfigurationStatus = request.vectorConfigurationStatus;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The AI node specifications information.</p>
         */
        public Builder AINodeSpecInfos(java.util.List<AINodeSpecInfos> AINodeSpecInfos) {
            this.putQueryParameter("AINodeSpecInfos", AINodeSpecInfos);
            this.AINodeSpecInfos = AINodeSpecInfos;
            return this;
        }

        /**
         * <p>The backup set ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the backup set IDs of all backup sets for the target instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The Serverless cache storage size. Valid values: 800 to 102400. The step size is 32 GB. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder cacheStorageSize(String cacheStorageSize) {
            this.putQueryParameter("CacheStorageSize", cacheStorageSize);
            this.cacheStorageSize = cacheStorageSize;
            return this;
        }

        /**
         * <p>The client token used for idempotence checks. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to load a sample dataset after the instance is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Load a sample dataset.</li>
         * <li><strong>false</strong>: Do not load a sample dataset.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder createSampleData(Boolean createSampleData) {
            this.putQueryParameter("CreateSampleData", createSampleData);
            this.createSampleData = createSampleData;
            return this;
        }

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><strong>HighAvailability</strong>: high-availability edition.</li>
         * <li><strong>Basic</strong>: basic edition.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a storage elastic mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder DBInstanceCategory(String DBInstanceCategory) {
            this.putQueryParameter("DBInstanceCategory", DBInstanceCategory);
            this.DBInstanceCategory = DBInstanceCategory;
            return this;
        }

        /**
         * <p>The instance specifications. For more information, see the supplementary description of the DBInstanceClass parameter.</p>
         * <blockquote>
         * <p>This parameter is required when you create a storage reservation mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gpdb.group.segsdx1</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The number of compute groups. Valid values: 2, 4, 8, 12, 16, 24, 32, 64, 96, and 128.</p>
         * <blockquote>
         * <p>This parameter is required when you create a storage reservation mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
            this.putQueryParameter("DBInstanceGroupCount", DBInstanceGroupCount);
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>StorageElastic</strong>: storage elastic mode.</li>
         * <li><strong>Serverless</strong>: Serverless mode.</li>
         * <li><strong>ServerlessPro</strong>: Serverless Pro mode.</li>
         * <li><strong>Classic</strong>: storage reservation mode.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StorageElastic</p>
         */
        public Builder DBInstanceMode(String DBInstanceMode) {
            this.putQueryParameter("DBInstanceMode", DBInstanceMode);
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }

        /**
         * <p>The deployment mode. Valid values:</p>
         * <ul>
         * <li>multiple: multi-zone deployment.</li>
         * <li>single: single-zone deployment.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the default value is single-zone deployment.</li>
         * <li>Currently, only single-zone deployment is supported.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * <p>Indicates whether to enable Secure Sockets Layer (SSL) encryption. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enable SSL encryption.</li>
         * <li><strong>false</strong> (default): Do not enable SSL encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.putQueryParameter("EnableSSL", enableSSL);
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * <p>The encryption key ID.</p>
         * <blockquote>
         * <p>If the <strong>EncryptionType</strong> parameter is set to <strong>CloudDisk</strong>, specify the encryption key ID in the same region. Otherwise, leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0d2470df-da7b-4786-b981-88888888****</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The encryption type. Valid values:</p>
         * <ul>
         * <li><strong>NULL</strong>: Encryption is not enabled. This is the default value.</li>
         * <li><strong>CloudDisk</strong>: Cloud disk encryption is enabled. Use the <strong>EncryptionKey</strong> parameter to specify the encryption key.</li>
         * </ul>
         * <blockquote>
         * <p>Cloud disk encryption cannot be disabled after it is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CloudDisk</p>
         */
        public Builder encryptionType(String encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * <p>The database engine. Set the value to <strong>gpdb</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gpdb</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version. Valid values:</p>
         * <ul>
         * <li><strong>6.0</strong>: version 6.0.</li>
         * <li><strong>7.0</strong>: version 7.0.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The idle release wait time. The instance transitions to an idle state after no service traffic is detected for the specified duration. Unit: seconds. Minimum value: 60. Default value: 600.</p>
         * <blockquote>
         * <p>This parameter is required only for Serverless instances in automatic scheduling mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder idleTime(Integer idleTime) {
            this.putQueryParameter("IdleTime", idleTime);
            this.idleTime = idleTime;
            return this;
        }

        /**
         * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>Only VPC is supported on the public cloud.</li>
         * <li>If you do not specify this parameter, the default value is VPC.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The node specifications of compute nodes.</p>
         * <p>Valid values for storage elastic mode (high-availability edition):</p>
         * <ul>
         * <li><strong>2C16G</strong></li>
         * <li><strong>4C32G</strong></li>
         * <li><strong>16C128G</strong></li>
         * </ul>
         * <p>Valid values for storage elastic mode (basic edition):</p>
         * <ul>
         * <li><strong>2C8G</strong></li>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * <li><strong>16C64G</strong></li>
         * </ul>
         * <p>Valid values for Serverless mode:</p>
         * <ul>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a storage elastic mode instance or a Serverless mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2C16G</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>Specify this parameter if you want to change the master node to a MasterAI node.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter and MasterCU cannot be specified at the same time.</li>
         * <li>Only specific regions and zones support changing the master node to a MasterAI node.</li>
         * <li>Only basic edition instances of AnalyticDB for PostgreSQL 7.0 support MasterAI nodes.</li>
         * <li>You can view all valid values of this parameter on the specification change page for the master node.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ADB.AIMedium.2</p>
         */
        public Builder masterAISpec(String masterAISpec) {
            this.putQueryParameter("MasterAISpec", masterAISpec);
            this.masterAISpec = masterAISpec;
            return this;
        }

        /**
         * <p>The master resources. Valid values: </p>
         * <ul>
         * <li>2 CU </li>
         * <li>4 CU </li>
         * <li>8 CU </li>
         * <li>16 CU </li>
         * <li>32 CU <blockquote>
         * <p>Master resources above 8 CU incur additional fees.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8 CU</p>
         */
        public Builder masterCU(Integer masterCU) {
            this.putQueryParameter("MasterCU", masterCU);
            this.masterCU = masterCU;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder masterNodeNum(String masterNodeNum) {
            this.putQueryParameter("MasterNodeNum", masterNodeNum);
            this.masterNodeNum = masterNodeNum;
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the default value is pay-as-you-go.</li>
         * <li>Discounts are available for subscription instances when you purchase them for one year or longer. Select a billing method based on your business requirements.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: month.</li>
         * <li><strong>Year</strong>: year.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a subscription instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: Standard Edition.</li>
         * <li><strong>cost-effective</strong>: Economy Edition.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value is Standard Edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder prodType(String prodType) {
            this.putQueryParameter("ProdType", prodType);
            this.prodType = prodType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
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
         * <p>The ID of the enterprise resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The IP address whitelist.</p>
         * <p>A value of 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. After the instance is created, you can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
         * <ul>
         * <li><strong>pl0</strong>: PL0.</li>
         * <li><strong>pl1</strong>: PL1.</li>
         * <li><strong>pl2</strong>: PL2.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when the cloud disk storage type is ESSD cloud disk.</li>
         * <li>If you do not specify this parameter, the default value is PL1.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
            this.putQueryParameter("SegDiskPerformanceLevel", segDiskPerformanceLevel);
            this.segDiskPerformanceLevel = segDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The number of compute nodes. Valid values:</p>
         * <ul>
         * <li>Storage elastic mode (high-availability edition): 4 to 512. The value must be a multiple of 4.</li>
         * <li>Storage elastic mode (basic edition): 2 to 512. The value must be a multiple of 2.</li>
         * <li>Serverless mode: 2 to 512. The value must be a multiple of 2.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a storage elastic mode instance or a Serverless mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder segNodeNum(String segNodeNum) {
            this.putQueryParameter("SegNodeNum", segNodeNum);
            this.segNodeNum = segNodeNum;
            return this;
        }

        /**
         * <p>The cloud disk storage type. Currently, only ESSD cloud disks are supported. Set the value to <strong>cloud_essd</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when you create a storage elastic mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder segStorageType(String segStorageType) {
            this.putQueryParameter("SegStorageType", segStorageType);
            this.segStorageType = segStorageType;
            return this;
        }

        /**
         * <p>The mode of the Serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>Manual</strong>: manual scheduling. This is the default value.</li>
         * <li><strong>Auto</strong>: automatic scheduling.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for Serverless mode instances.</li>
         * <li>The automatic scheduling mode for AnalyticDB for PostgreSQL Serverless is in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?product=rds">submit a ticket</a> to apply for access.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder serverlessMode(String serverlessMode) {
            this.putQueryParameter("ServerlessMode", serverlessMode);
            this.serverlessMode = serverlessMode;
            return this;
        }

        /**
         * <p>The compute resource threshold. Valid values: 16 to 1024. The step size is 8. Unit: ACU.</p>
         * <blockquote>
         * <p>This parameter is required only for Serverless instances in automatic scheduling mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder serverlessResource(Integer serverlessResource) {
            this.putQueryParameter("ServerlessResource", serverlessResource);
            this.serverlessResource = serverlessResource;
            return this;
        }

        /**
         * <p>The ID of the source instance to clone.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the target region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder srcDbInstanceName(String srcDbInstanceName) {
            this.putQueryParameter("SrcDbInstanceName", srcDbInstanceName);
            this.srcDbInstanceName = srcDbInstanceName;
            return this;
        }

        /**
         * <p>The vSwitch ID in the secondary zone.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for multi-zone deployment.</li>
         * <li>The vSwitch must be in the same zone as the value specified by StandbyZoneId.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The secondary zone ID.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for multi-zone deployment.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</li>
         * <li>The secondary zone ID must be different from the primary zone ID.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>The storage capacity. Unit: GB. Valid values: &lt;props=&quot;china&quot;&gt;50 to 8000&lt;props=&quot;intl&quot;&gt;50 to 6000.</p>
         * <blockquote>
         * <p>This parameter is required when you create a storage elastic mode instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The Nth tag. Valid values of N: 1 to 20.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li>If <strong>Period</strong> is set to <strong>Month</strong>, valid values are 1 to 9.</li>
         * <li>If <strong>Period</strong> is set to <strong>Year</strong>, valid values are 1 to 3.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a subscription instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <blockquote>
         * <ul>
         * <li><strong>VPCId</strong> is required.</li>
         * <li>The VPC must be in the same region as the value specified by <strong>RegionId</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3oejns****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <ul>
         * <li><strong>vSwitchId</strong> is required.</li>
         * <li>The vSwitch must be in the same zone as the value specified by <strong>ZoneId</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: Enable vector engine optimization.</li>
         * <li><strong>disabled</strong> (default): Do not enable vector engine optimization.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For mainstream analytics, data warehousing, and real-time data warehouse scenarios, <strong>do not enable</strong> vector engine optimization.</li>
         * <li>For scenarios that use the vector analysis engine for AIGC and AISearch, <strong>enable</strong> vector engine optimization.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder vectorConfigurationStatus(String vectorConfigurationStatus) {
            this.putQueryParameter("VectorConfigurationStatus", vectorConfigurationStatus);
            this.vectorConfigurationStatus = vectorConfigurationStatus;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class AINodeSpecInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AINodeNum")
        private String AINodeNum;

        @com.aliyun.core.annotation.NameInMap("AINodeSpec")
        private String AINodeSpec;

        private AINodeSpecInfos(Builder builder) {
            this.AINodeNum = builder.AINodeNum;
            this.AINodeSpec = builder.AINodeSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AINodeSpecInfos create() {
            return builder().build();
        }

        /**
         * @return AINodeNum
         */
        public String getAINodeNum() {
            return this.AINodeNum;
        }

        /**
         * @return AINodeSpec
         */
        public String getAINodeSpec() {
            return this.AINodeSpec;
        }

        public static final class Builder {
            private String AINodeNum; 
            private String AINodeSpec; 

            private Builder() {
            } 

            private Builder(AINodeSpecInfos model) {
                this.AINodeNum = model.AINodeNum;
                this.AINodeSpec = model.AINodeSpec;
            } 

            /**
             * <p>The number of AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder AINodeNum(String AINodeNum) {
                this.AINodeNum = AINodeNum;
                return this;
            }

            /**
             * <p>The AI node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>ADB.AIMedium.2</p>
             */
            public Builder AINodeSpec(String AINodeSpec) {
                this.AINodeSpec = AINodeSpec;
                return this;
            }

            public AINodeSpecInfos build() {
                return new AINodeSpecInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The following limits apply:</p>
             * <ul>
             * <li>The tag key cannot be an empty string.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The following limits apply:</p>
             * <ul>
             * <li>The tag value can be an empty string.</li>
             * <li>The tag value can be up to 128 characters in length.</li>
             * <li>The tag value cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
