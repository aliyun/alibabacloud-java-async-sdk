// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link BatchRecallPushResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRecallPushResponseBody</p>
 */
public class BatchRecallPushResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchRecallPushResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRecallPushResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
        private Boolean allowRetry; 
        private Long httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchRecallPushResponseBody model) {
            this.allowRetry = model.allowRetry;
            this.httpStatusCode = model.httpStatusCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
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
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
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

        public BatchRecallPushResponseBody build() {
            return new BatchRecallPushResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchRecallPushResponseBody} extends {@link TeaModel}
     *
     * <p>BatchRecallPushResponseBody</p>
     */
    public static class RecallResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private RecallResults(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.outBizId = builder.outBizId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallResults create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String outBizId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(RecallResults model) {
                this.code = model.code;
                this.message = model.message;
                this.outBizId = model.outBizId;
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * OutBizId.
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public RecallResults build() {
                return new RecallResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchRecallPushResponseBody} extends {@link TeaModel}
     *
     * <p>BatchRecallPushResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecallResults")
        private java.util.List<RecallResults> recallResults;

        private Module(Builder builder) {
            this.recallResults = builder.recallResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return recallResults
         */
        public java.util.List<RecallResults> getRecallResults() {
            return this.recallResults;
        }

        public static final class Builder {
            private java.util.List<RecallResults> recallResults; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.recallResults = model.recallResults;
            } 

            /**
             * RecallResults.
             */
            public Builder recallResults(java.util.List<RecallResults> recallResults) {
                this.recallResults = recallResults;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
