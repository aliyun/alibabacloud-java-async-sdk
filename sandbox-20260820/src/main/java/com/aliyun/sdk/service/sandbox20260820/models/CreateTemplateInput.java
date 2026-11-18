// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateTemplateInput} extends {@link TeaModel}
 *
 * <p>CreateTemplateInput</p>
 */
public class CreateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildConfig")
    private CreateTemplateBuildConfig buildConfig;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceTags")
    private java.util.List<ResourceTags> resourceTags;

    @com.aliyun.core.annotation.NameInMap("runtimeConfig")
    private CreateTemplateRuntimeConfig runtimeConfig;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private CreateTemplateInput(Builder builder) {
        this.buildConfig = builder.buildConfig;
        this.name = builder.name;
        this.resourceTags = builder.resourceTags;
        this.runtimeConfig = builder.runtimeConfig;
        this.teamID = builder.teamID;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildConfig
     */
    public CreateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceTags
     */
    public java.util.List<ResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    /**
     * @return runtimeConfig
     */
    public CreateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private CreateTemplateBuildConfig buildConfig; 
        private String name; 
        private java.util.List<ResourceTags> resourceTags; 
        private CreateTemplateRuntimeConfig runtimeConfig; 
        private String teamID; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(CreateTemplateInput model) {
            this.buildConfig = model.buildConfig;
            this.name = model.name;
            this.resourceTags = model.resourceTags;
            this.runtimeConfig = model.runtimeConfig;
            this.teamID = model.teamID;
            this.templateType = model.templateType;
        } 

        /**
         * <p>The build configuration of the template. This configuration specifies the build process in action-based chunks. If this parameter is not specified, the service automatically derives the configuration based on the source image. Public runtime images are used directly without building. For other images, the copy and envdInject actions are automatically executed.</p>
         */
        public Builder buildConfig(CreateTemplateBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * <p>The name of the template. The name must be unique within the same team.</p>
         * 
         * <strong>example:</strong>
         * <p>python-data-analysis</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The resource tags.</p>
         */
        public Builder resourceTags(java.util.List<ResourceTags> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        /**
         * <p>The runtime configuration of the template. This configuration determines the specifications and environment of the sandbox instances created from the template.</p>
         */
        public Builder runtimeConfig(CreateTemplateRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * <p>The ID of the team to which the template belongs. The ID must be in UUID format. If this parameter is not specified, the default team of the current account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>5f4a2c18-****</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The templatetype. Set this parameter to layer to build a layer template.</p>
         * 
         * <strong>example:</strong>
         * <p>layer</p>
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public CreateTemplateInput build() {
            return new CreateTemplateInput(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateInput} extends {@link TeaModel}
     *
     * <p>CreateTemplateInput</p>
     */
    public static class ResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTags build() {
                return new ResourceTags(this);
            } 

        } 

    }
}
