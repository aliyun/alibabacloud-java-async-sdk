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
 * {@link QueryDisplayKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDisplayKnowledgeResponseBody</p>
 */
public class QueryDisplayKnowledgeResponseBody extends TeaModel {
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

    private QueryDisplayKnowledgeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDisplayKnowledgeResponseBody create() {
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

        private Builder(QueryDisplayKnowledgeResponseBody model) {
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
         * <p>The query result of the display knowledge base content.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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

        public QueryDisplayKnowledgeResponseBody build() {
            return new QueryDisplayKnowledgeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDisplayKnowledgeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDisplayKnowledgeResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ImageUrlExpireTime")
        private String imageUrlExpireTime;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Records(Builder builder) {
            this.failureMessage = builder.failureMessage;
            this.failureReason = builder.failureReason;
            this.gmtModified = builder.gmtModified;
            this.imageUrl = builder.imageUrl;
            this.imageUrlExpireTime = builder.imageUrlExpireTime;
            this.recordId = builder.recordId;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return failureMessage
         */
        public String getFailureMessage() {
            return this.failureMessage;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return imageUrlExpireTime
         */
        public String getImageUrlExpireTime() {
            return this.imageUrlExpireTime;
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
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failureMessage; 
            private String failureReason; 
            private String gmtModified; 
            private String imageUrl; 
            private String imageUrlExpireTime; 
            private Long recordId; 
            private String skuId; 
            private String skuName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.failureMessage = model.failureMessage;
                this.failureReason = model.failureReason;
                this.gmtModified = model.gmtModified;
                this.imageUrl = model.imageUrl;
                this.imageUrlExpireTime = model.imageUrlExpireTime;
                this.recordId = model.recordId;
                this.skuId = model.skuId;
                this.skuName = model.skuName;
                this.status = model.status;
            } 

            /**
             * <p>The description of the failure cause. This parameter is returned only when the status is FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>Image is inaccessible</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The code of the failure cause. This parameter is returned only when the status is FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>Image is inaccessible</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The last modified time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-01T15:53:46Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The 24-hour signed URL of the transferred image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx/2190149752-0-cib.jpg">https://xxx/2190149752-0-cib.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The expiration time of the signed URL.</p>
             * 
             * <strong>example:</strong>
             * <p>Date</p>
             */
            public Builder imageUrlExpireTime(String imageUrlExpireTime) {
                this.imageUrlExpireTime = imageUrlExpireTime;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4410879640480000</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>SKU ID</p>
             * 
             * <strong>example:</strong>
             * <p>sku-001</p>
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * <p>The SKU name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product side image</p>
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            /**
             * <p>The record status.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATING - Updating
             * EMBEDDED - Vectorization completed
             * FAILED - Processing failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDisplayKnowledgeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDisplayKnowledgeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseStatus")
        private String knowledgeBaseStatus;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RagId")
        private String ragId;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.knowledgeBaseStatus = builder.knowledgeBaseStatus;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.ragId = builder.ragId;
            this.records = builder.records;
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return knowledgeBaseStatus
         */
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return ragId
         */
        public String getRagId() {
            return this.ragId;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String knowledgeBaseStatus; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String ragId; 
            private java.util.List<Records> records; 
            private Boolean success; 
            private String taskId; 
            private Integer total; 
            private Integer totalPage; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.knowledgeBaseStatus = model.knowledgeBaseStatus;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.ragId = model.ragId;
                this.records = model.records;
                this.success = model.success;
                this.taskId = model.taskId;
                this.total = model.total;
                this.totalPage = model.totalPage;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The business error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
             * <p>The knowledge base status.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE - Available</p>
             */
            public Builder knowledgeBaseStatus(String knowledgeBaseStatus) {
                this.knowledgeBaseStatus = knowledgeBaseStatus;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rag_xxx</p>
             */
            public Builder ragId(String ragId) {
                this.ragId = ragId;
                return this;
            }

            /**
             * <p>The records on the current page.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
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
             * <p>The asynchronous task ID. This parameter is empty for synchronous API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>a8323ada-a196-9061-976f-90e38b27323a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * <p>The usage information. This parameter is empty for free API operations.</p>
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
