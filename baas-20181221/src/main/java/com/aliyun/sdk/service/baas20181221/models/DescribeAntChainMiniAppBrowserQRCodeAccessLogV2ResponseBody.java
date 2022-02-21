// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody</p>
 */
public class DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody extends TeaModel {
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

    private DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody(Builder builder) {
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

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody create() {
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

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody build() {
            return new DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AccessAlipayAccountCount")
        private Long accessAlipayAccountCount;

        @NameInMap("AccessCount")
        private Long accessCount;

        private Result(Builder builder) {
            this.accessAlipayAccountCount = builder.accessAlipayAccountCount;
            this.accessCount = builder.accessCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessAlipayAccountCount
         */
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        /**
         * @return accessCount
         */
        public Long getAccessCount() {
            return this.accessCount;
        }

        public static final class Builder {
            private Long accessAlipayAccountCount; 
            private Long accessCount; 

            /**
             * AccessAlipayAccountCount.
             */
            public Builder accessAlipayAccountCount(Long accessAlipayAccountCount) {
                this.accessAlipayAccountCount = accessAlipayAccountCount;
                return this;
            }

            /**
             * AccessCount.
             */
            public Builder accessCount(Long accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
