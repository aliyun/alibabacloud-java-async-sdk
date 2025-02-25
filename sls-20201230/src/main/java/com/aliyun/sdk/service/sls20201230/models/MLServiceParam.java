// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MLServiceParam} extends {@link TeaModel}
 *
 * <p>MLServiceParam</p>
 */
public class MLServiceParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private MLServiceParam(Builder builder) {
        this.description = builder.description;
        this.model = builder.model;
        this.name = builder.name;
        this.resource = builder.resource;
        this.serviceType = builder.serviceType;
        this.status = builder.status;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLServiceParam create() {
        return builder().build();
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
    public Model getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String description; 
        private Model model; 
        private String name; 
        private Resource resource; 
        private String serviceType; 
        private String status; 
        private Long updateTimestamp; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public MLServiceParam build() {
            return new MLServiceParam(this);
        } 

    } 

    /**
     * 
     * {@link MLServiceParam} extends {@link TeaModel}
     *
     * <p>MLServiceParam</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelResourceId")
        private String modelResourceId;

        @com.aliyun.core.annotation.NameInMap("modelResourceType")
        private String modelResourceType;

        private Model(Builder builder) {
            this.modelResourceId = builder.modelResourceId;
            this.modelResourceType = builder.modelResourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return modelResourceId
         */
        public String getModelResourceId() {
            return this.modelResourceId;
        }

        /**
         * @return modelResourceType
         */
        public String getModelResourceType() {
            return this.modelResourceType;
        }

        public static final class Builder {
            private String modelResourceId; 
            private String modelResourceType; 

            /**
             * modelResourceId.
             */
            public Builder modelResourceId(String modelResourceId) {
                this.modelResourceId = modelResourceId;
                return this;
            }

            /**
             * modelResourceType.
             */
            public Builder modelResourceType(String modelResourceType) {
                this.modelResourceType = modelResourceType;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link MLServiceParam} extends {@link TeaModel}
     *
     * <p>MLServiceParam</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuLimit")
        private Integer cpuLimit;

        @com.aliyun.core.annotation.NameInMap("gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("memoryLimit")
        private Integer memoryLimit;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        private Resource(Builder builder) {
            this.cpuLimit = builder.cpuLimit;
            this.gpu = builder.gpu;
            this.memoryLimit = builder.memoryLimit;
            this.replica = builder.replica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cpuLimit
         */
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return memoryLimit
         */
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private Integer cpuLimit; 
            private Integer gpu; 
            private Integer memoryLimit; 
            private Integer replica; 

            /**
             * cpuLimit.
             */
            public Builder cpuLimit(Integer cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * memoryLimit.
             */
            public Builder memoryLimit(Integer memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
