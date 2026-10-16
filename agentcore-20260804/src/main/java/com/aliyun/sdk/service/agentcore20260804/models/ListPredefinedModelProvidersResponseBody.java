// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListPredefinedModelProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListPredefinedModelProvidersResponseBody</p>
 */
public class ListPredefinedModelProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListPredefinedModelProvidersResponseBody(Builder builder) {
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

    public static ListPredefinedModelProvidersResponseBody create() {
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
    public Integer getHttpStatusCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPredefinedModelProvidersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value is SUCCESS if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of predefined model providers.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value is 200 if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message about the request processing result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPredefinedModelProvidersResponseBody build() {
            return new ListPredefinedModelProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPredefinedModelProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPredefinedModelProvidersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultEndpoint")
        private String defaultEndpoint;

        @com.aliyun.core.annotation.NameInMap("defaultProtocol")
        private String defaultProtocol;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("providerType")
        private String providerType;

        private Data(Builder builder) {
            this.defaultEndpoint = builder.defaultEndpoint;
            this.defaultProtocol = builder.defaultProtocol;
            this.displayName = builder.displayName;
            this.providerType = builder.providerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultEndpoint
         */
        public String getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        /**
         * @return defaultProtocol
         */
        public String getDefaultProtocol() {
            return this.defaultProtocol;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        public static final class Builder {
            private String defaultEndpoint; 
            private String defaultProtocol; 
            private String displayName; 
            private String providerType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.defaultEndpoint = model.defaultEndpoint;
                this.defaultProtocol = model.defaultProtocol;
                this.displayName = model.displayName;
                this.providerType = model.providerType;
            } 

            /**
             * <p>The default model service endpoint of the provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
             */
            public Builder defaultEndpoint(String defaultEndpoint) {
                this.defaultEndpoint = defaultEndpoint;
                return this;
            }

            /**
             * <p>The default model invocation protocol of the provider.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAI/v1</p>
             */
            public Builder defaultProtocol(String defaultProtocol) {
                this.defaultProtocol = defaultProtocol;
                return this;
            }

            /**
             * <p>The display name of the model provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Model Studio</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The model provider type.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
