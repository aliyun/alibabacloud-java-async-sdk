// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterBatchCreateModelResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterBatchCreateModelResponseBody</p>
 */
public class ModelRouterBatchCreateModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ModelRouterBatchCreateModelResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchCreateModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterBatchCreateModelResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModelRouterBatchCreateModelResponseBody build() {
            return new ModelRouterBatchCreateModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterBatchCreateModelResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterBatchCreateModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private java.util.List<ModelDTO> created;

        @com.aliyun.core.annotation.NameInMap("failCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("failures")
        private java.util.List<BatchModelErrorDTO> failures;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private Data(Builder builder) {
            this.created = builder.created;
            this.failCount = builder.failCount;
            this.failures = builder.failures;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public java.util.List<ModelDTO> getCreated() {
            return this.created;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return failures
         */
        public java.util.List<BatchModelErrorDTO> getFailures() {
            return this.failures;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private java.util.List<ModelDTO> created; 
            private Integer failCount; 
            private java.util.List<BatchModelErrorDTO> failures; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.created = model.created;
                this.failCount = model.failCount;
                this.failures = model.failures;
                this.successCount = model.successCount;
            } 

            /**
             * created.
             */
            public Builder created(java.util.List<ModelDTO> created) {
                this.created = created;
                return this;
            }

            /**
             * failCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * failures.
             */
            public Builder failures(java.util.List<BatchModelErrorDTO> failures) {
                this.failures = failures;
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
