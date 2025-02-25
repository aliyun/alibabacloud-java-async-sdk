// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link CreateShardingDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateShardingDBInstanceRequest</p>
 */
public class CreateShardingDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigServer")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ConfigServer> configServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestRegion")
    private String destRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenZoneId")
    private String hiddenZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mongos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Mongos> mongos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaSet")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ReplicaSet> replicaSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcRegion")
    private String srcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageEngine")
    private String storageEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateShardingDBInstanceRequest(Builder builder) {
        super(builder);
        this.accountPassword = builder.accountPassword;
        this.autoRenew = builder.autoRenew;
        this.backupId = builder.backupId;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.configServer = builder.configServer;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.destRegion = builder.destRegion;
        this.encrypted = builder.encrypted;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.hiddenZoneId = builder.hiddenZoneId;
        this.mongos = builder.mongos;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.protocolType = builder.protocolType;
        this.provisionedIops = builder.provisionedIops;
        this.regionId = builder.regionId;
        this.replicaSet = builder.replicaSet;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityIPList = builder.securityIPList;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.srcRegion = builder.srcRegion;
        this.storageEngine = builder.storageEngine;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShardingDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configServer
     */
    public java.util.List<ConfigServer> getConfigServer() {
        return this.configServer;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
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
     * @return globalSecurityGroupIds
     */
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    /**
     * @return hiddenZoneId
     */
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    /**
     * @return mongos
     */
    public java.util.List<Mongos> getMongos() {
        return this.mongos;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaSet
     */
    public java.util.List<ReplicaSet> getReplicaSet() {
        return this.replicaSet;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
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
     * @return srcRegion
     */
    public String getSrcRegion() {
        return this.srcRegion;
    }

    /**
     * @return storageEngine
     */
    public String getStorageEngine() {
        return this.storageEngine;
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

    public static final class Builder extends Request.Builder<CreateShardingDBInstanceRequest, Builder> {
        private String accountPassword; 
        private String autoRenew; 
        private String backupId; 
        private String chargeType; 
        private String clientToken; 
        private java.util.List<ConfigServer> configServer; 
        private String DBInstanceDescription; 
        private String destRegion; 
        private Boolean encrypted; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String globalSecurityGroupIds; 
        private String hiddenZoneId; 
        private java.util.List<Mongos> mongos; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String protocolType; 
        private Long provisionedIops; 
        private String regionId; 
        private java.util.List<ReplicaSet> replicaSet; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String secondaryZoneId; 
        private String securityIPList; 
        private String srcDBInstanceId; 
        private String srcRegion; 
        private String storageEngine; 
        private String storageType; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateShardingDBInstanceRequest request) {
            super(request);
            this.accountPassword = request.accountPassword;
            this.autoRenew = request.autoRenew;
            this.backupId = request.backupId;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.configServer = request.configServer;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.destRegion = request.destRegion;
            this.encrypted = request.encrypted;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.hiddenZoneId = request.hiddenZoneId;
            this.mongos = request.mongos;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.protocolType = request.protocolType;
            this.provisionedIops = request.provisionedIops;
            this.regionId = request.regionId;
            this.replicaSet = request.replicaSet;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityIPList = request.securityIPList;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.srcRegion = request.srcRegion;
            this.storageEngine = request.storageEngine;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The password of the root account. The password must meet the following requirements:</p>
         * <ul>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>The special characters include ! # $ % ^ &amp; * ( ) _ + - =</li>
         * <li>The password of the account must be 8 to 32 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123456Aa</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and optional if you set the value of <strong>ChargeType</strong> to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The ID of the backup set. </p>
         * <blockquote>
         * <p>When you call this operation to clone an instance based on the backup set, this parameter is required. The <strong>SrcDBInstanceId</strong> parameter is also required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cb-xxx</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
         * <li><strong>PrePaid</strong>: subscription</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to <strong>PrePaid</strong>, you must also configure the <strong>Period</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ConfigServer nodes of the instance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configServer(java.util.List<ConfigServer> configServer) {
            this.putQueryParameter("ConfigServer", configServer);
            this.configServer = configServer;
            return this;
        }

        /**
         * <p>The name of the instance. The name of the instance must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter.</li>
         * <li>It can contain digits, letters, underscores (_), and hyphens (-).</li>
         * <li>It must be 2 to 256 characters in length.</li>
         * </ul>
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
         * <p>The region of the backup set used for the cross-region backup and restoration.</p>
         * <blockquote>
         * <p> This parameter is required when you set the RestoreType parameter to 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The database engine of the instance. Set the value to <strong>MongoDB</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For more information about the limits on database versions and storage engines, see <a href="https://help.aliyun.com/document_detail/61906.html">MongoDB versions and storage engines</a>.</li>
         * <li>If you call this operation to clone an instance, set the value of this parameter to the database engine version of the source instance.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4.4</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The global IP address whitelist template of the instance. Separate multiple templates with commas (,). The template name must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>g-qxieqf40xjst1ngp****</p>
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * <p>The ID of secondary zone 2 for multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required if you set the value of <strong>EngineVersion</strong> to <strong>4.4</strong> or <strong>5.0</strong>.</li>
         * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong>.</li>
         * <li>For more information about the multi-zone deployment policy of a sharded cluster instance, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }

        /**
         * <p>The mongos nodes of the instance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mongos(java.util.List<Mongos> mongos) {
            this.putQueryParameter("Mongos", mongos);
            this.mongos = mongos;
            return this;
        }

        /**
         * <p>The network type of the instance.</p>
         * <p>Set the value to <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The subscription period of the instance. Unit: months.</p>
         * <p>Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
         * <blockquote>
         * <p>When you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>, this parameter is valid and required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The access protocol type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>mongodb</strong></li>
         * <li><strong>dynamodb</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mongodb</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The provisioned IOPS of the instance:</p>
         * 
         * <strong>example:</strong>
         * <p>1960</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The information of the shard node.</p>
         * <p>This parameter is required.</p>
         */
        public Builder replicaSet(java.util.List<ReplicaSet> replicaSet) {
            this.putQueryParameter("ReplicaSet", replicaSet);
            this.replicaSet = replicaSet;
            return this;
        }

        /**
         * <p>The resource group ID. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * <p>The point in time to restore the instance, which must be within seven days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in Coordinated Universal Time (UTC).</p>
         * <blockquote>
         * <p>This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify <strong>SrcDBInstanceId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-03-08T02:30:25Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The backup restore type of the instance.</p>
         * <ul>
         * <li>1:  restore an instance to the specified time.</li>
         * <li>2: restore an  released instance to the specified backup set.</li>
         * <li>3：restore an instance to the specified cross-regional backup set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The ID of secondary zone 1 for multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required if you set the value of <strong>EngineVersion</strong> to <strong>4.4</strong> or <strong>5.0</strong>.</li>
         * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>HiddenZoneId</strong>.</li>
         * <li>For more information about the multi-zone deployment policy of a sharded cluster instance, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * <p>The IP addresses in an IP address whitelist of the instance. Multiple IP addresses are separated by commas (,), and each IP address in the IP address whitelist must be unique. The following types of values are supported:</p>
         * <ul>
         * <li>0.0.0.0/0</li>
         * <li>IP addresses, such as 10.23.12.24.</li>
         * <li>CIDR blocks, such as 10.23.12.0/24. In this case, 24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.</li>
         * <li>If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance. Proceed with caution.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx,192.168.xx.xx</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The source instance ID.</p>
         * <blockquote>
         * <p>This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify <strong>RestoreTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dds-bp11483712c1****</p>
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <blockquote>
         * <p>This parameter is required when restore type is set to 2 or 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder srcRegion(String srcRegion) {
            this.putQueryParameter("SrcRegion", srcRegion);
            this.srcRegion = srcRegion;
            return this;
        }

        /**
         * <p>The storage engine of the instance. Set the value to <strong>WiredTiger</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If you call this operation to clone an instance, set the value of this parameter to the storage engine of the source instance.</li>
         * <li>For more information about the limits on database versions and storage engines, see <a href="https://help.aliyun.com/document_detail/61906.html">MongoDB versions and storage engines</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WiredTiger</p>
         */
        public Builder storageEngine(String storageEngine) {
            this.putQueryParameter("StorageEngine", storageEngine);
            this.storageEngine = storageEngine;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd1</strong>: ESSD PL1</li>
         * <li><strong>cloud_essd2</strong>: ESSD PL2</li>
         * <li><strong>cloud_essd3</strong>: ESSD PL3</li>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Instances of MongoDB 4.4 and later support only cloud disks. <strong>cloud_essd1</strong> is selected if you leave this parameter empty.</li>
         * <li>Instances of MongoDB 4.2 and earlier support only local disks. <strong>local_ssd</strong> is selected if you leave this parameter empty.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd1</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The custom tags that you want to add to the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1vj604nj5a9zz74****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateShardingDBInstanceRequest build() {
            return new CreateShardingDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateShardingDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateShardingDBInstanceRequest</p>
     */
    public static class ConfigServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Class")
        @com.aliyun.core.annotation.Validation(required = true)
        private String _class;

        @com.aliyun.core.annotation.NameInMap("Storage")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer storage;

        private ConfigServer(Builder builder) {
            this._class = builder._class;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigServer create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private String _class; 
            private Integer storage; 

            /**
             * <p>The instance type of the ConfigServer node. Valid values:</p>
             * <ul>
             * <li><strong>mdb.shard.2x.xlarge.d</strong>: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and later support this instance type.</li>
             * <li><strong>dds.cs.mid</strong> :1 core, 2 GB (general-purpose). Only instances that run MongoDB 4.2 and earlier support this instance type.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mdb.shard.2x.xlarge.d</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * <p>The storage space of the ConfigServer node. Unit: GB.</p>
             * <blockquote>
             * <p>The values that can be specified for this parameter vary based on the instance types. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            public ConfigServer build() {
                return new ConfigServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateShardingDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateShardingDBInstanceRequest</p>
     */
    public static class Mongos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Class")
        @com.aliyun.core.annotation.Validation(required = true)
        private String _class;

        private Mongos(Builder builder) {
            this._class = builder._class;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mongos create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        public static final class Builder {
            private String _class; 

            /**
             * <p>The instance type of the mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
             * <blockquote>
             * <ul>
             * <li><strong>N</strong> specifies the serial number of the mongos node for which the instance type is specified. For example, <strong>Mongos.2.Class</strong> specifies the instance type of the second mongos node.</li>
             * <li>Valid values for <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mdb.shard.2x.xlarge.d</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            public Mongos build() {
                return new Mongos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateShardingDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateShardingDBInstanceRequest</p>
     */
    public static class ReplicaSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Class")
        @com.aliyun.core.annotation.Validation(required = true)
        private String _class;

        @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
        @com.aliyun.core.annotation.Validation(maximum = 5)
        private Integer readonlyReplicas;

        @com.aliyun.core.annotation.NameInMap("Storage")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer storage;

        private ReplicaSet(Builder builder) {
            this._class = builder._class;
            this.readonlyReplicas = builder.readonlyReplicas;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSet create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return readonlyReplicas
         */
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private String _class; 
            private Integer readonlyReplicas; 
            private Integer storage; 

            /**
             * <p>The instance type of the shard node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
             * <blockquote>
             * <ul>
             * <li><strong>N</strong> specifies the serial number of the shard node for which the instance type is specified. For example, <strong>ReplicaSet.2.Class</strong> specifies the instance type of the second shard node.</li>
             * <li>Valid values of <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.shard.standard</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * <p>The number of read-only nodes in the shard node.</p>
             * <p>Valid values: <strong>0</strong>, <strong>1, 2, 3, 4, and 5</strong>. Default value: <strong>0</strong>.</p>
             * <blockquote>
             * <p> <strong>N</strong> specifies the serial number of the shard node for which you want to set the number of read-only nodes. <strong>ReplicaSet.2.ReadonlyReplicas</strong> specifies the number of read-only nodes in the second shard node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * <p>The storage capacity of the shard node. Unit: GB.</p>
             * <blockquote>
             * <ul>
             * <li>The values that can be specified for this parameter vary based on the instance types. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
             * <li><strong>N</strong> specifies the serial number of the shard node for which the storage space is specified. For example, <strong>ReplicaSet.2.Storage</strong> specifies the storage space of the second shard node.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            public ReplicaSet build() {
                return new ReplicaSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateShardingDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateShardingDBInstanceRequest</p>
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
             * <p>The tag key.</p>
             * <blockquote>
             * <p> <strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag and <strong>Tag.2.Key</strong> specifies the key of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testdatabase</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <blockquote>
             * <p> <strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag and Tag.2.Value specifies the value of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>apitest</p>
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
