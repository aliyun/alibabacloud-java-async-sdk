// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIndexTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexTemplateRequest</p>
 */
public class CreateIndexTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("dataStream")
    @Validation(required = true)
    private Boolean dataStream;

    @Body
    @NameInMap("ilmPolicy")
    private String ilmPolicy;

    @Body
    @NameInMap("indexPatterns")
    @Validation(required = true)
    private java.util.List < String > indexPatterns;

    @Body
    @NameInMap("indexTemplate")
    @Validation(required = true)
    private String indexTemplate;

    @Body
    @NameInMap("priority")
    @Validation(maximum = 2147483647)
    private Integer priority;

    @Body
    @NameInMap("template")
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
         * InstanceId.
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
         * dataStream.
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
         * indexPatterns.
         */
        public Builder indexPatterns(java.util.List < String > indexPatterns) {
            this.putBodyParameter("indexPatterns", indexPatterns);
            this.indexPatterns = indexPatterns;
            return this;
        }

        /**
         * indexTemplate.
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

    public static class Template extends TeaModel {
        @NameInMap("aliases")
        private String aliases;

        @NameInMap("mappings")
        private String mappings;

        @NameInMap("settings")
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
