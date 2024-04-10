// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudAssistantSettingsRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudAssistantSettingsRequest</p>
 */
public class ModifyCloudAssistantSettingsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("AgentUpgradeConfig")
    private AgentUpgradeConfig agentUpgradeConfig;

    @Query
    @NameInMap("OssDeliveryConfig")
    private OssDeliveryConfig ossDeliveryConfig;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SettingType")
    @Validation(required = true)
    private String settingType;

    @Query
    @NameInMap("SlsDeliveryConfig")
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
         * 云助手Agent升级配置。
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
        @NameInMap("AllowedUpgradeWindow")
        private java.util.List < String > allowedUpgradeWindow;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("TimeZone")
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
             * 允许升级的时间段列表，可精确到分，默认为 UTC 时区。
             * <p>
             * 
             * 各时间段的间隔不能小于1小时。
             * 
             * 格式：开始时间(HH:mm)-结束时间(HH:mm)。
             * 
             * 如[
             * "02:00-03:00",
             * "05:00-06:00"
             * ]
             * 代表在 UTC 时区的每天2点-3点、5点-6点允许升级。
             */
            public Builder allowedUpgradeWindow(java.util.List < String > allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            /**
             * 是否开启自定义Agent升级配置。如设置为false，默认保持每30分钟尝试升级一次。
             * <p>
             * 
             * 默认值：false。
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * 允许升级时间段的时区。默认为 UTC 时区。
             * <p>
             * 时区支持以下两种形式：
             * - 时区全称： 如Asia/Shanghai（中国/上海时间）、America/Los_Angeles（美国/洛杉矶时间）等。
             * - 时区相对于格林威治时间的偏移量： 如GMT+8:00（东八区）、GMT-7:00（西七区）等。小时位不支持添加前导零。
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
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        @NameInMap("EncryptionKeyId")
        private String encryptionKeyId;

        @NameInMap("EncryptionType")
        private String encryptionType;

        @NameInMap("Prefix")
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
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("LogstoreName")
        private String logstoreName;

        @NameInMap("ProjectName")
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
