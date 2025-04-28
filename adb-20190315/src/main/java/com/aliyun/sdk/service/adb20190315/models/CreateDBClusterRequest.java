// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetID")
    private String backupSetID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterClass")
    private String DBClusterClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeGroupCount")
    private String DBNodeGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
    private String DBNodeStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskEncryption")
    private Boolean diskEncryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticIOResource")
    private String elasticIOResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSSL")
    private Boolean enableSSL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutorCount")
    private String executorCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsId")
    private String kmsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

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
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.backupSetID = builder.backupSetID;
        this.clientToken = builder.clientToken;
        this.computeResource = builder.computeResource;
        this.DBClusterCategory = builder.DBClusterCategory;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.diskEncryption = builder.diskEncryption;
        this.elasticIOResource = builder.elasticIOResource;
        this.enableSSL = builder.enableSSL;
        this.executorCount = builder.executorCount;
        this.kmsId = builder.kmsId;
        this.mode = builder.mode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.storageResource = builder.storageResource;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetID
     */
    public String getBackupSetID() {
        return this.backupSetID;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterCategory
     */
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return DBNodeGroupCount
     */
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    /**
     * @return DBNodeStorage
     */
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    /**
     * @return diskEncryption
     */
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    /**
     * @return elasticIOResource
     */
    public String getElasticIOResource() {
        return this.elasticIOResource;
    }

    /**
     * @return enableSSL
     */
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return executorCount
     */
    public String getExecutorCount() {
        return this.executorCount;
    }

    /**
     * @return kmsId
     */
    public String getKmsId() {
        return this.kmsId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterRequest, Builder> {
        private String backupSetID; 
        private String clientToken; 
        private String computeResource; 
        private String DBClusterCategory; 
        private String DBClusterClass; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private Boolean diskEncryption; 
        private String elasticIOResource; 
        private Boolean enableSSL; 
        private String executorCount; 
        private String kmsId; 
        private String mode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstanceName; 
        private String storageResource; 
        private String storageType; 
        private java.util.List<Tag> tag; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest request) {
            super(request);
            this.backupSetID = request.backupSetID;
            this.clientToken = request.clientToken;
            this.computeResource = request.computeResource;
            this.DBClusterCategory = request.DBClusterCategory;
            this.DBClusterClass = request.DBClusterClass;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterNetworkType = request.DBClusterNetworkType;
            this.DBClusterVersion = request.DBClusterVersion;
            this.DBNodeGroupCount = request.DBNodeGroupCount;
            this.DBNodeStorage = request.DBNodeStorage;
            this.diskEncryption = request.diskEncryption;
            this.elasticIOResource = request.elasticIOResource;
            this.enableSSL = request.enableSSL;
            this.executorCount = request.executorCount;
            this.kmsId = request.kmsId;
            this.mode = request.mode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.storageResource = request.storageResource;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder backupSetID(String backupSetID) {
            this.putQueryParameter("BackupSetID", backupSetID);
            this.backupSetID = backupSetID;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The value is case-sensitive and can contain a maximum of 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-t7241****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The computing resources of the cluster. You can use computing resources to compute data. The increase in the computing resources can accelerate data queries. The computing resources are available for Cluster Edition and Basic Edition.</p>
         * <ul>
         * <li>Computing resources for Cluster Edition include 16 cores and 64 GB memory, 24 cores and 96 GB memory, and 32 cores or more. Cluster Edition supports resource isolation, scheduled scaling, and tiered storage of hot and cold data.</li>
         * <li>Computing resources for Basic Edition include 8 cores and 32 GB memory and 16 cores and 64 GB memory. Alibaba Cloud does not provide an SLA guarantee for Basic Edition, and 4 to 8 hours are required for a failover. We recommend that you do not use Basic Edition in production environments.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/190632.html">DescribeAvailableResource</a> operation to query the available computing resources in a region.</p>
         * </li>
         * <li><p>This parameter must be specified when Mode is set to <strong>Flexible</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32Core128GB</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Cluster</strong>: reserved mode for Cluster Edition</li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li><strong>MixedStorage</strong>: elastic mode for Cluster Edition</li>
         * </ul>
         * <blockquote>
         * <p> If the DBClusterCategory parameter is set to Cluster, you must set the Mode parameter to Reserver. If the DBClusterCategory parameter is set to MixedStorage, you must set the Mode parameter to Flexible. Otherwise, the cluster fails to be created.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        public Builder DBClusterCategory(String DBClusterCategory) {
            this.putQueryParameter("DBClusterCategory", DBClusterCategory);
            this.DBClusterCategory = DBClusterCategory;
            return this;
        }

        /**
         * <p>The specification of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>C8</strong></li>
         * <li><strong>C32</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the Mode parameter is set to Reserver.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C8</p>
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * <p>The description of the cluster.</p>
         * <ul>
         * <li>The description cannot start with <code>http://</code> or <code>https</code>.</li>
         * <li>The description must be 2 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The network type of the cluster. Set the value to <strong>VPC</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * <p>The version of the cluster. Set the value to <strong>3.0</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * <p>The number of node groups. Valid values: 1 to 200 (integer).</p>
         * <blockquote>
         * <p> This parameter is required if the Mode parameter is set to Reserver.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * <p>The storage capacity of the cluster. Unit: GB.</p>
         * <ul>
         * <li>Valid values when DBClusterClass is set to C8: 100 to 1000</li>
         * <li>Valid values when DBClusterClass is set to C32: 100 to 8000</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required if the Mode parameter is set to Reserver.</li>
         * <li>1000 The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * <p>Indicates whether disk encryption is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.putQueryParameter("DiskEncryption", diskEncryption);
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * <p>The number of elastic I/O units (EIUs). For more information, see <a href="https://help.aliyun.com/document_detail/189505.html">Elasticity of the storage layer</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder elasticIOResource(String elasticIOResource) {
            this.putQueryParameter("ElasticIOResource", elasticIOResource);
            this.elasticIOResource = elasticIOResource;
            return this;
        }

        /**
         * <p>Specifies whether to enable SSL encryption. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.putQueryParameter("EnableSSL", enableSSL);
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder executorCount(String executorCount) {
            this.putQueryParameter("ExecutorCount", executorCount);
            this.executorCount = executorCount;
            return this;
        }

        /**
         * <p>The Key Management Service (KMS) ID that is used for disk encryption. This parameter takes effect only when DiskEncryption is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx-xxxx-xxxx-xxxx-xxxx</p>
         */
        public Builder kmsId(String kmsId) {
            this.putQueryParameter("KmsId", kmsId);
            this.kmsId = kmsId;
            return this;
        }

        /**
         * <p>The mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Reserver</strong>: the reserved mode.</li>
         * <li><strong>Flexible</strong>: the elastic mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reserver</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
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
         * <p>The subscription type of the subscription cluster. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: subscription on a yearly basis</li>
         * <li><strong>Month</strong>: subscription on a monthly basis</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the PayType parameter is set to Prepaid.</p>
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
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4690g37929****</p>
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
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The tags to add to the cluster.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The subscription period of the subscription cluster.</p>
         * <ul>
         * <li>Valid values when Period is set to Year: 1, 2, and 3 (integer)</li>
         * <li>Valid values when Period is set to Month: 1 to 9 (integer)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required if the PayType parameter is set to Prepaid.</li>
         * <li>Longer subscription periods offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</li>
         * </ul>
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
         * <p>The virtual private cloud (VPC) ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1at5ze0t5u3xtqn****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1aadw9k19x6cis9****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent zone list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBClusterRequest build() {
            return new CreateDBClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateDBClusterRequest</p>
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
             * <p>The key of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
             * <blockquote>
             * <p> The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
             * <blockquote>
             * <p> The tag value can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
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
