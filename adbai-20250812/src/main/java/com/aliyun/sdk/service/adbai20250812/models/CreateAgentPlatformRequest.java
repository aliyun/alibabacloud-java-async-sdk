// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link CreateAgentPlatformRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentPlatformRequest</p>
 */
public class CreateAgentPlatformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiPlatformConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private AiPlatformConfig aiPlatformConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateAgentPlatformRequest(Builder builder) {
        super(builder);
        this.aiPlatformConfig = builder.aiPlatformConfig;
        this.DBClusterId = builder.DBClusterId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentPlatformRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiPlatformConfig
     */
    public AiPlatformConfig getAiPlatformConfig() {
        return this.aiPlatformConfig;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAgentPlatformRequest, Builder> {
        private AiPlatformConfig aiPlatformConfig; 
        private String DBClusterId; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentPlatformRequest request) {
            super(request);
            this.aiPlatformConfig = request.aiPlatformConfig;
            this.DBClusterId = request.DBClusterId;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aiPlatformConfig(AiPlatformConfig aiPlatformConfig) {
            String aiPlatformConfigShrink = shrink(aiPlatformConfig, "AiPlatformConfig", "json");
            this.putQueryParameter("AiPlatformConfig", aiPlatformConfigShrink);
            this.aiPlatformConfig = aiPlatformConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testplatform</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAgentPlatformRequest build() {
            return new CreateAgentPlatformRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentPlatformRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentPlatformRequest</p>
     */
    public static class AiPlatformConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServeApiKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serveApiKey;

        @com.aliyun.core.annotation.NameInMap("ServeEmbeddingEndpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serveEmbeddingEndpoint;

        @com.aliyun.core.annotation.NameInMap("ServeEmbeddingModelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serveEmbeddingModelName;

        @com.aliyun.core.annotation.NameInMap("ServeEndpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serveEndpoint;

        @com.aliyun.core.annotation.NameInMap("ServeModelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serveModelName;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String specName;

        private AiPlatformConfig(Builder builder) {
            this.serveApiKey = builder.serveApiKey;
            this.serveEmbeddingEndpoint = builder.serveEmbeddingEndpoint;
            this.serveEmbeddingModelName = builder.serveEmbeddingModelName;
            this.serveEndpoint = builder.serveEndpoint;
            this.serveModelName = builder.serveModelName;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiPlatformConfig create() {
            return builder().build();
        }

        /**
         * @return serveApiKey
         */
        public String getServeApiKey() {
            return this.serveApiKey;
        }

        /**
         * @return serveEmbeddingEndpoint
         */
        public String getServeEmbeddingEndpoint() {
            return this.serveEmbeddingEndpoint;
        }

        /**
         * @return serveEmbeddingModelName
         */
        public String getServeEmbeddingModelName() {
            return this.serveEmbeddingModelName;
        }

        /**
         * @return serveEndpoint
         */
        public String getServeEndpoint() {
            return this.serveEndpoint;
        }

        /**
         * @return serveModelName
         */
        public String getServeModelName() {
            return this.serveModelName;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private String serveApiKey; 
            private String serveEmbeddingEndpoint; 
            private String serveEmbeddingModelName; 
            private String serveEndpoint; 
            private String serveModelName; 
            private String specName; 

            private Builder() {
            } 

            private Builder(AiPlatformConfig model) {
                this.serveApiKey = model.serveApiKey;
                this.serveEmbeddingEndpoint = model.serveEmbeddingEndpoint;
                this.serveEmbeddingModelName = model.serveEmbeddingModelName;
                this.serveEndpoint = model.serveEndpoint;
                this.serveModelName = model.serveModelName;
                this.specName = model.specName;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3760d3**************************</p>
             */
            public Builder serveApiKey(String serveApiKey) {
                this.serveApiKey = serveApiKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/emb">http://111.xx.xx.xx:8100/inferenceservice/emb</a></p>
             */
            public Builder serveEmbeddingEndpoint(String serveEmbeddingEndpoint) {
                this.serveEmbeddingEndpoint = serveEmbeddingEndpoint;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3-Embedding-8B</p>
             */
            public Builder serveEmbeddingModelName(String serveEmbeddingModelName) {
                this.serveEmbeddingModelName = serveEmbeddingModelName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/base">http://111.xx.xx.xx:8100/inferenceservice/base</a></p>
             */
            public Builder serveEndpoint(String serveEndpoint) {
                this.serveEndpoint = serveEndpoint;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3-235B-A22B-Instruct-2507</p>
             */
            public Builder serveModelName(String serveModelName) {
                this.serveModelName = serveModelName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public AiPlatformConfig build() {
                return new AiPlatformConfig(this);
            } 

        } 

    }
}
