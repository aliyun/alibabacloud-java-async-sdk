// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBImportTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDBImportTaskStatusResponseBody</p>
 */
public class QueryDBImportTaskStatusResponseBody extends TeaModel {
    @NameInMap("DetailMessage")
    private String detailMessage;

    @NameInMap("FailedCount")
    private String failedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("SuccessCount")
    private String successCount;

    private QueryDBImportTaskStatusResponseBody(Builder builder) {
        this.detailMessage = builder.detailMessage;
        this.failedCount = builder.failedCount;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBImportTaskStatusResponseBody create() {
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
    public String getFailedCount() {
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
    public String getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String detailMessage; 
        private String failedCount; 
        private String requestId; 
        private String status; 
        private String successCount; 

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
        public Builder failedCount(String failedCount) {
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
        public Builder successCount(String successCount) {
            this.successCount = successCount;
            return this;
        }

        public QueryDBImportTaskStatusResponseBody build() {
            return new QueryDBImportTaskStatusResponseBody(this);
        } 

    } 

}
