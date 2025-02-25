// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trafficfxopen20240815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchResponseBody} extends {@link TeaModel}
 *
 * <p>SearchResponseBody</p>
 */
public class SearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorData")
    private ErrorData errorData;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private SearchResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public ErrorData getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private String data; 
        private String errorCode; 
        private ErrorData errorData; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorData.
         */
        public Builder errorData(ErrorData errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
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

        public SearchResponseBody build() {
            return new SearchResponseBody(this);
        } 

    } 

    public static class ErrorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rawErrorCode")
        private String rawErrorCode;

        @com.aliyun.core.annotation.NameInMap("rawErrorMsg")
        private String rawErrorMsg;

        private ErrorData(Builder builder) {
            this.rawErrorCode = builder.rawErrorCode;
            this.rawErrorMsg = builder.rawErrorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorData create() {
            return builder().build();
        }

        /**
         * @return rawErrorCode
         */
        public String getRawErrorCode() {
            return this.rawErrorCode;
        }

        /**
         * @return rawErrorMsg
         */
        public String getRawErrorMsg() {
            return this.rawErrorMsg;
        }

        public static final class Builder {
            private String rawErrorCode; 
            private String rawErrorMsg; 

            /**
             * rawErrorCode.
             */
            public Builder rawErrorCode(String rawErrorCode) {
                this.rawErrorCode = rawErrorCode;
                return this;
            }

            /**
             * rawErrorMsg.
             */
            public Builder rawErrorMsg(String rawErrorMsg) {
                this.rawErrorMsg = rawErrorMsg;
                return this;
            }

            public ErrorData build() {
                return new ErrorData(this);
            } 

        } 

    }
}
