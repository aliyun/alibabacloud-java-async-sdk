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
 * {@link DescribeRenderingInstanceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenderingInstanceConfigurationRequest</p>
 */
public class DescribeRenderingInstanceConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List<Configuration> configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private DescribeRenderingInstanceConfigurationRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRenderingInstanceConfigurationRequest, Builder> {
        private java.util.List<Configuration> configuration; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenderingInstanceConfigurationRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * Configuration.
         */
        public Builder configuration(java.util.List<Configuration> configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putQueryParameter("Configuration", configurationShrink);
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
        public DescribeRenderingInstanceConfigurationRequest build() {
            return new DescribeRenderingInstanceConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenderingInstanceConfigurationRequest} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceConfigurationRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeNames")
        private java.util.List<String> attributeNames;

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
        public java.util.List<String> getAttributeNames() {
            return this.attributeNames;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List<String> attributeNames; 
            private String moduleName; 

            /**
             * AttributeNames.
             */
            public Builder attributeNames(java.util.List<String> attributeNames) {
                this.attributeNames = attributeNames;
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
