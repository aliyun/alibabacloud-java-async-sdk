// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ResetApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ResetApiKeyResponseBody</p>
 */
public class ResetApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private ApiKey apiKey;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ResetApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public ApiKey getApiKey() {
        return this.apiKey;
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
        private ApiKey apiKey; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ResetApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(ApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36045E0A-551D-592D-B1BC-4C56596CE59E</p>
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

        public ResetApiKeyResponseBody build() {
            return new ResetApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ResetApiKeyResponseBody</p>
     */
    public static class ApiKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyId")
        private Long apiKeyId;

        @com.aliyun.core.annotation.NameInMap("apiKeyValue")
        private String apiKeyValue;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private ApiKey(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.apiKeyValue = builder.apiKeyValue;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKey create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long apiKeyId; 
            private String apiKeyValue; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ApiKey model) {
                this.apiKeyId = model.apiKeyId;
                this.apiKeyValue = model.apiKeyValue;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>API Key ID。</p>
             * 
             * <strong>example:</strong>
             * <p>2965964</p>
             */
            public Builder apiKeyId(Long apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * apiKeyValue.
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ApiKey build() {
                return new ApiKey(this);
            } 

        } 

    }
}
