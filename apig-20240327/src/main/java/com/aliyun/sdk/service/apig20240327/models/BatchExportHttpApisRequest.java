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
 * {@link BatchExportHttpApisRequest} extends {@link RequestModel}
 *
 * <p>BatchExportHttpApisRequest</p>
 */
public class BatchExportHttpApisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> apiIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extensionConfig")
    private ExtensionConfig extensionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private BatchExportHttpApisRequest(Builder builder) {
        super(builder);
        this.apiIds = builder.apiIds;
        this.apiType = builder.apiType;
        this.extensionConfig = builder.extensionConfig;
        this.format = builder.format;
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchExportHttpApisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiIds
     */
    public java.util.List<String> getApiIds() {
        return this.apiIds;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return extensionConfig
     */
    public ExtensionConfig getExtensionConfig() {
        return this.extensionConfig;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<BatchExportHttpApisRequest, Builder> {
        private java.util.List<String> apiIds; 
        private String apiType; 
        private ExtensionConfig extensionConfig; 
        private String format; 
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(BatchExportHttpApisRequest request) {
            super(request);
            this.apiIds = request.apiIds;
            this.apiType = request.apiType;
            this.extensionConfig = request.extensionConfig;
            this.format = request.format;
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiIds(java.util.List<String> apiIds) {
            this.putBodyParameter("apiIds", apiIds);
            this.apiIds = apiIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder apiType(String apiType) {
            this.putBodyParameter("apiType", apiType);
            this.apiType = apiType;
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
         * format.
         */
        public Builder format(String format) {
            this.putBodyParameter("format", format);
            this.format = format;
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

        @Override
        public BatchExportHttpApisRequest build() {
            return new BatchExportHttpApisRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchExportHttpApisRequest} extends {@link TeaModel}
     *
     * <p>BatchExportHttpApisRequest</p>
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
