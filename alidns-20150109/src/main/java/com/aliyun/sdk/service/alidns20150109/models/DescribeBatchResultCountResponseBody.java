// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBatchResultCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchResultCountResponseBody</p>
 */
public class DescribeBatchResultCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchType")
    private String batchType;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBatchResultCountResponseBody(Builder builder) {
        this.batchType = builder.batchType;
        this.failedCount = builder.failedCount;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successCount = builder.successCount;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchResultCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchType
     */
    public String getBatchType() {
        return this.batchType;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String batchType; 
        private Integer failedCount; 
        private String reason; 
        private String requestId; 
        private Integer status; 
        private Integer successCount; 
        private Long taskId; 
        private Integer totalCount; 

        /**
         * <p>The type of the batch operation.</p>
         * 
         * <strong>example:</strong>
         * <p>DOMAIN_ADD</p>
         */
        public Builder batchType(String batchType) {
            this.batchType = batchType;
            return this;
        }

        /**
         * <p>The total number of domain names or DNS records that failed to be processed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The cause of the execution failure.</p>
         * 
         * <strong>example:</strong>
         * <p>failed_reason</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: No task for importing domain names or DNS records is submitted.</li>
         * <li><strong>0</strong>: The task is being processed.</li>
         * <li><strong>1</strong>: The task is complete.</li>
         * <li><strong>2</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of domain names or DNS records that were processed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The ID of the last task.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The total number of DNS records that were processed in batches.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchResultCountResponseBody build() {
            return new DescribeBatchResultCountResponseBody(this);
        } 

    } 

}
