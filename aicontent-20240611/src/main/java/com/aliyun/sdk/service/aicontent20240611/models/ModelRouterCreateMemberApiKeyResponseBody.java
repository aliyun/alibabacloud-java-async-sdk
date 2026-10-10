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
 * {@link ModelRouterCreateMemberApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterCreateMemberApiKeyResponseBody</p>
 */
public class ModelRouterCreateMemberApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

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

    private ModelRouterCreateMemberApiKeyResponseBody(Builder builder) {
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

    public static ModelRouterCreateMemberApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterCreateMemberApiKeyResponseBody model) {
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
         * <p>{ &quot;apiKeyId&quot;: 502, &quot;apiKey&quot;: &quot;sk-xxxxxxxxxxxxxxxx&quot; }</p>
         */
        public Builder data(Data data) {
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

        public ModelRouterCreateMemberApiKeyResponseBody build() {
            return new ModelRouterCreateMemberApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterCreateMemberApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterCreateMemberApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("apiKeyId")
        private Long apiKeyId;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiKeyId = builder.apiKeyId;
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
         * @return apiKeyId
         */
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        public static final class Builder {
            private String apiKey; 
            private Long apiKeyId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.apiKeyId = model.apiKeyId;
            } 

            /**
             * <p>The full API key in plaintext. This value is returned only once during creation. Store it securely.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxxxxxxxxxxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The API key ID. You can use this ID to query the bound groups by API key.</p>
             * 
             * <strong>example:</strong>
             * <p>502</p>
             */
            public Builder apiKeyId(Long apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
