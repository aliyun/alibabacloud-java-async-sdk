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
 * {@link ModelConfig} extends {@link TeaModel}
 *
 * <p>ModelConfig</p>
 */
public class ModelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("framework")
    private String framework;

    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("multiModelConfig")
    private java.util.List<ModelConfig> multiModelConfig;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("reversion")
    private String reversion;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModelConfig(Builder builder) {
        this.bucket = builder.bucket;
        this.framework = builder.framework;
        this.model = builder.model;
        this.multiModelConfig = builder.multiModelConfig;
        this.path = builder.path;
        this.prefix = builder.prefix;
        this.region = builder.region;
        this.reversion = builder.reversion;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return framework
     */
    public String getFramework() {
        return this.framework;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return multiModelConfig
     */
    public java.util.List<ModelConfig> getMultiModelConfig() {
        return this.multiModelConfig;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return reversion
     */
    public String getReversion() {
        return this.reversion;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String bucket; 
        private String framework; 
        private String model; 
        private java.util.List<ModelConfig> multiModelConfig; 
        private String path; 
        private String prefix; 
        private String region; 
        private String reversion; 
        private String token; 
        private String type; 

        private Builder() {
        } 

        private Builder(ModelConfig model) {
            this.bucket = model.bucket;
            this.framework = model.framework;
            this.model = model.model;
            this.multiModelConfig = model.multiModelConfig;
            this.path = model.path;
            this.prefix = model.prefix;
            this.region = model.region;
            this.reversion = model.reversion;
            this.token = model.token;
            this.type = model.type;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * framework.
         */
        public Builder framework(String framework) {
            this.framework = framework;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * multiModelConfig.
         */
        public Builder multiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * reversion.
         */
        public Builder reversion(String reversion) {
            this.reversion = reversion;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelscope</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ModelConfig build() {
            return new ModelConfig(this);
        } 

    } 

}
