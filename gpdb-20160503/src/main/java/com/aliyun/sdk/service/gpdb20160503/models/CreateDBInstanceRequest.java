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
         * AINodeSpecInfos.
         */
        public Builder AINodeSpecInfos(java.util.List<AINodeSpecInfos> AINodeSpecInfos) {
            this.putQueryParameter("AINodeSpecInfos", AINodeSpecInfos);
            this.AINodeSpecInfos = AINodeSpecInfos;
            return this;
        }

        /**
         * <p>Backup set ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> interface to view the backup set IDs of all backup sets under the target instance.</p>
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
         * <p>Idempotence check. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to Ensure Idempotence</a>.</p>
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
         * <p>Whether to load sample datasets after the instance is created. The values are as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Load sample datasets.</li>
         * <li><strong>false</strong>: Do not load sample datasets.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, it defaults to not loading sample datasets.</p>
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
         * <p>Instance series. The value description is as follows:</p>
         * <ul>
         * <li><strong>HighAvailability</strong>: High availability version.</li>
         * <li><strong>Basic</strong>: Basic version.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when creating an instance in the storage elastic mode.</p>
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
         * <p>Instance type. For more details, see the supplementary description of the DBInstanceClass parameter.</p>
         * <blockquote>
         * <p>This parameter is required when creating a reserved storage mode instance.</p>
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
         * <p>Instance description.</p>
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
         * <p>Number of compute groups. The values are: 2, 4, 8, 12, 16, 24, 32, 64, 96, 128.</p>
         * <blockquote>
         * <p>This parameter is required when creating a reserved storage mode instance.</p>
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
         * <p>Instance resource type. The value description is as follows:</p>
         * <ul>
         * <li><strong>StorageElastic</strong>: Storage elastic mode.</li>
         * <li><strong>Serverless</strong>: Serverless mode.</li>
         * <li><strong>Classic</strong>: Storage reserved mode.</li>
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
         * <p>Deployment mode. The values are as follows:</p>
         * <ul>
         * <li>multiple: Multi-zone deployment.</li>
         * <li>single: Single-zone deployment.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is single-zone deployment.</li>
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
         * <p>Specifies whether to enable SSL encryption. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
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
         * <p>Key ID.</p>
         * <blockquote>
         * <p>If the value of the <strong>EncryptionType</strong> parameter is <strong>CloudDisk</strong>, you need to specify the encryption key ID within the same region through this parameter; otherwise, it should be empty.</p>
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
         * <p>Encryption type. The value description is as follows:</p>
         * <ul>
         * <li><strong>NULL</strong>: No encryption (default).</li>
         * <li><strong>CloudDisk</strong>: Enable cloud disk encryption and specify the key through the <strong>EncryptionKey</strong> parameter.</li>
         * </ul>
         * <blockquote>
         * <p>Once cloud disk encryption is enabled, it cannot be disabled.</p>
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
         * <p>Database engine, with the value <strong>gpdb</strong>.</p>
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
         * <p>Engine version. The values are as follows:</p>
         * <ul>
         * <li><strong>6.0</strong>: Version 6.0.</li>
         * <li><strong>7.0</strong>: Version 7.0.</li>
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
         * <p>The idle release wait time. When the duration without business traffic reaches the specified time, the instance will enter the idle state. The unit is seconds, with a minimum value of 60, and the default value is 600.</p>
         * <blockquote>
         * <p>This parameter is required only for Serverless auto-scheduling mode instances.</p>
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
         * <p>Instance network type, with the value <strong>VPC</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>Only VPC networks are supported in public cloud.</li>
         * <li>If not specified, it defaults to VPC type.</li>
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
         * <p>Compute node specifications.</p>
         * <p>For high-availability versions of the elastic storage mode, the values are as follows:</p>
         * <ul>
         * <li><strong>2C16G</strong></li>
         * <li><strong>4C32G</strong></li>
         * <li><strong>16C128G</strong></li>
         * </ul>
         * <p>For basic versions of the elastic storage mode, the values are as follows:</p>
         * <ul>
         * <li><strong>2C8G</strong></li>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * <li><strong>16C64G</strong></li>
         * </ul>
         * <p>For Serverless mode, the values are as follows:</p>
         * <ul>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when creating an elastic storage mode instance or a Serverless mode instance.</p>
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
         * <p>This parameter must be specified if you want to change coordinator nodes to AI coordinator nodes.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot specify the MasterAISpec and MasterCU parameters at the same time.</li>
         * <li>You can change coordinator nodes to AI coordinator nodes only in specific regions and zones.</li>
         * <li>Only AnalyticDB for PostgreSQL V7.0 instances of Basic Edition support AI coordinator nodes.</li>
         * <li>You can view the valid values of this parameter on the configuration change page of coordinator nodes.</li>
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
         * <p>Master resources, with the following values: </p>
         * <ul>
         * <li>2 CU </li>
         * <li>4 CU </li>
         * <li>8 CU </li>
         * <li>16 CU </li>
         * <li>32 CU <blockquote>
         * <p>Master resources above 8 CU will incur charges.</p>
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
         * <p>This parameter is deprecated and should not be passed.</p>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you do not specify this parameter, Postpaid is used.</p>
         * </li>
         * <li><p>You can obtain more cost savings if you create a subscription instance for one year or longer. We recommend that you select the billing method that best suits your needs.</p>
         * </li>
         * </ul>
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
         * <p>Unit of the duration for which resources are purchased. The values are as follows:</p>
         * <ul>
         * <li><strong>Month</strong>: Month</li>
         * <li><strong>Year</strong>: Year</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when creating a subscription-billed instance.</p>
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
         * <p>This parameter is deprecated and should not be passed.</p>
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
         * <p>Product type. The values are as follows:</p>
         * <ul>
         * <li><strong>standard</strong>: Standard Edition.</li>
         * <li><strong>cost-effective</strong>: Cost-Effective Edition.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the default value is Standard Edition.</p>
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
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available region IDs.</p>
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
         * <p>The ID of the enterprise resource group where the instance is located.</p>
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
         * <p>The IP address whitelist of the instance.</p>
         * <p>A value of 127.0.0.1 denies access from any external IP address. You can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist after you create an instance.</p>
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
         * <p>The performance level of ESSDs. Valid values:</p>
         * <ul>
         * <li><strong>pl0</strong></li>
         * <li><strong>pl1</strong></li>
         * <li><strong>pl2</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only when SegStorageType is set to cloud_essd.</p>
         * </li>
         * <li><p>If you do not specify this parameter, pl1 is used.</p>
         * </li>
         * </ul>
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
         * <p>The number of compute nodes. The value description is as follows:</p>
         * <ul>
         * <li>For the high-availability version of the storage elastic mode, the value range is 4 to 512, and the value must be a multiple of 4.</li>
         * <li>For the basic version of the storage elastic mode, the value range is 2 to 512, and the value must be a multiple of 2.</li>
         * <li>For the Serverless mode, the value range is 2 to 512, and the value must be a multiple of 2.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when creating instances in the storage elastic mode or Serverless mode.</p>
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
         * <p>Disk storage type, currently only ESSD cloud disks are supported, with the value <strong>cloud_essd</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when creating an elastic storage mode instance.</p>
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
         * <p>The mode of the Serverless instance. The values are as follows:</p>
         * <ul>
         * <li><strong>Manual</strong>: Manual scheduling (default).</li>
         * <li><strong>Auto</strong>: Auto scheduling.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only for Serverless mode instances.</p>
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
         * <p>The threshold for computing resources. The value range is 8 to 32, with a step of 8, and the unit is ACU. The default value is 32.</p>
         * <blockquote>
         * <p>This parameter is required only for Serverless auto-scheduling mode instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder serverlessResource(Integer serverlessResource) {
            this.putQueryParameter("ServerlessResource", serverlessResource);
            this.serverlessResource = serverlessResource;
            return this;
        }

        /**
         * <p>ID of the source instance to be cloned.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> interface to view details of all AnalyticDB for PostgreSQL instances in the target region, including the instance ID.</p>
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
         * <p>VSwitch ID of the standby zone.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for multi-zone deployment.</li>
         * <li>The VSwitch ID of the standby zone must be in the same zone as the StandbyZoneId.</li>
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
         * <p>ID of the standby zone.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for multi-zone deployment.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available zone IDs.</li>
         * <li>The ID of the standby zone must be different from the ID of the primary zone.</li>
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
         * <p>The size of the storage space, in GB, with a value range of &lt;props=&quot;china&quot;&gt;50<del>8000&lt;props=&quot;intl&quot;&gt;50</del>6000.</p>
         * <blockquote>
         * <p>This parameter is required when creating an instance in the storage elastic mode.</p>
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
         * <p>This parameter is deprecated and should not be passed.</p>
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
         * <p>The Nth tag. The value of N ranges from 1 to 20.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Duration for which resources are purchased. The values are as follows:</p>
         * <ul>
         * <li>When <strong>Period</strong> is <strong>Month</strong>, the value ranges from 1 to 9.</li>
         * <li>When <strong>Period</strong> is <strong>Year</strong>, the value ranges from 1 to 3.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when creating a subscription-billed instance.</p>
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
         * <p>VPC ID.</p>
         * <blockquote>
         * <ul>
         * <li><strong>VPCId</strong> is required.</li>
         * <li>The region of the <strong>VPC</strong> must be consistent with <strong>RegionId</strong>.</li>
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
         * <p>vSwitch ID.</p>
         * <blockquote>
         * <ul>
         * <li><strong>vSwitchId</strong> is required.</li>
         * <li>The availability zone of the <strong>vSwitch</strong> must be consistent with <strong>ZoneId</strong>.</li>
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
         * <p>Whether to enable vector engine optimization. The value description is as follows:</p>
         * <ul>
         * <li><strong>enabled</strong>: Enable vector engine optimization.</li>
         * <li><strong>disabled</strong> (default): Do not enable vector engine optimization.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For mainstream analysis scenarios, data warehouse scenarios, and real-time data warehouse scenarios, it is recommended to <strong>not enable</strong> vector engine optimization.</li>
         * <li>For users using the vector analysis engine for AIGC, vector retrieval, and other scenarios, it is recommended to <strong>enable</strong> vector engine optimization.</li>
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
         * <p>Zone ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available zone IDs.</p>
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
             * AINodeNum.
             */
            public Builder AINodeNum(String AINodeNum) {
                this.AINodeNum = AINodeNum;
                return this;
            }

            /**
             * AINodeSpec.
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
             * <p>Tag key. The restrictions are as follows:</p>
             * <ul>
             * <li>It cannot be an empty string.</li>
             * <li>It supports up to 128 characters.</li>
             * <li>It cannot start with <code>aliyun</code> or <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</li>
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
             * <p>Tag value. The restrictions are as follows:</p>
             * <ul>
             * <li>It can be an empty string.</li>
             * <li>It supports up to 128 characters.</li>
             * <li>It cannot start with <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</li>
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
