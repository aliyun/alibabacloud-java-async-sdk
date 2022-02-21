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
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    private String securityIPList;

    @Query
    @NameInMap("SegNodeNum")
    private String segNodeNum;

    @Query
    @NameInMap("SegStorageType")
    private String segStorageType;

    @Query
    @NameInMap("StorageSize")
    private Long storageSize;

    @Query
    @NameInMap("StorageType")
    private String storageType;

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

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceCategory = builder.DBInstanceCategory;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceMode = builder.DBInstanceMode;
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
        this.storageSize = builder.storageSize;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
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

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String clientToken; 
        private String DBInstanceCategory; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceGroupCount; 
        private String DBInstanceMode; 
        private String engine; 
        private String engineVersion; 
        private String instanceNetworkType; 
        private String instanceSpec; 
        private String masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private String securityIPList; 
        private String segNodeNum; 
        private String segStorageType; 
        private Long storageSize; 
        private String storageType; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBInstanceCategory = response.DBInstanceCategory;
            this.DBInstanceClass = response.DBInstanceClass;
            this.DBInstanceDescription = response.DBInstanceDescription;
            this.DBInstanceGroupCount = response.DBInstanceGroupCount;
            this.DBInstanceMode = response.DBInstanceMode;
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
            this.storageSize = response.storageSize;
            this.storageType = response.storageType;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
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
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
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
         * DBInstanceGroupCount.
         */
        public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
            this.putQueryParameter("DBInstanceGroupCount", DBInstanceGroupCount);
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }

        /**
         * DBInstanceMode.
         */
        public Builder DBInstanceMode(String DBInstanceMode) {
            this.putQueryParameter("DBInstanceMode", DBInstanceMode);
            this.DBInstanceMode = DBInstanceMode;
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
        public Builder segNodeNum(String segNodeNum) {
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
         * StorageSize.
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
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
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

}
