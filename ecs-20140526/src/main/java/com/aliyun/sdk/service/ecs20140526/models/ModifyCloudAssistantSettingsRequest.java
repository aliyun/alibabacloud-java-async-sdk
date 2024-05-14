// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudAssistantSettingsRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudAssistantSettingsRequest</p>
 */
public class ModifyCloudAssistantSettingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentUpgradeConfig")
    private AgentUpgradeConfig agentUpgradeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssDeliveryConfig")
    private OssDeliveryConfig ossDeliveryConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String settingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfig")
    private SlsDeliveryConfig slsDeliveryConfig;

    private ModifyCloudAssistantSettingsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.agentUpgradeConfig = builder.agentUpgradeConfig;
        this.ossDeliveryConfig = builder.ossDeliveryConfig;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.settingType = builder.settingType;
        this.slsDeliveryConfig = builder.slsDeliveryConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudAssistantSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return agentUpgradeConfig
     */
    public AgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    /**
     * @return ossDeliveryConfig
     */
    public OssDeliveryConfig getOssDeliveryConfig() {
        return this.ossDeliveryConfig;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return settingType
     */
    public String getSettingType() {
        return this.settingType;
    }

    /**
     * @return slsDeliveryConfig
     */
    public SlsDeliveryConfig getSlsDeliveryConfig() {
        return this.slsDeliveryConfig;
    }

    public static final class Builder extends Request.Builder<ModifyCloudAssistantSettingsRequest, Builder> {
        private String sourceRegionId; 
        private AgentUpgradeConfig agentUpgradeConfig; 
        private OssDeliveryConfig ossDeliveryConfig; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String settingType; 
        private SlsDeliveryConfig slsDeliveryConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudAssistantSettingsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.agentUpgradeConfig = request.agentUpgradeConfig;
            this.ossDeliveryConfig = request.ossDeliveryConfig;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.settingType = request.settingType;
            this.slsDeliveryConfig = request.slsDeliveryConfig;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The configurations for upgrading Cloud Assistant Agent.
         */
        public Builder agentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
            String agentUpgradeConfigShrink = shrink(agentUpgradeConfig, "AgentUpgradeConfig", "json");
            this.putQueryParameter("AgentUpgradeConfig", agentUpgradeConfigShrink);
            this.agentUpgradeConfig = agentUpgradeConfig;
            return this;
        }

        /**
         * The configurations for delivering records to Object Storage Service (OSS).
         */
        public Builder ossDeliveryConfig(OssDeliveryConfig ossDeliveryConfig) {
            String ossDeliveryConfigShrink = shrink(ossDeliveryConfig, "OssDeliveryConfig", "json");
            this.putQueryParameter("OssDeliveryConfig", ossDeliveryConfigShrink);
            this.ossDeliveryConfig = ossDeliveryConfig;
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The Cloud Assistant feature. Valid values:
         * <p>
         * 
         * *   SessionManagerDelivery: the Session Record Delivery feature
         * *   InvocationDelivery: the Operation Content and Result Delivery feature
         */
        public Builder settingType(String settingType) {
            this.putQueryParameter("SettingType", settingType);
            this.settingType = settingType;
            return this;
        }

        /**
         * The configurations for delivering records to Simple Log Service.
         */
        public Builder slsDeliveryConfig(SlsDeliveryConfig slsDeliveryConfig) {
            String slsDeliveryConfigShrink = shrink(slsDeliveryConfig, "SlsDeliveryConfig", "json");
            this.putQueryParameter("SlsDeliveryConfig", slsDeliveryConfigShrink);
            this.slsDeliveryConfig = slsDeliveryConfig;
            return this;
        }

        @Override
        public ModifyCloudAssistantSettingsRequest build() {
            return new ModifyCloudAssistantSettingsRequest(this);
        } 

    } 

    public static class AgentUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindow")
        private java.util.List < String > allowedUpgradeWindow;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private AgentUpgradeConfig(Builder builder) {
            this.allowedUpgradeWindow = builder.allowedUpgradeWindow;
            this.enabled = builder.enabled;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentUpgradeConfig create() {
            return builder().build();
        }

        /**
         * @return allowedUpgradeWindow
         */
        public java.util.List < String > getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private java.util.List < String > allowedUpgradeWindow; 
            private Boolean enabled; 
            private String timeZone; 

            /**
             * The time windows during which Cloud Assistant Agent can be upgraded. The time windows can be accurate to minutes. The Coordinated Universal Time (UTC) time zone is used by default.
             * <p>
             * 
             * Make sure that the upgrade windows specified by this parameter are not shorter than 1 hour.
             * 
             * Specify each upgrade window in the following format: \<Start time in the HH:mm format>-\<End time in the HH:mm format>.
             * 
             * For example, \[ "02:00-03:00", "05:00-06:00" ] specifies that Cloud Assistant Agent can be upgraded from 2:00:00 to 3:00:00 and from 5:00:00 to 6:00:00 every day in the UTC time zone.
             */
            public Builder allowedUpgradeWindow(java.util.List < String > allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            /**
             * Specifies whether to enable custom upgrade for Cloud Assistant Agent. If you set this parameter to false, an upgrade attempt is performed for Cloud Assistant Agent every 30 minutes.
             * <p>
             * 
             * Default value: false.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The time zone of the time windows. Default value: UTC. You can specify a time zone in the following forms:
             * <p>
             * 
             * *   The time zone name. Examples: Asia/Shanghai and America/Los_Angeles.
             * *   The time offset from GMT. Examples: GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). You cannot add leading zeros to the hour value.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public AgentUpgradeConfig build() {
                return new AgentUpgradeConfig(this);
            } 

        } 

    }
    public static class OssDeliveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
        private String encryptionKeyId;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        private OssDeliveryConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.enabled = builder.enabled;
            this.encryptionAlgorithm = builder.encryptionAlgorithm;
            this.encryptionKeyId = builder.encryptionKeyId;
            this.encryptionType = builder.encryptionType;
            this.prefix = builder.prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDeliveryConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return encryptionAlgorithm
         */
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        /**
         * @return encryptionKeyId
         */
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        public static final class Builder {
            private String bucketName; 
            private Boolean enabled; 
            private String encryptionAlgorithm; 
            private String encryptionKeyId; 
            private String encryptionType; 
            private String prefix; 

            /**
             * The name of the OSS bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Specifies whether to deliver records to OSS. Default value: false.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The OSS encryption algorithm. Valid values:
             * <p>
             * 
             * *   AES256
             * *   SM4
             */
            public Builder encryptionAlgorithm(String encryptionAlgorithm) {
                this.encryptionAlgorithm = encryptionAlgorithm;
                return this;
            }

            /**
             * The ID of the customer master key (CMK) when EncryptionType is set to KMS.
             */
            public Builder encryptionKeyId(String encryptionKeyId) {
                this.encryptionKeyId = encryptionKeyId;
                return this;
            }

            /**
             * The OSS encryption method. Valid values:
             * <p>
             * 
             * *   Inherit: the encryption method used by the specified bucket.
             * *   OssManaged: server-side encryption by using OSS-managed keys (SSE-OSS).
             * *   KMS: server-side encryption by using Key Management Service managed keys (SSE-KMS).
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * The prefix of the OSS bucket directory. The prefix must meet the following requirements:
             * <p>
             * 
             * *   The prefix can be up to 254 characters in length.
             * *   The prefix cannot start with a forward slash (/) or a backslash (\\).
             * 
             * Note: If you do not need a directory prefix, specify a pair of double quotation marks ("") for this parameter to clear the directory prefix that you specified.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            public OssDeliveryConfig build() {
                return new OssDeliveryConfig(this);
            } 

        } 

    }
    public static class SlsDeliveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("LogstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private SlsDeliveryConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.logstoreName = builder.logstoreName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsDeliveryConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String logstoreName; 
            private String projectName; 

            /**
             * Specifies whether to deliver records to Simple Log Service. Default value: false.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The name of the Logstore.
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * The name of the Simple Log Service project.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public SlsDeliveryConfig build() {
                return new SlsDeliveryConfig(this);
            } 

        } 

    }
}
