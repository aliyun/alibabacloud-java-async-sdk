// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link GetAttackTargetResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttackTargetResponseBody</p>
 */
public class GetAttackTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttackTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAttackTargetResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The scan target details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttackTargetResponseBody build() {
            return new GetAttackTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAttackTargetResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttackTargetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionConfig")
        private String connectionConfig;

        @com.aliyun.core.annotation.NameInMap("ConnectionMethod")
        private String connectionMethod;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("LastScanFailMessage")
        private String lastScanFailMessage;

        @com.aliyun.core.annotation.NameInMap("LastScanStatus")
        private String lastScanStatus;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("ScanCount")
        private Long scanCount;

        @com.aliyun.core.annotation.NameInMap("ScanTaskConfig")
        private String scanTaskConfig;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.connectionConfig = builder.connectionConfig;
            this.connectionMethod = builder.connectionMethod;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.firstScanTime = builder.firstScanTime;
            this.lastScanFailMessage = builder.lastScanFailMessage;
            this.lastScanStatus = builder.lastScanStatus;
            this.lastScanTime = builder.lastScanTime;
            this.modelName = builder.modelName;
            this.modifyTime = builder.modifyTime;
            this.provider = builder.provider;
            this.riskLevel = builder.riskLevel;
            this.scanCount = builder.scanCount;
            this.scanTaskConfig = builder.scanTaskConfig;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionConfig
         */
        public String getConnectionConfig() {
            return this.connectionConfig;
        }

        /**
         * @return connectionMethod
         */
        public String getConnectionMethod() {
            return this.connectionMethod;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return lastScanFailMessage
         */
        public String getLastScanFailMessage() {
            return this.lastScanFailMessage;
        }

        /**
         * @return lastScanStatus
         */
        public String getLastScanStatus() {
            return this.lastScanStatus;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return scanCount
         */
        public Long getScanCount() {
            return this.scanCount;
        }

        /**
         * @return scanTaskConfig
         */
        public String getScanTaskConfig() {
            return this.scanTaskConfig;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String connectionConfig; 
            private String connectionMethod; 
            private Long createTime; 
            private String description; 
            private String endpoint; 
            private Long firstScanTime; 
            private String lastScanFailMessage; 
            private String lastScanStatus; 
            private Long lastScanTime; 
            private String modelName; 
            private Long modifyTime; 
            private String provider; 
            private String riskLevel; 
            private Long scanCount; 
            private String scanTaskConfig; 
            private String targetId; 
            private String targetName; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectionConfig = model.connectionConfig;
                this.connectionMethod = model.connectionMethod;
                this.createTime = model.createTime;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.firstScanTime = model.firstScanTime;
                this.lastScanFailMessage = model.lastScanFailMessage;
                this.lastScanStatus = model.lastScanStatus;
                this.lastScanTime = model.lastScanTime;
                this.modelName = model.modelName;
                this.modifyTime = model.modifyTime;
                this.provider = model.provider;
                this.riskLevel = model.riskLevel;
                this.scanCount = model.scanCount;
                this.scanTaskConfig = model.scanTaskConfig;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The advanced connection configuration (JSON character string). For common fields and provider configuration templates, refer to the ConnectionConfig parameter of CreateAttackTarget.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;httpMethod\&quot;:\&quot;POST\&quot;,\&quot;authType\&quot;:\&quot;bearer\&quot;,\&quot;timeoutMs\&quot;:30000,\&quot;requestTemplate\&quot;:\&quot;{\\\&quot;input\\\&quot;:{\\\&quot;prompt\\\&quot;:\\\&quot;{{prompt}}\\\&quot;},\\\&quot;parameters\\\&quot;:{\\\&quot;incremental_output\\\&quot;:true},\\\&quot;debug\\\&quot;:{}}\&quot;,\&quot;messageJsonPath\&quot;:\&quot;$.output.text\&quot;,\&quot;requestHeaders\&quot;:\&quot;{\\\&quot;X-DashScope-SSE\\\&quot;: \\\&quot;enable\\\&quot; }\&quot;,\&quot;stream\&quot;:true,\&quot;customAuthHeaderName\&quot;:\&quot;\&quot;}</p>
             */
            public Builder connectionConfig(String connectionConfig) {
                this.connectionConfig = connectionConfig;
                return this;
            }

            /**
             * <p>The connection protocol type of the target service.</p>
             * 
             * <strong>example:</strong>
             * <p>openai</p>
             */
            public Builder connectionMethod(String connectionMethod) {
                this.connectionMethod = connectionMethod;
                return this;
            }

            /**
             * <p>The time when the target was created. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the scan target. This value may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Production Bailian application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS endpoint of the target model service. When ConnectionMethod is set to enterprise_relay, this value is a fixed internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The time of the first scan. This value is a UNIX timestamp in milliseconds. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The failure reason of the most recent scan task. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
             * 
             * <strong>example:</strong>
             * <p>Execution timed out</p>
             */
            public Builder lastScanFailMessage(String lastScanFailMessage) {
                this.lastScanFailMessage = lastScanFailMessage;
                return this;
            }

            /**
             * <p>The status of the most recent scan task. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder lastScanStatus(String lastScanStatus) {
                this.lastScanStatus = lastScanStatus;
                return this;
            }

            /**
             * <p>The time of the most recent scan. This value is a UNIX timestamp in milliseconds. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The name of the target model. When ConnectionMethod is set to enterprise_relay, this value is the fixed platform value Agent.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-flash</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The time when the target was last modified. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The business label of the model or agent provider.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The risk level of the task result. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The cumulative number of scans. This is an aggregate field that is not populated by this operation and returns an empty value. For the meaning and example values, refer to the ListAttackTargets response.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder scanCount(Long scanCount) {
                this.scanCount = scanCount;
                return this;
            }

            /**
             * <p>The scan node configuration (JSON character string). Common fields include scanType (scan pattern: attack for security attack scan, tc260 for TC260 filing scan), scannerType (execute DPI engine: classic for per-sample execute, agent for multi-round autonomous attack), and sampleScope (sample scope: version for the current effective version, all for full samples). If the target is not configured, the default configurations are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;scanType&quot;:&quot;attack&quot;,&quot;scannerType&quot;:&quot;classic&quot;,&quot;sampleScope&quot;:&quot;all&quot;}</p>
             */
            public Builder scanTaskConfig(String scanTaskConfig) {
                this.scanTaskConfig = scanTaskConfig;
                return this;
            }

            /**
             * <p>The unique identifier of the scan target.</p>
             * 
             * <strong>example:</strong>
             * <p>target-abc123def4567</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The display name of the scan target.</p>
             * 
             * <strong>example:</strong>
             * <p>My Bailian target</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the scan target.</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
