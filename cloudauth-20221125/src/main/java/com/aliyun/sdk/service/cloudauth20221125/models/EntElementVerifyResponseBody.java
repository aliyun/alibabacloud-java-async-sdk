// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntElementVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>EntElementVerifyResponseBody</p>
 */
public class EntElementVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private EntElementVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntElementVerifyResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntElementVerifyResponseBody build() {
            return new EntElementVerifyResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("BizCode")
        private String bizCode;

        @NameInMap("OpenTime")
        private String openTime;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("ReasonDetail")
        private String reasonDetail;

        @NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.bizCode = builder.bizCode;
            this.openTime = builder.openTime;
            this.reasonCode = builder.reasonCode;
            this.reasonDetail = builder.reasonDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDetail
         */
        public String getReasonDetail() {
            return this.reasonDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizCode; 
            private String openTime; 
            private String reasonCode; 
            private String reasonDetail; 
            private String status; 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * OpenTime.
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonDetail.
             */
            public Builder reasonDetail(String reasonDetail) {
                this.reasonDetail = reasonDetail;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
