// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateECSDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateECSDBInstanceRequest</p>
 */
public class CreateECSDBInstanceRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceCategory")
    private String DBInstanceCategory;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

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
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("InstanceSpec")
    @Validation(required = true)
    private String instanceSpec;

    @Query
    @NameInMap("MasterNodeNum")
    private Integer masterNodeNum;

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
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("SegNodeNum")
    @Validation(required = true, maximum = 2048, minimum = 2)
    private Integer segNodeNum;

    @Query
    @NameInMap("SegStorageType")
    @Validation(required = true)
    private String segStorageType;

    @Query
    @NameInMap("SrcDbInstanceName")
    private String srcDbInstanceName;

    @Query
    @NameInMap("StorageSize")
    @Validation(required = true, maximum = 4000, minimum = 50)
    private Integer storageSize;

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
    @Validation(required = true)
    private String zoneId;

    private CreateECSDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.DBInstanceCategory = builder.DBInstanceCategory;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceSpec = builder.instanceSpec;
        this.masterNodeNum = builder.masterNodeNum;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.securityIPList = builder.securityIPList;
        this.segNodeNum = builder.segNodeNum;
        this.segStorageType = builder.segStorageType;
        this.srcDbInstanceName = builder.srcDbInstanceName;
        this.storageSize = builder.storageSize;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateECSDBInstanceRequest create() {
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
     * @return DBInstanceCategory
     */
    public String getDBInstanceCategory() {
        return this.DBInstanceCategory;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
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
    public Integer getMasterNodeNum() {
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return segNodeNum
     */
    public Integer getSegNodeNum() {
        return this.segNodeNum;
    }

    /**
     * @return segStorageType
     */
    public String getSegStorageType() {
        return this.segStorageType;
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
    public Integer getStorageSize() {
        return this.storageSize;
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

    public static final class Builder extends Request.Builder<CreateECSDBInstanceRequest, Builder> {
        private String backupId; 
        private String clientToken; 
        private String DBInstanceCategory; 
        private String DBInstanceDescription; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String engineVersion; 
        private String instanceNetworkType; 
        private String instanceSpec; 
        private Integer masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private String securityIPList; 
        private Integer segNodeNum; 
        private String segStorageType; 
        private String srcDbInstanceName; 
        private Integer storageSize; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateECSDBInstanceRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.clientToken = response.clientToken;
            this.DBInstanceCategory = response.DBInstanceCategory;
            this.DBInstanceDescription = response.DBInstanceDescription;
            this.encryptionKey = response.encryptionKey;
            this.encryptionType = response.encryptionType;
            this.engine = response.engine;
            this.engineVersion = response.engineVersion;
            this.instanceNetworkType = response.instanceNetworkType;
            this.instanceSpec = response.instanceSpec;
            this.masterNodeNum = response.masterNodeNum;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.period = response.period;
            this.privateIpAddress = response.privateIpAddress;
            this.regionId = response.regionId;
            this.securityIPList = response.securityIPList;
            this.segNodeNum = response.segNodeNum;
            this.segStorageType = response.segStorageType;
            this.srcDbInstanceName = response.srcDbInstanceName;
            this.storageSize = response.storageSize;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
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
         * DBInstanceCategory.
         */
        public Builder DBInstanceCategory(String DBInstanceCategory) {
            this.putQueryParameter("DBInstanceCategory", DBInstanceCategory);
            this.DBInstanceCategory = DBInstanceCategory;
            return this;
        }

        /**
         * DBInstanceDescription.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionType.
         */
        public Builder encryptionType(String encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * MasterNodeNum.
         */
        public Builder masterNodeNum(Integer masterNodeNum) {
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
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
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
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
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
         * SegStorageType.
         */
        public Builder segStorageType(String segStorageType) {
            this.putQueryParameter("SegStorageType", segStorageType);
            this.segStorageType = segStorageType;
            return this;
        }

        /**
         * SrcDbInstanceName.
         */
        public Builder srcDbInstanceName(String srcDbInstanceName) {
            this.putQueryParameter("SrcDbInstanceName", srcDbInstanceName);
            this.srcDbInstanceName = srcDbInstanceName;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Integer storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
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
        public CreateECSDBInstanceRequest build() {
            return new CreateECSDBInstanceRequest(this);
        } 

    } 

}
