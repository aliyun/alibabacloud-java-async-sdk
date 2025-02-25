// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIndexTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexTemplateRequest</p>
 */
public class CreateIndexTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataStream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dataStream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ilmPolicy")
    private String ilmPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexPatterns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > indexPatterns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template")
    private Template template;

    private CreateIndexTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.dataStream = builder.dataStream;
        this.ilmPolicy = builder.ilmPolicy;
        this.indexPatterns = builder.indexPatterns;
        this.indexTemplate = builder.indexTemplate;
        this.priority = builder.priority;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndexTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataStream
     */
    public Boolean getDataStream() {
        return this.dataStream;
    }

    /**
     * @return ilmPolicy
     */
    public String getIlmPolicy() {
        return this.ilmPolicy;
    }

    /**
     * @return indexPatterns
     */
    public java.util.List < String > getIndexPatterns() {
        return this.indexPatterns;
    }

    /**
     * @return indexTemplate
     */
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<CreateIndexTemplateRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private Boolean dataStream; 
        private String ilmPolicy; 
        private java.util.List < String > indexPatterns; 
        private String indexTemplate; 
        private Integer priority; 
        private Template template; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.dataStream = request.dataStream;
            this.ilmPolicy = request.ilmPolicy;
            this.indexPatterns = request.indexPatterns;
            this.indexTemplate = request.indexTemplate;
            this.priority = request.priority;
            this.template = request.template;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w24n9u900am****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataStream(Boolean dataStream) {
            this.putBodyParameter("dataStream", dataStream);
            this.dataStream = dataStream;
            return this;
        }

        /**
         * ilmPolicy.
         */
        public Builder ilmPolicy(String ilmPolicy) {
            this.putBodyParameter("ilmPolicy", ilmPolicy);
            this.ilmPolicy = ilmPolicy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder indexPatterns(java.util.List < String > indexPatterns) {
            this.putBodyParameter("indexPatterns", indexPatterns);
            this.indexPatterns = indexPatterns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>index-template</p>
         */
        public Builder indexTemplate(String indexTemplate) {
            this.putBodyParameter("indexTemplate", indexTemplate);
            this.indexTemplate = indexTemplate;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * template.
         */
        public Builder template(Template template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        @Override
        public CreateIndexTemplateRequest build() {
            return new CreateIndexTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIndexTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexTemplateRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliases")
        private String aliases;

        @com.aliyun.core.annotation.NameInMap("mappings")
        private String mappings;

        @com.aliyun.core.annotation.NameInMap("settings")
        private String settings;

        private Template(Builder builder) {
            this.aliases = builder.aliases;
            this.mappings = builder.mappings;
            this.settings = builder.settings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return aliases
         */
        public String getAliases() {
            return this.aliases;
        }

        /**
         * @return mappings
         */
        public String getMappings() {
            return this.mappings;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        public static final class Builder {
            private String aliases; 
            private String mappings; 
            private String settings; 

            /**
             * aliases.
             */
            public Builder aliases(String aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * mappings.
             */
            public Builder mappings(String mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
