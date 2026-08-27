// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link InvokeAIAgentRequest} extends {@link RequestModel}
 *
 * <p>InvokeAIAgentRequest</p>
 */
public class InvokeAIAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizParams")
    private java.util.Map<String, String> bizParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("history")
    private java.util.List<History> history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputLanguage")
    private String outputLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    private InvokeAIAgentRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.bizParams = builder.bizParams;
        this.history = builder.history;
        this.outputLanguage = builder.outputLanguage;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAIAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return bizParams
     */
    public java.util.Map<String, String> getBizParams() {
        return this.bizParams;
    }

    /**
     * @return history
     */
    public java.util.List<History> getHistory() {
        return this.history;
    }

    /**
     * @return outputLanguage
     */
    public String getOutputLanguage() {
        return this.outputLanguage;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    public static final class Builder extends Request.Builder<InvokeAIAgentRequest, Builder> {
        private String agentName; 
        private java.util.Map<String, String> bizParams; 
        private java.util.List<History> history; 
        private String outputLanguage; 
        private String prompt; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAIAgentRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.bizParams = request.bizParams;
            this.history = request.history;
            this.outputLanguage = request.outputLanguage;
            this.prompt = request.prompt;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("agentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * bizParams.
         */
        public Builder bizParams(java.util.Map<String, String> bizParams) {
            this.putBodyParameter("bizParams", bizParams);
            this.bizParams = bizParams;
            return this;
        }

        /**
         * history.
         */
        public Builder history(java.util.List<History> history) {
            this.putBodyParameter("history", history);
            this.history = history;
            return this;
        }

        /**
         * outputLanguage.
         */
        public Builder outputLanguage(String outputLanguage) {
            this.putBodyParameter("outputLanguage", outputLanguage);
            this.outputLanguage = outputLanguage;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        @Override
        public InvokeAIAgentRequest build() {
            return new InvokeAIAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAIAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAIAgentRequest</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private History(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(History model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
}
