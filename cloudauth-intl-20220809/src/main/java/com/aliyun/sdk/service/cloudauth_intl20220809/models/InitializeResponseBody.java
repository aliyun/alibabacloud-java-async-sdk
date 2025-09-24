// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link InitializeResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeResponseBody</p>
 */
public class InitializeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private InitializeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InitializeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4EB35****87EBA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public InitializeResponseBody build() {
            return new InitializeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitializeResponseBody} extends {@link TeaModel}
     *
     * <p>InitializeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientCfg")
        private String clientCfg;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        @com.aliyun.core.annotation.NameInMap("TransactionUrl")
        private String transactionUrl;

        private Result(Builder builder) {
            this.clientCfg = builder.clientCfg;
            this.protocol = builder.protocol;
            this.transactionId = builder.transactionId;
            this.transactionUrl = builder.transactionUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clientCfg
         */
        public String getClientCfg() {
            return this.clientCfg;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        /**
         * @return transactionUrl
         */
        public String getTransactionUrl() {
            return this.transactionUrl;
        }

        public static final class Builder {
            private String clientCfg; 
            private String protocol; 
            private String transactionId; 
            private String transactionUrl; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.clientCfg = model.clientCfg;
                this.protocol = model.protocol;
                this.transactionId = model.transactionId;
                this.transactionUrl = model.transactionUrl;
            } 

            /**
             * <p>Client configuration</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder clientCfg(String clientCfg) {
                this.clientCfg = clientCfg;
                return this;
            }

            /**
             * <p>Standard encryption protocol for authentication.</p>
             * <blockquote>
             * <p>This field is required when integrating with H5 web pages using iframe embedding.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hksb7ba1b28130d24e015d*********</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Authentication ID</p>
             * 
             * <strong>example:</strong>
             * <p>08573be80f944d95ac812e019e3655a8</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            /**
             * <p>Web authentication URL</p>
             * 
             * <strong>example:</strong>
             * <p>http****</p>
             */
            public Builder transactionUrl(String transactionUrl) {
                this.transactionUrl = transactionUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
