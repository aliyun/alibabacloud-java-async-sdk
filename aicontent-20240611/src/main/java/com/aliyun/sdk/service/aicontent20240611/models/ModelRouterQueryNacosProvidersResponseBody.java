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
         * <p>The data object.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The fault message code.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Unknown error</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("async")
        private Boolean async;

        private Extensions(Builder builder) {
            this.async = builder.async;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return async
         */
        public Boolean getAsync() {
            return this.async;
        }

        public static final class Builder {
            private Boolean async; 

            private Builder() {
            } 

            private Builder(Extensions model) {
                this.async = model.async;
            } 

            /**
             * <p>The asynchronous call identifier.</p>
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelRouterQueryNacosProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryNacosProvidersResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extensions")
        private Extensions extensions;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("inOut")
        private String inOut;

        @com.aliyun.core.annotation.NameInMap("inputToken")
        private String inputToken;

        @com.aliyun.core.annotation.NameInMap("outputToken")
        private String outputToken;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Models(Builder builder) {
            this.extensions = builder.extensions;
            this.identifier = builder.identifier;
            this.inOut = builder.inOut;
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return extensions
         */
        public Extensions getExtensions() {
            return this.extensions;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return inOut
         */
        public String getInOut() {
            return this.inOut;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Extensions extensions; 
            private String identifier; 
            private String inOut; 
            private String inputToken; 
            private String outputToken; 
            private String type; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.extensions = model.extensions;
                this.identifier = model.identifier;
                this.inOut = model.inOut;
                this.inputToken = model.inputToken;
                this.outputToken = model.outputToken;
                this.type = model.type;
            } 

            /**
             * <p>The extension configuration parameters of the model, stored as key-value pairs for additional model behavior configuration.</p>
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>ca90f359956e94367470c38676</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The input type and output type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder inOut(String inOut) {
                this.inOut = inOut;
                return this;
            }

            /**
             * <p>The input token limit.</p>
             * 
             * <strong>example:</strong>
             * <p>32K</p>
             */
            public Builder inputToken(String inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * <p>The output token limit.</p>
             * 
             * <strong>example:</strong>
             * <p>8K</p>
             */
            public Builder outputToken(String outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            /**
             * <p>The feature type or capability category of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>Chat</p>
             */
            public Builder type(String type) {
                this.type = type;
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
             * <p>The base URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The list of models.</p>
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            /**
             * <p>The provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>通义千问</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The provider identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
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
