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
 * {@link UpdateAgentIMChannelCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentIMChannelCredentialResponseBody</p>
 */
public class UpdateAgentIMChannelCredentialResponseBody extends TeaModel {
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

    private UpdateAgentIMChannelCredentialResponseBody(Builder builder) {
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

    public static UpdateAgentIMChannelCredentialResponseBody create() {
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

        private Builder(UpdateAgentIMChannelCredentialResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The summary of the updated IM channel credential.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result message of the request.</p>
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
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateAgentIMChannelCredentialResponseBody build() {
            return new UpdateAgentIMChannelCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentIMChannelCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentIMChannelCredentialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuredSecretFields")
        private java.util.List<String> configuredSecretFields;

        @com.aliyun.core.annotation.NameInMap("nonSecretFields")
        private java.util.Map<String, String> nonSecretFields;

        private Data(Builder builder) {
            this.configuredSecretFields = builder.configuredSecretFields;
            this.nonSecretFields = builder.nonSecretFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuredSecretFields
         */
        public java.util.List<String> getConfiguredSecretFields() {
            return this.configuredSecretFields;
        }

        /**
         * @return nonSecretFields
         */
        public java.util.Map<String, String> getNonSecretFields() {
            return this.nonSecretFields;
        }

        public static final class Builder {
            private java.util.List<String> configuredSecretFields; 
            private java.util.Map<String, String> nonSecretFields; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuredSecretFields = model.configuredSecretFields;
                this.nonSecretFields = model.nonSecretFields;
            } 

            /**
             * <p>The list of configured secret field names. Secret values are not included.</p>
             */
            public Builder configuredSecretFields(java.util.List<String> configuredSecretFields) {
                this.configuredSecretFields = configuredSecretFields;
                return this;
            }

            /**
             * <p>The non-sensitive credential fields and their values.</p>
             */
            public Builder nonSecretFields(java.util.Map<String, String> nonSecretFields) {
                this.nonSecretFields = nonSecretFields;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
