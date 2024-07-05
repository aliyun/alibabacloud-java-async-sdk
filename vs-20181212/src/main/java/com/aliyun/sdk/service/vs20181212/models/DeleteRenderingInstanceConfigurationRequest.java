// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRenderingInstanceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteRenderingInstanceConfigurationRequest</p>
 */
public class DeleteRenderingInstanceConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List < Configuration> configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private DeleteRenderingInstanceConfigurationRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRenderingInstanceConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public java.util.List < Configuration> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteRenderingInstanceConfigurationRequest, Builder> {
        private java.util.List < Configuration> configuration; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRenderingInstanceConfigurationRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * Configuration.
         */
        public Builder configuration(java.util.List < Configuration> configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putBodyParameter("Configuration", configurationShrink);
            this.configuration = configuration;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public DeleteRenderingInstanceConfigurationRequest build() {
            return new DeleteRenderingInstanceConfigurationRequest(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeNames")
        private java.util.List < String > attributeNames;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleName;

        private Configuration(Builder builder) {
            this.attributeNames = builder.attributeNames;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return attributeNames
         */
        public java.util.List < String > getAttributeNames() {
            return this.attributeNames;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List < String > attributeNames; 
            private String moduleName; 

            /**
             * AttributeNames.
             */
            public Builder attributeNames(java.util.List < String > attributeNames) {
                this.attributeNames = attributeNames;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
