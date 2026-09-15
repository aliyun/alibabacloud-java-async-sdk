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

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TuneArch")
    private String tuneArch;

    private DescribeAvailableModelsResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.items = builder.items;
        this.modelType = builder.modelType;
        this.requestId = builder.requestId;
        this.tuneArch = builder.tuneArch;
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
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tuneArch
     */
    public String getTuneArch() {
        return this.tuneArch;
    }

    public static final class Builder {
        private String engine; 
        private String engineVersion; 
        private java.util.List<Items> items; 
        private String modelType; 
        private String requestId; 
        private String tuneArch; 

        private Builder() {
        } 

        private Builder(DescribeAvailableModelsResponseBody model) {
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.items = model.items;
            this.modelType = model.modelType;
            this.requestId = model.requestId;
            this.tuneArch = model.tuneArch;
        } 

        /**
         * <p>The database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_ai</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The list of models.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The model type corresponding to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
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

        /**
         * <p>The model fine-tuning architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        public Builder tuneArch(String tuneArch) {
            this.tuneArch = tuneArch;
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
             * <p>The minimum number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder gpuMinCount(String gpuMinCount) {
                this.gpuMinCount = gpuMinCount;
                return this;
            }

            /**
             * <p>The GPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
        @com.aliyun.core.annotation.NameInMap("CustomModelName")
        private String customModelName;

        @com.aliyun.core.annotation.NameInMap("DisplayModelName")
        private String displayModelName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

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

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("SupportedGpuModels")
        private java.util.List<String> supportedGpuModels;

        @com.aliyun.core.annotation.NameInMap("TuneArch")
        private String tuneArch;

        private Items(Builder builder) {
            this.customModelName = builder.customModelName;
            this.displayModelName = builder.displayModelName;
            this.gmtModified = builder.gmtModified;
            this.gpuRequired = builder.gpuRequired;
            this.minimumCpu = builder.minimumCpu;
            this.minimumMemory = builder.minimumMemory;
            this.modelName = builder.modelName;
            this.modelSeries = builder.modelSeries;
            this.modelType = builder.modelType;
            this.ossPath = builder.ossPath;
            this.supportedGpuModels = builder.supportedGpuModels;
            this.tuneArch = builder.tuneArch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return customModelName
         */
        public String getCustomModelName() {
            return this.customModelName;
        }

        /**
         * @return displayModelName
         */
        public String getDisplayModelName() {
            return this.displayModelName;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return supportedGpuModels
         */
        public java.util.List<String> getSupportedGpuModels() {
            return this.supportedGpuModels;
        }

        /**
         * @return tuneArch
         */
        public String getTuneArch() {
            return this.tuneArch;
        }

        public static final class Builder {
            private String customModelName; 
            private String displayModelName; 
            private String gmtModified; 
            private java.util.List<GpuRequired> gpuRequired; 
            private Long minimumCpu; 
            private Long minimumMemory; 
            private String modelName; 
            private String modelSeries; 
            private String modelType; 
            private String ossPath; 
            private java.util.List<String> supportedGpuModels; 
            private String tuneArch; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.customModelName = model.customModelName;
                this.displayModelName = model.displayModelName;
                this.gmtModified = model.gmtModified;
                this.gpuRequired = model.gpuRequired;
                this.minimumCpu = model.minimumCpu;
                this.minimumMemory = model.minimumMemory;
                this.modelName = model.modelName;
                this.modelSeries = model.modelSeries;
                this.modelType = model.modelType;
                this.ossPath = model.ossPath;
                this.supportedGpuModels = model.supportedGpuModels;
                this.tuneArch = model.tuneArch;
            } 

            /**
             * <p>The custom model registration key.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3-32B</p>
             */
            public Builder customModelName(String customModelName) {
                this.customModelName = customModelName;
                return this;
            }

            /**
             * <p>The display name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>My Qwen3 32B</p>
             */
            public Builder displayModelName(String displayModelName) {
                this.displayModelName = displayModelName;
                return this;
            }

            /**
             * <p>The last modified time of the registration.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07 20:57:20</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The supported GPU types.</p>
             */
            public Builder gpuRequired(java.util.List<GpuRequired> gpuRequired) {
                this.gpuRequired = gpuRequired;
                return this;
            }

            /**
             * <p>The minimum number of CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minimumCpu(Long minimumCpu) {
                this.minimumCpu = minimumCpu;
                return this;
            }

            /**
             * <p>The minimum memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder minimumMemory(Long minimumMemory) {
                this.minimumMemory = minimumMemory;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3-32B-GPTQ-Int4</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model series.</p>
             * 
             * <strong>example:</strong>
             * <p>BERT</p>
             */
            public Builder modelSeries(String modelSeries) {
                this.modelSeries = modelSeries;
                return this;
            }

            /**
             * <p>The model type.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>The OSS path of the custom model.</p>
             * 
             * <strong>example:</strong>
             * <p>/my-model-bucket/models</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The supported GPU models.</p>
             */
            public Builder supportedGpuModels(java.util.List<String> supportedGpuModels) {
                this.supportedGpuModels = supportedGpuModels;
                return this;
            }

            /**
             * <p>The model fine-tuning architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>swift</p>
             */
            public Builder tuneArch(String tuneArch) {
                this.tuneArch = tuneArch;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
