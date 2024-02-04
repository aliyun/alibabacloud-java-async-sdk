// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @Body
    @NameInMap("CreateNamespaceRequest")
    @Validation(required = true)
    private CreateNamespaceRequestCreateNamespaceRequest createNamespaceRequest;

    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.createNamespaceRequest = builder.createNamespaceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createNamespaceRequest
     */
    public CreateNamespaceRequestCreateNamespaceRequest getCreateNamespaceRequest() {
        return this.createNamespaceRequest;
    }

    public static final class Builder extends Request.Builder<CreateNamespaceRequest, Builder> {
        private CreateNamespaceRequestCreateNamespaceRequest createNamespaceRequest; 

        private Builder() {
            super();
        } 

        private Builder(CreateNamespaceRequest request) {
            super(request);
            this.createNamespaceRequest = request.createNamespaceRequest;
        } 

        /**
         * CreateNamespaceRequest.
         */
        public Builder createNamespaceRequest(CreateNamespaceRequestCreateNamespaceRequest createNamespaceRequest) {
            this.putBodyParameter("CreateNamespaceRequest", createNamespaceRequest);
            this.createNamespaceRequest = createNamespaceRequest;
            return this;
        }

        @Override
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
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
    public static class CreateNamespaceRequestCreateNamespaceRequest extends TeaModel {
        @NameInMap("Ha")
        private Boolean ha;

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
        private ResourceSpec resourceSpec;

        private CreateNamespaceRequestCreateNamespaceRequest(Builder builder) {
            this.ha = builder.ha;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.region = builder.region;
            this.resourceSpec = builder.resourceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateNamespaceRequestCreateNamespaceRequest create() {
            return builder().build();
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
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
            private Boolean ha; 
            private String instanceId; 
            private String namespace; 
            private String region; 
            private ResourceSpec resourceSpec; 

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

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

            public CreateNamespaceRequestCreateNamespaceRequest build() {
                return new CreateNamespaceRequestCreateNamespaceRequest(this);
            } 

        } 

    }
}
