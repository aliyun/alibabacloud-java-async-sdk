// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAvailableModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableModelsResponseBody</p>
 */
public class DescribeAvailableModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableModelsResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String engine; 
        private String engineVersion; 
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAvailableModelsResponseBody model) {
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableModelsResponseBody build() {
            return new DescribeAvailableModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableModelsResponseBody</p>
     */
    public static class GpuRequired extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GpuMinCount")
        private String gpuMinCount;

        @com.aliyun.core.annotation.NameInMap("GpuModel")
        private String gpuModel;

        private GpuRequired(Builder builder) {
            this.gpuMinCount = builder.gpuMinCount;
            this.gpuModel = builder.gpuModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuRequired create() {
            return builder().build();
        }

        /**
         * @return gpuMinCount
         */
        public String getGpuMinCount() {
            return this.gpuMinCount;
        }

        /**
         * @return gpuModel
         */
        public String getGpuModel() {
            return this.gpuModel;
        }

        public static final class Builder {
            private String gpuMinCount; 
            private String gpuModel; 

            private Builder() {
            } 

            private Builder(GpuRequired model) {
                this.gpuMinCount = model.gpuMinCount;
                this.gpuModel = model.gpuModel;
            } 

            /**
             * GpuMinCount.
             */
            public Builder gpuMinCount(String gpuMinCount) {
                this.gpuMinCount = gpuMinCount;
                return this;
            }

            /**
             * GpuModel.
             */
            public Builder gpuModel(String gpuModel) {
                this.gpuModel = gpuModel;
                return this;
            }

            public GpuRequired build() {
                return new GpuRequired(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableModelsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GpuRequired")
        private java.util.List<GpuRequired> gpuRequired;

        @com.aliyun.core.annotation.NameInMap("MinimumCpu")
        private Long minimumCpu;

        @com.aliyun.core.annotation.NameInMap("MinimumMemory")
        private Long minimumMemory;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelSeries")
        private String modelSeries;

        @com.aliyun.core.annotation.NameInMap("SupportedGpuModels")
        private java.util.List<String> supportedGpuModels;

        private Items(Builder builder) {
            this.gpuRequired = builder.gpuRequired;
            this.minimumCpu = builder.minimumCpu;
            this.minimumMemory = builder.minimumMemory;
            this.modelName = builder.modelName;
            this.modelSeries = builder.modelSeries;
            this.supportedGpuModels = builder.supportedGpuModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return gpuRequired
         */
        public java.util.List<GpuRequired> getGpuRequired() {
            return this.gpuRequired;
        }

        /**
         * @return minimumCpu
         */
        public Long getMinimumCpu() {
            return this.minimumCpu;
        }

        /**
         * @return minimumMemory
         */
        public Long getMinimumMemory() {
            return this.minimumMemory;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelSeries
         */
        public String getModelSeries() {
            return this.modelSeries;
        }

        /**
         * @return supportedGpuModels
         */
        public java.util.List<String> getSupportedGpuModels() {
            return this.supportedGpuModels;
        }

        public static final class Builder {
            private java.util.List<GpuRequired> gpuRequired; 
            private Long minimumCpu; 
            private Long minimumMemory; 
            private String modelName; 
            private String modelSeries; 
            private java.util.List<String> supportedGpuModels; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.gpuRequired = model.gpuRequired;
                this.minimumCpu = model.minimumCpu;
                this.minimumMemory = model.minimumMemory;
                this.modelName = model.modelName;
                this.modelSeries = model.modelSeries;
                this.supportedGpuModels = model.supportedGpuModels;
            } 

            /**
             * GpuRequired.
             */
            public Builder gpuRequired(java.util.List<GpuRequired> gpuRequired) {
                this.gpuRequired = gpuRequired;
                return this;
            }

            /**
             * MinimumCpu.
             */
            public Builder minimumCpu(Long minimumCpu) {
                this.minimumCpu = minimumCpu;
                return this;
            }

            /**
             * MinimumMemory.
             */
            public Builder minimumMemory(Long minimumMemory) {
                this.minimumMemory = minimumMemory;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelSeries.
             */
            public Builder modelSeries(String modelSeries) {
                this.modelSeries = modelSeries;
                return this;
            }

            /**
             * SupportedGpuModels.
             */
            public Builder supportedGpuModels(java.util.List<String> supportedGpuModels) {
                this.supportedGpuModels = supportedGpuModels;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
