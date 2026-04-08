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
 * {@link ExportHttpApiRequest} extends {@link RequestModel}
 *
 * <p>ExportHttpApiRequest</p>
 */
public class ExportHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extensionConfig")
    private ExtensionConfig extensionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationIds")
    private java.util.List<String> operationIds;

    private ExportHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.extensionConfig = builder.extensionConfig;
        this.gatewayId = builder.gatewayId;
        this.operationIds = builder.operationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return extensionConfig
     */
    public ExtensionConfig getExtensionConfig() {
        return this.extensionConfig;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return operationIds
     */
    public java.util.List<String> getOperationIds() {
        return this.operationIds;
    }

    public static final class Builder extends Request.Builder<ExportHttpApiRequest, Builder> {
        private String httpApiId; 
        private ExtensionConfig extensionConfig; 
        private String gatewayId; 
        private java.util.List<String> operationIds; 

        private Builder() {
            super();
        } 

        private Builder(ExportHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.extensionConfig = request.extensionConfig;
            this.gatewayId = request.gatewayId;
            this.operationIds = request.operationIds;
        } 

        /**
         * <p>The HTTP API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * extensionConfig.
         */
        public Builder extensionConfig(ExtensionConfig extensionConfig) {
            this.putBodyParameter("extensionConfig", extensionConfig);
            this.extensionConfig = extensionConfig;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * operationIds.
         */
        public Builder operationIds(java.util.List<String> operationIds) {
            this.putBodyParameter("operationIds", operationIds);
            this.operationIds = operationIds;
            return this;
        }

        @Override
        public ExportHttpApiRequest build() {
            return new ExportHttpApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExportHttpApiRequest} extends {@link TeaModel}
     *
     * <p>ExportHttpApiRequest</p>
     */
    public static class ExtensionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("withAuthConfig")
        private Boolean withAuthConfig;

        @com.aliyun.core.annotation.NameInMap("withAuthConsumer")
        private Boolean withAuthConsumer;

        @com.aliyun.core.annotation.NameInMap("withPlugin")
        private Boolean withPlugin;

        @com.aliyun.core.annotation.NameInMap("withPolicy")
        private Boolean withPolicy;

        @com.aliyun.core.annotation.NameInMap("withService")
        private Boolean withService;

        private ExtensionConfig(Builder builder) {
            this.withAuthConfig = builder.withAuthConfig;
            this.withAuthConsumer = builder.withAuthConsumer;
            this.withPlugin = builder.withPlugin;
            this.withPolicy = builder.withPolicy;
            this.withService = builder.withService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtensionConfig create() {
            return builder().build();
        }

        /**
         * @return withAuthConfig
         */
        public Boolean getWithAuthConfig() {
            return this.withAuthConfig;
        }

        /**
         * @return withAuthConsumer
         */
        public Boolean getWithAuthConsumer() {
            return this.withAuthConsumer;
        }

        /**
         * @return withPlugin
         */
        public Boolean getWithPlugin() {
            return this.withPlugin;
        }

        /**
         * @return withPolicy
         */
        public Boolean getWithPolicy() {
            return this.withPolicy;
        }

        /**
         * @return withService
         */
        public Boolean getWithService() {
            return this.withService;
        }

        public static final class Builder {
            private Boolean withAuthConfig; 
            private Boolean withAuthConsumer; 
            private Boolean withPlugin; 
            private Boolean withPolicy; 
            private Boolean withService; 

            private Builder() {
            } 

            private Builder(ExtensionConfig model) {
                this.withAuthConfig = model.withAuthConfig;
                this.withAuthConsumer = model.withAuthConsumer;
                this.withPlugin = model.withPlugin;
                this.withPolicy = model.withPolicy;
                this.withService = model.withService;
            } 

            /**
             * withAuthConfig.
             */
            public Builder withAuthConfig(Boolean withAuthConfig) {
                this.withAuthConfig = withAuthConfig;
                return this;
            }

            /**
             * withAuthConsumer.
             */
            public Builder withAuthConsumer(Boolean withAuthConsumer) {
                this.withAuthConsumer = withAuthConsumer;
                return this;
            }

            /**
             * withPlugin.
             */
            public Builder withPlugin(Boolean withPlugin) {
                this.withPlugin = withPlugin;
                return this;
            }

            /**
             * withPolicy.
             */
            public Builder withPolicy(Boolean withPolicy) {
                this.withPolicy = withPolicy;
                return this;
            }

            /**
             * withService.
             */
            public Builder withService(Boolean withService) {
                this.withService = withService;
                return this;
            }

            public ExtensionConfig build() {
                return new ExtensionConfig(this);
            } 

        } 

    }
}
