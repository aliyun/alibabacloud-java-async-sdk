// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link QueryTokenUsageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTokenUsageResponseBody</p>
 */
public class QueryTokenUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private QueryTokenUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTokenUsageResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(QueryTokenUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryTokenUsageResponseBody build() {
            return new QueryTokenUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTokenUsageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTokenUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("inputToken")
        private Long inputToken;

        @com.aliyun.core.annotation.NameInMap("outputToken")
        private Long outputToken;

        @com.aliyun.core.annotation.NameInMap("productKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("usageTime")
        private String usageTime;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.tenantId = builder.tenantId;
            this.usageTime = builder.usageTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return inputToken
         */
        public Long getInputToken() {
            return this.inputToken;
        }

        /**
         * @return outputToken
         */
        public Long getOutputToken() {
            return this.outputToken;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return usageTime
         */
        public String getUsageTime() {
            return this.usageTime;
        }

        public static final class Builder {
            private String apiKey; 
            private Long inputToken; 
            private Long outputToken; 
            private String productKey; 
            private String productName; 
            private String tenantId; 
            private String usageTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.inputToken = model.inputToken;
                this.outputToken = model.outputToken;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.tenantId = model.tenantId;
                this.usageTime = model.usageTime;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * inputToken.
             */
            public Builder inputToken(Long inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * outputToken.
             */
            public Builder outputToken(Long outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            /**
             * productKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * usageTime.
             */
            public Builder usageTime(String usageTime) {
                this.usageTime = usageTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
