// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aiFunction")
    private Boolean aiFunction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoBackup")
    private Boolean autoBackup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backupRestoreInfo")
    private BackupRestoreInfo backupRestoreInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbAdminPassword")
    private String dbAdminPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isMultiAzStorage")
    private Boolean isMultiAzStorage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("loadReplicas")
    private Integer loadReplicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("multiZoneMode")
    private String multiZoneMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("promotionNo")
    private String promotionNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vSwitchIds")
    private java.util.List<VSwitchIds> vSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aiFunction = builder.aiFunction;
        this.autoBackup = builder.autoBackup;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.backupRestoreInfo = builder.backupRestoreInfo;
        this.components = builder.components;
        this.configuration = builder.configuration;
        this.dbAdminPassword = builder.dbAdminPassword;
        this.dbVersion = builder.dbVersion;
        this.encrypted = builder.encrypted;
        this.ha = builder.ha;
        this.instanceName = builder.instanceName;
        this.isMultiAzStorage = builder.isMultiAzStorage;
        this.kmsKeyId = builder.kmsKeyId;
        this.loadReplicas = builder.loadReplicas;
        this.multiZoneMode = builder.multiZoneMode;
        this.nodeType = builder.nodeType;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.promotionNo = builder.promotionNo;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aiFunction
     */
    public Boolean getAiFunction() {
        return this.aiFunction;
    }

    /**
     * @return autoBackup
     */
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupRestoreInfo
     */
    public BackupRestoreInfo getBackupRestoreInfo() {
        return this.backupRestoreInfo;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return dbAdminPassword
     */
    public String getDbAdminPassword() {
        return this.dbAdminPassword;
    }

    /**
     * @return dbVersion
     */
    public String getDbVersion() {
        return this.dbVersion;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isMultiAzStorage
     */
    public Boolean getIsMultiAzStorage() {
        return this.isMultiAzStorage;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return loadReplicas
     */
    public Integer getLoadReplicas() {
        return this.loadReplicas;
    }

    /**
     * @return multiZoneMode
     */
    public String getMultiZoneMode() {
        return this.multiZoneMode;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<VSwitchIds> getVSwitchIds() {
        return this.vSwitchIds;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private Boolean aiFunction; 
        private Boolean autoBackup; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private BackupRestoreInfo backupRestoreInfo; 
        private java.util.List<Components> components; 
        private String configuration; 
        private String dbAdminPassword; 
        private String dbVersion; 
        private Boolean encrypted; 
        private Boolean ha; 
        private String instanceName; 
        private Boolean isMultiAzStorage; 
        private String kmsKeyId; 
        private Integer loadReplicas; 
        private String multiZoneMode; 
        private String nodeType; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String promotionNo; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private java.util.List<VSwitchIds> vSwitchIds; 
        private String vpcId; 
        private String zoneId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aiFunction = request.aiFunction;
            this.autoBackup = request.autoBackup;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.backupRestoreInfo = request.backupRestoreInfo;
            this.components = request.components;
            this.configuration = request.configuration;
            this.dbAdminPassword = request.dbAdminPassword;
            this.dbVersion = request.dbVersion;
            this.encrypted = request.encrypted;
            this.ha = request.ha;
            this.instanceName = request.instanceName;
            this.isMultiAzStorage = request.isMultiAzStorage;
            this.kmsKeyId = request.kmsKeyId;
            this.loadReplicas = request.loadReplicas;
            this.multiZoneMode = request.multiZoneMode;
            this.nodeType = request.nodeType;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.paymentType = request.paymentType;
            this.promotionNo = request.promotionNo;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable AI function.</p>
         */
        public Builder aiFunction(Boolean aiFunction) {
            this.putBodyParameter("aiFunction", aiFunction);
            this.aiFunction = aiFunction;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic backup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoBackup(Boolean autoBackup) {
            this.putBodyParameter("autoBackup", autoBackup);
            this.autoBackup = autoBackup;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
         * <ul>
         * <li>true: Automatic payment is enabled.</li>
         * <li>false: Only an order is generated. No payment is made.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("autoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the billing method of the instance is Subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The backup and restoration information.</p>
         */
        public Builder backupRestoreInfo(BackupRestoreInfo backupRestoreInfo) {
            this.putBodyParameter("backupRestoreInfo", backupRestoreInfo);
            this.backupRestoreInfo = backupRestoreInfo;
            return this;
        }

        /**
         * <p>The component information.</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * <p>The configuration items.</p>
         * 
         * <strong>example:</strong>
         * <p>rootCoord:
         *     maxDatabaseNum: 64 # Maximum number of database
         *     maxPartitionNum: 4096</p>
         */
        public Builder configuration(String configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The database password.</p>
         * 
         * <strong>example:</strong>
         * <p>test12</p>
         */
        public Builder dbAdminPassword(String dbAdminPassword) {
            this.putBodyParameter("dbAdminPassword", dbAdminPassword);
            this.dbAdminPassword = dbAdminPassword;
            return this;
        }

        /**
         * <p>The Milvus version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        public Builder dbVersion(String dbVersion) {
            this.putBodyParameter("dbVersion", dbVersion);
            this.dbVersion = dbVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable OSS encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putBodyParameter("encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>Specifies whether to enable high availability (HA).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>milvus-test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Specifies whether to enable multi-zone storage.</p>
         */
        public Builder isMultiAzStorage(Boolean isMultiAzStorage) {
            this.putBodyParameter("isMultiAzStorage", isMultiAzStorage);
            this.isMultiAzStorage = isMultiAzStorage;
            return this;
        }

        /**
         * <p>The ID of the KMS key used for encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>key-xxx</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("kmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The number of load replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder loadReplicas(Integer loadReplicas) {
            this.putBodyParameter("loadReplicas", loadReplicas);
            this.loadReplicas = loadReplicas;
            return this;
        }

        /**
         * <p>The zone configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        public Builder multiZoneMode(String multiZoneMode) {
            this.putBodyParameter("multiZoneMode", multiZoneMode);
            this.multiZoneMode = multiZoneMode;
            return this;
        }

        /**
         * <p>The node type. Valid values for Milvus standalone: perf, enhanced, and cap. Default value: perf.</p>
         * 
         * <strong>example:</strong>
         * <p>perf</p>
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The payment duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.putBodyParameter("paymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * <p>The unit of the payment duration.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putBodyParameter("paymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>The payment type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>22120151****</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putBodyParameter("promotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vsw-123xxx&quot;]</p>
         */
        public Builder vSwitchIds(java.util.List<VSwitchIds> vSwitchIds) {
            this.putBodyParameter("vSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123xxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The primary zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class BackupRestoreInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("backupName")
        private String backupName;

        @com.aliyun.core.annotation.NameInMap("sourceClusterId")
        private String sourceClusterId;

        private BackupRestoreInfo(Builder builder) {
            this.backupId = builder.backupId;
            this.backupName = builder.backupName;
            this.sourceClusterId = builder.sourceClusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupRestoreInfo create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupName
         */
        public String getBackupName() {
            return this.backupName;
        }

        /**
         * @return sourceClusterId
         */
        public String getSourceClusterId() {
            return this.sourceClusterId;
        }

        public static final class Builder {
            private String backupId; 
            private String backupName; 
            private String sourceClusterId; 

            private Builder() {
            } 

            private Builder(BackupRestoreInfo model) {
                this.backupId = model.backupId;
                this.backupName = model.backupName;
                this.sourceClusterId = model.sourceClusterId;
            } 

            /**
             * <p>The backup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bt-xxxxx</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The backup name.</p>
             * 
             * <strong>example:</strong>
             * <p>Backup1</p>
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * <p>The ID of the source cluster for the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>c-xxxxxxx</p>
             */
            public Builder sourceClusterId(String sourceClusterId) {
                this.sourceClusterId = sourceClusterId;
                return this;
            }

            public BackupRestoreInfo build() {
                return new BackupRestoreInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("storageClass")
        private String storageClass;

        private DataDisk(Builder builder) {
            this.enabled = builder.enabled;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String performanceLevel; 
            private Integer size; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.enabled = model.enabled;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
                this.storageClass = model.storageClass;
            } 

            /**
             * <p>Specifies whether to enable the QueryNode data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ESSD performance level (PL). Valid values: PL0, PL1, PL2, and PL3. If StorageClass is not specified, this parameter is used for parsing.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The data cloud disk capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The StorageClass of the data cloud disk. Valid values: alicloud-disk-essd-pl0, alicloud-disk-essd-pl1, alicloud-disk-essd-pl2, and alicloud-disk-essd-pl3.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud-disk-essd-pl1</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("cuType")
        private String cuType;

        @com.aliyun.core.annotation.NameInMap("dataDisk")
        private DataDisk dataDisk;

        @com.aliyun.core.annotation.NameInMap("diskSizeType")
        private String diskSizeType;

        @com.aliyun.core.annotation.NameInMap("replica")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Components(Builder builder) {
            this.cuNum = builder.cuNum;
            this.cuType = builder.cuType;
            this.dataDisk = builder.dataDisk;
            this.diskSizeType = builder.diskSizeType;
            this.replica = builder.replica;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return cuNum
         */
        public Integer getCuNum() {
            return this.cuNum;
        }

        /**
         * @return cuType
         */
        public String getCuType() {
            return this.cuType;
        }

        /**
         * @return dataDisk
         */
        public DataDisk getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return diskSizeType
         */
        public String getDiskSizeType() {
            return this.diskSizeType;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cuNum; 
            private String cuType; 
            private DataDisk dataDisk; 
            private String diskSizeType; 
            private Integer replica; 
            private String type; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.cuNum = model.cuNum;
                this.cuType = model.cuType;
                this.dataDisk = model.dataDisk;
                this.diskSizeType = model.diskSizeType;
                this.replica = model.replica;
                this.type = model.type;
            } 

            /**
             * <p>The number of compute units (CUs).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

            /**
             * <p>The CU type.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder cuType(String cuType) {
                this.cuType = cuType;
                return this;
            }

            /**
             * <p>The QueryNode data cloud disk configuration. This parameter is supported only when type is set to query.</p>
             */
            public Builder dataDisk(DataDisk dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The disk size type for the Query Node. Set this parameter to Large for storage-optimized instances, and to Normal for compute-optimized and other instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder diskSizeType(String diskSizeType) {
                this.diskSizeType = diskSizeType;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The component type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>standalone</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private VSwitchIds(Builder builder) {
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch ID configuration in the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxx</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
