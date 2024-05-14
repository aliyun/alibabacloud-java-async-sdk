// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfigs")
    private SlsDeliveryConfigs slsDeliveryConfigs;

    private DescribeCloudAssistantSettingsResponseBody(Builder builder) {
        this.agentUpgradeConfig = builder.agentUpgradeConfig;
        this.ossDeliveryConfigs = builder.ossDeliveryConfigs;
        this.requestId = builder.requestId;
        this.slsDeliveryConfigs = builder.slsDeliveryConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantSettingsResponseBody create() {
        return builder().build();
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
     * @return slsDeliveryConfigs
     */
    public SlsDeliveryConfigs getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    public static final class Builder {
        private AgentUpgradeConfig agentUpgradeConfig; 
        private OssDeliveryConfigs ossDeliveryConfigs; 
        private String requestId; 
        private SlsDeliveryConfigs slsDeliveryConfigs; 

        /**
         * The configurations for upgrading Cloud Assistant Agent.
         */
        public Builder agentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
            this.agentUpgradeConfig = agentUpgradeConfig;
            return this;
        }

        /**
         * The configurations for delivering items to Object Storage Service (OSS).
         */
        public Builder ossDeliveryConfigs(OssDeliveryConfigs ossDeliveryConfigs) {
            this.ossDeliveryConfigs = ossDeliveryConfigs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations for delivering items to Simple Log Service.
         */
        public Builder slsDeliveryConfigs(SlsDeliveryConfigs slsDeliveryConfigs) {
            this.slsDeliveryConfigs = slsDeliveryConfigs;
            return this;
        }

        public DescribeCloudAssistantSettingsResponseBody build() {
            return new DescribeCloudAssistantSettingsResponseBody(this);
        } 

    } 

    public static class AllowedUpgradeWindows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindow")
        private java.util.List < String > allowedUpgradeWindow;

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
        public java.util.List < String > getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        public static final class Builder {
            private java.util.List < String > allowedUpgradeWindow; 

            /**
             * AllowedUpgradeWindow.
             */
            public Builder allowedUpgradeWindow(java.util.List < String > allowedUpgradeWindow) {
                this.allowedUpgradeWindow = allowedUpgradeWindow;
                return this;
            }

            public AllowedUpgradeWindows build() {
                return new AllowedUpgradeWindows(this);
            } 

        } 

    }
    public static class AgentUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedUpgradeWindows")
        private AllowedUpgradeWindows allowedUpgradeWindows;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private AgentUpgradeConfig(Builder builder) {
            this.allowedUpgradeWindows = builder.allowedUpgradeWindows;
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
            private Boolean enabled; 
            private String timeZone; 

            /**
             * The time windows during which Cloud Assistant Agent can be upgraded.
             */
            public Builder allowedUpgradeWindows(AllowedUpgradeWindows allowedUpgradeWindows) {
                this.allowedUpgradeWindows = allowedUpgradeWindows;
                return this;
            }

            /**
             * Indicates whether custom upgrade is enabled for Cloud Assistant Agent. If the value is false or empty, an upgrade attempt is performed for Cloud Assistant Agent every 30 minutes.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The time zone of the time windows.
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

            /**
             * The name of the OSS bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The type of items to be delivered. Valid values:
             * <p>
             * 
             * *   SessionManager: session records.
             * *   Invocation: task execution records.
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * Indicates whether to deliver the specified items to OSS.
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
             * *   KMS: server-side encryption with Key Management Service (SSE-KMS).
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * The prefix of the OSS bucket directory.
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
    public static class OssDeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssDeliveryConfig")
        private java.util.List < OssDeliveryConfig> ossDeliveryConfig;

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
        public java.util.List < OssDeliveryConfig> getOssDeliveryConfig() {
            return this.ossDeliveryConfig;
        }

        public static final class Builder {
            private java.util.List < OssDeliveryConfig> ossDeliveryConfig; 

            /**
             * OssDeliveryConfig.
             */
            public Builder ossDeliveryConfig(java.util.List < OssDeliveryConfig> ossDeliveryConfig) {
                this.ossDeliveryConfig = ossDeliveryConfig;
                return this;
            }

            public OssDeliveryConfigs build() {
                return new OssDeliveryConfigs(this);
            } 

        } 

    }
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

            /**
             * The type of items to be delivered. Valid values:
             * <p>
             * 
             * *   SessionManager: session records.
             * *   Invocation: task execution records.
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * Indicates whether to deliver the specified items to Simple Log Service.
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
    public static class SlsDeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfig")
        private java.util.List < SlsDeliveryConfig> slsDeliveryConfig;

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
        public java.util.List < SlsDeliveryConfig> getSlsDeliveryConfig() {
            return this.slsDeliveryConfig;
        }

        public static final class Builder {
            private java.util.List < SlsDeliveryConfig> slsDeliveryConfig; 

            /**
             * SlsDeliveryConfig.
             */
            public Builder slsDeliveryConfig(java.util.List < SlsDeliveryConfig> slsDeliveryConfig) {
                this.slsDeliveryConfig = slsDeliveryConfig;
                return this;
            }

            public SlsDeliveryConfigs build() {
                return new SlsDeliveryConfigs(this);
            } 

        } 

    }
}
