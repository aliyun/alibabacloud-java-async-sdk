// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterQueryNacosProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterQueryNacosProvidersResponseBody</p>
 */
public class ModelRouterQueryNacosProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ModelRouterQueryNacosProvidersResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryNacosProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterQueryNacosProvidersResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModelRouterQueryNacosProvidersResponseBody build() {
            return new ModelRouterQueryNacosProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterQueryNacosProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryNacosProvidersResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("inputToken")
        private String inputToken;

        @com.aliyun.core.annotation.NameInMap("outputToken")
        private String outputToken;

        private Models(Builder builder) {
            this.identifier = builder.identifier;
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return inputToken
         */
        public String getInputToken() {
            return this.inputToken;
        }

        /**
         * @return outputToken
         */
        public String getOutputToken() {
            return this.outputToken;
        }

        public static final class Builder {
            private String identifier; 
            private String inputToken; 
            private String outputToken; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.identifier = model.identifier;
                this.inputToken = model.inputToken;
                this.outputToken = model.outputToken;
            } 

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * inputToken.
             */
            public Builder inputToken(String inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * outputToken.
             */
            public Builder outputToken(String outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelRouterQueryNacosProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryNacosProvidersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("models")
        private java.util.List<Models> models;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("symbol")
        private String symbol;

        private Data(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.models = builder.models;
            this.name = builder.name;
            this.symbol = builder.symbol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return models
         */
        public java.util.List<Models> getModels() {
            return this.models;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        public static final class Builder {
            private String baseUrl; 
            private java.util.List<Models> models; 
            private String name; 
            private String symbol; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseUrl = model.baseUrl;
                this.models = model.models;
                this.name = model.name;
                this.symbol = model.symbol;
            } 

            /**
             * baseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * models.
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * symbol.
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
