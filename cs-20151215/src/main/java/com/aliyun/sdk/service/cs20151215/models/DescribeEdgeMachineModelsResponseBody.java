// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineModelsResponseBody</p>
 */
public class DescribeEdgeMachineModelsResponseBody extends TeaModel {
    @NameInMap("models")
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
         * Cloud native all-in-one model list
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
        @NameInMap("manage_runtime")
        private Integer manageRuntime;

        @NameInMap("cpu_arch")
        private String cpuArch;

        @NameInMap("cpu")
        private Integer cpu;

        @NameInMap("memory")
        private Integer memory;

        @NameInMap("model_id")
        private String modelId;

        @NameInMap("created")
        private String created;

        @NameInMap("description")
        private String description;

        @NameInMap("model")
        private String model;

        private Models(Builder builder) {
            this.manageRuntime = builder.manageRuntime;
            this.cpuArch = builder.cpuArch;
            this.cpu = builder.cpu;
            this.memory = builder.memory;
            this.modelId = builder.modelId;
            this.created = builder.created;
            this.description = builder.description;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return manageRuntime
         */
        public Integer getManageRuntime() {
            return this.manageRuntime;
        }

        /**
         * @return cpuArch
         */
        public String getCpuArch() {
            return this.cpuArch;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
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
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private Integer manageRuntime; 
            private String cpuArch; 
            private Integer cpu; 
            private Integer memory; 
            private String modelId; 
            private String created; 
            private String description; 
            private String model; 

            /**
             * Manage Docker Runtime
             */
            public Builder manageRuntime(Integer manageRuntime) {
                this.manageRuntime = manageRuntime;
                return this;
            }

            /**
             * CPU architecture
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * CPU cores
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Memory. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ID of the cloud-native all-in-one machine.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * Created
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Cloud Native all-in-one model
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
