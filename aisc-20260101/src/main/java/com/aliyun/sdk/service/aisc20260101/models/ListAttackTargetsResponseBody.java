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
 * {@link ListAttackTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAttackTargetsResponseBody</p>
 */
public class ListAttackTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAttackTargetsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttackTargetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAttackTargetsResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of scan targets on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The normalized page number that takes effect. The value may differ from the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The normalized number of entries per page that takes effect. The value may differ from the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of scan targets that match the filter conditions. In post-filtering scenarios, this value is the total count after in-memory filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAttackTargetsResponseBody build() {
            return new ListAttackTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAttackTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAttackTargetsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("LastVerifyMessage")
        private String lastVerifyMessage;

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

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("VerifyStatus")
        private String verifyStatus;

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
            this.lastVerifyMessage = builder.lastVerifyMessage;
            this.modelName = builder.modelName;
            this.modifyTime = builder.modifyTime;
            this.provider = builder.provider;
            this.riskLevel = builder.riskLevel;
            this.scanCount = builder.scanCount;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.verifyStatus = builder.verifyStatus;
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
         * @return lastVerifyMessage
         */
        public String getLastVerifyMessage() {
            return this.lastVerifyMessage;
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

        /**
         * @return verifyStatus
         */
        public String getVerifyStatus() {
            return this.verifyStatus;
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
            private String lastVerifyMessage; 
            private String modelName; 
            private Long modifyTime; 
            private String provider; 
            private String riskLevel; 
            private Long scanCount; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String verifyStatus; 

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
                this.lastVerifyMessage = model.lastVerifyMessage;
                this.modelName = model.modelName;
                this.modifyTime = model.modifyTime;
                this.provider = model.provider;
                this.riskLevel = model.riskLevel;
                this.scanCount = model.scanCount;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
                this.verifyStatus = model.verifyStatus;
            } 

            /**
             * <p>The advanced connection configuration for the target (JSON character string). For common fields and provider configuration templates, see the ConnectionConfig parameter description of the CreateAttackTarget operation.</p>
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
             * <p>The time when the target was created. The value is a millisecond-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the scan target.</p>
             * 
             * <strong>example:</strong>
             * <p>Production Bailian application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS endpoint address of the target model service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The time when the first scan was performed. The value is a millisecond-level UNIX timestamp. This parameter is null if no scan has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The failure reason of the most recent scan task. This parameter is empty if the most recent scan did not fail.</p>
             * 
             * <strong>example:</strong>
             * <p>Scan executor connection timed out</p>
             */
            public Builder lastScanFailMessage(String lastScanFailMessage) {
                this.lastScanFailMessage = lastScanFailMessage;
                return this;
            }

            /**
             * <p>The detection status of the most recent scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder lastScanStatus(String lastScanStatus) {
                this.lastScanStatus = lastScanStatus;
                return this;
            }

            /**
             * <p>The time when the last scan was performed. The value is a millisecond-level UNIX timestamp. This parameter is null if no scan has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The detailed message of the most recent connectivity verification. If the verification succeeded, the value is a response content snippet returned by the target service. If the verification failed, the value is the error reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Connectivity verification succeeded</p>
             */
            public Builder lastVerifyMessage(String lastVerifyMessage) {
                this.lastVerifyMessage = lastVerifyMessage;
                return this;
            }

            /**
             * <p>The name of the target model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-flash</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The time when the target was last modified. The value is a millisecond-level UNIX timestamp.</p>
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
             * <p>The risk level derived from the most recent completed scan task. This parameter is null if no scan has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The total number of scans performed. The value is 0 if no scan has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder scanCount(Long scanCount) {
                this.scanCount = scanCount;
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

            /**
             * <p>The connectivity verification status of the target.</p>
             * 
             * <strong>example:</strong>
             * <p>verified</p>
             */
            public Builder verifyStatus(String verifyStatus) {
                this.verifyStatus = verifyStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
