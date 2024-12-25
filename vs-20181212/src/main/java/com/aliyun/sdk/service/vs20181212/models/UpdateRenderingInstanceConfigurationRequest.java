// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpdateRenderingInstanceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateRenderingInstanceConfigurationRequest</p>
 */
public class UpdateRenderingInstanceConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Configuration> configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private UpdateRenderingInstanceConfigurationRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRenderingInstanceConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public java.util.List<Configuration> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateRenderingInstanceConfigurationRequest, Builder> {
        private java.util.List<Configuration> configuration; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRenderingInstanceConfigurationRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configuration(java.util.List<Configuration> configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putBodyParameter("Configuration", configurationShrink);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public UpdateRenderingInstanceConfigurationRequest build() {
            return new UpdateRenderingInstanceConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRenderingInstanceConfigurationRequest} extends {@link TeaModel}
     *
     * <p>UpdateRenderingInstanceConfigurationRequest</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private Object value;

        private Attributes(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Object value; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lon</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRenderingInstanceConfigurationRequest} extends {@link TeaModel}
     *
     * <p>UpdateRenderingInstanceConfigurationRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleName;

        private Configuration(Builder builder) {
            this.attributes = builder.attributes;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String moduleName; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>location</p>
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
