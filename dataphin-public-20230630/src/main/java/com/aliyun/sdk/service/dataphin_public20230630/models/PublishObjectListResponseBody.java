// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link PublishObjectListResponseBody} extends {@link TeaModel}
 *
 * <p>PublishObjectListResponseBody</p>
 */
public class PublishObjectListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PublishResult")
    private PublishResult publishResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PublishObjectListResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.publishResult = builder.publishResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishObjectListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return publishResult
     */
    public PublishResult getPublishResult() {
        return this.publishResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PublishResult publishResult; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * PublishResult.
         */
        public Builder publishResult(PublishResult publishResult) {
            this.publishResult = publishResult;
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

        public PublishObjectListResponseBody build() {
            return new PublishObjectListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PublishObjectListResponseBody} extends {@link TeaModel}
     *
     * <p>PublishObjectListResponseBody</p>
     */
    public static class PublishResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubmitIdList")
        private java.util.List<Long> submitIdList;

        private PublishResult(Builder builder) {
            this.submitIdList = builder.submitIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishResult create() {
            return builder().build();
        }

        /**
         * @return submitIdList
         */
        public java.util.List<Long> getSubmitIdList() {
            return this.submitIdList;
        }

        public static final class Builder {
            private java.util.List<Long> submitIdList; 

            /**
             * SubmitIdList.
             */
            public Builder submitIdList(java.util.List<Long> submitIdList) {
                this.submitIdList = submitIdList;
                return this;
            }

            public PublishResult build() {
                return new PublishResult(this);
            } 

        } 

    }
}
