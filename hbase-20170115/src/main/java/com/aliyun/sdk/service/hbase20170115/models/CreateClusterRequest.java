// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    private String coldStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskQuantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreDiskQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceQuantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreInstanceQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceConnType")
    private String dbInstanceConnType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceType")
    private String dbInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepMode")
    private String depMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsColdStorage")
    private String isColdStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String masterInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.cloudType = builder.cloudType;
        this.clusterName = builder.clusterName;
        this.coldStorageSize = builder.coldStorageSize;
        this.coreDiskQuantity = builder.coreDiskQuantity;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceQuantity = builder.coreInstanceQuantity;
        this.coreInstanceType = builder.coreInstanceType;
        this.dbInstanceConnType = builder.dbInstanceConnType;
        this.dbInstanceType = builder.dbInstanceType;
        this.dbType = builder.dbType;
        this.depMode = builder.depMode;
        this.duration = builder.duration;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.isColdStorage = builder.isColdStorage;
        this.masterInstanceType = builder.masterInstanceType;
        this.netType = builder.netType;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.restoreTime = builder.restoreTime;
        this.securityIPList = builder.securityIPList;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
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
     * @return cloudType
     */
    public String getCloudType() {
        return this.cloudType;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return coldStorageSize
     */
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return coreDiskQuantity
     */
    public String getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    /**
     * @return coreDiskSize
     */
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceQuantity
     */
    public String getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return dbInstanceConnType
     */
    public String getDbInstanceConnType() {
        return this.dbInstanceConnType;
    }

    /**
     * @return dbInstanceType
     */
    public String getDbInstanceType() {
        return this.dbInstanceType;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return depMode
     */
    public String getDepMode() {
        return this.depMode;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
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
     * @return isColdStorage
     */
    public String getIsColdStorage() {
        return this.isColdStorage;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return srcDBInstanceId
     */
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String autoRenew; 
        private String backupId; 
        private String clientToken; 
        private String cloudType; 
        private String clusterName; 
        private String coldStorageSize; 
        private String coreDiskQuantity; 
        private String coreDiskSize; 
        private String coreDiskType; 
        private String coreInstanceQuantity; 
        private String coreInstanceType; 
        private String dbInstanceConnType; 
        private String dbInstanceType; 
        private String dbType; 
        private String depMode; 
        private String duration; 
        private String engine; 
        private String engineVersion; 
        private String isColdStorage; 
        private String masterInstanceType; 
        private String netType; 
        private String payType; 
        private String pricingCycle; 
        private String regionId; 
        private String restoreTime; 
        private String securityIPList; 
        private String srcDBInstanceId; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.backupId = request.backupId;
            this.clientToken = request.clientToken;
            this.cloudType = request.cloudType;
            this.clusterName = request.clusterName;
            this.coldStorageSize = request.coldStorageSize;
            this.coreDiskQuantity = request.coreDiskQuantity;
            this.coreDiskSize = request.coreDiskSize;
            this.coreDiskType = request.coreDiskType;
            this.coreInstanceQuantity = request.coreInstanceQuantity;
            this.coreInstanceType = request.coreInstanceType;
            this.dbInstanceConnType = request.dbInstanceConnType;
            this.dbInstanceType = request.dbInstanceType;
            this.dbType = request.dbType;
            this.depMode = request.depMode;
            this.duration = request.duration;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.isColdStorage = request.isColdStorage;
            this.masterInstanceType = request.masterInstanceType;
            this.netType = request.netType;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
            this.restoreTime = request.restoreTime;
            this.securityIPList = request.securityIPList;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder cloudType(String cloudType) {
            this.putQueryParameter("CloudType", cloudType);
            this.cloudType = cloudType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ColdStorageSize.
         */
        public Builder coldStorageSize(String coldStorageSize) {
            this.putQueryParameter("ColdStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder coreDiskQuantity(String coreDiskQuantity) {
            this.putQueryParameter("CoreDiskQuantity", coreDiskQuantity);
            this.coreDiskQuantity = coreDiskQuantity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder coreDiskSize(String coreDiskSize) {
            this.putQueryParameter("CoreDiskSize", coreDiskSize);
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder coreDiskType(String coreDiskType) {
            this.putQueryParameter("CoreDiskType", coreDiskType);
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder coreInstanceQuantity(String coreInstanceQuantity) {
            this.putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity);
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * DbInstanceConnType.
         */
        public Builder dbInstanceConnType(String dbInstanceConnType) {
            this.putQueryParameter("DbInstanceConnType", dbInstanceConnType);
            this.dbInstanceConnType = dbInstanceConnType;
            return this;
        }

        /**
         * DbInstanceType.
         */
        public Builder dbInstanceType(String dbInstanceType) {
            this.putQueryParameter("DbInstanceType", dbInstanceType);
            this.dbInstanceType = dbInstanceType;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * DepMode.
         */
        public Builder depMode(String depMode) {
            this.putQueryParameter("DepMode", depMode);
            this.depMode = depMode;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * IsColdStorage.
         */
        public Builder isColdStorage(String isColdStorage) {
            this.putQueryParameter("IsColdStorage", isColdStorage);
            this.isColdStorage = isColdStorage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
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
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SrcDBInstanceId.
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
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
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
