// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link RestoreDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestoreDBInstanceRequest</p>
 */
public class RestoreDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CNNodeCount")
    private String CNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloneInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloneInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnClass")
    private String cnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeCount")
    private Integer DBNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DNNodeCount")
    private String DNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnClass")
    private String dnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GdnRole")
    private String gdnRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZone")
    private String primaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryTypeCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recoveryTypeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZone")
    private String secondaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Series")
    private String series;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TertiaryZone")
    private String tertiaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopologyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topologyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private RestoreDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.backupSetId = builder.backupSetId;
        this.backupSetRegion = builder.backupSetRegion;
        this.CNNodeCount = builder.CNNodeCount;
        this.clientToken = builder.clientToken;
        this.cloneInstanceName = builder.cloneInstanceName;
        this.cnClass = builder.cnClass;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeCount = builder.DBNodeCount;
        this.DNNodeCount = builder.DNNodeCount;
        this.dnClass = builder.dnClass;
        this.engineVersion = builder.engineVersion;
        this.gdnRole = builder.gdnRole;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.primaryZone = builder.primaryZone;
        this.recoveryTypeCode = builder.recoveryTypeCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.restoreTime = builder.restoreTime;
        this.secondaryZone = builder.secondaryZone;
        this.series = builder.series;
        this.sourceInstanceRegion = builder.sourceInstanceRegion;
        this.storageType = builder.storageType;
        this.tertiaryZone = builder.tertiaryZone;
        this.topologyType = builder.topologyType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreDBInstanceRequest create() {
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
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return backupSetRegion
     */
    public String getBackupSetRegion() {
        return this.backupSetRegion;
    }

    /**
     * @return CNNodeCount
     */
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloneInstanceName
     */
    public String getCloneInstanceName() {
        return this.cloneInstanceName;
    }

    /**
     * @return cnClass
     */
    public String getCnClass() {
        return this.cnClass;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeCount
     */
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    /**
     * @return DNNodeCount
     */
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    /**
     * @return dnClass
     */
    public String getDnClass() {
        return this.dnClass;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return gdnRole
     */
    public String getGdnRole() {
        return this.gdnRole;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    /**
     * @return recoveryTypeCode
     */
    public String getRecoveryTypeCode() {
        return this.recoveryTypeCode;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return secondaryZone
     */
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return sourceInstanceRegion
     */
    public String getSourceInstanceRegion() {
        return this.sourceInstanceRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tertiaryZone
     */
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    /**
     * @return topologyType
     */
    public String getTopologyType() {
        return this.topologyType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
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

    public static final class Builder extends Request.Builder<RestoreDBInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private String backupSetId; 
        private String backupSetRegion; 
        private String CNNodeCount; 
        private String clientToken; 
        private String cloneInstanceName; 
        private String cnClass; 
        private String DBNodeClass; 
        private Integer DBNodeCount; 
        private String DNNodeCount; 
        private String dnClass; 
        private String engineVersion; 
        private String gdnRole; 
        private String networkType; 
        private String payType; 
        private String period; 
        private String primaryZone; 
        private String recoveryTypeCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String restoreTime; 
        private String secondaryZone; 
        private String series; 
        private String sourceInstanceRegion; 
        private String storageType; 
        private String tertiaryZone; 
        private String topologyType; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreDBInstanceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.backupSetId = request.backupSetId;
            this.backupSetRegion = request.backupSetRegion;
            this.CNNodeCount = request.CNNodeCount;
            this.clientToken = request.clientToken;
            this.cloneInstanceName = request.cloneInstanceName;
            this.cnClass = request.cnClass;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeCount = request.DBNodeCount;
            this.DNNodeCount = request.DNNodeCount;
            this.dnClass = request.dnClass;
            this.engineVersion = request.engineVersion;
            this.gdnRole = request.gdnRole;
            this.networkType = request.networkType;
            this.payType = request.payType;
            this.period = request.period;
            this.primaryZone = request.primaryZone;
            this.recoveryTypeCode = request.recoveryTypeCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.restoreTime = request.restoreTime;
            this.secondaryZone = request.secondaryZone;
            this.series = request.series;
            this.sourceInstanceRegion = request.sourceInstanceRegion;
            this.storageType = request.storageType;
            this.tertiaryZone = request.tertiaryZone;
            this.topologyType = request.topologyType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
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
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder backupSetRegion(String backupSetRegion) {
            this.putQueryParameter("BackupSetRegion", backupSetRegion);
            this.backupSetRegion = backupSetRegion;
            return this;
        }

        /**
         * CNNodeCount.
         */
        public Builder CNNodeCount(String CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
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
         * 
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        public Builder cloneInstanceName(String cloneInstanceName) {
            this.putQueryParameter("CloneInstanceName", cloneInstanceName);
            this.cloneInstanceName = cloneInstanceName;
            return this;
        }

        /**
         * CnClass.
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
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
         * DBNodeCount.
         */
        public Builder DBNodeCount(Integer DBNodeCount) {
            this.putQueryParameter("DBNodeCount", DBNodeCount);
            this.DBNodeCount = DBNodeCount;
            return this;
        }

        /**
         * DNNodeCount.
         */
        public Builder DNNodeCount(String DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * DnClass.
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * GdnRole.
         */
        public Builder gdnRole(String gdnRole) {
            this.putQueryParameter("GdnRole", gdnRole);
            this.gdnRole = gdnRole;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
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
         * PrimaryZone.
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Clone</p>
         */
        public Builder recoveryTypeCode(String recoveryTypeCode) {
            this.putQueryParameter("RecoveryTypeCode", recoveryTypeCode);
            this.recoveryTypeCode = recoveryTypeCode;
            return this;
        }

        /**
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SecondaryZone.
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * Series.
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder sourceInstanceRegion(String sourceInstanceRegion) {
            this.putQueryParameter("SourceInstanceRegion", sourceInstanceRegion);
            this.sourceInstanceRegion = sourceInstanceRegion;
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
         * TertiaryZone.
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
        public Builder topologyType(String topologyType) {
            this.putQueryParameter("TopologyType", topologyType);
            this.topologyType = topologyType;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*****</p>
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
        public RestoreDBInstanceRequest build() {
            return new RestoreDBInstanceRequest(this);
        } 

    } 

}
