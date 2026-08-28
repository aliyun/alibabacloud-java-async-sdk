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
             * configuredSecretFields.
             */
            public Builder configuredSecretFields(java.util.List<String> configuredSecretFields) {
                this.configuredSecretFields = configuredSecretFields;
                return this;
            }

            /**
             * nonSecretFields.
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
