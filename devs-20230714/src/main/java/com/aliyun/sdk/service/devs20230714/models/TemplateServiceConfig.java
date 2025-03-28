// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TemplateServiceConfig} extends {@link TeaModel}
 *
 * <p>TemplateServiceConfig</p>
 */
public class TemplateServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifact")
    private ArtifactMeta artifact;

    @com.aliyun.core.annotation.NameInMap("build")
    private BuildConfig build;

    @com.aliyun.core.annotation.NameInMap("component")
    private String component;

    @com.aliyun.core.annotation.NameInMap("props")
    private java.util.Map<String, ?> props;

    @com.aliyun.core.annotation.NameInMap("source")
    private SourceConfig source;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, TemplateParameterSchema> variables;

    private TemplateServiceConfig(Builder builder) {
        this.artifact = builder.artifact;
        this.build = builder.build;
        this.component = builder.component;
        this.props = builder.props;
        this.source = builder.source;
        this.type = builder.type;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifact
     */
    public ArtifactMeta getArtifact() {
        return this.artifact;
    }

    /**
     * @return build
     */
    public BuildConfig getBuild() {
        return this.build;
    }

    /**
     * @return component
     */
    public String getComponent() {
        return this.component;
    }

    /**
     * @return props
     */
    public java.util.Map<String, ?> getProps() {
        return this.props;
    }

    /**
     * @return source
     */
    public SourceConfig getSource() {
        return this.source;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, TemplateParameterSchema> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private ArtifactMeta artifact; 
        private BuildConfig build; 
        private String component; 
        private java.util.Map<String, ?> props; 
        private SourceConfig source; 
        private String type; 
        private java.util.Map<String, TemplateParameterSchema> variables; 

        private Builder() {
        } 

        private Builder(TemplateServiceConfig model) {
            this.artifact = model.artifact;
            this.build = model.build;
            this.component = model.component;
            this.props = model.props;
            this.source = model.source;
            this.type = model.type;
            this.variables = model.variables;
        } 

        /**
         * artifact.
         */
        public Builder artifact(ArtifactMeta artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * build.
         */
        public Builder build(BuildConfig build) {
            this.build = build;
            return this;
        }

        /**
         * component.
         */
        public Builder component(String component) {
            this.component = component;
            return this;
        }

        /**
         * props.
         */
        public Builder props(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }

        /**
         * source.
         */
        public Builder source(SourceConfig source) {
            this.source = source;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, TemplateParameterSchema> variables) {
            this.variables = variables;
            return this;
        }

        public TemplateServiceConfig build() {
            return new TemplateServiceConfig(this);
        } 

    } 

}
