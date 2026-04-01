// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link InitModelRequest} extends {@link RequestModel}
 *
 * <p>InitModelRequest</p>
 */
public class InitModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("http_schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private InitModelRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.apiKey = builder.apiKey;
        this.host = builder.host;
        this.httpSchema = builder.httpSchema;
        this.models = builder.models;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitModelRequest create() {
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
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return httpSchema
     */
    public String getHttpSchema() {
        return this.httpSchema;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<InitModelRequest, Builder> {
        private String instanceId; 
        private String apiKey; 
        private String host; 
        private String httpSchema; 
        private java.util.List<Models> models; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(InitModelRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.apiKey = request.apiKey;
            this.host = request.host;
            this.httpSchema = request.httpSchema;
            this.models = request.models;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-jjw4k***</p>
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
         * <p>os-xfdddf*</p>
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("api_key", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****.platform-cn-hangzhou-vpc.opensearch.aliyuncs.com</p>
         */
        public Builder host(String host) {
            this.putBodyParameter("host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        public Builder httpSchema(String httpSchema) {
            this.putBodyParameter("http_schema", httpSchema);
            this.httpSchema = httpSchema;
            return this;
        }

        /**
         * models.
         */
        public Builder models(java.util.List<Models> models) {
            this.putBodyParameter("models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public InitModelRequest build() {
            return new InitModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link InitModelRequest} extends {@link TeaModel}
     *
     * <p>InitModelRequest</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        private Models(Builder builder) {
            this.modelType = builder.modelType;
            this.serviceId = builder.serviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String modelType; 
            private String serviceId; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.modelType = model.modelType;
                this.serviceId = model.serviceId;
            } 

            /**
             * modelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
