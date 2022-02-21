// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayNamespaceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayNamespaceSpecRequest</p>
 */
public class ModifyPrepayNamespaceSpecRequest extends Request {
    @Body
    @NameInMap("ModifyPrepayNamespaceSpecRequest")
    @Validation(required = true)
    private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest;

    private ModifyPrepayNamespaceSpecRequest(Builder builder) {
        super(builder);
        this.modifyPrepayNamespaceSpecRequest = builder.modifyPrepayNamespaceSpecRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayNamespaceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyPrepayNamespaceSpecRequest
     */
    public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest getModifyPrepayNamespaceSpecRequest() {
        return this.modifyPrepayNamespaceSpecRequest;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayNamespaceSpecRequest, Builder> {
        private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayNamespaceSpecRequest response) {
            super(response);
            this.modifyPrepayNamespaceSpecRequest = response.modifyPrepayNamespaceSpecRequest;
        } 

        /**
         * ModifyPrepayNamespaceSpecRequest.
         */
        public Builder modifyPrepayNamespaceSpecRequest(ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest) {
            this.putBodyParameter("ModifyPrepayNamespaceSpecRequest", modifyPrepayNamespaceSpecRequest);
            this.modifyPrepayNamespaceSpecRequest = modifyPrepayNamespaceSpecRequest;
            return this;
        }

        @Override
        public ModifyPrepayNamespaceSpecRequest build() {
            return new ModifyPrepayNamespaceSpecRequest(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        private Integer cpu;

        @NameInMap("MemoryGB")
        @Validation(required = true)
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("ResourceSpec")
        @Validation(required = true)
        private ResourceSpec resourceSpec;

        private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.region = builder.region;
            this.resourceSpec = builder.resourceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public static final class Builder {
            private String instanceId; 
            private String namespace; 
            private String region; 
            private ResourceSpec resourceSpec; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest build() {
                return new ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest(this);
            } 

        } 

    }
}
