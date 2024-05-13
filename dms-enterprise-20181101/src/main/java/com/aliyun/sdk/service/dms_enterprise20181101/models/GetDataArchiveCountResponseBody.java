// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataArchiveCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataArchiveCountResponseBody</p>
 */
public class GetDataArchiveCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataArchiveCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataArchiveCountResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataArchiveCountResponseBody build() {
            return new GetDataArchiveCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Long failCount;

        @com.aliyun.core.annotation.NameInMap("ProcessingCount")
        private Long processingCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.failCount = builder.failCount;
            this.processingCount = builder.processingCount;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return processingCount
         */
        public Long getProcessingCount() {
            return this.processingCount;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long failCount; 
            private Long processingCount; 
            private Long successCount; 
            private Long totalCount; 

            /**
             * The number of failed archiving tickets.
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The number of in-progress archiving tickets.
             */
            public Builder processingCount(Long processingCount) {
                this.processingCount = processingCount;
                return this;
            }

            /**
             * The number of successful archiving tickets.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * The total number of archiving tickets.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
