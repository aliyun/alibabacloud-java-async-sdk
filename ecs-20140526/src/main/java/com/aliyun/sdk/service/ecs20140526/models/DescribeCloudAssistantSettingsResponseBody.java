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
 * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantSettingsResponseBody</p>
 */
public class DescribeCloudAssistantSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentUpgradeConfig")
    private AgentUpgradeConfig agentUpgradeConfig;

    @com.aliyun.core.annotation.NameInMap("OssDeliveryConfigs")
    private OssDeliveryConfigs ossDeliveryConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceUsageConfig")
    private ResourceUsageConfig resourceUsageConfig;

    @com.aliyun.core.annotation.NameInMap("SessionManagerConfig")
    private SessionManagerConfig sessionManagerConfig;

    @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfigs")
    private SlsDeliveryConfigs slsDeliveryConfigs;

    private DescribeCloudAssistantSettingsResponseBody(Builder builder) {
        this.agentUpgradeConfig = builder.agentUpgradeConfig;
        this.ossDeliveryConfigs = builder.ossDeliveryConfigs;
        this.requestId = builder.requestId;
        this.resourceUsageConfig = builder.resourceUsageConfig;
        this.sessionManagerConfig = builder.sessionManagerConfig;
        this.slsDeliveryConfigs = builder.slsDeliveryConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantSettingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentUpgradeConfig
     */
    public AgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    /**
     * @return ossDeliveryConfigs
     */
    public OssDeliveryConfigs getOssDeliveryConfigs() {
        return this.ossDeliveryConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return slsDeliveryConfigs
     */
    public SlsDeliveryConfigs getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    public static final class Builder {
        private AgentUpgradeConfig agentUpgradeConfig; 
        private OssDeliveryConfigs ossDeliveryConfigs; 
        private String requestId; 
        private ResourceUsageConfig resourceUsageConfig; 
        private SessionManagerConfig sessionManagerConfig; 
        private SlsDeliveryConfigs slsDeliveryConfigs; 

        private Builder() {
        } 

        private Builder(DescribeCloudAssistantSettingsResponseBody model) {
            this.agentUpgradeConfig = model.agentUpgradeConfig;
            this.ossDeliveryConfigs = model.ossDeliveryConfigs;
            this.requestId = model.requestId;
            this.resourceUsageConfig = model.resourceUsageConfig;
            this.sessionManagerConfig = model.sessionManagerConfig;
            this.slsDeliveryConfigs = model.slsDeliveryConfigs;
        } 

        /**
         * <p>The Cloud Assistant Agent upgrade configuration.</p>
         */
        public Builder agentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
            this.agentUpgradeConfig = agentUpgradeConfig;
            return this;
        }

        /**
         * OssDeliveryConfigs.
         */
        public Builder ossDeliveryConfigs(OssDeliveryConfigs ossDeliveryConfigs) {
            this.ossDeliveryConfigs = ossDeliveryConfigs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Cloud Assistant resource usage configuration.</p>
         */
        public Builder resourceUsageConfig(ResourceUsageConfig resourceUsageConfig) {
            this.resourceUsageConfig = resourceUsageConfig;
            return this;
        }

        /**
         * <p>The Cloud Assistant session feature configuration.</p>
         */
        public Builder sessionManagerConfig(SessionManagerConfig sessionManagerConfig) {
            this.sessionManagerConfig = sessionManagerConfig;
            return this;
        }

        /**
         * SlsDeliveryConfigs.
         */
        public Builder slsDeliveryConfigs(SlsDeliveryConfigs slsDeliveryConfigs) {
            this.slsDeliveryConfigs = slsDeliveryConfigs;
            return this;
        }

        public DescribeCloudAssistantSettingsResponseBody build() {
            return new DescribeCloudAssistantSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class AllowedUpgradeWindows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindow")
        private java.util.List<String> allowedUpgradeWindow;

        private AllowedUpgradeWindows(Builder builder) {
            this.allowedUpgradeWindow = builder.allowedUpgradeWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowedUpgradeWindows create() {
            return builder().build();
        }

        /**
         * @return allowedUpgradeWindow
         */
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        public static final class Builder {
            private java.util.List<String> allowedUpgradeWindow; 

            private Builder() {
            } 

            private Builder(AllowedUpgradeWindows model) {
                this.allowedUpgradeWindow = model.allowedUpgradeWindow;
            } 

            /**
             * AllowedUpgradeWindow.
             */
            public Builder allowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            public AllowedUpgradeWindows build() {
                return new AllowedUpgradeWindows(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class AgentUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindows")
        private AllowedUpgradeWindows allowedUpgradeWindows;

        @com.aliyun.core.annotation.NameInMap("BootstrapUpgrade")
        private Boolean bootstrapUpgrade;

        @com.aliyun.core.annotation.NameInMap("DisableUpgrade")
        private Boolean disableUpgrade;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private AgentUpgradeConfig(Builder builder) {
            this.allowedUpgradeWindows = builder.allowedUpgradeWindows;
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
         * @return allowedUpgradeWindows
         */
        public AllowedUpgradeWindows getAllowedUpgradeWindows() {
            return this.allowedUpgradeWindows;
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
            private AllowedUpgradeWindows allowedUpgradeWindows; 
            private Boolean bootstrapUpgrade; 
            private Boolean disableUpgrade; 
            private Boolean enabled; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(AgentUpgradeConfig model) {
                this.allowedUpgradeWindows = model.allowedUpgradeWindows;
                this.bootstrapUpgrade = model.bootstrapUpgrade;
                this.disableUpgrade = model.disableUpgrade;
                this.enabled = model.enabled;
                this.timeZone = model.timeZone;
            } 

            /**
             * AllowedUpgradeWindows.
             */
            public Builder allowedUpgradeWindows(AllowedUpgradeWindows allowedUpgradeWindows) {
                this.allowedUpgradeWindows = allowedUpgradeWindows;
                return this;
            }

            /**
             * <p>Indicates whether Cloud Assistant Agent checks for and performs updates immediately upon startup.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bootstrapUpgrade(Boolean bootstrapUpgrade) {
                this.bootstrapUpgrade = bootstrapUpgrade;
                return this;
            }

            /**
             * <p>Indicates whether Cloud Assistant Agent is prohibited from checking for and performing updates.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disableUpgrade(Boolean disableUpgrade) {
                this.disableUpgrade = disableUpgrade;
                return this;
            }

            /**
             * <p>Indicates whether the custom Agent upgrade configuration is enabled. If the value is false or empty, the default behavior is to attempt an upgrade every 30 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time zone of the allowed upgrade time windows.</p>
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
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class OssDeliveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

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
            this.deliveryType = builder.deliveryType;
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
         * @return deliveryType
         */
        public String getDeliveryType() {
            return this.deliveryType;
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
            private String deliveryType; 
            private Boolean enabled; 
            private String encryptionAlgorithm; 
            private String encryptionKeyId; 
            private String encryptionType; 
            private String prefix; 

            private Builder() {
            } 

            private Builder(OssDeliveryConfig model) {
                this.bucketName = model.bucketName;
                this.deliveryType = model.deliveryType;
                this.enabled = model.enabled;
                this.encryptionAlgorithm = model.encryptionAlgorithm;
                this.encryptionKeyId = model.encryptionKeyId;
                this.encryptionType = model.encryptionType;
                this.prefix = model.prefix;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * DeliveryType.
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * <p>Indicates whether the custom Agent upgrade configuration is enabled. If the value is false or empty, the default behavior is to attempt an upgrade every 30 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * EncryptionAlgorithm.
             */
            public Builder encryptionAlgorithm(String encryptionAlgorithm) {
                this.encryptionAlgorithm = encryptionAlgorithm;
                return this;
            }

            /**
             * EncryptionKeyId.
             */
            public Builder encryptionKeyId(String encryptionKeyId) {
                this.encryptionKeyId = encryptionKeyId;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * Prefix.
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
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class OssDeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssDeliveryConfig")
        private java.util.List<OssDeliveryConfig> ossDeliveryConfig;

        private OssDeliveryConfigs(Builder builder) {
            this.ossDeliveryConfig = builder.ossDeliveryConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return ossDeliveryConfig
         */
        public java.util.List<OssDeliveryConfig> getOssDeliveryConfig() {
            return this.ossDeliveryConfig;
        }

        public static final class Builder {
            private java.util.List<OssDeliveryConfig> ossDeliveryConfig; 

            private Builder() {
            } 

            private Builder(OssDeliveryConfigs model) {
                this.ossDeliveryConfig = model.ossDeliveryConfig;
            } 

            /**
             * OssDeliveryConfig.
             */
            public Builder ossDeliveryConfig(java.util.List<OssDeliveryConfig> ossDeliveryConfig) {
                this.ossDeliveryConfig = ossDeliveryConfig;
                return this;
            }

            public OssDeliveryConfigs build() {
                return new OssDeliveryConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
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
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cpuLimit(Integer cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * <p>Indicates whether the script file is retained in the Cloud Assistant directory after command execution is complete.</p>
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
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder logFileCountLimit(Integer logFileCountLimit) {
                this.logFileCountLimit = logFileCountLimit;
                return this;
            }

            /**
             * <p>The size limit of Cloud Assistant log files.</p>
             * 
             * <strong>example:</strong>
             * <p>100MB</p>
             */
            public Builder logSizeLimit(String logSizeLimit) {
                this.logSizeLimit = logSizeLimit;
                return this;
            }

            /**
             * <p>The maximum memory usage allowed for the Cloud Assistant Agent main process.</p>
             * 
             * <strong>example:</strong>
             * <p>35MB</p>
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * <p>The maximum number of consecutive times that CPU or memory resources usage can exceed the limit. When this limit is reached, Cloud Assistant Agent automatically stops running.</p>
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
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
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
             * <p>Specifies whether the Cloud Assistant session feature is enabled. Valid values:</p>
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
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class SlsDeliveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("LogstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private SlsDeliveryConfig(Builder builder) {
            this.deliveryType = builder.deliveryType;
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
         * @return deliveryType
         */
        public String getDeliveryType() {
            return this.deliveryType;
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
            private String deliveryType; 
            private Boolean enabled; 
            private String logstoreName; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(SlsDeliveryConfig model) {
                this.deliveryType = model.deliveryType;
                this.enabled = model.enabled;
                this.logstoreName = model.logstoreName;
                this.projectName = model.projectName;
            } 

            /**
             * DeliveryType.
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * <p>Indicates whether the custom Agent upgrade configuration is enabled. If the value is false or empty, the default behavior is to attempt an upgrade every 30 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * LogstoreName.
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * ProjectName.
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
    /**
     * 
     * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantSettingsResponseBody</p>
     */
    public static class SlsDeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfig")
        private java.util.List<SlsDeliveryConfig> slsDeliveryConfig;

        private SlsDeliveryConfigs(Builder builder) {
            this.slsDeliveryConfig = builder.slsDeliveryConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsDeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return slsDeliveryConfig
         */
        public java.util.List<SlsDeliveryConfig> getSlsDeliveryConfig() {
            return this.slsDeliveryConfig;
        }

        public static final class Builder {
            private java.util.List<SlsDeliveryConfig> slsDeliveryConfig; 

            private Builder() {
            } 

            private Builder(SlsDeliveryConfigs model) {
                this.slsDeliveryConfig = model.slsDeliveryConfig;
            } 

            /**
             * SlsDeliveryConfig.
             */
            public Builder slsDeliveryConfig(java.util.List<SlsDeliveryConfig> slsDeliveryConfig) {
                this.slsDeliveryConfig = slsDeliveryConfig;
                return this;
            }

            public SlsDeliveryConfigs build() {
                return new SlsDeliveryConfigs(this);
            } 

        } 

    }
}
