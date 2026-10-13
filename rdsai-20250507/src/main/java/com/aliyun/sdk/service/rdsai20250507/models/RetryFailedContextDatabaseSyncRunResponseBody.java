// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link RetryFailedContextDatabaseSyncRunResponseBody} extends {@link TeaModel}
 *
 * <p>RetryFailedContextDatabaseSyncRunResponseBody</p>
 */
public class RetryFailedContextDatabaseSyncRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RetryFailedContextDatabaseSyncRunResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryFailedContextDatabaseSyncRunResponseBody create() {
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
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RetryFailedContextDatabaseSyncRunResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RetryFailedContextDatabaseSyncRunResponseBody build() {
            return new RetryFailedContextDatabaseSyncRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetryFailedContextDatabaseSyncRunResponseBody} extends {@link TeaModel}
     *
     * <p>RetryFailedContextDatabaseSyncRunResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RetryOfRunId")
        private String retryOfRunId;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        private Data(Builder builder) {
            this.retryOfRunId = builder.retryOfRunId;
            this.runId = builder.runId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return retryOfRunId
         */
        public String getRetryOfRunId() {
            return this.retryOfRunId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        public static final class Builder {
            private String retryOfRunId; 
            private String runId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.retryOfRunId = model.retryOfRunId;
                this.runId = model.runId;
            } 

            /**
             * RetryOfRunId.
             */
            public Builder retryOfRunId(String retryOfRunId) {
                this.retryOfRunId = retryOfRunId;
                return this;
            }

            /**
             * RunId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
