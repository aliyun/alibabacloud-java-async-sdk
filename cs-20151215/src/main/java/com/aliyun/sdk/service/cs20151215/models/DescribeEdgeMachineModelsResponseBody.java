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
         * Id of the request
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
        @NameInMap("cpu")
        private Integer cpu;

        @NameInMap("cpu_arch")
        private String cpuArch;

        @NameInMap("created")
        private String created;

        @NameInMap("description")
        private String description;

        @NameInMap("manage_runtime")
        private Integer manageRuntime;

        @NameInMap("memory")
        private Integer memory;

        @NameInMap("model")
        private String model;

        @NameInMap("model_id")
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
             * cpu
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * cpu arch
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * created
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * manage runtime
             */
            public Builder manageRuntime(Integer manageRuntime) {
                this.manageRuntime = manageRuntime;
                return this;
            }

            /**
             * memory
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * model
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * model id
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
