// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainDownloadPathsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainDownloadPathsV2ResponseBody</p>
 */
public class DescribeAntChainDownloadPathsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAntChainDownloadPathsV2ResponseBody(Builder builder) {
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

    public static DescribeAntChainDownloadPathsV2ResponseBody create() {
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

        public DescribeAntChainDownloadPathsV2ResponseBody build() {
            return new DescribeAntChainDownloadPathsV2ResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCrtUrl")
        private String caCrtUrl;

        @com.aliyun.core.annotation.NameInMap("ClientCrtUrl")
        private String clientCrtUrl;

        @com.aliyun.core.annotation.NameInMap("SdkUrl")
        private String sdkUrl;

        @com.aliyun.core.annotation.NameInMap("TrustCaUrl")
        private String trustCaUrl;

        private Result(Builder builder) {
            this.caCrtUrl = builder.caCrtUrl;
            this.clientCrtUrl = builder.clientCrtUrl;
            this.sdkUrl = builder.sdkUrl;
            this.trustCaUrl = builder.trustCaUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return caCrtUrl
         */
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        /**
         * @return clientCrtUrl
         */
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        /**
         * @return sdkUrl
         */
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        /**
         * @return trustCaUrl
         */
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

        public static final class Builder {
            private String caCrtUrl; 
            private String clientCrtUrl; 
            private String sdkUrl; 
            private String trustCaUrl; 

            /**
             * CaCrtUrl.
             */
            public Builder caCrtUrl(String caCrtUrl) {
                this.caCrtUrl = caCrtUrl;
                return this;
            }

            /**
             * ClientCrtUrl.
             */
            public Builder clientCrtUrl(String clientCrtUrl) {
                this.clientCrtUrl = clientCrtUrl;
                return this;
            }

            /**
             * SdkUrl.
             */
            public Builder sdkUrl(String sdkUrl) {
                this.sdkUrl = sdkUrl;
                return this;
            }

            /**
             * TrustCaUrl.
             */
            public Builder trustCaUrl(String trustCaUrl) {
                this.trustCaUrl = trustCaUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
