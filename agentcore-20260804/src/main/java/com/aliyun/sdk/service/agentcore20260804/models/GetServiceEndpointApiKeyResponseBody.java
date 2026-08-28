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
 * {@link GetServiceEndpointApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceEndpointApiKeyResponseBody</p>
 */
public class GetServiceEndpointApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetServiceEndpointApiKeyResponseBody(Builder builder) {
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

    public static GetServiceEndpointApiKeyResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceEndpointApiKeyResponseBody model) {
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
        public Builder data(Data data) {
            this.data = data;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceEndpointApiKeyResponseBody build() {
            return new GetServiceEndpointApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceEndpointApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("apiKeyFingerprint")
        private String apiKeyFingerprint;

        @com.aliyun.core.annotation.NameInMap("apiKeyName")
        private String apiKeyName;

        @com.aliyun.core.annotation.NameInMap("apiKeySource")
        private String apiKeySource;

        @com.aliyun.core.annotation.NameInMap("authenticationType")
        private String authenticationType;

        @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
        private String serviceEndpointId;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiKeyFingerprint = builder.apiKeyFingerprint;
            this.apiKeyName = builder.apiKeyName;
            this.apiKeySource = builder.apiKeySource;
            this.authenticationType = builder.authenticationType;
            this.serviceEndpointId = builder.serviceEndpointId;
            this.workspaceId = builder.workspaceId;
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
         * @return apiKeyFingerprint
         */
        public String getApiKeyFingerprint() {
            return this.apiKeyFingerprint;
        }

        /**
         * @return apiKeyName
         */
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        /**
         * @return apiKeySource
         */
        public String getApiKeySource() {
            return this.apiKeySource;
        }

        /**
         * @return authenticationType
         */
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        /**
         * @return serviceEndpointId
         */
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String apiKey; 
            private String apiKeyFingerprint; 
            private String apiKeyName; 
            private String apiKeySource; 
            private String authenticationType; 
            private String serviceEndpointId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.apiKeyFingerprint = model.apiKeyFingerprint;
                this.apiKeyName = model.apiKeyName;
                this.apiKeySource = model.apiKeySource;
                this.authenticationType = model.authenticationType;
                this.serviceEndpointId = model.serviceEndpointId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * apiKeyFingerprint.
             */
            public Builder apiKeyFingerprint(String apiKeyFingerprint) {
                this.apiKeyFingerprint = apiKeyFingerprint;
                return this;
            }

            /**
             * apiKeyName.
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * apiKeySource.
             */
            public Builder apiKeySource(String apiKeySource) {
                this.apiKeySource = apiKeySource;
                return this;
            }

            /**
             * authenticationType.
             */
            public Builder authenticationType(String authenticationType) {
                this.authenticationType = authenticationType;
                return this;
            }

            /**
             * serviceEndpointId.
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
