// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceUsageConfig")
    private ResourceUsageConfig resourceUsageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionManagerConfig")
    private SessionManagerConfig sessionManagerConfig;

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
        this.resourceUsageConfig = builder.resourceUsageConfig;
        this.sessionManagerConfig = builder.sessionManagerConfig;
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
     * @return resourceUsageConfig
     */
    public ResourceUsageConfig getResourceUsageConfig() {
        return this.resourceUsageConfig;
    }

    /**
     * @return sessionManagerConfig
     */
    public SessionManagerConfig getSessionManagerConfig() {
        return this.sessionManagerConfig;
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
        private ResourceUsageConfig resourceUsageConfig; 
        private SessionManagerConfig sessionManagerConfig; 
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
            this.resourceUsageConfig = request.resourceUsageConfig;
            this.sessionManagerConfig = request.sessionManagerConfig;
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
         * <p>The Cloud Assistant Agent upgrade configuration.</p>
         */
        public Builder agentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
            String agentUpgradeConfigShrink = shrink(agentUpgradeConfig, "AgentUpgradeConfig", "json");
            this.putQueryParameter("AgentUpgradeConfig", agentUpgradeConfigShrink);
            this.agentUpgradeConfig = agentUpgradeConfig;
            return this;
        }

        /**
         * <p>The OSS delivery configuration.</p>
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
         * <p>The region ID.</p>
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
         * <p>The Cloud Assistant resource usage configuration. This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
         * <ul>
         * <li><p>Windows: 2.1.4.1065</p>
         * </li>
         * <li><p>Linux: 2.2.4.1065</p>
         * </li>
         * </ul>
         */
        public Builder resourceUsageConfig(ResourceUsageConfig resourceUsageConfig) {
            String resourceUsageConfigShrink = shrink(resourceUsageConfig, "ResourceUsageConfig", "json");
            this.putQueryParameter("ResourceUsageConfig", resourceUsageConfigShrink);
            this.resourceUsageConfig = resourceUsageConfig;
            return this;
        }

        /**
         * <p>The Cloud Assistant session feature configuration.</p>
         */
        public Builder sessionManagerConfig(SessionManagerConfig sessionManagerConfig) {
            String sessionManagerConfigShrink = shrink(sessionManagerConfig, "SessionManagerConfig", "json");
            this.putQueryParameter("SessionManagerConfig", sessionManagerConfigShrink);
            this.sessionManagerConfig = sessionManagerConfig;
            return this;
        }

        /**
         * <p>The service configuration type. Valid values:</p>
         * <ul>
         * <li>SessionManagerDelivery: session operation log delivery.</li>
         * <li>InvocationDelivery: task execution log delivery.</li>
         * <li>AgentUpgradeConfig: Cloud Assistant Agent upgrade configuration.</li>
         * <li>SessionManagerConfig: Cloud Assistant SessionManager configuration.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionManagerDelivery</p>
         */
        public Builder settingType(String settingType) {
            this.putQueryParameter("SettingType", settingType);
            this.settingType = settingType;
            return this;
        }

        /**
         * <p>The Simple Log Service (SLS) delivery configuration.</p>
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

    /**
     * 
     * {@link ModifyCloudAssistantSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudAssistantSettingsRequest</p>
     */
    public static class AgentUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindow")
        private java.util.List<String> allowedUpgradeWindow;

        @com.aliyun.core.annotation.NameInMap("BootstrapUpgrade")
        private Boolean bootstrapUpgrade;

        @com.aliyun.core.annotation.NameInMap("DisableUpgrade")
        private Boolean disableUpgrade;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private AgentUpgradeConfig(Builder builder) {
            this.allowedUpgradeWindow = builder.allowedUpgradeWindow;
            this.bootstrapUpgrade = builder.bootstrapUpgrade;
            this.disableUpgrade = builder.disableUpgrade;
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
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        /**
         * @return bootstrapUpgrade
         */
        public Boolean getBootstrapUpgrade() {
            return this.bootstrapUpgrade;
        }

        /**
         * @return disableUpgrade
         */
        public Boolean getDisableUpgrade() {
            return this.disableUpgrade;
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
            private java.util.List<String> allowedUpgradeWindow; 
            private Boolean bootstrapUpgrade; 
            private Boolean disableUpgrade; 
            private Boolean enabled; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(AgentUpgradeConfig model) {
                this.allowedUpgradeWindow = model.allowedUpgradeWindow;
                this.bootstrapUpgrade = model.bootstrapUpgrade;
                this.disableUpgrade = model.disableUpgrade;
                this.enabled = model.enabled;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The list of time windows during which upgrades are allowed. The time can be specified down to the minute. The default time zone is UTC.</p>
             * <p>The interval between time windows cannot be less than 1 hour.</p>
             * <p>Format: Start time (HH:mm)-End time (HH:mm).</p>
             * <p>Example: [
             * &quot;02:00-03:00&quot;,
             * &quot;05:00-06:00&quot;
             * ]
             * This indicates that upgrades are allowed daily from 02:00 to 03:00 and from 05:00 to 06:00 in the UTC time zone.</p>
             */
            public Builder allowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            /**
             * <p>Specifies whether the Cloud Assistant Agent checks for updates and performs an upgrade immediately upon startup. Default value: true.</p>
             * <p>This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
             * <ul>
             * <li><p>Windows: 2.1.4.1065</p>
             * </li>
             * <li><p>Linux: 2.2.4.1065</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bootstrapUpgrade(Boolean bootstrapUpgrade) {
                this.bootstrapUpgrade = bootstrapUpgrade;
                return this;
            }

            /**
             * <p>Specifies whether to prevent the Cloud Assistant Agent from checking for and performing updates. Default value: false.</p>
             * <p>This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
             * <ul>
             * <li><p>Windows: 2.1.4.1065</p>
             * </li>
             * <li><p>Linux: 2.2.4.1065</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableUpgrade(Boolean disableUpgrade) {
                this.disableUpgrade = disableUpgrade;
                return this;
            }

            /**
             * <p>Specifies whether to enable the custom Agent upgrade configuration. If this parameter is set to false, the system attempts to upgrade the Agent every 30 minutes by default.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time zone for the allowed upgrade time windows. Default value: UTC.
             * The time zone can be specified in the following formats:</p>
             * <ul>
             * <li>Full time zone name, such as Asia/Shanghai or America/Los_Angeles.</li>
             * <li>GMT offset from Greenwich Mean Time, such as GMT+8:00 or GMT-7:00. Leading zeros are not supported for the hour value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
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
    /**
     * 
     * {@link ModifyCloudAssistantSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudAssistantSettingsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(OssDeliveryConfig model) {
                this.bucketName = model.bucketName;
                this.enabled = model.enabled;
                this.encryptionAlgorithm = model.encryptionAlgorithm;
                this.encryptionKeyId = model.encryptionKeyId;
                this.encryptionType = model.encryptionType;
                this.prefix = model.prefix;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>Specifies whether to enable delivery to OSS. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The OSS encryption algorithm. Valid values:</p>
             * <ul>
             * <li>AES256</li>
             * <li>SM4</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AES256</p>
             */
            public Builder encryptionAlgorithm(String encryptionAlgorithm) {
                this.encryptionAlgorithm = encryptionAlgorithm;
                return this;
            }

            /**
             * <p>The ID of the customer master key (CMK) when the encryption method is set to KMS.</p>
             * 
             * <strong>example:</strong>
             * <p>a807****7a70e</p>
             */
            public Builder encryptionKeyId(String encryptionKeyId) {
                this.encryptionKeyId = encryptionKeyId;
                return this;
            }

            /**
             * <p>The OSS encryption method. Valid values:</p>
             * <ul>
             * <li>Inherit: inherits the encryption method of the bucket.</li>
             * <li>OssManaged: OSS-managed encryption.</li>
             * <li>KMS: Key Management Service (KMS) encryption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inherit</p>
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The directory prefix of the OSS bucket. The following limits apply:</p>
             * <ul>
             * <li>The prefix cannot exceed 254 characters in length.</li>
             * <li>The prefix cannot start with a forward slash (/) or a backslash (\).</li>
             * </ul>
             * <blockquote>
             * <p>Note: Set this parameter to an empty string (&quot;&quot;) if no directory prefix is required. If a prefix was previously configured and is no longer needed, set this parameter to an empty string (&quot;&quot;) to clear it.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sessionmanager/audit</p>
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
    /**
     * 
     * {@link ModifyCloudAssistantSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudAssistantSettingsRequest</p>
     */
    public static class ResourceUsageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuLimit")
        private Integer cpuLimit;

        @com.aliyun.core.annotation.NameInMap("KeepScriptFile")
        private Boolean keepScriptFile;

        @com.aliyun.core.annotation.NameInMap("LogFileCountLimit")
        private Integer logFileCountLimit;

        @com.aliyun.core.annotation.NameInMap("LogSizeLimit")
        private String logSizeLimit;

        @com.aliyun.core.annotation.NameInMap("MemoryLimit")
        private String memoryLimit;

        @com.aliyun.core.annotation.NameInMap("OverloadLimit")
        private Integer overloadLimit;

        private ResourceUsageConfig(Builder builder) {
            this.cpuLimit = builder.cpuLimit;
            this.keepScriptFile = builder.keepScriptFile;
            this.logFileCountLimit = builder.logFileCountLimit;
            this.logSizeLimit = builder.logSizeLimit;
            this.memoryLimit = builder.memoryLimit;
            this.overloadLimit = builder.overloadLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceUsageConfig create() {
            return builder().build();
        }

        /**
         * @return cpuLimit
         */
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return keepScriptFile
         */
        public Boolean getKeepScriptFile() {
            return this.keepScriptFile;
        }

        /**
         * @return logFileCountLimit
         */
        public Integer getLogFileCountLimit() {
            return this.logFileCountLimit;
        }

        /**
         * @return logSizeLimit
         */
        public String getLogSizeLimit() {
            return this.logSizeLimit;
        }

        /**
         * @return memoryLimit
         */
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return overloadLimit
         */
        public Integer getOverloadLimit() {
            return this.overloadLimit;
        }

        public static final class Builder {
            private Integer cpuLimit; 
            private Boolean keepScriptFile; 
            private Integer logFileCountLimit; 
            private String logSizeLimit; 
            private String memoryLimit; 
            private Integer overloadLimit; 

            private Builder() {
            } 

            private Builder(ResourceUsageConfig model) {
                this.cpuLimit = model.cpuLimit;
                this.keepScriptFile = model.keepScriptFile;
                this.logFileCountLimit = model.logFileCountLimit;
                this.logSizeLimit = model.logSizeLimit;
                this.memoryLimit = model.memoryLimit;
                this.overloadLimit = model.overloadLimit;
            } 

            /**
             * <p>The maximum CPU usage allowed for the Cloud Assistant Agent main process.</p>
             * <ul>
             * <li><p>Unit: percentage.</p>
             * </li>
             * <li><p>Valid values: 10 to 95.</p>
             * </li>
             * <li><p>Default value: 20.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cpuLimit(Integer cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * <p>Specifies whether to retain the script file in the Cloud Assistant directory after command execution is complete.
             * Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keepScriptFile(Boolean keepScriptFile) {
                this.keepScriptFile = keepScriptFile;
                return this;
            }

            /**
             * <p>The maximum number of Cloud Assistant log files to retain.</p>
             * <ul>
             * <li>Default value: 30.</li>
             * <li>Minimum value: 7.</li>
             * <li>Maximum value: 365.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder logFileCountLimit(Integer logFileCountLimit) {
                this.logFileCountLimit = logFileCountLimit;
                return this;
            }

            /**
             * <p>The maximum size of a single Cloud Assistant log file. You must specify the unit (B|KB|MB).</p>
             * <ul>
             * <li>Default value: 100MB.</li>
             * <li>Minimum value: 10MB.</li>
             * <li>Maximum value: 1024MB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10MB</p>
             */
            public Builder logSizeLimit(String logSizeLimit) {
                this.logSizeLimit = logSizeLimit;
                return this;
            }

            /**
             * <p>The maximum memory usage allowed for the Cloud Assistant Agent main process. You must specify the unit (B|KB|MB).</p>
             * <ul>
             * <li>Default value: 50MB.</li>
             * <li>Minimum value: 35MB.</li>
             * <li>Maximum value: 1024MB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>50MB</p>
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * <p>The maximum number of consecutive times that CPU or memory resources usage can exceed the limit before the Cloud Assistant Agent automatically stops running.</p>
             * <ul>
             * <li>Default value: 3.</li>
             * <li>Minimum value: 3.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder overloadLimit(Integer overloadLimit) {
                this.overloadLimit = overloadLimit;
                return this;
            }

            public ResourceUsageConfig build() {
                return new ResourceUsageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCloudAssistantSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudAssistantSettingsRequest</p>
     */
    public static class SessionManagerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionManagerEnabled")
        private Boolean sessionManagerEnabled;

        private SessionManagerConfig(Builder builder) {
            this.sessionManagerEnabled = builder.sessionManagerEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionManagerConfig create() {
            return builder().build();
        }

        /**
         * @return sessionManagerEnabled
         */
        public Boolean getSessionManagerEnabled() {
            return this.sessionManagerEnabled;
        }

        public static final class Builder {
            private Boolean sessionManagerEnabled; 

            private Builder() {
            } 

            private Builder(SessionManagerConfig model) {
                this.sessionManagerEnabled = model.sessionManagerEnabled;
            } 

            /**
             * <p>Specifies whether to enable the Cloud Assistant session feature. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>Note:</p>
             * <ul>
             * <li>Enabling or disabling the session feature takes effect across all regions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sessionManagerEnabled(Boolean sessionManagerEnabled) {
                this.sessionManagerEnabled = sessionManagerEnabled;
                return this;
            }

            public SessionManagerConfig build() {
                return new SessionManagerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCloudAssistantSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudAssistantSettingsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SlsDeliveryConfig model) {
                this.enabled = model.enabled;
                this.logstoreName = model.logstoreName;
                this.projectName = model.projectName;
            } 

            /**
             * <p>Specifies whether to enable delivery to SLS.
             * Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the SLS Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>example-logstore</p>
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>example-project</p>
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
