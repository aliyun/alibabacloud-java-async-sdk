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
 * {@link ModifyAgentPlatformRequest} extends {@link RequestModel}
 *
 * <p>ModifyAgentPlatformRequest</p>
 */
public class ModifyAgentPlatformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiPlatformConfig")
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyAgentPlatformRequest(Builder builder) {
        super(builder);
        this.aiPlatformConfig = builder.aiPlatformConfig;
        this.DBClusterId = builder.DBClusterId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAgentPlatformRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyAgentPlatformRequest, Builder> {
        private AiPlatformConfig aiPlatformConfig; 
        private String DBClusterId; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAgentPlatformRequest request) {
            super(request);
            this.aiPlatformConfig = request.aiPlatformConfig;
            this.DBClusterId = request.DBClusterId;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * AiPlatformConfig.
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
         * <p>test_platform</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAgentPlatformRequest build() {
            return new ModifyAgentPlatformRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAgentPlatformRequest} extends {@link TeaModel}
     *
     * <p>ModifyAgentPlatformRequest</p>
     */
    public static class AiPlatformConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServeApiKey")
        private String serveApiKey;

        @com.aliyun.core.annotation.NameInMap("ServeEmbeddingEndpoint")
        private String serveEmbeddingEndpoint;

        @com.aliyun.core.annotation.NameInMap("ServeEmbeddingModelName")
        private String serveEmbeddingModelName;

        @com.aliyun.core.annotation.NameInMap("ServeEndpoint")
        private String serveEndpoint;

        @com.aliyun.core.annotation.NameInMap("ServeModelName")
        private String serveModelName;

        @com.aliyun.core.annotation.NameInMap("SpecName")
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
             * ServeApiKey.
             */
            public Builder serveApiKey(String serveApiKey) {
                this.serveApiKey = serveApiKey;
                return this;
            }

            /**
             * ServeEmbeddingEndpoint.
             */
            public Builder serveEmbeddingEndpoint(String serveEmbeddingEndpoint) {
                this.serveEmbeddingEndpoint = serveEmbeddingEndpoint;
                return this;
            }

            /**
             * ServeEmbeddingModelName.
             */
            public Builder serveEmbeddingModelName(String serveEmbeddingModelName) {
                this.serveEmbeddingModelName = serveEmbeddingModelName;
                return this;
            }

            /**
             * ServeEndpoint.
             */
            public Builder serveEndpoint(String serveEndpoint) {
                this.serveEndpoint = serveEndpoint;
                return this;
            }

            /**
             * ServeModelName.
             */
            public Builder serveModelName(String serveModelName) {
                this.serveModelName = serveModelName;
                return this;
            }

            /**
             * SpecName.
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
