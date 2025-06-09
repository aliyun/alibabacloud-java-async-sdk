// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CopilotAction} extends {@link TeaModel}
 *
 * <p>CopilotAction</p>
 */
public class CopilotAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("queryMaxLength")
    private Long queryMaxLength;

    @com.aliyun.core.annotation.NameInMap("queryTemplate")
    private String queryTemplate;

    @com.aliyun.core.annotation.NameInMap("queryTemplateParameters")
    private java.util.List<QueryTemplateParameters> queryTemplateParameters;

    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    private CopilotAction(Builder builder) {
        this.action = builder.action;
        this.description = builder.description;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.queryMaxLength = builder.queryMaxLength;
        this.queryTemplate = builder.queryTemplate;
        this.queryTemplateParameters = builder.queryTemplateParameters;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopilotAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return queryMaxLength
     */
    public Long getQueryMaxLength() {
        return this.queryMaxLength;
    }

    /**
     * @return queryTemplate
     */
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    /**
     * @return queryTemplateParameters
     */
    public java.util.List<QueryTemplateParameters> getQueryTemplateParameters() {
        return this.queryTemplateParameters;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder {
        private String action; 
        private String description; 
        private String name; 
        private java.util.List<Parameters> parameters; 
        private Long queryMaxLength; 
        private String queryTemplate; 
        private java.util.List<QueryTemplateParameters> queryTemplateParameters; 
        private String scene; 

        private Builder() {
        } 

        private Builder(CopilotAction model) {
            this.action = model.action;
            this.description = model.description;
            this.name = model.name;
            this.parameters = model.parameters;
            this.queryMaxLength = model.queryMaxLength;
            this.queryTemplate = model.queryTemplate;
            this.queryTemplateParameters = model.queryTemplateParameters;
            this.scene = model.scene;
        } 

        /**
         * action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * queryMaxLength.
         */
        public Builder queryMaxLength(Long queryMaxLength) {
            this.queryMaxLength = queryMaxLength;
            return this;
        }

        /**
         * queryTemplate.
         */
        public Builder queryTemplate(String queryTemplate) {
            this.queryTemplate = queryTemplate;
            return this;
        }

        /**
         * queryTemplateParameters.
         */
        public Builder queryTemplateParameters(java.util.List<QueryTemplateParameters> queryTemplateParameters) {
            this.queryTemplateParameters = queryTemplateParameters;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        public CopilotAction build() {
            return new CopilotAction(this);
        } 

    } 

    /**
     * 
     * {@link CopilotAction} extends {@link TeaModel}
     *
     * <p>CopilotAction</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("required")
        private String required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String prompt; 
            private String required; 
            private String type; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.prompt = model.prompt;
                this.required = model.required;
                this.type = model.type;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopilotAction} extends {@link TeaModel}
     *
     * <p>CopilotAction</p>
     */
    public static class QueryTemplateParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("required")
        private String required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private QueryTemplateParameters(Builder builder) {
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryTemplateParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String prompt; 
            private String required; 
            private String type; 

            private Builder() {
            } 

            private Builder(QueryTemplateParameters model) {
                this.name = model.name;
                this.prompt = model.prompt;
                this.required = model.required;
                this.type = model.type;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QueryTemplateParameters build() {
                return new QueryTemplateParameters(this);
            } 

        } 

    }
}
