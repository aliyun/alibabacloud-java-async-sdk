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
 * {@link HiMarketModelConfig} extends {@link TeaModel}
 *
 * <p>HiMarketModelConfig</p>
 */
public class HiMarketModelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("modelAPIConfig")
    private ModelAPIConfig modelAPIConfig;

    private HiMarketModelConfig(Builder builder) {
        this.modelAPIConfig = builder.modelAPIConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketModelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelAPIConfig
     */
    public ModelAPIConfig getModelAPIConfig() {
        return this.modelAPIConfig;
    }

    public static final class Builder {
        private ModelAPIConfig modelAPIConfig; 

        private Builder() {
        } 

        private Builder(HiMarketModelConfig model) {
            this.modelAPIConfig = model.modelAPIConfig;
        } 

        /**
         * <p>The Model API configuration wrapper.</p>
         */
        public Builder modelAPIConfig(ModelAPIConfig modelAPIConfig) {
            this.modelAPIConfig = modelAPIConfig;
            return this;
        }

        public HiMarketModelConfig build() {
            return new HiMarketModelConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketModelConfig} extends {@link TeaModel}
     *
     * <p>HiMarketModelConfig</p>
     */
    public static class ModelAPIConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiProtocols")
        private java.util.List<String> aiProtocols;

        @com.aliyun.core.annotation.NameInMap("modelCategory")
        private String modelCategory;

        @com.aliyun.core.annotation.NameInMap("routes")
        private java.util.List<HiMarketHttpRoute> routes;

        private ModelAPIConfig(Builder builder) {
            this.aiProtocols = builder.aiProtocols;
            this.modelCategory = builder.modelCategory;
            this.routes = builder.routes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelAPIConfig create() {
            return builder().build();
        }

        /**
         * @return aiProtocols
         */
        public java.util.List<String> getAiProtocols() {
            return this.aiProtocols;
        }

        /**
         * @return modelCategory
         */
        public String getModelCategory() {
            return this.modelCategory;
        }

        /**
         * @return routes
         */
        public java.util.List<HiMarketHttpRoute> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private java.util.List<String> aiProtocols; 
            private String modelCategory; 
            private java.util.List<HiMarketHttpRoute> routes; 

            private Builder() {
            } 

            private Builder(ModelAPIConfig model) {
                this.aiProtocols = model.aiProtocols;
                this.modelCategory = model.modelCategory;
                this.routes = model.routes;
            } 

            /**
             * <p>The list of AI protocols.</p>
             */
            public Builder aiProtocols(java.util.List<String> aiProtocols) {
                this.aiProtocols = aiProtocols;
                return this;
            }

            /**
             * <p>The model categorization.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder modelCategory(String modelCategory) {
                this.modelCategory = modelCategory;
                return this;
            }

            /**
             * <p>The list of routing configurations.</p>
             */
            public Builder routes(java.util.List<HiMarketHttpRoute> routes) {
                this.routes = routes;
                return this;
            }

            public ModelAPIConfig build() {
                return new ModelAPIConfig(this);
            } 

        } 

    }
}
