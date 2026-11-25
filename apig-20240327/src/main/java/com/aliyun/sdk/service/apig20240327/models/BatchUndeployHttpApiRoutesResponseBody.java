// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchUndeployHttpApiRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUndeployHttpApiRoutesResponseBody</p>
 */
public class BatchUndeployHttpApiRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BatchUndeployHttpApiRoutesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUndeployHttpApiRoutesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchUndeployHttpApiRoutesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchUndeployHttpApiRoutesResponseBody build() {
            return new BatchUndeployHttpApiRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchUndeployHttpApiRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchUndeployHttpApiRoutesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.Map<String, DataResultsValue> results;

        @com.aliyun.core.annotation.NameInMap("skippedCount")
        private Integer skippedCount;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private Data(Builder builder) {
            this.failedCount = builder.failedCount;
            this.results = builder.results;
            this.skippedCount = builder.skippedCount;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return results
         */
        public java.util.Map<String, DataResultsValue> getResults() {
            return this.results;
        }

        /**
         * @return skippedCount
         */
        public Integer getSkippedCount() {
            return this.skippedCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Integer failedCount; 
            private java.util.Map<String, DataResultsValue> results; 
            private Integer skippedCount; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedCount = model.failedCount;
                this.results = model.results;
                this.skippedCount = model.skippedCount;
                this.successCount = model.successCount;
            } 

            /**
             * failedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.Map<String, DataResultsValue> results) {
                this.results = results;
                return this;
            }

            /**
             * skippedCount.
             */
            public Builder skippedCount(Integer skippedCount) {
                this.skippedCount = skippedCount;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
