// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody extends TeaModel {
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

    private DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody(Builder builder) {
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

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody create() {
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

        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody build() {
            return new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AntChainId")
        private String antChainId;

        @NameInMap("Base64QRCodePNG")
        private String base64QRCodePNG;

        @NameInMap("QRCodeContent")
        private String QRCodeContent;

        @NameInMap("TransactionHash")
        private String transactionHash;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.base64QRCodePNG = builder.base64QRCodePNG;
            this.QRCodeContent = builder.QRCodeContent;
            this.transactionHash = builder.transactionHash;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return base64QRCodePNG
         */
        public String getBase64QRCodePNG() {
            return this.base64QRCodePNG;
        }

        /**
         * @return QRCodeContent
         */
        public String getQRCodeContent() {
            return this.QRCodeContent;
        }

        /**
         * @return transactionHash
         */
        public String getTransactionHash() {
            return this.transactionHash;
        }

        public static final class Builder {
            private String antChainId; 
            private String base64QRCodePNG; 
            private String QRCodeContent; 
            private String transactionHash; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * Base64QRCodePNG.
             */
            public Builder base64QRCodePNG(String base64QRCodePNG) {
                this.base64QRCodePNG = base64QRCodePNG;
                return this;
            }

            /**
             * QRCodeContent.
             */
            public Builder QRCodeContent(String QRCodeContent) {
                this.QRCodeContent = QRCodeContent;
                return this;
            }

            /**
             * TransactionHash.
             */
            public Builder transactionHash(String transactionHash) {
                this.transactionHash = transactionHash;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
