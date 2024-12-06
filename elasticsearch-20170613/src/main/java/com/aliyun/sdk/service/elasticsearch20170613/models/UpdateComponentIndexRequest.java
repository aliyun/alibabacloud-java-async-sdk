// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateComponentIndexRequest} extends {@link RequestModel}
 *
 * <p>UpdateComponentIndexRequest</p>
 */
public class UpdateComponentIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("_meta")
    private java.util.Map < String, ? > meta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template")
    private Template template;

    private UpdateComponentIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.meta = builder.meta;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComponentIndexRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return meta
     */
    public java.util.Map < String, ? > getMeta() {
        return this.meta;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<UpdateComponentIndexRequest, Builder> {
        private String instanceId; 
        private String name; 
        private java.util.Map < String, ? > meta; 
        private Template template; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComponentIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.meta = request.meta;
            this.template = request.template;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-t57p81n7ai89v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>component-openstore-index-template</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * _meta.
         */
        public Builder meta(java.util.Map < String, ? > meta) {
            this.putBodyParameter("_meta", meta);
            this.meta = meta;
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
        public UpdateComponentIndexRequest build() {
            return new UpdateComponentIndexRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComponentIndexRequest} extends {@link TeaModel}
     *
     * <p>UpdateComponentIndexRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliases")
        private java.util.Map < String, ? > aliases;

        @com.aliyun.core.annotation.NameInMap("mappings")
        private java.util.Map < String, ? > mappings;

        @com.aliyun.core.annotation.NameInMap("settings")
        private java.util.Map < String, ? > settings;

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
        public java.util.Map < String, ? > getAliases() {
            return this.aliases;
        }

        /**
         * @return mappings
         */
        public java.util.Map < String, ? > getMappings() {
            return this.mappings;
        }

        /**
         * @return settings
         */
        public java.util.Map < String, ? > getSettings() {
            return this.settings;
        }

        public static final class Builder {
            private java.util.Map < String, ? > aliases; 
            private java.util.Map < String, ? > mappings; 
            private java.util.Map < String, ? > settings; 

            /**
             * aliases.
             */
            public Builder aliases(java.util.Map < String, ? > aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * mappings.
             */
            public Builder mappings(java.util.Map < String, ? > mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(java.util.Map < String, ? > settings) {
                this.settings = settings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
