// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateNamespaceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link CreateNamespaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNamespaceRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
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

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

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
    /**
     * 
     * {@link CreateNamespaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNamespaceRequest</p>
     */
    public static class CreateNamespaceRequestCreateNamespaceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
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

            private Builder() {
            } 

            private Builder(CreateNamespaceRequestCreateNamespaceRequest model) {
                this.ha = model.ha;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.region = model.region;
                this.resourceSpec = model.resourceSpec;
            } 

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>223493C7-FCA9-13D4-B75B-AF8B32F4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ns-1</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
