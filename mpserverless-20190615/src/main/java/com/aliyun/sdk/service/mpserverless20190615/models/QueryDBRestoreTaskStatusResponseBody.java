// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBRestoreTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDBRestoreTaskStatusResponseBody</p>
 */
public class QueryDBRestoreTaskStatusResponseBody extends TeaModel {
    @NameInMap("DetailMessage")
    private String detailMessage;

    @NameInMap("FailedCount")
    private Long failedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("SuccessCount")
    private Long successCount;

    private QueryDBRestoreTaskStatusResponseBody(Builder builder) {
        this.detailMessage = builder.detailMessage;
        this.failedCount = builder.failedCount;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBRestoreTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return detailMessage
     */
    public String getDetailMessage() {
        return this.detailMessage;
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String detailMessage; 
        private Long failedCount; 
        private String requestId; 
        private String status; 
        private Long successCount; 

        /**
         * DetailMessage.
         */
        public Builder detailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }

        /**
         * FailedCount.
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        public QueryDBRestoreTaskStatusResponseBody build() {
            return new QueryDBRestoreTaskStatusResponseBody(this);
        } 

    } 

}
