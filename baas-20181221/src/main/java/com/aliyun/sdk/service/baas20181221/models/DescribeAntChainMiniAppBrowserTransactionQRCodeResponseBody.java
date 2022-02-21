// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

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

        public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody build() {
            return new DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody(this);
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
