// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionReceiptV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainTransactionReceiptV2ResponseBody</p>
 */
public class DescribeAntChainTransactionReceiptV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAntChainTransactionReceiptV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionReceiptV2ResponseBody create() {
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
    public String getHttpStatusCode() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String resultCode; 
        private String resultMessage; 
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
        public Builder httpStatusCode(String httpStatusCode) {
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAntChainTransactionReceiptV2ResponseBody build() {
            return new DescribeAntChainTransactionReceiptV2ResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("GasUsed")
        private String gasUsed;

        @NameInMap("Logs")
        private java.util.List < String > logs;

        @NameInMap("Result")
        private Long result;

        private Result(Builder builder) {
            this.data = builder.data;
            this.gasUsed = builder.gasUsed;
            this.logs = builder.logs;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return gasUsed
         */
        public String getGasUsed() {
            return this.gasUsed;
        }

        /**
         * @return logs
         */
        public java.util.List < String > getLogs() {
            return this.logs;
        }

        /**
         * @return result
         */
        public Long getResult() {
            return this.result;
        }

        public static final class Builder {
            private String data; 
            private String gasUsed; 
            private java.util.List < String > logs; 
            private Long result; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * GasUsed.
             */
            public Builder gasUsed(String gasUsed) {
                this.gasUsed = gasUsed;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < String > logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Long result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
