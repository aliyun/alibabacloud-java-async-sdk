// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B63CAC5-BD7F-5C7C-82C9-59DFFBC3C5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataArchiveCountResponseBody build() {
            return new GetDataArchiveCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataArchiveCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataArchiveCountResponseBody</p>
     */
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
             * <p>The number of tickets that data archiving failed.</p>
             * 
             * <strong>example:</strong>
             * <p>1**</p>
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The number of tickets that data archiving is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>2**</p>
             */
            public Builder processingCount(Long processingCount) {
                this.processingCount = processingCount;
                return this;
            }

            /**
             * <p>The number of tickets that data archiving is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>3**</p>
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The total number of data archiving tickets.</p>
             * 
             * <strong>example:</strong>
             * <p>6**</p>
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
