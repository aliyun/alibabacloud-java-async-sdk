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
         * <p>The configurations for upgrading Cloud Assistant Agent.</p>
         */
        public Builder agentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
            String agentUpgradeConfigShrink = shrink(agentUpgradeConfig, "AgentUpgradeConfig", "json");
            this.putQueryParameter("AgentUpgradeConfig", agentUpgradeConfigShrink);
            this.agentUpgradeConfig = agentUpgradeConfig;
            return this;
        }

        /**
         * <p>The configurations for delivering records to Object Storage Service (OSS).</p>
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
         * <p>The Cloud Assistant feature. Valid values:</p>
         * <ul>
         * <li>SessionManagerDelivery: the Session Record Delivery configurations.</li>
         * <li>InvocationDelivery: the Operation Content and Result Delivery configurations.</li>
         * <li>AgentUpgradeConfig: the Cloud Assistant Agent Upgrade configurations.</li>
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
         * <p>The configurations for delivering records to Simple Log Service.</p>
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
        public java.util.List<String> getAllowedUpgradeWindow() {
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
            private java.util.List<String> allowedUpgradeWindow; 
            private Boolean enabled; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(AgentUpgradeConfig model) {
                this.allowedUpgradeWindow = model.allowedUpgradeWindow;
                this.enabled = model.enabled;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The time windows during which Cloud Assistant Agent can be upgraded. The time windows can be accurate to minutes. The Coordinated Universal Time (UTC) time zone is used by default.</p>
             * <p>Make sure that the upgrade windows specified by this parameter are not shorter than 1 hour.</p>
             * <p>Specify each upgrade window in the following format: &lt;Start time in the HH:mm format&gt;-&lt;End time in the HH:mm format&gt;.</p>
             * <p>For example, [ &quot;02:00-03:00&quot;, &quot;05:00-06:00&quot; ] specifies that Cloud Assistant Agent can be upgraded from 2:00:00 to 3:00:00 and from 5:00:00 to 6:00:00 every day in the UTC time zone.</p>
             */
            public Builder allowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            /**
             * <p>Specifies whether to enable custom upgrade for Cloud Assistant Agent. If you set this parameter to false, an upgrade attempt is performed for Cloud Assistant Agent every 30 minutes.</p>
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
             * <p>The time zone of the time windows. Default value: UTC. You can specify a time zone in the following forms:</p>
             * <ul>
             * <li>The time zone name. Examples: Asia/Shanghai and America/Los_Angeles.</li>
             * <li>The time offset from GMT. Examples: GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). You cannot add leading zeros to the hour value.</li>
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
             * <p>Specifies whether to deliver records to OSS. Default value: false.</p>
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
             * <p>The ID of the customer master key (CMK) when EncryptionType is set to KMS.</p>
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
             * <li>Inherit: the encryption method used by the specified bucket.</li>
             * <li>OssManaged: server-side encryption by using OSS-managed keys (SSE-OSS).</li>
             * <li>KMS: server-side encryption by using Key Management Service managed keys (SSE-KMS).</li>
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
             * <p>The prefix of the OSS bucket directory. The prefix must meet the following requirements:</p>
             * <ul>
             * <li>The prefix can be up to 254 characters in length.</li>
             * <li>The prefix cannot start with a forward slash (/) or a backslash (\).</li>
             * </ul>
             * <p>Note: If you do not need a directory prefix, specify a pair of double quotation marks (&quot;&quot;) for this parameter to clear the directory prefix that you specified.</p>
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
             * <p>Specifies whether to deliver records to Simple Log Service. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>example-logstore</p>
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
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
