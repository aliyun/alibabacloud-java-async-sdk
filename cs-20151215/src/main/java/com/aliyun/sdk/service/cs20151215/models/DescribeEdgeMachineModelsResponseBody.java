// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineModelsResponseBody</p>
 */
public class DescribeEdgeMachineModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List < Models> models;

    private DescribeEdgeMachineModelsResponseBody(Builder builder) {
        this.models = builder.models;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineModelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return models
     */
    public java.util.List < Models> getModels() {
        return this.models;
    }

    public static final class Builder {
        private java.util.List < Models> models; 

        /**
         * The cloud-native box models.
         */
        public Builder models(java.util.List < Models> models) {
            this.models = models;
            return this;
        }

        public DescribeEdgeMachineModelsResponseBody build() {
            return new DescribeEdgeMachineModelsResponseBody(this);
        } 

    } 

    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("cpu_arch")
        private String cpuArch;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("manage_runtime")
        private Integer manageRuntime;

        @com.aliyun.core.annotation.NameInMap("memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("model_id")
        private String modelId;

        private Models(Builder builder) {
            this.cpu = builder.cpu;
            this.cpuArch = builder.cpuArch;
            this.created = builder.created;
            this.description = builder.description;
            this.manageRuntime = builder.manageRuntime;
            this.memory = builder.memory;
            this.model = builder.model;
            this.modelId = builder.modelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuArch
         */
        public String getCpuArch() {
            return this.cpuArch;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return manageRuntime
         */
        public Integer getManageRuntime() {
            return this.manageRuntime;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        public static final class Builder {
            private Integer cpu; 
            private String cpuArch; 
            private String created; 
            private String description; 
            private Integer manageRuntime; 
            private Integer memory; 
            private String model; 
            private String modelId; 

            /**
             * The number of vCores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The CPU architecture.
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * The time when the cloud-native box was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The description of the cloud-native box.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the cloud-native box model manages the Docker runtime.
             */
            public Builder manageRuntime(Integer manageRuntime) {
                this.manageRuntime = manageRuntime;
                return this;
            }

            /**
             * The memory. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The model of the cloud-native box.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * The ID of the cloud-native box.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
