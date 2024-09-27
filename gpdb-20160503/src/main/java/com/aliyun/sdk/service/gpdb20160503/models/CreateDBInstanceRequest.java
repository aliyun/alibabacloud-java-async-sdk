// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

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
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.createSampleData = builder.createSampleData;
        this.DBInstanceCategory = builder.DBInstanceCategory;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceMode = builder.DBInstanceMode;
        this.enableSSL = builder.enableSSL;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.idleTime = builder.idleTime;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceSpec = builder.instanceSpec;
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
        private String backupId; 
        private String clientToken; 
        private Boolean createSampleData; 
        private String DBInstanceCategory; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceGroupCount; 
        private String DBInstanceMode; 
        private Boolean enableSSL; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String engineVersion; 
        private Integer idleTime; 
        private String instanceNetworkType; 
        private String instanceSpec; 
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
        private Long storageSize; 
        private String storageType; 
        private java.util.List < Tag> tag; 
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
            this.backupId = request.backupId;
            this.clientToken = request.clientToken;
            this.createSampleData = request.createSampleData;
            this.DBInstanceCategory = request.DBInstanceCategory;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceGroupCount = request.DBInstanceGroupCount;
            this.DBInstanceMode = request.DBInstanceMode;
            this.enableSSL = request.enableSSL;
            this.encryptionKey = request.encryptionKey;
            this.encryptionType = request.encryptionType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.idleTime = request.idleTime;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instanceSpec = request.instanceSpec;
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
         * <p>The ID of the backup set.</p>
         * <blockquote>
         * <p> You can call the <a href="~~210093~~">DescribeDataBackups</a> operation to query the IDs of all backup sets in the instance.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. For more information, see <a href="~~327176~~">Ensure idempotence</a>.</p>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, no sample dataset is loaded.</p>
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
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>HighAvailability</strong>: High-availability Edition.</li>
         * <li><strong>Basic</strong>: Basic Edition.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when you create an instance in elastic storage mode.</p>
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
         * <p>The instance type of the instance. For information, see <a href="~~86942~~">Instance types</a>.</p>
         * <blockquote>
         * <p>This parameter must be specified when you create an instance in reserved storage mode.</p>
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
         * <p>This parameter must be specified when you create an instance in reserved storage mode.</p>
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
         * <li><strong>StorageElastic</strong>: elastic storage mode.</li>
         * <li><strong>Serverless</strong>: Serverless mode.</li>
         * <li><strong>Classic</strong>: reserved storage mode.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified.</p>
         * </blockquote>
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
         * EnableSSL.
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.putQueryParameter("EnableSSL", enableSSL);
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * <p>The ID of the encryption key.</p>
         * <blockquote>
         * <p>If EncryptionType is set to CloudDisk, you must specify an encryption key that resides in the same region as the cloud disk that is specified by EncryptionType. Otherwise, leave this parameter empty.</p>
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
         * <li><strong>NULL</strong> (default): Encryption is disabled.</li>
         * <li><strong>CloudDisk</strong>: Encryption is enabled on cloud disks, and EncryptionKey is used to specify an encryption key.</li>
         * </ul>
         * <blockquote>
         * <p>Disk encryption cannot be disabled after it is enabled.</p>
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
         * <p>The database engine of the instance. Set the value to gpdb.</p>
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
         * <p>The version of the database engine. Valid values:</p>
         * <ul>
         * <li>6.0</li>
         * <li>7.0</li>
         * </ul>
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
         * <p>The wait time for the instance that has no traffic to become idle. Minimum value: 60. Default value: 600. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
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
         * </blockquote>
         * <ul>
         * <li><p>Only the Virtual Private Cloud (VPC) type is supported in Alibaba Cloud public cloud.</p>
         * </li>
         * <li><p>If you do not specify this parameter, VPC is used.</p>
         * </li>
         * </ul>
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
         * <p>The specifications of compute nodes.</p>
         * <p>Valid values for High-availability Edition instances in elastic storage mode:</p>
         * <ul>
         * <li><strong>2C16G</strong></li>
         * <li><strong>4C32G</strong></li>
         * <li><strong>16C128G</strong></li>
         * </ul>
         * <p>Valid values for Basic Edition instances in elastic storage mode:</p>
         * <ul>
         * <li><strong>2C8G</strong></li>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * <li><strong>16C64G</strong></li>
         * </ul>
         * <p>Valid values for instances in Serverless mode:</p>
         * <ul>
         * <li><strong>4C16G</strong></li>
         * <li><strong>8C32G</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
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
         * <p>The amount of coordinator node resources. Valid values:</p>
         * <ul>
         * <li>2 CU</li>
         * <li>4 CU</li>
         * <li>8 CU</li>
         * <li>16 CU</li>
         * <li>32 CU</li>
         * </ul>
         * <blockquote>
         * <p> You are charged for coordinator node resources of more than 8 CUs.</p>
         * </blockquote>
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
         * <p>This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong></li>
         * <li><strong>Year</strong><blockquote>
         * <p>This parameter must be specified when PayType is set to Prepaid.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.*</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * ProdType.
         */
        public Builder prodType(String prodType) {
            this.putQueryParameter("ProdType", prodType);
            this.prodType = prodType;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="~~86912~~">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the instance belongs.</p>
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
         * <p>A value of 127.0.0.1 denies access from any external IP address. You can call the <a href="~~86928~~">ModifySecurityIps</a> operation to modify the IP address whitelist after you create an instance.</p>
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
         * <p>The number of compute nodes.</p>
         * <ul>
         * <li>Valid values for High-availability Edition instances in elastic storage mode: multiples of 4 in the range of 4 to 512.</li>
         * <li>Valid values for Basic Edition instances in elastic storage mode: multiples of 2 in the range of 2 to 512.</li>
         * <li>Valid values for instances in Serverless mode: multiples of 2 in the range of 2 to 512.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
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
         * <p>The disk storage type of the instance. Only enhanced SSDs (ESSDs) are supported. Set the value to cloud_essd.</p>
         * <blockquote>
         * <p>This parameter must be specified when you create an instance in elastic storage mode.</p>
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
         * <p>The type of the Serverless mode. Valid values:</p>
         * <ul>
         * <li><strong>Manual</strong> (default): manual scheduling.</li>
         * <li><strong>Auto</strong>: automatic scheduling.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified only when you create an instance in Serverless mode.</p>
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
         * <p>The threshold of computing resources. Unit: AnalyticDB compute unit (ACU). Valid values: 8 to 32. The value must be in increments of 8 ACUs. Default value: 32.</p>
         * <blockquote>
         * <p>This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
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
         * <p>The ID of the source instance.</p>
         * <blockquote>
         * <p> You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
         * <p>The storage capacity of the instance. Unit: GB. Valid values: 50 to 6000.</p>
         * <blockquote>
         * <p> This parameter must be specified when you create an instance in elastic storage mode.</p>
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
         * <p>This parameter is no longer used.</p>
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
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * <ul>
         * <li>Valid values when Period is set to Month: 1 to 9.</li>
         * <li>Valid values when Period is set to Year: 1 to 3.<blockquote>
         * <p>This parameter must be specified when PayType is set to Prepaid.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The VPC ID of the instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><strong>This parameter</strong> must be specified.</p>
         * </li>
         * <li><p>The region where the <strong>VPC</strong> resides must be the same as the region that is specified by <strong>RegionId</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><strong>This parameter</strong> must be specified.</p>
         * </li>
         * <li><p>The zone where the <strong>vSwitch</strong> resides must be the same as the zone that is specified by <strong>ZoneId</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp*******************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Specifies whether to enable vector search engine optimization. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong></li>
         * <li><strong>disabled</strong> (default)</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>We recommend that you <strong>do not enable</strong> vector search engine optimization in mainstream analysis, data warehousing, and real-time data warehousing scenarios.</p>
         * </li>
         * <li><p>We recommend that you <strong>enable</strong> vector search engine optimization in AI-generated content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</p>
         * </li>
         * </ul>
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
         * <p>The zone ID of the read-only instance. You can call the <a href="~~86912~~">DescribeRegions</a> operation to query the most recent zone list.</p>
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

            /**
             * <p>The key of tag N. Take note of the following requirements:</p>
             * <ul>
             * <li>The tag key cannot be an empty string.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and contain <code>http://</code> or <code>https://</code>.</li>
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
             * <p>The value of tag N. Take note of the following requirements:</p>
             * <ul>
             * <li>The tag key cannot be an empty string.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and contain <code>http://</code> or <code>https://</code>.</li>
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
