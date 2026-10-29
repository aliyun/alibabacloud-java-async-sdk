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
 * {@link BaiLianAgentTransformParameters} extends {@link TeaModel}
 *
 * <p>BaiLianAgentTransformParameters</p>
 */
public class BaiLianAgentTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private Prompt prompt;

    @com.aliyun.core.annotation.NameInMap("RequestPerMinute")
    private Long requestPerMinute;

    @com.aliyun.core.annotation.NameInMap("TokenPerMinute")
    private Long tokenPerMinute;

    private BaiLianAgentTransformParameters(Builder builder) {
        this.apiKey = builder.apiKey;
        this.applicationId = builder.applicationId;
        this.prompt = builder.prompt;
        this.requestPerMinute = builder.requestPerMinute;
        this.tokenPerMinute = builder.tokenPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaiLianAgentTransformParameters create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return prompt
     */
    public Prompt getPrompt() {
        return this.prompt;
    }

    /**
     * @return requestPerMinute
     */
    public Long getRequestPerMinute() {
        return this.requestPerMinute;
    }

    /**
     * @return tokenPerMinute
     */
    public Long getTokenPerMinute() {
        return this.tokenPerMinute;
    }

    public static final class Builder {
        private String apiKey; 
        private String applicationId; 
        private Prompt prompt; 
        private Long requestPerMinute; 
        private Long tokenPerMinute; 

        private Builder() {
        } 

        private Builder(BaiLianAgentTransformParameters model) {
            this.apiKey = model.apiKey;
            this.applicationId = model.applicationId;
            this.prompt = model.prompt;
            this.requestPerMinute = model.requestPerMinute;
            this.tokenPerMinute = model.tokenPerMinute;
        } 

        /**
         * <p>The API key for Model Studio.</p>
         * 
         * <strong>example:</strong>
         * <p>Q34****</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The prompt.</p>
         */
        public Builder prompt(Prompt prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The throttling limit in requests per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder requestPerMinute(Long requestPerMinute) {
            this.requestPerMinute = requestPerMinute;
            return this;
        }

        /**
         * <p>The throttling limit in tokens per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder tokenPerMinute(Long tokenPerMinute) {
            this.tokenPerMinute = tokenPerMinute;
            return this;
        }

        public BaiLianAgentTransformParameters build() {
            return new BaiLianAgentTransformParameters(this);
        } 

    } 

    /**
     * 
     * {@link BaiLianAgentTransformParameters} extends {@link TeaModel}
     *
     * <p>BaiLianAgentTransformParameters</p>
     */
    public static class Prompt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Prompt(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prompt create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Prompt model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The template form.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The template value.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.message</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Prompt build() {
                return new Prompt(this);
            } 

        } 

    }
}
