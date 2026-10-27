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
         * <p>Specifies whether to enable auto-renewal. Default value: true.</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The region where the backup set resides.</p>
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
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder CNNodeCount(String CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request. Use a different value for each request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx-xxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the source instance.</p>
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
         * <p>The compute node specifications. Valid values:</p>
         * <ul>
         * <li>polarx.x4.medium.2e: 2 cores, 8 GB</li>
         * <li>polarx.x4.large.2e: 4 cores, 16 GB</li>
         * <li>polarx.x8.large.2e: 4 cores, 32 GB</li>
         * <li>polarx.x4.xlarge.2e: 8 cores, 32 GB</li>
         * <li>polarx.x8.xlarge.2e: 8 cores, 64 GB</li>
         * <li>polarx.x4.2xlarge.2e: 16 cores, 64 GB</li>
         * <li>polarx.x8.2xlarge.2e: 16 cores, 128 GB</li>
         * <li>polarx.x4.4xlarge.2e: 32 cores, 128 GB</li>
         * <li>polarx.x8.4xlarge.2e: 32 cores, 256 GB</li>
         * <li>polarx.st.8xlarge.2e: 60 cores, 470 GB</li>
         * <li>polarx.st.12xlarge.2e: 90 cores, 720 GB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
            return this;
        }

        /**
         * <p>The node specifications. Valid values:</p>
         * <ul>
         * <li>polarx.x4.medium.2e: 2 cores, 8 GB</li>
         * <li>polarx.x4.large.2e: 4 cores, 16 GB</li>
         * <li>polarx.x8.large.2e: 4 cores, 32 GB</li>
         * <li>polarx.x4.xlarge.2e: 8 cores, 32 GB</li>
         * <li>polarx.x8.xlarge.2e: 8 cores, 64 GB</li>
         * <li>polarx.x4.2xlarge.2e: 16 cores, 64 GB</li>
         * <li>polarx.x8.2xlarge.2e: 16 cores, 128 GB</li>
         * <li>polarx.x4.4xlarge.2e: 32 cores, 128 GB</li>
         * <li>polarx.x8.4xlarge.2e: 32 cores, 256 GB</li>
         * <li>polarx.st.8xlarge.2e: 60 cores, 470 GB</li>
         * <li>polarx.st.12xlarge.2e: 90 cores, 720 GB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.2xlarge.2d</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The number of instance nodes. The minimum value is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBNodeCount(Integer DBNodeCount) {
            this.putQueryParameter("DBNodeCount", DBNodeCount);
            this.DBNodeCount = DBNodeCount;
            return this;
        }

        /**
         * <p>The number of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DNNodeCount(String DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * <p>The storage node specifications. Valid values:</p>
         * <ul>
         * <li>mysql.n4.medium.25: 2 cores, 8 GB</li>
         * <li>mysql.n4.large.25: 4 cores, 16 GB</li>
         * <li>mysql.x8.large.25: 4 cores, 32 GB</li>
         * <li>mysql.n4.xlarge.25: 8 cores, 32 GB</li>
         * <li>mysql.x8.xlarge.25: 8 cores, 64 GB</li>
         * <li>mysql.n4.2xlarge.25: 16 cores, 64 GB</li>
         * <li>mysql.x8.2xlarge.25: 16 cores, 128 GB</li>
         * <li>mysql.x4.4xlarge.25: 32 cores, 128 GB</li>
         * <li>mysql.x8.4xlarge.25: 32 cores, 256 GB</li>
         * <li>mysql.st.8xlarge.25: 60 cores, 470 GB</li>
         * <li>mysql.st.12xlarge.25: 90 cores, 720 GB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
            return this;
        }

        /**
         * <p>The MySQL DPI engine version. Valid values: 5.7 and 8.0.</p>
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
         * <p>The GDN role.</p>
         * 
         * <strong>example:</strong>
         * <p>standby</p>
         */
        public Builder gdnRole(String gdnRole) {
            this.putQueryParameter("GdnRole", gdnRole);
            this.gdnRole = gdnRole;
            return this;
        }

        /**
         * <p>The network type. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The billing method of the instance.</p>
         * <ul>
         * <li>PREPAY: subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
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
         * <p>The billing cycle. Valid values for subscription: Year and Month. Default value for pay-as-you-go: Hour.</p>
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
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * <p>The recovery type.</p>
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
         * <p>The region where the instance resides.</p>
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
         * <p>The resource group ID. This parameter can be left empty. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore the instance. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T00:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-a</p>
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * <p>The instance series. Valid values:</p>
         * <ul>
         * <li>enterprise: Enterprise Edition.</li>
         * <li>standard: Standard Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>The region where the source instance resides.</p>
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
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The zone for Three-zone deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li>3azones: three-zone deployment.</li>
         * <li>1azone: single-zone deployment.</li>
         * </ul>
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
         * <p>The subscription duration. Specify the number of months or years.</p>
         * <blockquote>
         * <p>If Period is set to Year, valid values of this parameter are 1, 2, and 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
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
