// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNormalDeployConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateNormalDeployConfigRequest</p>
 */
public class UpdateNormalDeployConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("ContainerResourceLimit")
    private ContainerResourceLimit containerResourceLimit;

    @Query
    @NameInMap("ContainerResourceRequest")
    private ContainerResourceRequest containerResourceRequest;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private UpdateNormalDeployConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.containerResourceLimit = builder.containerResourceLimit;
        this.containerResourceRequest = builder.containerResourceRequest;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNormalDeployConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return containerResourceLimit
     */
    public ContainerResourceLimit getContainerResourceLimit() {
        return this.containerResourceLimit;
    }

    /**
     * @return containerResourceRequest
     */
    public ContainerResourceRequest getContainerResourceRequest() {
        return this.containerResourceRequest;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateNormalDeployConfigRequest, Builder> {
        private Long appId; 
        private ContainerResourceLimit containerResourceLimit; 
        private ContainerResourceRequest containerResourceRequest; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNormalDeployConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.containerResourceLimit = request.containerResourceLimit;
            this.containerResourceRequest = request.containerResourceRequest;
            this.id = request.id;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ContainerResourceLimit.
         */
        public Builder containerResourceLimit(ContainerResourceLimit containerResourceLimit) {
            String containerResourceLimitShrink = shrink(containerResourceLimit, "ContainerResourceLimit", "json");
            this.putQueryParameter("ContainerResourceLimit", containerResourceLimitShrink);
            this.containerResourceLimit = containerResourceLimit;
            return this;
        }

        /**
         * ContainerResourceRequest.
         */
        public Builder containerResourceRequest(ContainerResourceRequest containerResourceRequest) {
            String containerResourceRequestShrink = shrink(containerResourceRequest, "ContainerResourceRequest", "json");
            this.putQueryParameter("ContainerResourceRequest", containerResourceRequestShrink);
            this.containerResourceRequest = containerResourceRequest;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateNormalDeployConfigRequest build() {
            return new UpdateNormalDeployConfigRequest(this);
        } 

    } 

    public static class ContainerResourceLimit extends TeaModel {
        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("Memory")
        private String memory;

        private ContainerResourceLimit(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerResourceLimit create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String cpu; 
            private String memory; 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            public ContainerResourceLimit build() {
                return new ContainerResourceLimit(this);
            } 

        } 

    }
    public static class ContainerResourceRequest extends TeaModel {
        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("Memory")
        private String memory;

        private ContainerResourceRequest(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerResourceRequest create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String cpu; 
            private String memory; 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            public ContainerResourceRequest build() {
                return new ContainerResourceRequest(this);
            } 

        } 

    }
}
