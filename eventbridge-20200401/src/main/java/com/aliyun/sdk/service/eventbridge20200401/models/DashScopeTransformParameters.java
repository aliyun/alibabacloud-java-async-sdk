// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link DashScopeTransformParameters} extends {@link TeaModel}
 *
 * <p>DashScopeTransformParameters</p>
 */
public class DashScopeTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("RequestPerMinute")
    private Long requestPerMinute;

    @com.aliyun.core.annotation.NameInMap("StructuredOutputJsonSchema")
    private String structuredOutputJsonSchema;

    @com.aliyun.core.annotation.NameInMap("TokenPerMinute")
    private Long tokenPerMinute;

    private DashScopeTransformParameters(Builder builder) {
        this.apiKey = builder.apiKey;
        this.messages = builder.messages;
        this.model = builder.model;
        this.requestPerMinute = builder.requestPerMinute;
        this.structuredOutputJsonSchema = builder.structuredOutputJsonSchema;
        this.tokenPerMinute = builder.tokenPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DashScopeTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return requestPerMinute
     */
    public Long getRequestPerMinute() {
        return this.requestPerMinute;
    }

    /**
     * @return structuredOutputJsonSchema
     */
    public String getStructuredOutputJsonSchema() {
        return this.structuredOutputJsonSchema;
    }

    /**
     * @return tokenPerMinute
     */
    public Long getTokenPerMinute() {
        return this.tokenPerMinute;
    }

    public static final class Builder {
        private String apiKey; 
        private java.util.List<Messages> messages; 
        private String model; 
        private Long requestPerMinute; 
        private String structuredOutputJsonSchema; 
        private Long tokenPerMinute; 

        private Builder() {
        } 

        private Builder(DashScopeTransformParameters model) {
            this.apiKey = model.apiKey;
            this.messages = model.messages;
            this.model = model.model;
            this.requestPerMinute = model.requestPerMinute;
            this.structuredOutputJsonSchema = model.structuredOutputJsonSchema;
            this.tokenPerMinute = model.tokenPerMinute;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * RequestPerMinute.
         */
        public Builder requestPerMinute(Long requestPerMinute) {
            this.requestPerMinute = requestPerMinute;
            return this;
        }

        /**
         * StructuredOutputJsonSchema.
         */
        public Builder structuredOutputJsonSchema(String structuredOutputJsonSchema) {
            this.structuredOutputJsonSchema = structuredOutputJsonSchema;
            return this;
        }

        /**
         * TokenPerMinute.
         */
        public Builder tokenPerMinute(Long tokenPerMinute) {
            this.tokenPerMinute = tokenPerMinute;
            return this;
        }

        public DashScopeTransformParameters build() {
            return new DashScopeTransformParameters(this);
        } 

    } 

    /**
     * 
     * {@link DashScopeTransformParameters} extends {@link TeaModel}
     *
     * <p>DashScopeTransformParameters</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Messages(Builder builder) {
            this.form = builder.form;
            this.role = builder.role;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String role; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.form = model.form;
                this.role = model.role;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
