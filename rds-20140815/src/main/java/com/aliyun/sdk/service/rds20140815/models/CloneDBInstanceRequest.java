// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CloneDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CloneDBInstanceRequest</p>
 */
public class CloneDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BpeEnabled")
    private String bpeEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 65535, minLength = 1)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNames")
    private String dbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTable")
    private String restoreTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMeta")
    private String tableMeta;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private CloneDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.backupId = builder.backupId;
        this.backupType = builder.backupType;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.dbNames = builder.dbNames;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTable = builder.restoreTable;
        this.restoreTime = builder.restoreTime;
        this.serverlessConfig = builder.serverlessConfig;
        this.tableMeta = builder.tableMeta;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return bpeEnabled
     */
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ioAccelerationEnabled
     */
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restoreTable
     */
    public String getRestoreTable() {
        return this.restoreTable;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
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

    /**
     * @return zoneIdSlave1
     */
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    /**
     * @return zoneIdSlave2
     */
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static final class Builder extends Request.Builder<CloneDBInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String backupId; 
        private String backupType; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String category; 
        private String clientToken; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String dbNames; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private String instanceNetworkType; 
        private String ioAccelerationEnabled; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String restoreTable; 
        private String restoreTime; 
        private ServerlessConfig serverlessConfig; 
        private String tableMeta; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CloneDBInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.backupId = request.backupId;
            this.backupType = request.backupType;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.dbNames = request.dbNames;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.payType = request.payType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTable = request.restoreTable;
            this.restoreTime = request.restoreTime;
            this.serverlessConfig = request.serverlessConfig;
            this.tableMeta = request.tableMeta;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * <p>Specifies whether to enable the automatic payment feature for the new instance. Valid values:</p>
         * <ol>
         * <li><strong>true</strong>: enables the feature. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ol>
         * <blockquote>
         * <p> Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The backup set ID.</p>
         * <p>You can call the DescribeBackups operation to query the backup set ID.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>902****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The type of backup that is used to restore the data of the original instance. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementalBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * <p>An invalid parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
         * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</li>
         * </ul>
         * <p><strong>Serverless instances</strong></p>
         * <ul>
         * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: RDS High-availability Edition for ApsaraDB RDS for MySQL</li>
         * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server</li>
         * </ul>
         * <blockquote>
         * <p> You do not need to configure this parameter. The value of this parameter is the same as that of the original instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The instance type of the new instance. For information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <blockquote>
         * <p>By default, the new instance uses the same instance type as the original primary instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mysql.n1.micro.1</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance name. The value must be 2 to 255 characters in length The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> The value cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testInstance</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The storage capacity of the new instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <blockquote>
         * <p>By default, the new instance has the same storage capacity as the original primary instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>general_essd</strong> (recommend): general Enterprise SSD (ESSD)</li>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: performance level 1 (PL1) ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * </ul>
         * <blockquote>
         * <p> Serverless instances support only PL1 ESSDs and general ESSDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The name of the database. If you specify more than one database, the value is in the following format: <code>Original database name 1,Original database name 2</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test1,test2</p>
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * <p>The ID of the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9xxxxxxxx</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the release protection feature for the new instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The network type of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>Classic</strong></li>
         * </ul>
         * <blockquote>
         * <p>By default, the new instance has the same network type as the original primary instance.</p>
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
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit that is used to calculate the billing cycle of the new instance. This parameter takes effect only when you select the subscription billing method for the new instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The internal IP address of the new instance, which must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address based on the values of the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XXX.69</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to restore only the databases and tables that you specify. The value <strong>1</strong> specifies to restore only the specified databases and tables. If you do not want to restore only the specified databases or tables, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder restoreTable(String restoreTable) {
            this.putQueryParameter("RestoreTable", restoreTable);
            this.restoreTable = restoreTable;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore data. The point in time must fall within the specified backup retention period. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2011-06-11T16:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The specifications for the serverless instance. You must specify this parameter only when you restore data to a new serverless instance.</p>
         * <blockquote>
         * <p> This parameter is available only on the China site (aliyun.com).</p>
         * </blockquote>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The information about the database and table that you want to restore. The value is in the following format: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of Database 1&quot;,&quot;newname&quot;:&quot;New name of Database 1&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 1 in Database 1&quot;,&quot;newname&quot;:&quot;New name of Table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 2 in Database 1&quot;,&quot;newname&quot;:&quot;New name of Table 2&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of Database 2&quot;,&quot;newname&quot;:&quot;New name of Database 2&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 1 in Database 2&quot;,&quot;newname&quot;:&quot;New name of Table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 2 in Database 2&quot;,&quot;newname&quot;:&quot;New name of Table 2&quot;}]}]</code></p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1_new&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;testdb1table1&quot;,&quot;newname&quot;:&quot;testdb1table1_new&quot;}]}]</p>
         */
        public Builder tableMeta(String tableMeta) {
            this.putQueryParameter("TableMeta", tableMeta);
            this.tableMeta = tableMeta;
            return this;
        }

        /**
         * <p>The subscription duration of the new instance. Valid values:</p>
         * <ul>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the UsedTime parameter ranges from <strong>1 to 3</strong>.</li>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the UsedTime parameter ranges from <strong>1 to 9</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If you set the PayType parameter to <strong>Prepaid</strong>, you must also specify this parameter.</p>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <blockquote>
         * <p> Make sure that the VPC belongs to the required region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90xxxxxxxxxx</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
         * <ul>
         * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
         * <li>If you specify the <strong>ZoneSlaveId1</strong> parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2pxxxxxxxxxx</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the primary instance. You can call the DescribeRegions operation to query the zone ID.</p>
         * <blockquote>
         * <p> Set this value to the zone ID of the original instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary instance. If you set the ZoneIdSlave1 parameter and the <strong>ZoneId</strong> parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave1 parameter and the <strong>ZoneId</strong> parameter to different values, the multi-zone deployment method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * <p>The zone ID of the logger instance. If you set the ZoneIdSlave2 parameter to the same value as the <strong>ZoneId</strong> parameter, the single-zone deployment method is used. If you set the ZoneIdSlave2 parameter to a different value from the <strong>ZoneId</strong> parameter, the multi-zone deployment method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public CloneDBInstanceRequest build() {
            return new CloneDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CloneDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CloneDBInstanceRequest</p>
     */
    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPause")
        private Boolean autoPause;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Double maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Double minCapacity;

        @com.aliyun.core.annotation.NameInMap("SwitchForce")
        private Boolean switchForce;

        private ServerlessConfig(Builder builder) {
            this.autoPause = builder.autoPause;
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
            this.switchForce = builder.switchForce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return autoPause
         */
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        /**
         * @return maxCapacity
         */
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        /**
         * @return switchForce
         */
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

        public static final class Builder {
            private Boolean autoPause; 
            private Double maxCapacity; 
            private Double minCapacity; 
            private Boolean switchForce; 

            private Builder() {
            } 

            private Builder(ServerlessConfig model) {
                this.autoPause = model.autoPause;
                this.maxCapacity = model.maxCapacity;
                this.minCapacity = model.minCapacity;
                this.switchForce = model.switchForce;
            } 

            /**
             * <p>Specifies whether to enable the automatic start and stop feature for the serverless ApsaraDB RDS for MySQL instance. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection is established to the instance, the instance is automatically resumed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</li>
             * <li>This parameter is available only on the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 8</strong></li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 12</strong></li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong> and can be specified only to an <strong>integer</strong>.</li>
             * <li>This parameter is available only on the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs. Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 8</strong>.</li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 12</strong>.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</li>
             * <li>This parameter is available only on the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * <p>Specifies whether to enable the forced scaling feature for the serverless ApsaraDB RDS for MySQL instance. In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</p>
             * </li>
             * <li><p>This parameter is available only on the China site (aliyun.com).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder switchForce(Boolean switchForce) {
                this.switchForce = switchForce;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
}
