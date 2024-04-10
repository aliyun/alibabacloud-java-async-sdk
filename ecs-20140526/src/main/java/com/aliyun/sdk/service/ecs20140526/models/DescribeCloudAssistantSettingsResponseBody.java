// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudAssistantSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantSettingsResponseBody</p>
 */
public class DescribeCloudAssistantSettingsResponseBody extends TeaModel {
    @NameInMap("AgentUpgradeConfig")
    private AgentUpgradeConfig agentUpgradeConfig;

    @NameInMap("OssDeliveryConfigs")
    private OssDeliveryConfigs ossDeliveryConfigs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsDeliveryConfigs")
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
         * 云助手Agent升级配置。
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
        @NameInMap("AllowedUpgradeWindow")
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
        @NameInMap("AllowedUpgradeWindows")
        private AllowedUpgradeWindows allowedUpgradeWindows;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("TimeZone")
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
             * 允许升级的时间段列表。
             */
            public Builder allowedUpgradeWindows(AllowedUpgradeWindows allowedUpgradeWindows) {
                this.allowedUpgradeWindows = allowedUpgradeWindows;
                return this;
            }

            /**
             * 是否开启自定义Agent升级配置。如查询结果为false或空，默认保持每30分钟尝试升级一次。
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * 允许升级时间段的时区。
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

        @NameInMap("DeliveryType")
        private String deliveryType;

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
             * *   SessionManager: session records
             * *   Invocation: task execution records
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
             * OSS encryption algorithm. Valid values:
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
             * The ID of the customer master key (CMK) when the encryption method is KMS.
             */
            public Builder encryptionKeyId(String encryptionKeyId) {
                this.encryptionKeyId = encryptionKeyId;
                return this;
            }

            /**
             * OSS encryption method. Valid values:
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
        @NameInMap("OssDeliveryConfig")
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
        @NameInMap("DeliveryType")
        private String deliveryType;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("LogstoreName")
        private String logstoreName;

        @NameInMap("ProjectName")
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
             * *   SessionManager: session records
             * *   Invocation: task execution records
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
        @NameInMap("SlsDeliveryConfig")
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
