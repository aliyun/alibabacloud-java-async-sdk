// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link DeleteDisplayKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDisplayKnowledgeResponseBody</p>
 */
public class DeleteDisplayKnowledgeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteDisplayKnowledgeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDisplayKnowledgeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteDisplayKnowledgeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The deletion results for the display knowledge base content.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteDisplayKnowledgeResponseBody build() {
            return new DeleteDisplayKnowledgeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteDisplayKnowledgeResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteDisplayKnowledgeResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Results(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.index = builder.index;
            this.recordId = builder.recordId;
            this.skuId = builder.skuId;
            this.status = builder.status;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private Integer index; 
            private Long recordId; 
            private String skuId; 
            private String status; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.index = model.index;
                this.recordId = model.recordId;
                this.skuId = model.skuId;
                this.status = model.status;
                this.success = model.success;
            } 

            /**
             * <p>The error code for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The cause of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The index in the original request array.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2746611117</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The SKU ID. This field is empty for deletion results.</p>
             * 
             * <strong>example:</strong>
             * <p>sku-001</p>
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * <p>The record status. This field is empty for deletion results.</p>
             * 
             * <strong>example:</strong>
             * <p>Empty for the deletion API</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the deletion is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteDisplayKnowledgeResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteDisplayKnowledgeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptedCount")
        private Integer acceptedCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseStatus")
        private String knowledgeBaseStatus;

        @com.aliyun.core.annotation.NameInMap("RagId")
        private String ragId;

        @com.aliyun.core.annotation.NameInMap("RemainingCount")
        private Integer remainingCount;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.acceptedCount = builder.acceptedCount;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.failedCount = builder.failedCount;
            this.knowledgeBaseStatus = builder.knowledgeBaseStatus;
            this.ragId = builder.ragId;
            this.remainingCount = builder.remainingCount;
            this.results = builder.results;
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acceptedCount
         */
        public Integer getAcceptedCount() {
            return this.acceptedCount;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return knowledgeBaseStatus
         */
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        /**
         * @return ragId
         */
        public String getRagId() {
            return this.ragId;
        }

        /**
         * @return remainingCount
         */
        public Integer getRemainingCount() {
            return this.remainingCount;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Integer acceptedCount; 
            private String errorCode; 
            private String errorMessage; 
            private Integer failedCount; 
            private String knowledgeBaseStatus; 
            private String ragId; 
            private Integer remainingCount; 
            private java.util.List<Results> results; 
            private Boolean success; 
            private String taskId; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acceptedCount = model.acceptedCount;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.failedCount = model.failedCount;
                this.knowledgeBaseStatus = model.knowledgeBaseStatus;
                this.ragId = model.ragId;
                this.remainingCount = model.remainingCount;
                this.results = model.results;
                this.success = model.success;
                this.taskId = model.taskId;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The number of accepted records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder acceptedCount(Integer acceptedCount) {
                this.acceptedCount = acceptedCount;
                return this;
            }

            /**
             * <p>The business error code.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The business error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The number of failed records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The status of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATING</p>
             */
            public Builder knowledgeBaseStatus(String knowledgeBaseStatus) {
                this.knowledgeBaseStatus = knowledgeBaseStatus;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rag_001</p>
             */
            public Builder ragId(String ragId) {
                this.ragId = ragId;
                return this;
            }

            /**
             * <p>The number of visible records after the deletion.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder remainingCount(Integer remainingCount) {
                this.remainingCount = remainingCount;
                return this;
            }

            /**
             * <p>The processing results for each record.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>Indicates whether the business processing is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The asynchronous task ID. This field is empty for synchronous API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>task-xxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The usage information. This field is empty for free API operations.</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
