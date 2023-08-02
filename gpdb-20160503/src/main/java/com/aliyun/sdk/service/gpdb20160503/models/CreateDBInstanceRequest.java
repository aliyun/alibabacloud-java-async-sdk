// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CreateSampleData")
    private Boolean createSampleData;

    @Query
    @NameInMap("DBInstanceCategory")
    private String DBInstanceCategory;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceGroupCount")
    private String DBInstanceGroupCount;

    @Query
    @NameInMap("DBInstanceMode")
    private String DBInstanceMode;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("EncryptionType")
    private String encryptionType;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("IdleTime")
    private Integer idleTime;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("InstanceSpec")
    private String instanceSpec;

    @Query
    @NameInMap("MasterNodeNum")
    private String masterNodeNum;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    private String securityIPList;

    @Query
    @NameInMap("SegDiskPerformanceLevel")
    private String segDiskPerformanceLevel;

    @Query
    @NameInMap("SegNodeNum")
    private String segNodeNum;

    @Query
    @NameInMap("SegStorageType")
    private String segStorageType;

    @Query
    @NameInMap("ServerlessMode")
    private String serverlessMode;

    @Query
    @NameInMap("ServerlessResource")
    private Integer serverlessResource;

    @Query
    @NameInMap("StorageSize")
    private Long storageSize;

    @Query
    @NameInMap("StorageType")
    private String storageType;

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
    @NameInMap("VectorConfigurationStatus")
    private String vectorConfigurationStatus;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createSampleData = builder.createSampleData;
        this.DBInstanceCategory = builder.DBInstanceCategory;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceMode = builder.DBInstanceMode;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.idleTime = builder.idleTime;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceSpec = builder.instanceSpec;
        this.masterNodeNum = builder.masterNodeNum;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
        this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
        this.segNodeNum = builder.segNodeNum;
        this.segStorageType = builder.segStorageType;
        this.serverlessMode = builder.serverlessMode;
        this.serverlessResource = builder.serverlessResource;
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
        private String clientToken; 
        private Boolean createSampleData; 
        private String DBInstanceCategory; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceGroupCount; 
        private String DBInstanceMode; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String engineVersion; 
        private Integer idleTime; 
        private String instanceNetworkType; 
        private String instanceSpec; 
        private String masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String segDiskPerformanceLevel; 
        private String segNodeNum; 
        private String segStorageType; 
        private String serverlessMode; 
        private Integer serverlessResource; 
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
            this.clientToken = request.clientToken;
            this.createSampleData = request.createSampleData;
            this.DBInstanceCategory = request.DBInstanceCategory;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceGroupCount = request.DBInstanceGroupCount;
            this.DBInstanceMode = request.DBInstanceMode;
            this.encryptionKey = request.encryptionKey;
            this.encryptionType = request.encryptionType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.idleTime = request.idleTime;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instanceSpec = request.instanceSpec;
            this.masterNodeNum = request.masterNodeNum;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityIPList = request.securityIPList;
            this.segDiskPerformanceLevel = request.segDiskPerformanceLevel;
            this.segNodeNum = request.segNodeNum;
            this.segStorageType = request.segStorageType;
            this.serverlessMode = request.serverlessMode;
            this.serverlessResource = request.serverlessResource;
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
         * The client token that is used to ensure the idempotence of the request. For more information, see [Ensure idempotence](~~327176~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to load a sample dataset after the instance is created. Valid values:
         * <p>
         * 
         * - **true**
         * - **false**
         * 
         * If you do not specify this parameter, no sample dataset is loaded.
         */
        public Builder createSampleData(Boolean createSampleData) {
            this.putQueryParameter("CreateSampleData", createSampleData);
            this.createSampleData = createSampleData;
            return this;
        }

        /**
         * The edition of the instance. Valid values:
         * <p>
         * 
         * - **HighAvailability**: High-availability Edition.
         * - **Basic**: Basic Edition.
         * 
         * > This parameter must be specified when you create an instance in elastic storage mode.
         */
        public Builder DBInstanceCategory(String DBInstanceCategory) {
            this.putQueryParameter("DBInstanceCategory", DBInstanceCategory);
            this.DBInstanceCategory = DBInstanceCategory;
            return this;
        }

        /**
         * The instance type of the instance. For information, see [Instance types](~~86942~~).
         * <p>
         * 
         * > This parameter must be specified when you create an instance in reserved storage mode.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The number of compute groups. Valid values: 2, 4, 8, 12, 16, 24, 32, 64, 96, and 128.
         * <p>
         * 
         * > This parameter must be specified when you create an instance in reserved storage mode.
         */
        public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
            this.putQueryParameter("DBInstanceGroupCount", DBInstanceGroupCount);
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }

        /**
         * The resource type of the instance. Valid values:
         * <p>
         * 
         * - **StorageElastic**: elastic storage mode.
         * - **Serverless**: Serverless mode.
         * - **Classic**: reserved storage mode.
         * 
         * > This parameter must be specified.
         */
        public Builder DBInstanceMode(String DBInstanceMode) {
            this.putQueryParameter("DBInstanceMode", DBInstanceMode);
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }

        /**
         * The ID of the encryption key.
         * <p>
         * 
         * > If EncryptionType is set to CloudDisk, you must specify an encryption key that resides in the same region as the cloud disk that is specified by EncryptionType. Otherwise, leave this parameter empty.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The encryption type. Valid values:
         * <p>
         * 
         * - **NULL** (default): Encryption is disabled.
         * - **CloudDisk**: Encryption is enabled on cloud disks, and EncryptionKey is used to specify an encryption key.
         * 
         * > Disk encryption cannot be disabled after it is enabled.
         */
        public Builder encryptionType(String encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * The database engine of the instance. Set the value to gpdb.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The version of the database engine. Valid values:
         * <p>
         * 
         * - 6.0
         * - 7.0
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The wait time for the instance that has no traffic to become idle. Minimum value: 60. Default value: 600. Unit: seconds.
         * <p>
         * 
         * > This parameter must be specified only when you create an instance in automatic Serverless mode.
         */
        public Builder idleTime(Integer idleTime) {
            this.putQueryParameter("IdleTime", idleTime);
            this.idleTime = idleTime;
            return this;
        }

        /**
         * The network type of the instance. Set the value to VPC.
         * <p>
         * 
         * > 
         * - Only the Virtual Private Cloud (VPC) type is supported.
         * - If you do not specify this parameter, VPC is used.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The specifications of compute nodes.
         * <p>
         * 
         * Valid values for High-availability Edition instances in elastic storage mode:
         * 
         * - **2C16G**
         * - **4C32G**
         * - **16C128G**
         * 
         * Valid values for Basic Edition instances in elastic storage mode:
         * 
         * - **2C8G**
         * - **4C16G**
         * - **8C32G**
         * - **16C64G**
         * 
         * Valid values for instances in Serverless mode:
         * 
         * - **4C16G**
         * - **8C32G**
         * 
         * > This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * The number of coordinator nodes. Valid values: 1 and 2.
         * <p>
         * 
         * > If you do not specify this parameter, 1 is used.
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
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * - **Postpaid**: pay-as-you-go.
         * - **Prepaid**: subscription.
         * > 
         * - If you do not specify this parameter, Postpaid is used.
         * - You can obtain more cost savings if you create a subscription instance for one year or longer. We recommend that you select the billing method that best suits your needs.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * - **Month**
         * - **Year**
         * > This parameter must be specified when PayType is set to Prepaid.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The private IP address of the instance.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The IP address whitelist of the instance.
         * <p>
         * 
         * A value of 127.0.0.1 specifies that no IP address is allowed for external access. You can call the [ModifySecurityIps](~~86928~~) operation to modify the IP address whitelist after you create an instance.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * The performance level of ESSDs. Valid values:
         * <p>
         * 
         * - **pl0**
         * - **pl1**
         * - **pl2**
         * > 
         * - This parameter takes effect only when SegStorageType is set to cloud_essd.
         * - If you do not specify this parameter, pl1 is used.
         */
        public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
            this.putQueryParameter("SegDiskPerformanceLevel", segDiskPerformanceLevel);
            this.segDiskPerformanceLevel = segDiskPerformanceLevel;
            return this;
        }

        /**
         * The number of compute nodes.
         * <p>
         * 
         * - Valid values for High-availability Edition instances in elastic storage mode: multiples of 4 in the range of 4 to 512.
         * - Valid values for Basic Edition instances in elastic storage mode: multiples of 2 in the range of 2 to 512.
         * - Valid values for instances in Serverless mode: multiples of 2 in the range of 2 to 512.
         * 
         * > This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.
         */
        public Builder segNodeNum(String segNodeNum) {
            this.putQueryParameter("SegNodeNum", segNodeNum);
            this.segNodeNum = segNodeNum;
            return this;
        }

        /**
         * The disk storage type of the instance. Only enhanced SSDs (ESSDs) are supported. Set the value to cloud_essd.
         * <p>
         * 
         * > This parameter must be specified when you create an instance in elastic storage mode.
         */
        public Builder segStorageType(String segStorageType) {
            this.putQueryParameter("SegStorageType", segStorageType);
            this.segStorageType = segStorageType;
            return this;
        }

        /**
         * The type of the Serverless mode. Valid values:
         * <p>
         * 
         * - **Manual** (default): manual scheduling.
         * - **Auto**: automatic scheduling.
         * 
         * > This parameter must be specified only when you create an instance in Serverless mode.
         */
        public Builder serverlessMode(String serverlessMode) {
            this.putQueryParameter("ServerlessMode", serverlessMode);
            this.serverlessMode = serverlessMode;
            return this;
        }

        /**
         * The threshold of computing resources. Unit: AnalyticDB compute unit (ACU). Valid values: 8 to 32. The value must be in increments of 8 ACUs. Default value: 32.
         * <p>
         * 
         * > This parameter must be specified only when you create an instance in automatic Serverless mode.
         */
        public Builder serverlessResource(Integer serverlessResource) {
            this.putQueryParameter("ServerlessResource", serverlessResource);
            this.serverlessResource = serverlessResource;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: GB. Valid values: 50 to 4000.
         * <p>
         * 
         * > This parameter must be specified when you create an instance in elastic storage mode.
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * This parameter is no longer used.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The subscription duration.
         * <p>
         * 
         * - Valid values when Period is set to Month: 1 to 9.
         * - Valid values when Period is set to Year: 1 to 3.
         * > This parameter must be specified when PayType is set to Prepaid.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The VPC ID of the instance.
         * <p>
         * 
         * > 
         * - This parameter must be specified.
         * - The region where the VPC resides must be the same as the region that is specified by RegionId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID of the instance.
         * <p>
         * 
         * > 
         * - This parameter must be specified.
         * - The zone where the vSwitch resides must be the same as the zone that is specified by ZoneId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Specifies whether to enable vector engine optimization. Valid values:
         * <p>
         * 
         * - **enabled**
         * - **disabled** (default)
         * 
         * > 
         * - We recommend that you do not enable vector engine optimization in mainstream analysis and real-time data warehousing scenarios.
         * - We recommend that you enable vector engine optimization in AI Generated Content (AIGC) and vector retrieval scenarios that require the vector analysis engine.
         */
        public Builder vectorConfigurationStatus(String vectorConfigurationStatus) {
            this.putQueryParameter("VectorConfigurationStatus", vectorConfigurationStatus);
            this.vectorConfigurationStatus = vectorConfigurationStatus;
            return this;
        }

        /**
         * The zone ID of the read-only instance. You can call the [DescribeRegions](~~86912~~) operation to query the most recent zone list.
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
             * The key of tag N. Take note of the following requirements:
             * <p>
             * 
             * - The tag key cannot be an empty string.
             * - The tag key can be up to 128 characters in length.
             * - The tag key cannot start with `aliyun` or `acs:`, and contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N. Take note of the following requirements:
             * <p>
             * 
             * - The tag key cannot be an empty string.
             * - The tag key can be up to 128 characters in length.
             * - The tag key cannot start with `aliyun` or `acs:`, and contain `http://` or `https://`.
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
